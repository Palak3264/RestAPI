package org.palak.javabrains.Revision.MessengerRevisionFor.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.palak.javabrains.Revision.MessengerRevisionFor.Database.DatabaseClass;
import org.palak.javabrains.Revision.MessengerRevisionFor.Model.Message;

public class MessageService {
	
	private Map<Long, Message> messages=DatabaseClass.getMessages();
	
	public MessageService()
	{
		messages.put(1L, new Message(1, "Hi","Palak"));
	}

	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessageById(Long id)
	{
		return messages.get(id);
	}
	
	public Message createMessage(Message m)
	{
			m.setMessageId(messages.size()+1);
			messages.put(m.getMessageId(), m);
			return m;
	}
	
	public Message updateMessage(Message m)
	{
		if(m.getMessageId()<=0)
			return null;
		messages.put(m.getMessageId(), m);
		return m;
	}
	
	public void deleteMessage(Long id)
	{
		messages.remove(id);
	}
}
