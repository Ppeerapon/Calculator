package Ppeerapon.Calculator;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        GUI gui = new GUI();
        gui.setVisible(true);
    }

    public void NUM1(){
        System.out.println("ENTER YOU NUMBER");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int num1 = scanner.nextInt();
            System.out.println("ENTER +,-,*,/");
            NUM2(num1);
        } else {
            System.out.println("ENTER ONLY NUMBER!");
            NUM1();
        }

    }

    public void NUM2(int num1){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equalsIgnoreCase("+")){
            NUM3(num1, string);
        } else if (string.equalsIgnoreCase("-")){
            NUM3(num1, string);
        } else if (string.equalsIgnoreCase("*")){
            NUM3(num1, string);
        } else if (string.equalsIgnoreCase("/")){
            NUM3(num1, string);
        } else {
            System.out.println("ENTER ONLY +,-,*,/");
            NUM2(num1);
        }
    }

    public void NUM3(int num1,String num2){
        System.out.println("ENTER NUMBER");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            int num3 = scanner.nextInt();
            if (num2.equalsIgnoreCase("+")) {
                int ans = num1 + num3;
                System.out.println(num1 + " " + num2 + " " + num3 + " = " + ans);
            } else if (num2.equalsIgnoreCase("-")) {
                int ans = num1 - num3;
                System.out.println(num1 + " " + num2 + " " + num3 + " = " + ans);
            } else if (num2.equalsIgnoreCase("*")) {
                int ans = num1 * num3;
                System.out.println(num1 + " " + num2 + " " + num3 + " = " + ans);
            } else if (num2.equalsIgnoreCase("/")) {
                int ans = num1 / num3;
                System.out.println(num1 + " " + num2 + " " + num3 + " = " + ans);
            } else {
                System.out.println("Something Wrong");
            }
        } else {
            System.out.println("ONLY NUMBER");
            NUM3(num1,num2);
        }

    }

}
