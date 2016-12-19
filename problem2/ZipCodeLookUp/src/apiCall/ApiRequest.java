package apiCall;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import POJO.Address;
import POJO.Address.address_component;

public class ApiRequest {

	
	private static String jsonCoord(String address) throws IOException {
		URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?address=" + address + "&sensor=false");
		URLConnection connection = url.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		String jsonResult = "";
		while ((inputLine = in.readLine()) != null) {
		    jsonResult += inputLine;
		}
		in.close();
		return jsonResult; 
		}
	
	public static void main(String[] args) throws JsonSyntaxException, UnsupportedEncodingException, IOException{
		
		System.out.println("Enter the zipcode");
		Scanner in = new Scanner(System.in);
		Gson gson = new Gson();
		Address result = gson.fromJson(jsonCoord(URLEncoder.encode(in.next(), "UTF-8")), Address.class);
		
		address_component city  = result.results[0].address_components[1]; 
		address_component state  = result.results[0].address_components[2]; 

		System.out.println(city.long_name +","+state.short_name);
		
		in.close();

	}
}


