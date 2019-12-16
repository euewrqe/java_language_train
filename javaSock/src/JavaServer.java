/**
 * Created by nextgo on 2017/10/25 0025.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
public class JavaServer {
    static public void main(String[] main){
        ServerSocket serversocket = null;
        Socket clientsocket = null;
        BufferedReader br = null;
        try{
            //创建套接字
            serversocket = new ServerSocket(8080);

            //等待客户端连接
            clientsocket = serversocket.accept();
            System.out.println(clientsocket);

            br = new BufferedReader(new InputStreamReader(
                    clientsocket.getInputStream())
            );
            int i;
            char[] temp = new char[1024];
            try{
                while((i = br.read(temp)) != -1){
                    System.out.println(new String(temp, 0 ,i));
                }
            }catch(IOException e){
                e.printStackTrace();
            }


        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(br != null){
                try{
                    br.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }

            if(clientsocket != null){
                try{
                    clientsocket.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

            if(serversocket != null){
                try{
                    serversocket.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }


    }
}
