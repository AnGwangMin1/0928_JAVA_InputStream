package day02;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SpeedTest_13 {
	public static void readFile(String path) throws IOException {
		FileInputStream fis = new FileInputStream(path);
		
		byte[] byteArr = new byte[10];
		
		while(true) {
			int data = fis.read(byteArr);
			if(data == -1) break;
			
			String message = new String(byteArr, 0, data);
		}
		fis.close();
	}
	
	public static void readBuffer(String path) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
		byte[] byteArr = new byte[10];
		
		while(true) {
			int data = bis.read(byteArr);
			if(data == -1) break;
			
			String message = new String(byteArr, 0, data);
		}
		bis.close();
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		String path = String.valueOf("c:\\test\\speed.txt");
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 5; i++) {
			readFile(path);
		}
		long end = System.currentTimeMillis();
		System.out.println("fileInputStream 처리시간 : "+(end - start)/1000. + "초");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 5; i++) {
			readBuffer(path);
		}
		end = System.currentTimeMillis();
		
		System.out.println("BufferredInputStream 처리시간 : "+(end - start)/1000. + "초");
		
		//////////////////
		start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream(path);
		for(int i=0; i < 5; i++) {
			while(true) {
				int data =fis.read();
				if(data == -1) break;
			}
		}
		fis.close();
		end = System.currentTimeMillis();
		System.out.println("배열없이 FileInputStream 처리시간 : "+(end - start)/1000. + "초");
		
		//////////////////
		start = System.currentTimeMillis();
		FileInputStream fbis = new FileInputStream(path);
		byte[] byteArr = new byte[1024];
		
		for(int i=0; i < 5; i++) {
			while(true) {
				int data =fbis.read(byteArr);
				if(data == -1) break;
			}
		}
		fis.close();
		end = System.currentTimeMillis();
		System.out.println("배열사용한 FileInputStream 처리시간 : "+(end - start)/1000. + "초");
		
		
		
		
		
	}
}
