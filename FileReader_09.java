package day02;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_09 {
	public static void main(String[] args) {
		Object obj = null;
		
		// nullPointerException 는 디버깅하기 힘들다.
//		System.out.println(obj.toString());
		
		// null 값을 문자열로 형변환 시 NullPointerException 발생
		// String.valueOf(obj)를 사용하면 매개변수가 null이 전달
		// 되는 경우 문자열을 "null"로 반환을 해준다.
		// NullPointerException 오류를 막을 수가 있다.
//		System.out.println(String.valueOf(obj));
		
		FileReader fr = null;
		
		String path = String.valueOf("c:\\test\\test.txt");
		
		try {			
			fr = new FileReader(path);
			while(true) {
				int data = fr.read();
				System.out.print("data : "+data);
				
				if(data == -1) break;
				System.out.println((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
