package note.pattern.behavioral.Strategy;

import java.util.HashMap;
import java.util.Map;

import note.pattern.behavioral.Strategy.sample.IStrategy;
import note.pattern.behavioral.Strategy.sample.strategy.StrategyA;

/**
 * Strategy�Ҧ��ۭ��b�A�ȲӸ`�κt��y�{���ʸˡA�N�A�ȻP�t��k�ʸˬ��@�ӭӪ�Strategy����A
 * ���ϥΪA�ȩκt��k���Ȥ�ݥi�H�̻ݨD�⴫�A�ȩκt��k�A�Ӥ������ߪA�ȩκt��k����@�覡�C
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
