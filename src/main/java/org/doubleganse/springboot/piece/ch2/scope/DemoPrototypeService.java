package org.doubleganse.springboot.piece.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @Author chenmingjun
 * @Date 2017/12/7 18:23
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}
