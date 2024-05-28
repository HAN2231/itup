package com.example.itup;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data // Default 생성자, getters & setters, hascode(), equals(), toString()을 만듬.
public class Restaurant {
    //#Getter #Setter
//  private String name = "미소분식"; // 필드에서 private로 접근 제한자를 설정해서 이 외에서는 사용 못함
    private String name; // 없거나 public인 밖에서 가능
    //자바에서 필드 자원에 접근 할 때 method를 사용해서 하는 걸 추구 -> 큐를 이용하기 떄문에 선입선출

    private String address;
    private String phone;

    private Chef chef; // Chef - 타입

    // private로 생성하면 getter setter 해줘야 함
    // BoilerPlate Code : 상용구 코드 -> lombok이 이를 해결
    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }*/
}
