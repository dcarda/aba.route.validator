/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2020/12/22
 * ---------------------------------------------------------------------------------------
 *
 * Copyright, (c) 2020 - Carda Technologies, LLC
 * All rights reserved.
 */

package com.cardatechnologies.utils.validators.abaroutevalidator;

public enum ErrorCodes {


    ABA_1000(-1000, "com.cardatechnologies.aba.number.null"),
    ABA_1001(-1001, "com.cardatechnologies.aba.number.blank"),
    ABA_1002(-1002, "com.cardatechnologies.aba.number.too.short"),
    ABA_1003(-1003, "com.cardatechnologies.aba.number.too.long"),
    ABA_1004(-1004, "com.cardatechnologies.aba.number.not.numeric"),
    ABA_1005(-1005, "com.cardatechnologies.aba.number.failed.federalcheck");

    private final int    errorCode;
    private final String errorMnemonic;

    /**
     * Constructs ...
     *
     * @param errorCode
     * @param errorMnemonic
     */
    ErrorCodes( int    errorCode,
                String errorMnemonic ) {
        this.errorCode     = errorCode;
        this.errorMnemonic = errorMnemonic;
    }

    /**
     * Method: getErrorCode
     *
     * @return int
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Method: getErrorMnemonic
     *
     * @return String
     */
    public String getErrorMnemonic() {
        return errorMnemonic;
    }
}

/* ---------------------------------------------------------------------------------------
 * Copyright, (c) 2009 - Carda Technologies, LLC
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2020/12/22
 * --------------------------------------------------------------------------------------- */
