package com.ziyaee.inch_to_something;

import com.ziyaee.screen.Screen;

public class InchToSomethingAutomatic {

    public void inchToAllAns(double inch){
        Screen scr = new Screen();

        double kilometre = inch * 0.0000254d;
        double metre = inch * 0.0254d;
        double centimetre = inch  * 2.54d;
        double millimetre = inch * 25.4d;
        double nanometre = inch * 25400000.0d;
        double micrometre = inch * 25400.0d;
        double mile = inch / 63360.0d;
        double yard = inch / 36.0d;
        double foot = inch / 12.0d;
        double nauticalMile = inch / 72913.3858d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tInch     \t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+centimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+inch+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
