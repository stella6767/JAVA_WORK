package sms;

import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

/**
 * @class ExampleSend
 * @brief This sample code demonstrate how to send sms through CoolSMS Rest API
 *        PHP
 */
public class ExampleSend {

	static void 문자전송(String to,String text) {
		
		String api_key = "NCSNZPD8YK0SSP2Y";
		String api_secret = "XTGLEMVJAWLOOH5K1VO9HAA05RE27SLL";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", to);
		params.put("from", "01048864197");
		params.put("type", "SMS");
		params.put("text", text);
		params.put("app_version", "test app 1.2"); // application name and version

		try {// 통신은 무조건 예외처리
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println("메기지가 전송되었습니다.");
			System.out.println(obj.toString());
			//1번 obj(문자열) -> 자바 오브젝트
			//2번 error가 있는지 확인
			//3번 DB insert
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
		
		
	}
	
	public static void main(String[] args) {
		
		문자전송("0","잘 되나?");
		
		
	}
}