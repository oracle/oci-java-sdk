/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OptionsTest {
    private static final String TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY =
            "oci.javasdk.token.refresh.enabled";
    private static final String CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY =
            "oci.javasdk.ConnectionPoolingApacheConfigurator.enabled.global";
    private static final String CONNECTION_POOLING_ENABLED_PREFIX =
            "oci.javasdk.ConnectionPoolingApacheConfigurator.enabled.";
    private static final String CLIENT_CLASS_NAME = "com.oracle.bmc.vault.VaultsClient";

    private final boolean originalAutoClose = Options.getShouldAutoCloseResponseInputStream();
    private final boolean originalTokenRefreshEnabled = Options.isTokenRefreshRetrierEnabled();
    private final String originalTokenRefreshProperty =
            System.getProperty(TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY);
    private final String originalGlobalConnectionPoolingProperty =
            System.getProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY);
    private final String originalClassConnectionPoolingProperty =
            System.getProperty(CONNECTION_POOLING_ENABLED_PREFIX + CLIENT_CLASS_NAME);

    @After
    public void tearDown() throws Exception {
        Options.shouldAutoCloseResponseInputStream(originalAutoClose);
        setTokenRefreshEnabled(originalTokenRefreshEnabled);
        restoreProperty(TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY, originalTokenRefreshProperty);
        restoreProperty(
                CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY,
                originalGlobalConnectionPoolingProperty);
        restoreProperty(
                CONNECTION_POOLING_ENABLED_PREFIX + CLIENT_CLASS_NAME,
                originalClassConnectionPoolingProperty);
    }

    @Test
    public void shouldAutoCloseResponseInputStreamCanBeEnabledAndDisabled() {
        Options.shouldAutoCloseResponseInputStream(false);
        assertFalse(Options.getShouldAutoCloseResponseInputStream());

        Options.shouldAutoCloseResponseInputStream(true);
        assertTrue(Options.getShouldAutoCloseResponseInputStream());
    }

    @Test
    public void tokenRefreshRetrierDefaultsToEnabledWhenSystemPropertyIsMissing() throws Exception {
        System.clearProperty(TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY);

        reinitializeTokenRefreshRetryEnabled();

        assertTrue(Options.isTokenRefreshRetrierEnabled());
    }

    @Test
    public void tokenRefreshRetrierCanBeDisabledWithSystemProperty() throws Exception {
        System.setProperty(TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY, "false");

        reinitializeTokenRefreshRetryEnabled();

        assertFalse(Options.isTokenRefreshRetrierEnabled());
    }

    @Test
    public void defaultConnectionPoolingConfiguratorIsEnabledWhenNoOverridesAreSet() {
        System.clearProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY);
        System.clearProperty(CONNECTION_POOLING_ENABLED_PREFIX + CLIENT_CLASS_NAME);

        assertTrue(
                Options.isDefaultConnectionPoolingApacheConfiguratorEnabledForClassName(
                        CLIENT_CLASS_NAME));
    }

    @Test
    public void defaultConnectionPoolingConfiguratorIsEnabledWhenClassNameIsNull() {
        System.clearProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY);
        System.clearProperty(CONNECTION_POOLING_ENABLED_PREFIX + "null");

        assertTrue(Options.isDefaultConnectionPoolingApacheConfiguratorEnabledForClassName(null));
    }

    @Test
    public void defaultConnectionPoolingConfiguratorCanBeDisabledGlobally() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "false");
        System.setProperty(CONNECTION_POOLING_ENABLED_PREFIX + CLIENT_CLASS_NAME, "true");

        assertFalse(
                Options.isDefaultConnectionPoolingApacheConfiguratorEnabledForClassName(
                        CLIENT_CLASS_NAME));
    }

    @Test
    public void defaultConnectionPoolingConfiguratorCanBeDisabledPerClass() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "true");
        System.setProperty(CONNECTION_POOLING_ENABLED_PREFIX + CLIENT_CLASS_NAME, "false");

        assertFalse(
                Options.isDefaultConnectionPoolingApacheConfiguratorEnabledForClassName(
                        CLIENT_CLASS_NAME));
    }

    @Test
    public void defaultConnectionPoolingConfiguratorRemainsEnabledWhenBothOverridesAreTrue() {
        System.setProperty(CONNECTION_POOLING_ENABLED_GLOBAL_SYSTEM_PROPERTY, "true");
        System.setProperty(CONNECTION_POOLING_ENABLED_PREFIX + CLIENT_CLASS_NAME, "true");

        assertTrue(
                Options.isDefaultConnectionPoolingApacheConfiguratorEnabledForClassName(
                        CLIENT_CLASS_NAME));
    }

    private static void reinitializeTokenRefreshRetryEnabled() throws Exception {
        Method initializer = Options.class.getDeclaredMethod("initializeTokenRefreshRetryEnabled");
        initializer.setAccessible(true);
        initializer.invoke(null);
    }

    private static void setTokenRefreshEnabled(boolean enabled) throws Exception {
        System.setProperty(TOKEN_REFRESH_ENABLED_SYSTEM_PROPERTY, Boolean.toString(enabled));
        reinitializeTokenRefreshRetryEnabled();
    }

    private static void restoreProperty(String key, String value) {
        if (value == null) {
            System.clearProperty(key);
        } else {
            System.setProperty(key, value);
        }
    }
}
