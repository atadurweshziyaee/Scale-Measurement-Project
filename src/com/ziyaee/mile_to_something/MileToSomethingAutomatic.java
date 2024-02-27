package com.ziyaee.mile_to_something;

import com.ziyaee.screen.Screen;

public class MileToSomethingAutomatic {

    public void mileToAllAns(double mile){
        Screen scr = new Screen();

        double kilometre = mile * 1.60934d ;
        double metre = mile * 1609.34d;
        double centimetre = mile  * 160934.4d;
        double millimetre = mile * 1609344d;
        double nanometre = mile * 1000.0d;
        double micrometre = mile * 1_609_344_000.0d;
        double yard = mile * 1760.0d;
        double foot = mile * 5280.0d;
        double inch = mile * 63360.0;
        double nauticalMile = mile * 0.868976d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tMile     \t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+centimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+mile+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
