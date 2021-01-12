/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import static org.junit.Assert.*;

import org.junit.Test;

public class OCIDTest {

    @Test
    public void validOcid() {
        assertTrue(
                OCID.isValid(
                        "ocid1.user.oc1..aaaaaaaaizi8k3lbfv747ul6qwazrutncoe8zciazibypbjtkxaiecoic1dq"));
    }

    @Test
    public void validLegacyOcid() {
        assertTrue(
                OCID.isValid(
                        "ocidv1:tenancy:oc1:phx:1829406592360:aaaaaaaab4faaopv32ecohhklpvjq463pu"));
    }

    @Test
    public void invalidOcid() {
        assertFalse(OCID.isValid("ocid1.user.oc1."));
        assertFalse(OCID.isValid("ocid1.user.oc1.adsfasfsafdf"));
        assertFalse(OCID.isValid("ocid1.user.oc1.1354aasdf."));
        assertFalse(OCID.isValid("ocid1.user.oc1.1354aasdf.."));
    }
}
