package com.ziyaee.centimetre_to_something;

public class CentimetreToSomething {
    // converting (Centimetre to Kilometre).
    public double centimetreToKilometre(double centimetre) {
        return centimetre / 100000.0d;  // 1 kilometer = 100,000 centimeters

    }

    // converting (Centimetre to Metre).
    public double centimetreToMetre(double centimetre) {
        return centimetre / 100.0d;  // 1 meter = 100 centimeters;
    }

    // converting (Centimetre to Millimetre).
    public double centimetreToMillimetre(double centimetre){
        return  centimetre * 10.0d;  // 1 centimeter = 10 millimeters.
    }

    // converting (Centimetre to Micrometre).
    public double centimetreToMicrometre(double centimetre){
        return  centimetre * 10000.0d; // 1 centimeter = 10,000 micrometers.
    }

    // converting (Centimetre to Nanometre).
    public double centimetreToNanometre(double centimetre){
        return centimetre * 10000000.0d;  // 1 centimeter = 10,000,000 nanometers
    }

    // converting (Centimetre to Mile).
    public double centimetreToMile(double centimetre){
        return centimetre / 160934.4d;  // 1 mile = 160934.4 centimeters
    }

    // converting (Centimetre to Yard).
    public double centimetreToYard(double centimetre){
        return centimetre / 91.44d;   // 1 yard = 91.44 centimeters
    }

    // converting (Centimetre to Foot).
    public double centimetreToFoot(double centimetre){
        return centimetre / 30.48d;  // 1 foot = 30.48 centimeters.
    }

    // converting (Centimetre to Inch).
    public double centimetreToInch(double centimetre){
        return centimetre / 2.54d;  // 1 inch = 2.54 centimeters
    }

    // converting (Centimetre to Nautical Mile).
    public double centimetreToNauticalMile(double centimetre){
        return centimetre / 185200.0d;  // 1 nautical mile = 185200 centimeters.
    }

}
