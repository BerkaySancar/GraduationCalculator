import java.util.Scanner;

public class GraduationCalculator {
    public static void main(String[] args) {
        /*
         *  Matematik, Fizik, Kimya, Türkçe, Tarih ve Müzik derslerinin sınav puanlarını kullanıcıdan al.
         *
         *  Ortamalarını alıp ekrana yazdır.
         *
         *  Ortalama 60 dan büyük ise ekrana "Sınıfı Geçti", küçük ise "Sınıfta Kaldı" yazsın.
         *
         *  Not: If else kullanma.
         *
         * */
        Scanner input = new Scanner(System.in);
        double mat, physic, chem, tr, history, music, average;
        System.out.print("Matematik notunuz: ");
        mat = input.nextDouble();
        System.out.print("Fizik notunuz: ");
        physic = input.nextDouble();
        System.out.print("Kimya notunuz: ");
        chem = input.nextDouble();
        System.out.print("Türkçe notunuz: ");
        tr = input.nextDouble();
        System.out.print("Tarih notunuz: ");
        history = input.nextDouble();
        System.out.print("Müzik notunuz: ");
        music = input.nextDouble();
        average = (mat + physic + chem + tr + history + music) / 6;
        String graduate = (average < 60) ? " Sınıfta Kaldı." : " Sınıfı Gecti.";
        System.out.print("Not Ortalamanız: " + average + graduate);
    }
}
