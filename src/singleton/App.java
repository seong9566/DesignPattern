package singleton;

public class App {
	// 1. 싱글톤 패턴
	public static void main(String[] args) {
		// 아무리 많이 만들어도 사람1만 호출된다, 
		President p1 = President.getInPresident();// 사람1
		President p2 = President.getInPresident();// 사람1 
	}
}
