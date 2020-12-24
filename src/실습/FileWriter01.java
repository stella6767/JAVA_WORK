package 실습;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class FileWriter01 {

	public static void main(String[] args) {

		FileWriter fout = null;
		Scanner sc = new Scanner(System.in);

		try {
			fout = new FileWriter("D:\\workspace/테스트.txt");
			while (true) { //그냥 종료시키면 로그가 안 남는디, flush로 바로바로 비워줘야 된다.
				System.out.print("입력: ");
				String line = sc.nextLine();
				if (line.length() ==0)
					break;

				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);

			}
			fout.close();
		} catch (IOException e1) {
			System.out.println("입출력 오류");
		}
		sc.close();
	}

}
