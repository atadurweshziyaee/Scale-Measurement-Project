package com.ziyaee.centimetre_to_something;

import com.ziyaee.screen.Screen;

public class CentimetreToSomethingAutomatic {

    public void centimetreToAllAns(double centimetre){
        Screen scr = new Screen();

        double kilometre = centimetre / 100000.0d ;
        double metre = centimetre / 100.0d;
        double millimetre = centimetre * 10.0d;
        double micrometre = centimetre * 10000.0d;
        double nanometre = centimetre * 10000000.0d;
        double mile = centimetre / 160934.4d;
        double yard = centimetre / 91.44d;
        double foot = centimetre / 30.48d;
        double inch = centimetre / 2.54d;
        double nauticalMile = centimetre / 185200.0d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tCentimetre\t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+centimetre+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
