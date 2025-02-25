/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.ApacheConfigurator;
import com.oracle.bmc.http.ApacheConnectionPoolConfig;
import com.oracle.bmc.http.ApacheConnectorProperties;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectionClosingStrategy;

import javax.net.ssl.SSLContext;
import java.io.IOException;

/**
 * This class provide a basic example of how to set custom properties for the Apache Connector.
 *
 * Note: Apache Configurator by default configures a connection pool with default values for
 * defaultMaxConnectionsPerRoute and maximum open connections. Please make sure to close all InputStreams obtained from
 * the response object by calling close on the stream object. For example - GetObjectResponse.getInputStream().close or
 * try-with-resources. Otherwise, the connection is not released from the pool and results in hanging for
 * an indefinite time
 */
public class ApacheConnectorPropertiesExample {

    public static void main(String[] args) throws IOException {

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // For bodies with large InputStreams, the ApacheConfigurator.NonBuffering provides the option to switch off
        // buffering of large objects in memory, for buffering clients use ApacheConfigurator
        SSLContext sslContext = null;
        final ApacheConnectorProperties apacheConnectorProperties =
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
                        .idleConnectionMonitorThreadEnabled(
                                true) // To enable the idle connection monitor thread
                        .idleConnectionMonitorThreadIdleTimeoutInSeconds(
                                20) // to set the connection idle timeout
                        .idleConnectionMonitorThreadWaitTimeInSeconds(
                                5) // to set the idle connection monitor thread wait time
                        .build();
        final ApacheConfigurator configurator =
                new ApacheConfigurator.NonBuffering(apacheConnectorProperties);

        final ClientConfigurator additionalClientConfigurator =
                new ClientConfigurator() {
                    @Override
                    public void customizeBuilder(ClientBuilder clientBuilder) {
                        final RequestConfig config =
                                RequestConfig.custom()
                                        // max time to wait for a connection from the connection manager/pool
                                        // prevents the connection manager from blocking indefinitely in the connection request operation
                                        .setConnectionRequestTimeout(2000)
                                        // max time to establish the connection with the remote host
                                        .setConnectTimeout(2000)
                                        // max time waiting for data after establishing the connection; maximum time of inactivity between two data packets
                                        .setSocketTimeout(2000)
                                        .build();

                        clientBuilder.property(ApacheClientProperties.REQUEST_CONFIG, config);
                    }

                    @Override
                    public void customizeClient(Client client) {
                        // no op
                    }
                };

        // Initialize the client with the Apache Configurator with custom properties
        try (ObjectStorageClient objectStorageClient =
                ObjectStorageClient.builder()
                        .clientConfigurator(configurator)
                        .additionalClientConfigurator(additionalClientConfigurator)
                        .build(provider)) {

            // Use objectStorageClient

            // Client will be closed along with IdleConnectionMonitorThread when the try-with-resources block is exited
        }
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

        ObjectStorageClient objectStorageGracefulClosingClient =
                ObjectStorageClient.builder()
                        .clientConfigurator(new ApacheConfigurator.NonBuffering(properties))
                        .build(provider);

        properties =
                ApacheConnectorProperties.builder()
                        .connectionClosingStrategy(
                                new ApacheConnectionClosingStrategy.ImmediateClosingStrategy())
                        .build();

        ObjectStorageClient objectStorageImmediateClosingClient =
                ObjectStorageClient.builder()
                        .clientConfigurator(new ApacheConfigurator.NonBuffering(properties))
                        .build(provider);
    }
}
