package com.mowithmosh.template;

public abstract class Task {
    private AuditTrail auditTrail;

    protected Task() {
        System.out.println("From task");
        auditTrail = new AuditTrail();
    }

    protected Task(AuditTrail auditTrail) {
        System.out.println("from task with parameter");
        this.auditTrail = auditTrail;
    }

    public void execute() {
        System.out.println("Shared Content");
        auditTrail.record();

        doExecute();
    }
    protected abstract void doExecute();
}
