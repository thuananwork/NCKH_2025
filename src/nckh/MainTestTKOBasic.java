package nckh;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;



/**
 * Class to test the TKO-Basic algorithm
 * @author Philippe Fournier-Viger, 2018
 */
public class MainTestTKOBasic {

	public static void main(String [] arg) throws IOException{

		// input file path
		String input = fileToPath("dataset_foodmart.txt");
		
		// output file path
		String output = "output.txt";
		
		// the parameter k
		int k = 600;
                int length_max  = 20;
                int length_min = 15;
		
		// Applying the algorithm
		AlgoTKO_Basic algorithm = new AlgoTKO_Basic();
		algorithm.runAlgorithm(input, output, k,length_max,length_min);
		algorithm.writeResultTofile(output);
		
		// Print statistics about the algorithm execution
		algorithm.printStats();
	}

	public static String fileToPath(String filename) throws UnsupportedEncodingException{
		URL url = MainTestTKOBasic.class.getResource(filename);
		 return java.net.URLDecoder.decode(url.getPath(),"UTF-8");
	}
}
