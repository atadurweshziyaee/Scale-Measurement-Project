package com.ziyaee.yard_to_something;

public class YardToSomething {

    public double yardToKilometre(double yard){
        return yard / 1093.61d;
    }

    public double yardToMetre(double yard){
        return yard * 0.9144d;
    }

    public double yardToCentimetre(double yard){
        return yard * 91.44d;
    }

    public double yardToMillimetre(double yard){
        return yard * 914.4d;
    }

    public double yardToMicrometre(double yard){
        return yard * 914400d;
    }

    public double yardToNanometre(double yard){
        return yard * 914400000d;
    }

    public double yardToMile(double yard){
        return yard / 1760.0d;
    }

    public double yardToFoot(double yard){
        return yard * 3.0d;
    }

    public double yardToInch(double yard){
        return yard * 36.0d;
    }

    public double yardToNauticalMile(double yard){
        return yard / 2025.37283d;
    }


}
