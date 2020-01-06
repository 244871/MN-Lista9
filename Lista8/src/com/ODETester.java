package com;

import java.util.Arrays;

public class ODETester {
    public static void main(String[] args) {

        HarmonicOscilator oscillator = new HarmonicOscilator(1.0);
        //musimy wybrać metodę rozwiązywania rówania różniczkowego
        FirstOrderIntegrator eulerIntegrator = new EulerIntegrator(0.001); //parametrem jest krok całkowania
        double[] xStart = {1,0};
        double[] xStop = {0.,0.}; //tutaj jest rozwiązanie naszego równania

        HarmonicOscillatorStepHandler harmonicOscillatorStepHandler = new HarmonicOscillatorStepHandler();
        eulerIntegrator.addStepHandler(harmonicOscillatorStepHandler);

        eulerIntegrator.integrate(oscillator, 0, xStart, 2*Math.PI, xStop);

        System.out.println(Arrays.toString(xStart));
        System.out.println(Arrays.toString(xStop));

        System.out.println(harmonicOscillatorStepHandler.xValues);
    }
}
