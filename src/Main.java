public class Main {
    public static void main(String[] args) {

        String[][] input = new String
                [[""], [""], [""], [""], [""], [""], [""], [""], [""], [""], [""], [""], [""], [""], [""]];

    }
}

/*
SCRABBLE BOT 2

Scrabble bot 2 will take as INPUT:
 - A 2D array, which will be 15 by 15 and will represent the board.
 - Player's Letters

Scrabble bot 2 will OUTPUT:
 - The inputted 2D array appended with a word that would yield the most points and 5 runner-ups.
 - The amount of points gained by playing that word.

GOALS:
The code:
- Returns the word which would yield the most points and the amount of points.
- Takes into consideration letter and word boosts.
- Suggests all and only legal moves.
- Does not return false positives and does not reject false negatives when searching wordLists.
- Runtime per move is under 60 seconds.
 */

/*
The code could use a combination of Butts and patternMatcher.
DoLettersMatch and a dictionary Letter:Points_for_it could also prove useful
 */

/*
I wonder if the code could theoretically run 15*15 pattern matchers for every word in dictionaries.
The amount of words is not that big. 4 * 10^6, give or take.
PatternMatcher for the longest words, 15 letters long, would generate only 15+15 patternMatchers. For the shortest, 2 letters long, 14*14, provided my calculations are correct.

In that way, for a given word the length of n, the board would be divided into horizontal and vertical fragments the length of n.
Pattern matcher would be run on every one of those fragments.
If the word passed the patternMatcher on the fragment, the surroundings of the fragment would be checked.
    If the word can be placed without contacting more than one word, it's a pass.
    If the word contacted more than one word in that position, a test would have to be run to check if it is still legal.
        A word can contact more than one tile at a time, provided all words created in that way exist. If all are, it's a pass.
 */

//TODO: Create the Board entity