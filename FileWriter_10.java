package day02;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_10 {
	public static void main(String[] args) throws IOException {
		String path = String.valueOf("c:\\test\\test.txt");
		
		FileWriter fw = null;
		
		fw = new FileWriter(path);
		
		fw.write('F');
		fw.write('a');
		fw.write('c');
		fw.write('t');
		fw.write('o');
		fw.write('r');
		fw.write('y');
		fw.write('\r');
		fw.write('\n');
		
		// 배열에 담기
		char[] msg = "Electronics \r\n".toCharArray();
		System.out.println(msg.length);
		
		fw.write(msg);
		
		fw.write("현대중공업\r\n");
		fw.write("네이버");
		
		// 파일열기(AWT)
		Desktop.getDesktop().open(new File(path));
		
		fw.close();
	}
}
