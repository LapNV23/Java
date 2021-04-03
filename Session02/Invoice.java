package Session02;

import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        // Declaring the variables
        int Shirts, Trousers, Discount,Total, TotalDis, Net_Total, Points_Earned;
        int QuantityS, QuantityT;
        int TotalS, TotalT;
        int PriceShirts = 300, PriceTrousers = 700;

        System.out.println("Enter the number of Shirts to order:\n");
        Scanner scan = new Scanner(System.in);
        QuantityS = scan.nextInt();
        System.out.println("Enter the number of Trousers to order:\n");
        QuantityT = scan.nextInt();
        TotalS = QuantityS * PriceShirts;
        TotalT = QuantityT * PriceTrousers;
        Total = TotalS + TotalT;

        System.out.println("\nItem       Quantity    Price    Total");
        System.out.println("----------------------------------------------------");
        System.out.printf("Shirts      %d          %d       %d\n", QuantityS, PriceShirts, TotalS);
        System.out.printf("Trousers    %d          %d       %d\n", QuantityT, PriceTrousers, TotalT);

        if (Total >= 3000)
            {
                TotalDis = Total / 10;
                System.out.printf("Discount                         %d.00\n", TotalDis);
                System.out.println("----------------------------------------------------");
                Net_Total = Total - TotalDis;
                System.out.printf("Net_Total                        %d.00\n", Net_Total);
                System.out.println("----------------------------------------------------");
                if (Net_Total >= 3000)
                    {
                        Points_Earned = Net_Total / 100;
                        System.out.printf("Points Earned    %d\n", Points_Earned);
                        System.out.println("Thank you!\n");
                    }
                else
                    {
                        System.out.println("Thank you!\n");
                    }
            }
        else
            {
                TotalDis = Total / 15;
                System.out.printf("Discount                         %d.00\n", TotalDis);
                System.out.println("----------------------------------------------------");
                Net_Total = Total - TotalDis;
                System.out.printf("Net_Total                        %d.00\n", Net_Total);
                System.out.println("----------------------------------------------------");
                if (Net_Total >= 3000)
                {
                    Points_Earned = Net_Total / 100;
                    System.out.printf("Points Earned    %d\n", Points_Earned);
                    System.out.println("Thank you!\n");
                }
                else
                {
                    System.out.println("Thank you!\n");
                }
            }
    }
}
