package �ǽ�;

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
			fout = new FileWriter("D:\\workspace/�׽�Ʈ.txt");
			while (true) { //�׳� �����Ű�� �αװ� �� ���µ�, flush�� �ٷιٷ� ������ �ȴ�.
				System.out.print("�Է�: ");
				String line = sc.nextLine();
				if (line.length() ==0)
					break;

				fout.write(line,0,line.length());
				fout.write("\r\n",0,2);

			}
			fout.close();
		} catch (IOException e1) {
			System.out.println("����� ����");
		}
		sc.close();
	}

}
