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

/**
 * <b>Description:</b><br>
 *     This class is used throwing error messages relating to the ABA Routing code.
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2015/04/15  Daniel Carda              Initial Module Creation...
    2020/12/22  Daniel Carda              Improved internal error handling.
    2021/08/01  Daniel Carda              Improved Class Javadocs
</pre>
 * <hr>
 */
public class AbaRouteValidationException
        extends Exception {

    private String errorMessage;
    private int    errorCode;

    /**
     * Constructs ...
     *
     * @param cause
     *        Throwable reason.
     */
    public AbaRouteValidationException( Throwable cause ) {
        super( cause );
    }

    /**
     * Constructs ...
     *
     * @param errorCode
     *        The integer code associated with this error.
     * @param errorMessage
     *        A textual message about the error.
     */
    public AbaRouteValidationException( final int    errorCode,
                                        final String errorMessage ) {
        super( errorMessage );

        //
        this.errorCode    = errorCode;
        this.errorMessage = errorMessage;
    }

    /**
     * Method: getErrorCode
     *
     * @return int
     *         The integer code associated with this error.
     */
    public int getErrorCode() {
        return errorCode;
    }

    /**
     * Method: setErrorCode
     *
     * @param errorCode
     *        The integer code associated with this error.
     */
    public void setErrorCode( int errorCode ) {
        this.errorCode = errorCode;
    }

    /**
     * Method: getErrorMessage
     *
     * @return String
     *         A text description of the error.
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Method: setErrorMessage
     *
     * @param errorMessage
     *        A textual message about the error.
     */
    public void setErrorMessage( String errorMessage ) {
        this.errorMessage = errorMessage;
    }
}

/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.java
 * Date:   2015/04/15
 * --------------------------------------------------------------------------------------- */
