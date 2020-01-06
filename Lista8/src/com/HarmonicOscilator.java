package com;

public class HarmonicOscilator implements IFirstOrderDifferentialEquasions {

    private double omega2 ;

    public HarmonicOscillator(double omega2) {
        this.omega2 = omega2;
    }

    @Override
    public int getDimension() {
        return 2; //mówi nam to którego rzędu jest to równanie
    }

    @Override  // tutaj mamy jak liczymy pochodne
    public void computeDerivatives(double t, double[] x, double[] dxdt) throws MaxCountExceededException, DimensionMismatchException {
        dxdt[0] = x[1];
        dxdt[1] = -omega2*x[0];
    }
}
