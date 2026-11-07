/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2026/09/17
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

package com.cardatechnologies.utils.validators.abaroutevalidator;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

/**
 * <b>Description:</b><br>
 *     This class is used to validate a ABA Routing Transit Number.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2015/02/11  Daniel Carda              Initial Module Creation...
    2020/12/23  Daniel Carda              Started using and ENum for error content.
    2020/12/24  Daniel Carda              Optimized algorithms.
    2021/08/01  Daniel Carda              Improved Class Javadocs
    2026/09/17  Daniel Carda              Updated code.
</pre>
 * <hr>
 */
public final class AbaRouteValidator {

    private static final int ABA_LENGTH = 9;
    private static final int[] CHECKSUM_WEIGHTS = { 3, 7, 1 };

    private AbaRouteValidator() {
        // Utility class.
    }

    /**
     * Method: validate
     * <p>
     * <b>Description:</b><br>
     * Validates an ABA Routing Transit Number.
     *
     * @param routingNumber
     *        The ABA Routing Transit Number to validate.
     *
     * @return true if the routing number passes all validation checks;
     *         false if the checksum is invalid.
     *
     * @throws AbaRouteValidationException
     *         If the routing number is null, blank, has an invalid length,
     *         contains non-ASCII digits, or has an invalid Federal Reserve prefix.
     */

    public static boolean validate(final String routingNumber)
            throws AbaRouteValidationException {

        if (routingNumber == null) {
            throw new AbaRouteValidationException(
                    ErrorCodes.ABA_1000);
        }

        if (routingNumber.isBlank()) {
            throw new AbaRouteValidationException(ErrorCodes.ABA_1001);
        }

        if (routingNumber.length() != ABA_LENGTH) {
            if (routingNumber.length() < ABA_LENGTH) {
                throw new AbaRouteValidationException(ErrorCodes.ABA_1002);
            }

            throw new AbaRouteValidationException(ErrorCodes.ABA_1003);
        }

        if (!isAsciiDigits(routingNumber)) {
            throw new AbaRouteValidationException(ErrorCodes.ABA_1004);
        }

        validateFedNumber(routingNumber);

        return validateAbaNumberChecksum(routingNumber);
    }

    /**
     * Method: validateAbaNumberChecksum
     * <p>
     * <b>Description:</b><br>
     * Validates the ABA routing number checksum.
     *
     * @param routingNumber
     *        The nine-digit ABA Routing Transit Number to check.
     *
     * @return true if the checksum is valid; false otherwise.
     */
    private static boolean validateAbaNumberChecksum(
            final String routingNumber) {
        int checksum = 0;
        for (int i = 0; i < ABA_LENGTH; i++) {
            checksum +=
                    (routingNumber.charAt(i) - '0')
                            * CHECKSUM_WEIGHTS[i % CHECKSUM_WEIGHTS.length];
        }

        return checksum % 10 == 0;
    }

    /**
     * Method: isAsciiDigits
     * <p>
     * <b>Description:</b><br>
     * Determines whether every character in the supplied string
     * is an ASCII digit.
     *
     * @param value
     *        The string to examine.
     *
     * @return true if every character is an ASCII digit; false otherwise.
     */
    private static boolean isAsciiDigits(final String value) {

        for (int i = 0; i < value.length(); i++) {
            final char c = value.charAt(i);

            if (c < '0' || c > '9') {
                return false;
            }
        }

        return true;
    }

    /**
     * Method: validateFedNumber
     * <p>
     * <b>Description:</b><br>
     * Validates the Federal Reserve routing prefix represented
     * by the first two digits of the routing number.
     *
     * @param routingNumber
     *        The nine-digit ABA Routing Transit Number.
     *
     * @throws AbaRouteValidationException
     *         If the Federal Reserve prefix is invalid.
     */
    private static void validateFedNumber(final String routingNumber)
            throws AbaRouteValidationException {

        final int fedNumber =
                (routingNumber.charAt(0) - '0') * 10
                        + (routingNumber.charAt(1) - '0');

        if (!((fedNumber >= 0 && fedNumber <= 12)
                || (fedNumber >= 21 && fedNumber <= 32)
                || (fedNumber >= 61 && fedNumber <= 72)
                || fedNumber == 80)) {

            throw new AbaRouteValidationException(ErrorCodes.ABA_1005);
        }
    }
}
/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2026/09/17
 * --------------------------------------------------------------------------------------- */
