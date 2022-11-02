package Giris;

import java.util.Scanner;

public class VucutKitleEndeksiBMI {
    public static void main(String[] args) {
        double height, weight;

        Scanner inpData = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height = inpData.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz");
        weight = inpData.nextDouble();
        double BMI = weight/(height*height);
        System.out.println("Vücut kitle endeksiniz: " + BMI);
    }
}
