class compare{
public static void main(String arg[]){
int a[]=new int[]{1,2,3,4}; 
int b[]=new int[]{2,4,2,6,7}; 
int len=b.length; 
for(int i=0;i<len;i++) 
{ 
    for(int j=i+1;j<len;j++) 
    { 
        if(b[i]==b[j]) 
        { 
            for(int k=j;k<len-1;k++) 
            { 
                b[k]=b[k+1]; 
            } 
            j--; 
            len--; 
        } 
    } 
} 
for(int i=0;i<a.length;i++) 
{ 
    for(int j=0;j<len;j++) 
    { 
        if(a[i]==b[j]) { 
            System.out.println( a[i]); 
        } 
    } 
} 
}
}