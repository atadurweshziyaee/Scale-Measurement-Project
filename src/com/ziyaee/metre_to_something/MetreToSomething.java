package com.ziyaee.metre_to_something;

public class MetreToSomething {

    // converting (Metre to Kilometre).
    public double metreToKilometre(double meter1) {
        return meter1 / 1000.0d; // 1 kilometer = 1000 meters
    }

    // converting (Metre to Centimetre).
    public double metreToCentimetre(double metre2) {
        return metre2 * 100.0d; // 1 meter = 100 centimeters
    }

    // converting (Metre to Millimeter).
    public double metreToMillimetre(double metre3) {
        return metre3 * 1000.0d; // 1 meter = 1000 millimeters
    }

    // converting (Metre to Micrometre).
    public double metreToMicrometre(double metre) {
        return metre * 1_000_000.0d; // 1 meter = 1,000,000 micrometers
    }

    // converting (Metre to Nanometre).
    public double metreToNanometre(double metre) {
        return metre * 1.0e9d; // 1 meter = 1.0e9 nanometers
    }

    // converting (Metre to Mile).
    public double metreToMile(double metre) {
        return metre / 1609.34d; // 1 mile ≈ 1609.34 meters
    }

    // converting (Metre to Yard).
    public double metreToYard(double metre) {
        return metre * 1.09361d; // 1 meter ≈ 1.09361 yards
    }

    // converting (Metre to Foot).
    public double metreToFoot(double metre) {
        return metre * 3.28084d; // 1 meter ≈ 3.28084 feet
    }

    // converting (Metre to Inch).
    public double metreToInch(double metre) {
        return metre * 39.3701d; // 1 meter ≈ 39.3701 inches
    }

    // converting (Metre to nautical Mile).
    public double metreToNauticalMile(double metre) {
        return metre / 1852.0d; // 1 nautical mile ≈ 1852 meters
    }
}
