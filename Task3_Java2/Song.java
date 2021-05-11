package Task3_Java2;

public class Song {
    private String name, singer;

    public Song(String name, String singer) {
        this.name = name;
        this.singer = singer;
    }
    public static Song createSong(String name, String singer){
        return new Song(name, singer);
    }

    public String getName() {
        return name;
    }

    public String getSinger() {
        return singer;
    }
}
