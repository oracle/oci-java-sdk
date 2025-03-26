/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.internal;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for {@link com.oracle.bmc.http.internal.EntityFactory}.
 */
public class EntityFactoryTest {
    @Test
    public void getBodyAsString() {
        Record r = new Record(7, "foo");

        String bodyAsString = EntityFactory.getBodyAsString(r);

        assertEquals("{\"i\":7,\"s\":\"foo\"}", bodyAsString);
    }

    @Test
    public void getBodyAsString_String() {
        String input = "{}";
        String bodyAsString = EntityFactory.getBodyAsString(input);

        assertEquals(input, bodyAsString);
    }

    static class Record {
        int i;
        String s;

        public Record(int i, String s) {
            this.i = i;
            this.s = s;
        }

        public int getI() {
            return this.i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public String getS() {
            return this.s;
        }

        public void setS(String s) {
            this.s = s;
        }
    }
}
