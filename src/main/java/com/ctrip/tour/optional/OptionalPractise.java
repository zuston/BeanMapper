package com.ctrip.tour.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Created by zhang_jf on 2017/7/25.
 */
public class OptionalPractise {

    public static void main(String[] args) {
        User u = new User();
        u.age = 20;
        u.name = "zuston";
        Integer value1 = 10;
        Optional<Integer> a = Optional.ofNullable(value1);

        Integer value2 = null;
        Optional<Integer> aa = Optional.ofNullable(value2);

        System.out.println(a.orElse(20));
        System.out.println(aa.orElse(3));


        Optional<User> user = Optional.ofNullable(u);
        user.orElse(getDefaultUser());

        String value = user.map(p->p.getName()).map(v->v.toString()).orElse("ppp");

        User temp = null;
        Optional<User> tUser = Optional.ofNullable(temp);
        String tName = tUser.map(t->t.getName()).orElseGet(()->getName());
        System.out.println("tName : "+tName);
    }

    public static User getDefaultUser() {
        User user = new User();
        user.age = 200;
        user.name = "shacha";
        return user;
    }

    public static String getName() {
        return "pppppp";
    }
}

class User{
    public int age;
    public String name;

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
