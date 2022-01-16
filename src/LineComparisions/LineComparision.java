package LineComparisions;

import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double length;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first line point coordinate x1");
        x1 = scan.nextInt();
        System.out.println("Enter first line point coordinate y1");
        y1 = scan.nextInt();
        System.out.println("Enter second line point coordinate x2");
        x2 = scan.nextInt();
        System.out.println("Enter second line point coordinate y2");
        y2 = scan.nextInt();
        scan.close();
        length = (Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))));
        System.out.println("Length of line: " + length);
    }
}

