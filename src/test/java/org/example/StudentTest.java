package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

class StudentTest {

    public static void main(String args[]){
        Student s1=new Student(1,"John",20, Arrays.asList("Maths","English","Science"));
        Student s2=new Student();
        System.out.println("ID :"+s1.id);
        System.out.println("Name :"+s1.name);
        System.out.println("Age :"+s1.age);
        System.out.println("Subjects :"+s1.subjects);
        System.out.println();
        System.out.println("ID :"+s2.getID());
        System.out.println("Name :"+s2.getName());
        System.out.println("Age :"+s2.getAge());
        System.out.println("Subjects :"+s2.getSubjects());
    }

    @Test
    public void testStudent(){
//        assertEquals(Student.getID(),);
    }


}

