Public class Matrixinsnakepattern{
  public static void main(string[]args){
    int [][]arr={{6,4,1,5},{4,7,8,2},{3,5,2,5}};
    for(int i=0; i<arr.length;i++){
      if(i%2==0){
        for(int j=0; j<arr[0].length; j++){
          System.out.println(arr[i][j]+" ");
        }
      }
      else{
        for(int j=arr[0].length; j>=0; j--){
          System.out.println(arr[i][j]+" ");
        }
      }
      System.out.println();
    }
  }
