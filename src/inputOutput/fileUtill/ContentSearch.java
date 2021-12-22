package inputOutput.fileUtill;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ContentSearch {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type folder path!");
        String path = scanner.nextLine();
        System.out.println("Please input content");
        String content = scanner.nextLine();

        File file = new File(path);
        contentSearch(file, content);
    }

    private static void contentSearch(File file, String content) {
        try {
            for (File listFile : file.listFiles()) {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(listFile.getAbsolutePath()));
                if (bufferedReader.readLine().equalsIgnoreCase(content)) {
                    System.out.println(listFile.getName());
                } else {
                    System.out.println("We not that content!");
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
