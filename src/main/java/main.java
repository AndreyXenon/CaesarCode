import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("[A шифрование] [J расшифровка], пожалуйста, выберите один");
        Scanner c=new Scanner(System.in);
        String s1=c.nextLine();
        if(s1.equalsIgnoreCase("A")) {
            System.out.println("Пожалуйста, введите простой текст:");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println("Пожалуйста, введите ключ:");
            Scanner sc1=new Scanner(System.in);
            int key=sc1.nextInt();
            System.out.println(Encryption(s,key));
        }
        else if(s1.equalsIgnoreCase("J")) {
            System.out.println("Пожалуйста, введите зашифрованный текст:");
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            System.out.println("Пожалуйста, введите ключ:");
            Scanner sc1=new Scanner(System.in);
            int key=sc1.nextInt();
            System.out.println(Decrypt(s,key));
        }
    }

    public static String Decrypt(String str, int n) {
        int k=Integer.parseInt("-"+n);
        String string = "";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')
            {
                c+=k%26;
                if(c<'a')
                    c+=26;
                if(c>'z')
                    c-=26;
            }
            else if(c>='A'&&c<='Z')
            {
                c+=k%26;
                if(c<'A')
                    c+=26;
                if(c>'Z')
                    c-=26;
            }
            string +=c;
        }
        return string;
    }

    public static String Encryption(String str, int k) {
        String string="";
        for(int i=0;i<str.length();i++) {
            char c=str.charAt(i);
            if(c>='a'&&c<='z')
            {
                c+=k%26;
                if(c<'a')
                    c+=26;
                if(c>'z')
                    c-=26;
            }
            else if(c>='A'&&c<='Z')
            {
                c+=k%26;
                if(c<'A')
                    c+=26;
                if(c>'Z')
                    c-=26;
            }
            string +=c;
        }
        return string;
    }
}