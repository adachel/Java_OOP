package Seminars.Seminar5.MVC.Service;

import Seminars.Seminar5.MVC.Data.Mail;

public interface MailInterface {
    String sendMail(Mail data); // отпрaвить почту

    void returnedMail(); // вернуть почту
    void getMail(); //
}
