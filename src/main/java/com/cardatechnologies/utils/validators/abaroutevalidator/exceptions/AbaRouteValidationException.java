/* ***************************************************************************************
 * Class: com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.java  
 * Date:  2015/02/11
 * ***************************************************************************************
 *
 * Copyright 2015 - CardaTechnologies, LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ***************************************************************************************
 */

package com.cardatechnologies.utils.validators.abaroutevalidator.exceptions;

/**
 * <dl>
 * <dt><font face="Arial"><span class="simpleTagLabel">All Rights Reserved</span></font></dt>
 * <dd>Copyright &copy; 2015 - CardaTechnologies, LLC</dd>
 * <dt><font face="Arial"><span class="simpleTagLabel">Class Description:</span></font></dt>
 * <dd>This class is used to validate a ABA Routing Transmit Number.</dd>
 * </dl>
 *
 * @version        {version}
 * @author         Enter your name here...    
 */
public class AbaRouteValidationException
        extends Exception {

    /**
     * Constructs ...
     *
     *
     * @param message
     */
    public AbaRouteValidationException( String message ) {
        super( message );
    }

    /**
     * Constructs ...
     *
     *
     * @param cause
     */
    public AbaRouteValidationException( Throwable cause ) {
        super( cause );
    }

    /**
     * Constructs ...
     *
     *
     * @param message
     * @param cause
     */
    public AbaRouteValidationException( String message,
            Throwable                          cause ) {
        super( message,
               cause );
    }

    /**
     * Constructs ...
     *
     *
     * @param message
     * @param cause
     * @param enableSuppression
     * @param writableStackTrace
     */
    protected AbaRouteValidationException( String message,
            Throwable                             cause,
            boolean                               enableSuppression,
            boolean                               writableStackTrace ) {
        super( message,
               cause,
               enableSuppression,
               writableStackTrace );
    }
}

/* ***************************************************************************************
 * Copyright 2015 - CardaTechnologies, LLC
 *
 * Class: com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException.java  
 * Date:  2015/02/11
 *************************************************************************************** */
