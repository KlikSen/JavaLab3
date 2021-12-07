package task2;

import java.io.IOException;

public class Main {
    public static void main(final String[] args) {
        try(final TryWithResources resource = new TryWithResources("randomResource")){
            resource.read();
        } catch (final IOException e){
            System.out.println("catch IOException");
        }
    }
}
