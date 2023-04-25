import java.util.Random;

public class D extends Base {
	D(String name){  //원진곰
		this.name = name;
		this.hp = 200;
		this.power = 20;
	}
	
	@Override
	public void Attack() {
		Random r = new Random(); 
		int inputNum = r.nextInt(5)+1;
		
		//공격 전, 아이템 탐색
		if(inputNum == 1 ) {
			this.power += 5;
			System.out.println("앗! "+this.name+"은 무언가를 발견했다!");
			System.out.println("파드득!!0^0");
			System.out.println(this.name + "가 연어를 획득하여 공격력이 " + this.power + "로 상승하였습니다!!");
		}
		else if(inputNum == 2 ) {
			this.hp += 10; 
			System.out.println("앗! "+this.name+"은 무언가를 발견했다!");
			System.out.println("호옹~허니허니베이비>00<");
			System.out.println(this.name + "가 꿀단지를 획득하여 체력이 " + this.hp+ "로 상승하였습니다!!");
		}
		else if(inputNum == 3) {
			System.out.println(this.name + "가 아무 것도 발견하지 못했습니다. 꽝!!");

		}
		else if(inputNum == 4 ) {
			System.out.println(this.name + "가 아무 것도 발견하지 못했습니다. 꽝!!");
		}
		else if(inputNum == 5) {
			System.out.println(this.name + "가 아무 것도 발견하지 못했습니다. 꽝!!");
		}	
		//공격	
		System.out.println(this.name + " 캐릭터가 "+this.power + "으로 공격했습니다.");
	}
}
