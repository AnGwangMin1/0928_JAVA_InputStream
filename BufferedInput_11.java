package day02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 속도 향상을 위한 보조 스트림(Wrapper 스트림)
// BufferedInputStream, BufferedOutputStream : 바이트 단위
// BufferedReader, BufferedWriter : 문자단위
public class BufferedInput_11 {
	public static void main(String[] args) throws IOException {
		String path = String.valueOf("c:\\test\\test.txt");
		
		BufferedInputStream bis = null;
		
		//FileInputStream 기반스트림
		bis = new BufferedInputStream(new FileInputStream(path));
		
		byte[] byteArr = new byte[30];
		
		while(true) {
			int data = bis.read(byteArr);
			if(data == -1) break;
			String msg = new String(byteArr, 0, data);
			System.out.println(msg);
		}
		
		bis.close();
	}
}
