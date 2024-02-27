package com.ziyaee.nanometre_to_something;

import com.ziyaee.screen.Screen;

public class NanometreToSomethingAutomatic {

    public void nanometreToAllAns(double nanometre){
        Screen scr = new Screen();

        double kilometre = nanometre / 1e12d ;
        double metre = nanometre / 1e9d;
        double centimetre = nanometre  / 1e7d;
        double millimetre = nanometre / 1e6d;
        double micrometre = nanometre / 1e3d;
        double mile = nanometre / (1609.344d * Math.pow(10, 9));
        double yard = nanometre / (914.4d * Math.pow(10, 9));
        double foot = nanometre / (304.8d * Math.pow(10, 9));
        double inch = nanometre / (25.4d * Math.pow(10, 9));
        double nauticalMile = nanometre / (1.852d * Math.pow(10, 12));

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tNanometre\t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+centimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nanometre+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
