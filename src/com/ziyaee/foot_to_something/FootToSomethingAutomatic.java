package com.ziyaee.foot_to_something;

import com.ziyaee.screen.Screen;

public class FootToSomethingAutomatic {

    public void footToAllAns(double foot){
        Screen scr = new Screen();

        double kilometre = foot * 0.0003048d;
        double metre = foot * 0.3048d;
        double centimetre = foot  * 30.48d;
        double millimetre = foot * 304.8d;
        double nanometre = foot * 304800000d;
        double micrometre = foot * 304800d;
        double mile = foot / 5280.0d;
        double yard = foot / 3.0d;
        double inch = foot * 12.0;
        double nauticalMile = foot / 6076.12d;

        System.out.println("\n");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t\t\t\t\t\tFoot     \t\t\t--->\t\t\tAll Answers");
        System.out.println("\t\t\t==================================================================================");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+kilometre+" Metre             ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+metre+" Centimetre      ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+centimetre+" Millimetre     ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+millimetre+" Millimetre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+nanometre+" Nanometre         ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+micrometre+" Micrometre   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+mile+" Mile   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+yard+" Yard   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+inch+" Inch   ");
        System.out.println("\t\t\t|\t\t\t\t\t"+foot+"\t\t\t    \t\t\t\t\t"+nauticalMile+" Nautical Mile ");
        System.out.println("\t\t\t----------------------------------------------------------------------------------");
        scr.holdScreen();
    }
}
