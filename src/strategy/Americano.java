package strategy;

public class Americano implements Coffee{
	// final이 걸리면 변하지 않는 변수 "상수" 이기 때문에 대문자를 사용해준다
	private final String NAME = "아메리카노";
	
	@Override
	public String make() {
		return NAME;
	}
}
