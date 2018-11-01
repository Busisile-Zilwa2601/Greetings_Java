import java.util.Scanner;
class HelloWorld{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.print("Please enter your name:  ");
        String myName = key.next();
        Greetings myGreet = new Greetings();
        System.out.print("Please enter your age:  ");
        int age = key.nextInt();
        System.out.println("Hello "+ myName + " you are "+ age+ " years old");
        System.out.println();
        System.out.println(myGreet.greet(myName, "Chineese"));
        System.out.println();
        System.out.println(myGreet.getName());       
    }
}