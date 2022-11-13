package TCP;

import java.io.*;
import java.net.Socket;

public class TCPClient {

    public static void Client(String host,int port,String fileName) throws Exception {
        Socket socket = new Socket(host, port);
        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        byte[] bytes = readBytes(fileName);
        dataOutputStream.writeInt(bytes.length);
        dataOutputStream.write(bytes);
        socket.close();
    }
    public static byte[] readBytes(String fileName) throws Exception {
        File file = new File(fileName);
        try ( FileInputStream fileInputStream = new FileInputStream(file);) {

            byte[] bytesArray = new byte[(int) file.length()];

            fileInputStream.read(bytesArray);
            return bytesArray;
        }
    }
}

