package com.mowithmosh.template;

public class TransferMoneyTask extends Task{

    public TransferMoneyTask() {
        super();
    }
    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    @Override
    public void doExecute() {
        System.out.println("Transfer Money");
    }
}
