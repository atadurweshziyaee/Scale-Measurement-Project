package com.ziyaee.options;

import com.ziyaee.centimetre_to_something.CentimetreToSomething;
import com.ziyaee.centimetre_to_something.CentimetreToSomethingAutomatic;
import com.ziyaee.foot_to_something.FootToSomething;
import com.ziyaee.foot_to_something.FootToSomethingAutomatic;
import com.ziyaee.inch_to_something.InchToSomething;
import com.ziyaee.inch_to_something.InchToSomethingAutomatic;
import com.ziyaee.kilometre_to_something.KilometreToSomething;
import com.ziyaee.kilometre_to_something.KilometreToSomethingAutomatic;
import com.ziyaee.menu_lists.menu_list1.MenuList;
import com.ziyaee.menu_lists.menu_list2.MenuListAllAnswers;
import com.ziyaee.metre_to_something.MetreToSomething;
import com.ziyaee.metre_to_something.MetreToSomethingAutomatic;
import com.ziyaee.micrometre_to_something.MicrometreToSomething;
import com.ziyaee.micrometre_to_something.MicrometreToSomethingAutomatic;
import com.ziyaee.mile_to_something.MileToSomething;
import com.ziyaee.mile_to_something.MileToSomethingAutomatic;
import com.ziyaee.millimetre_to_something.MillimetreToSomething;
import com.ziyaee.millimetre_to_something.MillimetreToSomethingAutomatic;
import com.ziyaee.nanometre_to_something.NanometreToSomething;
import com.ziyaee.nanometre_to_something.NanometreToSomethingAutomatic;
import com.ziyaee.nauticalmile_to_something.NauticalMileToSomething;
import com.ziyaee.nauticalmile_to_something.NauticalMileToSomethingAutomatic;
import com.ziyaee.result.result_centimetre.ResultCentimetre;
import com.ziyaee.result.result_foot.ResultFoot;
import com.ziyaee.result.result_inch.ResultInch;
import com.ziyaee.result.result_kilometre.ResultKilometre;
import com.ziyaee.result.result_metre.ResultMetre;
import com.ziyaee.result.result_micrometre.ResultMicrometre;
import com.ziyaee.result.result_mile.ResultMile;
import com.ziyaee.result.result_millimetre.ResultMillimetre;
import com.ziyaee.result.result_nanometre.ResultNanometre;
import com.ziyaee.result.result_nauticalmile.ResultNauticalMile;
import com.ziyaee.result.result_yard.ResultYard;
import com.ziyaee.screen.Screen;
import com.ziyaee.user_input.UserInput;
import com.ziyaee.yard_to_something.YardToSomething;
import com.ziyaee.yard_to_something.YardToSomethingAutomatic;

public class Options {

    public void options() {


        while (true) {


            // this thing is for clearing the screen.
            Screen clscr = new Screen();


            MenuList ml = new MenuList(); // this class object is used for showing the list of scales in measurement.
            ml.menuList();

            UserInput ui = new UserInput(); // this class object is used for taking the user input.
            int choice = ui.choiceUserInput(); // this method() is user for selecting which option has to execute.


            KilometreToSomething kmTo = new KilometreToSomething(); // this class object is used for creating the object of kilometre.

            MetreToSomething mTo = new MetreToSomething(); // this class object is used for creating the object of Metre.

            CentimetreToSomething cmTo = new CentimetreToSomething(); // this class object is used for creating the object of Centimetre.

            MillimetreToSomething milliTo = new MillimetreToSomething(); // this class object is used for creating the object of millimetre.

            MicrometreToSomething micrTo = new MicrometreToSomething();

            NanometreToSomething nanoTo = new NanometreToSomething();

            MileToSomething mileTo = new MileToSomething();

            YardToSomething yardTo = new YardToSomething();

            FootToSomething footTo = new FootToSomething();

            InchToSomething inchTo = new InchToSomething();

            NauticalMileToSomething nautMile = new NauticalMileToSomething();


            ResultKilometre rk = new ResultKilometre(); // this class object is used for creating the object of result kilometre.

            ResultMetre rm = new ResultMetre(); // this class object is used for creating the object of result Meter.

            ResultMillimetre rmilli = new ResultMillimetre(); // this class object is used for creating the object of result Millimetre.

            ResultCentimetre rc = new ResultCentimetre(); // this class object is used for printing the result.

            ResultMicrometre rmicr = new ResultMicrometre();

            ResultNanometre rnano = new ResultNanometre();

            ResultMile rMile = new ResultMile();

            ResultYard rYard = new ResultYard();

            ResultFoot rFoot = new ResultFoot();

            ResultInch rInch = new ResultInch();

            ResultNauticalMile rNaut = new ResultNauticalMile();


            switch (choice) {
                case -2:
                    boolean flag = true;
                    while(flag) {

                        MenuListAllAnswers menuAllAns = new MenuListAllAnswers();
                        menuAllAns.menuListAllAnswers();
                        int choice2 = ui.choiceUserInput();
                        switch (choice2) {
                            case 0:
                                flag = false;
                                break;
                            case 1:
                                System.out.println("1)You have chosen Kilometre to Something.");
                                double kilometre = ui.userInputKilometre();
                                KilometreToSomethingAutomatic kmToAuto = new KilometreToSomethingAutomatic();
                                kmToAuto.kilometreToAllAns(kilometre);
                                break;

                            case 2:
                                System.out.println("2)You have chosen Metre to Something.");
                                double metre = ui.userInputMetre();
                                MetreToSomethingAutomatic  mToAuto = new MetreToSomethingAutomatic();
                                mToAuto.metreToAllAns(metre);
                                break;

                            case 3:
                                System.out.println("3)You have chosen Centimetre to Something.");
                                double centimetre = ui.userInputCentimetre();
                                CentimetreToSomethingAutomatic cmToAuto = new CentimetreToSomethingAutomatic();
                                cmToAuto.centimetreToAllAns(centimetre);
                                break;

                            case 4:
                                System.out.println("4)You have chosen Millimetre to Something.");
                                double millimetre = ui.userInputMillimetre();
                                MillimetreToSomethingAutomatic mmToAuto = new MillimetreToSomethingAutomatic();
                                mmToAuto.millimetreToAllAns(millimetre);
                                break;

                            case 5:
                                System.out.println("5)You have chosen Micrometre to Something.");
                                double micrometre = ui.userInputMicrometre();
                                MicrometreToSomethingAutomatic micrToAuto = new MicrometreToSomethingAutomatic();
                                micrToAuto.micrometreToAllAns(micrometre);
                                break;

                            case 6:
                                System.out.println("6)You have chosen Nanometre to Something.");
                                double nanometre = ui.userInputNanometre();
                                NanometreToSomethingAutomatic nanoToAuto = new NanometreToSomethingAutomatic();
                                nanoToAuto.nanometreToAllAns(nanometre);
                                break;

                            case 7:
                                System.out.println("7)You have chosen Mile to Something.");
                                double mile = ui.userInputMile();
                                MileToSomethingAutomatic mileToAuto = new MileToSomethingAutomatic();
                                mileToAuto.mileToAllAns(mile);
                                break;

                            case 8:
                                System.out.println("8)You have chosen Yard to Something.");
                                double yard = ui.userInputYard();
                                YardToSomethingAutomatic yardToAuto = new YardToSomethingAutomatic();
                                yardToAuto.yardToAllAns(yard);
                                break;

                            case 9:
                                System.out.println("9)You have chosen Foot to Something.");
                                double foot = ui.userInputFoot();
                                FootToSomethingAutomatic footToAuto = new FootToSomethingAutomatic();
                                footToAuto.footToAllAns(foot);
                                break;

                            case 10:
                                System.out.println("10)You have chosen Inch to Something.");
                                double inch = ui.userInputInch();
                                InchToSomethingAutomatic inchToAuto = new InchToSomethingAutomatic();
                                inchToAuto.inchToAllAns(inch);
                                break;

                            case 11:
                                System.out.println("11)You have chosen Nautical Mile to Something.");
                                double nauticalMile = ui.userInputNauticalMile();
                                NauticalMileToSomethingAutomatic nautiToAuto = new NauticalMileToSomethingAutomatic();
                                nautiToAuto.nauticalMileToAllAns(nauticalMile);
                                break;


                            default:
                                System.out.println("\t\t\t Wrong Option Error !!!");
                                clscr.holdScreen();

                        }

                    }
                    continue;
                case 0:
                    System.exit(0);

                case 1:
                    clscr.clearScreen();
                    System.out.println("\t\t\t1)  you have chosen Kilometre to Metre.\n");
                    double kilometre1 = ui.userInputKilometre();
                    rk.resultKilometreToMetre(kilometre1, kmTo.kilometreToMetre(kilometre1));
                    break;

                case 2:
                    clscr.clearScreen();
                    System.out.println("\t\t\t2)  you have chosen Kilometre to Centimetre.\n");
                    double kilometre2 = ui.userInputKilometre();
                    rk.resultKilometreToCentimetre(kilometre2, kmTo.kilometreToCentimetre(kilometre2));
                    break;

                case 3:
                    clscr.clearScreen();
                    System.out.println("\t\t\t3)  you have chosen Kilometre to Millimetre.\n");
                    double kilometre3 = ui.userInputKilometre();
                    rk.resultKilometreToMillimetre(kilometre3, kmTo.kilometreToMillimetre(kilometre3));
                    break;

                case 4:
                    clscr.clearScreen();
                    System.out.println("\t\t\t4)  you have chosen Kilometre to Micrometre.\n");
                    double kilometre4 = ui.userInputKilometre();
                    rk.resultKilometreToMicrometre(kilometre4, kmTo.kilometreToMicrometre(kilometre4));
                    break;

                case 5:
                    clscr.clearScreen();
                    System.out.println("\t\t\t5)  you have chosen Kilometre to Nanometre.\n");
                    double kilometre5 = ui.userInputKilometre();
                    rk.resultKilometreToNanometre(kilometre5, kmTo.kilometreToNanometre(kilometre5));
                    break;

                case 6:
                    clscr.clearScreen();
                    System.out.println("\t\t\t6)  you have chosen Kilometre to Mile.\n");
                    double kilometre6 = ui.userInputKilometre();
                    rk.resultKilometreToMile(kilometre6, kmTo.kilometreToMile(kilometre6));
                    break;

                case 7:
                    clscr.clearScreen();
                    System.out.println("\t\t\t7)  you have chosen Kilometre to yard.\n");
                    double kilometre7 = ui.userInputKilometre();
                    rk.resultKilometreToYard(kilometre7, kmTo.kilometreToYard(kilometre7));
                    break;

                case 8:
                    clscr.clearScreen();
                    System.out.println("\t\t\t8)  you have chosen Kilometre to Foot.\n");
                    double kilometre8 = ui.userInputKilometre();
                    rk.resultKilometreToFoot(kilometre8, kmTo.kilometreToFoot(kilometre8));
                    break;

                case 9:
                    clscr.clearScreen();
                    System.out.println("\t\t\t9)  you have chosen Kilometre to Inch.\n");
                    double kilometre9 = ui.userInputKilometre();
                    rk.resultKilometreToInch(kilometre9, kmTo.kilometreToInch(kilometre9));
                    break;

                case 10:
                    clscr.clearScreen();
                    System.out.println("\t\t\t10)  you have chosen Kilometre to Nautical Mile.\n");
                    double kilometre10 = ui.userInputKilometre();
                    rk.resultKilometreToNauticalmile(kilometre10, kmTo.kilometreToNauticalMile(kilometre10));
                    break;

                case 11:
                    clscr.clearScreen();
                    System.out.println("\t\t\t11)  you have chosen Metre to Kilometre.\n");
                    double metre1 = ui.userInputMetre();
                    rm.resultMetreToKilometre(metre1, mTo.metreToKilometre(metre1));
                    break;

                case 12:
                    clscr.clearScreen();
                    System.out.println("\t\t\t12)  you have chosen Metre to Centimetre.\n");
                    double metre2 = ui.userInputMetre();
                    rm.resultMetreToCentimetre(metre2, mTo.metreToCentimetre(metre2));
                    break;

                case 13:
                    clscr.clearScreen();
                    System.out.println("\t\t\t13)  you have chosen Metre to Millimetre.\n");
                    double metre3 = ui.userInputMetre();
                    rm.resultMetreToMillimetre(metre3, mTo.metreToMillimetre(metre3));
                    break;

                case 14:
                    clscr.clearScreen();
                    System.out.println("\t\t\t14)  you have chosen Metre to Micrometre.\n");
                    double metre4 = ui.userInputMetre();
                    rm.resultMetreToMicrometre(metre4, mTo.metreToMicrometre(metre4));
                    break;

                case 15:
                    clscr.clearScreen();
                    System.out.println("\t\t\t15)  you have chosen Metre to Nanometre.\n");
                    double metre5 = ui.userInputMetre();
                    rm.resultMetreToNanometre(metre5, mTo.metreToNanometre(metre5));
                    break;

                case 16:
                    clscr.clearScreen();
                    System.out.println("\t\t\t16)  you have chosen Metre to Mile.\n");
                    double metre6 = ui.userInputMetre();
                    rm.resultMetreToMile(metre6, mTo.metreToMile(metre6));
                    break;

                case 17:
                    clscr.clearScreen();
                    System.out.println("\t\t\t17)  you have chosen Metre to Yard.\n");
                    double metre7 = ui.userInputMetre();
                    rm.resultMetreToYard(metre7, mTo.metreToYard(metre7));
                    break;

                case 18:
                    clscr.clearScreen();
                    System.out.println("\t\t\t18)  you have chosen Metre to Foot.\n");
                    double metre8 = ui.userInputMetre();
                    rm.resultMetreToFoot(metre8, mTo.metreToFoot(metre8));
                    break;

                case 19:
                    clscr.clearScreen();
                    System.out.println("\t\t\t19)  you have chosen Metre to Inch.\n");
                    double metre9 = ui.userInputMetre();
                    rm.resultMetreToInch(metre9, mTo.metreToInch(metre9));
                    break;

                case 20:
                    clscr.clearScreen();
                    System.out.println("\t\t\t20)  you have chosen Metre to Nautical Mile.\n");
                    double metre10 = ui.userInputMetre();
                    rm.resultMetreToNauticalMile(metre10, mTo.metreToNauticalMile(metre10));
                    break;

                case 21:
                    clscr.clearScreen();
                    System.out.println("\t\t\t21)  you have chosen Centimetre to Kilometre.\n");
                    double centimetre1 = ui.userInputCentimetre();
                    rc.resultCentimetreToKilometre(centimetre1, cmTo.centimetreToKilometre(centimetre1));
                    break;

                case 22:
                    clscr.clearScreen();
                    System.out.println("\t\t\t22)  you have chosen Centimetre to Metre.\n");
                    double centimetre2 = ui.userInputCentimetre();
                    rc.resultCentimetreToMetre(centimetre2, cmTo.centimetreToMetre(centimetre2));
                    break;

                case 23:
                    clscr.clearScreen();
                    System.out.println("\t\t\t23)  you have chosen Centimetre to Millimetre.\n");
                    double centimetre3 = ui.userInputCentimetre();
                    rc.resultCentimetreToMillimetre(centimetre3, cmTo.centimetreToMillimetre(centimetre3));
                    break;

                case 24:
                    clscr.clearScreen();
                    System.out.println("\t\t\t24)  you have chosen Centimetre to Micrometre.\n");
                    double centimetre4 = ui.userInputCentimetre();
                    rc.resultCentimetreToMicrometre(centimetre4, cmTo.centimetreToMicrometre(centimetre4));
                    break;

                case 25:
                    clscr.clearScreen();
                    System.out.println("\t\t\t25)  you have chosen Centimetre to Nanometre.\n");
                    double centimetre5 = ui.userInputCentimetre();
                    rc.resultCentimetreToNanometre(centimetre5, cmTo.centimetreToNanometre(centimetre5));
                    break;

                case 26:
                    clscr.clearScreen();
                    System.out.println("\t\t\t26)  you have chosen Centimetre to Mile.\n");
                    double centimetre6 = ui.userInputCentimetre();
                    rc.resultCentimetreToMile(centimetre6, cmTo.centimetreToMile(centimetre6));
                    break;

                case 27:
                    clscr.clearScreen();
                    System.out.println("\t\t\t27)  you have chosen Centimetre to Millimetre.\n");
                    double centimetre7 = ui.userInputCentimetre();
                    rc.resultCentimetreToYard(centimetre7, cmTo.centimetreToFoot(centimetre7));
                    break;

                case 28:
                    clscr.clearScreen();
                    System.out.println("\t\t\t28)  you have chosen Centimetre to Foot.\n");
                    double centimetre8 = ui.userInputCentimetre();
                    rc.resultCentimetreToFoot(centimetre8, cmTo.centimetreToFoot(centimetre8));
                    break;

                case 29:
                    clscr.clearScreen();
                    System.out.println("\t\t\t29)  you have chosen Centimetre to Inch.\n");
                    double centimetre9 = ui.userInputCentimetre();
                    rc.resultCentimetreToInch(centimetre9, cmTo.centimetreToInch(centimetre9));
                    break;

                case 30:
                    clscr.clearScreen();
                    System.out.println("\t\t\t30)  you have chosen Centimetre to Nautical Mile.\n");
                    double centimetre10 = ui.userInputCentimetre();
                    rc.resultCentimetreToNauticalMile(centimetre10, cmTo.centimetreToNauticalMile(centimetre10));
                    break;

                case 31:
                    clscr.clearScreen();
                    System.out.println("\t\t\t31)  you have chosen Millimetre to Kilometre.\n");
                    double millimetre1 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToKilometre(millimetre1, milliTo.millimetreToKilometre(millimetre1));
                    break;

                case 32:
                    clscr.clearScreen();
                    System.out.println("\t\t\t32)  you have chosen Millimetre to Metre.\n");
                    double millimetre2 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToMetre(millimetre2, milliTo.millimetreToMetre(millimetre2));
                    break;

                case 33:
                    clscr.clearScreen();
                    System.out.println("\t\t\t33)  you have chosen Millimetre to Centimetre.\n");
                    double millimetre3 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToCentimetre(millimetre3, milliTo.millimetreToCentimetre(millimetre3));
                    break;

                case 34:
                    clscr.clearScreen();
                    System.out.println("\t\t\t34)  you have chosen Millimetre to Micrometre.\n");
                    double millimetre4 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToMicrometre(millimetre4, milliTo.millimetreToMicrometre(millimetre4));
                    break;

                case 35:
                    clscr.clearScreen();
                    System.out.println("\t\t\t35)  you have chosen Millimetre to Nanometre.\n");
                    double millimetre5 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToNanometre(millimetre5, milliTo.millimetreToNanometre(millimetre5));
                    break;

                case 36:
                    clscr.clearScreen();
                    System.out.println("\t\t\t36)  you have chosen Millimetre to Mile.\n");
                    double millimetre6 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToMile(millimetre6, milliTo.millimetreToMile(millimetre6));
                    break;

                case 37:
                    clscr.clearScreen();
                    System.out.println("\t\t\t37)  you have chosen Millimetre to Yard.\n");
                    double millimetre7 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToYard(millimetre7, milliTo.millimetreToYard(millimetre7));
                    break;

                case 38:
                    clscr.clearScreen();
                    System.out.println("\t\t\t38)  you have chosen Millimetre to Foot.\n");
                    double millimetre8 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToFoot(millimetre8, milliTo.millimetreToFoot(millimetre8));
                    break;

                case 39:
                    clscr.clearScreen();
                    System.out.println("\t\t\t39)  you have chosen Millimetre to Inch.\n");
                    double millimetre9 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToInch(millimetre9, milliTo.millimetreToInch(millimetre9));
                    break;

                case 40:
                    clscr.clearScreen();
                    System.out.println("\t\t\t40)  you have chosen Millimetre to Nautical Mile.\n");
                    double millimetre10 = ui.userInputMillimetre();
                    rmilli.resultMillimetreToNauticalMile(millimetre10, milliTo.millimetreToNauticalMile(millimetre10));
                    break;

                case 41:
                    clscr.clearScreen();
                    System.out.println("\t\t\t41)  you have chosen Micrometre to Kilometre.\n");
                    double micrometre1 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToKilometre(micrometre1, micrTo.micrometreToKilometre(micrometre1));
                    break;

                case 42:
                    clscr.clearScreen();
                    System.out.println("\t\t\t42)  you have chosen Micrometre to Metre.\n");
                    double micrometre2 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToMetre(micrometre2, micrTo.micrometreToMetre(micrometre2));
                    break;

                case 43:
                    clscr.clearScreen();
                    System.out.println("\t\t\t43)  you have chosen Micrometre to Centimetre.\n");
                    double micrometre3 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToCentimetre(micrometre3, micrTo.micrometreToCentimetre(micrometre3));
                    break;

                case 44:
                    clscr.clearScreen();
                    System.out.println("\t\t\t44)  you have chosen Micrometre to Millimetre.\n");
                    double micrometre4 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToMillimetre(micrometre4, micrTo.micrometreToMillimetre(micrometre4));
                    break;

                case 45:
                    clscr.clearScreen();
                    System.out.println("\t\t\t45)  you have chosen Micrometre to Nanometre.\n");
                    double micrometre5 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToNanometre(micrometre5, micrTo.micrometreToNanometre(micrometre5));
                    break;

                case 46:
                    clscr.clearScreen();
                    System.out.println("\t\t\t46)  you have chosen Micrometre to Mile.\n");
                    double micrometre6 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToMile(micrometre6, micrTo.micrometreToMile(micrometre6));
                    break;

                case 47:
                    clscr.clearScreen();
                    System.out.println("\t\t\t47)  you have chosen Micrometre to Yard.\n");
                    double micrometre7 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToYard(micrometre7, micrTo.micrometreToYard(micrometre7));
                    break;

                case 48:
                    clscr.clearScreen();
                    System.out.println("\t\t\t48)  you have chosen Micrometre to Foot.\n");
                    double micrometre8 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToFoot(micrometre8, micrTo.micrometreToFoot(micrometre8));
                    break;

                case 49:
                    clscr.clearScreen();
                    System.out.println("\t\t\t49)  you have chosen Micrometre to Inch.\n");
                    double micrometre9 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToInch(micrometre9, micrTo.micrometreToInch(micrometre9));
                    break;

                case 50:
                    clscr.clearScreen();
                    System.out.println("\t\t\t50)  you have chosen Micrometre to Nautical Mile.\n");
                    double micrometre10 = ui.userInputMicrometre();
                    rmicr.resultMicrometreToNauticalMile(micrometre10, micrTo.micrometreToNauticalMile(micrometre10));
                    break;

                case 51:
                    clscr.clearScreen();
                    System.out.println("\t\t\t51)  you have chosen Nanometre to Kilometre.\n");
                    double nanometre1 = ui.userInputNanometre();
                    rnano.resultNanometreToKilometre(nanometre1, nanoTo.nanometreToKilometre(nanometre1));
                    break;

                case 52:
                    clscr.clearScreen();
                    System.out.println("\t\t\t52)  you have chosen Nanometre to Metre.\n");
                    double nanometre2 = ui.userInputNanometre();
                    rnano.resultNanometreToMetre(nanometre2, nanoTo.nanometreToMetre(nanometre2));
                    break;

                case 53:
                    clscr.clearScreen();
                    System.out.println("\t\t\t53)  you have chosen Nanometre to Centimetre.\n");
                    double nanometre3 = ui.userInputNanometre();
                    rnano.resultNanometreToCentimetre(nanometre3, nanoTo.nanometreToCentimetre(nanometre3));
                    break;

                case 54:
                    clscr.clearScreen();
                    System.out.println("\t\t\t54)  you have chosen Nanometre to Millimetre.\n");
                    double nanometre4 = ui.userInputNanometre();
                    rnano.resultNanometreToMillimetre(nanometre4, nanoTo.nanometreToMillimetre(nanometre4));
                    break;

                case 55:
                    clscr.clearScreen();
                    System.out.println("\t\t\t55)  you have chosen Nanometre to Micrometre.\n");
                    double nanometre5 = ui.userInputNanometre();
                    rnano.resultNanometreToMicrometre(nanometre5, nanoTo.nanometreToMicrometre(nanometre5));
                    break;

                case 56:
                    clscr.clearScreen();
                    System.out.println("\t\t\t56)  you have chosen Nanometre to Mile.\n");
                    double nanometre6 = ui.userInputNanometre();
                    rnano.resultNanometreToMile(nanometre6, nanoTo.nanometreToMile(nanometre6));
                    break;

                case 57:
                    clscr.clearScreen();
                    System.out.println("\t\t\t57)  you have chosen Nanometre to Yard.\n");
                    double nanometre7 = ui.userInputNanometre();
                    rnano.resultNanometreToYard(nanometre7, nanoTo.nanometreToYard(nanometre7));
                    break;

                case 58:
                    clscr.clearScreen();
                    System.out.println("\t\t\t58)  you have chosen Nanometre to Foot.\n");
                    double nanometre8 = ui.userInputNanometre();
                    rnano.resultNanometreToFoot(nanometre8, nanoTo.nanometreToFoot(nanometre8));
                    break;

                case 59:
                    clscr.clearScreen();
                    System.out.println("\t\t\t59)  you have chosen Nanometre to Inch.\n");
                    double nanometre9 = ui.userInputNanometre();
                    rnano.resultNanometreToInch(nanometre9, nanoTo.nanometreToInch(nanometre9));
                    break;

                case 60:
                    clscr.clearScreen();
                    System.out.println("\t\t\t60)  you have chosen Nanometre to Nautical Mile.\n");
                    double nanometre10 = ui.userInputNanometre();
                    rnano.resultNanometreToNauticalMile(nanometre10, nanoTo.nanometreToNauticalMile(nanometre10));
                    break;

                case 61:
                    clscr.clearScreen();
                    System.out.println("\t\t\t61)  you have chosen Mile to Kilometre.\n");
                    double mile1 = ui.userInputMile();
                    rMile.resultMileToKilometre(mile1, mileTo.mileToKilometre(mile1));
                    break;

                case 62:
                    clscr.clearScreen();
                    System.out.println("\t\t\t62)  you have chosen Mile to Meter.\n");
                    double mile2 = ui.userInputMile();
                    rMile.resultMileToMetre(mile2, mileTo.mileToMetre(mile2));
                    break;

                case 63:
                    clscr.clearScreen();
                    System.out.println("\t\t\t63)  you have chosen Mile to Centimetre.\n");
                    double mile3 = ui.userInputMile();
                    rMile.resultMileToCentimetre(mile3, mileTo.mileToCentimetre(mile3));
                    break;

                case 64:
                    clscr.clearScreen();
                    System.out.println("\t\t\t64)  you have chosen Mile to Millimetre.\n");
                    double mile4 = ui.userInputMile();
                    rMile.resultMileToMillimetre(mile4, mileTo.mileToMillimetre(mile4));
                    break;

                case 65:
                    clscr.clearScreen();
                    System.out.println("\t\t\t65)  you have chosen Mile to Micrometre.\n");
                    double mile5 = ui.userInputMile();
                    rMile.resultMileToMicrometre(mile5, mileTo.mileToMicrometre(mile5));
                    break;

                case 66:
                    clscr.clearScreen();
                    System.out.println("\t\t\t66)  you have chosen Mile to Nanometre.\n");
                    double mile6 = ui.userInputMile();
                    rMile.resultMileToNanometre(mile6, mileTo.mileToNanometre(mile6));
                    break;

                case 67:
                    clscr.clearScreen();
                    System.out.println("\t\t\t67)  you have chosen Mile to Yard.\n");
                    double mile7 = ui.userInputMile();
                    rMile.resultMileToYard(mile7, mileTo.mileToYard(mile7));
                    break;

                case 68:
                    clscr.clearScreen();
                    System.out.println("\t\t\t68)  you have chosen Mile to Foot.\n");
                    double mile8 = ui.userInputMile();
                    rMile.resultMileToFoot(mile8, mileTo.mileToFoot(mile8));
                    break;

                case 69:
                    clscr.clearScreen();
                    System.out.println("\t\t\t69)  you have chosen Mile to Inch.\n");
                    double mile9 = ui.userInputMile();
                    rMile.resultMileToInch(mile9, mileTo.mileToInch(mile9));
                    break;

                case 70:
                    clscr.clearScreen();
                    System.out.println("\t\t\t70)  you have chosen Mile to Nautical Mile.\n");
                    double mile10 = ui.userInputMile();
                    rMile.resultMileToNauticalMile(mile10, mileTo.mileToNauticalMile(mile10));
                    break;

                case 71:
                    clscr.clearScreen();
                    System.out.println("\t\t\t71)  you have chosen Yard to Kilometre.\n");
                    double yard1 = ui.userInputYard();
                    rYard.resultYardToKilometre(yard1, yardTo.yardToKilometre(yard1));
                    break;

                case 72:
                    clscr.clearScreen();
                    System.out.println("\t\t\t72)  you have chosen Yard to Metre.\n");
                    double yard2 = ui.userInputYard();
                    rYard.resultYardToMetre(yard2, yardTo.yardToMetre(yard2));
                    break;

                case 73:
                    clscr.clearScreen();
                    System.out.println("\t\t\t73)  you have chosen Yard to Centimetre.\n");
                    double yard3 = ui.userInputYard();
                    rYard.resultYardToCentimetre(yard3, yardTo.yardToCentimetre(yard3));
                    break;

                case 74:
                    clscr.clearScreen();
                    System.out.println("\t\t\t74)  you have chosen Yard to Millimetre.\n");
                    double yard4 = ui.userInputYard();
                    rYard.resultYardToMillimetre(yard4, yardTo.yardToMillimetre(yard4));
                    break;

                case 75:
                    clscr.clearScreen();
                    System.out.println("\t\t\t75)  you have chosen Yard to Micrometre.\n");
                    double yard5 = ui.userInputYard();
                    rYard.resultYardToMicrometre(yard5, yardTo.yardToMicrometre(yard5));
                    break;

                case 76:
                    clscr.clearScreen();
                    System.out.println("\t\t\t76)  you have chosen Yard to Nanometre.\n");
                    double yard6 = ui.userInputYard();
                    rYard.resultYardToNanometre(yard6, yardTo.yardToNanometre(yard6));
                    break;

                case 77:
                    clscr.clearScreen();
                    System.out.println("\t\t\t77)  you have chosen Yard to Mile.\n");
                    double yard7 = ui.userInputYard();
                    rYard.resultYardToMile(yard7, yardTo.yardToMile(yard7));
                    break;

                case 78:
                    clscr.clearScreen();
                    System.out.println("\t\t\t78)  you have chosen Yard to Foot.\n");
                    double yard8 = ui.userInputYard();
                    rYard.resultYardToFoot(yard8, yardTo.yardToFoot(yard8));
                    break;

                case 79:
                    clscr.clearScreen();
                    System.out.println("\t\t\t79)  you have chosen Yard to Inch.\n");
                    double yard9 = ui.userInputYard();
                    rYard.resultYardToInch(yard9, yardTo.yardToInch(yard9));
                    break;

                case 80:
                    clscr.clearScreen();
                    System.out.println("\t\t\t80)  you have chosen Yard to Nautical Mile.\n");
                    double yard10 = ui.userInputYard();
                    rYard.resultYardToNauticalMile(yard10, yardTo.yardToNauticalMile(yard10));
                    break;

                case 81:
                    clscr.clearScreen();
                    System.out.println("\t\t\t81)  you have chosen Foot to Kilometre.\n");
                    double foot1 = ui.userInputFoot();
                    rFoot.resultFootToKilometre(foot1, footTo.footToKilometre(foot1));
                    break;

                case 82:
                    clscr.clearScreen();
                    System.out.println("\t\t\t82)  you have chosen Foot to Metre.\n");
                    double foot2 = ui.userInputFoot();
                    rFoot.resultFootToMetre(foot2, footTo.footToMetre(foot2));
                    break;

                case 83:
                    clscr.clearScreen();
                    System.out.println("\t\t\t83)  you have chosen Foot to Centimetre.\n");
                    double foot3 = ui.userInputFoot();
                    rFoot.resultFootToCentimetre(foot3, footTo.footToCentimetre(foot3));
                    break;

                case 84:
                    clscr.clearScreen();
                    System.out.println("\t\t\t84)  you have chosen Foot to Millimetre.\n");
                    double foot4 = ui.userInputFoot();
                    rFoot.resultFootToMillimetre(foot4, footTo.footToMillimetre(foot4));
                    break;

                case 85:
                    clscr.clearScreen();
                    System.out.println("\t\t\t85)  you have chosen Foot to Micrometre.\n");
                    double foot5 = ui.userInputFoot();
                    rFoot.resultFootToMicrometre(foot5, footTo.footToMicrometre(foot5));
                    break;

                case 86:
                    clscr.clearScreen();
                    System.out.println("\t\t\t86)  you have chosen Foot to Nanometre.\n");
                    double foot6 = ui.userInputFoot();
                    rFoot.resultFootToNanometre(foot6, footTo.footToNanometre(foot6));
                    break;

                case 87:
                    clscr.clearScreen();
                    System.out.println("\t\t\t87)  you have chosen Foot to Mile.\n");
                    double foot7 = ui.userInputFoot();
                    rFoot.resultFootToMile(foot7, footTo.footToMile(foot7));
                    break;

                case 88:
                    clscr.clearScreen();
                    System.out.println("\t\t\t88)  you have chosen Foot to Yard.\n");
                    double foot8 = ui.userInputFoot();
                    rFoot.resultFootToYard(foot8, footTo.footToYard(foot8));
                    break;

                case 89:
                    clscr.clearScreen();
                    System.out.println("\t\t\t89)  you have chosen Foot to Inch.\n");
                    double foot9 = ui.userInputFoot();
                    rFoot.resultFootToInch(foot9, footTo.footToInch(foot9));
                    break;

                case 90:
                    clscr.clearScreen();
                    System.out.println("\t\t\t90)  you have chosen Foot to Nautical Mile.\n");
                    double foot10 = ui.userInputFoot();
                    rFoot.resultFootToNauticalMile(foot10, footTo.footToNauticalMile(foot10));
                    break;

                case 91:
                    clscr.clearScreen();
                    System.out.println("\t\t\t91)  you have chosen Inch to Kilometre.\n");
                    double inch1 = ui.userInputInch();
                    rInch.resultInchToKilometre(inch1, inchTo.inchToKilometre(inch1));
                    break;

                case 92:
                    clscr.clearScreen();
                    System.out.println("\t\t\t92)  you have chosen Inch to Metre.\n");
                    double inch2 = ui.userInputInch();
                    rInch.resultInchToMetre(inch2, inchTo.inchToMetre(inch2));
                    break;

                case 93:
                    clscr.clearScreen();
                    System.out.println("\t\t\t93)  you have chosen Inch to Centimetre.\n");
                    double inch3 = ui.userInputInch();
                    rInch.resultInchToCentimetre(inch3, inchTo.inchToCentimetre(inch3));
                    break;

                case 94:
                    clscr.clearScreen();
                    System.out.println("\t\t\t94)  you have chosen Inch to Millimetre.\n");
                    double inch4 = ui.userInputInch();
                    rInch.resultInchToMillimetre(inch4, inchTo.inchToMillimetre(inch4));
                    break;

                case 95:
                    clscr.clearScreen();
                    System.out.println("\t\t\t95)  you have chosen Inch to Micrometre.\n");
                    double inch5 = ui.userInputInch();
                    rInch.resultInchToMicrometre(inch5, inchTo.inchToMicrometre(inch5));
                    break;

                case 96:
                    clscr.clearScreen();
                    System.out.println("\t\t\t96)  you have chosen Inch to Nanometre.\n");
                    double inch6 = ui.userInputInch();
                    rInch.resultInchToNanometre(inch6, inchTo.inchToNanometre(inch6));
                    break;

                case 97:
                    clscr.clearScreen();
                    System.out.println("\t\t\t97)  you have chosen Inch to Mile.\n");
                    double inch7 = ui.userInputInch();
                    rInch.resultInchToMile(inch7, inchTo.inchToMile(inch7));
                    break;

                case 98:
                    clscr.clearScreen();
                    System.out.println("\t\t\t98)  you have chosen Inch to Yard.\n");
                    double inch8 = ui.userInputInch();
                    rInch.resultInchToYard(inch8, inchTo.inchToYard(inch8));
                    break;

                case 99:
                    clscr.clearScreen();
                    System.out.println("\t\t\t99)  you have chosen Inch to Foot.\n");
                    double inch9 = ui.userInputInch();
                    rInch.resultInchToFoot(inch9, inchTo.inchToFoot(inch9));
                    break;

                case 100:
                    clscr.clearScreen();
                    System.out.println("\t\t\t100)  you have chosen Inch to Nautical Mile.\n");
                    double inch10 = ui.userInputInch();
                    rInch.resultInchToNauticalMile(inch10, inchTo.inchToNauticalMile(inch10));
                    break;

                case 101:
                    clscr.clearScreen();
                    System.out.println("\t\t\t101)  you have chosen Nautical Mile to Kilometre\n");
                    double nauticalMile1 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToKilometre(nauticalMile1, nautMile.nauticalMileToKilometre(nauticalMile1));
                    break;

                case 102:
                    clscr.clearScreen();
                    System.out.println("\t\t\t102)  you have chosen Nautical Mile to Metre\n");
                    double nauticalMile2 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToMetre(nauticalMile2, nautMile.nauticalMileToMetre(nauticalMile2));
                    break;

                case 103:
                    clscr.clearScreen();
                    System.out.println("\t\t\t103)  you have chosen Nautical Mile to Centimetre\n");
                    double nauticalMile3 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToCentimetre(nauticalMile3, nautMile.nauticalMileToCentimetre(nauticalMile3));
                    break;

                case 104:
                    clscr.clearScreen();
                    System.out.println("\t\t\t104)  you have chosen Nautical Mile to Millimetre\n");
                    double nauticalMile4 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToMillimetre(nauticalMile4, nautMile.nauticalMileToMillimetre(nauticalMile4));
                    break;

                case 105:
                    clscr.clearScreen();
                    System.out.println("\t\t\t105)  you have chosen Nautical Mile to Micrometre\n");
                    double nauticalMile5 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToMicrometre(nauticalMile5, nautMile.nauticalMileToMicrometre(nauticalMile5));
                    break;

                case 106:
                    clscr.clearScreen();
                    System.out.println("\t\t\t106)  you have chosen Nautical Mile to Nanometre\n");
                    double nauticalMile6 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToNanometre(nauticalMile6, nautMile.nauticalMileToNanometre(nauticalMile6));
                    break;

                case 107:
                    clscr.clearScreen();
                    System.out.println("\t\t\t107)  you have chosen Nautical Mile to Mile\n");
                    double nauticalMile7 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToMile(nauticalMile7, nautMile.nauticalMileToMile(nauticalMile7));
                    break;

                case 108:
                    clscr.clearScreen();
                    System.out.println("\t\t\t108)  you have chosen Nautical Mile to Yard\n");
                    double nauticalMile8 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToYard(nauticalMile8, nautMile.nauticalMileToYard(nauticalMile8));
                    break;

                case 109:
                    clscr.clearScreen();
                    System.out.println("\t\t\t109)  you have chosen Nautical Mile to Foot\n");
                    double nauticalMile9 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToFoot(nauticalMile9, nautMile.nauticalMileToFoot(nauticalMile9));
                    break;

                case 110:
                    clscr.clearScreen();
                    System.out.println("\t\t\t110)  you have chosen Nautical Mile to Inch\n");
                    double nauticalMile10 = ui.userInputNauticalMile();
                    rNaut.resultNauticalMileToInch(nauticalMile10, nautMile.nauticalMileToInch(nauticalMile10));
                    break;

                default:
                    System.out.println("\t\t\t Wrong Option Error !!!");
                    clscr.holdScreen();

            }
        }
    }
}
