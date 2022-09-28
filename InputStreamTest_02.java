package day02;

import java.io.IOException;

// System.in : InputStream
// System.out : OutputStream

public class InputStreamTest_02 {
	public static void main(String[] args) {
		
		int i = 0;
		int cnt = 0;
		
		try {
			while(true) {
				i = System.in.read();
				// Enter /r/n : Carriage Return
				// /r : 13 /n : 10
				System.out.println(i);
				if(i=='z' || i=='Z') break;
				cnt++;
			}
			System.out.println(cnt + "바이트 읽음");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
