package inputOutput.fileUtill;

import java.io.File;
import java.util.Scanner;

public class FileSearch {
    public static void main(String[] args) {
        //C:\Users\User\Desktop\Новая папка
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type folder path!");
        String path = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName=scanner.nextLine();

        File file = new File(path);

        boolean isExist = false;
        for (File listFile : file.listFiles()) {
            if (listFile.getName().equals(fileName)){
                isExist = true;
            }
        }
        System.out.println(isExist);

    }
}
