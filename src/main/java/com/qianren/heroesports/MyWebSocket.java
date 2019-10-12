package com.qianren.heroesports;

import java.io.IOException;
import java.util.Date;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/ws")
public class MyWebSocket {
	private Session session;

	public MyWebSocket() {
		super();
	}

	@OnOpen
	public void onOpen(Session session) {
		this.session = session;

		while (true) {
			try {
				this.sendMessage("{\n" + 
						"  \"channel\": \"ODDS\",\n" + 
						"  \"data\": [\n" + 
						"    {\n" + 
						"      \"matchId\": 52002,\n" + 
						"      \"state\": 0,\n" + 
						"      \"odds\": [\n" + 
						"        {\n" + 
						"          \"id\": 183104,\n" + 
						"          \"odds\": 1.41,\n" + 
						"          \"winner\": 0\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"id\": 183105,\n" + 
						"          \"odds\": 2.83,\n" + 
						"          \"winner\": 0\n" + 
						"        }\n" + 
						"      ]\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"matchId\": 81959,\n" + 
						"      \"state\": 0,\n" + 
						"      \"odds\": [\n" + 
						"        {\n" + 
						"          \"id\": 182764,\n" + 
						"          \"odds\": 2.66,\n" + 
						"          \"winner\": 0\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"id\": 182765,\n" + 
						"          \"odds\": 1.44,\n" + 
						"          \"winner\": 0\n" + 
						"        }\n" + 
						"      ]\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"matchId\": 82011,\n" + 
						"      \"state\": 0,\n" + 
						"      \"odds\": [\n" + 
						"        {\n" + 
						"          \"id\": 182874,\n" + 
						"          \"odds\": 2.66,\n" + 
						"          \"winner\": 0\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"id\": 182875,\n" + 
						"          \"odds\": 1.44,\n" + 
						"          \"winner\": 0\n" + 
						"        }\n" + 
						"      ]\n" + 
						"    }\n" + 
						"  ]\n" + 
						"}");
				
				this.sendMessage("{\n" + 
						"  \"channel\": \"MATCH\",\n" + 
						"  \"data\": [\n" + 
						"    {\n" + 
						"      \"matchId\": 80665,\n" + 
						"      \"state\": 1,\n" + 
						"      \"winners\": null\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"matchId\": 82398,\n" + 
						"      \"state\": 1,\n" + 
						"      \"winners\": null\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"matchId\": 82399,\n" + 
						"      \"state\": 0,\n" + 
						"      \"winners\": null\n" + 
						"    }\n" + 
						"  ]\n" + 
						"}");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(2000);// 主线程每隔1秒钟，打印当前时钟时间
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@OnClose
	public void onClose() {

	}

	@OnMessage
	public void onMessage(String message, Session session) {
	}

	@OnError
	public void onError(Session session, Throwable error) {
		error.printStackTrace();
	}

	public void sendMessage(String message) throws IOException {
		this.session.getBasicRemote().sendText(message);
	}
}
