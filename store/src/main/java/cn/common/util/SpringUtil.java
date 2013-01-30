package cn.common.util;

/**
 * 获取BEAN
 * @author Hover
 *
 */
public class SpringUtil {
	public static Env getEnv(){
		return threadLocal.get();
	}
	public static void removeEnv(){
		threadLocal.remove();
	}
	
	private static ThreadLocal<Env> threadLocal = new ThreadLocal<Env>(){
		@Override
		protected Env initialValue() {
			return new Env();
		}
	};
}
