/*---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2020/12/22
 * ---------------------------------------------------------------------------------------
 * Copyright:  Daniel Carda
 *             All Rights Reserved
 * ---------------------------------------------------------------------------------------
 *
 *  License: Apache 2.0 License
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANT ABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.cardatechnologies.utils.validators.abaroutevalidator;

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
    2026/08/01  Daniel Carda              Improved Mnemonic Text
</pre>
 * <hr>
 */
public enum ErrorCodes {

    /** Error code indicating ABA number is null. */
    ABA_1000(-1000,
            "com.cardatechnologies.aba.number.null"),

    /** Error code indicating ABA number is blank. */
    ABA_1001(-1001,
            "com.cardatechnologies.aba.number.blank"),

    /** Error code indicating ABA number is too short. */
    ABA_1002(-1002,
            "com.cardatechnologies.aba.number.length.too.short"),

    /** Error code indicating ABA number is too long. */
    ABA_1003(-1003,
            "com.cardatechnologies.aba.number.length.too.long"),

    /** Error code indicating ABA number contains non-ASCII digits. */
    ABA_1004(-1004,
            "com.cardatechnologies.aba.number.contains.non.ascii.digits"),

    /** Error code indicating an invalid Federal Reserve prefix. */
    ABA_1005(-1005,
            "com.cardatechnologies.aba.number.invalid.federal.reserve.prefix");

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
 * Date:   2020/12/22
 * --------------------------------------------------------------------------------------- */
