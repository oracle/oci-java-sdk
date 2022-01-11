/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NameUtilsTest {

    @Test
    public void canonicalizeName() {
        // lower case name
        assertEquals("FOO", NameUtils.canonicalizeForEnumTypes("foo"));
        // upper case name
        assertEquals("FOO", NameUtils.canonicalizeForEnumTypes("FOO"));
        // camel case name
        assertEquals("FOOBAR", NameUtils.canonicalizeForEnumTypes("fooBar"));
        // Pascal case name
        assertEquals("FOOBAR", NameUtils.canonicalizeForEnumTypes("FooBar"));
        // snake case name
        assertEquals("FOO_BAR", NameUtils.canonicalizeForEnumTypes("foo_bar"));
        // upper snake case name
        assertEquals("FOO_BAR", NameUtils.canonicalizeForEnumTypes("Foo_Bar"));
        // kebab case name
        assertEquals("FOO_BAR", NameUtils.canonicalizeForEnumTypes("foo-bar"));
        // upper kebab case name
        assertEquals("FOO_BAR", NameUtils.canonicalizeForEnumTypes("Foo-Bar"));

        assertEquals("FOO_BAR", NameUtils.canonicalizeForEnumTypes("FOO_BAR"));
    }
}
