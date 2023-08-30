//Color Code Converter v0.0.6-nonfull.
//Created by Shukoloton (https://github.com/Shukoloton/Color-Code-Converter-Java).
//Formula for RGB calculation based on https://www.rapidtables.com/convert/color/cmyk-to-rgb.html.

import java.util.Scanner;
import java.math.*;

public class CmyktoHex {
    public void cmykToHex() {

        //Creates scanners.
        Scanner cyanScanner = new Scanner(System.in);
        Scanner magentaScanner = new Scanner(System.in);
        Scanner yellowScanner = new Scanner(System.in);
        Scanner blackScanner = new Scanner(System.in);
        Scanner backScanner = new Scanner(System.in);

        while(true) {

            //Asks for cyan value and activates cyanScanner on next line (integer).
            System.out.println("Input C (cyan) value:");
            double cyanInput = cyanScanner.nextInt();

            //Asks for magenta value and activates magentaScanner on next line (integer).
            System.out.println("Input M (magenta) value:");
            double magentaInput = magentaScanner.nextInt();

            //Asks for yellow value and activates yellowScanner on next line (integer).
            System.out.println("Input Y (yellow) value:");
            double yellowInput = yellowScanner.nextInt();

            //Asks for K (key) value and activates blackScanner on next line (integer).
            System.out.println("Input K (key, black) value:");
            double blackInput = blackScanner.nextInt();

            double cyanDecimal = cyanInput/100;
            double magentaDecimal = magentaInput/100;
            double yellowDecimal = yellowInput/100;
            double blackDecimal = blackInput/100;
        
            double redValue = 255 * (1 - cyanDecimal) * (1 - blackDecimal);
            double greenValue = 255 * (1 - magentaDecimal) * (1 - blackDecimal);
            double blueValue = 255 * (1 - yellowDecimal) * (1 - blackDecimal);

            int redFinal = (int)Math.round(redValue);
            int greenFinal = (int)Math.round(greenValue);
            int blueFinal = (int)Math.round(blueValue);

            //Converts from decimal to hexadecimal.
            String redOutput = Integer.toHexString(redFinal);
            String greenOutput = Integer.toHexString(greenFinal);
            String blueOutput = Integer.toHexString(blueFinal);
            
            //Takes length of hexadecimal strings.
            Integer redLength = redOutput.length();
            Integer greenLength = greenOutput.length();
            Integer blueLength = blueOutput.length();

            //Creates adjusted variables
            String redAdjusted;
            String greenAdjusted;
            String blueAdjusted;

                //Checks whether the length of redOutput is equal to zero.
                //If yes, adds a leading zero to the code. If not, proceeds.
                if (redLength == 1) {
                    redAdjusted = "0" + redOutput;
                } else {
                    redAdjusted = redOutput;
                }
            
                //Checks whether the length of greenOutput is equal to zero.
                //If yes, adds a leading zero to the code. If not, proceeds.
                if (greenLength == 1) {
                    greenAdjusted = "0" + greenOutput;
                } else {
                    greenAdjusted = greenOutput;
                }
            
                //Checks whether the length of blueOutput is equal to zero.
                //If yes, adds a leading zero to the code. If not, proceeds.
                if (blueLength == 1) {
                    blueAdjusted = "0" + blueOutput;
                } else {
                    blueAdjusted = blueOutput;
                }
        
            //Prints the hex value prexifed with a hashtag.
            System.out.println("#" + redAdjusted + greenAdjusted + blueAdjusted);

            //Reads usert input using backScanner.
            String backString = backScanner.nextLine();
                        
            //If user input is back, Back, or BACK, returns to beginning of block and allows the user to convert another hex value.
            if (backString.equals("back") || backString.equals("Back") || backString.equals("BACK")) {
                continue;       
            //If the user inputs quit, close, stop, or exit, the program closes.
            } else if (backString.equals("quit") || backString.equals("close") || backString.equals("stop") || backString.equals("exit")) {
                System.exit(0);
            //If the user inputs return, the program restarts by breaking the while loop and calling the SecondaryHeader.
            } else if (backString.equals("return")) {
                break;
            }
        }

        //Loads SecondaryHeader if return is entered.
        SecondaryHeader returns = new SecondaryHeader();
        returns.HeaderSecondary();
    }
}