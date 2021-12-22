package inputOutput.fileUtill;

import java.io.File;
import java.util.Scanner;

public class FileFinderFolder {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type folder path!");
        String path = scanner.nextLine();
        System.out.println("Please input file name");
        String fileName = scanner.nextLine();

        File file = new File(path);

        boolean b =search(file, fileName);
        System.out.println(b);
    }

    public static boolean search(File file, String filename) {
        boolean a = false;
        if (file.isDirectory()) {
            for (File file1 : file.listFiles()) {
                if (file1.isDirectory()) {
                    search(file1, filename);
                } else {
                    if (file1.getName().equals(filename)) {
                        a = true;
                        break;
                    }
                }
            }
        }
        return a;

    }
}
