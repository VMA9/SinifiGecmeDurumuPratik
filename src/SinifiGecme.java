import java.util.Scanner;

public class SinifiGecme {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz : ");
        mat = input.nextInt();


        System.out.print("Fizik Notunu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunu Giriniz : ");
        muzik = input.nextInt();

        double avarage = (mat + fizik + turkce + kimya + muzik) / 5;
        if (avarage <= 0){
            System.out.println("5 Dersin Notları 0 ile 100 aralığında belirtilmelidir. ");
            System.out.println("Yanlış hesaplanmıştır ! ");
        } else if (avarage > 100) {
            System.out.println("5 Dersin Notları 0 ile 100 aralığında belirtilmelidir. ");
            System.out.println("Yanlış hesaplanmıştır !");
        } else if (avarage < 55) {
        System.out.println("Sınıfta Kaldınız, seneye tekrar görüşmek üzere !");
        System.out.println("Ortalama Notunuz : " + avarage);
        }else {
            System.out.println("Tebrikler Sınıfı Geçtiniz !");
            System.out.println("Ortalama Notunuz : " + avarage);
        }

    }
}
