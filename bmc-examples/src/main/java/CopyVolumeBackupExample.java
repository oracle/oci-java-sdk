/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.BlockstorageClient;
import com.oracle.bmc.core.BlockstorageWaiters;
import com.oracle.bmc.core.model.CopyVolumeBackupDetails;
import com.oracle.bmc.core.model.CreateVolumeBackupDetails;
import com.oracle.bmc.core.model.CreateVolumeDetails;
import com.oracle.bmc.core.model.Volume;
import com.oracle.bmc.core.model.VolumeBackup;
import com.oracle.bmc.core.requests.CopyVolumeBackupRequest;
import com.oracle.bmc.core.requests.CreateVolumeBackupRequest;
import com.oracle.bmc.core.requests.CreateVolumeRequest;
import com.oracle.bmc.core.requests.GetVolumeBackupRequest;
import com.oracle.bmc.core.requests.GetVolumeRequest;
import com.oracle.bmc.core.responses.CopyVolumeBackupResponse;
import com.oracle.bmc.core.responses.CreateVolumeBackupResponse;
import com.oracle.bmc.core.responses.CreateVolumeResponse;
import com.oracle.bmc.core.responses.GetVolumeBackupResponse;
import com.oracle.bmc.core.responses.GetVolumeResponse;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

import java.util.List;

public class CopyVolumeBackupExample {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects two arguments: a compartment OCID, the volume display name.");
        }

        final String compartmentId = args[0];
        final String volumeDisplayName = args[1];

        String srcRegionConfigurationFilePath = "~/.oci/config";
        String destRegionConfigurationFilePath = "~/.oci/destConfig";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider srcRegionProvider =
                new ConfigFileAuthenticationDetailsProvider(
                        srcRegionConfigurationFilePath, profile);
        AuthenticationDetailsProvider destRegionProvider =
                new ConfigFileAuthenticationDetailsProvider(
                        destRegionConfigurationFilePath, profile);

        BlockstorageClient srcRegionBlockstorageClient = new BlockstorageClient(srcRegionProvider);
        BlockstorageClient destRegionBlockstorageClient =
                new BlockstorageClient(destRegionProvider);

        srcRegionBlockstorageClient.setRegion(Region.US_PHOENIX_1);
        destRegionBlockstorageClient.setRegion(Region.US_ASHBURN_1);

        // TODO: For this example we're just using the first AD returned.
        // You'll probably want different logic around which AD to use
        List<AvailabilityDomain> availabilityDomains =
                getAvailabilityDomains(srcRegionProvider, compartmentId, Region.US_PHOENIX_1);
        AvailabilityDomain adToUse = availabilityDomains.get(0);

        Volume volume =
                createVolume(
                        srcRegionBlockstorageClient,
                        compartmentId,
                        volumeDisplayName,
                        adToUse.getName());

        System.out.println("Volume is provisioning...");

        volume = waitForVolumeCreateToComplete(srcRegionBlockstorageClient, volume.getId());

        System.out.println("volume is provisioned:");
        System.out.println(volume);

        System.out.println("Creating backup in the source region...");

        VolumeBackup volumeBackup = createVolumeBackup(srcRegionBlockstorageClient, volume.getId());

        System.out.println("VolumeBackup is being created...");

        volumeBackup =
                waitForVolumeBackupToComplete(srcRegionBlockstorageClient, volumeBackup.getId());

        System.out.println("volumeBackup is created.");
        System.out.println(volumeBackup);

        System.out.println("Copying backup to the destination region...");

        VolumeBackup copiedBackup =
                copyVolumeBackup(
                        srcRegionBlockstorageClient,
                        volumeBackup.getId(),
                        Region.US_ASHBURN_1.getRegionId());

        System.out.println("VolumeBackup is being copied...");

        volumeBackup =
                waitForVolumeBackupToComplete(destRegionBlockstorageClient, copiedBackup.getId());

        System.out.println("volumeBackup is copied.");
        System.out.println(copiedBackup);

        srcRegionBlockstorageClient.close();
        destRegionBlockstorageClient.close();
    }

    public static Volume createVolume(
            BlockstorageClient blockstorageClient,
            String compartmentId,
            String volumeName,
            String availabilityDomain) {

        CreateVolumeResponse response =
                blockstorageClient.createVolume(
                        CreateVolumeRequest.builder()
                                .createVolumeDetails(
                                        CreateVolumeDetails.builder()
                                                .compartmentId(compartmentId)
                                                .displayName(volumeName)
                                                .availabilityDomain(availabilityDomain)
                                                .build())
                                .build());

        return response.getVolume();
    }

    public static Volume waitForVolumeCreateToComplete(
            BlockstorageClient blockstorageClient, String volumeId) throws Exception {

        BlockstorageWaiters waiter = blockstorageClient.getWaiters();
        GetVolumeResponse response =
                waiter.forVolume(
                                GetVolumeRequest.builder().volumeId(volumeId).build(),
                                Volume.LifecycleState.Available)
                        .execute();

        return response.getVolume();
    }

    public static VolumeBackup createVolumeBackup(
            BlockstorageClient blockstorageClient, String volumeId) {

        CreateVolumeBackupResponse response =
                blockstorageClient.createVolumeBackup(
                        CreateVolumeBackupRequest.builder()
                                .createVolumeBackupDetails(
                                        CreateVolumeBackupDetails.builder()
                                                .volumeId(volumeId)
                                                .build())
                                .build());

        return response.getVolumeBackup();
    }

    public static VolumeBackup waitForVolumeBackupToComplete(
            BlockstorageClient blockstorageClient, String volumeBackupId) throws Exception {

        BlockstorageWaiters waiter = blockstorageClient.getWaiters();
        GetVolumeBackupResponse response =
                waiter.forVolumeBackup(
                                GetVolumeBackupRequest.builder()
                                        .volumeBackupId(volumeBackupId)
                                        .build(),
                                VolumeBackup.LifecycleState.Available)
                        .execute();

        return response.getVolumeBackup();
    }

    public static VolumeBackup copyVolumeBackup(
            BlockstorageClient blockstorageClient,
            String volumeBackupId,
            String destinationRegion) {

        CopyVolumeBackupResponse response =
                blockstorageClient.copyVolumeBackup(
                        CopyVolumeBackupRequest.builder()
                                .copyVolumeBackupDetails(
                                        CopyVolumeBackupDetails.builder()
                                                .destinationRegion(destinationRegion)
                                                .build())
                                .volumeBackupId(volumeBackupId)
                                .build());

        return response.getVolumeBackup();
    }

    public static List<AvailabilityDomain> getAvailabilityDomains(
            AuthenticationDetailsProvider provider, String compartmentId, Region region)
            throws Exception {

        Identity identityClient = new IdentityClient(provider);
        identityClient.setRegion(region);

        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        identityClient.close();

        return listAvailabilityDomainsResponse.getItems();
    }
}
