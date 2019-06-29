/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 * NAMA : RIAN RIANSAH
 * NIM  : A2.1700145
 * KELAS: TI IVE J&S KARYAWAN
 */
public class uaspbosuperheroavenger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        spiderman sp = new spiderman();
        sp.setnamaSuperhero("spiderman");
        sp.setSuperhero1("\n Kekuatan manusia super, kecepatan, stamina, ketangkasan, dan daya tahan\n" +
        "Daya sembuh yang cepat\n" +
        "Kemampuan untuk berpegangan pada banyak permukaan\n" +
        "Kemampuan untuk menembakkan jaring laba-laba dari pergelangan tangan\n" +
        "Panca indera laba-laba\n" +
        "Tingkat akal jenius");
        System.out.println("nama avenger : "+sp.getnamaSuperhero());
        System.out.println("karakter avenger : "+sp.getSuperhero1());
        
        iron_man im = new iron_man();
        im.setnamaSuperhero("iron man");
        im.setSuperhero2("\n Genius tingkat tinggi\n" +
        "Sangat kuat dan berdaya tahan tinggi\n" +
        "Kecepatan terbang mencapai Mach 3\n" +
        "Energi repulsor\n" +
        "Misil\n" +
        "Regenerasi");
        System.out.println("nama avenger : "+im.getnamaSuperhero());
        System.out.println("karakter avenger : "+im.getSuperhero2());
        
        thor th = new thor();
        th.setnamaSuperhero("thor");
        th.setSuperhero3("\n Dewa yang memiliki kekuatan hebat\n" +
        "Thor merupakan salah satu dewa Norwegia yang memiliki kekuatan besar\n" +
        "Dengan kekuatannya, ia berusaha melindungi Asgard dan Midgard\n" +
        "Ia juga dikenal sebagai Dewa petir.");
        System.out.println("nama avanger : "+th.getnamaSuperhero());
        System.out.println("karakter avanger : "+th.getSuperhero3());
        
        winter_soldier ws =new winter_soldier();
        ws.setnamaSuperhero("winter soldier");
        ws.setSuperhero4("\n Penembak Jitu");
        System.out.println("nama avenger : "+ws.getnamaSuperhero());
        System.out.println("karakter avenger : "+ws.getSuperhero4());
        
        capt_america cp= new capt_america();
        cp.setnamaSuperhero("captain america");
        cp.setSuperhero5("Kekuatan, kelincahan, kecepatan, dan stamina diatas rata rata manusia normal\n" +
        "Menguasai bela diri, taktik, dan seorang penembak jitu\n" +
        "Memegang perisai dari logam Vibranium\n" +
        "Komandan lapangan yang sangat cerdas dan disiplin");
        System.out.println("nama avenger : "+cp.getnamaSuperhero());
        System.out.println("karakter avenger : "+cp.getSuperhero5());
    }
    
    }
