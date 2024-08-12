package historyOfAllOperation;

import operator.Operator;

import java.time.LocalDateTime;



    public class OperationHistoryEntry {

        private Operator operator;
        private double FirstOperand;
        private double SecondOperand;
        private double result;
        private LocalDateTime timestamp;

        public OperationHistoryEntry(Operator operator, double operand1, double operand2, double result) {
            this.operator = operator;
            this.FirstOperand = FirstOperand;
            this.SecondOperand = SecondOperand;
            this.result = result;
            this.timestamp = LocalDateTime.now();
        }
        public Operator getOperator() {
            return operator;
        }

        public double getOperand1() {
            return FirstOperand;
        }

        public double getOperand2() {
            return SecondOperand;
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
                    ", operand1=" + FirstOperand +
                    ", operand2=" + SecondOperand +
                    ", result=" + result +
                    ", timestamp=" + timestamp +
                    '}';
    }
}