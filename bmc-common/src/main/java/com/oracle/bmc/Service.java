/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

/**
 * Interface representing a service definition.
 *
 * <p>See {@link Services} to create new instances.
 */
@InternalSdk
public interface Service {

    /** The unique service name, ex "BLOCKSTORAGE". Must not be null. */
    String getServiceName();

    /**
     * The service endpoint prefix that will be used, ex "iaas" for
     * "https://iaas.us-phoenix-1.oraclecloud.com".
     */
    String getServiceEndpointPrefix();

    /**
     * The service endpoint template that will be used, ex
     * "{serviceEndpointPrefix}.{region}.service.oci.oraclecloud.com".
     *
     * <p>This overrides the template used in {@link DefaultEndpointConfiguration}, but can still
     * use the same variables.
     */
    String getServiceEndpointTemplate();

    /**
     * The service endpoint name that will be used only for dotted regions if set by the service.
     * {service} in "https://{service}.{region}". The service endpoint template (if specified) will
     * be ignored in this case.
     */
    String getEndpointServiceName();
}
