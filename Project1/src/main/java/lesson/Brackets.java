package lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

//Task: Есть текст в нём расставлены скобки. Проверить все ли скобки закрываются в правильном порядке.
//Пример     () [] {}     ({}[])      ({[]})    (Рекомендую использовать для решения Stack)  Не забудьте написать в первую очередь тесты. Минимум 5
public  class Brackets {
    public static void main(String[] args) {

        System.out.println(bracket("({[]})"));//true
        System.out.println(bracket("({[[{)"));//false
        System.out.println(bracket(""));// true
        System.out.println(bracket("("));// fasle
        System.out.println(bracket("({})")); // true
        System.out.println(bracket("((")); // false

    }

    public static boolean bracket (String line) {

        char[] lineCh = line.toCharArray();  //создаем массив чаров
        boolean flag = true;
        List<Character> allBrackets = new ArrayList<>();        //<> внутри  указываем тип элементов кот. мы будем укладывать в наш аррей. Creating List


        for (int i = 0; i < lineCh.length; i++) { //проходимся циклом по массиво чаров
            if (lineCh[i] == '['                //если какой-то из индексов чаров массива равен одной из данных открывающейся скобке
                    || lineCh[i] == '{'
                    || lineCh[i] == '('
                    || lineCh[i] == ']'
                    || lineCh[i] == '}'
                    || lineCh[i] == ')') ;

            allBrackets.add(lineCh[i]);       //тогда мы добавляем этот *идекс который равен этой скобке* в лист

        }
        System.out.println(allBrackets);  //печатаем в консоль наш лист с содержимыми скобками


        Stack<Character> stack = new Stack<>();   //создаем стэк

        if (allBrackets.size() % 2 != 0){   // если в листе не четное кол-во скобок , возвращаем fasle не верно
            return false;
        }
        for (int i = 0; i < allBrackets.size(); i++) {   //проходимся циклом по листу всех скобок
            if (allBrackets.get(i).equals('{')           //если в листе allBrackets содержится индекс со значением равный данной открывающ-ся скобке '{'
                    || allBrackets.get(i).equals('(')    //если в листе allBrackets содержится индекс со значением равный данной открывающ-ся скобке '('
                    || allBrackets.get(i).equals('['))   //если в листе allBrackets содержится индекс со значением равный данной открывающ-ся скобке '['

                stack.push(allBrackets.get(i)); //тогда добавляем в стек *индексы листа allBrackets кот. содержат данные значения(откры-ся скобки)

            // в switch проверяем на наличие закрывающ-ся скобки
            else  switch (allBrackets.get(i)){  //проходим циклом по всему листу allBrackets
                case '}' : if (stack.isEmpty() || stack.peek() != '{'){  //если верхняя не стоит такая же закрывающаяся скобка,тогда false; или если стек пустой , тогда мы не можем добавить в него закрывающ скобку
                    flag = false; //нет закрывающ скобки
                    break;
                } else  {
                    stack.pop();  //иначе, достаем правильно сложившиюся пару скобок из стека
                    break;
                }

                case ')' : if (stack.isEmpty() || stack.peek() !=  '('){ //проверка peek на наличие ответной скобки или если стек пустой , тогда мы не можем добавить в него закрывающ скобку
                    flag = false;      //если верхняя не стоит такая же закрывающаяся скобка,тогда false
                    break;
                }else {
                    stack.pop();    //иначе, достаем правильно сложившиюся пару скобок из стека
                    break;
                }
                case ']' : if (stack.isEmpty() || stack.peek() != '['){ // если стек пустой , тогда мы не можем добавить в него закрывающ скобку or если верхняя не стоит такая же закрывающаяся скобка,тогда false;
                    flag = false;
                    break;
                }else {
                    stack.pop(); //иначе, если верхн-я скобка стоит такая же закрывающ-я такую же ниже ее, тогда достаем эту пару из стека и выходим из switch
                    break;
                }
            }

        }
/*
        if (!stack.isEmpty()){  //если стек оказался не пустой, тогда это значит , что в стеке есть несихронизированная скобка
            flag= false;
        }

 */

        return flag;
    }
}
