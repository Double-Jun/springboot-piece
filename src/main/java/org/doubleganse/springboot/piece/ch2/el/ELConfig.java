package org.doubleganse.springboot.piece.ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @Author chenmingjun
 * @Date 2017/12/7 19:08
 */
@Configuration
@ComponentScan("org.doubleganse.springboot.piece.ch2.el")
@PropertySource("classpath:org/doubleganse/springboot/piece/ch2/el/test.properties")
public class ELConfig {

	@Value("I Love You")
	private String normal;

	@Value("#{systemProperties['os.name']}")
	private String osName;

	@Value("#{T(java.lang.Math).random()*100.0}")
	private double randomNumber;

	@Value("#{demoService.anothor}")
	private String fromAnother;

	@Value("classpath:org/doubleganse/springboot/piece/ch2/el/test.txt")
	private Resource testFile;

	@Value("http://www.baidu.com")
	private Resource testUrl;

	@Value("${book.name}")
	private String bookName;

	@Value("${book.author}")
	private String author;

	public void printField() {
		System.out.println("normal=" + normal);
		System.out.println("osName=" + osName);
		System.out.println("randomNumber=" + randomNumber);
		System.out.println("fromAnother=" + fromAnother);
		System.out.println("bookName=" + bookName);
		System.out.println("author=" + author);
		try {
			System.out.println("testFile=" + IOUtils.toString(testFile.getInputStream(), "utf-8"));
			System.out.println("testUrl=" + IOUtils.toString(testUrl.getInputStream(), "utf-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
