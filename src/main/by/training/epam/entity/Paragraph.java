package main.by.training.epam.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Paragraph implements Iterable<Sentence> {

	private List<Sentence> sentences = new ArrayList<>();
	
	public Paragraph(List<Sentence> sentences) {
		this.sentences = sentences;
	}
	
	public Sentence getSentence(int i){
		return sentences.get(i);
	}
	
	@Override
	public Iterator<Sentence> iterator() {
		return sentences.iterator();
	}
	
}
