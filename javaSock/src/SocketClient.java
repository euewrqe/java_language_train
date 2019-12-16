/**
 * Created by nextgo on 2017/10/25 0025.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
public class SocketClient {
    static public void main(String[] args){

        PrintWriter out = null;
        try{
            Socket clientsocket = new Socket("127.0.0.1", 8080);
            String msg =  "hello world";
            out = new PrintWriter(clientsocket.getOutputStream());

            out.print(msg);
            out.flush();


        }catch(IOException e){
            e.printStackTrace();
        }finally {
//            out.close();
        }




    }

}
