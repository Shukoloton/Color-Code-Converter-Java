//Color Code Converter v0.0.5-nonfull.
//Created by Shukoloton (https://github.com/Shukoloton/Color-Code-Converter-Java).

//Imports scanner utility.
import java.util.Scanner;

public class RgbToHex {
    
    public void RgbToHex() {

        //Creates scanners.
        Scanner redScanner = new Scanner(System.in);
        Scanner blueScanner = new Scanner(System.in);
        Scanner greenScanner = new Scanner(System.in);
        Scanner backScanner = new Scanner(System.in);

        //While loop that serves to facilitate the back function.
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

            //Converts from decimal to hexadecimal.
            String redOutput = Integer.toHexString(redInput);
            String greenOutput = Integer.toHexString(greenInput);
            String blueOutput = Integer.toHexString(blueInput);
                
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

        SecondaryHeader returns = new SecondaryHeader();
        returns.HeaderSecondary();
    }
}
