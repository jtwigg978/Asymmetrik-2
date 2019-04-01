import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidateTest {

    @Test
    public void getWord() {
        Candidate cand = new Candidate("Testing", 1);
        assertEquals(cand.getWord(), "Testing");
    }

    @Test
    public void getConfidence() {
        Candidate cand = new Candidate("Testing", 1);
        assertEquals(cand.getConfidence(), 1);
    }

    @Test
    public void addConfidence() {
        Candidate cand = new Candidate("Testing", 1);
        cand.addConfidence();
        assertEquals(cand.getConfidence(), 2);
    }

    @Test
    public void test() {
        Candidate cand = new Candidate("Testing", 1);
        cand.addConfidence();
        assertEquals(cand.getConfidence(), 2);
    }
}