/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp;

import com.oracle.bmc.ocvp.requests.*;
import com.oracle.bmc.ocvp.responses.*;

/**
 * Use this API to manage your [Oracle Cloud VMware Solution](https://docs.cloud.oracle.com/iaas/Content/VMware/Concepts/ocvsoverview.htm).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public interface Sddc extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the service.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this Region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Moves an SDDC into a different compartment within the same tenancy. For information
     * about moving resources between compartments, see
     * [Moving Resources to a Different Compartment](https://docs.cloud.oracle.com/iaas/Content/Identity/Tasks/managingcompartments.htm#moveRes).
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/ChangeSddcCompartmentExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ChangeSddcCompartment API.
     */
    ChangeSddcCompartmentResponse changeSddcCompartment(ChangeSddcCompartmentRequest request);

    /**
     * Creates an Oracle Cloud VMware Solution software-defined data center (SDDC).
     * <p>
     * Use the {@link WorkRequest} operations to track the
     * creation of the SDDC.
     * <p>
     **Important:** You must configure the SDDC's networking resources with the security rules detailed in [Security Rules for Oracle Cloud VMware Solution SDDCs](https://docs.cloud.oracle.com/iaas/Content/VMware/Reference/ocvssecurityrules.htm). Otherwise, provisioning the SDDC will fail. The rules are based on the requirements set by VMware.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/CreateSddcExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use CreateSddc API.
     */
    CreateSddcResponse createSddc(CreateSddcRequest request);

    /**
     * Deletes the specified SDDC, along with the other resources that were
     * created with the SDDC. For example: the Compute instances, DNS records,
     * and so on.
     * <p>
     * Use the {@link WorkRequest} operations to track the
     * deletion of the SDDC.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/DeleteSddcExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use DeleteSddc API.
     */
    DeleteSddcResponse deleteSddc(DeleteSddcRequest request);

    /**
     * Gets the specified SDDC's information.
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/GetSddcExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use GetSddc API.
     */
    GetSddcResponse getSddc(GetSddcRequest request);

    /**
     * Lists the SDDCs in the specified compartment. The list can be
     * filtered by display name or availability domain.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/ListSddcsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSddcs API.
     */
    ListSddcsResponse listSddcs(ListSddcsRequest request);

    /**
     * Lists the versions of bundled VMware software supported by the Oracle Cloud
     * VMware Solution.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/ListSupportedVmwareSoftwareVersionsExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use ListSupportedVmwareSoftwareVersions API.
     */
    ListSupportedVmwareSoftwareVersionsResponse listSupportedVmwareSoftwareVersions(
            ListSupportedVmwareSoftwareVersionsRequest request);

    /**
     * Updates the specified SDDC.
     * <p>
     **Important:** Updating an SDDC affects only certain attributes in the `Sddc`
     * object and does not affect the VMware environment currently running in
     * the SDDC. For more information, see
     * {@link #updateSddcDetails(UpdateSddcDetailsRequest) updateSddcDetails}.
     *
     * @param request The request object containing the details to send
     * @return A response object containing details about the completed operation
     * @throws BmcException when an error occurs.
     *
     * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/UpdateSddcExample.java.html" target="_blank" rel="noopener noreferrer" >here</a> to see how to use UpdateSddc API.
     */
    UpdateSddcResponse updateSddc(UpdateSddcRequest request);

    /**
     * Gets the pre-configured waiters available for resources for this service.
     *
     * @return The service waiters.
     */
    SddcWaiters getWaiters();

    /**
     * Gets the pre-configured paginators available for list operations in this service which may return multiple
     * pages of data. These paginators provide an {@link java.lang.Iterable} interface so that service responses, or
     * resources/records, can be iterated through without having to manually deal with pagination and page tokens.
     *
     * @return The service paginators.
     */
    SddcPaginators getPaginators();
}
