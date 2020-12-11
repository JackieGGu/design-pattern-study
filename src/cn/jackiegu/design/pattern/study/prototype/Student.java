package cn.jackiegu.design.pattern.study.prototype;

import java.io.Serializable;

/**
 * 原型模式 - 学生类
 *
 * @author JackieGu
 * @date 2020/12/11
 */
public class Student implements Cloneable, Serializable {

    private static final long serialVersionUID = 4561259858314376969L;

    private String name;

    private Integer age;

    private String hex;

    public Student() {
    }

    public Student(String name, Integer age, String hex) {
        this.name = name;
        this.age = age;
        this.hex = hex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    @Override
    public Student clone() {
        Student clone = null;
        try {
            clone = (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", hex='" + hex + '\'' +
            '}';
    }
}
