package test.by.training.epam.parsers;

import static org.junit.Assert.*;

import main.by.training.epam.entity.*;
import main.by.training.epam.parsers.ParagraphsParser;
import org.junit.Test;

public class ParagraphsParserTest {

	@Test
	public void testParseSentences() {
		
		String someText = " Sentence. Sentence:";
		boolean flag = true;
		
		Space space = new Space(" ");
		Word word = new Word("Sentence");
		Punctuation punctuationPoint = new Punctuation(".");
		Punctuation punctuationColon = new Punctuation(":");
		
		ParagraphsParser paragraphsParser = new ParagraphsParser();
		Paragraph parFromMethod = paragraphsParser.parseSentences(someText);
		
		for (Sentence sentence : parFromMethod) {
			if(!sentence.getPart(0).equals(space)){
				flag = false;
			}
			if(!sentence.getPart(1).equals(word)){
				flag = false;
			}
			if(!(sentence.getPart(2).equals(punctuationPoint)) &&
					!(sentence.getPart(2).equals(punctuationColon))){
				flag = false;
			}
		}
		
		assertTrue(flag);
	}
}
