package com;

public interface IFirstOrderDifferentialEquasions {
    int getDimension();

    void computeDerivatives(double t, double[] x, double[] dxdt);
}




