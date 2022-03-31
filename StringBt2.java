
package ChuoiString;
import java.util.Scanner;
public class StringBt2 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message;
    System.out.println("\n\nNhập vào chuỗi cần in hoa ký tự đầu: ");
    message = sc.nextLine();
    char[] charArray = message.toCharArray();
    boolean foundSpace = true;
    for(int i = 0; i < charArray.length; i++) {
      if(Character.isLetter(charArray[i])) {       
        if(foundSpace) {  
          charArray[i] = Character.toUpperCase(charArray[i]);
          foundSpace = false;
        }
      }
      else {
        foundSpace = true;
      }
    }
    message = String.valueOf(charArray);
    System.out.println("Chuỗi sau khi đổi: \n" + message);    
}
}
