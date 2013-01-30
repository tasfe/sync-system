package com.store.domain;

import java.util.List;

public class Message {

	private Integer id;
	
	//标题
	private String title;
	
	//正文
	private String content;
	
	//发布者
	private User author;
	
	//哪个商店可见
	private List<Shop> shops;
	
}
