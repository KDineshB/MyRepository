import java.util.*;
public class PrintOnInput {
  public static void main(String[] args) {
    String input;
    Scanner scanner;
    String alpha="";
    String num="0";
    String output="";
    int times=0;

    scanner= new Scanner(System.in);
    input=scanner.nextLine();
    for (int i=0; i<input.length();i++ ) {
      if(checkAlphabet(input.charAt(i))){
        alpha+=input.charAt(i);
        if(i+1==input.length())
        break;
      }else if(checkNumber(input.charAt(i))){
        num+=input.charAt(i);
        times=Integer.parseInt(num);
        if(i+1==input.length()||checkAlphabet(input.charAt(i+1))){
      for (int j=0;j<times;j++ ) {
        output+=alpha;
          }
          num="0";
          alpha="";
        }
      }else{
        System.out.println("Invalid");
        break;
      }
    }
    System.out.println(output);
  }

  public static boolean checkAlphabet(char c){
    if ((c>64 && c<91) || (c>96 && c<123)) {
      System.out.println("alphabet"+"true");
      return true;

    }else{
      return false;
    }
  }

  public static boolean checkNumber(char c){
    if(c>47 && c<58){
      System.out.println("Number"+"true");
      return true;
    }else{
      return false;
    }
  }

}
