import java.util.Arrays;
import java.util.stream.Stream;

public class wordFinder {
    public String mostProfitableWord(String[][] board) {

    }

    public int[] fragmentBoardIntoHorizontalAndVerticalStripsOfLenN(int n) {

    }

    public int[] fragmentBoardIntoHorizontalAStripsOfLenN(int n) {

    }

    public int[][] fragmentBoardIntoVerticalStripsOfLenN(int n) {
        int[][] out = new int[15][];
        for (int i = 0; i < 15; i++) {
            out[i] = fragmentSingleStrip(n);
        }
    }

    public int[] fragmentSingleStrip(int n){
        int[] out = new int[0];

        for (int i = 0; i < 15-n; i++) {
            out += new int[]{i+n};
        }
        return out;
    }



    /*
    Provided that  checking if a word is violable and calculating points for has the complexity of n,
    checking the whole square board with a side length of n will have a complexity of n! ^ 2
    which for 15 would be 1,7 * 10^24... which is not feasible if the code has 60 seconds for a single board calculation...
     */
}
