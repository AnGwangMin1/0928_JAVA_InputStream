package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_05 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("c:/test/test.txt");
				
		int n = 0;
		int cnt = 0;
		byte b[] = new byte[200];
		
		// 파일의 끝 -1 : EOF(End Of File)
		while((n=fis.read(b)) !=-1) {
			System.out.println("n : " + n);
			System.out.write(b, 0, n);
			System.out.println();
			System.out.println("cnt : "+ cnt + "바이트 읽음");
			cnt += n;
		}
		System.out.println("-------------");
		System.out.println(cnt + "바이트를 읽음");
		
	}
}
