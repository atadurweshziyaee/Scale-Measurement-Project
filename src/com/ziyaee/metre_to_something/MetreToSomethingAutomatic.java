package com.ziyaee.metre_to_something;

import com.ziyaee.screen.Screen;

public class MetreToSomethingAutomatic {
    public void metreToAllAns(double metre){
        Screen scr = new Screen();

        double kilometre = metre / 1000.0d ;
        double centimetre = metre * 100.0d;
        double millimetre = metre * 1000.0d;
        double micrometre = metre * 1_000_000.0d;
        double nanometre = metre * 1.0e9d;
        double mile = metre / 1609.34d;
        double yard = metre * 1.09361d;
        double foot = metre * 3.28084d;
        double inch = metre * 39.3701d;
        double nauticalMile = metre / 1852.0d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tMeter    \t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+kilometre+" Kilometre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+centimetre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+metre+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
