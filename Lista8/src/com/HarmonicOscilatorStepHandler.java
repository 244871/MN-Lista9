package com;

import java.util.ArrayList;
import java.util.List;

public class HarmonicOscilatorStepHandler implements IStepHandler {

    //Arraylisty do zapamiętania wartości pośrednich

    protected List<Double> tValues = new ArrayList();
    protected List<Double> xValues = new ArrayList();

    @Override
    public void init(double t0, double[] y0, double t) {
        //przechwytuje nam kolejne kroki całkowania
    }

    @Override
    public void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException {
        double t = interpolator.getCurrentTime();
        double [] x = interpolator.getInterpolatedState();
        tValues.add(t);
        xValues.add(x[0]);
    }
}
