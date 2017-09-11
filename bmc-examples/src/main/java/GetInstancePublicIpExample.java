/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.List;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.VnicAttachment;
import com.oracle.bmc.core.requests.GetVnicRequest;
import com.oracle.bmc.core.requests.ListVnicAttachmentsRequest;
import com.oracle.bmc.core.responses.GetVnicResponse;
import com.oracle.bmc.core.responses.ListVnicAttachmentsResponse;

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

        // for the instance, list its vnic attachments
        ListVnicAttachmentsResponse listVnicResponse =
                computeClient.listVnicAttachments(
                        ListVnicAttachmentsRequest.builder()
                                .compartmentId(compartmentId)
                                .instanceId(instanceId)
                                .build());

        // for each vnic attachment, get the vnic details from the virtualNetwork API
        List<VnicAttachment> vnics = listVnicResponse.getItems();
        for (int i = 0; i < vnics.size(); i++) {

            String vnicId = vnics.get(i).getVnicId();

            GetVnicResponse getVnicResponse =
                    vcnClient.getVnic(GetVnicRequest.builder().vnicId(vnicId).build());

            // then check the vnic for a public IP
            String publicIp = getVnicResponse.getVnic().getPublicIp();
            if (publicIp != null) {
                System.out.println(publicIp);
            }
        }

        computeClient.close();
        vcnClient.close();
    }
}
