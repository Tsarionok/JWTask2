package main.by.training.epam.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Text implements Iterable<Paragraph> {
	
	private List<Paragraph> paragraphs = new ArrayList<>();
	
	public Text() {

	}
	
	public void addParagraph(Paragraph paragraph){
		paragraphs.add(paragraph);
	}
	
	public Paragraph getParagraph(int i){
		return paragraphs.get(i);
	}
	
	public List<Sentence> getAllSentenses(){
		List<Sentence> list = new ArrayList<>();
		
		for (Paragraph paragraph : paragraphs) {
			for (Sentence sentence : paragraph) {
				list.add(sentence);
			}
		}
		return list;
	}
	
	public List<Word> getAllWords(){
		
		List<Word> list = new ArrayList<Word>();

		for (Paragraph paraghraph : paragraphs) {
			for (Sentence sentence : paraghraph) {
				for (SimplePart sp : sentence) {
					if (sp.isWord()) {
						list.add((Word) sp);
					}
				}
			}
		}
		
		return list;
	}
	
	@Override
	public Iterator<Paragraph> iterator() {
		return paragraphs.iterator();
	}
	
}
