package PACKAGE_NAME;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.ParseException;

public class Main {

    public static void main(String[] args) {

		Options options = new Options();
		options.addOption("h", false, "usage for application");

		CommandLineParser parser = new BasicParser();
		try {
			CommandLine cmd = parser.parse(options, args);
		}
		catch (ParseException e) {

		}
	
    }
}