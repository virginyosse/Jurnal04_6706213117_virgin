import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList <Songs> song = new LinkedList<Songs>();
        int pilihan;

        do {
            System.out.println("Pilihlah Menu:");
            System.out.println("1. Input Lagu");
            System.out.println("2. Hapus lagu terakhir");
            System.out.println("3. Hapus lagu pilihan");
            System.out.println("4. Putar lagu");
            System.out.println("5. Keluar");

            pilihan=in.nextInt();

            switch (pilihan){
                case 1:
                    System.out.println("Judul Lagu: ");
                    String judulLagu=in.next();
                    System.out.println("Penyanyi: ");
                    String penyanyi=in.next();
                    song.add(new Songs(judulLagu,penyanyi));
                    break;
                case 2:
                    song.removeLast();
                    break;
                case 3:
                    System.out.println("Judul lagu apa yang mau di hapus?");
                    String judulLagu2= in.next();
                    System.out.println();
                    for (int i = 0 ; i < song.size() ; i++) {
                        if(judulLagu2.equals(song.get(i).getjudulLagu())){
                            song.remove(song.get(i));
                      }
                    }

                    break;
                case 4:
                    System.out.println("Menampilkan dari awal list");
                    ListIterator<Songs> iterator = song.listIterator();
                    while (iterator.hasNext()){
                        System.out.println(iterator.next());
                    }
                    System.out.println();
                    System.out.println("Menampilkan dari akhir list");
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case 5:
                    break;
                    }
            }while (pilihan!=5);
        }
    }

