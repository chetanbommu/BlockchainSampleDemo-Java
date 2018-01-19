package com.chetan.blockchain;

import java.util.List;

public class Block {
    /**
     * Block contains hashcode of previous block and transactions
     */
    private int previousHashcode;
    private List<Transaction> transactions;

    public int getPreviousHashcode() {
        return previousHashcode;
    }

    public void setPreviousHashcode(int previousHashcode) {
        this.previousHashcode = previousHashcode;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Block(int previousHashcode, List<Transaction> transactions) {
        this.previousHashcode = previousHashcode;
        this.transactions = transactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Block block = (Block) o;

        if (previousHashcode != block.previousHashcode) return false;
        return transactions != null ? transactions.equals(block.transactions) : block.transactions == null;
    }

    @Override
    public int hashCode() {
        int result = previousHashcode;
        result = 31 * result + (transactions != null ? transactions.hashCode() : 0);
        return result;
    }

}
