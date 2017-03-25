package com.gmail.italkingtan.structure.adapter;

/**
 * <pre>
 *     场景：
 *     1，开发了新接口ScoreOperation
 *     2，需要复用旧算法，但是没有源码，只有API
 *     3，用适配器，给适配者做适配
 * </pre>
 * Created by tantan on 2017/1/23.
 */
public class Client {
    public static void main(String[] args) {
        int[] array = {60, 98, 78, 82, 46, 54, 80, 81, 79, 52};

        ScoreOperation scoreOperation = new Adapter();
        scoreOperation.sort(array);
        System.out.println("==排序之后==");
        for (int i : array) {
            System.out.print(i + ",");
        }

        int score = scoreOperation.search(array, 79);
        System.out.println(score);
        if (score == -1) {
            System.out.println("没有找到分数");
        } else {
            System.out.println("找到分数:" + 79);
        }


    }
}
