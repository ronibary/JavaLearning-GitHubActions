package designpatterns.behavioral.chain;

public interface DispenseChain {

	void setNextLink(DispenseChain nextChain);
	
	void dispense(Currency cur);
}