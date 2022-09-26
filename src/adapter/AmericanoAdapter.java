package adapter;

public class AmericanoAdapter implements Coffee{
	// 아메리카노에 시럽 추가 하기 위해선 아메리카노가 필요하다. 그래서 생성자로 주입을 받음.
	private Americano americano;
	public AmericanoAdapter(Americano americano) {
		this.americano = americano;
	}

	@Override
	public String make() {
		System.out.println("시럽추가");
		return americano.make();
	}

}
