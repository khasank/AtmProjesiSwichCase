import java.util.Scanner;

public class AtmProjesiSwichCase {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adı : ");
            userName = input.next();
            System.out.print("Şifre : ");
            password = input.next();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz  ");

                do {

                    System.out.println("1 - Para Yatırma\n2 - Para Çekme\n3 - Bakiye Sorgula\n4 - Çıkış ");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1 -> {
                            System.out.print("Para Miktarı : ");
                            int price = input.nextInt();
                            balance = price + balance;
                            System.out.println("Yeni Bakiyeniz : " + balance + " TL");
                        }
                        case 2 -> {
                            System.out.print("Para Miktarı : ");
                            int price = input.nextInt();
                            if (price > balance) {
                                System.out.print("Bakiye Yetersiz.");
                            } else {
                                balance = balance - price;
                                System.out.println("Yeni Bakiyeniz : " + balance + " TL");
                            }
                        }
                        case 3 -> System.out.println("Bakiyeniz : " + balance + " TL");
                    }

                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere ");
                break;

            } else {
                right--;
                System.out.println("Hatalı giriş yaptınız. Tekrar deneyin. ");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz. ");
                } else System.out.println("Kalan hakkınız : " + right);
            }
        }
    }
}
