/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.signing.internal;

/**
 * Supported signing algorithms for signed request.
 */
public enum Algorithm {

    /**
     * RSA PSS with SHA-256.
     */
    RSAPSS256("rsa-sha256", "SHA256withRSA");

    private final String specName;

    private final String jvmName;

    Algorithm(final String specName, final String jvmName) {
        this.specName = specName;
        this.jvmName = jvmName;
    }

    /**
     * Get the algorithm name registered in
     * <a href="https://tools.ietf.org/html/draft-cavage-http-signatures-04#appendix-E.2">http-signature spec</a>.
     */
    public String getSpecName() {
        return specName;
    }

    /**
     * Get the <a href="https://docs.oracle.com/javase/7/docs/technotes/guides/security/StandardNames.html#Signature">
     * Java Standard Signature Algorithm Name</a>. This is the actual algorithm name used when signing or verifying
     * signature.
     */
    public String getJvmName() {
        return jvmName;
    }
}
