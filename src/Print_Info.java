import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Print_Info {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("Git_info.txt");
		FileWriter wr = new FileWriter(file);
		wr.write("Working with Git");
		System.out.println("This is vaseem and Prashant uploading to Git ");

	}

}
