package designpatterns.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


// concrete class that implement the Strategy interface
public class RarCompressionStrategy implements CompressionStrategy {

	@Override
	public void compressFiles(List<File> files) {
		// using RAR approach
		System.out.println("Rar compression");
	}
}