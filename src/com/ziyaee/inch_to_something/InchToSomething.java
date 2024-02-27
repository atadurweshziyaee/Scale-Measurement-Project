package com.ziyaee.inch_to_something;

public class InchToSomething {

    public double inchToKilometre(double inch){
        return inch * 0.0000254d;
    }

    public double inchToMetre(double inch){
        return inch * 0.0254d;
    }

    public double inchToCentimetre(double inch){
        return inch * 2.54d;
    }

    public double inchToMillimetre(double inch){
        return inch * 25.4d;
    }

    public double inchToMicrometre(double inch){
        return inch * 25400.0d;
    }

    public double inchToNanometre(double inch){
        return inch * 25400000.0d;
    }

    public double inchToMile(double inch){
        return inch / 63360.0d;
    }

    public double inchToYard(double inch){
        return inch / 36.0d;
    }

    public double inchToFoot(double inch){
        return inch / 12.0d;
    }

    public double inchToNauticalMile(double inch){
        return inch / 72913.3858d;
    }


}
