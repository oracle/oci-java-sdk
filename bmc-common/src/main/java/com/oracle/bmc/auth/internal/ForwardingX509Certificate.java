/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.security.auth.x500.X500Principal;

/**
 * Simple forwarding X509Cerficate class.  Overrides all abstract and non-abtract methods.
 */
public abstract class ForwardingX509Certificate extends X509Certificate {

    protected abstract X509Certificate delegate();

    // BEGIN OVERRIDE non-abstract method from X509Certificate.class

    @Override
    public X500Principal getIssuerX500Principal() {
        return delegate().getIssuerX500Principal();
    }

    @Override
    public X500Principal getSubjectX500Principal() {
        return delegate().getSubjectX500Principal();
    }

    @Override
    public List<String> getExtendedKeyUsage() throws CertificateParsingException {
        return delegate().getExtendedKeyUsage();
    }

    @Override
    public Collection<List<?>> getSubjectAlternativeNames() throws CertificateParsingException {
        return delegate().getSubjectAlternativeNames();
    }

    @Override
    public Collection<List<?>> getIssuerAlternativeNames() throws CertificateParsingException {
        return delegate().getIssuerAlternativeNames();
    }

    // END OVERRIDE non-abstract method from X509Certificate.class

    // BEGIN OVERRIDE non-abstract method from Certificate.class

    @Override
    public boolean equals(Object other) {
        return delegate().equals(other);
    }

    @Override
    public int hashCode() {
        return delegate().hashCode();
    }

    // END OVERRIDE non-abstract method from Certificate.class

    // everything else below are abstract methods

    @Override
    public boolean hasUnsupportedCriticalExtension() {
        return delegate().hasUnsupportedCriticalExtension();
    }

    @Override
    public Set<String> getCriticalExtensionOIDs() {
        return delegate().getCriticalExtensionOIDs();
    }

    @Override
    public Set<String> getNonCriticalExtensionOIDs() {
        return delegate().getNonCriticalExtensionOIDs();
    }

    @Override
    public byte[] getExtensionValue(String oid) {
        return delegate().getExtensionValue(oid);
    }

    @Override
    public void checkValidity()
            throws CertificateExpiredException, CertificateNotYetValidException {
        delegate().checkValidity();
    }

    @Override
    public void checkValidity(Date date)
            throws CertificateExpiredException, CertificateNotYetValidException {
        delegate().checkValidity(date);
    }

    @Override
    public int getVersion() {
        return delegate().getVersion();
    }

    @Override
    public BigInteger getSerialNumber() {
        return delegate().getSerialNumber();
    }

    @Override
    public Principal getIssuerDN() {
        return delegate().getIssuerDN();
    }

    @Override
    public Principal getSubjectDN() {
        return delegate().getSubjectDN();
    }

    @Override
    public Date getNotBefore() {
        return delegate().getNotBefore();
    }

    @Override
    public Date getNotAfter() {
        return delegate().getNotAfter();
    }

    @Override
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        return delegate().getTBSCertificate();
    }

    @Override
    public byte[] getSignature() {
        return delegate().getSignature();
    }

    @Override
    public String getSigAlgName() {
        return delegate().getSigAlgName();
    }

    @Override
    public String getSigAlgOID() {
        return delegate().getSigAlgOID();
    }

    @Override
    public byte[] getSigAlgParams() {
        return delegate().getSigAlgParams();
    }

    @Override
    public boolean[] getIssuerUniqueID() {
        return delegate().getIssuerUniqueID();
    }

    @Override
    public boolean[] getSubjectUniqueID() {
        return delegate().getSubjectUniqueID();
    }

    @Override
    public boolean[] getKeyUsage() {
        return delegate().getKeyUsage();
    }

    @Override
    public int getBasicConstraints() {
        return delegate().getBasicConstraints();
    }

    @Override
    public byte[] getEncoded() throws CertificateEncodingException {
        return delegate().getEncoded();
    }

    @Override
    public void verify(PublicKey key)
            throws CertificateException, NoSuchAlgorithmException, InvalidKeyException,
                    NoSuchProviderException, SignatureException {
        delegate().verify(key);
    }

    @Override
    public void verify(PublicKey key, String sigProvider)
            throws CertificateException, NoSuchAlgorithmException, InvalidKeyException,
                    NoSuchProviderException, SignatureException {
        delegate().verify(key, sigProvider);
    }

    @Override
    public String toString() {
        return delegate().toString();
    }

    @Override
    public PublicKey getPublicKey() {
        return delegate().getPublicKey();
    }
}
