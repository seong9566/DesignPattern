package adapter.ex01;

// 고객의 클레임이 들어오면 ,
// 사과 이메일 보내기
//이메일 답장을 DB에 저장하기
public class CustomerService {
	
	private EmailSend email;
	
	
	public CustomerService(EmailSend email) {
		super();
		this.email = email;
	}

	public void acceptClaim(String msg) {
		//클레임 받는 책임만
		String acceptMsg = msg;
		System.out.println("클레임 내용 : "+msg);
		
		// 이메일 보내기
		sendEmail();
	}
	
	public void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 디비에 저장하기 " + result);
	}
}
