
package ChuoiString;
import java.util.Scanner;
public class StringBt6 {
   public static void main(String[] args) {
    String str;
    char kyTu;
    int count = 0;
    Scanner scanner = new Scanner(System.in);      
    System.out.println("Nhap chuoi bat ki: ");
    str = scanner.nextLine();
    System.out.println("Nhap ki tu: ");
    kyTu = (char) scanner.next().charAt(0);
    System.out.println("Vi tri xuat hien ki tu trong chuoi la:");
    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == kyTu) {
            count++;
            System.out.printf((i+1)+" ");
        }
    }    
    System.out.println("\nSo lan ki tu " + kyTu +
        " xuat hien trong chuoi " + str + " là: " + count);
} 
}
