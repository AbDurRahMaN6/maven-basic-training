package org.example;

import java.util.List;
import java.util.Arrays;
class Student{
    int id;
    String name;
    int age;
    List<String> subjects;
    public Student(){
        id=2;
        name="Mary";
        age=36;
        subjects=Arrays.asList("Math", "History", "Science");
    }
    public Student(int id,String name,int age,List<String> subjects){
        this.id=id;
        this.name=name;
        this.age=age;
        this.subjects=subjects;
    }
    public void setID(int id){
        this.id=id;
    }
    public int getID(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setSubjects(List<String> subjects){
        this.subjects=subjects;
    }
    public List<String> getSubjects(){
        return subjects;
    }
}

