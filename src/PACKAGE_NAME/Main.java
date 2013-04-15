package PACKAGE_NAME;

import org.apache.commons.cli.Options;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.HelpFormatter;

public class Main {

    public static void main(String[] args) {

		Options options = new Options();
		options.addOption("h", false, "usage for application");

		CommandLineParser parser = new BasicParser();
		try {
			CommandLine cmd = parser.parse(options, args);
			
			if (cmd.hasOption("h")) {
			    HelpFormatter help = new HelpFormatter();
			    help.printHelp("PROJECT_NAME", options );
			}
		}
		catch (ParseException e) {

		    System.err.println(e);
		    System.out.println();
		    HelpFormatter formatter = new HelpFormatter();
		    formatter.printHelp("PROJECT_NAME", options );
		}
    }
}