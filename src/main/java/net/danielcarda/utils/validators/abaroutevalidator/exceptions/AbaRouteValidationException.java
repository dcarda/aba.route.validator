/* ---------------------------------------------------------------------------------------
 * Class:  net.danielcarda.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.java
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
package net.danielcarda.utils.validators.abaroutevalidator.exceptions;

import net.danielcarda.utils.validators.abaroutevalidator.ErrorCodes;

import java.io.Serial;
import java.util.Objects;

/**
 * <b>Description:</b><br>
 *     This exception represents an error encountered while validating
 *     an ABA Routing Transit Number.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2026/09/17  Daniel Carda              Updated code.  New Class Header.
</pre>
 * <hr>
 */
public class AbaRouteValidationException extends Exception {

    @Serial
    private static final long serialVersionUID = -4672062603974602512L;

    /** The numeric code related to the error. */
    private final int errorCode;

    /**
     * Constructs an ABA routing validation exception.
     *
     * @param errorCode
     *        The enumeration identifying the validation error.
     */
    public AbaRouteValidationException(final ErrorCodes errorCode) {

        super(Objects.requireNonNull(errorCode,
                "errorCode cannot be null").getErrorMnemonic());

        this.errorCode = errorCode.getErrorCode();
    }

    /**
     * Constructs an ABA routing validation exception with an underlying cause.
     *
     * @param errorCode
     *        The enumeration identifying the validation error.
     * @param cause
     *        The underlying cause of the exception.
     */
    public AbaRouteValidationException(
            final ErrorCodes errorCode,
            final Throwable cause) {

        super(
                Objects.requireNonNull(errorCode,
                        "errorCode cannot be null").getErrorMnemonic(),
                cause
        );

        this.errorCode = errorCode.getErrorCode();
    }

    /**
     * Returns the numeric error code.
     *
     * @return The numeric error code.
     */
    public int getErrorCode() {
        return errorCode;
    }
}

/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.java
 * Date:   2026/11/07
 * --------------------------------------------------------------------------------------- */
