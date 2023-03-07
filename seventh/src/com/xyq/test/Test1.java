package com.xyq.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 敏感词
        List li = new ArrayList();
        li.add("武藤兰");
        li.add("波多野结衣");
        li.add("仓木麻衣");
        li.add("麻生希");

        // 让用户输入评论内容
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的评论内容：");
        String content = sc.nextLine();

        for (int i = 0; i < li.size(); i++) {
            String ci = (String) li.get(i); // 拿到敏感词
            if (content.contains(ci)) { // 判断是否包含敏感词

                // 拼接 *
                String s = "";
                for (int j = 0; j < ci.length(); j++) {
                    s += "*";
                }

                // 替换敏感词
                content = content.replace(ci, s);
            }
        }

        System.out.println(content);
    }
}