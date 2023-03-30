import java.util.Scanner;

public class SaveBox {
	int coin;
	String name = "돼지";
	
	public void deposit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("입금할 금액을 입력해주세요.");
		String inputString = scanner.nextLine();
		int inputCoin = Integer.parseInt(inputString);
		
		this.coin = this.coin + inputCoin; 
		//내 프로퍼티 안에 있는 것이다라는 것을 명확하게 하기 위해서 사용.꼭 사용하기!
	}
	
	public void withdraw() {
		System.out.println(this.name + "저금통을 깼습니다.");
		System.out.println("최종 출금 금액은 " + coin + "입니다.");
		
	}
	public void setName(String name) {
		this.name = name;
	}
}
