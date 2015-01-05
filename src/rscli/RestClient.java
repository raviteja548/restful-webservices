package rscli;



import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class RestClient {
public static void main(String... args){
	String baseURI = "http://localhost:8084/wsrest";
	  ClientConfig config = new DefaultClientConfig();
	  Client client = Client.create(config);
	  WebResource service = client.resource(baseURI);

	  System.out.println(service.path("rest").path("university").accept(MediaType.TEXT_PLAIN).get(String.class));
	  //http://localhost:8084/wsrest/rest/university/getXmlUni
	  //getHtmlUni
		  System.out.println(service.path("rest/university/getXmlUni").accept(MediaType.TEXT_PLAIN).get(String.class));
		//  System.out.println(service.path("rest/university/getHtmlUni").accept(MediaType.TEXT_PLAIN).get(String.class));
	  
		  
}
}
