package Task2_Java2;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    public static void main(String[] args) {
        List<String> Movie = new ArrayList<>();
        Movie.add("Birds Of Prey");
        Movie.add("Sonic The Hedgehog");
        Movie.add("Emma");
        Movie.add("The Call Of The Wild");
        Movie.add("Soul");

        //Liệt kê danh sách phim yêu thích:
        System.out.println("List phim yêu thích :");
        System.out.println(Movie + "\n");

        //Thêm phim mới:
        Movie.add("IronMan");
        Movie.add("Avatar");
        System.out.println("List phim yêu thích sau khi thêm phim :");
        System.out.println(Movie + "\n");

        //Xóa tên 1 bộ phim trong danh sách
        Movie.remove(4);
        System.out.println("List phim yêu thích sau khi xóa tên 1 bộ phim :");
        System.out.println(Movie + "\n");


        //Tìm kiếm tên 1 bộ phim trong list
        System.out.println("IndexOf \"IronMan\": " + Movie.indexOf("IronMan"));
    }
}
