package Lab3;

public class VD1 {
    public static void main(String[] args) {
        char c1 ='0'; // Code number 48
        char c2 = 'A'; // Code number 65
        char c3;

        //char <-> int (interchangeable)

        System.out.println((int)c1); //Print int 48
        System.out.println((int)c2); //Print int 65
        c3 = 97; //Code number for 'a'
        System.out.println(c3); //Print char 'a
        System.out.println((char)97);

        // char + char -> int + int -> int
        //c3 = c1 + c2;
        c3 = (char)(c1 + c2);
        System.out.println(c3);
        System.out.println(c1 + c2);
        System.out.println((char)(c1 + c2));

        //char + int -> int + int -> int
        //c3 = c1 + 5;
        c3 = (char)(c1 + 5);
        System.out.println(c3);
        System.out.println(c1 + 5);

        //Print the code number for 'a' to 'z'
        for (int codeNum = 'a'; codeNum <= 'z'; ++codeNum){
            System.out.println((char)codeNum + "; ");
        }
    }
}
