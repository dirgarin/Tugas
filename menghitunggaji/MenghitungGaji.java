package menghitunggaji;
   
import java.util.Scanner;

class MenghitungGaji {
  public static void main(String args[]){
     try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Masukan golongan anda");
            String golongan = scan.nextLine();
            System.out.println("Apakah anda sudah menikah? (y/n)");
            String menikah = scan.nextLine();
            System.out.println("Apakah anda sudah punya anak? (y/n)");
            String punyaAnak = scan.nextLine();
            if (menikah.equals("y")) {
                if (punyaAnak.equals("y")) {
                    System.out.println("Berapa anak anda?");
                    int jumlahAnak = scan.nextInt();
                    if (jumlahAnak > 3) {
                        System.out.println("Maaf, tunjuangan anak hanya maksimal 3 anak");
                        System.exit(0); 
                    }
                Gaji gajipokok = new Gaji(golongan, (menikah == "y"), jumlahAnak);
                System.out.println("Total gaji anda adalah " + gajipokok.totalGaji());
            } else {
                Gaji gajipokok = new Gaji(golongan, (menikah == "y"), 0);
                System.out.println("Total gaji anda adalah " + gajipokok.totalGaji());
            }
        }
    }
            
}
}