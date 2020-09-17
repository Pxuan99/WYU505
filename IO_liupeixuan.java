package day4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class IO_liupeixuan {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\917" + File.separator + "IO test.txt");
		file.createNewFile();
		Writer out = null;
		out = new FileWriter(file);
		out.write("IO test");
		out.close();
		String str = "\r\nand add somethings";
		out = new FileWriter(file, true);
		out.write(str);
		out.close();
		Reader reader = new FileReader(file);
		char[] read = new char[(int) file.length()];
		int len = reader.read(read);
		reader.close();
		System.out.println("文本内容为：" + new String(read, 0, len));
	}

}