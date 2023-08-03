import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/*
*1. Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий)
* во вновь созданную папку ./backup*/
public class Backup {

    public static void copy() throws IOException {

        Files.createDirectory(Path.of("./backup"));

        DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
        for (Path file : dir) {
            if (Files.isDirectory(file)) continue;
            Files.copy(file, Path.of("./backup/" + file.toString()));
        }
    }

}
