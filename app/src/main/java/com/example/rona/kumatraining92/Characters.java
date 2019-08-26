package com.example.rona.kumatraining92;

public class Characters
{
    private String name,role,age;
    private int pic;

    public Characters(String name, String role, String age, int pic){
        this.name = name;
        this.role = role;
        this.age = age;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
