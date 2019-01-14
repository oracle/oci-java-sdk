/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import java.util.List;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.BlockstorageClient;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.AttachIScsiVolumeDetails;
import com.oracle.bmc.core.model.Device;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.model.Volume;
import com.oracle.bmc.core.model.VolumeAttachment;
import com.oracle.bmc.core.requests.ListInstanceDevicesRequest;
import com.oracle.bmc.core.responses.ListInstanceDevicesResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;

/**
 * This class provides an example of creating an attachment using device attribute. Device is an optional field
 * that user can provide to make sure that attachments don't change names in case of reboots, thereby providing
 * consistent volume naming.
 * In this particular example, we are attaching a volume to an instance using the device attribute and making sure
 * that the API succeeds.
 * After attaching the volume to an instance, we are calling the API to list instance devices corresponding to the
 * instance which are available.
 */
public class VolumeAttachmentWithDeviceExample extends VolumeAttachmentExample {
    private static final String VOL_DEVICE_DISPLAY_NAME = "VolumeAttachWithDeviceExample";

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects the arguments of the compartment OCID");
        }

        final String compartmentId = args[0];
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);
        final BlockstorageClient blockStorageClient = new BlockstorageClient(provider);
        final ComputeClient computeClient = new ComputeClient(provider);
        final VirtualNetworkClient vcnClient = new VirtualNetworkClient(provider);
        final IdentityClient identityClient = new IdentityClient(provider);

        blockStorageClient.setRegion(Region.US_PHOENIX_1);
        computeClient.setRegion(Region.US_PHOENIX_1);
        vcnClient.setRegion(Region.US_PHOENIX_1);
        identityClient.setRegion(Region.US_PHOENIX_1);

        Vcn vcn = null;
        Subnet subnet = null;
        Volume volume = null;
        Instance instance = null;
        try {
            final List<AvailabilityDomain> availabilityDomains =
                    getAvailabilityDomains(identityClient, compartmentId);
            final AvailabilityDomain adToUse = availabilityDomains.get(0);

            // A VCN and subnet is required to create a mount target
            vcn = createVcn(vcnClient, compartmentId);
            subnet = createSubnet(vcnClient, compartmentId, adToUse, vcn.getId());
            System.out.println("Created VCN and subnet");
            System.out.println();

            instance = launchInstance(computeClient, subnet, compartmentId, INSTANCE_DISPLAY_NAME);
            System.out.println("Launched instance");
            System.out.println();

            volume =
                    createVolume(
                            blockStorageClient,
                            compartmentId,
                            adToUse,
                            null,
                            VOL_DEVICE_DISPLAY_NAME);

            VolumeAttachment iscsiVolumeAttachmentWithDevice =
                    attachIscsiVolumeAttachment(
                            computeClient, volume, instance, "/dev/oracleoci/oraclevdd");

            // Note here that in the returned results, each record is actually a subtype of VolumeAttachment corresponding to what type was specified when attaching
            listVolumeAttachmentsOnInstance(computeClient, instance);

            System.out.println(
                    "List the available instance device for instanceId:" + instance.getId());
            List<Device> devicePaths = listInstanceDevices(computeClient, instance.getId());
            for (Device devicePath : devicePaths) {
                System.out.println(
                        "Device Path:"
                                + devicePath.getName()
                                + ",IsAvailable:"
                                + devicePath.getIsAvailable());
            }

            if (iscsiVolumeAttachmentWithDevice != null) {
                detachVolume(computeClient, iscsiVolumeAttachmentWithDevice);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            System.out.println("Clean Up");
            System.out.println("==========");

            if (volume != null) {
                deleteVolume(blockStorageClient, volume);
                System.out.println("Deleted volume related to device");
            }

            if (instance != null) {
                terminateInstance(computeClient, instance);
                System.out.println("Terminated instance");
            }

            if (subnet != null) {
                deleteSubnet(vcnClient, subnet);
                System.out.println("Deleted subnet");
            }

            if (vcn != null) {
                deleteVcn(vcnClient, vcn);
                System.out.println("Deleted VCN");
            }

            blockStorageClient.close();
            computeClient.close();
            vcnClient.close();
            identityClient.close();
        }
    }

    private static VolumeAttachment attachIscsiVolumeAttachment(
            final ComputeClient computeClient,
            final Volume volume,
            final Instance instance,
            final String device)
            throws Exception {

        return attachVolume(
                computeClient,
                AttachIScsiVolumeDetails.builder()
                        .volumeId(volume.getId())
                        .instanceId(instance.getId())
                        .device(device)
                        .build());
    }

    private static List<Device> listInstanceDevices(
            final ComputeClient computeClient, final String instanceId) throws Exception {
        ListInstanceDevicesResponse response =
                computeClient.listInstanceDevices(
                        ListInstanceDevicesRequest.builder().instanceId(instanceId).build());
        return response.getItems();
    }
}
