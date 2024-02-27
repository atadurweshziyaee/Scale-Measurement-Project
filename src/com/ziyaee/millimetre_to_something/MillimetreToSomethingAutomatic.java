package com.ziyaee.millimetre_to_something;

import com.ziyaee.screen.Screen;

public class MillimetreToSomethingAutomatic {

    public void millimetreToAllAns(double millimetre){
        Screen scr = new Screen();

        double kilometre = millimetre / 1000000.0d ;
        double metre = millimetre / 1000.0d;
        double centimetre = millimetre  / 10.0d;
        double micrometre = millimetre * 1000.0d;
        double nanometre = millimetre * 1000000.0d;
        double mile = millimetre / 1609344.0d;
        double yard = millimetre / 914.4d;
        double foot = millimetre / 304.8d;
        double inch = millimetre / 25.4d;
        double nauticalMile = millimetre / 1852000000.0d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tMillimetre\t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+centimetre+" Centimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+millimetre+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
