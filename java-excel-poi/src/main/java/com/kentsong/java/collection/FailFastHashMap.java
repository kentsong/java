package com.kentsong.java.collection;

import java.util.HashMap;

public class FailFastHashMap<K, V> extends HashMap<K, V> {

	private static final long serialVersionUID = 1L;
	
	@Override
	public V get(Object K) {
		if(!containsKey(K)) {
			throw new IllegalArgumentException("key:" + K + " does not exist.");
		}
		
		return super.get(K);
	}

}
