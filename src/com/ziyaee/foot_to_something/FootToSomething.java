package com.ziyaee.foot_to_something;

public class FootToSomething {

    public double footToKilometre(double foot){
        return foot * 0.0003048d;
    }

    public double footToMetre(double foot){
        return foot * 0.3048d;
    }

    public double footToCentimetre(double foot){
        return foot * 30.48d;
    }

    public double footToMillimetre(double foot){
        return foot * 304.8d;
    }

    public double footToMicrometre(double foot){
        return foot * 304800d;
    }

    public double footToNanometre(double foot){
        return foot * 304800000d;
    }

    public double footToMile(double foot){
        return foot / 5280.0d;
    }

    public double footToYard(double foot){
        return foot / 3.0d;
    }

    public double footToInch(double foot){
        return foot * 12.0;
    }

    public double footToNauticalMile(double foot){
        return foot / 6076.12d;
    }


}
