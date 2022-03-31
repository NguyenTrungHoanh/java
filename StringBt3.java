package ChuoiString;
import java.util.Scanner;
public class StringBt3 {
     public static void NhapMang(char[] array,int n){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
        System.out.println("Phan tu thu " + (i+1) + ": ");
        array[i] =  scanner.next().charAt(0);   }  
        System.out.println("Mang vua tao: ");
        for(int i=0;i<n;i++)        
         {
            System.out.printf(array[i]+" ");}  
        }  
       
    public static void main(String args[])
    { 
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("So phan tu cua mang: ");
        n = scanner.nextInt();
        char[] ch = new char[n];
        NhapMang(ch,n);
        String str = String.valueOf(ch);
        System.out.println("Chuoi String la: "+str);
    }
}