package cn.jackiegu.design.pattern.study.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 * 原型模式 - 班级类
 *
 * @author JackieGu
 * @date 2020/12/11
 */
public class Clazz implements Cloneable, Serializable {

    private static final long serialVersionUID = -8049504548765288240L;

    private String name;

    private List<Student> students;

    public Clazz() {
    }

    public Clazz(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * 克隆
     *
     * @return 克隆对象
     */
    @Override
    public Clazz clone() {
        Clazz clone = null;
        try {
            clone = (Clazz) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    /**
     * 深度克隆
     *
     * @return 克隆对象
     */
    public Clazz deepClone() {
        Clazz clone = null;
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            clone = (Clazz) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Class{" +
            "name='" + name + '\'' +
            ", students=" + students +
            '}';
    }
}
