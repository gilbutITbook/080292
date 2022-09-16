package modern.challenge;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        final Path path = Paths.get("C:/printertray");
        PrinterTrayWatcher watcher = new PrinterTrayWatcher();

        watcher.watchTray(path);
    }

}
