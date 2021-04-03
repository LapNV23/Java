package Session02;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        // Declaring the variables
        int MathsLap, ScienceLap, EnglishLap;
        int MathsA, ScienceA, EnglishA;
        int TongLap, TongA;
        int PercentageLap, PercentageA;

        System.out.println("Maths of Lap:");
        Scanner scan = new Scanner(System.in);
        MathsLap = scan.nextInt();
        System.out.println("Science of Lap:\n");
        ScienceLap = scan.nextInt();
        System.out.println("English of Lap:\n");
        EnglishLap = scan.nextInt();

        System.out.println("Maths of A:\n");
        MathsA = scan.nextInt();
        System.out.println("Science of A:\n");
        ScienceA = scan.nextInt();
        System.out.println("English of A:\n");
        EnglishA = scan.nextInt();

        System.out.println("Marks of Lap:");
        System.out.printf("Maths = %d\n", MathsLap);
        System.out.printf("Science = %d\n", ScienceLap);
        System.out.printf("English = %d\n\n", EnglishLap);

        System.out.println("Marks of A:\n");
        System.out.printf("Maths = %d\n", MathsA);
        System.out.printf("Science = %d\n", ScienceA);
        System.out.printf("English = %d\n\n", EnglishA);

        TongLap = MathsLap + ScienceLap + EnglishLap;
        System.out.printf("Tong diem cua Lap la: %d\n", TongLap);
        PercentageLap = TongLap / 3;
        System.out.printf("Percentage = %d" , PercentageLap);
        System.out.println("%\n\n");

        TongA = MathsA + ScienceA + EnglishA;
        System.out.printf("Tong diem cua A la: %d\n", TongA);
        PercentageA = TongA / 3;
        System.out.printf("Percentage = %d" , PercentageA);
        System.out.println("%\n\n");

        //  Học bổng
        /* Tự test
        if (PercentageLap >= 75)
            {
                System.out.println("Scholarship Amount for Lap = $20000");
            }
        */
        // Bài của cô
        System.out.print("\nIs Lap percentage lesser than A?\n");
        System.out.println(PercentageLap < PercentageA ? "Yes" : "No");

        System.out.print("\nIs Lap percentage greater than A?\n");
        System.out.println(PercentageLap > PercentageA ? "Yes" : "No");

        System.out.print("\nIs Lap and A percentage are equal?\n");
        System.out.println(PercentageLap == PercentageA ? "Yes" : "No");

        System.out.print("\n Scholarship Amount for Lap = $");
        System.out.println(PercentageLap > 75 ? 20000 : (PercentageLap >= 60 && PercentageLap <= 75) ? 1000 : 0);
        System.out.print("\n Scholarship Amount for A = $");
        System.out.println(PercentageA > 75 ? 20000 : (PercentageA >= 60 && PercentageA <= 75) ? 1000 : 0);
    }
}
