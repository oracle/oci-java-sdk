/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import static org.junit.Assert.assertEquals;

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
        if (FileUtils.IS_OS_WINDOWS) {
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
