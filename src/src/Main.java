import  java.io.BufferedReader;
import  java.io.IOException;
import  java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Data :");
//        String dataInput = reader.readLine();
        int data = Integer.parseInt(reader.readLine());

        String[] nama = new String[data];
        Integer[] umur = new Integer[data];
        int numb = 1;
        for (int a = 0; a < data; a++) {

            System.out.println(" data ke - " + numb++ );
            System.out.print("Nama   : ");
            nama[a] = reader.readLine();
            System.out.print("Umur    :");
            umur[a] = Integer.parseInt(reader.readLine());
        }

        System.out.println("+==============Output===========+");


        System.out.println("|Nama| Umur|");
        for (int a = 0; a < data; a++) {
            System.out.print("|" + nama[a] + "|");
            System.out.println(umur[a] + "|");



        }
    }
}
//}