/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.java
 * Date:   2015/04/15
 * ---------------------------------------------------------------------------------------
 * Copyright:  Daniel Carda
 *             All Rights Reserved
 * ---------------------------------------------------------------------------------------
 *
 *  License: MIT license
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANT ABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.cardatechnologies.utils.validators.abaroutevalidator.exceptions;

import com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes;

import java.io.Serial;
import java.util.Objects;

/**
 * <b>Description:</b><br>
 *     This exception represents an error encountered while validating
 *     an ABA Routing Transit Number.
 *
 * @author Daniel Carda
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
 * Date:   2015/04/15
 * --------------------------------------------------------------------------------------- */
