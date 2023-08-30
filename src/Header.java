//Color Code Converter v0.0.6-nonfull.
//Created by Shukoloton (https://github.com/Shukoloton/Color-Code-Converter-Java).

//Imports scanner utility.
import java.util.Scanner;

public class Header {
 
    public static void main(String[] args) {

        //Creates scanners.
        Scanner inputDecide = new Scanner(System.in);
        Scanner convertTo = new Scanner(System.in);

        //Header.
        System.out.println("Color Code Converter v0.0.6-nonfull.");
        System.out.println("Created by Shukoloton");

        //Creates strings for colours.
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        
        //Prints prompt and activates inputDecide scanner on next line.
        System.out.println("Convert from (hex, RGB, or CMYK):");
        String rgbhexcmyk = inputDecide.nextLine();
        
        //Infinite while loop.
        while (true) {

            //Infinite while loop breaks if rgbhexcmyk is equal to rgb, RGB, hex, HEX, cmyk, or CMYK.
            if (rgbhexcmyk.equals("rgb") || rgbhexcmyk.equals("RGB") || rgbhexcmyk.equals("hex") || rgbhexcmyk.equals("HEX") || rgbhexcmyk.equals("cmyk") || rgbhexcmyk.equals("CMYK")) {
                break;
            }  

            //If the while loop didn't break before, the program prints a line prompting the user
            //to input hex, rgb, or cmyk once again.
            System.out.println("Invalid input. Please enter" + ANSI_RED + " " + "VALID" + " " + ANSI_RESET + "input or write exit to exit program:");
            System.out.println("Valid inputs: rgb, RGB, hex, HEX, cmyk, CMYK.");
            rgbhexcmyk = inputDecide.nextLine();

            //Infinite while loop breaks if rgbhexcmyk is equal to rgb, RGB, cmyk, CMYK, hex, or HEX.
            if (rgbhexcmyk.equals("rgb") || rgbhexcmyk.equals("RGB") || rgbhexcmyk.equals("hex") || rgbhexcmyk.equals("HEX") || rgbhexcmyk.equals("cmyk") || rgbhexcmyk.equals("CMYK")) {
                break;
            }

            //Infinite while loop breaks if rgbhexcmyk is equal to exit.
            if (rgbhexcmyk.equals("exit")) {
                System.exit(0);
            }
        }

        //Checks whether the user wants to convert from hex.
        if (rgbhexcmyk.equals("hex") || rgbhexcmyk.equals("HEX") ) {

            //Asks to what the user wants to convert.
            System.out.println("Convert to (RGB or CMYK):");
            String convertToString = convertTo.nextLine();

            //Infinite while loop.
            while (true) {

                //Infinite while loop breaks if rgbOrHex is equal to rgb, RGB, hex, or HEX.
                if (convertToString.equals("rgb") || convertToString.equals("RGB") || convertToString.equals("cmyk") || convertToString.equals("CMYK")) {
                    break;
                }  

                //If the while loop didn't break before, the program prints a line prompting the user
                //to input hex or rgb once again.
                System.out.println("Invalid input. Please enter" + ANSI_RED + " " + "VALID" + " " + ANSI_RESET + "input or write exit to exit program:");
                System.out.println("Valid inputs: rgb, RGB, cmyk, CMYK.");
                convertToString = inputDecide.nextLine();

                //Infinite while loop breaks if rgbOrHex is equal to rgb, RGB, hex, or HEX.
                if (convertToString.equals("rgb") || convertToString.equals("RGB") || convertToString.equals("cmyk") || convertToString.equals("CMYK")) {
                    break;
                }

                //Infinite while loop breaks if rgbOrHex is equal to exit.
                if (convertToString.equals("exit")) {
                    System.exit(0);
                }
            }

            //Checks if the user wants to convert to RGB.
            if (convertToString.equals("rgb") || convertToString.equals("RGB")) {

                //Calls the HexToRgb method in the HexToRgb clas.
                HexToRgb hexRgb = new HexToRgb();
                hexRgb.HexToRgb();
            }

            //Checks if the user wants to convert to CMYK.
            if (convertToString.equals("cmyk") || convertToString.equals("CMYK")) {

                HextoCmyk hexCmyk = new HextoCmyk();
                hexCmyk.hexToCmyk();
            }
            
        //Checks whether the user wants to convert from RGB.
        } if (rgbhexcmyk.equals("rgb") || rgbhexcmyk.equals("RGB") ) {

            //Asks to what the user wants to convert.
            System.out.println("Convert to (hex or CMYK):");
            String convertToString = convertTo.nextLine();

            //Infinite while loop.
            while (true) {

                //Infinite while loop breaks if rgbhexcmyk is equal to rgb, RGB, hex, HEX, cmyk, or CMYK.
                if (convertToString.equals("hex") || convertToString.equals("HEX") || convertToString.equals("cmyk") || convertToString.equals("CMYK")) {
                    break;
                }  

                //If the while loop didn't break before, the program prints a line prompting the user
                //to input hex or CMYK once again.
                System.out.println("Invalid input. Please enter" + ANSI_RED + " " + "VALID" + " " + ANSI_RESET + "input or write exit to exit program:");
                System.out.println("Valid inputs: hex, HEX, cmyk, CMYK.");
                convertToString = inputDecide.nextLine();

                //Infinite while loop breaks if rgbhexcmyk is equal to rgb, RGB, hex, HEX, cmyk, or CMYK.
                if (convertToString.equals("hex") || convertToString.equals("HEX") || convertToString.equals("cmyk") || convertToString.equals("CMYK")) {
                    break;
                }

                //Infinite while loop breaks if rgbhexcmyk is equal to exit.
                if (convertToString.equals("exit")) {
                    System.exit(0);
                }
            }

            //CHecks whether the user wants to convert to hex.
            if (convertToString.equals("hex") || convertToString.equals("HEX")) {

                //Calls the HexToRgb method in the HexToRgb clas.
                RgbToHex rgbHex = new RgbToHex();
                rgbHex.RgbToHex();
            }

            //CHecks whether the user wants to convert to CMYK.
            if (convertToString.equals("cmyk") || convertToString.equals("CMYK")) {

                //Calls the rgbToCmyk method in the RgbToCmyk clas.
                RgbtoCmyk rgbCmyk = new RgbtoCmyk();
                rgbCmyk.rgbToCmyk();
            }
            
        //Checks whether the user wants to convert from CMYK.
        } if (rgbhexcmyk.equals("cmyk") || rgbhexcmyk.equals("CMYK") ) {

            //Asks to what the user wants to convert.
            System.out.println("Convert to (hex or RGB):");
            String convertToString = convertTo.nextLine();

            while (true) {

                //Infinite while loop breaks if rgbhexcmyk is equal to rgb, RGB, hex, or HEX.
                if (convertToString.equals("hex") || convertToString.equals("HEX") || convertToString.equals("rgb") || convertToString.equals("RGB")) {
                    break;
                }  

                //If the while loop didn't break before, the program prints a line prompting the user
                //to input hex or rgb once again.
                System.out.println("Invalid input. Please enter" + ANSI_RED + " " + "VALID" + " " + ANSI_RESET + "input or write exit to exit program:");
                System.out.println("Valid inputs: hex, HEX, rgb, RGB.");
                convertToString = inputDecide.nextLine();

                //Infinite while loop breaks if rgbhexcmyk is equal to rgb, RGB, hex, or HEX.
                if (convertToString.equals("hex") || convertToString.equals("HEX") || convertToString.equals("rgb") || convertToString.equals("RGB")) {
                    break;
                }

                //Infinite while loop breaks if rgbhexcmyk is equal to exit.
                if (convertToString.equals("exit")) {
                    System.exit(0);
                }
            }

            //Checks whether the user wants to convert to hex.
            if (convertToString.equals("hex") || convertToString.equals("HEX")) {

                //Calls the cmykToHex method in the CmyktoHex clas.
                CmyktoHex cmykHex = new CmyktoHex();
                cmykHex.cmykToHex();
            }

            //Checks whether the user wants to convert to rgb
            if (convertToString.equals("rgb") || convertToString.equals("RGB")) {

                //Calls the cmykToRgb method in the Cmyktorgb class.
                CmyktoRgb cmykRgb = new CmyktoRgb();
                cmykRgb.cmykToRgb();
            }
        }
    }
}