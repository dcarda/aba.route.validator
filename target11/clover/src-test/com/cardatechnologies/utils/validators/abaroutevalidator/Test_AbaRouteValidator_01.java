/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
 * Date:   2021/08/03
 * ---------------------------------------------------------------------------------------
 *
 * Copyright, (c) 2020 - Carda Technologies, LLC
 * All rights reserved.
 */

/*---------------------------------------------------------------------------------------
* Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
* Date:   2015/01/15
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

//~--- non-JDK imports --------------------------------------------------------

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.cardatechnologies.utils.TestWatcherExtension;
import com.cardatechnologies.utils.TraceUnitExtension;
import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator
 * Class:      Test_AbaRouteValidator_01.java
 * Desc:       JUnit test file.
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * <p><pre>
 * yyyy mm dd  Who               Description
 * ----------  ----------------  ----------------------------------------------------
 * 2015/01/15  JavaDan           Initial Module Creation...
 * 2020/12/22  JavaDan           Improved unit test results.
 * 2020/12/23  JavaDan           Updated module to use JUint Jupiter.
 * 2021/05/14  JavaDan           Added @Rule and TraceUnitExtension.
 * </pre>
 */
@ExtendWith({ TraceUnitExtension.class, TestWatcherExtension.class })
public class Test_AbaRouteValidator_01 {static class __CLR4_4_14g4gks23mex8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1628360204205L,8589935092L,206,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testApp() {__CLR4_4_14g4gks23mex8.R.globalSliceStart(getClass().getName(),160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119jc7q4g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g4gks23mex8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g4gks23mex8.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.testApp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119jc7q4g(){try{__CLR4_4_14g4gks23mex8.R.inc(160);
        __CLR4_4_14g4gks23mex8.R.inc(161);boolean returnBool = false;

        // Validate
        __CLR4_4_14g4gks23mex8.R.inc(162);try {
            __CLR4_4_14g4gks23mex8.R.inc(163);returnBool = AbaRouteValidator.validate( "302075018" );
        }
        catch( AbaRouteValidationException e ) {
            __CLR4_4_14g4gks23mex8.R.inc(164);fail( e.getClass().getSimpleName() + "\n" + e.getMessage() );
        }

        // Run the asserts   --------------------------------------------------
        __CLR4_4_14g4gks23mex8.R.inc(165);assertTrue( returnBool );
    }finally{__CLR4_4_14g4gks23mex8.R.flushNeeded();}}

    /**
     * Method description
     */
    @Test
    public void testBlankParam() {__CLR4_4_14g4gks23mex8.R.globalSliceStart(getClass().getName(),166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15026ya4m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g4gks23mex8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g4gks23mex8.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.testBlankParam",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15026ya4m(){try{__CLR4_4_14g4gks23mex8.R.inc(166);
        __CLR4_4_14g4gks23mex8.R.inc(167);String abaNumber = "";

        // Validate
        __CLR4_4_14g4gks23mex8.R.inc(168);try {
            __CLR4_4_14g4gks23mex8.R.inc(169);AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            __CLR4_4_14g4gks23mex8.R.inc(170);assertEquals( -1001, e.getErrorCode() );
            __CLR4_4_14g4gks23mex8.R.inc(171);assertEquals( "com.cardatechnologies.aba.number.blank", e.getErrorMessage() );

            __CLR4_4_14g4gks23mex8.R.inc(172);return;
        }

        // If it gets here its bad
        __CLR4_4_14g4gks23mex8.R.inc(173);fail( "Should not have got here" );
    }finally{__CLR4_4_14g4gks23mex8.R.flushNeeded();}}

    /**
     * Method description
     */
    @Test
    public void testNullParam() {__CLR4_4_14g4gks23mex8.R.globalSliceStart(getClass().getName(),174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1qrtw2j4u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g4gks23mex8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g4gks23mex8.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.testNullParam",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),174,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1qrtw2j4u(){try{__CLR4_4_14g4gks23mex8.R.inc(174);
        __CLR4_4_14g4gks23mex8.R.inc(175);String abaNumber = null;

        // Validate
        __CLR4_4_14g4gks23mex8.R.inc(176);try {
            __CLR4_4_14g4gks23mex8.R.inc(177);AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            __CLR4_4_14g4gks23mex8.R.inc(178);assertEquals( -1000, e.getErrorCode() );
            __CLR4_4_14g4gks23mex8.R.inc(179);assertEquals( "com.cardatechnologies.aba.number.null", e.getErrorMessage() );

            // We're done, just return.
            __CLR4_4_14g4gks23mex8.R.inc(180);return;
        }

        // If it gets here its bad
        __CLR4_4_14g4gks23mex8.R.inc(181);fail( "Should not have got here" );
    }finally{__CLR4_4_14g4gks23mex8.R.flushNeeded();}}

    /**
     * Method description
     */
    @Test
    public void testParamNonNumeric() {__CLR4_4_14g4gks23mex8.R.globalSliceStart(getClass().getName(),182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_11v1bfi52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g4gks23mex8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g4gks23mex8.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.testParamNonNumeric",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),182,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_11v1bfi52(){try{__CLR4_4_14g4gks23mex8.R.inc(182);
        __CLR4_4_14g4gks23mex8.R.inc(183);String abaNumber = "123456a89";

        // Validate
        __CLR4_4_14g4gks23mex8.R.inc(184);try {
            __CLR4_4_14g4gks23mex8.R.inc(185);AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            __CLR4_4_14g4gks23mex8.R.inc(186);assertEquals( -1004, e.getErrorCode() );
            __CLR4_4_14g4gks23mex8.R.inc(187);assertEquals( "com.cardatechnologies.aba.number.not.numeric", e.getErrorMessage() );

            __CLR4_4_14g4gks23mex8.R.inc(188);return;
        }

        // If it gets here its bad
        __CLR4_4_14g4gks23mex8.R.inc(189);fail( "Should not have got here" );
    }finally{__CLR4_4_14g4gks23mex8.R.flushNeeded();}}

    /**
     * Method description
     */
    @Test
    public void testParamToLong() {__CLR4_4_14g4gks23mex8.R.globalSliceStart(getClass().getName(),190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1lqz8nt5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g4gks23mex8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g4gks23mex8.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.testParamToLong",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),190,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1lqz8nt5a(){try{__CLR4_4_14g4gks23mex8.R.inc(190);
        __CLR4_4_14g4gks23mex8.R.inc(191);String abaNumber = "123451234512";

        // Validate
        __CLR4_4_14g4gks23mex8.R.inc(192);try {
            __CLR4_4_14g4gks23mex8.R.inc(193);AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            __CLR4_4_14g4gks23mex8.R.inc(194);assertEquals( -1003, e.getErrorCode() );
            __CLR4_4_14g4gks23mex8.R.inc(195);assertEquals( "com.cardatechnologies.aba.number.too.long", e.getErrorMessage() );

            // We're done, just return.
            __CLR4_4_14g4gks23mex8.R.inc(196);return;
        }

        // If it gets here its bad
        __CLR4_4_14g4gks23mex8.R.inc(197);fail( "Should not have got here" );
    }finally{__CLR4_4_14g4gks23mex8.R.flushNeeded();}}

    /**
     * Method description
     */
    @Test
    public void testParamToShort() {__CLR4_4_14g4gks23mex8.R.globalSliceStart(getClass().getName(),198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12ahd4d5i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14g4gks23mex8.R.rethrow($CLV_t2$);}finally{__CLR4_4_14g4gks23mex8.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.testParamToShort",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12ahd4d5i(){try{__CLR4_4_14g4gks23mex8.R.inc(198);
        __CLR4_4_14g4gks23mex8.R.inc(199);String abaNumber = "123412";

        // Validate
        __CLR4_4_14g4gks23mex8.R.inc(200);try {
            __CLR4_4_14g4gks23mex8.R.inc(201);AbaRouteValidator.validate( abaNumber );
        }
        catch( AbaRouteValidationException e ) {

            // This is good.  We were expecting an exception.
            __CLR4_4_14g4gks23mex8.R.inc(202);assertEquals( -1002, e.getErrorCode() );
            __CLR4_4_14g4gks23mex8.R.inc(203);assertEquals( "com.cardatechnologies.aba.number.too.short", e.getErrorMessage() );

            // We're done, just return.
            __CLR4_4_14g4gks23mex8.R.inc(204);return;
        }

        // If it gets here its bad
        __CLR4_4_14g4gks23mex8.R.inc(205);fail( "Should not have got here" );
    }finally{__CLR4_4_14g4gks23mex8.R.flushNeeded();}}
}

/* ***************************************************************************************
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
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.Test_AbaRouteValidator_01.java
 * Date:   2015/01/15
 *************************************************************************************** */

