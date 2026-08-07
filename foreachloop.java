public class Foreachloop{
  public static void main(strinh[]args){
    int[][] arr = {{4,5,6,8},{3,2,1,8},{7,8,4,2}};
    for(int i=0; i<arr.length; i++){
      for(int ele:arr[i]){
        System.out.println(ele+ " ");
      }
      System.out.println();
    }
  }
}
