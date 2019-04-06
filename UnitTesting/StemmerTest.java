package UnitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.tartarus.snowball.ext.PorterStemmer;

//import src.Stemmer;
//import org.testng.annotations.Test;

//import static org.testng.Assert.assertEquals;

public class StemmerTest
{
	//private final Stemmer customPorterStemmer = new Stemmer();

	
	@Test
	public void stem()
	{
		//assertEquals(customPorterStemmer.stem("use"), "us");
		//assertEquals(customPorterStemmer.stem("hypertension"), "hypertens");

		PorterStemmer porterStemmer = new PorterStemmer();
		porterStemmer.setCurrent("use");
		porterStemmer.stem();
		assertEquals(porterStemmer.getCurrent(), "us");
	}
}
