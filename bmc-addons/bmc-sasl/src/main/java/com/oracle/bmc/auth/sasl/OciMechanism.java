/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.sasl;

import com.oracle.bmc.http.signing.internal.Algorithm;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Defines all the supports OCI SASL mechanisms.
 */
public enum OciMechanism {
    OCI_RSA_SHA256(Algorithm.RSAPSS256);

    private final String mechanismName;
    private final Algorithm algorithm;

    private static final Map<String, OciMechanism> MECHANISMS_MAP;

    static {
        Map<String, OciMechanism> map = new HashMap<>();
        for (OciMechanism mechanism : values()) {
            map.put(mechanism.mechanismName, mechanism);
        }
        MECHANISMS_MAP = Collections.unmodifiableMap(map);
    }

    public static OciMechanism fromMechanismName(String mechanismName) {
        return MECHANISMS_MAP.get(mechanismName);
    }

    public static Collection<String> mechanismNames() {
        return MECHANISMS_MAP.keySet();
    }

    public static boolean isOci(String mechanismName) {
        return MECHANISMS_MAP.containsKey(mechanismName);
    }

    OciMechanism(Algorithm algorithm) {
        this.mechanismName = "OCI-" + algorithm.getSpecName().toUpperCase();
        this.algorithm = algorithm;
    }

    public String mechanismName() {
        return mechanismName;
    }

    public Algorithm algorithm() {
        return algorithm;
    }
}
