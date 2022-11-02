package IfElse;

import java.util.Scanner;

public class kulaciGiris {
    public static void main(String[] args) {
        String usurName, password;

        Scanner inpUP= new Scanner(System.in);
        System.out.println("Kullab-nıcı adı giriniz:");
        usurName= inpUP.nextLine();
        System.out.println("Şifre giriniz: ");
        password =inpUP.nextLine();


        if (usurName.equals("omerkartli") && password.equals("kartli124")){
            System.out.println("giriş başarılı");
        }
        else {
            System.out.println("bilgilei kontrol et");
        }
    }
}
