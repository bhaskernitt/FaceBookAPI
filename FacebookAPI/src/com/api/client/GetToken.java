package com.api.client;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class GetToken {
	
	public static String access_token;
	
	
	
	

	public static String getToken(String url){
		
		try{
		
		Client cl=ClientBuilder.newClient();
		
		String reqult=cl.target(url).request().get(String.class);
		
		
		InputStream is=  new ByteArrayInputStream(reqult.getBytes(StandardCharsets.UTF_8.name()));

		
		JsonReader jsonReader = Json.createReader(is);
		JsonObject jsonObject = jsonReader.readObject();
		
		 access_token=jsonObject.getString("access_token");
		
		}
		
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		return access_token;
		
		
	}
	
}
