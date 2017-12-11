package app;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Utils {
	
	public static final int BUFFER_SIZE = 4096;
	
	public static int copyStreams(InputStream in, OutputStream out) throws IOException {
		if(in == null) {
			throw new IllegalArgumentException("No InputStream specified");
		}
		if(out == null) {
			throw new IllegalArgumentException("No OutputStream specified");
		}

		int byteCount = 0;
		byte[] buffer = new byte[BUFFER_SIZE];
		int bytesRead = -1;
		while ((bytesRead = in.read(buffer)) != -1) {
			out.write(buffer, 0, bytesRead);
			byteCount += bytesRead;
		}
		out.flush();
		return byteCount;
	}
	
}
