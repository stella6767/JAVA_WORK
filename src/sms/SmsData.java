package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsData {
	private int id;//��ȣ 
	private String text;//���� �޽��� ����
	private String to;
	private int errorCode;
	private String sendTime;
}


