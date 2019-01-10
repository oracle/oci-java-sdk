/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.BlockstorageClient;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.AttachParavirtualizedVolumeDetails;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.InstanceSourceViaImageDetails;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.model.Volume;
import com.oracle.bmc.core.model.VolumeAttachment;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.LaunchInstanceRequest;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.core.responses.LaunchInstanceResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;

import java.util.List;

/**
 * This class provides an example of how to perform PV Volume Attachments with pvEncryptionInTransit on in the Java SDK.
 * It is built on top of the class VolumeAttachmentExample.
 *
 * In order to demonstrate functionality, this script will create a VCN and subnet, one block volumes and an instance.
 * These will be deleted at the end of the script. . This script also makes some assumptions about
 * the resources it will create:
 *
 * <ul>
 *   <li>The VCN created by this example will have a display name of java_sdk_vol_example_vcn</li>
 *   <li>The subnet created by this example will have a display name of: java_sdk_vol_example_subnet</li>
 *   <li>The VCN and subnet will have a private IP CIDR block of 10.0.0.0/16</li>
 *   <li>The volumes created will have hardcoded display names of VolumeAttachExample3</li>
 *   <li>An instance will be created with shape VM.Standard.1.1</li>
 *   <li>The instance will have a display name of VolAttachExampleInstance</li>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>Resources will be created in us-phoenix-1</li>
 *   <li>Resources will be created in the first AD returned from the ListAvailabilityDomains call</li>
 * <ul>
 */
public class VolumeAttachmentWithPvEncryptionInTransitExample extends VolumeAttachmentExample {
    private static final String VOL_THREE_DISPLAY_NAME = "VolumeAttachExample3";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the compartment where the volumes and associated resources will be created</li>
     *   <li>The OCID of the KMS key used to generated volume's data encryption key. </li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects the arguments of the compartment OCID and KMS Key ID");
        }

        final String compartmentId = args[0];
        final String kmsKeyId = args.length == 1 ? null : args[1];
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

            instance =
                    launchInstance(
                            computeClient, subnet, compartmentId, kmsKeyId, INSTANCE_DISPLAY_NAME);
            System.out.println("Launched instance");
            System.out.println();

            volume =
                    createVolume(
                            blockStorageClient,
                            compartmentId,
                            adToUse,
                            kmsKeyId,
                            VOL_THREE_DISPLAY_NAME);

            VolumeAttachment pvEncryptionInTransitAttachment = null;
            // IsPvEncryptionInTransitEnabled is supported for PV volume attachment when it's enabled in the instance launch options.
            if (instance.getLaunchOptions().getIsPvEncryptionInTransitEnabled()) {
                pvEncryptionInTransitAttachment =
                        attachParavirtualizedVolume(computeClient, volume, instance, Boolean.TRUE);
            }

            // Note here that in the returned results, each record is actually a subtype of VolumeAttachment corresponding to what type was specified when attaching
            listVolumeAttachmentsOnInstance(computeClient, instance);

            if (pvEncryptionInTransitAttachment != null) {
                detachVolume(computeClient, pvEncryptionInTransitAttachment);
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            System.out.println("Clean Up");
            System.out.println("==========");

            if (volume != null) {
                deleteVolume(blockStorageClient, volume);
                System.out.println("Deleted volume three");
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

    /**
     * Launches an instance and waits for it to become available/running
     *
     * @param computeClient the client used to communicate with the service
     * @param subnet the subnet where the instance will be launched
     * @param compartmentId the OCID of the compartment where the instance will be launched
     * @param kmsKeyId the OCID of the KMS key in the tenant
     * @param displayName the display name of the instance
     * @return the created instance
     *
     * @throws Exception if an error was encountered while waiting for the instance to become running/available
     */
    protected static Instance launchInstance(
            final ComputeClient computeClient,
            final Subnet subnet,
            final String compartmentId,
            final String kmsKeyId,
            final String displayName)
            throws Exception {

        Image image =
                getImageForOsAndShape(
                        computeClient,
                        compartmentId,
                        INSTANCE_OS,
                        INSTANCE_OS_VERSION,
                        INSTANCE_SHAPE);

        // IsPvEncryptionInTransitEnabled is supported for launching instance when it's enabled in the image launch options.
        System.out.println(
                "The image's IsPvEncryptionInTransitEnabled flag: "
                        + image.getLaunchOptions().getIsPvEncryptionInTransitEnabled());

        InstanceSourceViaImageDetails instanceSourceViaImageDetails =
                InstanceSourceViaImageDetails.builder()
                        .imageId(image.getId())
                        .kmsKeyId(kmsKeyId)
                        .build();

        final LaunchInstanceResponse launchResponse =
                computeClient.launchInstance(
                        LaunchInstanceRequest.builder()
                                .launchInstanceDetails(
                                        LaunchInstanceDetails.builder()
                                                .availabilityDomain(subnet.getAvailabilityDomain())
                                                .compartmentId(compartmentId)
                                                .displayName(INSTANCE_DISPLAY_NAME)
                                                .shape(INSTANCE_SHAPE)
                                                .subnetId(subnet.getId())
                                                .sourceDetails(instanceSourceViaImageDetails)
                                                .isPvEncryptionInTransitEnabled(
                                                        image.getLaunchOptions()
                                                                .getIsPvEncryptionInTransitEnabled())
                                                .build())
                                .build());

        final GetInstanceResponse getResponse =
                computeClient
                        .getWaiters()
                        .forInstance(
                                GetInstanceRequest.builder()
                                        .instanceId(launchResponse.getInstance().getId())
                                        .build(),
                                Instance.LifecycleState.Running)
                        .execute();

        return getResponse.getInstance();
    }

    /**
     * Attaches a volume to an instance as a paravirtualized volume and waits for the attachment to complete
     *
     * @param computeClient the client used to communicate with the service
     * @param volume the volume to attach
     * @param instance the instance to attach the volume to
     * @param isPvEncryptionInTransitEnabled if the PvEncryptionInTransit is Enabled for the PV volume attachment
     *
     * @return the volume attachment. Note that this is actually an {@link com.oracle.bmc.core.models.ParavirtualizedVolumeAttachment}, which is a subclass
     * of {@link com.oracle.bmc.core.models.VolumeAttachment}
     *
     * @throws Exception if there was an error waiting for the volume attachment
     */
    private static VolumeAttachment attachParavirtualizedVolume(
            final ComputeClient computeClient,
            final Volume volume,
            final Instance instance,
            Boolean isPvEncryptionInTransitEnabled)
            throws Exception {

        return attachVolume(
                computeClient,
                AttachParavirtualizedVolumeDetails.builder()
                        .volumeId(volume.getId())
                        .instanceId(instance.getId())
                        .isPvEncryptionInTransitEnabled(isPvEncryptionInTransitEnabled)
                        .build());
    }
}
