package sms;

public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;	
	
	
	public Response(String group_id, String error_list, String success_count, String error_count) {
		this.group_id = group_id;
		this.error_list = error_list;
		this.success_count = success_count;
		this.error_count = error_count;
	}
	
	



	@Override
	public String toString() {
		return "Response [group_id=" + group_id + ", error_list=" + error_list + ", success_count=" + success_count
				+ ", error_count=" + error_count + "]";
	}



	static String ��ȣ����(String data) {
		int start = data.indexOf("{")+1;
		int last = data.lastIndexOf("}");
		data = data.substring(start, last);
		return data;
	}


	public static void main(String[] args) {
		String date=" {\"group_id\":\"R2GHNbtdtEGrsO1zf\",\"error_list\":{\"1\":\"1049\"},\"success_count\":0,\"error_count\":1}  ";
				
		System.out.println(date);
		System.out.println();
		
		//�����Ͱ� �ٸ� ���̷� �� �� ������ �̷������� ¥���� �� �����ϴ�!!
		String gi = date.substring(14,30); 
		String el = date.substring(51,55);
		String sc = date.substring(74,75);
		String ec = date.substring(90,91);
		
		//Response res= new Response(gi,el,sc,ec);
		//System.out.println(res);
		
		//������ ���� �Ľ� �� �ϰ� ���̺귯�� �̿�! gson or jackson
		date = ��ȣ����(date);

		String r3[] = date.split(",");
		//System.out.println(r3[0]);
		String group_id = r3[0].split(":")[1];
		group_id = group_id.replaceAll("\"", "");//Ư������ �νĹ�� �����س���!
		System.out.println(group_id);
		String eroor_list = r3[1].split(":")[2];
		eroor_list = ��ȣ����(eroor_list);		
		eroor_list = eroor_list.replaceAll("\"", "");
		System.out.println(eroor_list);
		String success_count = r3[2].split(":")[1];
		System.out.println(success_count);
		String error_count = r3[3].split(":")[1];
		System.out.println(error_count);
		
		Response res= new Response(group_id,eroor_list,success_count,error_count);
		
		System.out.println(res);
		
		
		//if(res.getEroorlisr.equals("") || res.geteroor_list()==null) ���� �ƴϸ� db insert
		
		
				
	}
}

