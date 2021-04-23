package Session01;
import javax.swing.plaf.synth.SynthTabbedPaneUI;
import javax.swing.text.Style;
import java.util.Scanner;
public class Tb {
    public static void main(String[] args) {
        // Declaring the variables
        double match;
        double physical;
        double chemical;
        double tbcong;

        System.out.println("Enter grades match:");
        Scanner scan = new Scanner(System.in);
        match = scan.nextDouble();
        System.out.println("Enter grades physical:");
        physical = scan.nextDouble();
        System.out.println("Enter grades chemical:");
        chemical = scan.nextDouble();
        tbcong = (match+physical+chemical)/3;
        if (tbcong >= 8){
            System.out.println("Bạn loai gioi.");
        }
        else (tbcong >= 5) ; {
            System.out.println("Bạn loai tb");
        }
        else (tbcong >=3) {
            System.out.println("Bạn bỏ học ik");
        }

        System.out.println("");
    }
}
