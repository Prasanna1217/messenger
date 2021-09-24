package org.prasanna.kum.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.prasanna.kum.messenger.model.Message;
import org.prasanna.kum.messenger.model.Profile;

public class DatabaseClass {
	
	
	private static Map<Long,Message> messages=new HashMap<>();
	private static Map<Long,Profile> profiles=new HashMap<>();
	
	
	public static Map<Long, Message> getmessages(){
		return messages;
	}
	public static Map<Long, Profile> getprofile(){
		return profiles;
	}
	

}
