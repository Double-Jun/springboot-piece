package org.doubleganse.springboot.piece.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Author chenmingjun
 * @Date 2017/12/7 19:04
 */
@Service
public class DemoService {

	@Value("lisi")
	private String anothor;

	public String getAnothor() {
		return anothor;
	}

	public void setAnothor(String anothor) {
		this.anothor = anothor;
	}
}
