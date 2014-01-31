package com.textylon.Analyzer;
import java.util.*;
public class MultiWordAnalyzer {
	private List<String> multiWords;
	public MultiWordAnalyzer(List<String> multiWords){
		this.multiWords = multiWords;
	}
	public String Analyze(String text){
		text = text.replaceAll("|", "");
		for(String multiWord: multiWords){
			if(text.contains(multiWord)){
				text = text.replaceAll(multiWord, multiWord.replaceAll(" ", "|"));
			}
		}
		return text;
	}
}
