package app;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class AbstractTestSolution {
	protected String inputFilePath;
	protected String outputFilePath;
	protected InputStream inputTestStream;
	protected OutputStream outputTestStream;
	protected OutputStream actualOutputStream;
	protected IProblemSolver problemSolver;
	protected Class<? extends AbstractTestSolution> testClass;
	
	
	
	public AbstractTestSolution(String inputFilePath, String outputFilePath, IProblemSolver problemSolver,
			Class<? extends AbstractTestSolution> testClass) {
		this.inputFilePath = inputFilePath;
		this.outputFilePath = outputFilePath;
		this.problemSolver = problemSolver;
		this.testClass = testClass;
	}

	@Test
	public void testSolution() {
		setStreams();
		
		InputReader in = new InputReader(inputTestStream);
		OutputWriter out = new OutputWriter(actualOutputStream);

		problemSolver.solve(in, out);
		out.flush();
		assertEquals(outputTestStream.toString(), actualOutputStream.toString());
		closeStreams();
	}
	
	private void setStreams() {
		outputTestStream = new ByteArrayOutputStream();
		actualOutputStream = new ByteArrayOutputStream();
		try {
			inputTestStream = testClass.getResourceAsStream(inputFilePath);
			Utils.copyStreams(testClass.getResourceAsStream(outputFilePath), outputTestStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void closeStreams() {
		try {
			inputTestStream.close();
			outputTestStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
