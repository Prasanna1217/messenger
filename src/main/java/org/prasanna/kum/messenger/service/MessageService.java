package org.prasanna.kum.messenger.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.prasanna.kum.messenger.database.DatabaseClass;
import org.prasanna.kum.messenger.model.Message;

public class MessageService {
	
	
	private Map<Long,Message> messages=DatabaseClass.getmessages();
	
	public MessageService() {
		messages.put(1L,new Message(1,"hello friend","prasanna"));
        messages.put(2L,new Message(2,"hai","kumar"));
	}
	
	
	public List<Message> getAllmessages(){
		return new  ArrayList<Message>(messages.values());
		
		                                                                    /*Message m1=new Message(1L,"hello friend","prasanna");
		                                                                     Message m2=ne w Message(2L,"hai","kumar");
		
		                                                                    List<Message> list=new ArrayList<>();
		                                                                    list.add(m1);
		                                                                     list.add(m2);
		                                                                      return list;
                                                                              */		
		}
	public Message getmessage(Long id) {
		return messages.get(id);
	}
	 
	public Message addmessage(Message message) {
		
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updatemessage(Message message) {
		if(message.getId()<=0) {
		return null;
		}
		messages.put(message.getId(), message);
		return message; 
	}
	
	public Message removemessage(long id) {
		return messages.remove(id);
	}

}
