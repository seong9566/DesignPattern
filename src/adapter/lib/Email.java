package adapter.lib;

import adapter.ex01.EmailSend;

public class Email implements EmailSend{

	@Override
	public String send() {
		System.out.println("진짜 메세지가 전송됨.");
		return "메세지를 전달 받음";
	}

}
