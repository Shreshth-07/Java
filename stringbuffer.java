class stringbuffer{  
public static void main(String args[]){  
StringBuffer sb=new StringBuffer("Hello");  
//APPEND
sb.append(" Java");  
System.out.println(sb);
//INSERT AT INDEX 1
sb.insert(1," Java"); 
System.out.println(sb);
//REPLACE AT INDEX
sb.replace(1,3," Java");  
System.out.println(sb);
//DELETE CHAR BETWEEN INDEX
sb.delete(1,3);  
System.out.println(sb);
//REVERSE OF STRING
sb.reverse();  
System.out.println(sb);
}  
}