package models;

import java.util.ArrayList;

// subject for observer pattern to observe changes
public abstract class Subject {
	ArrayList <Observer> observers = new ArrayList();
	
	public void attach(Observer o)
	{
		this.observers.add(o);
	}
	
	public void detach(Observer o)
	{
		this.observers.remove(o);
	}
	
	public void Notify()
	{
		for (Observer o : observers)
		{
			o.update();
		}
	}
}
