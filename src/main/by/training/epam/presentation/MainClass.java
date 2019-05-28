package main.by.training.epam.presentation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import javafx.scene.control.TreeItemBuilder;
import main.by.training.epam.controller.TextControl;
import main.by.training.epam.dao.FileUtilsDao;
import main.by.training.epam.entity.Text;
import main.by.training.epam.parsers.TextParser;
import main.by.training.epam.service.SortByLength;

public class MainClass {

	public static void main(String[] args) {
		TextControl textControl = new TextControl();
		textControl.runMain();
	}
	
}
