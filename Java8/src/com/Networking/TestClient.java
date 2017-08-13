package com.Networking;

import java.net.*;
import java.io.*;
import java.util.*;

class TestClient
{
	public static void main(String[] args)
	{
		try{

			Socket client = new Socket("127.0.0.1",4500);
			InputStream input=  client.getInputStream();
			BufferedReader dataStream  = new BufferedReader(new InputStreamReader(input));
			String strTime = dataStream.readLine();
			System.out.println("Current Server Time:" + strTime);
			input.close();
	
		}catch (Exception ex){
			System.out.println(ex);
		}
	}
}