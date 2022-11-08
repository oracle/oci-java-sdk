# Oracle Cloud Infrastructure SDK for Java
[![ReleasePublished](https://github.com/oracle/oci-java-sdk/actions/workflows/releasepublished.yml/badge.svg?branch=master)](https://github.com/oracle/oci-java-sdk/actions/workflows/releasepublished.yml)

## About

oci-java-sdk provides an SDK for Java that you can use to manage your Oracle Cloud Infrastructure resources.

The project is open source and maintained by Oracle Corp. The home page for the project is [here](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm).

The OCI Java SDK versions `1.x.y` and `2.x.y` are now referred as OCI Legacy Java SDK. Any updates or bug fixes related to OCI Legacy Java SDK can be found in [legacy/v2/master branch](https://github.com/oracle/oci-java-sdk/tree/legacy/v2/master). Please refer [README.md](https://github.com/oracle/oci-java-sdk/blob/legacy/v2/master/README.md) to learn more about these legacy versions.

This Github repository will refer to OCI Java SDK version `3.x.y` by default where support for new features and services will be added.


## Documentation

Full documentation, including prerequisites, installation, supported JDK versions and configuration instructions, is available [here](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm).

API reference can be found [here](https://docs.cloud.oracle.com/iaas/tools/java/latest/).

## Installation

For basic set up, see [Getting Started](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdkgettingstarted.htm).

For details on compatibility, advanced configurations, and add-ons, see [Configuration](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdkconfig.htm).

- *Circuit Breaker*: By default, circuit breaker feature is enabled, if it is not expected, please explicitly set the environment variable:
```
export OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED=FALSE
```

## Changes Introduced In OCI Java SDK `3.x.y`
### Removed dependencies on the following third-party libraries:
1. Guava: Guava types have been replaced with JDK types:
- `com.google.common.base.Optional` has been replaced with `java.util.Optional`
- `com.google.common.base.Function` has been replaced with `java.util.function.Function`
- `com.google.common.base.Predicate` has been replaced with `java.util.function.Predicate`
- `com.google.common.base.Supplier` has been replaced with `java.util.function.Supplier`

### HTTP client library is pluggable
There is no HTTP client library configured by default. The OCI Java SDK offers the following two choices for HTTP client libraries to choose from.
- Jakarta EE 8/Jersey 2 - [bmc-common-httpclient-jersey](https://github.com/oracle/oci-java-sdk/tree/master/bmc-common-httpclient-choices/bmc-common-httpclient-jersey)
- Jakarta EE 9/Jersey 3 - [bmc-common-httpclient-jersey3](https://github.com/oracle/oci-java-sdk/tree/master/bmc-common-httpclient-choices/bmc-common-httpclient-jersey3)

## Examples

### Example for Jersey 2 as HTTP client library (OCI Java SDK `3.x.y`)
In order to use Jersey 2 as HTTP client library, a dependency on `oci-java-sdk-common-httpclient-jersey` needs to be explicitly declared in application's `pom.xml`. Please refer [bmc-jersey-examples/pom.xml](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey-examples/pom.xml)

Examples for Jersey 2 as HTTP client library can be found in [bmc-other-examples/bmc-jersey-examples](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey-examples)

### Example for Jersey 3 as HTTP client library (OCI Java SDK `3.x.y`)
In order to use Jersey 3 as HTTP client library, a dependency on `oci-java-sdk-common-httpclient-jersey3` needs to be explicitly declared in application's `pom.xml`. Please refer [bmc-jersey3-examples/pom.xml](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey3-examples/pom.xml)

Examples for Jersey 3 as HTTP client library can be found in [bmc-other-examples/bmc-jersey3-examples](https://github.com/oracle/oci-java-sdk/blob/master/bmc-other-examples/bmc-jersey3-examples)

### Example for OCI Legacy Java SDK (OCI Java SDK `1.x.y` and `2.x.y`)
Examples for OCI Legacy Java SDK can be found [here](https://github.com/oracle/oci-java-sdk/tree/legacy/v2/master#examples).

## Help

For details on contributions, questions, or feedback, see [Contact Us](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm#ContactUs).

## Changes

See [CHANGELOG](https://github.com/oracle/oci-java-sdk/blob/master/CHANGELOG.md).

## Contributing

oci-java-sdk is an open source project. See [CONTRIBUTING](https://github.com/oracle/oci-java-sdk/blob/master/CONTRIBUTING.md) for details.

Oracle gratefully acknowledges the contributions to oci-java-sdk that have been made by the community.

## Known Issues

You can find information on any known issues with the SDK [here](https://docs.cloud.oracle.com/iaas/Content/knownissues.htm) and under the [“Issues” tab of this GitHub repository](https://github.com/oracle/oci-java-sdk/issues).

To learn about known issues with OCI Legacy Java SDK, please refer [Known Issues in OCI Legacy Java SDK](https://github.com/oracle/oci-java-sdk/blob/legacy/v2/master/README.md#known-issues)

### Potential data corruption issue with OCI Java SDK on binary data upload with `RefreshableOnNotAuthenticatedProvider`

**Details**: When using version 1.25.1 or earlier of the OCI Java SDK clients that upload streams of data (for example `ObjectStorageClient` or `FunctionsInvokeClient`), either synchronously and asynchronously, and you use a `RefreshableOnNotAuthenticatedProvider` (for example, for Resource Principals or Instance Principals) you may be affected by **silent data corruption**.

**Workaround**: Update the OCI Java SDK client to version 1.25.2 or later. For more information about this issue and workarounds, see [Potential data corruption issue for OCI Java SDK on binary data upload with `RefreshableOnNotAuthenticatedProvider`](https://github.com/oracle/oci-java-sdk/issues/255).

**Direct link to this issue**: [Potential data corruption issue with OCI Java SDK on binary data upload with `RefreshableOnNotAuthenticatedProvider`](https://docs.cloud.oracle.com/en-us/iaas/Content/knownissues.htm#javaSDKStreamDataCorrupt)

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

## License

Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl
or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

See [LICENSE](https://github.com/oracle/oci-java-sdk/blob/master/LICENSE.txt) for more details.
