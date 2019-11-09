package cn.lzx.stack;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassNameLeetcode20_isValid
 * @Description  有效的括号
 * @Author lzx
 * @Date2019/11/9 22:40
 * @Version V1.0
 **/
public class Leetcode20_isValid {

    //利用map存储括号映射关系
    private HashMap<Character,Character> mappings;

    //初始化映射关系
    public Leetcode20_isValid(){
        mappings = new HashMap<Character,Character>();
        mappings.put(')','(');
        mappings.put(']','[');
        mappings.put('}','{');
    }

    //左入栈 右出栈
    public boolean isValid(String s) {
        Stack<Character> stack = new Stasck<Character>();
        for(int i = 0;i<s.length();i++){
            char cur = s.charAt(i);
            if(mappings.containsKey(cur)){
                //右
                char top = stack.isEmpty()? '#' : stack.pop();
                if(top != mappings.get(cur)){
                    return false;
                }
            }else{
                stack.push(cur);
            }
        }
        return stack.isEmpty();
    }


}
