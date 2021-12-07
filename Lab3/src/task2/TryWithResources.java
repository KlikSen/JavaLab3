package task2;

import java.io.Closeable;
import java.io.IOException;

public class TryWithResources implements Closeable {
    private String resource;

    public TryWithResources(final String resource){
        this.resource = resource;
    }
    public String getResource() {
        return resource;
    }

    public void setResource(final String resource) {
        this.resource = resource;
    }

    public void read() throws IOException {

        if(true){
            throw new IOException();
        }
    }

    @Override
    public void close()  {
        System.out.println("closed");
    }
}

