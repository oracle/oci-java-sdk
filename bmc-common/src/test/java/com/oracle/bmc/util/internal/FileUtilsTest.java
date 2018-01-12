/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.util.internal;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.SystemUtils;
import org.junit.Test;

public class FileUtilsTest {

    @Test
    public void expandUserHome_tildeNoHomeShortcut() {
        assertEquals("~foo/bar", FileUtils.expandUserHome("~foo/bar"));
    }

    @Test
    public void expandUserHome_noHomeShortcut() {
        assertEquals("/foo/bar", FileUtils.expandUserHome("/foo/bar"));
    }

    @Test
    public void expandUserHome_withHomeShortcut() {
        String homeDir = System.getProperty("user.home");
        String expandedPath = FileUtils.expandUserHome("~/foobar");
        // switch here to make sure test works regardless of platform
        if (SystemUtils.IS_OS_WINDOWS) {
            assertEquals(homeDir + "\\foobar", expandedPath);
        } else {
            assertEquals(homeDir + "/foobar", expandedPath);
        }
    }

    @Test
    public void correctPath_windows() {
        assertEquals("\\foo\\bar", FileUtils.correctPath(true, "/foo/bar"));
    }

    @Test
    public void correctPath_notWindows() {
        assertEquals("/foo/bar", FileUtils.correctPath(false, "/foo/bar"));
    }
}
