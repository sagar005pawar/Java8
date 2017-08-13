package com.Networking;

import java.net.*;
import java.io.*;
import java.util.*;

class TestServer
{
	public static void main(String[] args){
		try{
			ServerSocket server = new ServerSocket(4500);
			boolean bContinue = true;
			while (bContinue == true)
			{
				Socket client = server.accept();
				System.out.println("Received client connection" + client);
				OutputStream output=  client.getOutputStream();
				DataOutputStream dataStream = new DataOutputStream(output);
				String strTime =Calendar.getInstance().getTime().toString();
				dataStream.writeChars(strTime);
				client.close();
			}
			//server.close();
		}catch (Exception ex){
			System.out.println(ex);
		}
	}
}