package com.actuators.alpha;

import java.util.Calendar;
import java.util.concurrent.atomic.LongAdder;

public class TPSCounter {
	LongAdder count;
	int maxServiceHits = 2;
	Calendar expiry = null;
	
	TPSCounter(){
		this.count = new LongAdder();
		this.expiry = Calendar.getInstance();
		this.expiry.add(Calendar.MINUTE, 1);
	}
	
	boolean isExpired() {
		return Calendar.getInstance().after(expiry);
	}
	
	boolean isWeak() {
		return (count.intValue() > maxServiceHits);
	}

	//Everytime the method is invoked the count will increase by 1
	void increment() {
		count.increment();
	}
}
