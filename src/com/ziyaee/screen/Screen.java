package com.ziyaee.screen;

import java.util.Scanner;
public class Screen {

    Scanner scan = new Scanner(System.in);
    // all the content on the screen will be clear.
    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    // this will hold the screen whenever you entered any key.
    public void holdScreen()
    {
        System.out.print("\tPress any key to continue . . . ");
        scan.nextLine();
    }
}
