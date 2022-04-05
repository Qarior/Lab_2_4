import java.util.Scanner;
  
public class Main {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        char l = 'q';
      while(true){
        l=o.next().charAt(0);
        if(l=='q') break;
        System.out.println(l);
      }
  }
}