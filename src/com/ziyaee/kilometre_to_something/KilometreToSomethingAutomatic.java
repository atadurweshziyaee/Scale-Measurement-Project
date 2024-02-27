package com.ziyaee.kilometre_to_something;

import com.ziyaee.screen.Screen;

public class KilometreToSomethingAutomatic {


    public void kilometreToAllAns(double kilometre){

        Screen scr = new Screen();

        double metre = kilometre * 1000.0d;
        double centimetre = kilometre * 100000.0d;
        double millimetre = kilometre * 1_000_000.0d;
        double micrometre = kilometre * 1_000_000_000.0d;
        double nanometre = kilometre * 1.0e15d;
        double mile = kilometre / 1.60934d;
        double yard = kilometre * 1093.61d;
        double foot = kilometre * 3280.84d;
        double inch = kilometre * 39370.1d;
        double nauticalMile = kilometre * 0.539957d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tKilometre\t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+metre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+centimetre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+kilometre+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();

    }


}
