package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JFrame;

public class ChatClient extends JFrame{
	public static void main(String[] args) {
		BufferedReader in =null;
		BufferedWriter out =null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			socket = new Socket("113.198.238.54",9999); //클라이언트 소켓 생성
			in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			while(true) {
				System.out.println("보내기>>"); //프롬포트
				String outputMessage = scanner.nextLine();
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break; //사용자가 bye를 입력한 경우 서버로 전송 후 실행 종료
				}
				out.write(outputMessage + "\n");
				out.flush(); //out의 스트림 버퍼에 있는 모든 문자열 전송
				String inputMessage = in.readLine(); //서버로부처 한 행 수신
				System.out.println("서버: "+ inputMessage);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			
			try {
				scanner.close();
				if(socket != null) socket.close();
			} catch (IOException e) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
			
			
		}
		
		
	
		
		
	}
}
