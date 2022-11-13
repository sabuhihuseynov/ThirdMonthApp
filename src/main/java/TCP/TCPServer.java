package TCP;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws Exception {
        ServerSocket ourFirstServerSocket = new ServerSocket(5678);
        while (true) {
            System.out.println("Yeni mushteri ucun gozleyirem...");
            Socket connection = ourFirstServerSocket.accept();
            System.out.println("Mushterini qebul etdim...");

            DataInputStream dataStream = new DataInputStream(connection.getInputStream());
            byte[] arr = readMessage(dataStream);
            writeBytes("C:\\Users\\ASUS\\Desktop\\Salam.jpg",arr);
        }
    }

    public static byte[] readMessage(DataInputStream din) throws Exception {
        int msgLen = din.readInt();
        byte[] msg = new byte[msgLen];
        din.readFully(msg);
        return msg;
    }
    public static void writeBytes(String fileName,byte[] data) throws Exception{
        FileOutputStream fop = new FileOutputStream(fileName);
        fop.write(data);
        fop.flush();
        fop.close();
    }

}

