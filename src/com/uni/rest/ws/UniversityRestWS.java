package com.uni.rest.ws;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/{university}")
public class UniversityRestWS {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Welcome to Java Tutorials Corner";
	}
	
	@GET
	@Path("/getHtmlUni")
	@Produces(MediaType.TEXT_HTML)
	public String getHtmlUniversityInfo(){
		
		
		return "<html>"+"<title>"+" university info"+"</title>"
				+"<body><h1>"+"Name- Indian University"+"</body></h1>"+"</html>";
		
	}
	
	@GET
	@Path("/getXmlUni")
	@Produces(MediaType.TEXT_PLAIN)
	public String getXMLUniversityInfo(){
		return "Name - Indian University";
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String updateUniversityInfo(@PathParam("studentRollNo") String studentRollNo){
		return "Done Successfully!";
	}

}
