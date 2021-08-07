/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationExceptionTest.java
 * Date:   2021/07/08
 * ---------------------------------------------------------------------------------------
 *
 * Copyright, (c) 2020 - Carda Technologies, LLC
 * All rights reserved.
 */

package com.cardatechnologies.utils.validators.abaroutevalidator.exceptions;

//~--- non-JDK imports --------------------------------------------------------

import com.cardatechnologies.utils.TestWatcherExtension;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.*;

import com.cardatechnologies.utils.TraceUnitExtension;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator.exceptions
 * Class:      AbaRouteValidationExceptionTest.java
 * Desc:       ...
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * <p><pre>
  yyyy mm dd  Who               Description
  ----------  ----------------  ----------------------------------------------------
  2021/07/08  JavaDan           Initial Module Creation...
</pre>
 *
 * Copyright, \u00a9 2020 - Carda Technologies, LLC
 */
@ExtendWith({ TraceUnitExtension.class, TestWatcherExtension.class })
class AbaRouteValidationExceptionTest {static class __CLR4_4_16pbl6pblks22zu62{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1628359130369L,8589935092L,312766,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    void testConstructor() {__CLR4_4_16pbl6pblks22zu62.R.globalSliceStart(getClass().getName(),312753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1uefs8h6pbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16pbl6pblks22zu62.R.rethrow($CLV_t2$);}finally{__CLR4_4_16pbl6pblks22zu62.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationExceptionTest.testConstructor",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),312753,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1uefs8h6pbl(){try{__CLR4_4_16pbl6pblks22zu62.R.inc(312753);

        __CLR4_4_16pbl6pblks22zu62.R.inc(312754);Throwable throwable = new Throwable();

        __CLR4_4_16pbl6pblks22zu62.R.inc(312755);AbaRouteValidationException abaRouteValidationException = new AbaRouteValidationException( throwable );

        __CLR4_4_16pbl6pblks22zu62.R.inc(312756);abaRouteValidationException.setErrorCode( 5151 );

        // Run the asserts   --------------------------------------------------
        __CLR4_4_16pbl6pblks22zu62.R.inc(312757);assertEquals( 5151, abaRouteValidationException.getErrorCode() );
    }finally{__CLR4_4_16pbl6pblks22zu62.R.flushNeeded();}}




    /**
     * Method: testErrorCode
     */
    @Test
    void testErrorCode() {__CLR4_4_16pbl6pblks22zu62.R.globalSliceStart(getClass().getName(),312758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1cfbxiu6pbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16pbl6pblks22zu62.R.rethrow($CLV_t2$);}finally{__CLR4_4_16pbl6pblks22zu62.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationExceptionTest.testErrorCode",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),312758,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1cfbxiu6pbq(){try{__CLR4_4_16pbl6pblks22zu62.R.inc(312758);
        __CLR4_4_16pbl6pblks22zu62.R.inc(312759);AbaRouteValidationException abaRouteValidationException = new AbaRouteValidationException( 1001, "TestError" );

        __CLR4_4_16pbl6pblks22zu62.R.inc(312760);abaRouteValidationException.setErrorCode( 5151 );

        // Run the asserts   --------------------------------------------------
        __CLR4_4_16pbl6pblks22zu62.R.inc(312761);assertEquals( 5151, abaRouteValidationException.getErrorCode() );
    }finally{__CLR4_4_16pbl6pblks22zu62.R.flushNeeded();}}

    /**
     * Method: testErrorMessage
     */
    @Test
    void testErrorMessage() {__CLR4_4_16pbl6pblks22zu62.R.globalSliceStart(getClass().getName(),312762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1dttl886pbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16pbl6pblks22zu62.R.rethrow($CLV_t2$);}finally{__CLR4_4_16pbl6pblks22zu62.R.globalSliceEnd(getClass().getName(),"com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationExceptionTest.testErrorMessage",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),312762,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1dttl886pbu(){try{__CLR4_4_16pbl6pblks22zu62.R.inc(312762);
        __CLR4_4_16pbl6pblks22zu62.R.inc(312763);AbaRouteValidationException abaRouteValidationException = new AbaRouteValidationException( 1001, "TestError" );

        __CLR4_4_16pbl6pblks22zu62.R.inc(312764);abaRouteValidationException.setErrorMessage( "crazy MeSSage!!!" );

        // Run the asserts   --------------------------------------------------
        __CLR4_4_16pbl6pblks22zu62.R.inc(312765);assertEquals( "crazy MeSSage!!!", abaRouteValidationException.getErrorMessage() );
    }finally{__CLR4_4_16pbl6pblks22zu62.R.flushNeeded();}}
}

/* ---------------------------------------------------------------------------------------
 * Copyright, (c) 2009 - Carda Technologies, LLC
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.validators.abaroutevalidator.exceptions.AbaRouteValidationExceptionTest.java
 * Date:   2021/07/08
 * --------------------------------------------------------------------------------------- */
