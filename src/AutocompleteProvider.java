import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class AutocompleteProvider {
    List<Candidate> candidates = new LinkedList<Candidate>();

    void train(String passage) {
        boolean checked;

        String[] split = passage.replaceAll("[^a-zA-Z0-9'\\- ]", "").toLowerCase().split("\\s+");

        candidates.add(new Candidate(split[0], 1)); // Create first candidate with first word of passage

        for (int i = 1; i < split.length; i++) { // Iterate through the array of words and add to confidence
            checked = false;
            for (Candidate temp : candidates) {
                if (temp.getWord().equals(split[i])) {
                    temp.addConfidence();
                    checked = true;
                    break;
                }
            }
            if (!checked) { // If this word is not already a candidate, create a new one
                candidates.add(new Candidate(split[i], 1));
            }
        }
    }

    List<Candidate> getWords(String fragment) {
        List<Candidate> matches = new LinkedList<Candidate>();

        if (fragment.equals("")) // No suggestions should pop up without any input
            return matches;

        for (Candidate temp : candidates) {
            if (temp.getWord().startsWith(fragment.toLowerCase()))
                matches.add(temp);
        }

        Collections.sort(matches);     // Sort the returning matches in descending confidence
        return matches;
    }

}