import java.util.*;
public class Main{
    public void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextLine();
        char[] a=n.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>'4'){
                a[i]=(char)('9'-a[i]+'0');
            }
            if(a[0]=='0'){
                a[0]='9';
            }
        }
        System.out.println(a);
    }
}