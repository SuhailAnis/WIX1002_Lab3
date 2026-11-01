/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg26065261_lap3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter x and y: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        if (x * x + y * y <= radius * radius) {
            System.out.println("The point is inside the circle");
        } else {
            System.out.println("The point is outside the circle");

}
    }
}
