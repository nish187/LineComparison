import java.util.Scanner;

public class LineComUC3 {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparision");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter points of x1");
        int x1 = scanner.nextInt();
        System.out.println("Enter points of y1");
        int y1 = scanner.nextInt();
        System.out.println("Enter points of x2");
        int x2 = scanner.nextInt();
        System.out.println("Enter poits of y2");
        int y2 = scanner.nextInt();
        Double length1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length of first line: " + length1);

        System.out.println("Enter points of x3");
        int x3 = scanner.nextInt();
        System.out.println("Enter points of y3");
        int y3 = scanner.nextInt();
        System.out.println("Enter points of x4");
        int x4 = scanner.nextInt();
        System.out.println("Enter points of y4");
        int y4 = scanner.nextInt();
        Double length2 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println("Length of second line: " + length2);


        int result = length1.compareTo(length2);
        if (result == 0) {
            System.out.println("Lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 2 greater than Line1");
        }
    }
}