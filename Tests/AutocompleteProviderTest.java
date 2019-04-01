import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AutocompleteProviderTest {
    List<Candidate> empty = new LinkedList<Candidate>();
    List<Candidate> special = new LinkedList<Candidate>(Arrays.asList(new Candidate("don't", 2),
            new Candidate("do-nt", 1)));

    // Testing with empty string
    @Test
    public void emptyTrain() {
        AutocompleteProvider auto = new AutocompleteProvider();

        auto.train("");
        assertEquals(auto.getWords("The"), empty);
    }

    @Test
    public void emptyFragment() {
        AutocompleteProvider auto = new AutocompleteProvider();

        auto.train("What happens if I don't enter a fragment at all?");
        assertEquals(auto.getWords(""), empty);
    }

    @Test
    public void specialCharacters() {
        AutocompleteProvider auto = new AutocompleteProvider();

        auto.train("I am testing don't, do-nt, and don't again.");
        assertEquals(auto.getWords("do"), special);
    }

}