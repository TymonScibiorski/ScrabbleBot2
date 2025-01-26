public class pointCalculator {
    public int pointsForWord(String word, char[] blanks, int wordStartX, int wordStartY, int wordEndX, int wordEndY) {
        int pointsForWord = 0;

        pointsForWord *= wordBoostMultiplicator(wordStartX, wordStartY, wordEndX, wordEndY);

        /*
        if (usedPlayaLetter.length() > 7)
            pointsForWord += 50
         */

        return pointsForWord;
    }

    public int pointsForLetter(char letter, int letterX, int letterY) {

    }

    public int wordBoostMultiplicator(int wordStartX, int wordStartY, int wordEndX, int wordEndY){

    }
}
