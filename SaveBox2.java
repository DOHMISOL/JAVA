import java.util.Scanner;

public class SaveBox {
	
	//데이터
	int coin;
	String name = "돼지";
	boolean isBroken = false;
	//입금
	public void deposit() {
		if(isBroken) {
			System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
			return;
		}
		System.out.println("입금할 금액을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		int inputNum = Integer.parseInt(inputString);
		this.coin = this.coin + inputNum;
		System.out.println("땡그랑");
		System.out.println("입금하신 금액은 " +this.name + this.coin + "입니다.");
	}
	
	//출금
	public void withDraw() {
		System.out.println("출금할 금액을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		String inputString1 = scanner.nextLine();
		int inputNum = Integer.parseInt(inputString1);
		this.coin = this.coin + inputNum;
		System.out.println("출금하신 금액은 " +this.name + this.coin + "입니다.");
		this.isBroken = true;
	}
	//이름
	public void setName(String name) {
		this.name = name;
	}
	
	
}
