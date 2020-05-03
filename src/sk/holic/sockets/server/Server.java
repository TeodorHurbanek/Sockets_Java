package sk.holic.sockets.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(5001);

            while (true){
                try {
                    Socket socket = serverSocket.accept();

                    System.out.println("Klient:");

                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    String line;
                    while ((line = in.readLine()) != null ){
                        System.out.println(line);
                    }

                }catch (Exception e){

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
