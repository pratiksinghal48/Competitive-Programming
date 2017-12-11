package app;

import java.io.InputStream;
import java.io.OutputStream;

public class SolutionTemplate implements IProblemSolver{

	@Override
	public void solve(InputReader in, OutputWriter out) {
	}

    public static void main(String[] args){
        InputStream inputStream=System.in;
        OutputStream outputStream=System.out;
        InputReader in=new InputReader(inputStream);
        OutputWriter out=new OutputWriter(outputStream);
        IProblemSolver problemSolver=new SolutionTemplate();
        problemSolver.solve(in,out);
        out.flush();
        out.close();
    }
    
//    static class InputReader {
//    }
//
//    static class OutputWriter {
//    }

}

