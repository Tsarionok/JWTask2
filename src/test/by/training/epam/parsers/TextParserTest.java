package test.by.training.epam.parsers;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import main.by.training.epam.entity.ParagraphText;
import main.by.training.epam.entity.Text;
import main.by.training.epam.parsers.TextParser;
import org.junit.Test;

public class TextParserTest {

	@Test
	public void testParseRows() {
		boolean flag = true;
		
		List<String> testRows = new ArrayList<>();
		testRows.add("Sentence.");
		
		TextParser textParser = new TextParser(testRows);
		Text parsed = textParser.parseRows();

		if(!(parsed.getParagraph(0) instanceof ParagraphText)){
			flag = false;
		}
		
		assertTrue(flag);
	}
}
