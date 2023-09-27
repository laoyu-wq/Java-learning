package com.itheima.d2_regex;

public class RegexTest2 {
    public static void main(String[] args) {
        // 1、字符串（只能匹配单个字符）
        System.out.println("a".matches("[abc]"));
        System.out.println("e".matches("[abcd]"));

        System.out.println("d".matches("[^abc]"));
        System.out.println("a".matches("[^abc]"));


        System.out.println("b".matches("[a-zA-Z]"));
        System.out.println("2".matches("[a-zA-Z]"));

        System.out.println("k".matches("[a-z&&[^bc]]"));
        System.out.println("b".matches("[a-z&&[^bc]]"));
        System.out.println("ab".matches("[a-zA-Z0-9]")); // 以上带[内容]的规则都只能用于匹配单个字符

        System.out.println("------------------------------");

        // 2、预定义字符（只能匹配单个字符）
        System.out.println("徐".matches("."));//匹配任意字符
        System.out.println("徐徐".matches("."));//false

        System.out.println("1".matches("\\d"));
        System.out.println("12".matches("\\d"));

        System.out.println(" ".matches("\\s"));// \s表示一个空字符
        System.out.println("a".matches("\s"));

        System.out.println("a".matches("\\S"));// \s表示一个非空字符
        System.out.println(" ".matches("\\S"));

        System.out.println("a".matches("\\w"));// \w [a-zA-Z_0-9]
        System.out.println("_".matches("\\w"));
        System.out.println("徐".matches("\\w"));

        System.out.println("徐".matches("\\W"));
        System.out.println("a".matches("\\W"));

        System.out.println("23232".matches("\\d"));

        // 3、数量词： ？ * + {n} {n,} {n,m}
        System.out.println("a".matches("\\w?")); // ? 代表0次或多次
        System.out.println("".matches("\\w?"));
        System.out.println("abc".matches("\\w?"));

        System.out.println("abc12".matches("\\w*")); // * 代表0次或多次
        System.out.println("".matches("\\w*"));
        System.out.println("abc12张".matches("\\w*"));

        System.out.println("abc12".matches("\\w+")); // + 代表1次或多次
        System.out.println("".matches("\\w+"));
        System.out.println("abc12张".matches("\\w+"));

        System.out.println("a3c".matches("\\w{3}")); //{3}代表要正好是n次
        System.out.println("abcd".matches("\\w{3}"));//false
        System.out.println("abcd".matches("\\w{3,}"));//{3，}表示大于3次
        System.out.println("ab".matches("\\w{3,}"));
        System.out.println("abcde徐".matches("\\w{3,}"));
        System.out.println("abc232d".matches("\\w{3,9}"));//{3，9}代表大于等于3，小于等于9

        // 4、其他几个常用的字符：（？i）忽略大小写、或：|、分组：（）
        System.out.println("--------------------------------------------");
        System.out.println("abc".matches("(?i)abc"));
        System.out.println("ABC".matches("(?i)abc"));
        System.out.println("aBc".matches("a((?i)b)c"));
        System.out.println("ABc".matches("a((?i)b)c"));

        // 需求1：要求要么是3个小写字母，要么是3个数字
        System.out.println("123".matches("\\d{3}|[a-z]{3}"));
        System.out.println("abc".matches("\\d{3}|[a-z]{3}"));
        System.out.println("aAc".matches("\\d{3}|[a-z]{3}"));

        // 需求2：必须是“我爱”开头，中间可以是至少一个“编程“，最后至少是1个“666”
        System.out.println("我爱编程编程666666".matches("我爱(编程)+(666)+"));
        System.out.println("我爱编程编程6666666".matches("我爱(编程)+(666)+"));

    }
}
