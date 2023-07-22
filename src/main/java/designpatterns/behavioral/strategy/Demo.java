package designpatterns.behavioral.strategy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {

		CompressionContext ctx = new CompressionContext();
		// set the strategy of compression to use
		ctx.setCompressionStrategy(new ZipCompressionStrategy());

		// get a list of files...
		List<File> fileList = new ArrayList<>();
		ctx.createArchive(fileList);

		// can pass directly lambda expression as the CompressionStrategy
		ctx.createArchive(fileList, file -> System.out.println("Any compression strategy here"));
		//can pass directly "method reference" that implement same
		// signature (List<File> files) , this is functional interface use.
		ctx.createArchive(fileList, Demo::customCompressStrategy);
		
		// Comparator is also strategy pattern.
		fileList.sort( (file1, file2) -> file1.getName().compareTo(file2.getName()));

	}
	
	public static void customCompressStrategy(List<File> files) {
		System.out.println("Custom compression strategy");
	}

}
