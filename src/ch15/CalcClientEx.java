package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class CalcClientEx {
	public static void main(String[] args) {
		BufferedReader in =null;
		BufferedWriter out =null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket("localhost",9999); //Ŭ���̾�Ʈ ���� ����
			in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.print("����(��ĭ���� ��� �Է�,��:24+42)>>"); //������Ʈ
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break; //����ڰ� bye�� �Է��� ��� ������ ���� �� ���� ����
				}
				out.write(outputMessage + "\n");
				out.flush(); //out�� ��Ʈ�� ���ۿ� �ִ� ��� ���ڿ� ����
				String inputMessage = in.readLine(); //�����κ�ó �� �� ����
				System.out.println("��� ���: "+ inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
			
			
		}
		
		
	
		
		
	}
}
