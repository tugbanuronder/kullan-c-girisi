import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        String username,password,newpassword;
        int select;

        System.out.print("Kullanici adi giriniz:");
        username=input.nextLine();
        System.out.print("Sifre giriniz:");
        password=input.nextLine();

        boolean username_ = username.equals("patika");
        boolean pw = password.equals("java123");

        if(username_==true && pw==true)
        System.out.println("Giris Yaptiniz!");

        else if (username_==false && pw==true){
            System.out.println("Kullanici bulunamadi. Tekrar deneyiniz.");
        }

        else if(username_==true && pw==false){
            System.out.println("Yanlis sifre girdiniz.Sifrenizi sifirlamak ister misiniz?");
            System.out.println("1-Sifreyi sifirla.\n2-Sifreyi sifirlama.");
            select= input.nextInt();
            switch(select){
                case 1:
                    Scanner inp=new Scanner(System.in);
                    System.out.println("Yeni sifrenizi giriniz:");
                    newpassword=inp.nextLine();
                    if(newpassword.equals("patika") || newpassword.equals(password)){
                        System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                    }
                    else {
                        System.out.println("Sifre olusturuldu");
                    }
                    break;
                case 2:
                    System.out.println("Giris isleminiz sonlandirildi.");
                    break;
                default:
                    System.out.println("Boyle bir islem bulunamadi.");
            }

        }

    }

}
