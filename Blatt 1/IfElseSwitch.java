
public class IfElseSwitch {
	
	public static void main(String[] args){
		//compare3Numbers(1,2,3);
		//computeRealSolutions(10, 6, 1);
		//System.out.println(computeGrade(90));
	}
	
	//Aufgabe 2a
	
	public static void compare3Numbers(int x, int y, int z){
		if(x<y&&y<z){
			System.out.println(z + " " + y + " " + x);
		}
		if(z<y&&y<x){
			System.out.println(x + " " + y + " " + z);
		}
		if(y<z&&z<x){
			System.out.println(x + " " + z + " " + y);
		}
		if(y<x&&x<z){
			System.out.println(z + " " + x + " " + x);
		}
		if(z<x&&x<y){
			System.out.println(y + " " + x + " " + z);
		}
		if(x<z&&z<y){
			System.out.println(y + " " + z + " " + x);
		}
	}
	
	//Aufgabe 2b
	
	public static boolean isLeapYear(int year) {
		if(year<2970&&year>1470) {
			if(year % 100 == 0 && year % 400 != 0) return false;
			if(year % 4 == 0) return true;
		}
		
		
		return false;
	}
	
	//Aufgabe 2c
	
	public static void computeRealSolutions(int a,int b,int c) {
		double x1,x2;
		x1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		x2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		if(Double.isNaN(x1))System.out.println("No Solution");
		else System.out.println(x1 + " " + x2);
	}
	
	//Aufgabe 2d
	
	public static double computeGrade(int points) {
		if(points<50) return 5.0;
		if(points<59) return 4.0;
		if(points<63) return 3.7;
		if(points<67) return 3.3;
		if(points<71) return 3.0;
		if(points<74) return 2.7;
		if(points<77) return 2.3;
		if(points<81) return 2.0;
		if(points<86) return 1.7;
		if(points<91) return 1.3;
		if(points<=100) return 1.0;
		System.out.println("Wrong Input");
		
		return Double.NaN;
	}
	
	
}
