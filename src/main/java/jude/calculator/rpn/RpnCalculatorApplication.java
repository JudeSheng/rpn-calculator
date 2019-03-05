package jude.calculator.rpn;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jude.calculator.rpn.calculator.Calculator;
import jude.calculator.rpn.common.RpnCalculatorUtils;


/**
 * Reverse Polish Notation Calculator
 * @author Shengxiaoqi
 * @version 1.0.0
 *
 */
@SpringBootApplication
public class RpnCalculatorApplication {
	
	private static Logger log = LoggerFactory.getLogger(RpnCalculatorUtils.class);
	
	@Autowired
	private Calculator calculator;

	public static void main(String[] args) {
		try {
			SpringApplication.run(RpnCalculatorApplication.class, args);
		} catch (Exception e) {
			log.error("Exception in RpnCalculatorApplication", e);
		}
		
	}
	
	@PostConstruct
	public void startup() {
		try {
			System.out.println("============RpnCalculator Started============");
			calculator.startup();
		} catch (Exception e) {
			log.error("Exception in startup", e);
		}
	}

}
