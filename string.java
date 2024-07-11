class string{
public static void main(String arg[]){
int wl=0; 
String s1="hello world"; 
String w[]=s1.split(" "); 
if(w.length>0){ 
    wl=w[w.length-1].length(); 
} 
else{ 
wl=0; 
} 
System.out.println("length is: "+ wl);
}
}