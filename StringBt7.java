
package ChuoiString;
import java.util.Scanner;
public class StringBt7 {
   public static void main(String[] args) {
    String str;
    Scanner scanner = new Scanner(System.in);        
    System.out.println("Nhap chuoi ki tu: ");
    str = scanner.nextLine(); 
    char[] ch = str.toCharArray();
    String text = "";
    for(int i=ch.length-1;i>=0;i--) {
      text = text + ch[i];
    }
    System.out.println("Chuoi ban dau: " + str);
    System.out.println("Chuoi dao nguoc: " + text);
  }
}
