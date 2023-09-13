package Seminars.Seminar5.MVC.Controller;

import Seminars.Seminar5.MVC.Data.Mail;
import Seminars.Seminar5.MVC.MVP.HumanMailView;
import Seminars.Seminar5.MVC.Service.MailService;

public class Controller {
    MailService mailService = new MailService();
    HumanMailView humanMailView = new HumanMailView();

    public void send(Mail data) {
        String qwe = mailService.sendMail(data);
        humanMailView.getMail(qwe);
    }
}
