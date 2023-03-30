import java.util.Scanner;

public class SaveBox {
		int coin;
		String name = "돼지";
		boolean isBroken = false;
			
		public void deposit() {
			if(this.isBroken) {
				System.out.println("이 저금통은 더이상 사용할 수 없습니다.");
				return;
			}
			Scanner scanner =new Scanner(System.in);
			System.out.println("입금할 금액을 입력해주세요.");
			String inputString = scanner.nextLine();
			int inputCoin = Integer.parseInt(inputString);
			
			this.coin = this.coin + inputCoin;
			System.out.println("땡그랑");
			System.out.println("현재보유금액은 " + this.name + this.coin +"입니다.");
		}
		
		public void withdraw() {
			System.out.println(this.name + "저금통을 깼습니다.");
			System.out.println("최종 출금 금액은 " + this.name + this.coin + "입니다.");
			this.isBroken = true;
		}
		
		public void setName(String name) {
			this.name = name;
		}
}

