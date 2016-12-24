import java.util.*;
public class CoPrimeCheck{
  public static void main(String[] args) {
    int a=0;
    int b=0;
    Scanner scanner = new Scanner(System.in);
    a= scanner.nextInt();
    b= scanner.nextInt();
    if(a<b){
      int temp=a;
      a=b;
      b=temp;
    }
    while(b!=0){
      int temp=b;
    b=a%b;
    a=temp;
    }
    if(a==1){
      System.out.println("Co Prime");
    }else {
      System.out.println("Not Co Prime");
    }
  }
}
