package com.dom;

public class Score extends White2{
		int value;
		public Score(String s) throws ScoreFormatException{
			try {
				value = Integer.parseInt(s);
			}catch(NumberFormatException e) {
			throw new ScoreFormatException();
		}
	}
}
