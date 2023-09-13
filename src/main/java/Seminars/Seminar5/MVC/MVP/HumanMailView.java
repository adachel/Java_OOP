package Seminars.Seminar5.MVC.MVP;

public class HumanMailView implements View{

    @Override
    public void returnMail() {
        System.out.println("Возврaщение");
    }

    @Override
    public void sendMail() {
        System.out.println("Отпрaвление");
    }

    @Override
    public void getMail(String data) {
        System.out.println("Получение");
    }

    @Override
    public void talkWithPostman() {
        System.out.println("Обсуждение");
    }
}
