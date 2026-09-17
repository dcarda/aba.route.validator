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
public class AbaRouteValidator {

    private static final int ABA_LENGTH = 9;

    private AbaRouteValidator() {
        // Utility class.
    }

    /**
     * Method: validate
     *
     * This method is the starting point to validate whether an incoming string is
     * a valid ABA Routing Transit Number.
     *
     * @param  routingNumber The ABA number to be tested.
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     *
     * @throws AbaRouteValidationException
     *         An error occurred when parsing the suspect
     *         ABA Routing Transit Number.
     */
    public static boolean validate(final String routingNumber)
            throws AbaRouteValidationException {

        if (routingNumber == null) {
            throw new AbaRouteValidationException(
                    ErrorCodes.ABA_1000.getErrorCode(),
                    ErrorCodes.ABA_1000.getErrorMnemonic());
        }

        if (routingNumber.isBlank()) {
            throw new AbaRouteValidationException(
                    ErrorCodes.ABA_1001.getErrorCode(),
                    ErrorCodes.ABA_1001.getErrorMnemonic());
        }

        if (routingNumber.length() != ABA_LENGTH) {
            if (routingNumber.length() < ABA_LENGTH) {
                throw new AbaRouteValidationException(
                        ErrorCodes.ABA_1002.getErrorCode(),
                        ErrorCodes.ABA_1002.getErrorMnemonic());
            }

            throw new AbaRouteValidationException(
                    ErrorCodes.ABA_1003.getErrorCode(),
                    ErrorCodes.ABA_1003.getErrorMnemonic());
        }

        if (!isAsciiDigits(routingNumber)) {
            throw new AbaRouteValidationException(
                    ErrorCodes.ABA_1004.getErrorCode(),
                    ErrorCodes.ABA_1004.getErrorMnemonic());
        }

        validateFedNumber(routingNumber);

        return validateAbaNumberChecksum(routingNumber);
    }

    /**
     * Method: validateAbaNumberChecksum
     *
     * @param  routingNumber
     *         Checks the checksum of the entire number
     *
     * @return boolean
     *         True if all the characters were digits.
     *         False if there was a problem.
     */
    private static boolean validateAbaNumberChecksum(
            final String routingNumber) {

        final int[] weights = { 3, 7, 1 };

        int checksum = 0;

        for (int i = 0; i < ABA_LENGTH; i++) {
            checksum +=
                    (routingNumber.charAt(i) - '0')
                            * weights[i % 3];
        }

        return checksum % 10 == 0;
    }

    /**
     * Method: isAsciiDigits
     *
     * This checkes to make sure the individual "characters" are actually numbers.
     *
     * @param  value The target string to test.
     *
     * @throws AbaRouteValidationException
     *         There was a problem in converting the ABA number.
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
     *
     * This method will test to see if the first two characters, when combined to create a
     * number, are within an acceptable range.
     *
     * @param  routingNumber The target string to test.
     *
     * @throws AbaRouteValidationException
     *         There was a problem in converting the ABA number.
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

            throw new AbaRouteValidationException(
                    ErrorCodes.ABA_1005.getErrorCode(),
                    ErrorCodes.ABA_1005.getErrorMnemonic());
        }
    }
}
/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2026/09/17
 * --------------------------------------------------------------------------------------- */
