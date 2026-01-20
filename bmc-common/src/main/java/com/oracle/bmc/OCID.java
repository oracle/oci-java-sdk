/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import java.util.regex.Pattern;

import com.oracle.bmc.util.internal.StringUtils;

/**
 * Oracle Cloud Infrastructure unique ID.
 *
 * <p>See <a
 * href="https://docs.oracle.com/iaas/Content/GSG/Concepts/concepts.htm#ocid">documentation</a>.
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
        if (StringUtils.isBlank(ocid)) return false;
        return OCID_PATTERN.matcher(ocid).matches();
    }
}
