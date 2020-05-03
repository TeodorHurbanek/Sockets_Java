package sk.holic.sockets.client;

import java.io.*;
import java.net.Socket;

public class Klient {

    public static void main(String[] args) {

        try {
            Socket socket = new Socket("localhost",5001);

            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

               String word = "Dneska sa zavru volebne miestnsoti o 22:00 !\n";

               String sendMessage = word + "\n";
               bw.write(sendMessage);
               bw.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
