// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
        int N = Integer.parseInt(args[0]);
		String mode = args[1];
		if(mode.equals("v")){
			for (int i = 1; i <= N; i++){
				int stepcount = 1;
				int seqnum = i;
				System.out.print(seqnum + " ");
				if(i == 1){
					seqnum = 4;
					System.out.print(seqnum + " ");
					stepcount++;
				}
				while(seqnum != 1){
					if(seqnum % 2 == 0){
						seqnum = seqnum / 2;
						stepcount++;
					}
					else{
						seqnum = seqnum * 3 + 1;
						stepcount++;
					}
					System.out.print(seqnum + " ");
				}
				System.out.print( "(" + stepcount + ")");
				System.out.println("");
			}
			System.out.println("Every one of the first " + N +" hailstone sequences reached 1.");
		}
		if(mode.equals("c")){
			for (int i = 1; i <= N; i++){
				int stepcount = 1;
				int seqnum = i;
				if(i == 1){
					seqnum = 4;
					stepcount++;
				}
				while(seqnum != 1){
					if(seqnum % 2 == 0){
						seqnum = seqnum / 2;
						stepcount++;
					}
					else{
						seqnum = seqnum * 3 + 1;
						stepcount++;
					}
				}
			}
			System.out.println("Every one of the first " + N +" hailstone sequences reached 1.");
		}
	}
}
