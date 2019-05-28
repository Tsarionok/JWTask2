package main.by.training.epam.entity;

import java.util.Iterator;
import java.util.List;

public class Sentence implements Iterable<SimplePart> {
	
	private List<SimplePart> parts;
	
	public Sentence(List<SimplePart> parts) {
		this.parts = parts;
	}

	public int getSize(){
		return parts.size();
	}
	
	public SimplePart getPart(int i){
		return parts.get(i);
	}
	
	@Override
	public Iterator<SimplePart> iterator() {
		return parts.iterator();
	}
	
}
