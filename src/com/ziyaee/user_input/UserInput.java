package com.ziyaee.user_input;

import java.util.Scanner;
import java.util.InputMismatchException;

public class UserInput {
    // This method is used for taking the input in kilometer.
    public double userInputKilometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Kilometre : ");
        double num1 = sc.nextDouble();
        return num1;
    }

    // This method is used for taking the input in Metre.
    public double userInputMetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Metre : ");
        double num = sc.nextDouble();
        return num;
    }
    // This method is used for taking the input in Centimetre
    public double userInputCentimetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Centimetre : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input in Millimetre.
    public double userInputMillimetre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Millimetre : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input in Micrometre.
    public double userInputMicrometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Micrometre : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input in Nanometre.
    public double userInputNanometre(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Nanometre : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input in Mile.
    public double userInputMile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Mile : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input in Yard.
    public double userInputYard(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Yard : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input in Foot.
    public double userInputFoot(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Foot : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input in Inch.
    public double userInputInch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Inch : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input in Nautical Mile.
    public double userInputNauticalMile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter your Nautical Mile : ");
        double num = sc.nextDouble();
        return num;
    }

    // This method is used for taking the input for choosing purpose.
    public int choiceUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\t\tchoose your option : ");
        try{
            return sc.nextInt();
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println();
        return -1;
    }
}
