package com.ziyaee.millimetre_to_something;

public class MillimetreToSomething {

    // converting (Millimetre to Kilometre).
    public double millimetreToKilometre(double millimetre) {
        return millimetre / 1000000.0d;  // 1 kilometer = 1,000,000 millimeters.
    }

    // converting (Millimetre to Metre).
    public double millimetreToMetre(double millimetre) {
        return millimetre  / 1000.0d;  // 1 meter = 1000 millimeters.
    }
    // converting (Millimetre to Centimetre).
    public double millimetreToCentimetre(double millimetre) {
        return millimetre  / 10.0d;  // 1 centimeter = 10 millimeters
    }

    // converting (Millimetre to Micrometre).
    public double millimetreToMicrometre(double millimetre) {
        return millimetre  * 1000.0d;  // 1 millimeter = 1,000 micrometer.
    }

    // converting (Millimetre to Nanometre).
    public double millimetreToNanometre(double millimetre) {
        return millimetre  * 1000000.0d;  // 1 millimeter = 1,000,000 nanometers.
    }

    // converting (Millimetre to Mile).
    public double millimetreToMile(double millimetre) {
        return millimetre  / 1609344.0d;  // 1 mile = 1609344 millimeters.
    }

    // converting (Millimetre to Yard).
    public double millimetreToYard(double millimetre) {
        return millimetre / 914.4d;  // 1 yard = 914.4 millimeters
    }

    // converting (Millimetre to Foot).
    public double millimetreToFoot(double millimetre) {
        return millimetre / 304.8d;  // 1 foot = 304.8 millimeters
    }

    // converting (Millimetre to Inch).
    public double millimetreToInch(double millimetre) {
        return millimetre / 25.4d;  // 1 inch = 25.4 millimeters.
    }

    // converting (Millimetre to Nautical Mile).
    public double millimetreToNauticalMile(double millimetre) {
        return millimetre / 1852000000.0d;  // 1 nautical mile = 1852000000 millimeters.
    }

}
