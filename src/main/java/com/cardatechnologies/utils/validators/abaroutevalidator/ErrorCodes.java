/*---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2020/12/22
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

/**
 * <b>Description:</b><br>
 *     This class is used to run unit tests against the main code.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2015/12/22  JavaDan                   Initial Module Creation...
    2020/12/20  JavaDan                   Updated formatting.
    2021/08/01  Daniel Carda              Improved Class Javadocs
</pre>
 * <hr>
 */
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
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2020/12/22
 * --------------------------------------------------------------------------------------- */
