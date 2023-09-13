package Seminars.Seminar5.MVC.Service;

import Seminars.Seminar5.MVC.Data.Mail;

public class MailService implements MailInterface{
    @Override
    public String sendMail(Mail data) {
//        System.out.println("Отпрaвлено");
        return "Письмо" + data + "отпрaвлено";
    }
    @Override
    public void returnedMail() {
        System.out.println("Возврaщено");
    }

    @Override
    public void getMail() {
        System.out.println("Получено");
    }
}
