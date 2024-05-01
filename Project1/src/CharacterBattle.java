import java.util.*;
public class CharacterBattle {
    public static void main(String[] args) {
        //declaring Special variables
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        Random rand = new Random();
        //declaring basic variables
        System.out.print("Input an odd number of rounds to play: ");
        int rounds = input.nextInt();
        //player 1 variables
        System.out.println("Player 1 \n=======================");
        System.out.print("Input the name of your creature: ");
        String p1Name = input.next();

        System.out.println("Input the basic stats for your creature below.");

        System.out.print("HP: ");
        int p1defHP = input.nextInt();

        System.out.print("Attack name: ");
        String p1Move = input.next();

        System.out.print("Attack damage: ");
        int p1MoveDamage = input.nextInt();

        System.out.print("Attack speed: ");
        int p1MoveSpeed = input.nextInt();
        //player 2 variables
        System.out.println("Player 2 \n========================");
        System.out.print("Input the name of your creature: ");
        String p2Name = input.next();

        System.out.println("Input the basic stats for your creature below.");

        System.out.print("HP: ");
        int p2defHP = input.nextInt();

        System.out.print("Attack name: ");
        String p2Move = input.next();

        System.out.print("Attack damage: ");
        int p2MoveDamage = input.nextInt();

        System.out.print("Attack speed: ");
        int p2MoveSpeed = input.nextInt();
        //fight scene
        int p1won = 0;
        int p2won = 0;
        for (int i = 1; i <= rounds; i++) {
            System.out.println("round #" + i);
            int p1HP = p1defHP;
            int p2HP = p2defHP;
            while ((p1HP > 0)||(p2HP > 0)) {
                System.out.println(p1Name +" HP: " + p1HP + "\n" + p2Name + " HP: " + p2HP);

                if (rand.nextInt(p1MoveSpeed) > rand.nextInt(p2MoveSpeed)) {
                    System.out.println(p1Name+ " strikes first using " + p1Move + "!");
                    p2HP -= rand.nextInt(p1MoveDamage);
                }

                else{
                    System.out.println(p2Name + " strikes first using " + p2Move + "!");
                    p1HP -= rand.nextInt(p2MoveDamage);
                }
                if (p1HP <= 0) {
                    break;
                }
                else if (p2HP <= 0) {
                    break;
                }
                System.out.println("Press Enter for next move.");
                input.next();
            }
            if (p1HP <= 0) {
                p2won++;
            }
            else if (p2HP <= 0) {
                p1won++;
            }
            System.out.println("Press Enter to continue.");
            input.next();
        }
        if (p1won > p2won) {
            System.out.println("Player 1 wins with a total of " + p1won + " rounds won!");
        }
        else if (p2won > p1won) {
            System.out.println("Player 2 wins with a total of " + p2won + " rounds won!");
        }
        else {
            System.out.println("Error");
        }
    }
}