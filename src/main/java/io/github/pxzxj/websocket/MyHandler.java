package io.github.pxzxj.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

public class MyHandler extends TextWebSocketHandler {

	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message) {
		System.out.println("message = " + message);
	}

}