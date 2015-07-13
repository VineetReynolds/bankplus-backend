package org.jboss.examples.bankplus.services;

import javax.ejb.ApplicationException;

@ApplicationException(rollback = true)
public class DepositException extends BusinessException {

    public DepositException() {
    }

    public DepositException(String message) {
        super(message);
    }

    public DepositException(String message, Throwable cause) {
        super(message, cause);
    }

    public DepositException(Throwable cause) {
        super(cause);
    }
}
