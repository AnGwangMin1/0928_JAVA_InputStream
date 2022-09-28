package day02;

import java.io.IOException;

public class InputStreamTest_04 {
	public static void main(String[] args) {
		byte input[] = new byte[10];
		
		int i= 0, cnt=0, tot=0;
		
//		try {
//			// i = input배열에서 읽은 바이트 수
//			i = System.in.read(input);
//			System.out.println(i);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			// Ctrl + Z ==> -1
			while((i = System.in.read(input)) != -1) {
				cnt++;
				tot +=i;
				System.out.println("i="+i);
				
				// 읽은 바이트 수만큼 0번 위치에서 출력
				System.out.write(input, 0, i);
			}
			
			System.out.println("cnt : "+ cnt);
			System.out.println("tot : "+ tot + "바이트를 읽음");
			
			System.in.close();
			System.out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
