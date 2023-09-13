package HomeWorks.HomeWork5.Controller;
/*



Посмотрите на пример простой программы с записью лога:

package temp;
import java.io.IOException;
import java.util.logging.*;



/**
 * Пример программы с использованием java.util.logging.
 * @author Урванов Ф. В.
 *

public class LogApp {
    /**
     * Старт программы
     * @param args не используется
     */


/*


    public static void main(String[] args)
    {
        // Получаем экземпляр класса, который будем использовать для записи логов.
        // Передаваемый параметр LogApp - имя логера.
        // В документации сказано, что имя логгера должно совпадать с именем
        // класса или пакета ().
        Logger logger = Logger.getLogger(LogApp.class.getName());


        // Создаём handler, который будет записывать лог
        // в файл "LogApp". Символ "%t" указывает на то, что файл
        // будет располагаться в папке с системными временными файлами.
        try {
            FileHandler fh = new FileHandler("%tLogApp");
            logger.addHandler(fh);

        } catch (SecurityException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за политики безопасности.",
                    e);
        } catch (IOException e) {
            logger.log(Level.SEVERE,
                    "Не удалось создать файл лога из-за ошибки ввода-вывода.",
                    e);
        }

        logger.log(Level.INFO, "Запись лога с уровнем INFO (информационная)");
        logger.log(Level.WARNING,"Запись лога с уровнем WARNING (Предупреждение)");
        logger.log(Level.SEVERE, "Запись лога с уровнем SEVERE (серъёзная ошибка)");
    }
}

    Как видите ничего сложного тут нет. Вы просто создаёте (или получаете, если он уже создан) экземпляр класса java.util.logging.Logger. Потом пишите лог с его помощью.

        Приведённый выше пример пишет лог в файл LogApp. Если вы его откроете (В Linux он будет располагаться где-то в /tmp/LogApp), то увидите следущий текст:

<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE log SYSTEM "logger.dtd">
<log>
<record>
<date>2011-06-27T18:48:52</date>
<millis>1309186132015</millis>
<sequence>0</sequence>
<logger>temp.LogApp</logger>
<level>INFO</level>
<class>temp.LogApp</class>
<method>main</method>
<thread>10</thread>
<message>Запись лога с уровнем INFO (информационная)</message>
</record>
<record>
<date>2011-06-27T18:48:52</date>
<millis>1309186132111</millis>
<sequence>1</sequence>
<logger>temp.LogApp</logger>
<level>WARNING</level>
<class>temp.LogApp</class>
<method>main</method>
<thread>10</thread>
<message>Запись лога с уровнем WARNING (Предупреждение)</message>
</record>
<record>
<date>2011-06-27T18:48:52</date>
<millis>1309186132111</millis>
<sequence>2</sequence>
<logger>temp.LogApp</logger>
<level>SEVERE</level>
<class>temp.LogApp</class>
<method>main</method>
<thread>10</thread>
<message>Запись лога с уровнем SEVERE (серъёзная ошибка)</message>
</record>
</log>
        По крайней мере у меня получился именно такой файл.
*/
/*



public class temp {

}


*/