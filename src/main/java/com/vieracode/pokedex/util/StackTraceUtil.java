/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vieracode.pokedex.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/**
 *
 * @author jbvie
 */
public final class StackTraceUtil {

    public static String getStackTrace(Throwable throwable) {
        Writer result = new StringWriter();
        PrintWriter printWriter = new PrintWriter(result);
        throwable.printStackTrace(printWriter);
        return result.toString();
    }

    /**
     * Defines a custom format for the stack trace as String.
     * @param throwable
     * @return 
     */
    public static String getCustomStackTrace(Throwable throwable) {
        //add the class name and any message passed to constructor
        StringBuilder result = new StringBuilder("BOO-BOO: ");
        result.append(throwable.toString());
        String NL = System.getProperty("line.separator");
        result.append(NL);

        //add each element of the stack trace
        for (StackTraceElement element : throwable.getStackTrace()) {
            result.append(element);
            result.append(NL);
        }
        return result.toString();
    }
}
