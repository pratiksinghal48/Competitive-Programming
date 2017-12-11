package algorithms.warmup.BirthdayCakeCandle;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;

import app.AbstractTestSolution;

public class TestSolution extends AbstractTestSolution {

	public TestSolution(String inputFilePath, String outputFilePath) {
		super(inputFilePath, outputFilePath, new Solution(), TestSolution.class);
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> getFilePaths() {
		return Arrays.asList(new Object[][] {
				{ "input01.txt", "output01.txt" },
				{ "input08.txt", "output08.txt" }
		});
	}

}
