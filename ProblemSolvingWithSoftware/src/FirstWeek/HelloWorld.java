package FirstWeek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelloWorld {
	public void runHello() throws Exception {
		try {
			File file = new File("hello_unicode.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		}
	}
}
