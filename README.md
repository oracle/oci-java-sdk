# Oracle Cloud Infrastructure SDK for Java
[![Build Status](https://travis-ci.org/oracle/oci-java-sdk.svg?branch=master)](https://travis-ci.org/oracle/oci-java-sdk)

## About

oci-java-sdk provides an SDK for Java that you can use to manage your Oracle Cloud Infrastructure resources.

The project is open source and maintained by Oracle Corp. The home page for the project is [here](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm).

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

## Examples

Examples can be found [here](/bmc-examples/src/main/java/).

Please compile the `bmc-examples` module before running any example, specially if it is your first time working with the examples. Failure to do so can lead to exception like `ClassNotFoundException`. You can compile the source code of the examples as below:
```
cd bmc-examples/
mvn compile
```

You may run any example by invoking the `exec:java` goal and passing appropriate values for `exec.mainClass` and `.exec.arguments` properties,
for example: `ObjectStorageGetBucketExample` class requires 3 arguments which are OCID of the compartment, name of bucket, name of object. This example class can be executed as follows:
```
mvn -am -pl bmc-examples exec:java -Dexec.mainClass=ObjectStorageGetBucketExample \
  -Dexec.arguments=compartment_ocid,bucket_name,object_name
```
You can also compile and run the example at the same time by doing the following:
```
mvn clean compile -am -pl bmc-examples exec:java -Dexec.mainClass=ObjectStorageGetBucketExample \
  -Dexec.arguments=compartment_ocid,bucket_name,object_name
```

Where `compartment_id`, `bucket_name`, and `object_name` should be substituted with appropriate values according to your setup.

## Help

For details on contributions, questions, or feedback, see [Contact Us](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm#ContactUs).

## Changes

See [CHANGELOG](/CHANGELOG.md).

## Contributing

oci-java-sdk is an open source project. See [CONTRIBUTING](/CONTRIBUTING.md) for details.

Oracle gratefully acknowledges the contributions to oci-java-sdk that have been made by the community.

## Known Issues

You can find information on any known issues with the SDK [here](https://docs.cloud.oracle.com/iaas/Content/knownissues.htm) and under the [“Issues” tab of this GitHub repository](https://github.com/oracle/oci-java-sdk/issues).

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
For more info on Apache Connector, please look into ApacheConnector-README.

### OCI Java SDK shows incorrect service details while displaying the logs for BmcException

OCI Java SDK displays wrong service details when a BmcException is thrown. For example, exception generated from service A could see information about service B. This behavior can be seen in versions `2.23.0` to `2.34.0` making it thread unsafe. Please update to version `2.35.0` which has the fix for this issue.
 
You can find information on any known issues with the SDK [here](https://docs.cloud.oracle.com/iaas/Content/knownissues.htm) and under the “Issues” tab of this GitHub repository.

## License

Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl
or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

See [LICENSE](/LICENSE.txt) for more details.
