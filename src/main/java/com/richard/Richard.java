package com.richard;

import org.kohsuke.args4j.Option;

public class Richard {

    @Option(name = "-name", usage = "Sets a name")
    public String name;
    @Option(name = "-age", usage = "Sets an age")
    public String age;

    public void run() {

        System.out.println("- name: " + name);
        System.out.println("- age: " + age);

        if (name.equalsIgnoreCase("richard")) {
            System.out.println("Hello Richard!");
        } else if (name.equalsIgnoreCase("anne")) {
            System.out.println("Hello Anne");
        }
    }

}
