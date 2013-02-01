package com.store.domain;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Item implements BaseEntity{
	private String id;
	private String name;

	// 商品信息
	private String title;
	private double price;

	// 淘宝链接
	private String link;

	// 库存量
	private Integer stock;

	// 关键字，用逗号分隔，如：（白色，牛仔裤，男装）
	private String keyWord;

	// 所属店铺ID
	private int shop_id;

	private Date create_at;
	private Date update_at;

	// 属于哪个物品类型
	private ItemType type;

	// 物品的特征系列号
	// 如：衣服（AA） - 牛仔裤（C2） - 某某牌...某某型号 （0406）- 大码（01）- 蓝色（33）
	// serialNum = AA-C2-04-06-01-33
	// private String serialNum;

	@SuppressWarnings("unchecked")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public int getShop_id() {
		return shop_id;
	}

	public void setShop_id(int shopId) {
		shop_id = shopId;
	}

	public Date getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Date createAt) {
		create_at = createAt;
	}

	public Date getUpdate_at() {
		return update_at;
	}

	public void setUpdate_at(Date updateAt) {
		update_at = updateAt;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	@Override
	public String tableName() {		
		return "syn_goods";
	}

	/**
	 * 取得实体类的各字段setter方法以及和数据库中的列名对应
	 * <String,Object[]>: String是数据库中表的字段名，
	 * obj[0]预留，obj[1]是对应setter，obj[2]是接入参数数据类型，用于反射调用。
	 */
	@Override
	public Map<String, Object[]> getFieldInfo() {
		Map<String, Object[]> map = new HashMap<String, Object[]>();
		map.put("id", new Object[] { id, "setId", long.class });
		map.put("title", new Object[] { title, "setTitle", String.class });
		map.put("price", new Object[]{price, "setPrice", int.class});
		map.put("link", new Object[]{link, "setLink", String.class});
		map.put("stock", new Object[] { stock, "setStock", String.class });
		map.put("key", new Object[] { keyWord, "setKeyWord", String.class });
		map.put("shop_id", new Object[] { shop_id, "setShop_id", String.class });
		map.put("create_at", new Object[] { create_at, "setCreate_at", Date.class });
		map.put("update_at", new Object[] { update_at, "setUpdate_at", Date.class });
		return map;
	}


}
