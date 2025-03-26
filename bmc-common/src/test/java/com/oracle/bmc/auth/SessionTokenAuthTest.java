/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth;

import com.oracle.bmc.ConfigFileReader;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SessionTokenAuthTest {
    final String CONFIG_FILE_PATH = "src/test/resources/unit_test_session_token_config";
    final String TOKEN_FILE_PATH = "src/test/resources/unit_test_token";
    final String NO_TOKEN_PATH_PROFILE = "NOTOKENPATH";
    final String NO_TOKEN_PROFILE = "NOTOKEN";
    final String TOKEN_EXISTS_PROFILE = "TOKENEXISTS";
    final String SESSION_TOKEN = "thisisasessiontoken";
    final String NEW_SESSION_TOKEN = "this is a new session token!";
    final String AUTHORIZATION_HEADER_KEY = "authorization";

    @Test(expected = NullPointerException.class)
    public void testSessionTokenNoPathProvided() throws IOException {
        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_FILE_PATH, NO_TOKEN_PATH_PROFILE);
        new SessionTokenAuthenticationDetailsProvider(configFile);
    }

    @Test(expected = FileNotFoundException.class)
    public void testSessionTokenNoFileProvided() throws IOException {
        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_FILE_PATH, NO_TOKEN_PROFILE);
        new SessionTokenAuthenticationDetailsProvider(configFile);
    }

    @Test
    public void testSessionTokenCorrectlySet() throws IOException {
        writeToSessionTokenFile(SESSION_TOKEN);
        final SessionTokenAuthenticationDetailsProvider provider =
                new SessionTokenAuthenticationDetailsProvider(
                        CONFIG_FILE_PATH, TOKEN_EXISTS_PROFILE);
        assertEquals(provider.getKeyId(), "ST$" + SESSION_TOKEN);
    }

    @Test
    public void testSessionTokenRefresh() throws IOException {
        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_FILE_PATH, TOKEN_EXISTS_PROFILE);
        writeToSessionTokenFile("");
        // Create a new SessionTokenAuthenticationDetailsProvider with configFile constructor
        final SessionTokenAuthenticationDetailsProvider provider =
                new SessionTokenAuthenticationDetailsProvider(configFile);

        writeToSessionTokenFile(SESSION_TOKEN);
        assertEquals(provider.refresh(), SESSION_TOKEN);
        assertEquals(provider.getKeyId(), "ST$" + SESSION_TOKEN);

        writeToSessionTokenFile(NEW_SESSION_TOKEN);
        assertEquals(provider.refresh(), NEW_SESSION_TOKEN);
        assertEquals(provider.getKeyId(), "ST$" + NEW_SESSION_TOKEN);
    }

    @Test
    public void testSessionTokenRefreshPropogatesToSigner() throws IOException {
        com.oracle.bmc.Service testService =
                com.oracle.bmc.Services.serviceBuilder()
                        .serviceName("SessionAuthTestService")
                        .serviceEndpointTemplate("https://test-service.test")
                        .build();
        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_FILE_PATH, TOKEN_EXISTS_PROFILE);
        writeToSessionTokenFile(SESSION_TOKEN);
        final SessionTokenAuthenticationDetailsProvider provider =
                new SessionTokenAuthenticationDetailsProvider(configFile);
        final com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory signerFactory =
                new com.oracle.bmc.http.signing.internal.DefaultRequestSignerFactory(
                        com.oracle.bmc.http.signing.SigningStrategy.STANDARD);
        final com.oracle.bmc.http.signing.RequestSigner requestSignerImpl =
                signerFactory.createRequestSigner(testService, provider);
        final Map<String, String> headers =
                requestSignerImpl.signRequest(
                        java.net.URI.create(testService.getServiceEndpointTemplate()),
                        javax.ws.rs.HttpMethod.GET,
                        new HashMap<String, List<String>>(),
                        null);
        // Check if the authorization header contains the old token
        assertTrue(headers.get(AUTHORIZATION_HEADER_KEY).contains(SESSION_TOKEN));

        writeToSessionTokenFile(NEW_SESSION_TOKEN);
        assertEquals(provider.refresh(), NEW_SESSION_TOKEN);
        final Map<String, String> newHeaders =
                requestSignerImpl.signRequest(
                        java.net.URI.create(testService.getServiceEndpointTemplate()),
                        javax.ws.rs.HttpMethod.GET,
                        new HashMap<String, List<String>>(),
                        null);
        // Check if the authorization header contains the new token
        assertTrue(newHeaders.get(AUTHORIZATION_HEADER_KEY).contains(NEW_SESSION_TOKEN));
    }

    private void writeToSessionTokenFile(String token) throws IOException {
        // In case the file does not exist.
        File tokenFile = new File(TOKEN_FILE_PATH);
        tokenFile.createNewFile();

        // Write to & close file.
        FileWriter writer = new FileWriter(TOKEN_FILE_PATH);
        writer.write(token);
        writer.close();
    }
}
