package ChuoiString;
import java.util.Scanner;
public class StringBt1 {
   public static void main(String[] args) {
    String str;
    Scanner scanner = new Scanner(System.in);        
    System.out.println("Nhap chuoi ki tu: ");
    str = scanner.nextLine(); 
    String str2 = str.replaceAll(" ", "");
    System.out.println("Chuoi sau khi xoa ki tu trang la: " + str2);
}
}
