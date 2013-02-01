package com.store.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.store.domain.Item;
import com.store.service.ItemService;

@ContextConfiguration(locations = {
		"classpath:spring/spring-base.xml"})
public class TestItemService extends AbstractJUnit4SpringContextTests{

	Item item = new Item();
	
	@Resource(name="itemService")
	private ItemService itemService;

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@Test
	public void test(){
		System.out.println("test...");
	}
	
	@Test
	public void testQueryForList(){
		String sql = "select * from " + item.tableName() + ";";
		List<Item> list = itemService.queryForList(sql);
		System.out.println(list.size());
		for(Item it : list){
			System.out.println(it.getKeyWord() + "," + it.getLink());
		}
	}
	
	@Test
	public void testInsert(){
		String sql = "insert into " + item.tableName() + "(id,title,link,key,store_id,update_at,create_at) values(?,?,?,?,?,?,?);";
		item = new Item();
		item.setId("HFG78878");
		item.setStock(40);
		item.setLink("http://www.163.com");
		item.setTitle("买啦喂");
		item.setShop_id(1);
		item.setCreate_at(new Date());
		item.setUpdate_at(new Date());
		itemService.addItem(sql,item);
	}
}
