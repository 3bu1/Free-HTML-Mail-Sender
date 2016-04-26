package mailer;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendEmail
 */
@WebServlet("/SendEmail")
public class SendEmail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendEmail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("Text/HTML");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("usernamemail");
	
		String email =request.getParameter("Email");
		pw.println(email);
		final String username="tribhuvanreddyramidi@gmail.com";
		final String password="bhargavi@bijju";
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host","smtp.gmail.com");
		props.put("mail.smtp.port","587");
		Session session = Session.getInstance(props, new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(username, password);
			}
			
		});
		try {
			
         // Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	        message.setFrom(new InternetAddress(username));

	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,
	            InternetAddress.parse(email));

	         // Set Subject: header field
	         message.setSubject("Testing Subject");

	         // This mail has 2 part, the BODY and the embedded image
	         MimeMultipart multipart = new MimeMultipart("related");

	         // first part (the html)
	         BodyPart messageBodyPart = new MimeBodyPart();
	        String htmlText = "<body><div style='margin:0px auto;width:100%;'><div style='background:#000;height:67px;'><div style='width:636px;height:67px;margin:0px auto;'><div style='background:#ec008c;height:67px;line-height:67px;padding:0 25px;color:#FFF;font-family:Tahoma, Geneva, sans-serif;font-size:23px;float:left;'>EMAIL TEMPLATE</div><div style='float:right;'><span style='color:#ec008c;padding:0 30px;height:67px;line-height:67px;display:inline-block;font-size:16px;'>Online version</span><span style='color:#ec008c;padding:0 30px;height:67px;line-height:67px;display:inline-block;font-size:16px;'>Forward to a Friend</span></div></div></div><div style='width:636px;height:67px;margin:0px auto;'><div style='margin:30px 0;'><img src=\"cid:imagees\" width='619' height='254'></div><div style='width:60%;float:left;'><table width='100%' border='0' cellspacing='0' cellpadding='0' style='margin-bottom:21px;padding-bottom:21px;border-bottom:1px solid #CCC;'><tr><td><img src=\"cid:imagees1\" width='184' height='109'></td><td valign='top'><div style='margin-left:12px;'><h2 style='color:#ec008c;margin:0px;padding:0px;'><i>Title one goes</i></h2><p style='color:#999;'>dopiaza.org. Blog;Flickr. Set Manager;Badge Maker;Tools. data: </p></div></td></tr></table><table width='100%' border='0' cellspacing='0' cellpadding='0' style='margin-bottom:21px;padding-bottom:21px;border-bottom:1px solid #CCC;'><tr><td><img src=\"cid:imagees1\" width='184' height='109'></td><td valign='top'><div style='margin-left:12px;'><h2 style='color:#ec008c;margin:0px;padding:0px;'><i>Title one goes</i></h2><p style='color:#999;'>dopiaza.org. Blog;Flickr. Set Manager;Badge Maker;Tools. data: </p></div></td></tr></table><table width='100%' border='0' cellspacing='0' cellpadding='0' style='margin-bottom:21px;padding-bottom:21px;border-bottom:1px solid #CCC;'><tr><td><img src=\"cid:imagees1\" width='184' height='109'></td><td valign='top'><div style='margin-left:12px;'><h2 style='color:#ec008c;margin:0px;padding:0px;'><i>Title one goes</i></h2><p style='color:#999;'>dopiaza.org. Blog;Flickr. Set Manager;Badge Maker;Tools. data: </p></div></td></tr></table><table width='100%' border='0' cellspacing='0' cellpadding='0' style='margin-bottom:21px;padding-bottom:21px;border-bottom:1px solid #CCC;'><tr><td><img src=\"cid:imagees1\" width='184' height='109'></td><td valign='top'><div style='margin-left:12px;'><h2 style='color:#ec008c;margin:0px;padding:0px;'><i>Title one goes</i></h2><p style='color:#999;'>dopiaza.org. Blog;Flickr. Set Manager;Badge Maker;Tools. data: </p></div></td></tr></table></div><div align='left' style='width:35%;margin-left:5%;float:left;'><h2 style='margin:0px;padding:0px;color:#ec008c;'><i>Sidebar List</i></h2><p style='color:#999;'> Set Manager;Badge Maker;Tools. data: URI Generator;Little </p><ul style='margin:0px;padding:0px;'><li style='color:#ec008c;list-style:none;padding:8px 0;margin:5px 0;border-bottom:1px solid #CCC;'>1st listing here</li><li style='color:#ec008c;list-style:none;padding:8px 0;margin:5px 0;border-bottom:1px solid #CCC;'>1st listing here</li><li style='color:#ec008c;list-style:none;padding:8px 0;margin:5px 0;border-bottom:1px solid #CCC;'>1st listing here</li><li style='color:#ec008c;list-style:none;padding:8px 0;margin:5px 0;border-bottom:1px solid #CCC;'>1st listing here</li></ul><h2 style='margin:20px 0 10px 0;padding:0px;color:#ec008c;'><i>Sidebar List</i></h2><img src=\"cid:imagees1\" width='184' height='109'><p style='color:#999;'> Set Manager;Badge Maker;Tools. data: URI Generator;Little </p><h2 style='margin:20px 0 10px 0;padding:0px;color:#ec008c;'><i>Advertisements</i></h2><img src=\"cid:imagees2\" width='188' height='91'></div></div><div style='clear:both;'></div><div style='background:#000;height:67px;'><div style='width:636px;height:67px;margin:0px auto;'><div style='color:#FFF;height:67px;line-height:22px;margin-top:10px;float:left;'>Telephone:0123456789<br/>Fax:0123456+7</div><div style='margin-top:10px;float:right;'><img src=\"cid:imagees3\" width='217' height='43'></div></div></div><div style='border-top:1px solid #999;background:#000;height:67px;'><div style='width:636px;height:67px;margin:0px auto;'><p style='text-align:center;color:#999;'>Data URL CSS Optimizer. Type in a URL below and the Data URL CSS optimizer will fetch your stylesheet and convert linked image resources into Data URLs.</p></div></div></div></body>";
	        //String htmlText = "<H1>Hello</H1><img src=\"cid:imagees\">";
	         messageBodyPart.setContent(htmlText, "text/html");
	         // add it
	         multipart.addBodyPart(messageBodyPart);

	         // second part (the image)
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds = new FileDataSource("C:/Users/tribhuvan/Desktop/images/1.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds));
	         messageBodyPart.setHeader("Content-ID", "<imagees>");
	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds1 = new FileDataSource("C:/Users/tribhuvan/Desktop/images/2.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds1));
	         messageBodyPart.setHeader("Content-ID", "<imagees1>");
	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds2 = new FileDataSource("C:/Users/tribhuvan/Desktop/images/3.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds2));
	         messageBodyPart.setHeader("Content-ID", "<imagees2>");
	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds3 = new FileDataSource("C:/Users/tribhuvan/Desktop/images/4.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds3));
	         messageBodyPart.setHeader("Content-ID", "<imagees3>");
	         multipart.addBodyPart(messageBodyPart);
	         // add image to the multipart
	         // put everything together
	         message.setContent(multipart);
	         // Send message
	         Transport.send(message);

	         System.out.println("Sent message successfully....");
			pw.println(name);
			pw.println("done");
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
	}

}
