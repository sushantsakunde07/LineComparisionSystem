package LineComparisions;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double x3 = 0;
        double x4 = 0;
        double y3 = 0;
        double y4 = 0;
        double length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first point coordinate x1");
        x1 = scan.nextInt();
        System.out.println("Enter first point coordinate y1");
        y1 = scan.nextInt();
        System.out.println("Enter second point coordinate x2");
        x2 = scan.nextInt();
        System.out.println("Enter second point coordinate y2");
        y2 = scan.nextInt();
        System.out.println("Enter third point coordinate x3");
        x3 = scan.nextInt();
        System.out.println("Enter third point coordinate y3");
        y3 = scan.nextInt();
        System.out.println("Enter fourth point coordinate x4");
        x4 = scan.nextInt();
        System.out.println("Enter fourth point coordinate y4");
        y4 = scan.nextInt();
        scan.close();
        Double length1 = (Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
        Double length2 = (Math.sqrt(Math.pow(x4 - x3, 2) + (Math.pow(y4 - y3, 2))));
        double retVal = length1.compareTo(length2);
        if (retVal > 0) {
            System.out.println("length of first line is greater than second");
        } else if (retVal < 0) {
            System.out.println("length of first line is less than second");
        } else {
            System.out.println("length of first line is equal to second");
        }
    }
}