import java.util.Scanner;

public class Date {
	public static void main(String[] args) {
//		//특정날짜의 년,월,일,요일 구하기
//        Calendar cal1 = Calendar.getInstance();
//        String startDate = "20180505083000";
//        
//        cal1.set(Calendar.YEAR,Integer.parseInt(startDate.substring(0,4)));
//        cal1.set(Calendar.MONTH,Integer.parseInt(startDate.substring(4,6)));
//        cal1.set(Calendar.DATE,Integer.parseInt(startDate.substring(6,8)));
//        cal1.set(Calendar.HOUR,Integer.parseInt(startDate.substring(8,10)));
//        cal1.set(Calendar.MINUTE,Integer.parseInt(startDate.substring(10,12)));
//        cal1.set(Calendar.SECOND,Integer.parseInt(startDate.substring(12,14)));
//
//        int year = cal1.get(Calendar.YEAR); //연도
//        int month = cal1.get(Calendar.MONTH);  //월
//        int date = cal1.get(Calendar.DATE); //일
//        int dayofWeek = cal1.get(Calendar.DAY_OF_WEEK);  //요일  1(일요일) ~ 7(토요일)
//        int hour = cal1.get(Calendar.HOUR); //시간
//        int minute = cal1.get(Calendar.MINUTE); //분
//        int second = cal1.get(Calendar.SECOND); //초
//        
//        String[] daysofWeekStr = {"일", "월", "화", "수", "목", "금", "토"};
//        System.out.println(daysofWeekStr[dayofWeek-1]);
//        System.out.println(year + "년 " + month + "월 " + date + "일 " + daysofWeekStr[dayofWeek-1] + "요일 " + hour + "시 " + minute + "분 " + second + "초");
//        
//        //특정 월의 마지막 날짜 구하기
//        Calendar cal2 = Calendar.getInstance();
//        int year2 = 2017;
//        int month2 = 2;
//        int date2 = 1;
//        
//        cal2.set(Calendar.YEAR, year2);
//        cal2.set(Calendar.MONTH, month2);
//        cal2.set(Calendar.DATE, date2);
//        
//        int firstDay = cal2.getMinimum(Calendar.DAY_OF_MONTH);
//        int lastDay = cal2.getMaximum(Calendar.DAY_OF_MONTH);
//        System.out.println(month2 + "월의 " + "첫번째 일은 : " + firstDay);
//        System.out.println(month2 + "월의 " + "마지막 일은 : " + lastDay);
//        
//        //문자열을 Date/Calendar로 변환하기
//        
//        //날짜들 간의 시간 차이구하기
//        
//       //나라별 현재시간
//        LocalDate now = LocalDate.now();  //신방식
//        System.out.println(now);
//        
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //구방식
//        String nowTime1 = sdf1.format(new Date());
//        System.out.println(nowTime1);
//        
//        String date1 = "2020-12-30";
//        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//        	Date dateDate = sdf2.parse(date1);
//        	System.out.println(date);
//        	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd E");
//        	System.out.println(sdf3.format(dateDate));
//        }catch(ParseException e) {
//        	e.printStackTrace();
//        }
//        
//        GregorianCalendar g = (GregorianCalendar) GregorianCalendar.getInstance();
//        g.set(2023,4,9);
//        System.out.println(g.getActualMaximum(GregorianCalendar.DAY_OF_MONTH));
//		java.util.Date now = new java.util.Date();
//		System.out.println(now.getTime()/ 1000 / 60 / 60 /24 / 365);
//		
//		int a = 10;
//		boolean b = true;
//		
//		Integer c = new Integer(10);
//		Integer d = 30;
//		int f =d;
//		
//		Boolean e = true;
//		
//		System.out.printf("%04d",10);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input Number : ");
		
//		int a =scanner.nextInt();
//		System.out.println(10/a);
		
		try {
			int a = scanner.nextInt();
			System.out.println(10/a);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("정상 실행");
		System.out.println("정상 실행");
		System.out.println("정상 실행");
		System.out.println("정상 실행");
		System.out.println("정상 실행");
	}
}
