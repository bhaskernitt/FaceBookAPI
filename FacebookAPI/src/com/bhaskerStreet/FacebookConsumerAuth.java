package com.bhaskerStreet;

import java.util.Hashtable;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.SyncInvoker;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.catalina.WebResource;
import org.glassfish.jersey.client.ClientResponse;

import com.oracle.jrockit.jfr.ContentType;

import jersey.*;

public class FacebookConsumerAuth {
	
	
	/*public static void main(String[]args){
		getAuthStatus("https://graph.facebook.com/oauth/authorize","1735266373441666");
		
	}*/

	public static Boolean getAuthStatus(String facebook_urlAuthorize_base,String facebook_AppID){
		
		try{
		String url=facebook_urlAuthorize_base+"?client_id="+facebook_AppID+"&redirect_uri=http://localhost"+"&scope=email";
		Client cl=ClientBuilder.newClient();
		WebTarget t=cl.target(url);
		
		
		//Object obj=((SyncInvoker) t.request().acceptEncoding("UTF-8").method("GET")).get(ClientResponse.class);
	
		ClientResponse cr= cl.target(url).request().get(ClientResponse.class);
		//accept(ContentType("application/json"),
		//.get(ClientResponse.class)
		
		// List<HotelsEntity> hotels = target.request(MediaType.APPLICATION_JSON_TYPE).get(genericType);

		//WebTarget b=cl.target(url).request().accept(MediaType.APPLICATION_JSON_TYPE).get();
	//	ClientResponse cr= cl.target(url).request(MediaType.APPLICATION_JSON_TYPE).accept(MediaType.APPLICATION_JSON).get();
				//get(ClientResponse.class);
				//accept(ContentType("application/json"),
				//.get(ClientResponse.class);
		
	System.out.println("");
		
		
		
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return false;
		
		
	}
	
	
}
