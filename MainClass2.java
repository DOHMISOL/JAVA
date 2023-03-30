
public class MainClass {
	public static void main(String[] args) {
		SaveBox s = new SaveBox();
		SaveBox[] saveBox = new SaveBox[101];
		
		System.out.println("저금통을 선택해주세요.");
		System.out.println(saveBox);
		
		//저금통 선택
		for(int i =0; i<100;i++) {
			String inputMenu =s.nextLine;
			System.out.println("원하시는 메뉴를 선택해주세요. 1. 저금, 2출금 3.종료 q");
			
			int inputMenu1 = Integer.parseInt(inputMenu);
			if(inputMenu1.equals("q")) {
				break;
			}else if(inputMenu1 == 1) {
				int inputMenu1 
				arr [i] = deposit();
			}else if(inputMenu1 == 2) {
				arr [i] = withdraw();
			}
	}
}
}
