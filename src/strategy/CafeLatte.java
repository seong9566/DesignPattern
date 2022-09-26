package strategy;

public class CafeLatte implements Coffee{
	// final이 걸리면 변하지 않는 변수 "상수" 이기 때문에 대문자를 사용해준다
	private final String NAME = "카페라떼";
	
	//부모의 메서드가 재정의 된것이다. 
	@Override
	public String make() {
		return NAME;
	}
}
