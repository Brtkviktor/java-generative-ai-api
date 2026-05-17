package br.com.budgeting.infrastructure.http.request;

import br.com.budgeting.application.input.PersistTransactionInput;
import br.com.budgeting.domain.Category;

public record TransactionRequest(String description, Category category, long amount) {
    public PersistTransactionInput toInput() {
        return new PersistTransactionInput(description, amount, category);
    }
}