/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//* ---------------------------------------------------------------------------------------
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
        extends Exception {public static class __CLR4_4_12323ks23mesn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1628360203687L,8589935092L,89,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String errorMessage;
    private int    errorCode;

    /**
     * Constructs ...
     *
     * @param cause
     *        Throwable reason.
     */
    public AbaRouteValidationException( Throwable cause ) {
        super( cause );__CLR4_4_12323ks23mesn.R.inc(76);try{__CLR4_4_12323ks23mesn.R.inc(75);
    }finally{__CLR4_4_12323ks23mesn.R.flushNeeded();}}

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
        super( errorMessage );__CLR4_4_12323ks23mesn.R.inc(78);try{__CLR4_4_12323ks23mesn.R.inc(77);

        //
        __CLR4_4_12323ks23mesn.R.inc(79);this.errorCode    = errorCode;
        __CLR4_4_12323ks23mesn.R.inc(80);this.errorMessage = errorMessage;
    }finally{__CLR4_4_12323ks23mesn.R.flushNeeded();}}

    /**
     * Method: getErrorCode
     *
     * @return int
     *         The integer code associated with this error.
     */
    public int getErrorCode() {try{__CLR4_4_12323ks23mesn.R.inc(81);
        __CLR4_4_12323ks23mesn.R.inc(82);return errorCode;
    }finally{__CLR4_4_12323ks23mesn.R.flushNeeded();}}

    /**
     * Method: setErrorCode
     *
     * @param errorCode
     *        The integer code associated with this error.
     */
    public void setErrorCode( int errorCode ) {try{__CLR4_4_12323ks23mesn.R.inc(83);
        __CLR4_4_12323ks23mesn.R.inc(84);this.errorCode = errorCode;
    }finally{__CLR4_4_12323ks23mesn.R.flushNeeded();}}

    /**
     * Method: getErrorMessage
     *
     * @return String
     *         A text description of the error.
     */
    public String getErrorMessage() {try{__CLR4_4_12323ks23mesn.R.inc(85);
        __CLR4_4_12323ks23mesn.R.inc(86);return errorMessage;
    }finally{__CLR4_4_12323ks23mesn.R.flushNeeded();}}

    /**
     * Method: setErrorMessage
     *
     * @param errorMessage
     *        A textual message about the error.
     */
    public void setErrorMessage( String errorMessage ) {try{__CLR4_4_12323ks23mesn.R.inc(87);
        __CLR4_4_12323ks23mesn.R.inc(88);this.errorMessage = errorMessage;
    }finally{__CLR4_4_12323ks23mesn.R.flushNeeded();}}
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
