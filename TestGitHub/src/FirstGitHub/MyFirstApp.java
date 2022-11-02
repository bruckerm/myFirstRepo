package FirstGitHub;

public class MyFirstApp {

	public static void main(String[] args) {
		System.out.println(fakultaet(0));

	}
	
	public static int fakultaet(int f) {
		if (f == 0) {
			int result = 1;
			return result;
		}
		
		if (f == 1) {
			int result = 1;
			return result;
		}
		
		return fakultaet( f - 1 ) * f;
		
	}

}
