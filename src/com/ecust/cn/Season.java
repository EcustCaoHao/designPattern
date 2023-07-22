package com.ecust.cn;

/**
 * 枚举是实现单例的最好方式
 */
public enum Season {

    SPRING("春天","四季盎然");

    private String season;
    private String description;

   Season(String season, String description) {

    }
}
