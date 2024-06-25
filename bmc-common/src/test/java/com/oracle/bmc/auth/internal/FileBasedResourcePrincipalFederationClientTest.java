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
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import com.oracle.bmc.auth.SessionKeySupplier;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FileBasedResourcePrincipalFederationClientTest {
    private static final String fakeToken =
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";

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
}
