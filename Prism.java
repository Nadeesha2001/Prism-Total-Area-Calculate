import java.util.Scanner;

class Prism {

    public static void main(String[] args) {

        Scanner Values = new Scanner(System.in);

        // Triangle

        System.out.println("Enier Triangle Stand Lenght");
        Double sl = Values.nextDouble();

        System.out.println("Enter Triangle Direct high");
        Double dh = Values.nextDouble();

        Double A1 = (sl * dh) / 2;
        System.out.println("Your Triangle Area is" + " " + A1);

        // 1st Rectangle

        System.out.println("Enter 1st Rectangle Lenght");
        Double L1 = Values.nextDouble();

        System.out.println("Enter 1st Rectangle Width");
        Double W1 = Values.nextDouble();

        Double A2 = L1 * W1;
        System.out.println("Your 1st Rectangle Area is" + " " + A2);

        // 2nd Rectangle

        System.out.println("Enter 2nd Rectangle Length");
        Double L2 = Values.nextDouble();

        System.out.println("Enter 2nd Rectangle Width");
        Double W2 = Values.nextDouble();

        Double A3 = L2 * W2;
        System.out.println("Your 2nd Rectangle Area is" + " " + A3);

        // 3rd Rectangle

        System.out.println("Enter 3rd Rectangle Length");
        Double L3 = Values.nextDouble();

        System.out.println("Enter 3rd Rectangle Width");
        Double W3 = Values.nextDouble();

        Double A4 = L3 * W3;
        System.out.println("Your 3rd Rectangle Area is" + " " + A4);

        Double Area = (2 * A1) + A2 + A3 + A4;
        System.out.println("Your Prism Area is" + " " + Area);

    }
}
