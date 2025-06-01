import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of pattern to be printed");
        int number= scanner.nextInt();
        for(int i=number; i>1;i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.println("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
