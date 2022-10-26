package edu.miu.cs.cs425.lab14unittest.flattenarray.q1;


public class MyMath {
    ICalculator calc;

    public MyMath(ICalculator calc) {
        this.calc = calc;
    }

    public double doComplexCalculation(int x, int y){
        int k= calc.add(x,y);
        int l= calc.multiply(x,y);
        return l;
    }
}
