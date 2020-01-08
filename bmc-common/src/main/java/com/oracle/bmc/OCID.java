/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import java.util.regex.Pattern;

/**
 * Oracle Cloud Infrastructure unique ID.
 * <p>
 * See <a href="https://docs.us-phoenix-1.oraclecloud.com/Content/GSG/Concepts/concepts.htm#ocid">documentation</a>.
 */
@InternalSdk
public class OCID {
    // <ocid>.<resource-type>.<realm>.<region>(.future-extensibility).<resource-type-specific-id>
    // pattern is relaxed other than the required <ocid> and <resource-type-specific-id>
    private static final Pattern OCID_PATTERN =
            Pattern.compile("^([0-9a-zA-Z-_]+[.:])([0-9a-zA-Z-_]*[.:]){3,}([0-9a-zA-Z-_]+)$");

    /**
     * Test if the given OCID matches the expected pattern for OCIDs.
     *
     * @param ocid The string to test.
     * @return true if it matches teh pattern, false if not.
     */
    public static boolean isValid(String ocid) {
        return OCID_PATTERN.matcher(ocid).matches();
    }
}
