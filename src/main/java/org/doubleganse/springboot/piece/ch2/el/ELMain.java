package org.doubleganse.springboot.piece.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author chenmingjun
 * @Date 2017/12/7 19:13
 */
public class ELMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ELConfig.class);
		DemoService demoService = context.getBean(DemoService.class);
		System.out.println(demoService.getAnothor());
		ELConfig elConfig = context.getBean(ELConfig.class);
		elConfig.printField();
	}
}
