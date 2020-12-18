//menghitung bunga majemuk 1%/bulan
package algoritma;
import java.io.*;
public class BungaMajemuk{
    public static void main (String [] args){
        DataInputStream dataAngka = new DataInputStream(System.in);
        
        double awal =0.0;
        double akhir =0.0;
        int bulan =0;
        int i=1;
        
        //inputan
        System.out.print("masukan saldo awal tabungan : ");
         try{
            awal = Integer.parseInt(dataAngka.readLine());
        }
        catch(IOException e) {System.out.println("error");
        }
         System.out.print("masukan jumlah bulan : ");
         try{
            bulan = Integer.parseInt(dataAngka.readLine());
        }
        catch(IOException e) {System.out.println("error");
        }
         
         while(i<=bulan){awal=awal+(awal*0.01);i=i+1;}
         System.out.println("saldo akhir anda adalah : "+awal);
       
    }
}