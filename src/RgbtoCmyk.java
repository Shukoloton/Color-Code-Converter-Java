//Color Code Converter v0.0.6-nonfull.
//Created by Shukoloton (https://github.com/Shukoloton/Color-Code-Converter-Java).
//Formula for CMYK calculation based on https://www.rapidtables.com/convert/color/rgb-to-cmyk.html.

import java.util.Scanner;
import java.math.*;

public class RgbtoCmyk {

    public void rgbToCmyk() {

        //Creates scanners.
        Scanner redScanner = new Scanner(System.in);
        Scanner blueScanner = new Scanner(System.in);
        Scanner greenScanner = new Scanner(System.in);
        Scanner backScanner = new Scanner(System.in);

        while (true) {

            //Asks for red value and activates redScanner on next line (integer).
            System.out.println("Input R (red) value:");
            int redInput = redScanner.nextInt();

            //Asks for green value and activates greenScanner on next line (integer).
            System.out.println("Input G (green) value:");
            int greenInput = greenScanner.nextInt();

            //Asks for blue value and activates blueScanner on next line (integer).
            System.out.println("Input B (blue) value:");
            int blueInput = blueScanner.nextInt();

            //Checks whether the input is a valid RGB color code.
            if (redInput > 255 || greenInput > 255 || blueInput > 255) {

                //If not, asks to close, if yes, continues.
                System.out.println("Invalid input. Please enter valid RGB color codes, such as 144, 47, or 5.");
            } else {

                //Creates several BigDecimals and a precision context
                MathContext precision = new MathContext(5);
                BigDecimal maxValue = new BigDecimal(255);
                BigDecimal one = new BigDecimal(1);

                //Converts the 0 - 255 value to a decimal.
                BigDecimal redSecondary = new BigDecimal(redInput);
                BigDecimal redDecimal;
                redDecimal = redSecondary.divide(maxValue, precision);

                //Converts the 0 - 255 value to a decimal.
                BigDecimal greenSecondary = new BigDecimal(greenInput);
                BigDecimal greenDecimal;
                greenDecimal = greenSecondary.divide(maxValue, precision);

                //Converts the 0 - 255 value to a decimal.
                BigDecimal blueSecondary = new BigDecimal(blueInput);
                BigDecimal blueDecimal;
                blueDecimal = blueSecondary.divide(maxValue, precision);

                //Takes the max of the 3 previous values.
                BigDecimal redGreenMax = redDecimal.max(greenDecimal);
                BigDecimal maxColorValue = redGreenMax.max(blueDecimal);

                //Creates the black (key, K) value by substracting the max color value from 1.
                BigDecimal black = one.subtract(maxColorValue, precision);
            
                //Creates 1 - values.
                BigDecimal oneMinusBlack = one.subtract(black, precision);
                BigDecimal oneMinusRed = one.subtract(redDecimal, precision);
                BigDecimal oneMinusGreen = one.subtract(greenDecimal, precision);
                BigDecimal oneMinusBlue = one.subtract(blueDecimal, precision);

                //Checks whether 1 - K is equal to zero. If yes, automatically assigns 0 as value for cyan, magenta, and yellow.
                if (oneMinusBlack.compareTo(BigDecimal.ZERO) == 0) {

                    //Assigns 0s to cyan, magenta, and yellow values.
                    BigDecimal cyan = new BigDecimal(0);
                    BigDecimal magenta = new BigDecimal(0);
                    BigDecimal yellow = new BigDecimal(0);
                
                    //Creates doubles from big decimals of cyan, magenta, yellow, and black.
                    double cyanDouble = cyan.doubleValue();
                    double magentaDouble = magenta.doubleValue();
                    double yellowDouble = yellow.doubleValue();
                    double blackDouble = black.doubleValue();

                    //Rounds the floats to two decimal places.
                    double cyanRound = Math.floor(cyanDouble * 100) / 100;
                    double magentaRound = Math.floor(magentaDouble * 100) / 100;
                    double yellowRound = Math.floor(yellowDouble * 100) / 100;
                    double blackRound = Math.floor(blackDouble * 100) / 100;

                    //Multiplies by 100 to create a percentage.
                    double cyanDecPercentage = cyanRound * 100;
                    double magentaDecPercentage = magentaRound * 100;
                    double yellowDecPercentage = yellowRound * 100;
                    double blackDecPercentage = blackRound * 100;

                    //Removes decimal places from percentage.
                    int cyanPercentage = (int)Math.round(cyanDecPercentage);
                    int magentaPercentage = (int)Math.round(magentaDecPercentage);
                    int yellowPercentage = (int)Math.round(yellowDecPercentage);
                    int blackPercentage = (int)Math.round(blackDecPercentage);

                    //Prints the results.
                    System.out.println("(C: " + cyanPercentage + ", M: " + magentaPercentage + ", Y: " + yellowPercentage + ", K: " + blackPercentage + ")");
                    System.out.println("(" + cyanPercentage + "%, " + magentaPercentage + "%, " + yellowPercentage + "%, " + blackPercentage + "%)");
                //If 1 - K is not equal to zero, the code continues.
                } else {

                    //Uses the formula CMYKcolor = (1-R'-K) / (1-K), where CMYKcolor is CMYK color, R' is 0 - 1 red value, K is black.
                    BigDecimal cyan = (oneMinusRed.subtract(black, precision)).divide(oneMinusBlack, precision);
                    BigDecimal magenta = (oneMinusGreen.subtract(black, precision)).divide(oneMinusBlack, precision);
                    BigDecimal yellow = (oneMinusBlue.subtract(black, precision)).divide(oneMinusBlack, precision);

                    //Creates doubles from big decimals of cyan, magenta, yellow, and black.
                    double cyanDouble = cyan.doubleValue();
                    double magentaDouble = magenta.doubleValue();
                    double yellowDouble = yellow.doubleValue();
                    double blackDouble = black.doubleValue();

                    //Rounds the floats to two decimal places.
                    double cyanRound = Math.floor(cyanDouble * 100) / 100;
                    double magentaRound = Math.floor(magentaDouble * 100) / 100;
                    double yellowRound = Math.floor(yellowDouble * 100) / 100;
                    double blackRound = Math.floor(blackDouble * 100) / 100;

                    //Multiplies by 100 to create a percentage.
                    double cyanDecPercentage = cyanRound * 100;
                    double magentaDecPercentage = magentaRound * 100;
                    double yellowDecPercentage = yellowRound * 100;
                    double blackDecPercentage = blackRound * 100;

                    //Removes decimal places from percentage.
                    int cyanPercentage = (int)Math.round(cyanDecPercentage);
                    int magentaPercentage = (int)Math.round(magentaDecPercentage);
                    int yellowPercentage = (int)Math.round(yellowDecPercentage);
                    int blackPercentage = (int)Math.round(blackDecPercentage);

                    //Prints the results.
                    System.out.println("(C: " + cyanPercentage + ", M: " + magentaPercentage + ", Y: " + yellowPercentage + ", K: " + blackPercentage + ")");
                    System.out.println("(" + cyanPercentage + "%, " + magentaPercentage + "%, " + yellowPercentage + "%, " + blackPercentage + "%)");
                }
                
                //Reads user input using the backScanner.
                String backString = backScanner.nextLine();

                //If user input is back, Back, or BACK, returns to beginning of block and allows the user to convert another hex value.
                if (backString.equals("back") || backString.equals("Back") || backString.equals("BACK")) {
                    continue;
                //If the user inputs Enter, quit, close, stop, or exit, the program closes.
                } else if (backString.equals("quit") || backString.equals("close") || backString.equals("stop") || backString.equals("exit")) {
                    System.exit(0);
                //If the user inputs return, the program restarts by breaking the while loop and calling the SecondaryHeader.
                } else if (backString.equals("return")) {
                    break;
                }
            }
        }
        
         //Loads SecondaryHeader if return is entered.       
        SecondaryHeader returns = new SecondaryHeader();
        returns.HeaderSecondary();
    }        
}    