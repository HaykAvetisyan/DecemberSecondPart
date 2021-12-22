package inputOutput.fileUtill;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileUtilTest {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileUtill fileUtil=new FileUtill();
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please input path of txt file!");
        String path = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword=scanner.nextLine();
        fileUtil.findLines(path,keyword);



        System.out.println("Please input folders path");
        String folderPath=scanner.nextLine();
        fileUtil.printSizeOfPackage(folderPath);


        System.out.println("Please input path");
        String path1=scanner.nextLine();
        System.out.println("Please input filename");
        String fileName=scanner.nextLine();
        System.out.println("Please input content");
        String content=scanner.nextLine();

        fileUtil.createFileWithContent(path1,fileName,content);



    }
}
