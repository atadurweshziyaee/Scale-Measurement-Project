package com.ziyaee.kilometre_to_something;

public class KilometreToSomething {
    // this method is for converting the kilometre to metre.
    public double kilometreToMetre(double kilometre){
        return kilometre * 1000.0d; // 1 kilometre = 1000 meters.
    }

    // this method is for converting the kilometre to centimetre.
    public double kilometreToCentimetre(double kilometre2) {
        return kilometre2 * 100000.0d; // 1 kilometer = 100000 centimeters.
    }

    // this method is for converting the kilometre to millimetre.
    public double kilometreToMillimetre(double kilometre3) {
        return kilometre3 * 1_000_000.0d; // 1 kilometer = 1,000,000 millimeters.
    }

    // this method is for converting the kilometre to micrometre.
    public double kilometreToMicrometre(double kilometre4) {
        return kilometre4 * 1_000_000_000.0d; // 1 kilometer = 1,000,000,000 micrometers.
    }

    // this method is for converting the kilometre to Nanometre.
    public double kilometreToNanometre(double kilometre5) {
        return kilometre5 * 1.0e15d; // 1 kilometer = 1.0e15 nanometers. means 10 X 10^15.
    }

    // this method is for converting the kilometre to Mile.
    public double kilometreToMile(double kilometre6) {
        return kilometre6 / 1.60934d; // 1 mile ≈ 1.60934 kilometers.
    }

    // this method is for converting the kilometre to yard.
    public double kilometreToYard(double kilometre7) {
        return kilometre7 * 1093.61d; // 1 kilometer = 1093.61 yards
    }

    // this method is for converting the kilometre to feet.
    public double kilometreToFoot(double kilometre8) {
        return kilometre8 * 3280.84d; // 1 kilometer ≈ 3280.84 feet
    }

    // this method is for converting the kilometre to inch.
    public  double kilometreToInch(double kilometre9) {
        return kilometre9 * 39370.1d; // 1 kilometer ≈ 39370.1 inches
    }

    // this method is for converting the kilometre to nautical mile.
    public double kilometreToNauticalMile(double kilometre10) {
        return kilometre10 * 0.539957d; // 1 kilometer ≈ 0.539957 nautical miles
    }

}
