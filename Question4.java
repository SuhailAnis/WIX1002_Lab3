/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg26065261_lap3;

import java.util.Random;

/**
 *
 * @author User
 */
public class Question4 {
    public static void main(String[] args) {
        Random random = new Random();

        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int player1 = roll1 + roll2;

        System.out.println("Player 1 rolls: " + roll1 + " and " + roll2);
        System.out.println("Player 1 score: " + player1);

        roll1 = random.nextInt(6) + 1;
        roll2 = random.nextInt(6) + 1;
        int player2 = roll1 + roll2;

        System.out.println("Player 2 rolls: " + roll1 + " and " + roll2);
        System.out.println("Player 2 score: " + player2);

        if (player1 > player2) {
            System.out.println("Player 1 wins!");
        } else if (player2 > player1) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It is a draw!");
        }

}
}