// by recursion
public class reverse{
  public static void reverse(int n,int r){
    if(n==o){
      System.out.println(r);
      return;
    }
    reverse(n/10,r*10+n%10);
  }
  public static void main(string[]args){
    int n= 2456;
  }
}
