/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asistemsipbo;

/**
 *
 * @author Hellau
 */
public class BangunDatar {
    protected String jenis;
    public BangunDatar(){
        jenis = "jenis";
    }
    public BangunDatar(String jenis){
        this.jenis = jenis;
    }
    public void view(){
        System.out.println("Pilih bangun data yang diinginkan");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
    }
}

class Persegi extends BangunDatar{
    protected double sisi;
    public Persegi(double sisi) {
       this.sisi = sisi;
    }
    public double luas(double sisi){
        return sisi*sisi;
    }
    public double keliling(double sisi){
        return sisi+sisi+sisi+sisi;
    }
    public void view(){
        System.out.println("Nama bangun datar adalah persegi");
        System.out.println("Luasnya adalah "+(int)luas(sisi)+"cm^2");
        System.out.println("Kelililng adalah "+(int)keliling(sisi)+"cm");
    }
}

class Lingkaran extends BangunDatar{
    protected double jarijari;
    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }
    public double luas(double jarijari){
        return 3.14*jarijari*jarijari;
    }
    public double keliling(double jarijari){
        return 2*3.14*jarijari;
    }
    public void view(){
        System.out.println("Nama bangun datar adalah lingkaran");
        System.out.println("Luas lingkaran adalah "+luas(jarijari));
        System.out.println("Kelililng lingkaran adalah "+keliling(jarijari));
    }
}

class Segitiga extends BangunDatar{
    protected double alas,tinggi;
    public Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double luas(double alas, double tinggi){
        return alas*tinggi/2;
    }
    public void view(){
        System.out.println("Nama bangun datar adalah segitiga");
        System.out.println("Luas segitiga adalah "+luas(alas, tinggi));
    }
}

class JenisSegitiga extends Segitiga{

    public JenisSegitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }
    public double SisiMiring(double alas, double tinggi){
        return Math.sqrt((Math.pow(alas, 2))+(Math.pow(tinggi, 2)));
    }
    public double Keliling(double sisi){
        return sisi+sisi+sisi;
    }
    public double Keliling(double alas,double tinggi){
        return alas+tinggi+SisiMiring(alas, tinggi);
    }
    public void view(double sisi){
        System.out.println("Jenis segitiga adalah Segitiga Sama Sisi");
        System.out.println("Keliling segitiga adalah "+Keliling(sisi));
    }
    public void view(double alas, double tinggi){
        System.out.println("Jenis segitiga adalah Segitiga Siku-siku");
        System.out.println("Keliling segitiga adalah "+Keliling(alas, tinggi));
    }
}