// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int input = Integer.parseInt(args[0]);
		double javapi = Math.PI;
		double mypi = 1;
		double divider = 3;
		for(int i=1;i < input; i++){
			double calcterm = 1/divider;
			if(i % 2 == 0){
				mypi = mypi + calcterm;
			}
			else{
				mypi = mypi - calcterm;
			} 
			divider = divider + 2;
		}
		mypi = mypi * 4;
		System.out.println("pi according to Java: " + javapi);
		System.out.println("pi, approximated:     " + mypi);
	}
}
