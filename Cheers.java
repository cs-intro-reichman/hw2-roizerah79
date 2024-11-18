// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String input = args[0];
            int repeat = Integer.parseInt(args[1]);
            input = input.toUpperCase();
            String forstring = "AEFHILMNORSX";
            for(int i = 0; i < input.length(); i++){
                String indexcheck = "";
                if(forstring.indexOf(input.charAt(i))== -1){
                        indexcheck = "a ";
                }
                else{
                        indexcheck = "an";
                }
                System.out.println("Give me " + indexcheck + " " + input.charAt(i) +": " + input.charAt(i) + "!");
            }
            System.out.println("What does that spell?");
            for(int i=0;i < repeat; i++){
            System.out.println(input + "!!!");
            }
        }
}
