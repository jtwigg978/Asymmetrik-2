

public class Candidate implements Comparable<Candidate> {
    String word;
    int confidence;

    Candidate(String word, int confidence) {
        this.word = word;
        this.confidence =confidence;
    }

    String getWord() {
        return this.word;
    }

    int getConfidence() {
        return this.confidence;
    }

    void addConfidence() {
        this.confidence++;
    }

    public int compareTo(Candidate toCompare) {
        int compared= toCompare.getConfidence();

        return compared - this.confidence;
    }

    public String toString() {
        return this.word + " " + "(" + this.confidence + ")";
    }

    // Equals and hashcode method used for testing purposes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candidate candidate = (Candidate) o;

        if (confidence != candidate.confidence) return false;
        return word != null ? word.equals(candidate.word) : candidate.word == null;
    }

    @Override
    public int hashCode() {
        int result = word != null ? word.hashCode() : 0;
        result = 31 * result + confidence;
        return result;
    }
}
