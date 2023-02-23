public class NoBoring {
    public static int noBoringZeros(int n) {
        String word = String.valueOf(n);
        char[] arr = word.toCharArray();
        int count = 0;
      
        for(int i = word.length() - 1; i > 0; i--){
          if( String.valueOf(arr[i]).equals("0") ){
            count++;
          } else {
            break;
          }
        }
      double tens = Math.pow((double)10, (double)count);
      System.out.println(count);
      return n/(int)tens;
      }
}
