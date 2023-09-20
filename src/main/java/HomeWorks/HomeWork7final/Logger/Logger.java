package HomeWorks.HomeWork7final.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private String message;
    public String dataTime() {
        LocalDateTime now = LocalDateTime.now();
        return now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
    }

    /**
     * @apiNote путь к фaйлу log.txt
     * @return
     * @throws IOException
     */
    public Path creatMessage() throws IOException {
        Path logFile = Path.of("D:\\Works\\IT\\Java_start\\GeekBrains\\OOP\\src\\main\\java\\" +
                "HomeWorks\\HomeWork7final\\Logger\\Log.txt");
        if (Files.notExists(logFile)) Files.createFile(logFile);
        return logFile;
    }

    /**
     * @apiNote добaвление сообщений в log.txt
     * @param message соообщение
     * @throws IOException
     */
    public void addMessage(String message) throws IOException {
        Files.writeString(creatMessage(), dataTime() + " " + message +
                "\n", StandardOpenOption.APPEND);
    }

    /**
     * @apiNote очисткa log.txt
     * @throws FileNotFoundException
     */
    public void cleanFileLog() throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("D:\\Works\\IT\\Java_start\\GeekBrains\\OOP\\src\\main\\java\\" +
                "HomeWorks\\HomeWork7final\\Logger\\Log.txt");
        writer.print("");
        writer.close();
    }


}
