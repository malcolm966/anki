
// // class  myclass{
// //     String Howdy = "Hello There!";
// //     static  MyOtherClass otherClass;
// //     MyClass {
// //         otherClass = new MyOtherClass();
// //     }
// //     public static void main(String[] args) {
// //         System.out.println(otherClass.GoodeBye);
// //     }
// // }
// // class  MyOtherClass{
// //     static  public  String GoodeBye = "So Long";
// //     MyOtherClass(){}
// // }


// import  java.util.*;
// public class MyClass{
//     public static void main(String[] args) {
//         List<String> list = Arrays.asList("dog", "over","good");
//         // list.stream().reduce((x1,x2) -> x1.length() == 3?x1:x2)
//         // .ifPresent(System.out::println);
//         System.out.println(list.stream()
//     .reduce(new Character('c'), (s1,s2) -> s1 + s2.charAt(0), (c1,c2) -> c1 += c2));
//     }
// }

// // 非公开类的类名可以和文件名不一致
// //-XX:+DisableExplicitGC 关闭显式gc
// // reduce 的用法-->Optional<T> reduce(BinaryOperator<T> accumulator)
// //T reduce(T identity, BinaryOperator<T> accumulator)
// //<U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
// //compiler allows downcasting
// //转型 cast 的的规则相关
// //java.util.Optional 
// //Executor, CompletableFuture 新建runnable , callable 相关
// //设计一个从数据库获取员工信息,保存数据到excel, 并下载的.--SRP
// //Java 的类方法是绑定在声明类型上还是实际类型上? 
// // Java 的Spliterator
// Java Inner Class 和 nested class 的 区别
//--Java 函数式编程, 柯里化的实现