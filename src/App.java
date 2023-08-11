//Imports scanner utility.
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        //Creates scanners.
        Scanner inputDecide = new Scanner(System.in);
        Scanner hexScanner = new Scanner(System.in);
        Scanner redScanner = new Scanner(System.in);
        Scanner blueScanner = new Scanner(System.in);
        Scanner greenScanner = new Scanner(System.in);

        //Prints prompt and activates inputDecide scanner on next line.
        System.out.println("Convert from (hex or RGB):");
        String rgbOrHex = inputDecide.nextLine();
        String whileLoop = "do";
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";

        while (whileLoop == "do") {

            if (rgbOrHex.equals("rgb") || rgbOrHex.equals("RGB") || rgbOrHex.equals("hex") || rgbOrHex.equals("HEX")) {
                break;
            }  

            System.out.println("Invalid input. Please enter" + ANSI_RED + " " + "VALID" + " " + ANSI_RESET + "input or write exit to exit program:");
            rgbOrHex = inputDecide.nextLine();

            if (rgbOrHex.equals("rgb") || rgbOrHex.equals("RGB") || rgbOrHex.equals("hex") || rgbOrHex.equals("HEX")) {
                break;
            }

            if (rgbOrHex.equals("exit")) {
                System.exit(0);
            }
        }

        //Checks whether the user wants to convert from hex or RGB.
        if (rgbOrHex.equals("hex") || rgbOrHex.equals("HEX")) {

            //Prints prompt to enter hex value and activates hexScanner on next line.
            System.out.println("Input hex value:");
            String hexColor = hexScanner.nextLine();

                //Creates string of just the hex value from the last 6 characters of hexColor.
                String rawHexColor = hexColor.substring(hexColor.length() - 6);

                //Takes substrings of rawHexColor and converts them to RGB values.
                int rgbRed = Integer.valueOf(rawHexColor.substring(0,2), 16);
                int rgbBlue = Integer.valueOf(rawHexColor.substring(2,4), 16);
                int rgbGreen = Integer.valueOf(rawHexColor.substring(4,6), 16);

                //Prints the RGB value in parentheses with commas.
                System.out.println("(" + rgbRed + ", " + rgbBlue + ", " + rgbGreen + ")");

                //Press enter key to exit functionality.
                try{System.in.read();}
                catch(Exception e){}

            //Occurs if the user doesn't input hex or HEX.
            } else if (rgbOrHex.equals("rgb") || rgbOrHex.equals("RGB")){

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
                String redAdjusted = "";
                String greenAdjusted = "";
                String blueAdjusted = "";

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
                        greenAdjusted = greenOutput;
                    }
            
                //Prints the hex value prexifed with a hashtag.
                System.out.println("#" + redAdjusted + greenAdjusted + blueAdjusted);
            
                //Press enter key to exit functionality.
                try{System.in.read();}
                catch(Exception e){}
            }
        }
    }