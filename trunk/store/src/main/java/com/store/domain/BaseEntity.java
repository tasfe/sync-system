package com.store.domain;
import java.util.Map;

public interface BaseEntity {
	public String tableName();
	public Map<String , Object[]> getFieldInfo();
	public <T> T getId();
}
