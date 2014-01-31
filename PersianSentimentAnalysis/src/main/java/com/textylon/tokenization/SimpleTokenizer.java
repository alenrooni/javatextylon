package com.textylon.tokenization;

import java.util.List;

public class SimpleTokenizer {
	public String[] tokenize(String text){
		String [] tokens = text.split(" ");
		return tokens;
		
	}
}
