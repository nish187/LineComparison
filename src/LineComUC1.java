import java.util.Scanner;

    public class LineComUC1 {
        public static void main(String[] args) {
            System.out.println("Welcome to LineComparision");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter points of x1");
            int x1 = scanner.nextInt();
            System.out.println("Enter points of y1");
            int y1 = scanner.nextInt();
            System.out.println("Enter points of x2");
            int x2 = scanner.nextInt();
            System.out.println("Enter poits of y2");
            int y2 = scanner.nextInt();
            double length = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
            System.out.println("Length of line between two points: " + length);
        }
    }

