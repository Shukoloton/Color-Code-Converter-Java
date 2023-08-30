//Color Code Converter v0.0.6-nonfull.
//Created by Shukoloton (https://github.com/Shukoloton/Color-Code-Converter-Java).
//Formula for RGB calculation based on https://www.rapidtables.com/convert/color/cmyk-to-rgb.html.

import java.util.Scanner;
import java.math.*;

public class CmyktoRgb {

    public void cmykToRgb() {

        //Creates scanners.
        Scanner cyanScanner = new Scanner(System.in);
        Scanner magentaScanner = new Scanner(System.in);
        Scanner yellowScanner = new Scanner(System.in);
        Scanner blackScanner = new Scanner(System.in);
        Scanner backScanner = new Scanner(System.in);

        while (true) {

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

            System.out.println("(" + redFinal + ", " + greenFinal + ", " + blueFinal + ")");

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