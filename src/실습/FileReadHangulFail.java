package 실습;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class FileReadHangulFail {
	
	public static void main(String[] args) {
		InputStreamReader in =null;
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("D:\\파일.txt");
			
			in = new InputStreamReader(fin, "UTF-8");
			
			int c;
			
			System.out.println("인코딩 문자집합은 "+ in.getEncoding());
			while((c=in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
			
		}
		
	}
}
