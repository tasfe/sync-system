package com.store.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.store.dao.ItemDAO;
import com.store.domain.Item;

@Service("itemService")
public class ItemService {

	@Resource(name="itemDao")
	private ItemDAO itemDao;

	public void setItemDao(ItemDAO itemDao) {
		this.itemDao = itemDao;
	}

	public List<Item> queryForList(String sql, Object...objs){
		return itemDao.queryForList(sql, objs);
	}

	public void addItem(String sql, Item item) {
		itemDao.addItem(sql,item);
	}
}
