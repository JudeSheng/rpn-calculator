package jude.calculator.rpn.output;

import jude.calculator.rpn.storage.Storage;

public interface Printer {
	
	void printIllegalOperator(String illegalOperator);
	
	void printIllegalDividend();
	
	void printInsufficientParameters(String operator, int position);
	
	String printStorage(Storage storage);

}
