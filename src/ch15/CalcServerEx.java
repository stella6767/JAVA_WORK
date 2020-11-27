package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.management.ListenerNotFoundException;

public class CalcServerEx {

	public static String calc(String exp) {
		StringTokenizer st = new StringTokenizer(exp, " "); //��ĭ���� ����
		if (st.countTokens() != 3)
			return "error";

		String res = "";
		int op1 = Integer.parseInt(st.nextToken());
		String opcode = st.nextToken();
		int op2 = Integer.parseInt(st.nextToken());
		switch (opcode) {
		case "+":
			res = Integer.toString(op1 + op2);
			break;
		case "-":
			res = Integer.toString(op1 - op2);
			break;
		case "*":
			res = Integer.toString(op1 * op2);
			break;

		default:
			res = "error";
		}

		return res;
	}

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;

		try {
			listener = new ServerSocket(9999);
			System.out.println("������ ��ٸ��� �ֽ��ϴ�....");
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� ���� ��û ���
			System.out.println("����Ǿ����ϴ�.");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // ���� �Է½�Ʈ��
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // ���� ��� ��Ʈ��

			while (true) {
				String inputMessage = in.readLine(); // Ŭ���̾�Ʈ�κ��� �� �� �б�, ����
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("Ŭ���̾�Ʈ���� ������ �����Ͽ���");
					break;
				}
				System.out.println(inputMessage);
				String res = calc(inputMessage);
				out.write(res + "\n");
				out.flush();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {

			try {

				if(socket !=null) socket.close();
				if(listener !=null) listener.close();
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��߽��ϴ�.");
			}

		}

	}
}
