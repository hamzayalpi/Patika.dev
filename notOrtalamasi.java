
import java.util.Scanner;

 class notOrtalamasi {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
   int matematik , turkce , kimya , fizik , müzik , tarih;
   
   
         System.out.print("Matematik Notunuzu Giriniz: ");
         matematik = scanner.nextInt();
       
         System.out.print("Türkçe Notunuzu Giriniz: ");
         turkce = scanner.nextInt();
         
         System.out.print("Kimya Notunuzu Giriniz: ");
         kimya = scanner.nextInt();
         
         System.out.print("Fizik Notunuzu Giriniz: ");
         fizik = scanner.nextInt();
         
         System.out.print("Müzik Notunuzu Giriniz: ");
         müzik = scanner.nextInt();
         
         System.out.print("Tarih Notunuzu Giriniz: ");
         tarih = scanner.nextInt();
         
         double sonuc = (matematik + turkce + kimya + fizik + müzik + tarih);
         double ortalama = sonuc / 6;
         System.out.println("Not Ortalamanız: ");
         
         String a = (ortalama >= 60) ? "Geçtiniz" : "Kaldınız";
         System.out.println(a);
}
    
}
