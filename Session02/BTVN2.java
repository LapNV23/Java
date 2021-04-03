package Session02;

import java.util.Scanner;

public class BTVN2 {
    public static void main(String[] args) {
        // Declaring the variables
        int i, j, k;

        System.out.printf("Enter no. of row:\n ");
        Scanner scan = new Scanner(System.in);
        i = scan.nextInt();
        for(j = 1; j <= i; j++)
            {
                System.out.printf("\n");
                for (k =1; k <= j; k++) //Vòng lặp trong
                    {
                        System.out.printf("*");
                    }
            }
    }
}
