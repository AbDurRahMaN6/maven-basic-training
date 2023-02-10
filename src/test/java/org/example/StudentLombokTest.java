package org.example;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StudentLombokTest {
    public static void main(String[] args) {
        StudentLombok lombokModel = new StudentLombok(1, "John", 30, Arrays.asList("Maths","English","Science"));

        System.out.println(lombokModel.toString());

        StudentLombok lombokMdl = new StudentLombok();

        // test getter and setter methods
        lombokMdl.setId(1);
        lombokMdl.setName("John");
        lombokMdl.setAge(30);
        lombokMdl.setSubjects(Arrays.asList("Maths","English","Science"));

        System.out.println(lombokMdl.getId());
        System.out.println(lombokMdl.getName());
        System.out.println(lombokMdl.getAge());
        System.out.println(lombokMdl.getSubjects());
    }


}


