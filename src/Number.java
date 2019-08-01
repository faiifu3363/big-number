public class Number {
    public void addNumber(String num1,String num2){
//        int result = num1+num2;
        int[] array1 = new int[num1.length()];
        int[] array2 = new int[num2.length()];

        int[] arrayResult = new int[num1.length()+num2.length()];


        for (int i = 0; i < num1.length(); i++) {
             char ch1 = num1.charAt(i);
             char ch2 = num2.charAt(i);
             array1[i] = Integer.parseInt(String.valueOf(ch1));
             array2[i] = Integer.parseInt(String.valueOf(ch2));

        }

        if(array1.length >= array2.length){
            for (int i = 0; i < array1.length; i++) {
                  int x = array1[i]+array2[i];
                  if(x>=10){
                      x = x - 10;
                  }
                  else if(x==10){
                      x=1;
                  }
                  arrayResult[i] = x;
            }

        }

        System.out.println(arrayResult[0]);
        System.out.println(arrayResult[1]);



//        return result;

    }
}
