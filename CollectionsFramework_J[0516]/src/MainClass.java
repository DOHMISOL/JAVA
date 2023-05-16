import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> student = new ArrayList<Student>();
		for (int i = 0; i < 999999; i++) {
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 데이터 입력");
			System.out.println("2. 전체데이터 출력");
			System.out.println("3. 최고 성적자 출력");
			System.out.println("q. 종료");
			String menuSelect = scanner.nextLine();

			if (menuSelect.equals("1")) {
				// 1번
//				Student item = new Student();
//				item.inputData();
//				student.add(item);
				// 2번
//				Scanner scanner = new Scanner(System.in);
//				System.out.println("name : ");
//				String tmp = scanner.nextLine();
//				String name = tmp;s
//				System.out.println("score : ");
//				tmp = scanner.nextLine();
//				int score = Integer.parseInt(tmp);
//				student.add(new Student(name,score));
				// 3번
				student.add(new Student(true));
			} else if (menuSelect.equals("2")) {
				for (int j = 0; j < student.size(); j++) {
					System.out.println(student.get(j));
				}
			} else if (menuSelect.equals("3")) {
				int maxScore = -1;
				for (int j = 0; j < student.size(); j++) {
					if (student.get(j).score > maxScore) {
						maxScore = student.get(j).score;
					}
				}
				for (int j = 0; j < student.size(); j++) {
					if (student.get(j).score == maxScore) {
						System.out.println(student.get(j));
					}
				}
				// Collenctions.sort()
				Collections.sort(student, new Comparator<Student>() {
					@Override
					public int compare(Student o1, Student o2) {
						return o1.score - o2.score;
					}
				});
				// selection, bubble
				// ArrayList -> Array
				Student[] tmp = student.toArray(new Student[student.size()]);
				// sort
				for (int i1 = 0; i1 < tmp.length - 1; i1++) {
					for (int i2 = 0; i2 < tmp.length - 1; i2++) {
						if (tmp[i1].score < tmp[i2].score) {
							Student t1 = tmp[i1];
							tmp[i1] = tmp[i2];
							tmp[i2] = t1;
						}
					}
				}
				// Array -> ArrayList
				student = (ArrayList<Student>) Arrays.asList(tmp);
			} else if (menuSelect.equals("q")) {
				break;
			}
		}

//		Student[] arr = {new Student("홍길동", 100)
//				, new Student("둘리",20)};
//		
//		Student[] arr2 = new Student[2];
//		arr2[0] = new Student("홍길동",100);
//		arr2[1] = new Student("둘리",20);
//		
//		ArrayList<Student> list = new ArrayList<Student>();
//		list.add(new Student("홍길동",100));
//		list.add(new Student("둘리",20));
//		list.add(new Student("또치",20));
//		
//		ArrayList<String> e = new ArrayList<String>(); //< >제네릭으로 타입으로 결정함. add에서 타입을 인식하는게 아님.
//		e.add("1");
//		//e[0];
//		e.get(0).equals("1111"); 
//		e.size();
//		
//		String[] f = new String[10]; //
//		String[] g = {"1", "2", "3"};
//		f[0];
//		g.length; //메소드가 아님
//		
//		Object a = new String("cc");
//		String b = new String("dd"); //변수가 다르더라도 객체타입은 동일하게 들어갈수 있음. 메소드는 object형의 메소드만 사용할수 있고, String형 타입의 메소드만 사용할 수 있음.
//		((String)a).getBytes();

	}
}
