package fileHandler;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AppendableObjectOutputStream extends ObjectOutputStream
{
    public AppendableObjectOutputStream(FileOutputStream fos) throws IOException
    {
        super(fos);
        // TODO Auto-generated constructor stub
    }
    //This is a function that is default in ObjectOutputStream. It just writes the
    //header to the file, by default. Here, we are just going to reset the
    //ObjectOutputStream
    @Override
    public void writeStreamHeader() throws IOException
    {
        reset();
    }

}