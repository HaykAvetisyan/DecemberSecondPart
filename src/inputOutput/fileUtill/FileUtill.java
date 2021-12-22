package inputOutput.fileUtill;

import java.io.*;

public class FileUtill {


    public void findLines(String txtPath, String keyword) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(txtPath));

        String line = "";

        while ((line = bf.readLine()) != null) {

            if (line.contains(keyword)) {
                System.out.println(line);
            }
        }
    }

    public void printSizeOfPackage(String path) throws FileNotFoundException {
        File file = new File(path);
        double size = 0;
        for (File listFile : file.listFiles()) {
            size = size + (listFile.length() / (double) (1024 * 1024));
        }
        System.out.println(size + " mb");


    }

    public void createFileWithContent(String path, String filename, String content) {

        String filePath = path + "\\" + filename;
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
                        bw.write(content);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
