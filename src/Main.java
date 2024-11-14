//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
class Biodata{
    String nama;
    String hobi;
    int umur;

    Biodata(String nama, String hobi, int umur)
    {
        this.nama = nama;
        this.hobi = hobi;
        this.umur = umur;
    }

    public void menyapa(){
        System.out.println("Halo nama saya: "+ this.nama);
    }
}
public class Main {
    public static void main(String[] args) {
//        int angka = 1;
//        double decimal = 0.23;
//        char karakter = 'H';
//        boolean flag = true;
//        String texting="Hidup";
//
//        System.out.println("Angka: "+angka);
//        System.out.println("Desimal: "+decimal);
//        System.out.println("Karakter: "+karakter);
//        System.out.println("Flag: "+flag);
//        System.out.println("Texting: "+texting);
//
//        int a =23;
//        int b =45;
//        int kurang = a-b;
//        int kali = a*b;
//        int bagi = a/b;
//        int modulus = a%b;
//
//        System.out.println(a+b);
//        System.out.println(kurang);
//        System.out.println(kali);
//        System.out.println(bagi);
//        System.out.println(modulus);
//
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//
//        System.out.println(!true);
//        System.out.println(!false);
//
//        boolean makan = true;
//        boolean minum = false;
//        boolean aturan = makan || minum;
//        System.out.println(aturan);
//        System.out.println(makan && minum);
//
//        int c=31;
//        int d=33;
//        System.out.println(c<=d);
//
//        int saldo = 2000000000;
//        int batas_sugih = 1000000000;
//        if(saldo >= 2000000000 && saldo >= batas_sugih)
//        {
//            System.out.println("Aku Crazy Rich");
//        }
//        else if(saldo >= batas_sugih)
//        {
//            System.out.println("Aku kaya");
//        }
//        else
//        {
//            System.out.println("Aku Miskin");
//        }
//
//        int cek = 1;
//        while(cek <=10)
//        {
//            System.out.println("aku kaya ke "+cek);
//            cek++;
//        }
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("aku kaya banget for ke "+(i+1));
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Masukan nama: ");
//        String name = scanner.nextLine();
//
//        System.out.println("Halo " + name);
//        if (name.equals("risa")) {
//            System.out.println("Apa Kabar");
//        }
//        else {
//            System.out.println("Kenalan yuk!");
//        }
//        scanner.close();

        Biodata datasaya = new Biodata("Budi","Mancing", 12);
        datasaya.menyapa();
        System.out.println(datasaya.hobi);

        String operation="";
        while(!operation.equals("t"))
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukan Operasi (t/+/-/*///%): ");
            operation = scanner.nextLine();

            if(operation.equals("t"))
            {
                System.out.println("Terima Kasih");
                scanner.close();
            }
            else if(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("%") || operation.equals("*"))
            {

                int a = getInt("Masukan bilangan pertama: ");
                int b = getInt("Masukan bilangan kedua: ");

                calc(a,b,operation);

            } else {
                System.out.println("Pilihan anda salah");
            }
        }
    }

    public static void calc(int num1, int num2, String op)
    {
        if(op.equals("+"))
        {
            System.out.println("Hasilnya: "+ (num1+num2));
        } else if(op.equals("-"))
        {
            System.out.println("Hasilnya: "+ (num1-num2));
        } else if(op.equals("*"))
        {
            System.out.println("Hasilnya: "+ (num1*num2));
        } else if(op.equals("/"))
        {
            System.out.println("Hasilnya: "+ (num1/num2));
        } else if(op.equals("%"))
        {
            System.out.println("Hasilnya: "+ (num1%num2));
        }
    }

    public static int getInt(String prompt) {
        System.out.print(prompt);
        while(true){
            try {
                return Integer.parseInt(new Scanner(System.in).next());
            } catch(NumberFormatException ne) {
                System.out.print("That's not a whole number.\n"+prompt);
            }
        }
    }
}

