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
				this.sendMessage("{\n" + 
						"  \"channel\": \"LOTTEY\",\n" + 
						"  \"data\": [\n" + 
						"    {\n" + 
						"      \"id\": 92276,\n" + 
						"      \"category\": 1,\n" + 
						"      \"state\": 0,\n" + 
						"      \"name\": \"dota时时乐\",\n" + 
						"      \"shortName\": \"dota lottery\",\n" + 
						"      \"eid\": \"20191031971\",\n" + 
						"      \"startDate\": \"2019-10-31 13:35:31\",\n" + 
						"      \"endDate\": \"2019-10-31 13:36:11\",\n" + 
						"      \"lastWinner\": {\n" + 
						"        \"createDate\": \"2019-09-24 17:32:28\",\n" + 
						"        \"rowState\": 0,\n" + 
						"        \"id\": 53,\n" + 
						"        \"name\": \"娜迦海妖 司里希丝\",\n" + 
						"        \"camp\": \"天辉\",\n" + 
						"        \"feature\": \"敏捷\",\n" + 
						"        \"attack\": \"近战\",\n" + 
						"        \"attackShortName\": null,\n" + 
						"        \"sex\": 0,\n" + 
						"        \"hasMagic\": 0,\n" + 
						"        \"game\": \"dota\",\n" + 
						"        \"no\": 53,\n" + 
						"        \"eid\": null,\n" + 
						"        \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
						"      },\n" + 
						"      \"matches\": [\n" + 
						"        {\n" + 
						"          \"name\": \"英雄编号单双\",\n" + 
						"          \"shortName\": \"no even or odd\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 1,\n" + 
						"              \"name\": \"单\",\n" + 
						"              \"shortName\": \"even\",\n" + 
						"              \"odds\": 1.98\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 2,\n" + 
						"              \"name\": \"双\",\n" + 
						"              \"shortName\": \"odd\",\n" + 
						"              \"odds\": 1.98\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"英雄阵营\",\n" + 
						"          \"shortName\": \"camp\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 3,\n" + 
						"              \"name\": \"天辉\",\n" + 
						"              \"shortName\": \"radiant\",\n" + 
						"              \"odds\": 1.83\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 4,\n" + 
						"              \"name\": \"夜魇\",\n" + 
						"              \"shortName\": \"dire\",\n" + 
						"              \"odds\": 2.01\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"攻击方式\",\n" + 
						"          \"shortName\": \"attack type\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 8,\n" + 
						"              \"name\": \"近战\",\n" + 
						"              \"shortName\": \"melee\",\n" + 
						"              \"odds\": 1.98\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 9,\n" + 
						"              \"name\": \"远程\",\n" + 
						"              \"shortName\": \"remote\",\n" + 
						"              \"odds\": 1.86\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"英雄属性\",\n" + 
						"          \"shortName\": \"feature\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 5,\n" + 
						"              \"name\": \"智力\",\n" + 
						"              \"shortName\": \"smarty\",\n" + 
						"              \"odds\": 2.7\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 6,\n" + 
						"              \"name\": \"力量\",\n" + 
						"              \"shortName\": \"power\",\n" + 
						"              \"odds\": 2.9\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 7,\n" + 
						"              \"name\": \"敏捷\",\n" + 
						"              \"shortName\": \"agility\",\n" + 
						"              \"odds\": 2.96\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        }\n" + 
						"      ]\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"id\": 92277,\n" + 
						"      \"category\": 3,\n" + 
						"      \"state\": 0,\n" + 
						"      \"name\": \"英雄时时乐\",\n" + 
						"      \"shortName\": \"lol lottery\",\n" + 
						"      \"eid\": \"20191031971\",\n" + 
						"      \"startDate\": \"2019-10-31 13:35:31\",\n" + 
						"      \"endDate\": \"2019-10-31 13:36:11\",\n" + 
						"      \"lastWinner\": {\n" + 
						"        \"createDate\": \"2019-09-24 18:07:13\",\n" + 
						"        \"rowState\": 0,\n" + 
						"        \"id\": 297,\n" + 
						"        \"name\": \"暮光之眼 慎\",\n" + 
						"        \"camp\": null,\n" + 
						"        \"feature\": null,\n" + 
						"        \"attack\": \"近战\",\n" + 
						"        \"attackShortName\": null,\n" + 
						"        \"sex\": 1,\n" + 
						"        \"hasMagic\": 0,\n" + 
						"        \"game\": \"lol\",\n" + 
						"        \"no\": 100,\n" + 
						"        \"eid\": null,\n" + 
						"        \"lastModifiedDate\": \"2019-09-24 18:07:13\"\n" + 
						"      },\n" + 
						"      \"matches\": [\n" + 
						"        {\n" + 
						"          \"name\": \"英雄编号单双\",\n" + 
						"          \"shortName\": \"no even or odd\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 10,\n" + 
						"              \"name\": \"单\",\n" + 
						"              \"shortName\": \"even\",\n" + 
						"              \"odds\": 1.98\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 11,\n" + 
						"              \"name\": \"双\",\n" + 
						"              \"shortName\": \"odd\",\n" + 
						"              \"odds\": 1.98\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"攻击方式\",\n" + 
						"          \"shortName\": \"attack type\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 16,\n" + 
						"              \"name\": \"近战\",\n" + 
						"              \"shortName\": \"melee\",\n" + 
						"              \"odds\": 1.79\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 17,\n" + 
						"              \"name\": \"远程\",\n" + 
						"              \"shortName\": \"remote\",\n" + 
						"              \"odds\": 2.07\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"英雄性别\",\n" + 
						"          \"shortName\": \"sex\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 12,\n" + 
						"              \"name\": \"男\",\n" + 
						"              \"shortName\": \"male\",\n" + 
						"              \"odds\": 1.47\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 13,\n" + 
						"              \"name\": \"女\",\n" + 
						"              \"shortName\": \"female\",\n" + 
						"              \"odds\": 2.76\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"有无魔法值\",\n" + 
						"          \"shortName\": \"has magic\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 14,\n" + 
						"              \"name\": \"有\",\n" + 
						"              \"shortName\": \"yes\",\n" + 
						"              \"odds\": 1.13\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 15,\n" + 
						"              \"name\": \"无\",\n" + 
						"              \"shortName\": \"no\",\n" + 
						"              \"odds\": 6.33\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        }\n" + 
						"      ]\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"id\": 92278,\n" + 
						"      \"category\": 4,\n" + 
						"      \"state\": 0,\n" + 
						"      \"name\": \"王者时时乐\",\n" + 
						"      \"shortName\": \"aov lottery\",\n" + 
						"      \"eid\": \"20191031971\",\n" + 
						"      \"startDate\": \"2019-10-31 13:35:31\",\n" + 
						"      \"endDate\": \"2019-10-31 13:36:11\",\n" + 
						"      \"lastWinner\": {\n" + 
						"        \"createDate\": \"2019-09-24 17:58:52\",\n" + 
						"        \"rowState\": 0,\n" + 
						"        \"id\": 142,\n" + 
						"        \"name\": \"杨戬\",\n" + 
						"        \"camp\": null,\n" + 
						"        \"feature\": null,\n" + 
						"        \"attack\": \"近战\",\n" + 
						"        \"attackShortName\": null,\n" + 
						"        \"sex\": 1,\n" + 
						"        \"hasMagic\": 1,\n" + 
						"        \"game\": \"gok\",\n" + 
						"        \"no\": 29,\n" + 
						"        \"eid\": null,\n" + 
						"        \"lastModifiedDate\": \"2019-09-24 17:58:52\"\n" + 
						"      },\n" + 
						"      \"matches\": [\n" + 
						"        {\n" + 
						"          \"name\": \"英雄编号单双\",\n" + 
						"          \"shortName\": \"no even or odd\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 18,\n" + 
						"              \"name\": \"单\",\n" + 
						"              \"shortName\": \"even\",\n" + 
						"              \"odds\": 1.98\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 19,\n" + 
						"              \"name\": \"双\",\n" + 
						"              \"shortName\": \"odd\",\n" + 
						"              \"odds\": 1.98\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"攻击方式\",\n" + 
						"          \"shortName\": \"attack type\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 24,\n" + 
						"              \"name\": \"近战\",\n" + 
						"              \"shortName\": \"melee\",\n" + 
						"              \"odds\": 1.84\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 25,\n" + 
						"              \"name\": \"远程\",\n" + 
						"              \"shortName\": \"remote\",\n" + 
						"              \"odds\": 2.01\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"英雄性别\",\n" + 
						"          \"shortName\": \"sex\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 20,\n" + 
						"              \"name\": \"男\",\n" + 
						"              \"shortName\": \"male\",\n" + 
						"              \"odds\": 1.34\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 21,\n" + 
						"              \"name\": \"女\",\n" + 
						"              \"shortName\": \"female\",\n" + 
						"              \"odds\": 3.4\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        },\n" + 
						"        {\n" + 
						"          \"name\": \"有无魔法值\",\n" + 
						"          \"shortName\": \"has magic\",\n" + 
						"          \"odds\": [\n" + 
						"            {\n" + 
						"              \"id\": 22,\n" + 
						"              \"name\": \"有\",\n" + 
						"              \"shortName\": \"yes\",\n" + 
						"              \"odds\": 1.34\n" + 
						"            },\n" + 
						"            {\n" + 
						"              \"id\": 23,\n" + 
						"              \"name\": \"无\",\n" + 
						"              \"shortName\": \"no\",\n" + 
						"              \"odds\": 3.4\n" + 
						"            }\n" + 
						"          ]\n" + 
						"        }\n" + 
						"      ]\n" + 
						"    }\n" + 
						"  ]\n" + 
						"}");
				
				this.sendMessage("{\n" + 
						"  \"channel\": \"LOTTEY_RESULT\",\n" + 
						"  \"data\": [\n" + 
						"    {\n" + 
						"      \"eid\": \"20191031971\",\n" + 
						"      \"result\": {\n" + 
						"        \"createDate\": \"2019-09-24 17:32:28\",\n" + 
						"        \"rowState\": 0,\n" + 
						"        \"id\": 104,\n" + 
						"        \"name\": \"水晶室女 莉莱\",\n" + 
						"        \"camp\": \"天辉\",\n" + 
						"        \"feature\": \"智力\",\n" + 
						"        \"attack\": \"远程\",\n" + 
						"        \"attackShortName\": null,\n" + 
						"        \"sex\": 0,\n" + 
						"        \"hasMagic\": 0,\n" + 
						"        \"game\": \"dota\",\n" + 
						"        \"no\": 104,\n" + 
						"        \"eid\": null,\n" + 
						"        \"lastModifiedDate\": \"2019-09-24 17:32:28\"\n" + 
						"      },\n" + 
						"      \"name\": \"dota\",\n" + 
						"      \"category\": 1\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"eid\": \"20191031971\",\n" + 
						"      \"result\": {\n" + 
						"        \"createDate\": \"2019-09-24 18:07:11\",\n" + 
						"        \"rowState\": 0,\n" + 
						"        \"id\": 232,\n" + 
						"        \"name\": \"海洋之灾 普朗克\",\n" + 
						"        \"camp\": null,\n" + 
						"        \"feature\": null,\n" + 
						"        \"attack\": \"近战\",\n" + 
						"        \"attackShortName\": null,\n" + 
						"        \"sex\": 1,\n" + 
						"        \"hasMagic\": 1,\n" + 
						"        \"game\": \"lol\",\n" + 
						"        \"no\": 32,\n" + 
						"        \"eid\": null,\n" + 
						"        \"lastModifiedDate\": \"2019-09-24 18:07:11\"\n" + 
						"      },\n" + 
						"      \"name\": \"lol\",\n" + 
						"      \"category\": 3\n" + 
						"    },\n" + 
						"    {\n" + 
						"      \"eid\": \"20191031971\",\n" + 
						"      \"result\": {\n" + 
						"        \"createDate\": \"2019-09-24 17:58:51\",\n" + 
						"        \"rowState\": 0,\n" + 
						"        \"id\": 119,\n" + 
						"        \"name\": \"米莱狄\",\n" + 
						"        \"camp\": null,\n" + 
						"        \"feature\": null,\n" + 
						"        \"attack\": \"远程\",\n" + 
						"        \"attackShortName\": null,\n" + 
						"        \"sex\": 0,\n" + 
						"        \"hasMagic\": 1,\n" + 
						"        \"game\": \"gok\",\n" + 
						"        \"no\": 6,\n" + 
						"        \"eid\": null,\n" + 
						"        \"lastModifiedDate\": \"2019-09-24 17:58:51\"\n" + 
						"      },\n" + 
						"      \"name\": \"gok\",\n" + 
						"      \"category\": 4\n" + 
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
