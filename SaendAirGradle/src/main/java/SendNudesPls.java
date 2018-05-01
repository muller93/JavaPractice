import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class SendNudesPls {

    public static void main(String[] args) {
        Reminder reminder = new Reminder(16, 50);
        new Reminder(16, 50);

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
                    InternetAddress.parse("qwer.kocka@gmail.com"));
            message.setSubject("Kellemetlen");
            message.setText("az élet igazságtalan"
                    + "\n\n oldd meg!"
                    + "\n\n nem tudom"
                    + "\n\n én ehhez nem értek"
                    + "\n\n ekszöszájzbukk"
                    + "\n\n montenbájk"
                    + "\n\n vágási ferike"
                    + "\n\n ha lenne 10 ezer forintom"
                    + "\n\n csináld meg"
                    + "\n\n a go (nem) jó");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}