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

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * Package:    com.cardatechnologies.utils.validators.abaroutevalidator
 * Class:      TraceUnitExtension.java
 * Desc:       Used to format the output.
 *             You can find details for tis at:
 *                 https://www.baeldung.com/junit-5-migration
 *
 * @author     Daniel Carda
 *
 * Maintenance History:
 * <p><pre>
 * yyyy mm dd  Who               Description
 * ----------  ----------------  ----------------------------------------------------
 * 2021/05/14  JavaDan           Initial Module Creation...
 * </pre>
 *
 * Copyright, \u00a9 2020 - Carda Technologies, LLC
 */
public class TraceUnitExtension
        implements BeforeEachCallback,
                   AfterEachCallback {public static class __CLR4_4_13636ks242wav{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1628360973286L,8589935092L,119,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Override
    public void afterEach( ExtensionContext extensionContext )
            throws Exception {try{__CLR4_4_13636ks242wav.R.inc(114);
        __CLR4_4_13636ks242wav.R.inc(115);System.out.println( "\n   Exiting Method: " + extensionContext.getDisplayName() );
//        System.out.println( "----------------------------------------------------------------------\n" );
    }finally{__CLR4_4_13636ks242wav.R.flushNeeded();}}

    @Override
    public void beforeEach( ExtensionContext extensionContext )
            throws Exception {try{__CLR4_4_13636ks242wav.R.inc(116);
        __CLR4_4_13636ks242wav.R.inc(117);System.out.println( "----------------------------------------------------------------------" );
        __CLR4_4_13636ks242wav.R.inc(118);System.out.println( "  Entering Method: " + extensionContext.getDisplayName() );
    }finally{__CLR4_4_13636ks242wav.R.flushNeeded();}}
}

/* ---------------------------------------------------------------------------------------
 * Copyright, (c) 2009 - Carda Technologies, LLC
 *
 * ---------------------------------------------------------------------------------------
 * Class:  com.cardatechnologies.utils.TraceUnitExtension.java
 * Date:   2021/05/14
 * --------------------------------------------------------------------------------------- */
