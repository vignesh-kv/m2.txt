import java.util.Scanner;
class iq{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
boolean number = scan.nextBoolean();
String result = number?"a is greater":"b is greater";
System.out.printf(result);
}
}