/* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.java
 * Date:   2015/04/15
 * ---------------------------------------------------------------------------------------
 *
 *  License: Apache 2.0
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *  OF ANY KIND, either express or implied including the implied warranties of
 *  merchantability and fitness for a particular purpose.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.cardatechnologies.utils.validators.abaroutevalidator.exceptions;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator.exceptions
 * Class:      AbaRouteValidationException.java
 * Desc:       ...
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * </p><pre>
 * yyyy mm dd  Who               Description
 * ----------  ----------------  ----------------------------------------------------
 * 2015/04/15  JavaDan           Initial Module Creation...
 * 2020/12/22  JavaDan           Improved internal error handling.
 * </pre>
 */
public class AbaRouteValidationException
        extends Exception {

    private String errorMessage;
    private int    errorCode;

    /**
     * Constructs ...
     *
     * @param cause
     */
    public AbaRouteValidationException( Throwable cause ) {
        super( cause );
    }

    /**
     * Constructs ...
     *
     * @param errorCode
     *        The integer code assicated with this error.
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
 *  License: Apache 2.0
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 *  this file except in compliance with the License.
 *
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under
 *  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 *  OF ANY KIND, either express or implied including the implied warranties of
 *  merchantability and fitness for a particular purpose.
 *
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.java
 * Date:   2015/04/15
 * --------------------------------------------------------------------------------------- */
