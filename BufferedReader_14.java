package day02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader_14 {
	public static void main(String[] args) throws IOException {
		String path = String.valueOf("c:\\test\\test.txt");
		
		BufferedReader br = null;
		
		br = new BufferedReader(new FileReader(path));
		
		while(true) {
			String strLine = br.readLine();
			if(strLine == null) break;
			System.out.println(strLine);
		}
		br.close();
	}
}
