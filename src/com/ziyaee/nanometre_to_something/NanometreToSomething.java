package com.ziyaee.nanometre_to_something;

public class NanometreToSomething {

    // converting (Nanometre to Kilometre).
    public double nanometreToKilometre(double nanometre){
        return nanometre / 1e12d;
    }

    // converting (Nanometre to Metre).
    public double nanometreToMetre(double nanometre){
        return nanometre / 1e9d;
    }

    // converting (Nanometre to Centimetre).
    public double nanometreToCentimetre(double nanometre){
        return nanometre / 1e7d;
    }

    // converting (Nanometre to Millimetre).
    public double nanometreToMillimetre(double nanometre){
        return nanometre / 1e6d;
    }

    // converting (Nanometre to Micrometre).
    public double nanometreToMicrometre(double nanometre){
        return nanometre / 1e3d;
    }

    // converting (Nanometre to Mile).
    public double nanometreToMile(double nanometre){
        return nanometre / (1609.344d * Math.pow(10, 9));
    }

    // converting (Nanometre to Yard).
    public double nanometreToYard(double nanometre){
        return nanometre / (914.4d * Math.pow(10, 9));
    }

    // converting (Nanometre to Foot).
    public double nanometreToFoot(double nanometre){
        return nanometre / (304.8d * Math.pow(10, 9));
    }

    // converting (Nanometre to Inch).
    public double nanometreToInch(double nanometre){
        return nanometre / (25.4d * Math.pow(10, 9));
    }

    // converting (Nanometre to Nautical Mile).
    public double nanometreToNauticalMile(double nanometre){
        return nanometre / (1.852d * Math.pow(10, 12));
    }

}
