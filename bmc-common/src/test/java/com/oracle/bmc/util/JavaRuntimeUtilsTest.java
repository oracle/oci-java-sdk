/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util;

import static org.junit.Assert.*;

import org.junit.Test;

import com.oracle.bmc.util.JavaRuntimeUtils.JreVersion;

public class JavaRuntimeUtilsTest {

    @Test
    public void version_unsupported() {
        System.setProperty("java.version", "1.6");
        JreVersion version = JavaRuntimeUtils.parse();
        assertEquals(JreVersion.Unsupported, version);
    }

    @Test
    public void version_java7() {
        System.setProperty("java.version", "1.7.22");
        JreVersion version = JavaRuntimeUtils.parse();
        assertEquals(JreVersion.Java_7, version);
    }

    @Test
    public void version_java8() {
        System.setProperty("java.version", "1.8.0_91");
        JreVersion version = JavaRuntimeUtils.parse();
        assertEquals(JreVersion.Java_8, version);
    }

    @Test
    public void version_java9_prerelease() {
        System.setProperty("java.version", "9-ea");
        JreVersion version = JavaRuntimeUtils.parse();
        assertEquals(JreVersion.Java_9, version);
    }

    @Test
    public void version_java9_majoronly() {
        System.setProperty("java.version", "9");
        JreVersion version = JavaRuntimeUtils.parse();
        assertEquals(JreVersion.Java_9, version);
    }

    @Test
    public void version_java9_full() {
        System.setProperty("java.version", "9.0.1");
        JreVersion version = JavaRuntimeUtils.parse();
        assertEquals(JreVersion.Java_9, version);
    }

    @Test
    public void version_java9_full_prerelease() {
        System.setProperty("java.version", "9.1.5-ea");
        JreVersion version = JavaRuntimeUtils.parse();
        assertEquals(JreVersion.Java_9, version);
    }
}
