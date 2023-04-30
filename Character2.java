import java.util.Random;

public class Character2 extends Base {
	
	Character2(String name){  //캣베어
		this.name = name;
		this.hp = 200;
		this.power = 20;
	}
	
	@Override
	public void underAttack(int attack) {
		Random r = new Random();
		int inputNum = r.nextInt(3) + 1;

		int attackResult = attack;

		if (inputNum == 1) {
			System.out.println();
			System.out.println("ニ|");
			System.out.println("ニ|∧,,∧");
			System.out.println("ニ(・ω・;）");
			System.out.println("ニと　 )");
			System.out.println("ニと_ノ");
			System.out.println("ニ|");
			System.out.println(this.name + "(이)읏챠읏챠!나무에 올라갔지롱! 안아프지롱");
			attackResult = attack - 10;
			
		} else if (inputNum == 2) {
			System.out.println();
			System.out.println("∧＿∧");
			System.out.println("(´･ω･)");
			System.out.println("(　つ┳⊃)");
			System.out.println("ε(_)へ⌒ヽﾌ");
			System.out.println("(　　(〃･з･)");
			System.out.println("≡≡　◎―◎ ⊃ ⊃");
			System.out.println(this.name + "(이)우리붕붕이 타고 슝슝슝!!데헷");
			attackResult = attack - 20;
			
		} else if (inputNum == 3) {
			System.out.println();
			System.out.println(".　　　∧ ∧");
			System.out.println("　　(˃̶͈̀ ᗨ ˂̶͈́๑)");
			System.out.println("　　　 // ）");
			System.out.println("／￣￣《￣￣＼");
			System.out.println("|　・Ｕ　　　 |");S
			System.out.println("| |ι　　　　　  |し");
			System.out.println("Ｕ｜｜￣￣｜｜");
			System.out.println(this.name + "(이)마이프렌 엘리야 공격을 막아줘!");
			attackResult = attack - 30;
		}

      System.out.println(this.name+"(이)가 "+attack+"만큼 공격을 받았지만, 방어에 성공하여 "+attackResult+"만큼 데미지를 받았다" );
      this.hp = this.hp - attackResult;
   }
	
	@Override
	public int Attack() {
		Random r = new Random(); 
		int inputNum = r.nextInt(3)+1;
		
		if (inputNum == 1) {
			this.power = 10;
			System.out.println();
			System.out.println(this.name + "(이)가 '매력뿜뿜'공격을 시전했다!");
			System.out.println();
			System.out.println(".∧＿∧");
			System.out.println("(｡･ω･｡)つ━☆・*。");
			System.out.println("⊂　      / 　　・゜+.");
			System.out.println("しーＪ　　　°。+ *´¨)");
			System.out.println("             .· ´¸.·*´¨) ¸.·*¨)");
			System.out.println("                (¸.·´ (¸.·'* ☆\"");
			System.out.println();
			System.out.println(this.name + "(이)가 마법의 가루로" + this.power + " 데미지로 공격했습니다.");
			
		} else if (inputNum == 2) {
         this.power = 20;
			System.out.println();
			System.out.println(this.name + "(이)가 '망고스틴냥냥펀치'공격을 시전했다!");
			System.out.println();
			System.out.println(". ∧＿∧");
			System.out.println("(　･ω･)＝つ≡つ");
			System.out.println("(っ　≡つ＝つ");
			System.out.println("/　　 ) ﾊﾞﾊﾞﾊﾞﾊﾞ");
			System.out.println("( /￣∪");
			System.out.println();
			System.out.println(this.name + "(이)가 '망고스틴'으로 " + this.power + " 데미지로 공격했습니다.");
			
      } else if (inputNum == 3) {
         this.power = 30;
			System.out.println();
			System.out.println(this.name + "(이)가 '골골송메들리'공격을 시전했다!");
			System.out.println();
			System.out.println(".　♪　∧,＿∧");
			System.out.println("　 　(´･ω･`) ))");
			System.out.println("　(( (　つ　ヽ、　♪");
			System.out.println("　　　〉 とノ　)))");
			System.out.println("　　（__ノ^(＿)");
			System.out.println();
			System.out.println(this.name + "(이)가 '골골송메들리'공격으로 " + this.power + " 데미지로 공격했습니다.");
      }
      return power;
	}
}
