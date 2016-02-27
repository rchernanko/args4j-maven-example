package com.richard;

import org.kohsuke.args4j.Option;

public class Richard {

    @Option(name = "-name", usage = "Sets a name")
    public String name;
    @Option(name = "-age", usage = "Sets an age")
    public String age;

    public void run() {

        System.out.println("Business-Logic");
        System.out.println("- name: " + name);
        System.out.println("- age: " + age);

        if (name.equals("richard")) {
            System.out.println("RICHARD IS THE KING!");
        } else if (name.equals("anne")) {
            System.out.println("ANNE IS THE QUEEN");
        }
    }

}
