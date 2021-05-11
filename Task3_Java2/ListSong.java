package Task3_Java2;

import java.util.ArrayList;

/**
 * @author Nguyem Van Lap
 */
public class ListSong {
    private String mySinger;
    private ArrayList<Song> mySong;

    public boolean addNewSong(Song song){
        if (findSong(song.getName()) >= 0){
            System.out.println("Song is already on file.");
            return false;
        }
        mySong.add(song);
        return true;
    }

    public ListSong(String mySinger){
        this.mySinger = mySinger;
        this.mySong = new ArrayList<Song>();
    }

    public boolean updateSong(Song oldSong, Song newSong){
        int foundPosition = findSong(oldSong);
        if (foundPosition < 0){
            System.out.println(oldSong.getName() + ", was not found.");
            return false;
        }
        this.mySong.set(foundPosition, newSong);
        System.out.println(oldSong.getName() + ", was replaced with " + newSong.getName());
        return true;
    }
    public boolean removeSong(Song song){
        int foundPosition = findSong(song);
        if(foundPosition < 0){
            System.out.println(song.getName() + ", was not found,");
            return false;
        }
        this.mySong.remove(foundPosition);
        System.out.println(song.getName() + ", was deleted.");
        return true;
    }

    private int findSong(Song song){ return this.mySong.indexOf(song); }
    private int findSong(String songName){
        for (int i = 0; i < this.mySong.size(); i++){
            Song song = this.mySong.get(i);
            if(song.getName().equals(songName)) {
                return i;
            }
        }
        return -1;
    }

    public String querySong(Song song){
        if (findSong(song) >= 0){
            return song.getName();
        }
        return null;
    }
    public Song querySong(String name){
        int position = findSong(name);
        if (position >= 0){
            return this.mySong.get(position);
        }
        return null;
    }
    public void printSong(){
        System.out.println("List song " + mySong);
        for (int i = 0; i < this.mySong.size(); i++){
            System.out.println((i + 1) + "." +
                    this.mySong.get(i).getName() + " -> " +
                    this.mySong.get(i).getSinger());
        }
    }
}
