package main.by.training.epam.parsers;

import java.util.List;

import main.by.training.epam.entity.Text;

public class TextParser {


	private List<String> rows;

	public TextParser(List<String> rows) {
		this.rows = rows;
	}

	public Text parseRows(){
		
		Text text = new Text();
		ParagraphsParser paragraphsParser = new ParagraphsParser();
		
		for (String row : rows) {
			text.addParagraph(paragraphsParser.parseSentences(row));
		}
		return text;
	}

}
