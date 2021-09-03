package javatutorial;

public class Strings {

	public static void main(String[] args) {
         String message = "Hello World" + "!!";
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("W"));
        System.out.println(message.endsWith("!!"));
        System.out.println(message.replace("!","*"));
	}

}
