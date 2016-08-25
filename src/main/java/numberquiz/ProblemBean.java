package numberquiz;

import java.io.Serializable;
import java.util.ArrayList;

public class ProblemBean implements Serializable {
    private ArrayList<Integer> sequence;
    private int solution;

    public ProblemBean() {
    }

    public ProblemBean(int[] values, int solution) {
        sequence = new ArrayList<Integer>();
        for (int value : values) {
            sequence.add(value);
        }
        this.solution = solution;
    }

    public ArrayList<Integer> getSequence() {
        return sequence;
    }

    public void setSequence(ArrayList<Integer> sequence) {
        this.sequence = sequence;
    }

    public int getSolution() {
        return solution;
    }

    public void setSolution(int solution) {
        this.solution = solution;
    }
}
