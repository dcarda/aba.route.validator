/*---------------------------------------------------------------------------------------
 * Class:  net.danielcarda.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2026/11/07
 * ---------------------------------------------------------------------------------------
 * Copyright (c) 2026 Daniel Carda
 *
 * SPDX-License-Identifier: Apache-2.0
 * ---------------------------------------------------------------------------------------
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ---------------------------------------------------------------------------------------
 */
package net.danielcarda.utils.validators.abaroutevalidator;

/**
 * <b>Description:</b><br>
 *     This enumeration defines the error codes and associated message
 *     identifiers used by the ABA Routing Transit Number validator.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2015/12/22  Daniel Carda              Initial Module Creation...
    2020/12/20  Daniel Carda              Updated formatting.
    2021/08/01  Daniel Carda              Improved Class Javadocs
    2026/08/01  Daniel Carda              Improved Mnemonic Text.  New Class Header.
</pre>
 * <hr>
 */
public enum ErrorCodes {

    /** Error code indicating ABA number is null. */
    ABA_1000(-1000,
            "com.cardatechnologies.aba.number.null"),

    /** Error code indicating ABA number is blank. */
    ABA_1001(-1001,
            "net.danielcarda.aba.number.blank"),

    /** Error code indicating ABA number is too short. */
    ABA_1002(-1002,
            "net.danielcarda.aba.number.length.too.short"),

    /** Error code indicating ABA number is too long. */
    ABA_1003(-1003,
            "net.danielcarda.aba.number.length.too.long"),

    /** Error code indicating ABA number contains non-ASCII digits. */
    ABA_1004(-1004,
            "net.danielcarda.aba.number.contains.non.ascii.digits"),

    /** Error code indicating an invalid Federal Reserve prefix. */
    ABA_1005(-1005,
            "net.danielcarda.aba.number.invalid.federal.reserve.prefix");

    private final int    errorCode;
    private final String errorMnemonic;

    /**
     * Constructs ...
     *
     * @param errorCode
     *        Integer value for the error code
     * @param errorMnemonic
     *        Text mnemonic describing the error code.
     */
    ErrorCodes( int    errorCode,
                String errorMnemonic ) {
        this.errorCode     = errorCode;
        this.errorMnemonic = errorMnemonic;
    }

    /**
     * Method: getErrorCode
     * <p>
     * <b>Description:</b><br>
     * This will return the integer for the error code.
     *
     * @return int
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Method: getErrorMnemonic
     * <p>
     * <b>Description:</b><br>
     * This will return the text of the error code.
     *
     * @return String
     */
    public String getErrorMnemonic() {
        return errorMnemonic;
    }

    /**
     * Method: fromErrorCode
     *
     * <p>
     * <b>Description:</b><br>
     * Returns the ErrorCodes enumeration associated with the
     * specified numeric error code.
     *
     * @param errorCode
     *        The numeric error code to locate.
     *
     * @return The corresponding ErrorCodes enumeration.
     *
     * @throws IllegalArgumentException
     *         If the specified error code does not exist.
     */
    public static ErrorCodes fromErrorCode(final int errorCode) {

        for (final ErrorCodes error : values()) {
            if (error.getErrorCode() == errorCode) {
                return error;
            }
        }

        throw new IllegalArgumentException(
                "Unknown ABA routing validation error code: " + errorCode);
    }
}

/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2026/11/07
 * --------------------------------------------------------------------------------------- */
