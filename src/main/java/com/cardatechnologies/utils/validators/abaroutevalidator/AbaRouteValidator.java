/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2026/11/07
 * ---------------------------------------------------------------------------------------
 * Copyright (c) 2026 Carda Technologies, LLC.
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
    2026/09/17  Daniel Carda              Updated code.  New Class Header.
</pre>
 * <hr>
 */
public final class AbaRouteValidator {

    private static final int FED_NUMBER_GOV_0        =  0;
    private static final int FED_NUMBER_GOV_12       = 12;
    private static final int FED_NUMBER_THRIFT_21    = 21;
    private static final int FED_NUMBER_THRIFT_32    = 32;
    private static final int FED_NUMBER_CLEARING_61  = 61;
    private static final int FED_NUMBER_CLEARNING_72 = 72;
    private static final int FED_NUMBER_TRAVELERS_80 = 80;

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

        // https://en.wikipedia.org/wiki/Routing_transit_number
        // The first two digits of the nine digit RTN must be in the ranges
        // 00 through 12,  00=Gobermint, and 12 Federal Reserve Banks
        // 21 through 32,  Thrift Institutions
        // 61 through 72,  Payment Processors and Clearing Houses
        // 80.             Traveler's checks
        if (!((fedNumber >= FED_NUMBER_GOV_0 && fedNumber <= FED_NUMBER_GOV_12)
                || (fedNumber >= FED_NUMBER_THRIFT_21 && fedNumber <= FED_NUMBER_THRIFT_32)
                || (fedNumber >= FED_NUMBER_CLEARING_61 && fedNumber <= FED_NUMBER_CLEARNING_72)
                || fedNumber == FED_NUMBER_TRAVELERS_80)) {
            throw new AbaRouteValidationException(ErrorCodes.ABA_1005);
        }
    }
}
/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.AbaRouteValidator.java
 * Date:   2026/11/07
 * --------------------------------------------------------------------------------------- */
