package com.ctrip.tour.optional;

/**
 * Created by zhang_jf on 2017/7/25.
 */

import java.util.*;
import java.util.stream.Collectors;

/**
 *  Stream是元素的集合，这点让Stream看起来用些类似Iterator；
    可以支持顺序和并行的对原Stream进行汇聚的操作；
 */
public class StreamPractise {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,null,34,54);
        Long filterCount = list.stream().filter(value -> value!=null).count();
        System.out.println(filterCount);

        List<Integer> tempList =
                list.stream().filter(t -> t!=null).map(t -> t+=2).collect(Collectors.toList());


        // 确认所有元素均满足某一条件
        boolean allFlag = tempList.stream().allMatch(t->t>0);
        // 确认其中一个满足某一条件
        boolean partFlag = tempList.stream().anyMatch(t->t>53);

        // 求和
        OptionalInt optionalInt = tempList.stream().mapToInt(t->t).reduce(Integer::sum);

        System.out.println("======================");
        // 生成 hashmap
        Person p1 = new Person(1,"h1");
        Person p2 = new Person(2,"h2");
        Person p3 = new Person(2,"h3");
        Person p4 = new Person(10,"h4");

        List<Person> personList = Arrays.asList(p1,p2,p3,p4);
        Map<Integer,Person> map = personList
                .stream()
                .collect(Collectors.toMap(
                        p -> p.age,
                        p -> p,
                        (name1,name2) -> name2
                ));
        System.out.println(map);

        System.out.println("====================");

        list.stream().filter(t->t!=null).sorted((s1,s2)->{
            return s1.compareTo(s2);
        }).forEach(System.out::println);


        System.out.println("=====================");
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age > o2.age)    return 1;
                if (o1.age < o2.age)    return -1;
                return 0;
            }
        };

        List<Person> sortedPersonList = personList
                .stream()
                .sorted(comparator)
                .collect(Collectors.toList());
        System.out.println(sortedPersonList);


        System.out.println("===================");
        System.out.println("选出年龄最小的一个人");

        personList.stream().sorted(comparator).limit(1).forEach(System.out::println);

        personList
                .stream()
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return 0;
                    }
                })
                .forEach(System.out::println);


        System.out.println("=======================");
        System.out.println("按照条件筛选");
        personList
                .stream()
                .filter(t->t.age>9)
                .filter(t->t.name.startsWith("h"))
                .forEach(System.out::println);


        System.out.println("=======================");
        System.out.println("hashmap");

        // 如何优雅的避免为空
        Map<Integer,Person> mm = personList
                .stream()
                .collect(
                        HashMap::new,
                        (m,v)->m.put(v.age,v),
                        HashMap::putAll
                );
        System.out.println(mm);

        System.out.println("=========================");
        personList.stream().forEach(System.out::println);

        personList.stream().map(t->{
            t.age = 10;
            t.setName("");
            return t;
        }).collect(Collectors.toList());


        List<Integer> changeList = new ArrayList<>();
        change(list, changeList);
        System.out.println(changeList);
        System.out.println(list);
        changeValue(changeList);
        System.out.println(changeList);
    }

    public static void change(List<Integer> list, List<Integer> changeList){
        changeList = list.stream().filter(t->t!=null).map(t->t+=2).collect(Collectors.toList());
    }

    public static void changeValue(List<Integer> changeList){
        List<Integer> v = Arrays.asList(1,2,4,7);
        changeList = v;
    }

}

class Person{
    public int age;
    public String name;
    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return age+":"+name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
