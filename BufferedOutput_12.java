package day02;

import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 속도 향상을 위한 보조 스트림(Wrapper 스트림)
// BufferedInputStream, BufferedOutputStream : 바이트 단위
// BufferedReader, BufferedWriter : 문자단위
public class BufferedOutput_12 {
	public static void main(String[] args) throws IOException {
		String path = String.valueOf("c:\\test\\test.txt");
		
		BufferedOutputStream bos = null;
		
		//FileInputStream 기반스트림
		bos = new BufferedOutputStream(new FileOutputStream(path));
		
		bos.write('b');
		bos.write('a');
		bos.write('n');
		bos.write('k');
		bos.write('\r');
		bos.write('\n');
		
		// 문자열을 바이트 배열 byte[]
		bos.write("deposit and witDrawal".getBytes());
		
		// AWT
		Desktop.getDesktop().open(new File(path));
		
		bos.close();
	}
}
