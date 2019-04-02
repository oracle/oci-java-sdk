/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
