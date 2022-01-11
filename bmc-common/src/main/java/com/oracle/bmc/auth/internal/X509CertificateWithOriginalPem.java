/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * X509CertificateWithOriginalPem is specifically used so that we can keep track of
 * the original PEM encoded certificate, along with the parsed X509Certificate that
 * it creates.
 * <p>
 * When BouncyCastle (standard or FIPs) is installed as a security provider, and is placed
 * first in the list of security providers, the way it parses the PEM file into a X509Certificate
 * causes the ordering of OU entries to be modified.  When {@link Certificate#getEncoded()} is called,
 * the encoded form no longer matches the original value that is in the PEM file.
 * <p>
 * When using Instance Principals, we need to send back the original encoded form of the X509, along with
 * it's fingerprint, so that Identity can verify it.  If BouncyCastle is used, though, the certificate
 * will look tampered with because the encoded form doesn't match what Identity expects.  For this case
 * specifically, we will attempt to get the encoded bytes from the original PEM file instead and pass
 * them back as is, without parsing it to a X509Certificate.
 */
@RequiredArgsConstructor
public class X509CertificateWithOriginalPem extends ForwardingX509Certificate {
    private final X509Certificate delegate;
    /**
     * The original PEM encoded X509.
     */
    @Getter private final String pemEncodedCertificate;

    @Override
    protected X509Certificate delegate() {
        return delegate;
    }
}
