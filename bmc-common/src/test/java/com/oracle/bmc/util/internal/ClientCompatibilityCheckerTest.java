/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.util.internal;

import com.oracle.bmc.ClientRuntime;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.slf4j.Logger;

import java.util.List;
import java.util.Optional;
import java.util.Properties;

import static com.oracle.bmc.util.internal.ClientCompatibilityChecker.JAVA_CLIENT_CODEGEN_VERSION_PROPERTY_NAME;
import static com.oracle.bmc.util.internal.ClientCompatibilityChecker.JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME;
import static com.oracle.bmc.util.internal.ClientCompatibilityChecker.JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ClientCompatibilityCheckerTest {
    private Logger log;
    private static final String SDK_VERSION = ClientRuntime.getRuntime().getSdkVersion();
    private static final String CLIENT_CLASS_NAME = "com.oracle.bmc.test.TestClient";

    @Before
    public void before() {
        log = mock(Logger.class);
        when(log.isInfoEnabled()).thenReturn(true);
        when(log.isWarnEnabled()).thenReturn(true);
    }

    private static Properties getSdkPropertiesForTest(String min, String max) {
        Properties p = new Properties();
        if (min != null) {
            p.put(JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME, min);
        }
        if (max != null) {
            p.put(JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME, max);
        }
        p.put(ClientRuntime.SDK_VERSION_PROPERTY_NAME, SDK_VERSION);
        return p;
    }

    private static ClientCompatibilityChecker getChecker(String min, String max) {
        return new ClientCompatibilityChecker(
                getSdkPropertiesForTest(min, max),
                ClientCompatibilityChecker.VersionCompatibilityCheckMode.ALWAYS);
    }

    @Test
    public void testClientCompatibleWithinRange() {
        final String min = "2.3.5";
        final String max = "3.5.1";
        final String clientCodegenVer = "3.1.1";
        final Optional<String> javaMinFromClient = Optional.of("");
        ClientCompatibilityChecker checker = getChecker(min, max);
        assertTrue(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(log).info(captor.capture());

        String message = captor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client is compatible with the oci-java-sdk-common version '"
                                + SDK_VERSION
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "since the client was generated using codegen version '"
                                + clientCodegenVer
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "which is in the compatible codegen version range '"
                                + min
                                + "' to '"
                                + max
                                + "'"));
    }

    @Test
    public void testClientOlderThanMinimumVersion() {
        final String min = "2.3.2";
        final String max = "3.5.0";
        final String clientCodegenVer = "1.5.1";
        final Optional<String> javaMinFromClient = Optional.of("");
        ClientCompatibilityChecker checker = getChecker(min, max);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).warn(messageCaptor.capture());

        String message = messageCaptor.getValue();
        // The client is too old for the oci-java-sdk-common version '3.25.2-SNAPSHOT'. The client
        // was generated with codegen version '1.5.1', but this oci-java-sdk-common version
        // '3.25.2-SNAPSHOT' is only backward-compatible to codegen version '2.3.2'
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client is too old for the oci-java-sdk-common version '"
                                + SDK_VERSION
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client was generated with codegen version '"
                                + clientCodegenVer
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "this oci-java-sdk-common version is only backward-compatible down to codegen version '"
                                + min
                                + "'"));
    }

    @Test
    public void testClientNewButCompatible() {
        final String min = "2.3.5";
        final String max = "3.5.1";
        final String minFromClient = "2.3.5";
        final String clientCodegenVer = "3.5.2";
        final Optional<String> javaMinFromClient = Optional.of(minFromClient);

        ClientCompatibilityChecker checker = getChecker(min, max);
        assertTrue(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).info(messageCaptor.capture());

        String message = messageCaptor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client is compatible with the oci-java-sdk-common version '"
                                + SDK_VERSION
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "since the client was generated using codegen version '"
                                + clientCodegenVer
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "it was known that codegen version '"
                                + clientCodegenVer
                                + "' is backward-compatible to codegen version '"
                                + min
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "therefore, the compatible codegen version range '"
                                + min
                                + "' to '"
                                + clientCodegenVer
                                + "' applies"));
    }

    @Test
    public void testClientNewButIncompatible() {
        final String min = "2.3.5";
        final String max = "3.5.1";
        final String minFromClient = "3.6.0";
        final String clientCodegenVer = "3.7.0";
        final Optional<String> javaMinFromClient = Optional.of(minFromClient);
        ClientCompatibilityChecker checker = getChecker(min, max);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).warn(messageCaptor.capture());

        String message = messageCaptor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client is too new for the oci-java-sdk-common version '"
                                + SDK_VERSION
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client was generated using codegen version '"
                                + clientCodegenVer
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "which is backward-compatible down to codegen version '"
                                + minFromClient
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "but this version of oci-java-sdk-common requires codegen version '"
                                + max
                                + "' or older"));
    }

    @Test
    public void testClientMinimumVersionNotSet() {
        final String max = "3.5.0";
        final String minFromClient = "3.7.0";
        final String clientCodegenVer = "3.7.0";
        final Optional<String> javaMinFromClient = Optional.of(minFromClient);

        ClientCompatibilityChecker checker = getChecker(null, max);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).warn(messageCaptor.capture());

        String message = messageCaptor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " not found in sdk.properties file. Cannot determine if the client is compatible with the SDK common library"));
    }

    @Test
    public void testClientMinimumVersionNotSet_ButClientExactSameAsMaximum() {
        final String max = "3.5.0";
        final String minFromClient = "3.4.0";
        final String clientCodegenVer = "3.5.0";
        final Optional<String> javaMinFromClient = Optional.of(minFromClient);
        ClientCompatibilityChecker checker = getChecker(null, max);
        assertTrue(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(log).info(captor.capture());

        String message = captor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client is compatible with the oci-java-sdk-common version '"
                                + SDK_VERSION
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "since it was generated with codegen version '" + clientCodegenVer + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains("exactly the maximum of the compatible codegen version range"));
    }

    @Test
    public void testClientMinimumVersionNotSet_ButClientExactSameAsMaximum_NoMinFromClient() {
        final String max = "3.5.0";
        final String clientCodegenVer = "3.5.0";
        final Optional<String> javaMinFromClient = Optional.empty();
        ClientCompatibilityChecker checker = getChecker(null, max);
        assertTrue(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(log).info(captor.capture());

        String message = captor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client is compatible with the oci-java-sdk-common version '"
                                + SDK_VERSION
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "since it was generated with codegen version '" + clientCodegenVer + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "which is exactly the maximum of the compatible codegen version range"));
    }

    @Test
    public void testClientMaximumVersionNotSet() {
        final String min = "2.5.0";
        final String clientCodegenVer = "3.7.0";
        final String minFromClient = "3.7.0";
        final Optional<String> javaMinFromClient = Optional.of(minFromClient);
        ClientCompatibilityChecker checker = getChecker(min, null);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).warn(messageCaptor.capture());

        String message = messageCaptor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " not found in sdk.properties file. Cannot determine if the client is too new for the SDK common library"));
    }

    @Test
    public void testClientMaximumVersionNotSet_ButClientExactSameAsMinimum() {
        final String min = "2.5.0";
        final String clientCodegenVer = "2.5.0";
        final String minFromClient = "3.7.0";
        final Optional<String> javaMinFromClient = Optional.of(minFromClient);

        // without maximum, we also don't know what THIS version is, so we can't compare
        ClientCompatibilityChecker checker = getChecker(min, null);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).warn(messageCaptor.capture());

        String message = messageCaptor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " not found in sdk.properties file. Cannot determine if the client is too new for the SDK common library"));
    }

    @Test
    public void testClientMaximumVersionNotSet_ButClientExactSameAsMinimum_NoMinFromClient() {
        final String min = "2.5.0";
        final String clientCodegenVer = "2.5.0";
        final Optional<String> javaMinFromClient = Optional.empty();

        // without maximum, we also don't know what THIS version is, so we can't compare
        ClientCompatibilityChecker checker = getChecker(min, null);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).warn(messageCaptor.capture());

        String message = messageCaptor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        JAVA_MAXIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " not found in sdk.properties file. Cannot determine if the client is too new for the SDK common library"));
    }

    @Test
    public void testclientCodegenVersionNotSet() {
        final String min = "2.5.0";
        final String clientCodegenVer = null;
        final String minFromClient = "3.7.0";
        final Optional<String> javaMinFromClient = Optional.of(minFromClient);
        ClientCompatibilityChecker checker = getChecker(min, null);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).warn(messageCaptor.capture());

        String message = messageCaptor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        JAVA_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                + " not found in client.properties file. Cannot determine if the client is compatible with the SDK common library"));
    }

    @Test
    public void testAllVersionsNotSet() {
        final String clientCodegenVer = null;
        final Optional<String> javaMinFromClient = Optional.of("");
        ClientCompatibilityChecker checker = getChecker(null, null);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log, times(2)).warn(messageCaptor.capture());

        List<String> messages = messageCaptor.getAllValues();
        assertTrue(
                messages.stream()
                        .anyMatch(
                                m ->
                                        m.contains(
                                                JAVA_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                                        + " not found in client.properties file. Cannot determine if the client is compatible with the SDK common library")));
        assertTrue(
                messages.stream()
                        .anyMatch(
                                m ->
                                        m.contains(
                                                JAVA_MINIMUM_CLIENT_CODEGEN_VERSION_PROPERTY_NAME
                                                        + " not found in sdk.properties file. Cannot determine if the client is compatible with the SDK common library")));
    }

    @Test
    public void testClientTooOld() {
        final String min = "2.3.5";
        final String max = "3.5.1";
        final String clientCodegenVer = "1.5";
        final Optional<String> javaMinFromClient = Optional.of("");
        ClientCompatibilityChecker checker = getChecker(min, max);
        assertFalse(
                checker.isClientCodegenVersionCompatible(
                        CLIENT_CLASS_NAME, clientCodegenVer, javaMinFromClient, log));

        ArgumentCaptor<String> messageCaptor = ArgumentCaptor.forClass(String.class);
        verify(log).warn(messageCaptor.capture());

        String message = messageCaptor.getValue();
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client is too old for the oci-java-sdk-common version '"
                                + SDK_VERSION
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "The client was generated with codegen version '"
                                + clientCodegenVer
                                + "'"));
        assertTrue(
                "Message didn't match: " + message,
                message.contains(
                        "this oci-java-sdk-common version is only backward-compatible down to codegen version '"
                                + min
                                + "'"));
    }
}
