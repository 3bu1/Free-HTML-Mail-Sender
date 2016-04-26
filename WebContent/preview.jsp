<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<html>
<body style="margin:0px;padding:0px;font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;">
<br>
<br>
<form  method="post" action="Mail" enctype="multipart/form-data">
<input type="file" name="excel" id="excel"/>
<div class="input"><input class="username"  type="hidden" placeholder="Name" name="usernamemail" style=""></div>
<div class='submit'><input type="submit" value="send" id="send"/></div>
 	</form>
<br>
<br>

<div style="width:800px;background-image:url(images/Casa-Digi-mailer_01.jpg);">
<div style="width:622px;margin-left:104px;">
<div>
<div style="width:262px;float:left;margin-right:15px;font-size:13px;font-family:'Trebuchet MS', Arial, Helvetica, sans-serif;"><img src="images/Casa-Digi-mailer_03.jpg" width="272" height="138" /><br />
<div style="padding-top:10px;">Your regular dose on Trends & Innovations<br />
in Lighting Industry</div>
</div>
<div style="float:left;width:110px;margin-right:15px;margin-top:54px;font-size:12px;" align="center"><img src="images/logo_04.jpg" width="84" height="84" />World Class Lights<br />
 &<br />
Home Appliances</div>
<div style="width:210px;float:left;">
<div style="background:#000;height:20px;font-size:14px;line-height:20px;margin-top:54px;color:#FFF;font-weight:bold;padding-right:8px; text-align:right" >Vol 01/AUG/14</div>
<div><img src="images/Casa-Digi-mailer_033.png" width="203" height="49" style="margin:12px 0;"/></div>
<div align="center"><a href="https://www.facebook.com/pages/CASA-Lights-and-Home-Appliances/1378386309116075"><img src="images/Casa-Digi-mailer_08_05.jpg" width="59" height="59"  style="margin-right:10px;"/></a><a href="https://twitter.com/CASA_Lights"><img src="images/Casa-Digi-mailer_09.jpg" width="59" height="59" style="margin-right:10px;"/></a><a href="mailto:lightscasa@gmail.com"><img src="images/Casa-Digi-mailer_10.jpg" width="59" height="59" style="margin-right:10px;"/></a></div>
</div>
</div>
<div style="clear:both;"></div>
<div style="background:#000;height:20px;margin:8px 0;"></div>
<!--<div style="">Dear,<br />
Thank you for taking time to stop by. We are happy to share our initiative to 'shed light' on the Trends &
Innovations in Lighting Industry through NlightN - your regular dose of trends around lights, lighting and
technological innovations and advancements in general. We will add more local articles and updates
as we go along.  Hope you enjoy and find this initiative useful.
- Team CASA</div>-->
<div>
<div style="width:137px;float:left;"><img src="images/Casa-Digi-mailer_07.png" width="113" height="96" /></div>
<div style="width:485px;float:left;">
<div><div style="width:160;float:left;margin-right:14px;"><img src="images/Casa-Digi-mailer_011.jpg" width="153" height="160" /></div>
<div  style="width:310px;float:left;">
<h3 style="margin-top:0px;padding-top:0px;"><%=request.getParameter("heading")%></h3>
<span style="font-size:13px;"><%=request.getParameter("contnet")%></span>
<div style="float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;"><a href="<%=request.getParameter("Link")%>" style="color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;">Read More ></a></div>

</div></div>
<div style="clear:both;"></div>
<div style="background:#000;height:20px;margin:8px 0;"></div>
<div style="width:485px;float:left;">
<div style="width:200px;float:left;margin-right:14px;"><img src="images/Casa-Digi-mailer_012.jpg" width="178" height="137" /></div>
<div  style="width:260px;float:left;">
<h3 style="margin-top:0px;padding-top:0px;"><%=request.getParameter("heading2")%> </h3>
<span style="font-size:13px;"><%=request.getParameter("contnet2")%></span>
<div style="float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;"><a href="<%=request.getParameter("Link2")%>" style="color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;">Read More ></a></div>

</div>
</div>
<div style="width:485px;float:left; margin-top:30px;">
<div  style="width:260px;float:left;">
<h3 style="margin-top:0px;padding-top:0px;"><%=request.getParameter("heading3")%></h3>
<span style="font-size:13px;"><%=request.getParameter("contnet3")%></span>
<div style="float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;"><a href="<%=request.getParameter("Link3")%>" style="color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;">Read More ></a></div>

</div>
<div style="width:200px;float:right;margin-right:14px;" align="right"><img src="images/Casa-Digi-mailer_14.jpg" width="191" height="152" /></div>
</div>
<div style="clear:both;"></div>
<div style="background:#000;height:20px;margin:8px 0;"></div>
<div style="width:485px;float:left;">
<div style="width:200px;float:left;margin-right:14px;"><img src="images/Casa-Digi-mailer_17.jpg" width="208" height="139" /></div>
<div  style="width:260px;float:left;">
<h2 style="margin-top:0px;padding-top:0px;"><%=request.getParameter("heading4")%></h2>
<p style="margin-top:0px;padding-top:0px;"><span style="font-size:13px;"><%=request.getParameter("contnet4")%></span></p>

<div style="float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;"><a href="<%=request.getParameter("Link4")%>" style="color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;">Read More ></a></div>

</div>
</div>

<div style="width:485px;float:left; margin-top:30px;">
<div  style="width:260px;float:left;">
<h2 style="margin-top:0px;padding-top:0px;"><%=request.getParameter("heading5")%></h2>
<p style="margin-top:0px;padding-top:0px;"><span style="font-size:13px;"><%=request.getParameter("contnet5")%></span></p>
<div style="float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;"><a href="<%=request.getParameter("Link5")%>" style="color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;">Read More ></a></div>

</div>
<div style="width:200px;float:right;margin-right:14px;" align="right"><img src="images/Casa-Digi-mailer_21.jpg" width="212" height="127" /></div>
</div>
<div style="clear:both;"></div>
<div style="background:#000;height:20px;margin:8px 0;"></div>
<div style="clear:both;"></div>
<div style="width:485px;float:left;">
<div style="width:200px;float:left;margin-right:14px;"><img src="images/Casa-Digi-mailer_112.jpg" width="210" height="138" /></div>
<div  style="width:260px;float:left;">
<h2 style="margin-top:0px;padding-top:0px;"><%=request.getParameter("heading6")%></h2>
<span style="font-size:13px;"><%=request.getParameter("contnet6")%></span>.
<div style="float:right;background:#000;height:20px;padding:0px 10px;line-height:20px;"><a href="<%=request.getParameter("Link6")%>" style="color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;">Read More ></a></div>

</div>
</div>
<div style="clear:both;"></div>
<div style="background:#000;height:20px;margin:8px 0;"></div>
<div style="width:485px;float:left; margin-top:30px;">
<div  style="width:260px;float:left;">
<h2 style="margin-top:0px;padding-top:0px;">Share with Friend:</h2>
<div>
<div style="width:55px;margin:0 15px;float:left;"><img src="images/Casa-Digi-mailer_022.png" width="54" height="75" /></div>
<div style="float:left;font-size:10px;">Know someone<br />
who might be<br />
interested in<br />
this email?
<div style="clear:both;"></div>
<div style="background:#000;height:20px;padding:0px 10px;line-height:20px;"><a href="mailto:lightscasa@gmail.com" style="color:#FFF;font-weight:bold;font-size:12px;text-decoration:none;">Send it on  ></a></div></div>


</div>



</div>
<div style="width:200px;float:right;margin-right:14px;margin-top:20px;" align="right"><img src="images/left.png" width="113" height="96" /></div>
</div>
</div>
</div>
<div style="clear:both;"></div>
<div style="background:#000;height:20px;margin:8px 0 0 0;"></div>
<div>
<div style="float:left;width:60px;margin-right:75px;"><img src="images/Casa-Digi-mailer_28.jpg" width="59" height="72" /></div>
<div style="float:left;font-size:13px;margin-top:14px;">Changed your contact details? <a href="mailto:lightscasa@gmail.com" style="color:#000;">Updated them here.</a><br />
Don’t want to hear from us anymore? <a href="mailto:lightscasa@gmail.com" style="color:#000;">Unsubscribe Instantly.</a></div>
</div>
</div>
<div style="clear:both;"></div>

</div>

</body>
</html>