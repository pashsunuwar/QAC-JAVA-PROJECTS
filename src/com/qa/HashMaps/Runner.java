package com.qa.HashMaps;

public class Runner {

	public static void main(String[] args) {
		MorseTranslator translator = new MorseTranslator();
		translator.populateMorseMap();
		System.out.println(translator.translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	}

}
