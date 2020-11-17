int[] result = new int[list.length]; //array 

ArrayList<String> cars = new ArrayList<String>(); //arraylist

ArrayList<Integer> myNumbers = new ArrayList<Integer>(); 


// override is use the parent method in child, change inside the method 
// overload is to change the arguments in the method with the same method name

///////////////////////////////////////////////////////////////
//反转并返回字符串
StringBuilder str = new StringBuilder(); 
while(!stack.isEmpty()){
    str.append(stack.pop());
}
return str.reverse().toString(); 

char[] s = num.toCharArray(); //这里是把 num 放进 char 数组 s
Stack<Character> stack = new Stack<>();

char[] 是 mutable array，长度不能变
String 是基础 string，immutable
StringBuilder 是 mutable string，长度可以便
StringBuffer 也是 mutable string，长度可以变，比 StringBuilder 慢，但是 thread-safe
///////////////////////////////////////////////////////////////