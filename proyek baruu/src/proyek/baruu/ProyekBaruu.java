/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyek.baruu;

/**
 *
 * @author pplgk
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProyekBaruu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hallo Dunia");
        System.out.println("Halo"+""+"Dunia");
        System.out.println(2+""+5);
        System.out.println(2+5);
        System.out.println("Angka"+""+5);
        System.out.println("2+5"+"="+2+5);
        System.out.println("2+5"+"="+(2+5));
        
        String namaDepan ;
        String namaBelakang ;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Nama depan : ");
//membaca inputan user
        namaDepan = input.next();
        System.out.println("Nama belakang : ");
//membaca inputan user
        namaBelakang = input.next();
        System.out.println("Nama Saya adalah :");
        System.out.println(namaDepan + " " + namaBelakang);

       String nama = JOptionPane.showInputDialog("Masukkan Nama:");
       System.out.println("Nama : " + nama);
       
       String a = JOptionPane.showInputDialog("Masukan nilai untuk variabel a : ");
       String b = JOptionPane.showInputDialog("Masukan nilai untuk variabel b : ");
       System.out.println("Hasil :" + (Integer.parseInt(a) * Integer.parseInt(b)));
       
       String namanya = "alica" ;
       String jurusan = "barcelona" ;
       JOptionPane.showMessageDialog(null, "Halo " + namanya + ", team Kamu " + jurusan);
       
       JOptionPane.showMessageDialog(null, "Sebuah Informasi.","Informasi", JOptionPane.INFORMATION_MESSAGE);
       
       JOptionPane.showMessageDialog(null, "Sebuah Error !","Error", JOptionPane.ERROR_MESSAGE);
       
       JOptionPane.showMessageDialog(null, "Sebuah Peringatan.","Peringatan", JOptionPane.WARNING_MESSAGE);
       
       JOptionPane.showMessageDialog(null, "Sebuah Pertanyaan.", "Pertanyaan", JOptionPane.QUESTION_MESSAGE);
       
       JOptionPane.showMessageDialog(null, "Sebuah Plain Message.","Plain Message", JOptionPane.PLAIN_MESSAGE);
       
       int pertanyaan = JOptionPane.showConfirmDialog(null, "barca or madrot?", "Pertanyaan",JOptionPane.YES_NO_OPTION);
       if(JOptionPane.YES_OPTION == pertanyaan)
          JOptionPane.showMessageDialog(null, "Kamu memilih barca imut lucu gemes.");
       else if(JOptionPane.NO_OPTION == pertanyaan)
          JOptionPane.showMessageDialog(null, "Kamu tidakmemilih madrot haram aneh jelek.");
       
       

}
}