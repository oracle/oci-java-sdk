/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package shared;

import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;

/**
 * This class provides several utility functions for basic interactions with the VCN service. These functions
 * may be referenced by multiple examples in order to keep example files focused on the behavior being showcased.
 */
public final class ExampleVcnHelper {

    /**
     * Creates a VCN and waits for it to become available to use.
     *
     * @param vcnClient  the client used to communicate with the service
     * @param vcnDetails CreateVcnDetails containing parameters used to create the VCN
     * @return the created VCN
     * @throws Exception if an error is thrown while waiting for VCN to become available
     */
    public static Vcn createVcn(VirtualNetworkClient vcnClient, CreateVcnDetails vcnDetails)
            throws Exception {
        CreateVcnResponse createVcnResponse =
                vcnClient.createVcn(
                        CreateVcnRequest.builder().createVcnDetails(vcnDetails).build());

        GetVcnResponse getVcnResponse =
                vcnClient
                        .getWaiters()
                        .forVcn(
                                GetVcnRequest.builder()
                                        .vcnId(createVcnResponse.getVcn().getId())
                                        .build(),
                                Vcn.LifecycleState.Available)
                        .execute();

        Vcn vcn = getVcnResponse.getVcn();
        System.out.println(String.format("Created vcn %s", vcn.getId()));
        return vcn;
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the client used to communicate with the service
     * @param vcnId     the VCN OCID to delete
     * @throws Exception if an error is thrown while waiting for the VCN to be deleted
     */
    public static void deleteVcn(VirtualNetworkClient vcnClient, String vcnId) throws Exception {

        vcnClient.deleteVcn(DeleteVcnRequest.builder().vcnId(vcnId).build());
        vcnClient
                .getWaiters()
                .forVcn(GetVcnRequest.builder().vcnId(vcnId).build(), Vcn.LifecycleState.Terminated)
                .execute();
        System.out.println(String.format("Deleted VCN %s", vcnId));
    }

    /**
     * Creates a subnet in a VCN and waits for the subnet to become available to use.
     *
     * @param vcnClient     the client used to communicate with the service
     * @param subnetDetails CreateSubnetDetails containing parameters used to create the subnet
     * @return the created subnet
     * @throws Exception if an error is thrown while waiting for subnet to become available
     */
    public static Subnet createSubnet(
            VirtualNetworkClient vcnClient, CreateSubnetDetails subnetDetails) throws Exception {

        CreateSubnetResponse createSubnetResponse =
                vcnClient.createSubnet(
                        CreateSubnetRequest.builder().createSubnetDetails(subnetDetails).build());

        GetSubnetResponse getSubnetResponse =
                vcnClient
                        .getWaiters()
                        .forSubnet(
                                GetSubnetRequest.builder()
                                        .subnetId(createSubnetResponse.getSubnet().getId())
                                        .build(),
                                Subnet.LifecycleState.Available)
                        .execute();

        Subnet subnet = getSubnetResponse.getSubnet();
        System.out.println(String.format("Created subnet %s", subnet.getId()));
        return subnet;
    }

    /**
     * Deletes a subnet and waits for it to be deleted.
     *
     * @param vcnClient the client used to communicate with the service
     * @param subnetId  the subnet OCID to delete
     * @throws Exception if an error is thrown while waiting for the subnet to be deleted
     */
    public static void deleteSubnet(VirtualNetworkClient vcnClient, String subnetId)
            throws Exception {

        vcnClient.deleteSubnet(DeleteSubnetRequest.builder().subnetId(subnetId).build());

        vcnClient
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(subnetId).build(),
                        Subnet.LifecycleState.Terminated)
                .execute();
        System.out.println(String.format("Deleted subnet %s", subnetId));
    }
}
