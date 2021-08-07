/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.PerformanceTests.java
 * Date:   2020/12/21
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

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationException;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator
 * Class:      PerformanceTests.java
 * Desc:       JUnit test file.
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * <p><pre>
 * yyyy mm dd  Who               Description
 * ----------  ----------------  ----------------------------------------------------
 * 2020/12/21  JavaDan           Initial Module Creation...
 * 2020/12/23  JavaDan           Updated module to use JUint Jupiter.
 * </pre>
 *
 */
public class PerformanceTests {static class __CLR4_4_13535ks23mevy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1628360204205L,8589935092L,160,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Rigourous Test :-)
     */
    @Disabled
    @Test
    public void testApp() {__CLR4_4_13535ks23mevy.R.globalSliceStart(getClass().getName(),113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_119jc7q35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13535ks23mevy.R.rethrow($CLV_t2$);}finally{__CLR4_4_13535ks23mevy.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.PerformanceTests.testApp",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_119jc7q35(){try{__CLR4_4_13535ks23mevy.R.inc(113);

        // Okay, this litterally is going to run millions of these just to I can get
        // a guage on performance.
        __CLR4_4_13535ks23mevy.R.inc(114);int  _maxLoops = 7500000;
        __CLR4_4_13535ks23mevy.R.inc(115);long startTime = System.nanoTime();

        __CLR4_4_13535ks23mevy.R.inc(116);for( int i = 0; (((i < _maxLoops)&&(__CLR4_4_13535ks23mevy.R.iget(117)!=0|true))||(__CLR4_4_13535ks23mevy.R.iget(118)==0&false)); i++ ) {{

            __CLR4_4_13535ks23mevy.R.inc(119);try {
                __CLR4_4_13535ks23mevy.R.inc(120);AbaRouteValidator.validate( "302075018" );
                __CLR4_4_13535ks23mevy.R.inc(121);AbaRouteValidator.validate( "011000138" );
                __CLR4_4_13535ks23mevy.R.inc(122);AbaRouteValidator.validate( "011600525" );
                __CLR4_4_13535ks23mevy.R.inc(123);AbaRouteValidator.validate( "021200096" );
                __CLR4_4_13535ks23mevy.R.inc(124);AbaRouteValidator.validate( "021300019" );
                __CLR4_4_13535ks23mevy.R.inc(125);AbaRouteValidator.validate( "021502354" );
                __CLR4_4_13535ks23mevy.R.inc(126);AbaRouteValidator.validate( "061192517" );
                __CLR4_4_13535ks23mevy.R.inc(127);AbaRouteValidator.validate( "062101219" );
                __CLR4_4_13535ks23mevy.R.inc(128);AbaRouteValidator.validate( "062203748" );
                __CLR4_4_13535ks23mevy.R.inc(129);AbaRouteValidator.validate( "063114328" );
                __CLR4_4_13535ks23mevy.R.inc(130);AbaRouteValidator.validate( "063201040" );
                __CLR4_4_13535ks23mevy.R.inc(131);AbaRouteValidator.validate( "243379925" );
                __CLR4_4_13535ks23mevy.R.inc(132);AbaRouteValidator.validate( "251480288" );
                __CLR4_4_13535ks23mevy.R.inc(133);AbaRouteValidator.validate( "253175494" );
                __CLR4_4_13535ks23mevy.R.inc(134);AbaRouteValidator.validate( "253279196" );
                __CLR4_4_13535ks23mevy.R.inc(135);AbaRouteValidator.validate( "255073345" );
                __CLR4_4_13535ks23mevy.R.inc(136);AbaRouteValidator.validate( "261071522" );
                __CLR4_4_13535ks23mevy.R.inc(137);AbaRouteValidator.validate( "261270857" );
                __CLR4_4_13535ks23mevy.R.inc(138);AbaRouteValidator.validate( "301081414" );
                __CLR4_4_13535ks23mevy.R.inc(139);AbaRouteValidator.validate( "301271790" );
                __CLR4_4_13535ks23mevy.R.inc(140);AbaRouteValidator.validate( "303085829" );
                __CLR4_4_13535ks23mevy.R.inc(141);AbaRouteValidator.validate( "304083396" );
                __CLR4_4_13535ks23mevy.R.inc(142);AbaRouteValidator.validate( "307087713" );
                __CLR4_4_13535ks23mevy.R.inc(143);AbaRouteValidator.validate( "311387991" );
                __CLR4_4_13535ks23mevy.R.inc(144);AbaRouteValidator.validate( "311986318" );
                __CLR4_4_13535ks23mevy.R.inc(145);AbaRouteValidator.validate( "312276409" );
                __CLR4_4_13535ks23mevy.R.inc(146);AbaRouteValidator.validate( "301178178" );
                __CLR4_4_13535ks23mevy.R.inc(147);AbaRouteValidator.validate( "302177440" );
                __CLR4_4_13535ks23mevy.R.inc(148);AbaRouteValidator.validate( "303986148" );
                __CLR4_4_13535ks23mevy.R.inc(149);AbaRouteValidator.validate( "311079209" );
                __CLR4_4_13535ks23mevy.R.inc(150);AbaRouteValidator.validate( "311385948" );
                __CLR4_4_13535ks23mevy.R.inc(151);AbaRouteValidator.validate( "311985830" );
                __CLR4_4_13535ks23mevy.R.inc(152);AbaRouteValidator.validate( "312276111" );
                __CLR4_4_13535ks23mevy.R.inc(153);AbaRouteValidator.validate( "313173336" );

            } catch (AbaRouteValidationException e) {
                __CLR4_4_13535ks23mevy.R.inc(154);e.printStackTrace();
            }

        }

        }__CLR4_4_13535ks23mevy.R.inc(155);long   endTime  = System.nanoTime();
        __CLR4_4_13535ks23mevy.R.inc(156);double duration = (double) ( endTime - startTime ) / 1000000;    // divide by 1000000 to get milliseconds.

        __CLR4_4_13535ks23mevy.R.inc(157);System.out.println( "Time was: " + duration );
        __CLR4_4_13535ks23mevy.R.inc(158);System.out.println( "Calcs per sec: " + _maxLoops / ( duration / 1000 ) );

        // This is a good thing!
        __CLR4_4_13535ks23mevy.R.inc(159);assertTrue( true );
    }finally{__CLR4_4_13535ks23mevy.R.flushNeeded();}}
}

/* ---------------------------------------------------------------------------------------
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
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.PerformanceTests.java
 * Date:   2020/12/21
 * --------------------------------------------------------------------------------------- */
