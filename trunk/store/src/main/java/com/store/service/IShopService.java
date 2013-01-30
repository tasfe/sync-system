package com.store.service;

import java.util.List;

import com.store.domain.Shop;
import com.store.domain.User;

public interface IShopService {

	Integer addShop(Shop shop);
	
	Integer updateShop(long shopId, Shop shop);
	
	Integer addAdmins(long shopId, long[] userIds);
	
	/**
	 * 撤销此商店的管理员资格。
	 */
	Integer deleteAdmins(long shopId, long[] userIds);
	
	List<User> getAdmins(Shop shop);
}
