package adapter.ex01;

public class EmailAdapter implements EmailSend{

	@Override
	public String send() {
		
		return "답장 내용";
	}

}
