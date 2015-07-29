package note.pattern.behavioral.Strategy;

import java.util.HashMap;
import java.util.Map;

import note.pattern.behavioral.Strategy.sample.IStrategy;
import note.pattern.behavioral.Strategy.sample.strategy.StrategyA;

/**
 * Strategy模式著重在服務細節或演算流程的封裝，將服務與演算法封裝為一個個的Strategy物件，
 * 讓使用服務或演算法的客戶端可以依需求抽換服務或演算法，而不用關心服務或演算法的實作方式。
 * @author 635_kentsong
 */

public class StrategyClient {

	public static void main(String[] args) {
		
		//init
		Map<Integer, IStrategy> strategyMap = new HashMap<Integer, IStrategy>();
		strategyMap.put(10, new StrategyA());
		strategyMap.put(20, new StrategyA());
		strategyMap.put(30, new StrategyA());
		
		//program start
		int acceptNum = 10; 
		IStrategy strategy = strategyMap.get(acceptNum);
		
		//do strategy
		strategy.doStrategy();

	}

}
