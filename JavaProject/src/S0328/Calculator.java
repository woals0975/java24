package S0328;

public class Calculator {
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r ;
		//같은 정의가 있을경우 자식쪽 정의로 
		//재정의 된다.
		//그래도 super로 호출가능
	}

}
