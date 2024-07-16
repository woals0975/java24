package S0327;

public class Calculator2 {
	
	//double areaRectangle(double width) {
	//	return width * width;
	//}
	//정사
	
	//double areaRectangle(double width, double height) {
	//	return width * height;
	//}
	//직사
	double areaRectangle(double x) {
		return x * x * 6;
	}
	//정육
	double areaRectangle(double x,double y,double z) {
		return (x*y*2)+(x*z*2)+(y*z*2);
	}
	
	public static void main(String[] args) {
		Calculator2 myCalc = new Calculator2();
		
		double result1 = myCalc.areaRectangle(4.0);
		double result2 = myCalc.areaRectangle(4.0,6.0,8.0);
		
		System.out.println(result1);
		System.out.println(result2);
		
	}
}
