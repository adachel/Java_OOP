package HomeWorks.HomeWork5.View;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;

public interface Logs {
    Path creatFileLog() throws IOException;
    String dataTime();
    void cleanFileLog() throws FileNotFoundException;


}
