package org.palak.javabrains.Revision.MessengerRevisionFor.Model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

public class Message {

	private long messageId;
	private String message;
	private String author;
	private Date created;
	private static Map<Long, Comment> comments=new HashMap<>();
	
	public Message()
	{
		
	}
	public Message(long messageId, String message, String author) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.author = author;
		this.created=new Date();
	}
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	@XmlTransient
	public Map<Long, Comment> getComments() {
		return comments;
	}
	public void setComments(Map<Long, Comment> comments) {
		this.comments = comments;
	}
}
