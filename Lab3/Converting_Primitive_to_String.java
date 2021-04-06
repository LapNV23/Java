package Lab3;

public class Converting_Primitive_to_String {
    public static void main(String[] args) {
        //Using String concatenation operator '+' with an empty String
        String str1 = 123 + "";//int
        String str2 = 12.34 + "";//double
        String str3 = 'c' + "";//char
        String str4 = true + "";//boolean true

        //Using String.valueOf
        String str5 = String.valueOf(12345);
        String str6 = String.valueOf(true);
        String str7 = String.valueOf(55.66);

        //Using toString() for each primitive type
        String str8 = Integer.toString(1234);
        String str9 = Double.toString(1.23);
        String str10 = Character.toString('z');
    }
}
