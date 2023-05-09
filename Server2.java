import java.lang.*;
import java.net.*;
import java.io.*;

class Server2
{
    public static void main(String arg[]) throws Exception
    {
        System.out.println("Server application is running...");
        String s1, s2;

      ServerSocket ss = new ServerSocket(1100);// shop open
        Socket s = ss.accept();//Server is in wating State
        
        System.out.println("Connection succesful");
         //Bufferedreder which accept input
        BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintStream ps = new PrintStream(s.getOutputStream());
        while((s1 = br.readLine())!= null)
        {
            System.out.println("Client Says : "+s1);
            System.out.println("Enter message for client : ");
            s2= brK.readLine();
            ps.println(s2);
        }
        s.close();
        ss.close();
        br.close();
        brK.close();
        ps.close();
    }
}