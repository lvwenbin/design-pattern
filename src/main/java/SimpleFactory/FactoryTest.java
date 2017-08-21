package SimpleFactory;

public class FactoryTest {

	public static void main(String[] args) {
	
  SenderFactory senderFactory=new SenderFactory();
  MailSender mailSender=(MailSender) senderFactory.produce("mail");
  mailSender.send();
	}

}
