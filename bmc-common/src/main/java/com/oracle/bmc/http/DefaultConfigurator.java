/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http;

import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.util.internal.ReflectionUtils;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.util.LinkedList;
import java.util.List;

/**
 * DefaultConfigurator handles basic configuration of clients under different
 * environments. This is the configurator used by the REST client factory when
 * no configurator is provided by the SDK user.
 * <p>
 * It currently does the following:
 * <ul>
 * <li>Checks for the presence of Apache Config Classes and creates the appropriate configurator</li>
 * </ul>
 * <p>
 * If the default configurator results in any issues, callers can provide their
 * own implementation when constructing service objects.
 */
@Slf4j
public class DefaultConfigurator
        implements ClientConfigurator, HasEffectiveClientConfigurator, SetsClientBuilderProperties {

    protected static final String APACHE_HTTP_CLIENT_CONFIG_CLASS_NAME =
            "org.apache.http.client.config.RequestConfig";

    protected static final String APACHE_CONNECTOR_CLASS_NAME =
            "org.glassfish.jersey.apache.connector.ApacheConnector";

    // Region metadata env attribute key
    private final static String OCI_JAVASDK_JERSEY_CLIENT_DEFAULT_CONNECTOR_ENABLED_ENV_VAR =
            "OCI_JAVASDK_JERSEY_CLIENT_DEFAULT_CONNECTOR_ENABLED";

    /**
     * The boolean value indicating if the Apache Dependency classes are present on the classpath, and the
     * environment variable in OCI_JAVASDK_JERSEY_CLIENT_DEFAULT_CONNECTOR_ENABLED_ENV_VAR hasn't been set to
     * true to enable the Jersey default connector instead.
     */
    @Getter
    private static final boolean isApacheDependencyPresent =
            (checkForApacheDependencies() && !jerseyDefaultConnectorEnabled());

    private static boolean checkForApacheDependencies() {
        // Check for existing of Apache dependencies, this is to ensure easier shift to Jersey default connector
        // (HttpUrlConnector). Excluding these dependencies makes it easier to switch back to the default jersey
        // connector
        if ((ReflectionUtils.isClassPresent(
                        APACHE_HTTP_CLIENT_CONFIG_CLASS_NAME, DefaultConfigurator.class)
                && ReflectionUtils.isClassPresent(
                        APACHE_CONNECTOR_CLASS_NAME, DefaultConfigurator.class))) {
            return true;
        }
        return false;
    }

    private static boolean jerseyDefaultConnectorEnabled() {
        final String jerseyDefaultConnectorEnabledString =
                System.getenv(OCI_JAVASDK_JERSEY_CLIENT_DEFAULT_CONNECTOR_ENABLED_ENV_VAR);
        if (jerseyDefaultConnectorEnabledString != null
                && !jerseyDefaultConnectorEnabledString.isEmpty()) {
            String trimmedValue = jerseyDefaultConnectorEnabledString.trim();
            if (StringUtils.equalsIgnoreCase("true", trimmedValue)) {
                return true;
            }
        }
        return false;
    }

    /** The list of {@code ClientConfigDecorator}s to support the ability to decorate {@code ClientConfig} */
    protected final List<ClientConfigDecorator> clientConfigDecorators = new LinkedList<>();

    @Getter private final ClientConfigurator effectiveClientConfigurator;

    /** Creates a new {@code DefaultConfigurator} object. */
    public DefaultConfigurator() {
        if (isApacheDependencyPresent()) {
            effectiveClientConfigurator = new ApacheConfigurator();
        } else {
            effectiveClientConfigurator = new JerseyDefaultConnectorConfigurator();
        }
    }

    /**
     * Creates a new {@code DefaultConfigurator} and registers the list of provided {@code ClientConfigDecorator}s.
     *
     * @param clientConfigDecorators the list of client configuration decorators
     */
    public DefaultConfigurator(final List<ClientConfigDecorator> clientConfigDecorators) {
        this.clientConfigDecorators.addAll(clientConfigDecorators);
        if (isApacheDependencyPresent()) {
            effectiveClientConfigurator = new ApacheConfigurator(this.clientConfigDecorators);
        } else {
            effectiveClientConfigurator =
                    new JerseyDefaultConnectorConfigurator(this.clientConfigDecorators);
        }
    }

    @Override
    public void customizeBuilder(ClientBuilder builder) {
        effectiveClientConfigurator.customizeBuilder(builder);
    }

    @Override
    public void customizeClient(Client client) {
        effectiveClientConfigurator.customizeClient(client);
    }

    /**
     * Sets the custom ConnectorProvider to use. Subclasses can override this to
     * be a no-op if they do not want to use the custom connector, or wish to
     * set their own.
     *
     * @param builder
     *            The builder to set the provider on
     */
    @Override
    public void setConnectorProvider(ClientBuilder builder) {
        try {
            SetsClientBuilderProperties setsClientBuilderProperties =
                    (SetsClientBuilderProperties) effectiveClientConfigurator;
            setsClientBuilderProperties.setConnectorProvider(builder);
        } catch (Exception e) {
            LOG.info("Cannot call setConnectorProvider on this ClientConfigurator");
        }
    }

    /**
     * Sets the SSL context on the builder.
     * <p>
     * Separate so subclasses can call if desired.
     *
     * @param builder
     *            The client builder to use.
     */
    @Override
    public void setSslContext(ClientBuilder builder) {
        try {
            SetsClientBuilderProperties setsClientBuilderProperties =
                    (SetsClientBuilderProperties) effectiveClientConfigurator;
            setsClientBuilderProperties.setConnectorProvider(builder);
        } catch (Exception e) {
            LOG.info("Cannot call setSslContext on this ClientConfigurator");
        }
    }

    @Override
    public void customizeRequest(BmcRequest<?> request, WrappedInvocationBuilder ib) {
        effectiveClientConfigurator.customizeRequest(request, ib);
    }

    /**
     * A {@link ClientConfigurator} for a client that does not buffer requests in memory.
     *
     * Note: for PUT and POST requests, this will result in less accurate error messages
     */
    public static class NonBuffering extends DefaultConfigurator
            implements ClientConfigurator, HasEffectiveClientConfigurator,
                    SetsClientBuilderProperties {

        @Getter private final ClientConfigurator effectiveClientConfigurator;

        public NonBuffering() {
            if (isApacheDependencyPresent()) {
                effectiveClientConfigurator = new ApacheConfigurator.NonBuffering();
            } else {
                effectiveClientConfigurator = new JerseyDefaultConnectorConfigurator.NonBuffering();
            }
        }

        @Override
        public void customizeBuilder(ClientBuilder builder) {
            effectiveClientConfigurator.customizeBuilder(builder);
        }

        @Override
        public void customizeClient(Client client) {
            effectiveClientConfigurator.customizeClient(client);
        }

        @Override
        public void customizeRequest(BmcRequest<?> request, WrappedInvocationBuilder ib) {
            effectiveClientConfigurator.customizeRequest(request, ib);
        }

        @Override
        public void setConnectorProvider(ClientBuilder builder) {
            try {
                SetsClientBuilderProperties setsClientBuilderProperties =
                        (SetsClientBuilderProperties) effectiveClientConfigurator;
                setsClientBuilderProperties.setConnectorProvider(builder);
            } catch (ClassCastException e) {
                LOG.info("Cannot call setConnectorProvider on this ClientConfigurator");
            }
        }

        @Override
        public void setSslContext(ClientBuilder builder) {
            try {
                SetsClientBuilderProperties setsClientBuilderProperties =
                        (SetsClientBuilderProperties) effectiveClientConfigurator;
                setsClientBuilderProperties.setConnectorProvider(builder);
            } catch (ClassCastException e) {
                LOG.info("Cannot call setSslContext on this ClientConfigurator");
            }
        }
    }
}
