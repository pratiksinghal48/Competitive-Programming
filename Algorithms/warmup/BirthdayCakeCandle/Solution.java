package warmup.BirthdayCakeCandle;

import java.io.InputStream;
import java.io.OutputStream;

import app.IProblemSolver;
import app.InputReader;
import app.OutputWriter;

// https://www.hackerrank.com/challenges/birthday-cake-candles/problem
public class Solution implements IProblemSolver {
	
	@Override
	public void solve(InputReader in, OutputWriter out) {
		int n = in.nextInt();
		int[] ar = in.nextIntArray(n);
		int max = 0, count = 0;
		for(int i = 0; i < n; i++) {
			if(max < ar[i]) {
				max = ar[i];
				count = 1;
			} else if(max == ar[i]) {
				count++;
			}
		}
		out.print(count);
	}

	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
		OutputWriter out = new OutputWriter(outputStream);
		IProblemSolver problemSolver = new Solution();
		problemSolver.solve(in, out);
		out.flush();
		out.close();
	}
}
