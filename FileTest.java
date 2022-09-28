package day02;

import java.io.File;
import java.io.IOException;

// [File 클래스]
// 파일의 경로를 다루는 클래스(java.io.File)
// 파일이름 변경, 삭제, 디렉토리생성 등 파일관리
public class FileTest {
	public static void main(String[] args) throws IOException {
		// File 객체 생성
		File txtFile = new File("c:/test/fileIO.txt");
		File txtFolder = new File("c:/test/fileFolder");
		
		// 파일 경로 가져오기
		String path1 = txtFile.getPath();
		System.out.println("path1 : " + path1);
		System.out.println("txtFolder : " + txtFolder);
		
		// 절대 경로 가져오기
		String absPath = txtFile.getAbsolutePath();
		System.out.println("absPath : " + absPath);
		
		String absPath2 = txtFile.getCanonicalPath();
		System.out.println("absPath2 : " + absPath2);
		
//		getAbsolutePath() vs getCanonicalPath()
		
		File f = new File("./../testFile");
		// ./, ../ 상대경로 계산없음
		System.out.println(f.getAbsolutePath());
		// ./, ../ 상대경로 계산해줌
		System.out.println(f.getCanonicalPath());
		
		// 이전 폴더
		String parent = txtFile.getParent();
		System.out.println("parent : " + parent);
		
		// 존재 여부 확인
		boolean isFile1 = txtFile.exists();
		System.out.println("isFile1 : " + isFile1);
		
		System.out.println("-----------------");
		// 파일과 폴더 구분하기
		// 파일 여부 확인
		boolean isFileFolder = txtFile.isFile();
		System.out.println("isFileFolder :" + isFileFolder);
		
		boolean isFileFolder2 = txtFolder.isFile();
		System.out.println("isFileFolder2 :" + isFileFolder2);
		
		// 디렉토리 여부 확인
		boolean isFileFolder3 = txtFile.isDirectory();
		System.out.println("isFileFolder :" + isFileFolder3);
		
		boolean isFileFolder4 = txtFolder.isDirectory();
		System.out.println("isFileFolder2 :" + isFileFolder4);
		
		// 디렉토리 생성
		File cFolder = new File("c:\\test\\parentFolder\\childFolder");
		// mkdir() : 리턴값 boolean
		boolean cBool = cFolder.mkdir();
		System.out.println("cBool : " + cBool);
		
		File cFolder2 = new File("c:\\test\\parentFolder");
		boolean cBool2 = cFolder2.mkdir();
		System.out.println("cBool2 : " + cBool2);
		
		// 파일 생성
		File newFile = new File("c:\\test\\newFile.txt");
		
		boolean nBool = newFile.createNewFile();
		System.out.println("nBool : "+nBool);
		System.out.println("------------");
		
		// 파일명 변경
		File newFile2 = new File("c:\\test\\newFile11.txt");
		boolean rBool = newFile.renameTo(newFile2);
		System.out.println("rBool : "+rBool);
		
		// 폴더 삭제
		File dFolder = new File("c:\\test\\delFolder");
		boolean dBool = dFolder.delete();
		System.out.println("dBool : "+dBool);
	}
	
}
