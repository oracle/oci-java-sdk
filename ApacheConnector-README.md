# Apache Connector

The Java SDK now by default uses the `ApacheConnector` instead of the Jersey default `HttpUrlConnector` to send requests to the service.

Note: The `ApacheConfigurator` buffers requests into memory and can impact memory utilization of your application.  This increased use of memory is especially relavent when using`ObjectStorageClient` to upload large objects to the Object Storage service.
In order to prevent buffering of requests in memory please use `ApacheConfigurator.NonBuffering` and provide the `contentLength` when calling the api. For example, when calling `ObjectStorageClient.putObject()`, pass the content length when creating 
`PutObjectRequest`. For `ObjectStorageClient`, `ApacheConfigurator.NonBuffering` is the default option. Overriding the 
`clientConfigurator` will default back to Jersey Default Connector.

## Switching to Jersey Default HttpUrlConnectorProvider

The SDK for Java (starting versions 2.0.0) supports Jersey `ApacheConnectorProvider` by default instead of Jersey default `HttpUrlConnectorProvider`. This is to enable the support for the Apache HttpClient for making service calls. For customers who would like to switch back to the old Jersey default client, we provide an option to do so. 

Note : Overriding the `clientConfigurator` property of the client will default back to the Jersey defaults. For configuring `clientConfigurator` with the use of Apache Connector, please use `additionalClientConfigurator`/`additionalClientConfigurators`.

There are multiple ways to configure this option depending upon the global/client level. This can be achieved by the following ways :

At the client level, the SDK provides the following way to switch back to the old Jersey default connector:

For clients that do not buffer requests into memory:

```
IdentityClient.builder().clientConfigurator(new JerseyDefaultConnectorConfigurator.NonBuffering())
```

For clients that buffer requests into memory:

```
IdentityClient.builder().clientConfigurator(new JerseyDefaultConnectorConfigurator())
```

At the global level, the SDK for Java provides the following way to switch back to the old Jersey default Connector :

Alternatively, this can be achieved by excluding the Apache HttpClient dependencies OR via an environment variable. Please follow the steps below.

### Self-Managed Dependencies

If you are managing dependencies yourself:

1. Remove the `org.apache.httpcomponents.httpclient` and `org.glassfish.jersey.connectors.jersey-apache-connector` JARs from the classpath

### Maven-Managed Dependencies

If you are using Maven to manage your dependencies:

1. Add exclusion for the `org.apache.httpcomponents.httpclient` and `org.glassfish.jersey.connectors.jersey-apache-connector` dependencies

    <dependencies>
        ...
        <dependency>
            <groupId>com.oracle.oci.sdk</groupId>
            <artifactId>oci-java-sdk-common</artifactId>
            <version>...</version>
            <exclusions>
                <exclusion>
                    <groupId>org.glassfish.jersey.connectors</groupId>
                    <artifactId>jersey-apache-connector</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>org.apache.httpcomponents</groupId>
                    <artifactId>httpclient</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        ...
    <dependencies>

### Switching back via environment variable

The SDK for Java also provides an environment variable to switch back to the old Jersey Default Connector at the global level. To achieve the same, please set the value of the environment variable - `OCI_JAVASDK_JERSEY_CLIENT_DEFAULT_CONNECTOR_ENABLED` to true. By default, this value is set as false.

### Switching off auto-close of streams 

For API calls that return binary/stream response, the SDK will auto-close the stream once the stream has been completely read by the customer. If reading the stream completely, the SDK will automatically try to close the stream to release the connection from the connection pool, to disable this feature of auto-closing streams on full read, please call `ResponseHelper.shouldAutoCloseResponseInputStream(false)`. This is because the SDK for Java supports the Apache Connector for sending requests and managing connections to the service. By default, the Apache Connector supports connection pooling and in the cases where the stream from the response is not closed, the connections don't get released from the connection pool and in turn results in an indefinite wait time.

## Configuration for Apache Connector

### Configure the Connection Pool

The ApacheConfigurator configures a connection pool by default. However, the connnection pool can be configured
or disabled. Configure the connection pool as follows:

    final ApacheConnectorProperties apacheConnectorProperties =
            ApacheConnectorProperties.builder()
                    //.connectionManager(connectionManager) to provide an instance of connectionManager
                    .connectionPooling(true) // to enable/disable connection pooling
                    .connectionPoolConfig(
                            ApacheConnectionPoolConfig.builder()
                    .defaultMaxConnectionsPerRoute(50)
                    .totalOpenConnections(100).build()) // to set the connection pool configuration
                    .build();
    final ApacheConfigurator configurator = new ApacheConfigurator.NonBuffering(apacheConnectorProperties);

Old way to configure and still works:

	ApacheConnectionPoolConfig poolConfig = ApacheConnectionPoolConfig.builder()
			.defaultMaxConnectionsPerRoute(5) 
			.totalOpenConnections(20)
			.ttl(2, TimeUnit.SECONDS)
			.build();
	ApacheConnectionPoolingClientConfigDecorator poolDecorator =
			new ApacheConnectionPoolingClientConfigDecorator(poolConfig);
	ApacheConfigurator configurator = 
			new ApacheConfigurator(Collections.singletonList(poolDecorator));

	IdentityClient identityClient = IdentityClient.builder()
			.clientConfigurator(configurator)
			.build(authenticationDetailsProvider);

Note : If the connection pooling is disabled, then the thread-safe `BasicHttpClientConnectionManager` is used for the Apache HttpClient. 
A connection manager for a single connection. This connection manager maintains only one active connection. Even
though this class is fully thread-safe it ought to be used by one execution thread only, as only one thread a
time can lease the connection at a time. This connection manager implementation should be used inside an EJB container.
			
Alternatively, 

Documentation explaining the configuration concepts can be found [here](https://hc.apache.org/httpcomponents-client-ga/tutorial/html/connmgmt.html).

### Configure the HTTP Proxy

This add-on supports configuring a client to use a HTTP or HTTPS proxy.  It is configured configured on a per-client basis, meaning that a proxy must be configured for each new client instance.

Configure an HTTP or HTTPS proxy as follows:

#### Authenticated Proxy

	ApacheProxyConfig proxyConfig = ApacheProxyConfig.builder()
			.uri("http://proxy.domain.com:8000")
			.username("username")
			.password("password")
			.build();
	ClientConfigDecorator proxyConfigDecorator =
			new ApacheProxyConfigDecorator(proxyConfig);
	ClientConfigurator configurator =
			new ApacheConfigurator(Collections.singletonList(proxyConfigDecorator));

	IdentityClient identityClient = IdentityClient.builder()
			.clientConfigurator(configurator)
			.build(authenticationDetailsProvider);

#### Unauthenticated Proxy

	ApacheProxyConfig proxyConfig = ApacheProxyConfig.builder()
			.uri("https://proxy.domain.com:443")
			.build();
	ClientConfigDecorator proxyConfigDecorator =
			new ApacheProxyConfigDecorator(proxyConfig);
	ClientConfigurator configurator =
			new ApacheConfigurator(Collections.singletonList(proxyConfigDecorator));

	IdentityClient identityClient = IdentityClient.builder()
			.clientConfigurator(configurator)
			.build(authenticationDetailsProvider);

#### Example
An example of configuring a proxy can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/HttpProxyExample.java).

### Configure the SSLContext and HostNameVerifier

    final ApacheConnectorProperties apacheConnectorProperties =
            ApacheConnectorProperties.builder()
                .sslContext(SSLContext.getDefault())
                .hostnameVerifier(NoopHostnameVerifier.INSTANCE)
                .build();
    final ApacheConfigurator configurator = new ApacheConfigurator.NonBuffering(apacheConnectorProperties);
    ObjectStorage client = ObjectStorageClient.builder()
            .clientConfigurator(configurator)
            .build(authenticationDetailsProvider);

## Known Issues

### Program hangs for an indefinite time

`ApacheConfigurator` by default configures a connection pool with `defaultMaxConnectionsPerRoute` and
`maximumOpenConnections`. Please make sure to close all `InputStreams` obtained from the response object by
calling close on the stream object if doing partial read or if not reading at all. If the stream is read completely, then the SDK will try to
auto-close the stream to release the connection from the connection pool. 
To manually close the stream in case of partial read of stream/no read. Please call close on the stream.
For example - `GetObjectReponse.getInputStream().close()` or
use try-with-resources. Otherwise, a partial read without closing will lead to the connection not being released from 
the pool and results in hanging for an indefinite time.

### Performance issues and switching between connection closing strategies with the Apache Connector

The Java SDK supports the Apache Connector as the default. The Apache Connector supports the use of two connection closing strategies - `ApacheConnectionClosingStrategy.GracefulClosingStrategy` and `ApacheConnectionClosingStrategy.ImmediateClosingStrategy`. 
When using `ApacheConnectionClosingStrategy.GracefulClosingStrategy`, streams returned from response are read till the end of the stream when closing the stream. This can introduce additional time when closing the stream with partial read, depending on how large the remaining stream is.
Use `ApacheConnectionClosingStrategy.ImmediateClosingStrategy` for large files with partial reads instead for faster close. One of the disadvantages of using
`ApacheConnectionClosingStrategy.ImmediateClosingStrategy` on the other hand takes longer when using partial read for smaller stream size (< 1MB). Please consider your use-case and change accordingly.

Note : If both the above Apache Connection closing strategies do not give you optimal results for your use-cases, please consider switching back to Jersey Default `HttpUrlConnectorProvider` using the method stated in the above section.

An example can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/ApacheConnectorPropertiesExample.java  "here")

## More info

### Disabling extra logs related to streams
The SDK emits warnings related to streams when an API that returns streams in its response is called. To disable the logs around streams, you can set 
the system property `oci.javasdk.extra.stream.logs.enabled` to `false`. This can be done programmitically or by passing a system property in the java command line.

More examples related to customizing Apache Connector can be found [here](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java/ApacheConnectorPropertiesExample.java  "here") 

## License
Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl
or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

See [LICENSE](../../LICENSE.txt) for more details.
