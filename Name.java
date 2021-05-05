package Java2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Name {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("\nNgo Chi Thanh Dat");
        names.add("\nChu Duc Long");
        names.add("\nNguyen Hoang Anh");
        names.add("\nDương Quoc Viet");
        names.add("\nNguyen Huy Hoang");
        names.add("\nNguyen Phuc");
        names.add("\nLuong Minh Tien");
        names.add("\nTa Tung Dương");
        names.add("\nNguyen Minh Hiep");

        System.out.println("\nDanh sách lớp là: " + names);


        names.add(4, "\nLập");
        System.out.println("\nDanh sách lớp sau khi cập nhật là: " + names);

        // Kiếm tra empty
        System.out.println("\n\nIs the names list empty? : " + names.isEmpty());

        // Sắp xếp
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });

        names.sort((name1, name2) -> name1.compareTo(name2));

        names.sort(Comparator.naturalOrder());
        System.out.println("\n\nDanh sách tên sau khi sắp xếp : " + names);

    }
}
