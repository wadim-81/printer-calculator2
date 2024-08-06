package historyOfAllOperation;

import operator.Operator;

import java.time.LocalDateTime;



    public class OperationHistoryEntry {

        private Operator operator;
        private double operand1;
        private double operand2;
        private double result;
        private LocalDateTime timestamp;

        public OperationHistoryEntry(Operator operator, double operand1, double operand2, double result) {
            this.operator = operator;
            this.operand1 = operand1;
            this.operand2 = operand2;
            this.result = result;
            this.timestamp = LocalDateTime.now();
        }
        public Operator getOperator() {
            return operator;
        }

        public double getOperand1() {
            return operand1;
        }

        public double getOperand2() {
            return operand2;
        }

        public double getResult() {
            return result;
        }

        public LocalDateTime getTimestamp() {
            return timestamp;

        }
        @Override
        public String toString() {
            return "OperationHistoryEntry{" +
                    "operator=" + operator +
                    ", operand1=" + operand1 +
                    ", operand2=" + operand2 +
                    ", result=" + result +
                    ", timestamp=" + timestamp +
                    '}';
    }
}