import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int pilihanMenu;
        Scanner input = new Scanner(System.in);
        Isi[] arr = new Isi[100];
        System.out.println("-----------[Vio Cakery]-----------");
        System.out.println("|        1. Add Member (first)   |");
        System.out.println("|        2. Menu and Order       |");
        System.out.println("|        3. Exit                 |");
        System.out.println("----------------------------------");

        int indeksAcc = 0, noMember = 1;
        String Nama, Alamat;
        int Menu, totalPrice = 0, member;


        do {
            System.out.println("  Pilihan [1/2/3] :   ");
            pilihanMenu = input.nextInt();
            switch (pilihanMenu) {
                case 1:
                    System.out.print("Nama :");
                    Nama = input.next();
                    System.out.println("No Account : " + noMember);
                    System.out.println("Alamat :");
                    Alamat = input.next();
                    arr[indeksAcc] = new Isi(noMember, Nama, Alamat);
                    System.out.println("Pembuatan member berhasil!\n\n");
                    indeksAcc++;
                    noMember++;
                    break;
                case 2:
                    System.out.println("-----------------[MENU]----------------");
                    System.out.println("|  1. Brownies with 6 Toppings | 30K  |");
                    System.out.println("|  2. Pudding Oreo             |  6K  |");
                    System.out.println("|  3. Mango Milk               |  8K  |");
                    System.out.println("|  4. Chiffon Cake             | 40K  |");
                    System.out.println("---------------------------------------");
                    System.out.println("|                5. PAID              |");
                    System.out.println("|                6. EXIT              |");
                    System.out.println("---------------------------------------");

                    System.out.println("\n");
                    displayAccounts(arr,indeksAcc);
                    System.out.println("\n");

                    System.out.println("member: ");
                    member = Integer.parseInt(input.next());


                    do {
                        System.out.println("-------------[PLACE ORDER]-------------");
                        System.out.println("       Menu [ 1/2/3/4/5/6 ]: ");
                        Menu = Integer.parseInt(input.next());
                        int Quantity=0, price=0;

                        if (Menu == 1) {
                            price = 30000;
                            System.out.println("Quantity: ");
                            Quantity = Integer.parseInt(input.next());
                            totalPrice = totalPrice+(arr[member-1].pesan(Quantity, price));
                        }
                        if (Menu == 2) {
                            price = 6000;
                            System.out.println("Quantity: ");
                            Quantity = Integer.parseInt(input.next());
                            totalPrice = totalPrice+(arr[member-1].pesan(Quantity, price));
                        }
                        if (Menu == 3) {
                            price = 8000;
                            System.out.println("Quantity: ");
                            Quantity = Integer.parseInt(input.next());
                            totalPrice = totalPrice+(arr[member-1].pesan(Quantity, price));
                        }
                        if (Menu == 4) {
                            price = 40000;
                            System.out.println("Quantity: ");
                            Quantity = Integer.parseInt(input.next());
                            totalPrice = totalPrice+(arr[member-1].pesan(Quantity, price));
                        }
                        if (Menu == 5) {
                            System.out.println("----------------------");
                            System.out.println("Total harga: " +totalPrice );
                            System.out.println("----------------------");
                        }
                    }
                    while (Menu != 6) ;
                            break;
                case 3:
                    break;
            }
            }

            while (pilihanMenu != 4) ;
            System.out.println("TERIMA KASIH");
        }

    static void displayAccounts(Isi[] acc,int pembatas){
        System.out.println("---------------------");
        System.out.println("   Account | Name    ");
        System.out.println("---------------------");
        for(int i=0; i < pembatas ; i++){
            System.out.println(acc[i].getNoMember()+"             "+acc[i].getNama());
        }
    }


}
