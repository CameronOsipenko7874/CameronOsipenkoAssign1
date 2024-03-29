package cameron.osipenko.s991627874;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * checks those cards against pre-set lucky card.
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Cameron Osipenko
 * @date June 2, 2021
 */

import java.util.Random;
import java.util.Scanner;

public class CardTrick {

    public static void main(String[] args) {

        // creates a new random for randomized hand generation
        Random r = new Random();
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);

        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuit("Spades");

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            // c.setValue(insert call to random number generator here)
            // There is a 12 + 1 as it goes 0-12 and adding one will make range 1-13
            c.setValue(r.nextInt(12) + 1);

            // c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Same as above, goes 0-3 for referencing the string array
            c.setSuit(Card.SUITS[r.nextInt(3)]);

            magicHand[i] = c;
        }

        System.out.println("Your lucky card: 4 of Spades!");

        for (int i = 0; i < magicHand.length; i++) {
            if (luckyCard.getSuit().equals(magicHand[i].getSuit()) && luckyCard.getValue() == magicHand[i].getValue()) {
                System.out.println("You win!");
            } else if (i == magicHand.length - 1) {
                System.out.println("You lose!");
            }
        }

        // System.out.println("Pick a card! (\"any card\")");
        // System.out.println("Pick the value (1-13):");
        // int value = input.nextInt();

        // System.out.println("Pick the suit (\"Hearts\"," + " \"Diamonds\", \"Spades\",
        // \"Clubs\"): ");
        // String suit = input.next();

        // for (int i = 0; i < magicHand.length; i++) {
        // if (value == magicHand[i].getValue()) {
        // if (suit.equals(magicHand[i].getSuit())) {
        // System.out.println("Your card is in the hand!");
        // }
        // } else {
        // System.out.println("The card is not present.");
        // }
        // }

        input.close();

    }

}
