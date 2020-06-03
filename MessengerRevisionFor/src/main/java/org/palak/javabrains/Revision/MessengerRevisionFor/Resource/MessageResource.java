package org.palak.javabrains.Revision.MessengerRevisionFor.Resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.palak.javabrains.Revision.MessengerRevisionFor.Model.Message;
import org.palak.javabrains.Revision.MessengerRevisionFor.Service.MessageService;

@Path("/messages")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MessageResource {

MessageService messageService = new MessageService();
	
@GET
public List<Message> getAllMessages()
{
	return messageService.getAllMessages();
}

@GET
@Path("/{messageId}")

public Message getMessageById(@PathParam("messageId") Long id)
{
	return messageService.getMessageById(id);
}

@POST
public Message createMessage(Message m) {
	return messageService.createMessage(m);
}

@PUT
@Path("/{messageId}")
public Message updateMessage(@PathParam("messageId")long messageId, Message m)
{
	m.setMessageId(messageId);
	return messageService.updateMessage(m);
}

@DELETE
@Path("/{messageId}")
public void deleteMessage(@PathParam("messageId") Long id)
{
	 messageService.deleteMessage(id);
}

@Path("/{messageId}/comments")
public CommentResource test()
{
	return new CommentResource();
}
}
