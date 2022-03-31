
package ChuoiString;
import java.util.Scanner;
public class StringBt4 {
    public static void main(String[] args) {
    String str;
    char kyTu;
    Scanner scanner = new Scanner(System.in);      
    System.out.println("Nhập vào chuỗi bất kỳ: ");
    str = scanner.nextLine();  
    System.out.println("Các ký tự có trong chuỗi là: ");
    for (int i = 0; i < str.length(); i++) {
        kyTu = str.charAt(i);      
        System.out.printf(kyTu+" ");
    }
}
    
}
