package app;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;

public class TestSolutionTemplate extends AbstractTestSolution {

	public TestSolutionTemplate(String inputFilePath, String outputFilePath) {
		super(inputFilePath, outputFilePath, new SolutionTemplate(), TestSolutionTemplate.class);
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> getFilePaths() {
		return Arrays.asList(new Object[][] {
				{ "input01.txt", "output01.txt" },
				{ "input02.txt", "output02.txt" }
		});
	}
}
