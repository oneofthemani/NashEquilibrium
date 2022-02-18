public class Possibilities {
    private int dur1;
    private int dur2;
    private int dur3;
    private int dur4;

    /** @Author : oneofthemani
     * I use this constructor for creating the possible jail times in the prison, connecting this with the
     * Prisoner class's object's thinking process
     * */

    public Possibilities(int dur1, int dur2, int dur3, int dur4) {
        this.dur1 = dur1;
        this.dur2 = dur2;
        this.dur3 = dur3;
        this.dur4 = dur4;
    }

    /**
     * Creating cases for each and every scenario:
     * 1. Scenario : Everybody confesses
     * 2. Scenario : First prisoner confesses but second denies
     * 3. Scenario : Second prisoner confesses but first denies
     * 4. Scenario : Everybody denies
     * */
    public int[][] createPossibilities(Possibilities possibilities){
        return new int[][]{{dur3, dur3}, {dur1, dur4}, {dur4, dur1}, {dur2, dur2}};
    }
}
