package jude.calculator.rpn.storage;

public interface Caretaker {
	
	void saveMemento(MementoIF memento);
	
	MementoIF popMemento();

}
