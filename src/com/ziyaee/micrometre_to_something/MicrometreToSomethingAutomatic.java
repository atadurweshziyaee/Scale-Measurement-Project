package com.ziyaee.micrometre_to_something;

import com.ziyaee.screen.Screen;

public class MicrometreToSomethingAutomatic {

    public void micrometreToAllAns(double micrometre){
        Screen scr = new Screen();

        double kilometre = micrometre / 1000000000.0d ;
        double metre = micrometre / 1000000.0d;
        double centimetre = micrometre  / 10000.0d;
        double millimetre = micrometre / 1000.0d;
        double nanometre = micrometre * 1000.0d;
        double mile = micrometre / 1609344000.0d;
        double yard = micrometre / 914400.0d;
        double foot = micrometre / 304800.0d;
        double inch = micrometre / 25400.0d;
        double nauticalMile = micrometre / 1852000000.0d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tMillimetre\t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+centimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+micrometre+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
