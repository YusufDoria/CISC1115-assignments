import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner getCards = new Scanner(System.in); //Gets the Total cards and Drawn cards
        System.out.println("How many cards will you be playing with?");
        int totalCards = getCards.nextInt(); //Gets Total cards
        
        while (totalCards > 0) { //Runs while there are cards left
            System.out.printf("Player #1, there are %d cards left.\nHow many cards will you take? (1- 3)\n", totalCards);
            int player1Draw = getCards.nextInt();
            totalCards = totalCards - player1Draw;
            if (totalCards <= 0) { //Determines if player 1 won by checking cardsleft after draw
                System.out.println("Player 1 Won!!!");
                break;
            }

            System.out.printf("Player #2, there are %d cards left.\nHow many cards will you take? (1- 3)\n", totalCards);
            int player2Draw = getCards.nextInt(); 
            totalCards = totalCards - player2Draw;
            if (totalCards <= 0) { //Determines if player 1 won by checking cardsleft after draw
                System.out.println("Player 2 won!!!");
                break;
            }
        }
        getCards.close();
    }
}
