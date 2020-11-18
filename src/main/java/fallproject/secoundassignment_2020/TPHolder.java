package fallproject.secoundassignment_2020;
import static org.mockito.Mockito.*;
public class TPHolder {
private EmailSender emailsender=mock(EmailSender.class) ;
public EmailSender getEmailsender() {
	return emailsender;
}
public void setEmailsender(EmailSender emailsender) {
	this.emailsender = emailsender;
}
public void setEmailsender(SearchforHouse sfh) {
	 sfh.setEmailsender(this.emailsender);  
}

}
