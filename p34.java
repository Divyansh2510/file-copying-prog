import java.io.*;
class p34{
    public static void main(String[] args) {
        File source = new File("source.txt");
        File dest = new File("dest.txt");
        try(FileReader reader = new FileReader(source);
        FileWriter writer = new FileWriter(dest))
        {
             char[] buffer = new char[1024];
             int bytesread;
             while((bytesread = reader.read(buffer) )!=-1)
             {
                writer.write(buffer,0,bytesread);
             }
             writer.flush();
             System.out.println("file copied succesfully");
        }
        catch(Exception e)
        {
            System.out.println("error in copying"+e);
        }
           
    }
}