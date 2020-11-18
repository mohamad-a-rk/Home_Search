package fall2020Project2ndAssignment;
import java.util.List;
import static org.mockito.Mockito.*;
public class TPHolder {
private EmailSender emailsender=mock(EmailSender.class) ;
public EmailSender getEmailsender() {
	return emailsender;
}
public void setEmailsender(EmailSender emailsender) {
	this.emailsender = emailsender;
}
public void setEmailSender(SearchforHouse sfh) {
	 sfh.setEmailSender(this.emailsender);  
}

}
