package study;

public class JinLamyunAdapter implements Lamyun{

	private JinLamyun jinLamyun;
	public JinLamyunAdapter(JinLamyun jinLamyun) {
		this.jinLamyun = jinLamyun;
	}


	@Override
	public String cook() {
		System.out.println("계란추가");
		return jinLamyun.cook();
	}
	
}
