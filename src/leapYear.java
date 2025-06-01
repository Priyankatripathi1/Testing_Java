import java.util.Scanner;

public class leapYear {
    public static void main (String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the year");
        int year= scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        {
            System.out.println("Leap Year");
        }
        else
        System.out.println("Not A Leap Year");
        scanner.close();
    }
}
