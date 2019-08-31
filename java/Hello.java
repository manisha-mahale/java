public class Hello {   // To save as "Hello.java" under "~/myProject"
   public static void main(String[] args) {
   	System.out.println("Enter a string to Palindrome - ");
   	String userInput = System.console().readLine();
   	String temp[] = new String[3];
   	int j = 0;
   	for(int i = userInput.length(); i >= 1 ; i--) {
   		temp[j] = userInput.split("")[i-1];
   		j++;
   	}
   	System.out.println(String.join("", temp));
    if( userInput.equals(String.join("", temp))) {
    	System.out.println("Palindrome");
    }else{
    	System.out.println("Not Palindrome");
    }
   }
}