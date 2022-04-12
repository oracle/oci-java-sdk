/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import lombok.Getter;

/**
 * Class representing details of the service
 */
public class ServiceDetails {
    @Getter private static String serviceName;
    @Getter private static String operationName;
    @Getter private static String requestEndpoint;
    @Getter private static String apiReferenceLink;

    private static ServiceDetails serviceDetails;

    public static void setServiceDetails(
            String serviceName,
            String operationName,
            String requestEndpoint,
            String apiReferenceLink) {
        serviceDetails =
                new ServiceDetails(serviceName, operationName, requestEndpoint, apiReferenceLink);
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
}
