/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import org.slf4j.Logger;

/**
 * Class representing details of the service
 */
public class ServiceDetails {
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(ServiceDetails.class);

    private final String serviceName;
    private final String operationName;
    private final String requestEndpoint;
    private final String apiReferenceLink;

    public static final ServiceDetails UNKNOWN_SERVICE_DETAILS =
            new ServiceDetails(
                    "Unknown service",
                    "Unknown operation",
                    "Unknown request endpoint",
                    "Unknown API reference link");

    @Deprecated
    public static void setServiceDetails(
            String serviceName,
            String operationName,
            String requestEndpoint,
            String apiReferenceLink) {
        LOG.warn(
                "The static method ServiceDetails.setServiceDetails() is no longer supported. "
                        + "Please upgrade the SDK version to the latest");
    }

    public ServiceDetails(
            String serviceName,
            String operationName,
            String requestEndpoint,
            String apiReferenceLink) {
        this.serviceName = serviceName;
        this.operationName = operationName;
        this.requestEndpoint = requestEndpoint;
        this.apiReferenceLink = apiReferenceLink;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getOperationName() {
        return this.operationName;
    }

    public String getRequestEndpoint() {
        return this.requestEndpoint;
    }

    public String getApiReferenceLink() {
        return this.apiReferenceLink;
    }
}
