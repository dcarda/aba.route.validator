/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//*---------------------------------------------------------------------------------------
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
                String errorMnemonic ) {try{__CLR4_4_11w1wks242w79.R.inc(68);
        __CLR4_4_11w1wks242w79.R.inc(69);this.errorCode     = errorCode;
        __CLR4_4_11w1wks242w79.R.inc(70);this.errorMnemonic = errorMnemonic;
    }finally{__CLR4_4_11w1wks242w79.R.flushNeeded();}}

    /**
     * Method: getErrorCode
     *
     * @return int
     */
    public int getErrorCode() {try{__CLR4_4_11w1wks242w79.R.inc(71);
        __CLR4_4_11w1wks242w79.R.inc(72);return errorCode;
    }finally{__CLR4_4_11w1wks242w79.R.flushNeeded();}}

    /**
     * Method: getErrorMnemonic
     *
     * @return String
     */
    public String getErrorMnemonic() {try{__CLR4_4_11w1wks242w79.R.inc(73);
        __CLR4_4_11w1wks242w79.R.inc(74);return errorMnemonic;
    }finally{__CLR4_4_11w1wks242w79.R.flushNeeded();}}
;public static class __CLR4_4_11w1wks242w79{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1628360972726L,8589935092L,75,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;}

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
