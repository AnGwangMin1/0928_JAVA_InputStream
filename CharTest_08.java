package day02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 한글은 2바이트 처리가 안되는 경우는 깨짐
public class CharTest_08 {
	public static void main(String[] args) throws IOException {
		File txtFile = new File("c:/test/test.txt");
		
		FileInputStream fis = new FileInputStream(txtFile);
		
		int i;
		while((i = fis.read()) != -1) {
			// 한글은 문자(char)단위로 읽어와야 깨지지 않는다.
			System.out.println((char)i);
		}
		System.out.println("end");
	}
}
