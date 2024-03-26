package S0326;

import java.util.Calendar;

public class Long2Example {
	enum Week {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY 
	};
	
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();//디자인패턴 중 싱글턴패턴 새로운 클래스 생성개수를 제한가능
		int iWeek = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(iWeek) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("오늘은 쉬는 날 입니다.");
		} else {
			System.out.println("오늘은 공부하는 날 입니다.");
		}
		
		
	}
}
