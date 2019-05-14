package IO_Test;

import java.io.File;

public class RootTest {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for(File root:roots) {
			System.out.println(root.getAbsolutePath());
		}
		System.out.println(File.pathSeparator); //C:\;C:\Windows;
		System.out.println(File.separator);		//C:\
	}
}
