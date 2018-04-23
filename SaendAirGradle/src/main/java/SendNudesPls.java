import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendNudesPls {

    public static void main(String[] args) {

        final String username = "testalukafunda@gmail.com";
        final String password = "123BOBbob";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("testalukafuna@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse("mullernorbert93@gmail.com"));
            message.setSubject("utálom");
            message.setText("szar ez a feladat"
                    + "\n\n ez is");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}