package com.richard;

import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.CmdLineException;

public class Test {

    public static void main(String[] args) {
        new Test().doMain(args);
    }

    private void doMain(String[] args) {
        Richard richard = new Richard();

        CmdLineParser parser = new CmdLineParser(richard);

        try {
            parser.parseArgument(args);
            richard.run();
        } catch (CmdLineException e) {
            // handling of wrong arguments
            System.err.println(e.getMessage());
            parser.printUsage(System.err);
        }
    }

}