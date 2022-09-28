package day02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_07 {
	public static void main(String[] args) throws IOException {
		// 이미지, 동영사, 음악파일등은 byte 단위 처리
		
		String src = "c:/test/img1.png";
		String target = "c:/test/target.png";
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		fis = new FileInputStream(src);
		fos = new FileOutputStream(target);
		
		byte[] buffer = new byte[1024];
		int n = 0, cnt=0, tot=0;
		
		while((n=fis.read(buffer)) != -1) {
			// target.png에 출력
			fos.write(buffer, 0, n);
			cnt++;
			tot +=n;
		}
		
		System.out.println("cnt : "+ cnt);
		System.out.println(tot + " 바이트가 복사되었습니다..");
		
		fis.close();
		fos.close();
		
	}
}
