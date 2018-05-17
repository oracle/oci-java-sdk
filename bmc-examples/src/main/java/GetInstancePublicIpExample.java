/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.GetPublicIpByPrivateIpIdDetails;
import com.oracle.bmc.core.model.PrivateIp;
import com.oracle.bmc.core.model.VnicAttachment;
import com.oracle.bmc.core.requests.GetVnicRequest;
import com.oracle.bmc.core.requests.ListPrivateIpsRequest;
import com.oracle.bmc.core.requests.ListVnicAttachmentsRequest;
import com.oracle.bmc.core.requests.GetPublicIpByPrivateIpIdRequest;
import com.oracle.bmc.core.responses.GetVnicResponse;
import com.oracle.bmc.core.responses.ListVnicAttachmentsResponse;
import com.oracle.bmc.core.responses.GetPublicIpByPrivateIpIdResponse;
import com.oracle.bmc.model.BmcException;

/**
 * This class demonstrates how to retrieve the public IPs for an instance. An instance
 * can have multiple public IP addresses:
 * <ul>
 *  <li>A public IP address directly on the VNIC</li>
 *  <li>Public IP addresses assigned to any secondary private IP on the VNIC</li>
 * </ul>
 */
public class GetInstancePublicIpExample {

    public static void main(String[] args) throws Exception {

        // TODO: Fill in these values
        String instanceId = "SOME OCID";
        String compartmentId = "SOME OCID";

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        ComputeClient computeClient = new ComputeClient(provider);
        VirtualNetworkClient vcnClient = new VirtualNetworkClient(provider);

        computeClient.setRegion(Region.US_PHOENIX_1);
        vcnClient.setRegion(Region.US_PHOENIX_1);

        // Account for multiple VNICs being attached to the instance
        Iterable<VnicAttachment> vnicAttachmentsIterable =
                computeClient
                        .getPaginators()
                        .listVnicAttachmentsRecordIterator(
                                ListVnicAttachmentsRequest.builder()
                                        .compartmentId(compartmentId)
                                        .instanceId(instanceId)
                                        .build());
        List<String> vnicIds = new ArrayList<>();
        for (VnicAttachment va : vnicAttachmentsIterable) {
            vnicIds.add(va.getVnicId());
        }

        final Set<String> publicIps = new HashSet<>();
        for (String vnicId : vnicIds) {
            GetVnicResponse getVnicResponse =
                    vcnClient.getVnic(GetVnicRequest.builder().vnicId(vnicId).build());

            if (getVnicResponse.getVnic().getPublicIp() != null) {
                publicIps.add(getVnicResponse.getVnic().getPublicIp());
            }

            /*
             * Handles the scenario where public IP addresses are assigned to
             * secondary private IPs on the VNIC. First we find all private IPs
             * associated with the VNIC and for each of those try and find the
             * public IP (if any) which has been associated with the private IP
             */
            Iterable<PrivateIp> privateIpsIterable =
                    vcnClient
                            .getPaginators()
                            .listPrivateIpsRecordIterator(
                                    ListPrivateIpsRequest.builder().vnicId(vnicId).build());
            for (PrivateIp privateIp : privateIpsIterable) {
                try {
                    GetPublicIpByPrivateIpIdResponse getPublicIpResponse =
                            vcnClient.getPublicIpByPrivateIpId(
                                    GetPublicIpByPrivateIpIdRequest.builder()
                                            .getPublicIpByPrivateIpIdDetails(
                                                    GetPublicIpByPrivateIpIdDetails.builder()
                                                            .privateIpId(privateIp.getId())
                                                            .build())
                                            .build());
                    publicIps.add(getPublicIpResponse.getPublicIp().getIpAddress());
                } catch (BmcException e) {
                    // A 404 is expected if the private IP address does not have a public IP
                    if (e.getStatusCode() != 404) {
                        System.out.println(
                                String.format(
                                        "Exception when retriving public IP for private IP %s (%s)",
                                        privateIp.getId(),
                                        privateIp.getIpAddress()));
                    } else {
                        System.out.println(
                                String.format(
                                        "No public IP for private IP %s (%s)",
                                        privateIp.getId(),
                                        privateIp.getIpAddress()));
                    }
                }
            }
        }

        for (String publicIp : publicIps) {
            System.out.println(publicIp);
        }

        computeClient.close();
        vcnClient.close();
    }
}
