package main;

import java.util.Scanner;

import static TCP.TCPClient.Client;

public class Main {
    public static void main(String[] args) throws Exception {
        User u = Util.getUserNameAndSurname();
        Scanner sc  = new Scanner(System.in);
        System.out.println("Zəhmət olmasa göndərmək istədiyiniz faylın yerləşdiyi keçidi qeyd edin :");
        String fileName = sc.nextLine();
        System.out.println("Bu fayli göndərmək istədiyiniz şəxsin(serverin) ip və portunu daxil edin(meselen localhost:5678):");
        String str = sc.nextLine();
        String[] arr = str.split(":");
        String iP = arr[0];
        int port = Integer.parseInt(arr[1]);
        Client(iP,port,fileName);
        System.out.println("Fayl ugurla gonderildi");
    }
}
