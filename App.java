
package com.mycompany.app;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Student s1 = new Student("Roberta Clemente", 10, 3.75);
        Student s2 = new Student("Jimmy O. Yang", 12, 3.52);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("Same name? " + s1.hasSameName(s2));
        System.out.println("Higher gpa: " + Student.higherGpa(s1, s2));

        Gson gson = new Gson();
        System.out.println("Should print true without any errors: " + gson.htmlSafe());

    }
}

