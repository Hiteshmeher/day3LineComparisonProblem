package lineComparison;

public class lineComparisonProblem {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison computation");
		int x1 = 2;
		int x2 = 4;
		int y1 = 3;
		int y2 = 1;
	    double dis = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	    System.out.println("Two points are (x1,y1)(2,3) and (x2,y2)(4,1)");
	    System.out.println("Length of the line (2,3)(4,1) is " + dis);
	}
}
