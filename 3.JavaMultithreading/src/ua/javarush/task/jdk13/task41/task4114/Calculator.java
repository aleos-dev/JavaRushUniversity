package ua.javarush.task.jdk13.task41.task4114;

import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operationMap;

    private final Processor processor;


    public Calculator() {
        this.processor = new Processor();
        this.operationMap = Map.of(
                "+", processor::plus,
                "-", processor::minus,
                "*", processor::multiply,
                "/", processor::divide);
    }

    public void calculate(int operand1, String operationSign, int operand2) {
        Operation operation = operationMap.get(operationSign);
        if (operation == null) {
            throw new IllegalStateException("no operation registered for '" + operationSign + "'");
        }
        operation.execute(operand1, operand2);
    }

}
