package com.ziyaee.nauticalmile_to_something;

import com.ziyaee.screen.Screen;

public class NauticalMileToSomethingAutomatic {

    public void nauticalMileToAllAns(double nauticalMile){
        Screen scr = new Screen();

        double kilometre = nauticalMile * 1.852d;
        double metre = nauticalMile * 1852.0d;
        double centimetre = nauticalMile  * 185200.0d;
        double millimetre = nauticalMile * 1852000.0d;
        double nanometre = nauticalMile * 1.852e12d;
        double micrometre = nauticalMile * 1.852e9d;
        double mile = nauticalMile * 1.15078d;
        double yard = nauticalMile * 2025.37183d;
        double foot = nauticalMile * 6076.11549d;
        double inch = nauticalMile * 72913.3858d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tNautical Mile\t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+centimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+nauticalMile+"\t\t\t    \t\t\t\t\t"+inch+" Inch ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
