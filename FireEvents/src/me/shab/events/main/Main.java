package me.shab.events.main;

import java.time.LocalTime;

import me.shab.events.abstracts.*;
import me.shab.events.interfaces.annotations.Handled;

@Handled("Run events here")
public class Main {

	public static void main(String[] args) throws InterruptedException {
		new Events() {
			@Override
			public void onStart() {
				System.out.println("Event Started at: " + LocalTime.now());
			}
			@Override
			public void onEnd() {
				System.out.println("Finished at: " + LocalTime.now());
			}
		};
		/*
		* Checks if the events fire correctly
		*/
		int x = 0;
		while (x < 10) {
			Thread.sleep(100);
			x++;
		}
	}	
}
