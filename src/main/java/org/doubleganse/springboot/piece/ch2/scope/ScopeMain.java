package org.doubleganse.springboot.piece.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author chenmingjun
 * @Date 2017/12/7 18:27
 */
public class ScopeMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(DemoScopeConfig.class);
		DemoSingletonService singleton = applicationContext.getBean(DemoSingletonService.class);
		DemoSingletonService singleton2 = applicationContext.getBean(DemoSingletonService.class);
		DemoPrototypeService prototype = applicationContext.getBean(DemoPrototypeService.class);
		DemoPrototypeService prototype2 = applicationContext.getBean(DemoPrototypeService.class);

		System.out.println("singleton bean 是否相等:" + (singleton == singleton2));
		System.out.println("prototype bean 是否相等:" + (prototype == prototype2));
	}
}
