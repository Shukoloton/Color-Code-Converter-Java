public class App {
    public static void main(String[] args) {

        //Creates string hexColor from console input and checks whether it starts with a hashtag or a 0x. 
        //Subsequently writes the latter into 2 booleans.
        String hexColor = System.console().readLine();
        Boolean hashtagstart = hexColor.startsWith("#");
        Boolean zeroxstart = hexColor.startsWith("0x");

        //If statement to check whether the string starts with a hashtag.
        if (hashtagstart == true) {

            //Checks substrings in hexColor string. The indeces are determined by whether there is a prefix and what is it. 
            //In this case, we have an extra character (#), so we begin at beginIndex:1 and end at endIndex:3, etc.
            int RgbRed = Integer.valueOf(hexColor.substring(1,3), 16);
            int RgbBlue = Integer.valueOf(hexColor.substring(3,5), 16);
            int RgbGreen = Integer.valueOf(hexColor.substring(5,7), 16);

                //Prints the result.
                System.out.println("(" + RgbRed + ", " + RgbBlue + ", " + RgbGreen + ")");

        //Else if statement to check whether the string starts with a 0x.
        } else if (zeroxstart == true) {

            //Checks substrings in hexColor string. The indeces are determined by whether there is a prefix and what is it. 
            //In this case, we have 2 extra characters (0x), so we begin at beginIndex:2 and end at endIndex:4, etc.
            int RgbRed = Integer.valueOf(hexColor.substring(2,4), 16);
            int RgbBlue = Integer.valueOf(hexColor.substring(4,6), 16);
            int RgbGreen = Integer.valueOf(hexColor.substring(6,8), 16);
               
                //Prints the result.
                System.out.println("(" + RgbRed + ", " + RgbBlue + ", " + RgbGreen + ")");

        //Occurs in case of lack of prefix.
        } else {

            //Checks substrings in hexColor string. The indeces are determined by whether there is a prefix and what is it. 
            //In this case, we don't have extra characters, so we begin at beginIndex:0 and end at endIndex:2, etc.
            int RgbRed = Integer.valueOf(hexColor.substring(0,2), 16);
            int RgbBlue = Integer.valueOf(hexColor.substring(2,4), 16);
            int RgbGreen = Integer.valueOf(hexColor.substring(4,6), 16);
                
                
                //Prints the result.
                System.out.println("(" + RgbRed + ", " + RgbBlue + ", " + RgbGreen + ")");

        }
    }
}