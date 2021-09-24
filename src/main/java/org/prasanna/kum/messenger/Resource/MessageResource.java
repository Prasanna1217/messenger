package org.prasanna.kum.messenger.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.prasanna.kum.messenger.model.Message;
import org.prasanna.kum.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageservice=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)   //to give the output in mediatype in text string.
	public List<Message> getmessages() {
		return messageservice.getAllmessages();
	}
	
	@Path("/{messageid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)   //to give the output in mediatype in xml.
	public Message getmessages(@PathParam("messageid") Long Id) {
		return messageservice.getmessage(Id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)   //to give the output in mediatype in text string.
	public Message addmessages(Message message) {
		return messageservice.addmessage(message);
	}

	@PUT
	@Path("/{messageid}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)   //to give the output in mediatype in text string.
	public Message updatemessage(@PathParam("messageid") Long id, Message message) {
		message.setId(id);
		return messageservice.updatemessage(message);
	}
	@Path("/{messageid}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)   //to give the output in mediatype in xml.
	public void deletemessages(@PathParam("messageid") Long Id) {
		messageservice.removemessage(Id);
	}
}
