package Seminars.Seminar5.MVC.App;

import Seminars.Seminar5.MVC.Controller.Controller;
import Seminars.Seminar5.MVC.Data.Mail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {  // User - это 'main' клaсс
        Controller controller = new Controller();
        Mail mail = new Mail();
        mail = mail.generateNewMail();
        controller.send(mail);
    }
}
