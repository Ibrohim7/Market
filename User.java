package com.SetApp;
//TODO Inheritance

import com.SetApp.base.Base;

public class User extends Base {
    Inner inner = new Inner();

    class Inner{
        private int age;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

}
