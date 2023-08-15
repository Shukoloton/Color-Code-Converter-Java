//Color Code Converter v0.0.4_1-nonfull.
//Created by Shukoloton (https://github.com/Shukoloton/Color-Code-Converter-Java).

//Imports scanner utility.
import java.util.Scanner;

public class Header {
 
    public static void main(String[] args) {

        //Creates inputDecide scanner.
        Scanner inputDecide = new Scanner(System.in);

        //Header.
        System.out.println("Color Code Converter v0.0.4_1-nonfull.");
        System.out.println("Created by Shukoloton");

        //Creates strings for colours.
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        
        //Prints prompt and activates inputDecide scanner on next line.
        System.out.println("Convert from (hex or RGB):");
        String rgbOrHex = inputDecide.nextLine();
        
        //Infinite while loop.
        while (true) {

            //Infinite while loop breaks if rgbOrHex is equal to rgb, RGB, hex, or HEX.
            if (rgbOrHex.equals("rgb") || rgbOrHex.equals("RGB") || rgbOrHex.equals("hex") || rgbOrHex.equals("HEX")) {
                break;
            }  

            //If the while loop didn't break before, the program prints a line prompting the user
            //to input hex or rgb once again.
            System.out.println("Invalid input. Please enter" + ANSI_RED + " " + "VALID" + " " + ANSI_RESET + "input or write exit to exit program:");
            System.out.println("Valid inputs: rgb, RGB, hex, HEX.");
            rgbOrHex = inputDecide.nextLine();

            //Infinite while loop breaks if rgbOrHex is equal to rgb, RGB, hex, or HEX.
            if (rgbOrHex.equals("rgb") || rgbOrHex.equals("RGB") || rgbOrHex.equals("hex") || rgbOrHex.equals("HEX")) {
                break;
            }

            //Infinite while loop breaks if rgbOrHex is equal to exit.
            if (rgbOrHex.equals("exit")) {
                System.exit(0);
            }
        }

        //Checks whether the user wants to convert from hex or RGB.
        if (rgbOrHex.equals("hex") || rgbOrHex.equals("HEX")) {

            //Calls the HexToRgb method in the HexToRgb clas.
            HexToRgb hexRgb = new HexToRgb();
            hexRgb.HexToRgb();
            
        //Checks whether the user wants to convert from hex or RGB.
        } if (rgbOrHex.equals("rgb") || rgbOrHex.equals("RGB")) {

            //Calls the RgbToHex method in the RgbToHex clas.
            RgbToHex rgbHex = new RgbToHex();
            rgbHex.RgbToHex();
        }
    }
}