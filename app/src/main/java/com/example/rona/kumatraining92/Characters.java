package com.example.rona.kumatraining92;

public class Characters
{
    private String name, role,age,level;
    private int pic;

    public Characters(String name, String role, String age, int pic,String level){

        this.name = name;
        this.role = role;
        this.age = age;
        this.pic = pic;
        this.level = level;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
