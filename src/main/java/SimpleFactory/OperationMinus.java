package simplefactory;

/**
 * Created by hliang on 08/12/2016.
 */
/*
An instance of concrete product
 */
public class OperationMinus implements Operation {
    @Override
    public Double getResult(Double numberA, Double numberB) {
        return numberA - numberB;
    }
}
