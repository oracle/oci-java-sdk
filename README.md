# Oracle Cloud Infrastructure SDK for Java
[![Build Status](https://travis-ci.org/oracle/oci-java-sdk.svg?branch=master)](https://travis-ci.org/oracle/oci-java-sdk)

## About

oci-java-sdk provides an SDK for Java that you can use to manage your Oracle Cloud Infrastructure resources.

The project is open source and maintained by Oracle Corp. The home page for the project is [here](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm).

## Installation

For basic set up, see [Getting Started](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdkgettingstarted.htm).

For details on compatibility, advanced configurations, and add-ons, see [Configuration](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdkconfig.htm).

## Examples

Examples can be found [here](/bmc-examples/src/main/java/).

You may run any example by invoking the `exec:java` goal and passing appropriate values for `exec.mainClass` and `.exec.arguments` properties, such as it's the case 
for the `ObjectStorageGetBucketExample` class that requires 3 arguments: OCID of the compartment, name of bucket, name of object.

```
mvn -am -pl bmc-examples exec:java -Dexec.mainClass=ObjectStorageGetBucketExample \
  -Dexec.arguments=compartment_ocid,bucket_name,object_name
```

Where `compartment_id`, `bucket_name`, and `object_name` should be substituted with appropriate values according to your setup.

## Documentation

Full documentation, including prerequisites, installation, and configuration instructions, is available [here](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm).

API reference can be found [here](https://docs.cloud.oracle.com/iaas/tools/java/latest/).

## Help

For details on contributions, questions, or feedback, see [Contact Us](https://docs.cloud.oracle.com/iaas/Content/API/SDKDocs/javasdk.htm#ContactUs).

## Changes

See [CHANGELOG](/CHANGELOG.md).

## Contributing

oci-java-sdk is an open source project. See [CONTRIBUTING](/CONTRIBUTING.md) for details.

Oracle gratefully acknowledges the contributions to oci-java-sdk that have been made by the community.

## Known Issues

You can find information on any known issues with the SDK [here](https://docs.cloud.oracle.com/iaas/Content/knownissues.htm) and under the “Issues” tab of this GitHub repository.

## License

Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl
or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

See [LICENSE](/LICENSE.txt) for more details.
