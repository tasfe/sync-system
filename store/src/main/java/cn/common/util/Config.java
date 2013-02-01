package cn.common.util;

/**
 * 配置
 * @author Hover
 *
 */
public class Config {
	public static Config instance(){
		return SpringUtil.getEnv().getBean(Config.class);
	}
	private String host;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
}
