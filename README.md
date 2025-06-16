# Oracle Cloud Infrastructure SDK for Java
[![ReleasePublished](https://github.com/oracle/oci-java-sdk/actions/workflows/releasepublished.yml/badge.svg?branch=master)](https://github.com/oracle/oci-java-sdk/actions/workflows/releasepublished.yml)

## About

oci-java-sdk provides an SDK for Java that you can use to manage your Oracle Cloud Infrastructure resources.

The project is open source and maintained by Oracle Corp. The home page for the project is [here](https://docs.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm).

The OCI Java SDK versions `1.x.y` and `2.x.y` are now referred as OCI Legacy Java SDK. Any updates or bug fixes related to OCI Legacy Java SDK can be found in [legacy/v2/master branch](https://github.com/oracle/oci-java-sdk/tree/legacy/v2/master). Please refer [README.md](https://github.com/oracle/oci-java-sdk/blob/legacy/v2/master/README.md) to learn more about these legacy versions.

This GitHub repository will refer to OCI Java SDK version `3.x.y` by default where support for new features and services will be added.


## Documentation

Full documentation, including prerequisites, installation, supported JDK versions and configuration instructions, is available [here](https://docs.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm).

API reference can be found [here](https://docs.oracle.com/iaas/tools/java/latest/).

## Installation

For basic set up, see [Getting Started](https://docs.oracle.com/iaas/Content/API/SDKDocs/javasdkgettingstarted.htm).

For details on compatibility, advanced configurations, and add-ons, see [Configuration](https://docs.oracle.com/iaas/Content/API/SDKDocs/javasdkconfig.htm).

- *Circuit Breaker*: By default, circuit breaker feature is enabled, if it is not expected, please explicitly set the environment variable:
```
export OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED=FALSE
```

## Changes Introduced In OCI Java SDK `3.x.y`

For full details, look at the changelog for version [`3.0.0-beta1`](https://github.com/oracle/oci-java-sdk/blob/master/CHANGELOG.md#300-beta1---2022-10-25).

### HTTP client library is pluggable
There is no HTTP client library configured by default. The OCI Java SDK offers the following two choices for HTTP client libraries to choose from.
- Jakarta EE 8/Jersey 2 - [bmc-common-httpclient-jersey](https://github.com/oracle/oci-java-sdk/tree/master/bmc-common-httpclient-choices/bmc-common-httpclient-jersey)
- Jakarta EE 9/Jersey 3 - [bmc-common-httpclient-jersey3](https://github.com/oracle/oci-java-sdk/tree/master/bmc-common-httpclient-choices/bmc-common-httpclient-jersey3)

- The OCI Java SDK does not choose an HTTP client library for you, and there is no default. You have to explicitly choose one, by declaring a dependency on `oci-java-sdk-common-httpclient-jersey` or `oci-java-sdk-common-httpclient-jersey3`
- Example:

        <dependency>
          <!-- Since this is the "application" pom.xml, we do want to
               choose the httpclient to use. -->
          <groupId>com.oracle.oci.sdk</groupId>
          <artifactId>oci-java-sdk-common-httpclient-jersey</artifactId>
        </dependency>

### Serializer/Deserializer is pluggable
- The serializer is now pluggable and determined by the `HttpProvider`. For the Jersey 2 and Jersey 3 HTTP clients, Jackson continues to be used as the serializer
- As part of the pluggable Serializer changes, when using the Jersey and Jersey 3 HTTP clients, the underlying Jackson `ObjectMapper` can now be obtained using `com.oracle.bmc.serialization.jackson.JacksonSerializer.getDefaultObjectMapper()`. The `com.oracle.bmc.http.client.Serialization.getObjectMapper()` method does not exist anymore.

### GraalVM Native Image Build

OCI Java SDK Jersey HTTP client and Jersey 3 Http client are both ready for GraalVM Native Image. 
See [bmc-examples/native-gradle-example](bmc-examples/native-gradle-example) and [bmc-other-examples/native-maven-example](bmc-other-examples/native-maven-example)
for configuration details for building Native Image executables.

### Invocation callbacks
Instead of using `com.oracle.bmc.util.internal.Consumer<Invocation.Builder>` to register invocation callbacks, use `com.oracle.bmc.http.client.RequestInterceptor` instead, to decouple the implementation from the choice of the HTTP client.

### Client configuration has been simplified
`com.oracle.bmc.http.ClientConfigurator` has a single `customizeClient(HttpClientBuilder builder)` method, instead of `customizeBuilder`, `customizeClient`, and `customizeRequest` methods. Example:

        IdentityClient.builder()
                      .clientConfigurator(
                              builder -> {
                          builder.property(
                                  StandardClientProperties.BUFFER_REQUEST, false);
                      })
                      // ...
                      .build(authenticationDetailsProvider);

- For a comprehensive list of pre-defined settable properties, see
    - [StandardClientProperties.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-common-httpclient/src/main/java/com/oracle/bmc/http/client/StandardClientProperties.java)
    - [ApacheClientProperties.java](https://github.com/oracle/oci-java-sdk/blob/d4b2f51c9c69bf64deb124ca921deeac333c3d03/bmc-common-httpclient-choices/bmc-common-httpclient-jersey/src/main/java/com/oracle/bmc/http/client/jersey/ApacheClientProperties.java) or [ApacheClientProperties.java](https://github.com/oracle/oci-java-sdk/blob/d4b2f51c9c69bf64deb124ca921deeac333c3d03/bmc-common-httpclient-choices/bmc-common-httpclient-jersey3/src/main/java/com/oracle/bmc/http/client/jersey3/ApacheClientProperties.java) (Jersey 3)
- You can also define your own properties.
- The actual properties that can be set depends on the HTTP client you are using.

#### Specific client configuration examples

##### Setting whether to buffer a request

            builder.property(
                    StandardClientProperties.BUFFER_REQUEST, shouldBuffer);

##### Setting an Apache connection manager

            builder.property(
                    ApacheClientProperties.CONNECTION_MANAGER,
                    connectionManager);

##### Setting a trust store

            // Server CA goes into the trust store
            KeyStore trustStore =
                    keystoreGenerator.createTrustStoreWithServerCa(tlsConfig.getCaBundle());
            builder.property(StandardClientProperties.TRUST_STORE, trustStore);

##### Setting a key store

            builder.property(
                    StandardClientProperties.KEY_STORE,
                    new KeyStoreWithPassword(keyStore, keystorePassword));

##### Setting the SSL context

            builder.property(
                    StandardClientProperties.SSL_CONTEXT, sslContext);

##### Setting a proxy

            builder.property(
                    StandardClientProperties.PROXY, proxyConfig);

##### Setting a hostname verifier

            builder.property(
                    StandardClientProperties.HOSTNAME_VERIFIER,
                    NoopHostnameVerifier.INSTANCE);

#### More client configuration examples
- [ApacheConnectorPropertiesExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-examples/src/main/java/ApacheConnectorPropertiesExample.java)
- [HttpProxyExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-examples/src/main/java/HttpProxyExample.java)
- [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) and [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey3-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) (Jersey 3)

### Apache Connector changes

There were numerous changes to decouple the implementation from the choice of the HTTP client.
  - `com.oracle.bmc.http.ApacheConfigurator`, has been replaced by `com.oracle.bmc.http.client.jersey.ApacheClientProperties` or `com.oracle.bmc.http.client.jersey3.ApacheClientProperties` (for Jersey 3).
    - For clients that should not buffer requests into memory:

          ObjectStorageClient nonBufferingObjectStorageClient = ObjectStorageClient
              .builder()
              .clientConfigurator(builder -> {
                  builder.property(StandardClientProperties.BUFFER_REQUEST, false);
                  builder.property(ApacheClientProperties.RETRY_HANDLER, null);
                  builder.property(ApacheClientProperties.REUSE_STRATEGY, null);
              })
              .region(Region.US_PHOENIX_1)
              .build(provider);

    - For clients that should buffer requests into memory:

          IdentityClient bufferingIdentityClient = IdentityClient
              .builder()
              .clientConfigurator(builder -> {
                  builder.property(StandardClientProperties.BUFFER_REQUEST, true);
                  builder.property(ApacheClientProperties.RETRY_HANDLER, null);
                  builder.property(ApacheClientProperties.REUSE_STRATEGY, null);
              })
              .region(Region.US_PHOENIX_1)
              .build(provider);

      - See [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) and [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey3-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) (Jersey 3)

      - Also consider using `com.oracle.bmc.http.client.jersey.apacheconfigurator.ApacheConfigurator from the `oci-java-sdk-addons-apache-configurator-jersey` add-on module; or `com.oracle.bmc.http.client.jersey3.apacheconfigurator.ApacheConfigurator` from the `oci-java-sdk-addons-apache-configurator-jersey3` add-on module.
        - See [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) and [DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java](https://github.com/oracle/oci-java-sdk/blob/v3.0.0/bmc-other-examples/bmc-jersey3-examples/src/main/java/DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample.java) (Jersey 3)

### Circuit breaker changes
  - The circuit breaker interface has been renamed from `com.oracle.bmc.circuitbreaker.JaxRsCircuitBreaker` to `com.oracle.bmc.circuitbreaker.OciCircuitBreaker`
  - Instead of using the constructor of `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration`, use the builder. The constructor is not public anymore.
  - The `com.oracle.bmc.util.CircuitBreakerUtils` class does not deal with actual circuit breakers anymore, just with `com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration`. As such, the `DEFAULT_CIRCUIT_BREAKER` field and the `getUserDefinedCircuitBreaker` method were removed. Construct a new circuit breaker from the default configuration if necessary using the build methods in `com.oracle.bmc.circuitbreaker.CircuitBreakerFactory`.

### Moved classes
  - Class `com.oracle.bmc.Options` was moved to `com.oracle.bmc.http.client.Options`
  - Class `com.oracle.bmc.http.Serialization` was moved to `com.oracle.bmc.http.client.Serialization` and is available from OCI Java SDK versions `3.0.0` to `3.13.1`
  - Class `com.oracle.bmc.io.DuplicatableInputStream` was moved to `com.oracle.bmc.http.client.io.DuplicatableInputStream`

### Long deprecated code was removed
  - The signing strategy `OBJECT_STORAGE` was removed from `com.oracle.bmc.http.signing.SigningStrategy`; it had been deprecated for years and had been replaced by `EXCLUDE_BODY`.
  - The `getPublicKey()` and `getPrivateKey()` methods were removed from `com.oracle.bmc.auth.SessionKeySupplier` and implementing classes; they had been deprecated for years and had been replaced by the `getKeyPair()` method.

### Removed code
  - The `setInstanceMetadataServiceClientConfig` method in `com.oracle.bmc.Region` was removed; it never had any effect.
  - `AbstractFederationClientAuthenticationDetailsProviderBuilder.simpleRetry` method has been removed without replacement, since it is not needed in the OCI Java SDK 3.0.0 and higher.
  - You can copy and paste the [previous implementation](https://github.com/oracle/oci-java-sdk/blob/v2.47.0/bmc-common/src/main/java/com/oracle/bmc/auth/AbstractFederationClientAuthenticationDetailsProviderBuilder.java#L494-L528) if you need it.
  - Starting OCI Java SDK version `3.14.0`, class `com.oracle.bmc.http.client.Serialization` has been removed.
  

### Removed dependencies on the following third-party libraries
- Guava: Guava types have been replaced with JDK types:
  - `com.google.common.base.Optional` has been replaced with `java.util.Optional`
  - `com.google.common.base.Function` has been replaced with `java.util.function.Function`
  - `com.google.common.base.Predicate` has been replaced with `java.util.function.Predicate`
  - `com.google.common.base.Supplier` has been replaced with `java.util.function.Supplier`

## Examples

Examples for OCI Java SDK 3.x.y can be found [bmc-examples/src/main/java](https://github.com/oracle/oci-java-sdk/tree/master/bmc-examples/src/main/java).

### Example for Jersey 2 as HTTP client library (OCI Java SDK `3.x.y`)
In order to use Jersey 2 as HTTP client library, a dependency on `oci-java-sdk-common-httpclient-jersey` needs to be explicitly declared in application's `pom.xml`. Please refer [bmc-jersey-examples/pom.xml](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey-examples/pom.xml)

Examples for Jersey 2 as HTTP client library can be found in [bmc-other-examples/bmc-jersey-examples](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey-examples)

### Example for Jersey 3 as HTTP client library (OCI Java SDK `3.x.y`)
In order to use Jersey 3 as HTTP client library, a dependency on `oci-java-sdk-common-httpclient-jersey3` needs to be explicitly declared in application's `pom.xml`. Please refer [bmc-jersey3-examples/pom.xml](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey3-examples/pom.xml)

Examples for Jersey 3 as HTTP client library can be found in [bmc-other-examples/bmc-jersey3-examples](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey3-examples)

### Example for OCI Legacy Java SDK (OCI Java SDK `1.x.y` and `2.x.y`)
Examples for OCI Legacy Java SDK can be found [here](https://github.com/oracle/oci-java-sdk/tree/legacy/v2/master#examples).

## Help

For details on contributions, questions, or feedback, see [Contact Us](https://docs.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm#ContactUs).

## Changes

See [CHANGELOG](https://github.com/oracle/oci-java-sdk/blob/master/CHANGELOG.md).

## Contributing

oci-java-sdk is an open source project. See [CONTRIBUTING](https://github.com/oracle/oci-java-sdk/blob/master/CONTRIBUTING.md) for details.

Oracle gratefully acknowledges the contributions to oci-java-sdk that have been made by the community.

## Known Issues

You can find information on any known issues with the SDK [here](https://docs.oracle.com/iaas/Content/knownissues.htm) and under the [“Issues” tab of this GitHub repository](https://github.com/oracle/oci-java-sdk/issues).

To learn about known issues with OCI Legacy Java SDK, please refer [Known Issues in OCI Legacy Java SDK](https://github.com/oracle/oci-java-sdk/blob/legacy/v2/master/README.md#known-issues)

### Potential data corruption issue with OCI Java SDK on binary data upload with `RefreshableOnNotAuthenticatedProvider`

**Details**: When using version 1.25.1 or earlier of the OCI Java SDK clients that upload streams of data (for example `ObjectStorageClient` or `FunctionsInvokeClient`), either synchronously and asynchronously, and you use a `RefreshableOnNotAuthenticatedProvider` (for example, for Resource Principals or Instance Principals) you may be affected by **silent data corruption**.

**Workaround**: Update the OCI Java SDK client to version 1.25.2 or later. For more information about this issue and workarounds, see [Potential data corruption issue for OCI Java SDK on binary data upload with `RefreshableOnNotAuthenticatedProvider`](https://github.com/oracle/oci-java-sdk/issues/255).

**Direct link to this issue**: [Potential data corruption issue with OCI Java SDK on binary data upload with `RefreshableOnNotAuthenticatedProvider`](https://docs.oracle.com/en-us/iaas/Content/knownissues.htm#javaSDKStreamDataCorrupt)

### Program hangs for an indefinite time

If the request to the server hangs for an indefinite time and the program gets stuck, it could be 
because the connection is not released from the Apache connection 
pool. If you're calling APIs that return a binary/stream response, 
please make sure to close all the streams returned from the response to release the connections from the connection pool in case of partial reads. If reading the stream completely, the SDK will 
automatically try to close the stream to release the connection from the connection pool, to disable this feature of auto-closing streams on full read, please call `Options.shouldAutoCloseResponseInputStream(false)`. This is because the SDK for Java supports the Apache Connector for sending requests and managing connections to the service. By default, the Apache Connector supports connection pooling and in the cases where the stream from the response is not closed, the connections don't get released from the connection pool and in turn results in an indefinite wait time. This can be avoided either by closing the streams or switching back to the Jersey default connector, i.e. `HttpUrlConnector`. You can find more information about the same in the OCI Java SDK Troubleshooting section.
 
### Performance issues and switching between connection closing strategies with the Apache Connector
 
The Java SDK supports the Apache Connector as the default. The Apache Connector supports the use of two connection closing strategies - `ApacheConnectionClosingStrategy.GracefulClosingStrategy` and `ApacheConnectionClosingStrategy.ImmediateClosingStrategy`. 
When using `ApacheConnectionClosingStrategy.GracefulClosingStrategy`, streams returned from response are read till the end of the stream when closing the stream. This can introduce additional time when closing the stream with partial read, depending on how large the remaining stream is.
Use `ApacheConnectionClosingStrategy.ImmediateClosingStrategy` for large files with partial reads instead for faster close. One of the disadvantages of using
`ApacheConnectionClosingStrategy.ImmediateClosingStrategy` on the other hand takes longer when using partial read for smaller stream size (< 1MB). Please consider your use-case and change accordingly. For more info please look into : https://github.com/oracle/oci-java-sdk/blob/master/ApacheConnector-README.md. 
 
Note : If both the above Apache Connection closing strategies do not give you optimal results for your use-cases, please consider switching back to Jersey Default `HttpUrlConnectorProvider`.
For more info on Apache Connector, please look into [ApacheConnector-README](https://github.com/oracle/oci-java-sdk/blob/master/ApacheConnector-README.md).

### Errors may suddenly appear after updating to any of these JDK versions: 8u381, 11.0.20, 17.0.8, and 21.0.0.

The following error message might be encountered:
```
java.lang.ClassNotFoundException: com.oracle.bmc.auth.AbstractAuthenticationDetailsProvider
```
This issue is a result of the listed Java versions, which have a default maximum signature file size smaller than some Java SDK JARs.

To resolve this problem, you can run Maven with the following parameter:
`-Djdk.jar.maxSignatureFileSize=16000000`

The low default value in Java will be addressed and resolved in upcoming minor Java version releases.

## License

Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl
or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

See [LICENSE](https://github.com/oracle/oci-java-sdk/blob/master/LICENSE.txt) for more details.
