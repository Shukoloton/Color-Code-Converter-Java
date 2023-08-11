public class App {
    public static void main(String[] args) {

        //Prints prompt to enter value, reads next line and puts next line into hexColor string.
        System.out.println("Input hex value:");
        String hexColor = System.console().readLine();

        //Creates string rawHexColor from last six characters of string hexColor.
        String rawHexColor = hexColor.substring(hexColor.length() - 6);

        //Takes values of parts of rawHexColor and converts them from hexadecimal to decimal.
        int rgbRed = Integer.valueOf(rawHexColor.substring(0,2), 16);
        int rgbBlue = Integer.valueOf(rawHexColor.substring(2,4), 16);
        int rgbGreen = Integer.valueOf(rawHexColor.substring(4,6), 16);

        //Writes decimal RGB values with parentheses and commas.
        System.out.println("(" + rgbRed + ", " + rgbBlue + ", " + rgbGreen + ")");

        //Press enter to exit functionality.
        try{System.in.read();}
        catch(Exception e){}

    }
}