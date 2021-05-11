package Task3_Java2;

import Task2_Java2.Contact;

import java.util.Scanner;

/**
 * @author Nguyen Van Lap
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ListSong listSong = new ListSong("Sơn Tùng M-TP");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    listSong.printSong();
                    break;
                case 2:
                    addNewSong();
                    break;
                case 3:
                    updateSong();
                    break;
                case 4:
                    removeSong();
                    break;
                case 5:
                    querySong();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void addNewSong(){
        System.out.println("Enter new Song name: ");
        String name = scanner.nextLine();
        System.out.println("Enter singer: ");
        String singer = scanner.nextLine();
        Song newSong = Song.createSong(name, singer);
        if (listSong.addNewSong(newSong)){
            System.out.println("New song added: name = " + name +
                    ", singer = " + singer);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }
    private static void updateSong(){
        System.out.println("Enter existing song name: ");
        String name = scanner.nextLine();
        Song existingSongRecord = listSong.querySong(name);
        if (existingSongRecord == null){
            System.out.println("Song noy found.");
            return;
        }
        System.out.println("Enter new song name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new song name: ");
        String newSinger = scanner.nextLine();
        Song newSong = Song.createSong(newName, newSinger);
        if (listSong.updateSong(existingSongRecord, newSong)){
            System.out.println("Successfully updated record");
        } else{
            System.out.println("Error updating record.");
        }
    }
    private static void removeSong(){
        System.out.println("Enter existing song name: ");
        String name = scanner.nextLine();
        Song existingSongRecord = listSong.querySong(name);
        if (existingSongRecord == null){
            System.out.println("Song not found:");
            return;
        }
        if (listSong.removeSong(existingSongRecord)){
            System.out.println("Successfully deleted");
        } else{
            System.out.println("Error deleting contact");
        }
    }
    private static void querySong(){
        System.out.println("Enter existing song name: ");
        String name = scanner.nextLine();
        Song existingSongRecord = listSong.querySong(name);
        if (existingSongRecord == null){
            System.out.println("Song not found.");
            return;
        }
        System.out.println("Name: " + existingSongRecord.getName()
                + "singer is " + existingSongRecord.getSinger());
    }
    private static void startPhone(){
        System.out.println("Starting...");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n"
                + "1 - to print song\n"
                + "2 - to add a new song\n"
                + "3 - to update existing an existing song\n"
                + "4 - to remove an existing song\n"
                + "5 - query if an existing song exists"
                + "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
