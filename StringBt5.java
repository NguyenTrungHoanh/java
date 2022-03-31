
package ChuoiString;
import java.util.Scanner;
public class StringBt5 {
    static void DemKyTu(String str)
    {
        int counter[] = new int[256];
        int len = str.length();
        for (int i = 0; i < len; i++)
            counter[str.charAt(i)]++;
        char array[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Ki tu " + str.charAt(i) + " xuat hien " + counter[str.charAt(i)] +" lan.");
        }
    }
    public static void main(String[] args)
    {   Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String str = scanner.nextLine();
        System.out.println("Chuoi la: "+ str);
        DemKyTu(str);
    }
}
