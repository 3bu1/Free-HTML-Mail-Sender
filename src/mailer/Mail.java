package mailer;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 * Servlet implementation class Mail
 */
@WebServlet("/Mail")
public class Mail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Shopid[]=null;String img="";String temp="";
		Mailingaddress ma = new Mailingaddress();
		boolean isMultipart =ServletFileUpload.isMultipartContent(request);
		if (!isMultipart) {
		System.out.println("File Not Uploaded");
		} else {
		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		List items = null;
		try {
		items = upload.parseRequest(request);
		} catch (FileUploadException e) {
		e.printStackTrace();
		}
		Iterator itr = items.iterator();

		while (itr.hasNext()) {
			
			FileItem item = (FileItem) itr.next();
			
			if (item.isFormField()){
				 String name = item.getFieldName();
				 String fieldvalue = item.getString();
				if(name.equals("shopid")){
			  		
			  	} 
			} else {
				try {
					String name = item.getFieldName();
					String itemName = item.getName();
					if(!itemName.equals("")){
						
						if(name.equals("excel")){
							
								if(!itemName.equals("") && !itemName.equals("")){
								File savedFile = new File("E:/tribhuvan/excels"+itemName);
								item.write(savedFile);
								ReadExcel rx = new ReadExcel();
								Shopid=rx.ExcelExtractor(itemName).split("@@@@");
								for(int x=1;x<Shopid.length;x++){
									if(x%2!=0){
										System.out.println(Shopid[x]+"odd");
										temp=Shopid[x];
										
									}else{
										System.out.println(Shopid[x]+"even");
										ma.mailer(temp, Shopid[x]);
									
									}
									
									}
								}
							}
						}
					}catch (Exception e) {
							System.out.println("in mail"+e.getMessage());
						}

			}
		}
		
		}
		
	
	}

}
