package com.github.jweixin.jwx.config;

import com.github.jweixin.jwx.context.Weixin;
import com.github.jweixin.jwx.util.ClassFilter1;

/**
 * 微信类过滤器
 * @author Administrator
 *
 */
public class WeixinClassFilter implements ClassFilter1 {

	@Override
	public boolean accept(Class<?> clazz) {
		return clazz.isAnnotationPresent(Weixin.class);
	}

}
