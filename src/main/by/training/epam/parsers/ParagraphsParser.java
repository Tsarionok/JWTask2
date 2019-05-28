package main.by.training.epam.parsers;

import java.util.ArrayList;
import java.util.List;

import main.by.training.epam.entity.Paragraph;
import main.by.training.epam.entity.ParagraphText;
import main.by.training.epam.entity.Punctuation;
import main.by.training.epam.entity.Sentence;
import main.by.training.epam.entity.SimplePart;
import main.by.training.epam.entity.Space;
import main.by.training.epam.entity.Word;

public class ParagraphsParser {

	public ParagraphsParser() {
	}

	public Paragraph parseSentences(String row) {
		List<Sentence> list = new ArrayList<>();
		String[] splitSentences = row.split("\\.");
		for (String sentence : splitSentences) {
			if (!sentence.endsWith(":")) {
				sentence = sentence.concat(".");
			}
			List<SimplePart> simpleList = parseToSimpleParts(row);
			list.add(new Sentence(simpleList));
		}

		return new ParagraphText(list);

	}

	private List<SimplePart> parseToSimpleParts(String row) {
		List<SimplePart> simpleList = new ArrayList<>();

		StringBuilder strb = new StringBuilder();

			for (char character : row.toCharArray()) {
				if (Character.isLetter(character)) {
					strb.append(character);
				} else {
					if (strb.length() != 0) {
						simpleList.add(new Word(strb.toString()));
						strb = new StringBuilder();
					}
					
					if(Character.isWhitespace(character)){
						simpleList.add(new Space(String.valueOf(character)));
					} else {
						simpleList.add(new Punctuation(String.valueOf(character)));
					}
				}
			}

			if (strb.length() != 0) {
				simpleList.add(new Word(strb.toString()));
				strb = new StringBuilder();
			}

		return simpleList;
	}

}
