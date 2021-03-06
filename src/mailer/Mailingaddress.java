package mailer;


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

public class Mailingaddress {
	
	public void mailer(String name,String email){
			final String username="lightscasa@gmail.com";
	final String password="lightscasa123";
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
	         message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(email));

	         // Set Subject: header field
	         message.setSubject("NlightN - Trends & innovations in Lighting industry");

	         // This mail has 2 part, the BODY and the embedded image
	         MimeMultipart multipart = new MimeMultipart("related");

	         // first part (the html)
	         BodyPart messageBodyPart = new MimeBodyPart();
	      //   String htmlText="<h1>Hello</h1>";
	         
	         
	         String htmlText="<html><body style='margin:0px;padding:0px;font-family:' Trebuchet MS ', Arial, Helvetica, sans-serif;'><div style='width:800px;background-image:url(\"cid:image\");margin:0px;padding:0px;height:1700px;'><div style='width:622px;margin:0px;margin-left:104px;'><div style='margin:0px;padding:0px;'><div style='width:255px;display:inline-block !important;margin:0 20px 0 0;font-size:13px;'><img src=\"cid:image1\" width='260' height='138'/><br/><div style='padding-top:10px;'>Your regular dose on Trends & Innovations <br/>in Lighting Industry</div></div><div style='width:110px;display:inline-block;margin-right:20px;margin-top:54px;font-size:12px;' align='center'><img src=\"cid:image2\" width='84' height='84'/>World&ndash;class Lights <br/>& <br/>Home Appliances</div><div style='width:210px;display:inline-block;'><div style='background:#000;height:20px;font-size:14px;line-height:20px;margin-top:54px;color:#FFF;font-weight:bold;padding-right:8px;text-align:right'>Vol 02/SEP/14</div><div><img src=\"cid:image3\" width='203' height='49' style='margin:12px 0;'/></div><div><a href='https://www.facebook.com/pages/CASA-Lights-and-Home-Appliances/1378386309116075'><img src=\"cid:Casa-Digi-mailer_08_05\" width='59' height='59' style='margin-right:10px;'/></a><a href='https://twitter.com/CASA_Lights'><img src=\"cid:Casa-Digi-mailer_09\" width='59' height='59' style='margin-right:10px;'/></a><a href=\"mailto:lightscasa@gmail.com\"><img src=\"cid:Casa-Digi-mailer_10\" width='59' height='59' style='margin-right:10px;'/></a></div></div></div><div style='clear:both;'></div><div style='background:#000;height:20px;margin:8px 0;'></div><div><div style='width:137px;float:left;'><img src=\"cid:Casa-Digi-mailer_07\" width='113' height='96'/></div><div style='width:485px;float:left;'><div><div style='width:160;float:left;margin-right:14px;'><img src=\"cid:Casa-Digi-mailer_011\" width='153' height='160'/></div><div style='width:310px;float:left;'><h2 style='margin-top:0px;padding-top:0px;'>Decoding Color Performance of LEDs</h2><span style='font-size:13px;'>Advances in LED color quality are presenting serious challenges to the Color Rendering Index(CRI) and Correlated Color Temperature (CCT).</span><div style='float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;Margin-top:15px;'><a href='http://www.archlighting.com/leds/leds-decoding-color-performance_o.aspx?dfpzone=home' style='color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;'>Read More ></a></div></div></div><div style='clear:both;'></div><div style='background:#000;height:20px;margin:8px 0;'></div><div style='width:485px;float:left;'><div style='width:200px;float:left;margin-right:14px;'><img src=\"cid:Casa-Digi-mailer_012\" width='178' height='137'/></div><div style='width:260px;float:left;'><h2 style='margin-top:0px;padding-top:0px;'>Benefits of Natural Light</h2>Research supports daylight&rsquo;s positive effect on building performance and human health. <div style='float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;margin-top:15px;'><a href='http://www.archlighting.com/daylighting/the-benefits-of-natural-light_o.aspx?dfpzone=general' style='color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;'>Read More ></a></div></div></div><div style='width:485px;float:left;margin-top:30px;'><div style='width:260px;float:left;'><h2 style='margin-top:0px;padding-top:0px;'>What&rsquo;s New in the Lighting Industry?</h2><p><span style='font-size:13px;'>LEDs have advanced dramatically since the first Commercial and Industrial LED Research Report was published in 2010.</span></p><span style='font-size:13px;'>.</span><div style='float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;margin-top:15px;'><a href='http://www.greentechmedia.com/articles/read/led-scavenger-hunt-heres-whats-new-in-the-solid-state-lighting-industry' style='color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;'>Read More ></a></div></div><div style='width:200px;float:right;margin-right:14px;' align='right'><img src=\"cid:Casa-Digi-mailer_14\" width='191' height='152'/></div></div><div style='clear:both;'></div><div style='background:#000;height:20px;margin:8px 0;'></div><div style='width:485px;float:left;'><div style='width:200px;float:left;margin-right:14px;'><img src=\"cid:Casa-Digi-mailer_17\" width='208' height='139'/></div><div style='width:260px;float:left;'><h2 style='margin-top:0px;padding-top:0px;'>Vijayawada gears up for Dasara festival</h2><p style='margin-top:0px;padding-top:0px;'><span style='font-size:13px;'>With just 10 days to go for the Dasara festival, arrangements are going on at a brisk pace at Kanakadurga temple in Vijayawada. </span></p><div style='float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;margin-top:0px;'><a href='http://www.thehindu.com/news/cities/Vijayawada/kanakadurga-temple-gears-up-for-dasara-fete/article6410391.ece' style='color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;'>Read More ></a></div></div></div><div style='width:485px;float:left;margin-top:30px;'><div style='width:260px;float:left;'><h2 style='margin-top:0px;padding-top:0px;'>Colourful adieu to Lord Ganesha in Hyderabad</h2><p>Myriad forms of Ganesha were on view as the procession rolled out through the main thoroughfares of Hyderabad.</p><div style='float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;margin-top:15px;'><a href='http://www.thehindu.com/news/cities/Hyderabad/colourful-adieu-to-lord-ganesha/article6391922.ece?ref=slideshow#im-image-0' style='color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;'>Read More ></a></div></div><div style='width:200px;float:right;margin-right:14px;' align='right'><img src=\"cid:Casa-Digi-mailer_21\" width='212' height='127'/></div></div><div style='clear:both;'></div><div style='background:#000;height:20px;margin:8px 0;'></div><div style='clear:both;'></div><div style='width:485px;float:left;'><div style='width:200px;float:left;margin-right:14px;'><img src=\"cid:Casa-Digi-mailer_112\" width='208' height='139'/></div><div style='width:260px;float:left;'><h2 style='margin-top:0px;padding-top:0px;'>LED Business News</h2><p>The Osram and Belkin partnership has the potential of leveraging the strengths of each company.</p><div style='float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;margin-top:15px;'><a href='http://www.ledsmagazine.com/articles/2014/09/led-business-news-osram-and-belkin-lighting-science-ceo-toshiba-ultra-hd-led-tv.html' style='color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;'>Read More ></a></div></div></div><div style='clear:both;'></div><div style='background:#000;height:20px;margin:8px 0;'></div><div style='width:485px;float:left;margin-top:30px;'><div style='width:260px;float:left;'><h2 style='margin-top:0px;padding-top:0px;'>Share with a friend:</h2><div><div style='width:55px;margin:0 15px;float:left;'><img src=\"cid:Casa-Digi-mailer_022\" width='54' height='75'/></div><div style='float:left;font-size:11px;'>Know someone <br/>who might be <br/>interested in <br/>this email? <div style='clear:both;'></div><div style='float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;'><a href='mailto:?' style='color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;'>Send it on ></a></div></div></div></div><div style='width:200px;float:right;margin-right:14px;margin-top:20px;' align='right'><img src=\"cid:left\" width='113' height='96'/></div></div></div></div><div style='clear:both;'></div><div style='background:#000;height:20px;margin:8px 0 0 0;'></div><div><div style='float:left;width:60px;margin-right:75px;'><img src=\"cid:Casa-Digi-mailer_28\" width='59' height='72'/></div><div style='float:left;font-size:13px;margin-top:14px;'>Changed your contact details? <a href=\"mailto:lightscasa@gmail.com\" style='color:#000;'>Updated them here.</a><br/>Don&rsquo;t want to hear from us anymore? <a href='mailto:lightscasa@gmail.com' style='color:#000;'>Unsubscribe Instantly.</a></div></div></div><div style='clear:both;'></div></div></body></html>";   
	 	          messageBodyPart.setContent(htmlText, "text/html");
	         multipart.addBodyPart(messageBodyPart);
	         // add it
	         // second part (the image)
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_01.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds));
	         messageBodyPart.setHeader("Content-ID", "<image>");
	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds1 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_03.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds1));
	         messageBodyPart.setHeader("Content-ID", "<image1>");
	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds2 = new FileDataSource("E:/tribhuvan/mailer/images/logo_04.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds2));
	         messageBodyPart.setHeader("Content-ID", "<image2>");
	         multipart.addBodyPart(messageBodyPart);
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds3 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_033.png");
	         messageBodyPart.setDataHandler(new DataHandler(fds3));
	         messageBodyPart.setHeader("Content-ID", "<image3>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds4 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_08_05.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds4));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_08_05>");
	         multipart.addBodyPart(messageBodyPart);
	        
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds5 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_09.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds5));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_09>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds6 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_10.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds6));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_10>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds7 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_07.png");
	         messageBodyPart.setDataHandler(new DataHandler(fds7));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_07>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds8 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_011.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds8));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_011>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds9 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_012.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds9));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_012>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds10 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_14.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds10));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_14>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds11 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_17.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds11));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_17>");
	         multipart.addBodyPart(messageBodyPart);
	      
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds12 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_21.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds12));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_21>");
	         multipart.addBodyPart(messageBodyPart);
	         //------------

	         messageBodyPart = new MimeBodyPart();
	         DataSource fds13 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_022.png");
	         messageBodyPart.setDataHandler(new DataHandler(fds13));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_022>");
	         multipart.addBodyPart(messageBodyPart);
	         
	      
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds14 = new FileDataSource("E:/tribhuvan/mailer/images/left.png");
	         messageBodyPart.setDataHandler(new DataHandler(fds14));
	         messageBodyPart.setHeader("Content-ID", "<left>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds15 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_28.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds15));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_28>");
	         multipart.addBodyPart(messageBodyPart);
	        
	         messageBodyPart = new MimeBodyPart();
	         DataSource fds16 = new FileDataSource("E:/tribhuvan/mailer/images/Casa-Digi-mailer_112.jpg");
	         messageBodyPart.setDataHandler(new DataHandler(fds16));
	         messageBodyPart.setHeader("Content-ID", "<Casa-Digi-mailer_112>");
	         multipart.addBodyPart(messageBodyPart);
	         
	         message.setContent(multipart);
	         Transport.send(message);
	         // Send message
	        System.out.println("Sent message successfully....");
			
		
	
	} catch (Exception e) {
		 System.out.println("in mailingaddress"+e.getMessage());
	}


	}
}
