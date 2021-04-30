package me.shab.events.abstracts;


public class Events extends EventAbstract {
	
	public Events() {
		onStart();
		onFinish();
	}
	
	public void onStart() {
		
	}
	
	public void onEnd() {
		
	}
	
	private void onFinish() {
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				onEnd();
			}
		});
	}
}
