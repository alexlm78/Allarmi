package com.alexlm78.allarmi.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMS_MA extends DBConn {
    private static final Logger log = LoggerFactory.getLogger(SMS_MA.class);

    public SMS_MA() {
        log.info("MA SMS machine");
    }
}
