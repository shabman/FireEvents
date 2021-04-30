package me.shab.events.abstracts;

import me.shab.events.interfaces.*;

public abstract class EventAbstract implements Start, End {
	@Override
	public abstract void onStart();
	
	@Override
	public abstract void onEnd();
}
