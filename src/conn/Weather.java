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

public class Weather {
	
	public static void main(String[] args) {
		
		FileWriter fout = null;
		
		try {
			fout = new FileWriter("d:\\����.txt");
			
			//1.�ּ� ���� URL Ŭ���� ���			
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_sug.pre&fbm=0&acr=3&acq=%EB%82%A0%EC%94%A8&qdt=0&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
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
			
			String word = "todaytemp";
			String input=null;
			String download = "";
			while((input=br.readLine()) != null) {
				download = download + input;
			}		
			
			int start = download.indexOf("todaytemp");
			//int start2 = download.indexOf("num");
			//String temp2 = download.substring(start2 +6, start2+12);
			String temp = download.substring(start+11,start+13);
			System.out.println("������ �µ���: "+temp);
			//System.out.println("������ �̼�������: "+temp2);
			
			//fout.write(download);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
