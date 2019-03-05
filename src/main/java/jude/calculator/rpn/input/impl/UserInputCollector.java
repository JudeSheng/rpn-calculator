package jude.calculator.rpn.input.impl;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import jude.calculator.rpn.common.RpnCalculatorUtils;
import jude.calculator.rpn.input.InputCollector;
import jude.calculator.rpn.storage.impl.StackStorage;

@Component
public class UserInputCollector implements InputCollector {
	
	private static Logger log = LoggerFactory.getLogger(RpnCalculatorUtils.class);

	@Override
	public String[] collector() {
		String inputs[] = null;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			inputs = br.readLine().split(StackStorage.SPACE);
		} catch (Exception e) {
			log.error("Exception in UserInputCollector", e);
		}
		return inputs;
	}

}
