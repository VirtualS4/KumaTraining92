package com.example.rona.kumatraining92.Kuma.RecyclerView;

public class Characters {
    private String name, role, age, time;
    private int pic;

    public Characters(String name, String role, String age, int pic, String time) {
        this.name = name;
        this.role = role;
        this.age = age;
        this.pic = pic;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
