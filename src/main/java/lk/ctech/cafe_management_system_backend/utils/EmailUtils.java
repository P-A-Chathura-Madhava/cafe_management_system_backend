package lk.ctech.cafe_management_system_backend.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.List;

@Service
public class EmailUtils {

    @Autowired
    private JavaMailSender emailSender;

    public void sendSimpleMessage(String to, String subject, String text, List<String> list) {
        System.out.println(to);
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("ctechdeveloping@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        if (list != null && list.size() > 0) {
            message.setCc(getCcArray(list));
        }
        emailSender.send(message);
    }

    private String[] getCcArray(List<String> cclist) {
        String[] cc = new String[cclist.size()];
        for (int i = 0; i < cclist.size(); i++) {
            cc[i] = cclist.get(i);
        }
        return cc;
    }

    public void forgotMail(String to, String subject, String password) throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setFrom("ctechdeveloping@gmail.com");
        helper.setFrom(to);
        helper.setSubject(subject);
        String htmlMsg = "<p><b>Your Login details for Cafe Management System</b><br><b>Email: </b> " + to + " <br><b>Password: </b> " + password + "<br><a href=\"http://localhost:4200/\">Click here to login</a></p>";
        message.setContent(htmlMsg, "text/html");
        emailSender.send(message);
    }
}
