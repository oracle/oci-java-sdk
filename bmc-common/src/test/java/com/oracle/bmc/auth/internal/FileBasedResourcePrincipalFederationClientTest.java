/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Date;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import com.oracle.bmc.auth.SessionKeySupplier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileBasedResourcePrincipalFederationClientTest {
    private static final String fakeToken = generateToken();

    @Test
    public void testGetSecurityTokenFromFile() throws IOException {

        File temp = File.createTempFile(this.getClass().getName() + "-token", ".tmp");
        temp.deleteOnExit();
        Files.write(temp.toPath(), fakeToken.getBytes(StandardCharsets.UTF_8));

        SessionKeySupplier sks =
                new SessionKeySupplier() {
                    @Override
                    public KeyPair getKeyPair() {
                        return new KeyPair(null, null);
                    }

                    @Override
                    public RSAPublicKey getPublicKey() {
                        return null;
                    }

                    @Override
                    public RSAPrivateKey getPrivateKey() {
                        return null;
                    }

                    @Override
                    public void refreshKeys() {}
                };
        String path = temp.getAbsolutePath();
        FileBasedResourcePrincipalFederationClient underTest =
                new FileBasedResourcePrincipalFederationClient(sks, path);

        String securityToken = underTest.refreshAndGetSecurityToken();
        assertEquals(fakeToken, securityToken);
    }

    private static String generateToken() {
        try {
            // Generate random 256-bit (32-byte) shared secret
            SecureRandom secureRandom = new SecureRandom();
            byte[] sharedSecret = new byte[32];
            secureRandom.nextBytes(sharedSecret);

            // Create HMAC signer
            JWSSigner signer = new MACSigner(sharedSecret);

            // Prepare JWT with claims set
            JWTClaimsSet claimsSet =
                    new JWTClaimsSet.Builder()
                            .subject("OCI")
                            .issuer("https://oraclecloud.com/")
                            .expirationTime(new Date(new Date().getTime() + 60 * 1000))
                            .build();

            SignedJWT signedJWT = new SignedJWT(new JWSHeader(JWSAlgorithm.HS256), claimsSet);

            // Apply HMAC protection
            signedJWT.sign(signer);

            return signedJWT.serialize();
        } catch (JOSEException e) {
            e.printStackTrace();
        }
        return "";
    }
}
