package org.jsyuger.web.util.strategy;
public class Context {
	private Strategy strategy;
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	public int[] sort(int[] array){
		return this.strategy.sort(array);
	}
}
