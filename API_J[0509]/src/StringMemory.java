import java.time.LocalDate;
import java.util.Calendar;
public class StringMemory {
	public static void main(String[] args) {
		String a = "hello";
		String b = new String("hello");
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		a.equals("bbb");
		
		b = "hello1";
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//a==b // 주소비교
		//a.equals(b)  //문자열을 비교
		String c = " hello adsfsd dsfadsfs   ";
		System.out.println(c);
		c = c.trim();
		System.out.println(c);
		System.out.println(a.charAt(3));  //공백을 없애지 않으면 공백도 인덱스로 인식
		
		String d = "hello";
		d = "hello1"; // a = a+"1"
		d = "hello11"; // a = a+"1"
		d = "hello112"; // a = a+"2"
		
		StringBuffer e = new StringBuffer("hello");  //append라는 형태밖에 지원안함
		e.append('1');
		e.append('1');
		e.append('2');
		
		System.out.println(e);
		e.reverse();
		System.out.println(e);
		
		String f = e.toString();
		System.out.println(e); 
	}
}
