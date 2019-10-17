/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistemsipbo;
import java.util.Scanner;
/**
 *
 * @author Hellau
 */
public class test {
    public static void main(String[] args) {
        boolean running = true;
        Scanner JBD = new Scanner(System.in);
        BangunDatar BD = new BangunDatar();
        BD.view();
        while(running){
            System.out.print("Masukkan pilihan anda : ");
            double jenis = JBD.nextDouble();
            if(jenis == 1){
                System.out.print("Masukkan panjang sisi : ");
                double sisi = JBD.nextDouble();
                BangunDatar P = new Persegi(sisi);
                P.view();
                running = false;
            }
            else if(jenis == 2){
                System.out.print("Masukkan panjang jari-jari : ");
                double jarijari = JBD.nextDouble();
                BangunDatar L = new Lingkaran(jarijari);
                L.view();
                running = false;
            }
            else if(jenis == 3){
                System.out.println("Pilihan segitiga yang diinginkan");
                System.out.println("1. Segitiga siku-siku");
                System.out.println("2. Segitiga sama sisi");
                while(running){
                    System.out.print("Masukkan pilihan anda : ");
                    double pilihansegitiga = JBD.nextDouble();
                    if(pilihansegitiga == 1){
                        System.out.print("Masukkan panjang alas : ");
                        double alas = JBD.nextDouble();
                        System.out.print("Masukkan panjang tinggi : ");
                        double tinggi = JBD.nextDouble();
                        BangunDatar S = new Segitiga(alas, tinggi);
                        S.view();
                        JenisSegitiga s = new JenisSegitiga(alas, tinggi);
                        s.view(alas, tinggi);
                        running = false;
                    }
                    else if(pilihansegitiga == 2){
                        System.out.print("Masukkan panjang alas : ");
                        double alas = JBD.nextDouble();
                        System.out.print("Masukkan panjang tinggi : ");
                        double tinggi = JBD.nextDouble();
                        BangunDatar S = new Segitiga(alas, tinggi);
                        S.view();
                        JenisSegitiga s = new JenisSegitiga(alas, tinggi);
                        s.view(alas);
                        running = false;
                    }
                    else{
                        System.out.println("Tidak ada dalam pilihan segitiga");
                    }
                }  
            }
            else
                System.out.println("Tidak ada dalam pilihan");
        }
    }
}
