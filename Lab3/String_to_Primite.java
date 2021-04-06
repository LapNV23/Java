package Lab3;

public class String_to_Primite {
    public static void main(String[] args){
        // Chuỗi thành int/byte/short/long
        String inStr = "5566";
        int number = Integer.parseInt(inStr);

        //String to double/float
        String inStr1 = "55.66";
        float aFloat = Float.parseFloat(inStr);
        double aDouble = Double.parseDouble("1.2345");
        aDouble = Double.parseDouble("1.2e-3");

        //String to char
        String msg = "Hello, World";
        char msgChar;
        for (int idx = 0; idx < msg.length(); ++idx) {
            msgChar = msg.charAt(idx);
        }

        //String to boolean
        String boolStr = "true";
        boolean done = Boolean.parseBoolean(boolStr);// done <- true
        boolean valid = Boolean.parseBoolean("false");
    }
}
