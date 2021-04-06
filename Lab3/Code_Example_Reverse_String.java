package Lab3;

import java.util.Scanner;

public class Code_Example_Reverse_String {
    public static void main(String[] args) {
        //Declare variables
        String inStr;
        int inStrLen ;
        Scanner in = new Scanner(System.in);

        //Prompt and read input as "String"
        System.out.print("Enter a string:");
        inStr = in.next();
        inStrLen = inStr.length();

        System.out.print("The reverse is: ");
        //Use a for-loop to extract each char in reverse order
        for (int inCharIdx = inStrLen - 1; inCharIdx >= 0; --inCharIdx) {
            System.out.print(inStr.charAt(inCharIdx));
        }
        System.out.println();
        in.close();
    }
}
