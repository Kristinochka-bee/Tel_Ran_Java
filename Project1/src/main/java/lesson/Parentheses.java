package lesson;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        System.out.println(bracket("({[]})"));//true
        System.out.println(bracket("({[[{)"));//false
        System.out.println(bracket(""));//true
        System.out.println(bracket("("));//fasle
        System.out.println(bracket("(){}"));//true


    }

    //char[]symbols = toString().toCharArray();
    public static boolean bracket(String elements) {

        Stack<Character> stack = new Stack<>();
        for (char c : elements.toCharArray()) { //добавляем в массив элементы из нашей строки разбив ее на чары и берем их по очереди из массива
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);

            if(c == ')' && stack.empty() || c == '}' && stack.empty() || c == ']' && stack.empty())
                return false;  //проверяем , если стек пустой и чар равен закрывающ-ся скобке,тогда возращаем fasle

            else if (c == ')' && stack.peek() == '(' //иначе, если чар равен закрывающ-ся скобке и стек проверяет на наличие открыв-ся скобки.
                    || c == '}' && stack.peek() == '{'
                    || c == ']' && stack.peek() == '[') {//stack.peek проверка без удаления
                stack.pop(); //если проверка нашла совпадающ-ся пару, тогда достаем эту пару из стека
            }
        }

        return stack.isEmpty();   //если стек пустой , тогда true ; все скобки синхронизированы
    }
}
