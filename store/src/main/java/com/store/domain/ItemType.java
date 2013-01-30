package com.store.domain;

/**
 * 
 * @author Hugo.Foo
 * 物品类型表
 */
public class ItemType {
	
	private Integer id;
	private String name;
	
	//类型描述
	private String summary;
	
	//上级分类
	private ItemType parent;
}
