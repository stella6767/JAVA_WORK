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
			
			//1.�ּ� ���� URL Ŭ���� ���			
			URL url = new URL("https://www.naver.com");
			
			//2. ���ۿ����� ���� ��Ʈ���� ����
			HttpsURLConnection conn = 
					(HttpsURLConnection)url.openConnection();
			
			//3.���ۿ���(8192byte)
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
				download = download + input;//�� ���� ���
			}		
			
			//System.out.println(download);
			//System.out.println("������ �µ���: "+);
			
			fout.write(download);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
