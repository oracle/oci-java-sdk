/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.jersey3.apacheconfigurator.ApacheConfigurator;
import com.oracle.bmc.http.client.jersey3.apacheconfigurator.ApacheConnectionPoolConfig;
import com.oracle.bmc.http.client.jersey3.apacheconfigurator.ApacheConnectorProperties;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;

import javax.net.ssl.SSLContext;

public class ApacheConnectionPoolConfigExample {
    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // For bodies with large InputStreams, the ApacheConfigurator.NonBuffering provides the option to switch off
        // buffering of large objects in memory, for buffering clients use ApacheConfigurator
        SSLContext sslContext = null;
        ApacheConnectorProperties apacheConnectorProperties =
                ApacheConnectorProperties.builder()
                        //.connectionManager(connectionManager) to provide an instance of connectionManager
                        .connectionPooling(true) // to enable/disable connection pooling
                        .connectionPoolConfig(
                                ApacheConnectionPoolConfig.builder()
                                        .defaultMaxConnectionsPerRoute(50)
                                        .totalOpenConnections(100)
                                        .build()) // to set the connection pool configuration
                        .hostnameVerifier(
                                NoopHostnameVerifier.INSTANCE) // To set the hostname verifier
                        .sslContext(sslContext) // To set the SSLContext
                        .build();

        ApacheConfigurator configurator =
                new ApacheConfigurator.NonBuffering(apacheConnectorProperties);

        // Initialize the client with the Apache Configurator with custom properties
        Identity identityClient =
                IdentityClient.builder()
                        .clientConfigurator(configurator)
                        .build(provider);

        /*
         * When using ApacheConnectionClosingStrategy.GracefulClosingStrategy, streams returned from response are read
         * till the end of the stream when closing the stream. This can introduce additional time when closing the stream
         * with partial read, depending on how large the remaining stream is. Use
         * ApacheConnectionClosingStrategy.ImmediateClosingStrategy for large files with partial reads instead for
         * faster close.
         * ApacheConnectionClosingStrategy.ImmediateClosingStrategy on the other hand takes longer when using partial
         * read for smaller stream size (< 1MB). Please consider your use-case and change accordingly.
         */
        ApacheConnectorProperties properties =
                ApacheConnectorProperties.builder()
                        .connectionClosingStrategy(
                                new ApacheConnectionClosingStrategy.GracefulClosingStrategy())
                        .build();

        Identity identityClientGracefulClosingClient =
                IdentityClient.builder()
                        .clientConfigurator(new ApacheConfigurator.NonBuffering(properties))
                        .build(provider);

        properties =
                ApacheConnectorProperties.builder()
                        .connectionClosingStrategy(
                                new ApacheConnectionClosingStrategy.ImmediateClosingStrategy())
                        .build();

        Identity identityClientImmediateClosingClient =
                IdentityClient.builder()
                        .clientConfigurator(new ApacheConfigurator.NonBuffering(properties))
                        .build(provider);

    }
}