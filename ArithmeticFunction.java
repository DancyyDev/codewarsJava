class ArithmeticFunction {
    public static int arithmetic(int a, int b, String op) {
      // your code here
      int add = a + b;
      int subtract = a - b;
      int multiply = a * b;
      int divide = a / b;
      
      if(op.equals("add")) return add;
      if(op.equals("subtract")) return subtract;
      if(op.equals("multiply")) return multiply;
      return divide;
      
    }
  }