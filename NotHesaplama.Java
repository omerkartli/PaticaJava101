package Giris;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner notlar= new Scanner(System.in);


        System.out.println("Matematik notu gir:");
        mat = notlar.nextInt();


        System.out.println("Fizik  notu:");
        fizik = notlar.nextInt();

        System.out.println("kim");
        kimya = notlar.nextInt();

        System.out.println("turkçe");
        turkce=notlar.nextInt();

        System.out.println("tar");
        tarih= notlar.nextInt();

        System.out.println("muz");
        muzik= notlar.nextInt();

        double sonuc = (mat+fizik+kimya+tarih +turkce+muzik)/6.00;

        System.out.println("ortalamanız:"+ sonuc);

        String str = (sonuc>60) ? "sınıfı geçti"  :  "Sınıfta kaldı";
        System.out.println(str);




    }
}
