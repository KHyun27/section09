package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest {

    public static void main(String[] args) {

        // text file : ansi-code, unicode(utf-8, utf-16, utf-32, ...)
        // binary file

        // file을 구현해주는 클래스
        // File file = new File("test.txt");
        // try {
        //     FileWriter fWriter = new FileWriter(file);
        //     fWriter.write("안녕하세요.");
        //     fWriter.close();
        // } catch (IOException e) {
        //     throw new RuntimeException(e);
        // }

        // StringBuilder sb = new StringBuilder();
        // sb.append("test file입니다.\n");
        // sb.append("이것은 java로 만들어진 입니다.\n");
        // sb.append("파일 쓰기 및 읽기 작업입니다.\n");
        // TextIO.write("test.txt",sb.toString());

        try {
            StringBuilder sb = TextIO.read("test.txt");
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
