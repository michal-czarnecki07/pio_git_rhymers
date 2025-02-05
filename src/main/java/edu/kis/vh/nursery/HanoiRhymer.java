package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int rejectedCount = 0;

    public int reportRejected() {
        return rejectedCount;
    }

    public void countIn(int in) {
        if (!isEmpty() && in > peekaboo())
            rejectedCount++;
        else
            super.countIn(in);
    }
}
