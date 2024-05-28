package com.example.itup;

import lombok.Data;

@Data
public class Chef {
    // java는 class 생성 시 필드의 값 들을 알아서 초기화 해줌. int - 0, string - null, bool - false
    private String name;
    private int age;

    public Ingredient prepare(){
        System.out.println("재료 손질을 합니다.");
        return new Ingredient();
    }

    public Food cook(){
        System.out.println("요리를 합니다.");
        return new Food();
    }


}
