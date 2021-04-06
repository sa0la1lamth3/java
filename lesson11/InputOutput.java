package lesson11;

import java.io.*;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        //kiểm tra file có tồn tại hay không!!!
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a file path :"); // nhập 1 đường dẫn
//        String filePath = scanner.nextLine();
//        File file = new File(filePath);
//        System.out.println("Exist: " +file.exists());


        // lấy ra 1 tệp có đuôi trước (.png , .jpec)!!!
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input file extesion: ");
//        String extesion = scanner.nextLine();
//        System.out.println("Input folder path: ");
//        String folderPath = scanner.nextLine();
//        File folder = new File(folderPath);
//        File[] files = folder.listFiles();
//        for (File file:files){
//            if (file.getPath().endsWith(extesion)){
//                System.out.println(file.getPath());
//            }
//        }


        //tìm file từ khóa dài nhất trong 1 file text!!!

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input file path: ");
        String filePath = scanner.nextLine();
        BufferedReader bufferedReader = null;
        String longestWold = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] woldsInLine = line.split(" ");
                for (String wold : woldsInLine) {
                    if (wold.length() >= longestWold.length()){
                        longestWold = wold;
                    }
                }
            }
            System.out.println("Result: " + longestWold);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
