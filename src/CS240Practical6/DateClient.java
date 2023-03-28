package CS240Practical6;
import java.net.*;
import java.io.*;
public class DateClient
{
    public static void main(String[] args) throws IOException {
        try {
            Socket sock = new Socket("149.157.125.116",6013);
            InputStream in = sock.getInputStream();
            // bin is the input stream from the server
            BufferedReader bin = new
                    BufferedReader(new InputStreamReader(in));
            String line;
            while ( (line = bin.readLine()) != null)
                System.out.println(line);
            sock.close();
        }
        catch (IOException ioe) {
            System.err.println(ioe);
        }
    }
}