package fall2020Project2ndAssignment;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class EmailSender {
public EmailSender() {
		
	}
	String to;
	String password ;
	public void setTo(String to) {
		this.to=to;
	}
	public void setPassword(String password) {
		this.password=password;
	}

	 public void sendEmail(List <Home> res, String email) {
	        // Recipient's email ID needs to be mentioned.
	 
	        // Sender's email ID needs to be mentioned
	        String from = "mohamad.kukhun@gmail.com";
            to=email;
	        // Assuming you are sending email from through gmails smtp
	        String host = "smtp.gmail.com";

	        // Get system properties
	        Properties properties = System.getProperties();

	        // Setup mail server
	        properties.put("mail.smtp.host", host);
	        properties.put("mail.smtp.port", "465");
	        properties.put("mail.smtp.ssl.enable", "true");
	        properties.put("mail.smtp.auth", "true");

	        // Get the Session object.// and pass username and password
	        //c.readLine();
	        
	        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {

	            protected PasswordAuthentication getPasswordAuthentication() {

	                return new PasswordAuthentication("mohamad.kukhun@gmail.com",password);

	            }

	        });

	        // Used to debug SMTP issues
	        session.setDebug(true);
	        String result="";
             for(Home h:res) result= result+h+"\n";
	        try {
	            // Create a default MimeMessage object.
	            MimeMessage message = new MimeMessage(session);

	            // Set From: header field of the header.
	            message.setFrom(new InternetAddress(from));

	            // Set To: header field of the header.
	            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	            // Set Subject: header field
	            message.setSubject("Your search result!");

	            // Now set the actual message
	            message.setText(result);

	            System.out.println("sending...");
	            // Send message
	            Transport.send(message);
	            System.out.println("Sent message successfully....");
	        } catch (MessagingException mex) {
	            mex.printStackTrace();
	        }

	    }

	
}
