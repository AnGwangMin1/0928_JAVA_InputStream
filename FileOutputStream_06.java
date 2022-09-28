package day02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_06 {
	public static void main(String[] args) throws IOException {
		int n = 0;
		
		// append : true -- 파일내용을 덮어쓰지 않고 이어서 쓰는 옵션
		
		FileOutputStream fos = new FileOutputStream("c:/test/test.txt", true);
		System.out.println(">> 내용을 입력하세요..");
		
		while((n = System.in.read()) != -1) {
			fos.write(n);
		}
		System.in.close();
		fos.close();
		
	}
}
