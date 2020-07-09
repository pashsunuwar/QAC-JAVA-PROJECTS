package com.qa.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MorseTranslator {

	public Map<String, String> morseCode = new HashMap<>();

	public void populateMorseMap() {

		morseCode.put(".---", "J");
		morseCode.put(".-", "A");
		morseCode.put("...-", "V");
		morseCode.put("..", "I");
		morseCode.put("...", "S");
		morseCode.put("-.-.", "C");
		morseCode.put("---", "O");
		morseCode.put(".-..", "L");
		morseCode.put("-.-", "K");
		morseCode.put("/", " ");

	}

	public String translate(String input) {
		String[] split = input.split(" ");
		StringBuilder build = new StringBuilder();
		for (String x : split) {
			String letter = morseCode.get(x);
			build.append(letter);
		}
		String ret = build.toString();

		return ret;
	}

}
