/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ *//* ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.TraceUnitExtension.java
 * Date:   2021/05/14
 * ---------------------------------------------------------------------------------------
 *
 * Copyright, (c) 2020 - Carda Technologies, LLC
 * All rights reserved.
 */

package com.cardatechnologies.utils;

//~--- non-JDK imports --------------------------------------------------------

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

/**
 * <b>Description:</b><br>
 *     Used to format the output.
 *     You can find details for tis at:
 *         https://www.baeldung.com/junit-5-migration
 *
 * @author     Daniel Carda
 * <br>
 * <br><b>Maintenance History:</b>
 * <br>
<pre>
    yyyy mm dd  Who                       Description
    ----------  ------------------------  ----------------------------------------------------
    2021/05/14  Daniel Carda              Initial Module Creation...
    2020/12/20  JavaDan                   Updated TestWatcher code.
</pre>
 * <hr>
 */
public class TestWatcherExtension implements TestWatcher{static class __CLR4_4_12h2hks23tys5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1628360556625L,8589935092L,108,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static String testStatus;
    public static String testCaseName;

    @Override
    public void testAborted(ExtensionContext Context, Throwable throwable) {try{__CLR4_4_12h2hks23tys5.R.inc(89);
        __CLR4_4_12h2hks23tys5.R.inc(90);testStatus = "Aborted";
        __CLR4_4_12h2hks23tys5.R.inc(91);testCaseName = Context.getDisplayName();
        __CLR4_4_12h2hks23tys5.R.inc(92);System.out.println("    ***  Test Aborted: " + Context.getDisplayName());
        __CLR4_4_12h2hks23tys5.R.inc(93);System.out.println( "----------------------------------------------------------------------\n" );
    }finally{__CLR4_4_12h2hks23tys5.R.flushNeeded();}}

    @Override
    public void testDisabled(ExtensionContext Context, Optional<String> optional) {try{__CLR4_4_12h2hks23tys5.R.inc(94);
        __CLR4_4_12h2hks23tys5.R.inc(95);testStatus = "Skipped";
        __CLR4_4_12h2hks23tys5.R.inc(96);testCaseName = Context.getDisplayName();
        __CLR4_4_12h2hks23tys5.R.inc(97);System.out.println("     ***  Test Skipped: " + Context.getDisplayName());
        __CLR4_4_12h2hks23tys5.R.inc(98);System.out.println( "----------------------------------------------------------------------\n" );
    }finally{__CLR4_4_12h2hks23tys5.R.flushNeeded();}}

    @Override
    public void testFailed(ExtensionContext Context, Throwable throwable) {try{__CLR4_4_12h2hks23tys5.R.inc(99);
        __CLR4_4_12h2hks23tys5.R.inc(100);testStatus = "Failed";
        __CLR4_4_12h2hks23tys5.R.inc(101);testCaseName = Context.getDisplayName();
        __CLR4_4_12h2hks23tys5.R.inc(102);System.out.println("     ***  Test Failed: " + Context.getDisplayName());
        __CLR4_4_12h2hks23tys5.R.inc(103);System.out.println( "----------------------------------------------------------------------\n" );
    }finally{__CLR4_4_12h2hks23tys5.R.flushNeeded();}}

    @Override
    public void testSuccessful(ExtensionContext Context) {try{__CLR4_4_12h2hks23tys5.R.inc(104);
        __CLR4_4_12h2hks23tys5.R.inc(105);testStatus = "Passed";
        __CLR4_4_12h2hks23tys5.R.inc(106);testCaseName = Context.getDisplayName();
        //  System.out.println("     Test Passed: " + Context.getDisplayName());
        __CLR4_4_12h2hks23tys5.R.inc(107);System.out.println( "----------------------------------------------------------------------\n" );
    }finally{__CLR4_4_12h2hks23tys5.R.flushNeeded();}}
}

/* ---------------------------------------------------------------------------------------
 * Copyright, (c) 2009 - Carda Technologies, LLC
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.TraceUnitExtension.java
 * Date:   2021/05/14
 * --------------------------------------------------------------------------------------- */
