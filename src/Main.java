public class Main {
    /*
    Main method used to run the Candidate and AutocompleteProvider interfaces. A passage is inputted and trained
    through the train method in autocompleteProvider. The getWords method is run with a string and returns
    The list of candidate words with their confidence.
     */
    public static void main(String[] args) {
	    String passage = "The third thing that I need to tell you is that this thing does not think thoroughly.";

	    AutocompleteProvider auto = new AutocompleteProvider();

        auto.train(passage);
        System.out.println(auto.getWords("th"));

    }
}
