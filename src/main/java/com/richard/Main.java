package com.richard;

import org.kohsuke.args4j.CmdLineParser;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.Option;

public class Main {

    @Option(name = "-name", usage = "Sets a name")
    public String name;
    @Option(name = "-age", usage = "Sets an age")
    public String age;

    public static void main(String[] args) {
        new Main().doMain(args);
    }

    private void doMain(String[] args) {
        CmdLineParser parser = new CmdLineParser(this);

        try {
            parser.parseArgument(args);
            this.run();
        } catch (CmdLineException e) {
            // handling of wrong arguments
            System.err.println(e.getMessage());
            parser.printUsage(System.err);
        }
    }

    private void run() {

        System.out.println("- name: " + name);
        System.out.println("- age: " + age);

        if (name.equalsIgnoreCase("richard")) {
            System.out.println("Hello Richard!");
        } else if (name.equalsIgnoreCase("anne")) {
            System.out.println("Hello Anne");
        }
    }
}