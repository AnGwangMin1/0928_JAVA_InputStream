package day02;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_15 {
	public static void main(String[] args) throws IOException {
		String path = String.valueOf("c:\\test\\test.txt");
		
		BufferedWriter bw = null;
		
		bw = new BufferedWriter(new FileWriter(path));
		
		bw.write('c');
		bw.write('o');
		bw.write('i');
		bw.write('n');
		bw.write('\r');
		bw.write('\n');
		
		char[] msg = "Human Resource\r\n".toCharArray();
		bw.write(msg);
		
		bw.write("영업부");
		
		bw.flush(); // 버퍼에 있는 내용을 모두 출력
		Desktop.getDesktop().open(new File(path));
		
		bw.close();
	}
}
