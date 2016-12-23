/*12/23/16 1:48 PM*/
package com.spk.mybatis;


public class Student {
    private Integer id;
    private Integer age;
    private String name;
    private String birthday;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }



    public Student(Integer age, String name, String password, String birthday, String email) {
        this.age = age;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
        this.email = email;
    }

    private String password;
    private String email;

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                '}';
    }

    public Student() {
    }
}
