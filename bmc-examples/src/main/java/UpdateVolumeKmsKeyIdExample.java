/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.Blockstorage;
import com.oracle.bmc.core.BlockstorageClient;
import com.oracle.bmc.core.BlockstorageWaiters;
import com.oracle.bmc.core.model.CreateVolumeDetails;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.UpdateVolumeKmsKeyDetails;
import com.oracle.bmc.core.model.Volume;
import com.oracle.bmc.core.requests.CreateVolumeRequest;
import com.oracle.bmc.core.requests.DeleteVolumeKmsKeyRequest;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.GetVolumeRequest;
import com.oracle.bmc.core.requests.UpdateVolumeKmsKeyRequest;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.core.responses.GetVolumeResponse;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

import java.io.IOException;
import java.util.List;

/**
 * This example will demo how to use CRUD API to manipulate volume's KMS key.
 * It will do follow things:
 * 1) Create a volume with Oracle default encryption key.
 * 2) User provide their own kms key to protect the volume.
 * 3) User delete kms key and use default encryption key to protect the volume.
 */
public class UpdateVolumeKmsKeyIdExample {
    public static void main(String[] args) throws Exception {

        // TODO: Fill in these values
        String compartmentId = "A valid compartment OCID";
        String blockStorageDisplayName = "blockStorageDisplayName";
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // When an instance is created, a boot volume is created at the same time. User could choose to use their own kms key to encrypt the data.
        // fill out necessary kms key information to use your own key to protect kms.  More information of volume security please refer to https://cloud.oracle.com/storage/block-volume/faq
        String kmsKeyId = "SOME VALID KEY OCID";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        BlockstorageClient client = new BlockstorageClient(provider);

        // TODO: For this example we're just using the first AD returned.
        // You'll probably want different logic around which AD to use
        List<AvailabilityDomain> availabilityDomains =
                getAvailabilityDomains(provider, compartmentId);
        AvailabilityDomain adToUse = availabilityDomains.get(1);

        CreateVolumeDetails createVolumeDetails =
                CreateVolumeDetails.builder()
                        .availabilityDomain(adToUse.getName())
                        .displayName(blockStorageDisplayName)
                        .compartmentId(compartmentId)
                        .build();
        CreateVolumeRequest createVolumeRequest =
                CreateVolumeRequest.builder().createVolumeDetails(createVolumeDetails).build();
        System.out.println("started to create volume.");
        Volume volume = client.createVolume(createVolumeRequest).getVolume();

        System.out.println("checking if the volume is ready.");
        BlockstorageWaiters waiter = client.getWaiters();
        GetVolumeResponse response =
                waiter.forVolume(
                                GetVolumeRequest.builder().volumeId(volume.getId()).build(),
                                Volume.LifecycleState.Available)
                        .execute();

        System.out.println("volume is ready.");

        UpdateVolumeKmsKeyDetails updateVolumeKmsKeyDetails =
                UpdateVolumeKmsKeyDetails.builder().kmsKeyId(kmsKeyId).build();

        UpdateVolumeKmsKeyRequest updateVolumeKmsKeyRequest =
                UpdateVolumeKmsKeyRequest.builder()
                        .updateVolumeKmsKeyDetails(updateVolumeKmsKeyDetails)
                        .volumeId(volume.getId())
                        .build();

        System.out.println("started to update volume kms key.");
        client.updateVolumeKmsKey(updateVolumeKmsKeyRequest);
        System.out.println("checking if the volume is ready.");
        // Data will remain the same, but now protected by the new key. Old key (if any) could be removed safely if the volume is marked as ready and if is ONLY used to protect this volume.

        GetVolumeResponse updateKeyResponse =
                waiter.forVolume(
                                GetVolumeRequest.builder().volumeId(volume.getId()).build(),
                                Volume.LifecycleState.Available)
                        .execute();

        System.out.println(
                "Finished updating volume kms key. Now the kms key is :"
                        + updateKeyResponse.getVolume().getKmsKeyId());

        System.out.println("started to delete volume kms key.");

        DeleteVolumeKmsKeyRequest deleteVolumeKmsKeyRequest =
                DeleteVolumeKmsKeyRequest.builder().volumeId(volume.getId()).build();
        client.deleteVolumeKmsKey(deleteVolumeKmsKeyRequest);
        System.out.println("checking if the volume is ready.");
        GetVolumeResponse deleteKeyResponse =
                waiter.forVolume(
                                GetVolumeRequest.builder().volumeId(volume.getId()).build(),
                                Volume.LifecycleState.Available)
                        .execute();

        System.out.println(
                "Finished updating volume kms key. Now the kms key is :"
                        + deleteKeyResponse.getVolume().getKmsKeyId());

        System.out.println("This is the example for update/delete volume's kms key.");

        client.close();
    }

    private static List<AvailabilityDomain> getAvailabilityDomains(
            AuthenticationDetailsProvider provider, String compartmentId) throws Exception {

        Identity identityClient = new IdentityClient(provider);
        identityClient.setRegion(Region.US_ASHBURN_1);

        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        identityClient.close();

        return listAvailabilityDomainsResponse.getItems();
    }
}
