// import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    /**
     * // * @param args
     * //* @throws Exception
     */
    static void kosong(){
        String x = "\nTekan enter untuk melanjutkan...";
        System.out.print(x);
        System.console().readPassword();
    }

    static void clear(){
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception ex){
            System.out.println("\033\143");
        }
    }
    public static void main(String[] args) {
        ArrayList<animes> anime = new ArrayList<animes>();
        
        while(true){
            clear();

            System.out.println("--------- Menu Utama ----------");
            System.out.println("1. menambahkan anime");
            System.out.println("2. melihat anime");
            System.out.println("3. hapus anime");
            System.out.println("4. ubah anime");
            System.out.println("0. berhenti");
            System.out.print("nomor berapa : ");
            int nomor = (new error()).cek_int();
            clear();
            if(nomor == 1){
                anime.add(new animes().tambah());
            }
            else if(nomor == 2){
                System.out.println("Daftar anime yang ada");
                for(int i =0;i<anime.size();i++){
                    System.out.println((i+1)+". "+anime.get(i).nama);
                }
                System.out.print("ingin melihat detail anime nomor : ");int detail = (new error()).cek_int();
                clear();
                anime.get(detail-1).display();
                kosong();
            }
            else if(nomor == 3){
                System.out.println("Daftar anime yang ada");
                for(int i =0;i<anime.size();i++){
                    System.out.println((i+1)+". "+anime.get(i).nama);
                }
                System.out.println("ingin menhapus anime nomor : ");int detail = (new error()).cek_int();
                clear();
                anime.get(detail-1).display();
                System.out.println("yakin ingin menghapus anime (y / n): "); String yakin = (new error()).cek_string();
                if(yakin.toUpperCase().equals("Y")){
                    anime.remove(detail-1);
                    System.out.println("anime berhasil di hapus");
                    kosong();
                }
                else{
                    System.out.println("anime tidak jadi di hapus");
                    kosong();
                }
            }
            else if(nomor == 4){
                System.out.println("Daftar anime yang ada");
                for(int i =0;i<anime.size();i++){
                    System.out.println((i+1)+". "+anime.get(i).nama);
                }
                System.out.println("ingin mengubah anime nomor : ");int detail = (new error()).cek_int();
                clear();
                anime.get(detail-1).ubah();
                kosong();
            }
            else if( nomor == 0){
                System.exit(0);
            }
        }
    }
}