package com.project.santandercotacoes.exceptions;

import com.project.santandercotacoes.util.MessageUtils;

public class NotFoundException extends RuntimeException {
    public NotFoundException() {
        super(MessageUtils.NO_RECORDS_FOUND);
    }
}
