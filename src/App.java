public class App {
    public static void main(String[] args) {

        String hexColor = System.console().readLine();
        Boolean hashtagstart = hexColor.startsWith("#");
        Boolean zeroxstart = hexColor.startsWith("0x");

        if (hashtagstart == true) {
            int RgbRed = Integer.valueOf(hexColor.substring(1,3), 16);
            int RgbBlue = Integer.valueOf(hexColor.substring(3,5), 16);
            int RgbGreen = Integer.valueOf(hexColor.substring(5,7), 16);

                System.out.println("(" + RgbRed + ", " + RgbBlue + ", " + RgbGreen + ")");

        } else if (zeroxstart == true) {
            int RgbRed = Integer.valueOf(hexColor.substring(2,4), 16);
            int RgbBlue = Integer.valueOf(hexColor.substring(4,6), 16);
            int RgbGreen = Integer.valueOf(hexColor.substring(6,8), 16);
               
                System.out.println("(" + RgbRed + ", " + RgbBlue + ", " + RgbGreen + ")");

        } else {
            int RgbRed = Integer.valueOf(hexColor.substring(0,2), 16);
            int RgbBlue = Integer.valueOf(hexColor.substring(2,4), 16);
            int RgbGreen = Integer.valueOf(hexColor.substring(4,6), 16);
                
                System.out.println("(" + RgbRed + ", " + RgbBlue + ", " + RgbGreen + ")");

        }
    }
}