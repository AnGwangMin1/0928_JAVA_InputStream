package day02;

import java.io.IOException;

public class InputStreamTest_03 {
	public static void main(String[] args) {
		byte[] input = new byte[15];
		
		// 배열에 담아서 읽어오기
		try {
//			System.in.read(input, 0, 5);
			// 3번인덱스부터 8자리를 input배열에 입력후 읽어오기
//			System.in.read(input, 3, 8);			
//			System.in.read(input, 4, 7);
			
			System.in.read(input, 0, 14);
			for(int i =0; i <input.length; i++) {
				System.out.print(input[i]+ " ");
			}
			System.out.println();
			System.out.println(new String(input));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
