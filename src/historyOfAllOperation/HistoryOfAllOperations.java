package historyOfAllOperation;

import operator.Operator;

import java.util.List;
import java.util.ArrayList;

public class HistoryOfAllOperations  {

    private List<OperationHistoryEntry> transactions;

    public HistoryOfAllOperations() {
        this.transactions = new ArrayList<>();
    }
    public void addOperation(OperationHistoryEntry entry) {

        transactions.add(entry);
    }

    public List<OperationHistoryEntry> getTransactions() {
        return transactions;
    }
}

