package org.palak.javabrains.Revision.MessengerRevisionFor.Database;

import java.util.HashMap;
import java.util.Map;

import org.palak.javabrains.Revision.MessengerRevisionFor.Model.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	public static Map<Long, Message> getMessages()
	{
		return messages;
	}
}
