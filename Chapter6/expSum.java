
public class expSum {

	public static void main(String[] args) {
		expSum(3);
		sinCos();
		
		System.out.println( Math.sin(Math.PI/4) + Math.cos(Math.PI/4)/2                  );
	}

	public static double multadd(double a, double b, double c) {
		return a * b + c;
	}

	public static double expSum(double x) {
		double a1 = x;
		double a2 = Math.exp(-x);
		double a3 = Math.sqrt(1 - a2);
		double ans = multadd(a1, a2, a3);
		System.out.println(ans);
		return ans;
	}
	
	public static double sinCos() {
		double a1 = Math.sin(Math.PI/4);
		//Must be double numbers
		double a2 = 1.0/2.0;
		double a3 = Math.cos(Math.PI/4);
		double ans = multadd(a1,a2,a3);
		System.out.println(ans);
		return ans;
	}

}