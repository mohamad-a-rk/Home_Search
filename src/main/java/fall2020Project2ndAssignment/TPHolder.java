package fall2020Project2ndAssignment;

import java.util.List;

public class TPHolder {
private EmailSender emailsender ;
public void setEmailSender(EmailSender emailsender) {
	 this.emailsender = emailsender ; 
}
public void sendResult(String toEmail,String password,List <Home> homeRes) {
	this.emailsender.setPassword(password);
	this.emailsender.setTo(toEmail);;
	this.emailsender.sendEmail(homeRes);
}
}
