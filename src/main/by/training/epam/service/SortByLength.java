package main.by.training.epam.service;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import main.by.training.epam.entity.Text;
import main.by.training.epam.entity.Word;

public class SortByLength {

	public void sortText(Text text) throws IOException {

		List<Word> list = text.getAllWords();

		Collections.sort(list, new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return (o1.getWordSize() - o2.getWordSize());
			}
		});

		BufferedWriter bw  = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream("./res/restored.txt"), Charset.forName("UTF-8")
		));
		for (Word s1:list){
			bw.write(s1.getItem());
			bw.write('\n');
		}
		bw.flush();
		bw.close();

		char firstChar = 32;

		for (int i = 0; i < list.size(); i++) {

			if (list.get(i).toString().charAt(0) == firstChar) {
				System.out.print(list.get(i) + ", ");
			} else {

				firstChar = list.get(i).toString().charAt(0);
				System.out.println();
				System.out.print(list.get(i) + " ");
			}
		}

	}
}
