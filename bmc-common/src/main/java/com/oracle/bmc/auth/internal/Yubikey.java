/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.YubikeyConfig;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.JavaRuntimeUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.util.Enumeration;

public class Yubikey {
    private static final String SUN_PKCS11_CLASSNAME = "sun.security.pkcs11.SunPKCS11";
    private static final String SUN_PKCS11_PROVIDER_NAME = "SunPKCS11";
    private static final String YUBIKEY_PKCS11_CONF_TEMPLATE = "name = Yubikey\nlibrary = %s";
    private static final Object lock = new Object();
    private static Yubikey INSTANCE = null;
    private YubikeyConfig config;
    private Provider provider;

    private Yubikey(YubikeyConfig config) {
        this.config = config;
        provider = initProvider();
    }

    /**
     * Returns an instance of the YubikeyHelper
     *
     * @param config Instance of com.oracle.bmc.auth.yubikey.YubikeyConfig
     * @return Instance of YubikeyHelper
     */
    public static Yubikey instance(YubikeyConfig config) {
        synchronized (lock) {
            if (INSTANCE == null) {
                INSTANCE = new Yubikey(config);
            }
        }
        return INSTANCE;
    }

    private Provider initProvider() {
        Provider provider = Security.getProvider(config.getProviderName());
        if (provider == null) {
            provider = getProvider();
        }
        Security.addProvider(provider);
        return provider;
    }

    private Provider getProvider() {
        final String configString =
                "-- " + String.format(YUBIKEY_PKCS11_CONF_TEMPLATE, config.getLibraryLocation());
        try {
            if (JavaRuntimeUtils.getRuntimeVersion() == JavaRuntimeUtils.JreVersion.Java_8) {
                Class<?> sunPkcs11ProviderClass = Class.forName(SUN_PKCS11_CLASSNAME);
                Constructor<?> constructor = sunPkcs11ProviderClass.getConstructor(String.class);
                return (Provider) constructor.newInstance(configString);
            } else {
                Provider prototype = Security.getProvider(SUN_PKCS11_PROVIDER_NAME);
                Class<?> sunPkcs11ProviderClass = Class.forName(SUN_PKCS11_CLASSNAME);
                Method configureMethod =
                        sunPkcs11ProviderClass.getMethod("configure", String.class);
                return (Provider) configureMethod.invoke(prototype, configString);
            }
        } catch (ClassNotFoundException
                | InstantiationException
                | IllegalAccessException
                | IllegalArgumentException
                | InvocationTargetException
                | NoSuchMethodException
                | SecurityException ex) {
            throw new IllegalArgumentException(
                    "Unable to initiate " + config.getProviderName() + " provider", ex);
        }
    }

    private KeyStore.Entry getPivKeyStore() {
        try {
            final KeyStore keyStore = KeyStore.getInstance(config.getProviderType(), provider);
            keyStore.load(() -> new KeyStore.PasswordProtection(config.getPassphrase()));

            final Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                final String aliasName = aliases.nextElement();
                if (aliasName.contains("PIV")) {
                    return keyStore.getEntry(aliasName, null);
                }
            }
        } catch (Exception e) {
            // It's likely that the yubikey was removed.
            // Clear the provider and we'll set it back up next time.
            Security.removeProvider(config.getProviderName());
            throw new RuntimeException(e);
        }

        throw new RuntimeException(
                "Unable to find 'Certificate for PIV Authentication' on your YubiKey");
    }

    /**
     * Returns a pair of private key instance
     *
     * @return Pair of private key instance
     */
    public PrivateKey getPrivateKey() {
        try {
            final KeyStore.PrivateKeyEntry pke = (KeyStore.PrivateKeyEntry) getPivKeyStore();
            return pke.getPrivateKey();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns fingerprint of the public key associated with yubikey
     *
     * @return public key's fingerprint
     */
    public String getPublicKeyFingerPrint() {
        try {
            final KeyStore.Entry entry = getPivKeyStore();
            final PublicKey publicKey =
                    ((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey();
            return getFingerprint(publicKey.getEncoded());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Returns a fingerprint for the given public key
     *
     * @param content byte array of encoded public key
     * @return public key's fingerprintx
     */
    public String getFingerprint(byte[] content) {
        byte[] hash = md5(content);
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b)).append(":");
        }

        final String s = sb.toString();
        return (s.substring(0, s.length() - 1));
    }

    private static byte[] md5(byte[] bytes) {
        MessageDigest md = getMd5MessageDigest();
        md.update(bytes);
        return md.digest();
    }

    private static MessageDigest getMd5MessageDigest() {
        try {
            return MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("Could not get MD5 digest", e);
        }
    }
}
