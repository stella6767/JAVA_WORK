package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

import javax.lang.model.util.Elements;
import javax.net.ssl.HttpsURLConnection;
import javax.swing.JFrame;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;




public class WeatherApp extends JFrame {
	
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
			
			String input=null;
			String download = "";
			while((input=br.readLine()) != null) {
				download = download + input;
			}		
			
			
			Document doc = Jsoup.parse(download);
			//Document doc = Jsoup.parse(download);
			org.jsoup.select.Elements temp = doc.select(".todaytemp");
			System.out.println("������ �µ���: "+temp.get(0).text());
			
			
			//fout.write(download);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
