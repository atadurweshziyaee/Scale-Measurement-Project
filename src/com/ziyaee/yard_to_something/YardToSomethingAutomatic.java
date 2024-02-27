package com.ziyaee.yard_to_something;

import com.ziyaee.screen.Screen;

public class YardToSomethingAutomatic {

    public void yardToAllAns(double yard){
        Screen scr = new Screen();

        double kilometre = yard / 1093.61d;
        double metre = yard * 0.9144d;
        double centimetre = yard  * 91.44d;
        double millimetre = yard * 914.4d;
        double nanometre = yard * 914400000d;
        double micrometre = yard * 914400d;
        double mile = yard / 1760.0d;
        double foot = yard * 3.0d;
        double inch = yard * 36.0d;
        double nauticalMile = yard / 2025.37283d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tYard     \t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+centimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+foot+" Foot   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+yard+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
