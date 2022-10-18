import java.util.Scanner;
public class LinearEquationRunner {
    public static void main (String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String coor1 = scan.nextLine();
        String x1 = coor1.substring(1,coor1.indexOf(","));
        String y1 = coor1.substring(coor1.indexOf(" ") + 1,coor1.length() - 1);

        System.out.println("Enter coordinate 2: ");
        String coor2 = scan.nextLine();
        String x2 = coor2.substring(1,coor2.indexOf(","));
        String y2 = coor2.substring(coor2.indexOf(" ") + 1,coor2.length() - 1);

        System.out.println("Enter a value for x: ");
        int x3 = scan.nextInt();
        scan.nextLine();

     /*   LinearEquation test = new LinearEquation(-1,5,3,10);
        System.out.println(test.distance());
        System.out.println(test.slope());
        System.out.println(test.yIntercept()); */

    }
}
