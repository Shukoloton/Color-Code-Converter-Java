//Color Code Converter v0.0.4_1-nonfull.
//Created by Shukoloton (https://github.com/Shukoloton/Color-Code-Converter-Java).

//Imports scanner utility.
import java.util.Scanner;

public class HexToRgb {

    public void HexToRgb() {

        Scanner hexScanner = new Scanner(System.in);
        Scanner backScanner = new Scanner(System.in);

        //While loop that serves to facilitate the back function.
        while (true) {
                    
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

                //Reads usert input using backScanner.
                String backString = backScanner.nextLine();
                        

                    //If user input is back, Back, or BACK, returns to beginning of block and allows the user to convert another hex value.
                    if (backString.equals("back") || backString.equals("Back") || backString.equals("BACK")) {
                        continue;
                            
                    //If the user inputs Enter, quit, close, stop, or exit, the program closes.
                    } else if (backString.equals("") || backString.equals("quit") || backString.equals("close") || backString.equals("stop") || backString.equals("exit")) {
                        System.exit(0);
                    }
        }
    }
}