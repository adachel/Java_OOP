### Прогрaммa кaлькулятор(сложение и вычитaние) рaционaльных и комплексных чисел.
***
Прогрaммa выполненa по структуре MVC:

* **Model**  - содержит каталог *Data* c файлами для создания рациональных и комплексных чисел, 
и каталог *Service* с файлами для вычисления математических операций.
* **View** - содержит файл для вывода результата в консоль. 
Также содержит файл *LogFile* в который записываются действия пользователя.
* **Controller** - содержит файл *Controller* с методами вычислений и вывода. 
Файл *InputMethod* c методами ввода данных с клавиатуры. Файл *Menu* - меню программы, 
где также фиксируются действия пользователя с записью в файл *LogFile*
