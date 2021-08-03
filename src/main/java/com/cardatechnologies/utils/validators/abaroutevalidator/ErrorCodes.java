/*---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2020/12/22
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
    yyyy mm dd  Who               Description
    ----------  ----------------  ----------------------------------------------------
    2015/12/22  JavaDan           Initial Module Creation...
    2020/12/20  JavaDan           Updated formatting.
    2021/08/01  Daniel Carda      Improved Class Javadocs
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
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.ErrorCodes.java
 * Date:   2020/12/22
 * --------------------------------------------------------------------------------------- */
