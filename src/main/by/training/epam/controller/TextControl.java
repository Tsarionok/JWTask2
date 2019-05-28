package main.by.training.epam.controller;

import main.by.training.epam.dao.FileUtilsDao;
import main.by.training.epam.entity.Text;
import main.by.training.epam.parsers.TextParser;
import main.by.training.epam.service.SortByLength;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.List;


public class TextControl {
    private static final Logger log = LogManager.getLogger(TextControl.class);

    private final static String INITIAL_FILE_PATH = "./res/essence.txt";
    private final static String RESTORED_FILE_PATH = "./res/restored.txt";


    public void runMain(){
        List<String> list = FileUtilsDao.getFileRows(INITIAL_FILE_PATH);
        TextParser tp = new TextParser(list);
        Text text = tp.parseRows();

        SortByLength tasks = new SortByLength();
        try {
            tasks.sortText(text);
        }catch (IOException e){
            log.error(e);
        }
        FileUtilsDao.restoreTextInFile(RESTORED_FILE_PATH, text);

    }
}
