package giftView;

import giftController.giftController;

import java.util.Scanner;

public class giftShop {
    public static void main(String[] args) {
        System.out.println("Welcome to E-GiftShop!!!");
        System.out.println("============================================================");
        menuVisit();
    }

    public static void menuVisit(){
        Scanner scanner = new Scanner(System.in);
        int chon;
        System.out.println("1. Display gift in store.");
        System.out.println("2. Insert new gift in GiftList.");
        System.out.println("3. Delete gift for GiftList.");
        System.out.println("4. Exit");
        do {
            System.out.println("Your choice:");
            chon = Integer.parseInt(scanner.nextLine());
            switch (chon){
                case 1:
                    giftController giftctrl = new giftController();
                    giftctrl.displayGift();
                    break;
                case 2:
                    giftController giftctrl2 = new giftController();
                    giftctrl2.addGift();
                    break;
                case 3:
                    giftController giftctrl3 = new giftController();
                    giftctrl3.deleteGf();
                    break;
            }
        }while (chon!=4);
    }
}
