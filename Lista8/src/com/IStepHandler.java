package com;

public interface IStepHandler {
    void handleStep(StepInterpolator interpolator, boolean isLast) throws MaxCountExceededException;//co robimy z wartością wygenerowaną

}
