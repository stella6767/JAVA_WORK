package conn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conn01 {
	
	public static void main(String[] args) {
		
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("d:\\index.html");
			
			//1.주소 설정 URL 클래스 사용			
			URL url = new URL("https://www.naver.com");
			
			//2. 버퍼연결을 위해 스트림에 접근
			HttpsURLConnection conn = 
					(HttpsURLConnection)url.openConnection();
			
			//3.버퍼연결(8192byte)
//			OutputStream os = conn.getOutputStream();
//			OutputStreamWriter osw = new OutputStreamWriter(os);
//			BufferedWriter bww = new BufferedWriter(osw);
//			bww.write("adsssssssss");
			
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			
			String input=null;
			String download = "";
			while((input=br.readLine()) != null) {
				//String s = input;
				download = download + input;//안 좋은 방법
			}		
			
			//System.out.println(download);
			//System.out.println("오늘의 온도는: "+);
			
			fout.write(download);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
