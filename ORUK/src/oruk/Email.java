/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oruk;

import java.util.*;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import oru.inf.InfException;


/**
 *
 * @author Jamie
 */
public class Email {
    
private static OrukDB db;
private String mailadress;
    
    
public Email (OrukDB db) {
        this.db = db;
        this.mailadress = Huvudfonster.getAnvandarnamn();
    }
 
//Används som validering på metoder i andra klasser som triggar en notis.
//Ange NID på den notis du vill ska triggas i anropsparametern.

public void sendMailNotisMote(Integer notisNummer, String mailadressen) { //Bara för möte, skickar till fler mailadresser.
    if(notisNummer == 3) {
        try{
            String host = "smtp.gmail.com";
            String user = "orukadm1n@gmail.com";
            String pass = "Adm1n123";
            String to = mailadressen;
            String from = "orukadm1n@gmail.com";
            String subject = "Notis från ORUK (går ej att svara på)";
            String messageText = "Du har blivit inbjuden till ett möte. \n\nDet här meddelandet är skickat från ORUK då du har valt att få e-post när någon bjuder in dig till ett möte. \nÖnskar du ändra dina notisinställningar gör du det i programmet.";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);
            
           Transport transport = mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
        }catch(Exception ex) {
            System.out.println(ex);
        }     
    }
}

public void sendMailNotis(Integer notisNummer) {
    
    if(notisNummer == 1) {
        try{
            String host = "smtp.gmail.com";
            String user = "orukadm1n@gmail.com";
            String pass = "Adm1n123";
            String to = mailadress;
            String from = "orukadm1n@gmail.com";
            String subject = "Notis från ORUK (går ej att svara på)";
            String messageText = "Någon har kommenterat ett inlägg du har skapat. \n\nDet här meddelandet är skickat från ORUK då du har valt att få e-post när någon kommenterat på ett inlägg du skapat. \nÖnskar du ändra dina notisinställningar gör du det i programmet.";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);
            
           Transport transport = mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
        }catch(Exception ex) {
            System.out.println(ex);
        }
    
    } else if(notisNummer == 2) {
        try{
            String host = "smtp.gmail.com";
            String user = "orukadm1n@gmail.com";
            String pass = "Adm1n123";
            String to = mailadress;
            String from = "orukadm1n@gmail.com";
            String subject = "Notis från ORUK (går ej att svara på)";
            String messageText = "Någon har kommenterat ett inlägg du följer. \n\nDet här meddelandet är skickat från ORUK då du har valt att få e-post när någon kommenterat på ett inlägg du följer. \nÖnskar du ändra dina notisinställningar gör du det i programmet.";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);
            
           Transport transport = mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
        }catch(Exception ex) {
            System.out.println(ex);
        }
    
    } else if(notisNummer == 4) {
        try{
            String host = "smtp.gmail.com";
            String user = "orukadm1n@gmail.com";
            String pass = "Adm1n123";
            String to = mailadress;
            String from = "orukadm1n@gmail.com";
            String subject = "Notis från ORUK (går ej att svara på)";
            String messageText = "Du har fått ett nytt meddelande i ORUK. \n\nDet här meddelandet är skickat från ORUK då du har valt att få e-post när någon skickar ett meddelande till dig i ORUK. \nÖnskar du ändra dina notisinställningar gör du det i programmet.";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);
            
           Transport transport = mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
        }catch(Exception ex) {
            System.out.println(ex);
        }
        
    } else if(notisNummer == 6) {
        try{
            String host = "smtp.gmail.com";
            String user = "orukadm1n@gmail.com";
            String pass = "Adm1n123";
            String to = mailadress;
            String from = "orukadm1n@gmail.com";
            String subject = "Notis från ORUK (går ej att svara på)";
            String messageText = "Någon har skapat ett inlägg i en blogg du följer. \n\nDet här meddelandet är skickat från ORUK då du har valt att få e-post när någon skapar ett inlägg i en blogg du följer. \nÖnskar du ändra dina notisinställningar gör du det i programmet.";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");
            
            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);
            
           Transport transport = mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
        }catch(Exception ex) {
            System.out.println(ex);
        }
    } 
  }
}
