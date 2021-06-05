package cameron.osipenko.s991627874;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Cameron Osipenko
 * @date June 2, 2021
 */

import java.util.Random;

public class CardTrick {

    public static void main(String[] args) {

        // creates a new random for randomized hand generation
        Random r = new Random();
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            // c.setValue(insert call to random number generator here)
            // There is a 12 + 1 as it goes 0-12 and adding one will make range 1-13
            c.setValue(r.nextInt(12) + 1);

            // c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Same as above, goes 0-3 for referencing the string array
            c.setSuit(Card.SUITS[r.nextInt(3)]);

            magicHand[i] = c;
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
        }

        // insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        // Then report the result here
    }

}
