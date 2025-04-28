/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.BlockstorageClient;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.AttachIScsiVolumeDetails;
import com.oracle.bmc.core.model.AttachParavirtualizedVolumeDetails;
import com.oracle.bmc.core.model.AttachVolumeDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.CreateVolumeDetails;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.Shape;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.model.Volume;
import com.oracle.bmc.core.model.VolumeAttachment;
import com.oracle.bmc.core.requests.AttachVolumeRequest;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.CreateVolumeRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.DeleteVolumeRequest;
import com.oracle.bmc.core.requests.DetachVolumeRequest;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.GetVolumeAttachmentRequest;
import com.oracle.bmc.core.requests.GetVolumeRequest;
import com.oracle.bmc.core.requests.LaunchInstanceRequest;
import com.oracle.bmc.core.requests.ListImagesRequest;
import com.oracle.bmc.core.requests.ListShapesRequest;
import com.oracle.bmc.core.requests.ListVolumeAttachmentsRequest;
import com.oracle.bmc.core.requests.TerminateInstanceRequest;
import com.oracle.bmc.core.responses.AttachVolumeResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.CreateVolumeResponse;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.core.responses.GetVolumeAttachmentResponse;
import com.oracle.bmc.core.responses.GetVolumeResponse;
import com.oracle.bmc.core.responses.LaunchInstanceResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;

import java.util.List;

/**
 * This class provides an example of how to perform Volume Attachments in the Java SDK. It shows how
 * to use different types of volume attachments (e.g. iSCSI, paravirtualized and letting the service
 * determine the appropriate attachment type for your instance)
 *
 * <p>In order to demonstrate functionality, this script will create a VCN and subnet, two block
 * volumes and an instance. These will be deleted at the end of the script. . This script also makes
 * some assumptions about the resources it will create:
 *
 * <ul>
 *   <li>The VCN created by this example will have a display name of java_sdk_vol_example_vcn
 *   <li>The subnet created by this example will have a display name of: java_sdk_vol_example_subnet
 *   <li>The VCN and subnet will have a private IP CIDR block of 10.0.0.0/16
 *   <li>The volumes created will have hardcoded display names of VolumeAttachExample1 and
 *       VolumeAttachExample2
 *   <li>An instance will be created with shape VM.Standard.1.1
 *   <li>The instance will have a display name of VolAttachExampleInstance
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the DEFAULT profile will be used
 *   <li>Resources will be created in us-phoenix-1
 *   <li>Resources will be created in the first AD returned from the ListAvailabilityDomains call
 *       <ul>
 */
public class VolumeAttachmentExample {
    private static final String VCN_DISPLAY_NAME = "java_sdk_vol_example_vcn";
    private static final String SUBNET_DISPLAY_NAME = "java_sdk_vol_example_subnet";
    private static final String CIDR_BLOCK = "10.0.0.0/16";

    protected static final String CONFIG_LOCATION = "~/.oci/config";
    protected static final String CONFIG_PROFILE = "DEFAULT";

    private static final String VOL_ONE_DISPLAY_NAME = "VolumeAttachExample1";
    private static final String VOL_TWO_DISPLAY_NAME = "VolumeAttachExample2";

    protected static final String INSTANCE_SHAPE = "VM.Standard2.1";
    protected static final String INSTANCE_OS = "Oracle Linux";
    protected static final String INSTANCE_OS_VERSION = "7.5";
    protected static final String INSTANCE_DISPLAY_NAME = "VolAttachExampleInstance";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment where the volumes and associated resources will be
     *           created
     *       <li>Optional. The OCID of the KMS key used to generated volume's data encryption key.
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects an argument of the compartment OCID");
        }

        final String compartmentId = args[0];
        final String kmsKeyId = args.length == 1 ? null : args[2];
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final BlockstorageClient blockStorageClient =
                BlockstorageClient.builder().region(Region.US_PHOENIX_1).build(provider);
        final ComputeClient computeClient =
                ComputeClient.builder().region(Region.US_PHOENIX_1).build(provider);
        final VirtualNetworkClient vcnClient =
                VirtualNetworkClient.builder().region(Region.US_PHOENIX_1).build(provider);
        final IdentityClient identityClient =
                IdentityClient.builder().region(Region.US_PHOENIX_1).build(provider);

        Vcn vcn = null;
        Subnet subnet = null;
        Volume volumeOne = null;
        Volume volumeTwo = null;
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

            volumeOne =
                    createVolume(
                            blockStorageClient,
                            compartmentId,
                            adToUse,
                            kmsKeyId,
                            VOL_ONE_DISPLAY_NAME);
            volumeTwo =
                    createVolume(
                            blockStorageClient,
                            compartmentId,
                            adToUse,
                            kmsKeyId,
                            VOL_TWO_DISPLAY_NAME);

            final VolumeAttachment iscsiAttachment =
                    attachIscsiVolume(computeClient, volumeOne, instance);
            final VolumeAttachment paravirtualizedAttachment =
                    attachParavirtualizedVolume(computeClient, volumeTwo, instance);

            // Note here that in the returned results, each record is actually a subtype of
            // VolumeAttachment corresponding to what type was specified when attaching
            listVolumeAttachmentsOnInstance(computeClient, instance);

            detachVolume(computeClient, paravirtualizedAttachment);

            listVolumeAttachmentsOnInstance(computeClient, instance);

            detachVolume(computeClient, iscsiAttachment);
        } finally {
            System.out.println("Clean Up");
            System.out.println("==========");

            if (volumeOne != null) {
                deleteVolume(blockStorageClient, volumeOne);
                System.out.println("Deleted volume one");
            }

            if (volumeTwo != null) {
                deleteVolume(blockStorageClient, volumeTwo);
                System.out.println("Deleted volume two");
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
     * Creates a volume and waits for it to become available
     *
     * @param blockStorageClient the client used to communicate with the service
     * @param compartmentId the compartment in which to create the volume
     * @param availabilityDomain the availability domain in which to create the volume
     * @param displayName the display name of the volume
     * @return the created volume
     * @throws Exception if there is an error waiting on the volume to become available
     */
    protected static Volume createVolume(
            final BlockstorageClient blockStorageClient,
            final String compartmentId,
            final AvailabilityDomain availabilityDomain,
            final String kmsKeyId,
            final String displayName)
            throws Exception {

        System.out.println("Creating volume");
        System.out.println("================");

        final CreateVolumeResponse createResponse =
                blockStorageClient.createVolume(
                        CreateVolumeRequest.builder()
                                .createVolumeDetails(
                                        getCreateVolumeDetails(
                                                compartmentId,
                                                availabilityDomain,
                                                displayName,
                                                kmsKeyId))
                                .build());
        System.out.println("Created volume: " + createResponse.getVolume().toString());

        final GetVolumeResponse getResponse =
                blockStorageClient
                        .getWaiters()
                        .forVolume(
                                GetVolumeRequest.builder()
                                        .volumeId(createResponse.getVolume().getId())
                                        .build(),
                                Volume.LifecycleState.Available)
                        .execute();
        System.out.println(
                "Waited for volume to be available: " + getResponse.getVolume().toString());

        return getResponse.getVolume();
    }

    protected static CreateVolumeDetails getCreateVolumeDetails(
            final String compartmentId,
            final AvailabilityDomain availabilityDomain,
            final String displayName,
            final String kmsKeyId) {
        if (kmsKeyId == null) {
            return CreateVolumeDetails.builder()
                    .availabilityDomain(availabilityDomain.getName())
                    .compartmentId(compartmentId)
                    .displayName(displayName)
                    .build();
        }

        return CreateVolumeDetails.builder()
                .availabilityDomain(availabilityDomain.getName())
                .compartmentId(compartmentId)
                .kmsKeyId(kmsKeyId)
                .displayName(displayName)
                .build();
    }

    /**
     * Deletes a volume and waits for it to be deleted
     *
     * @param blockStorageClient the client used to communicate with the service
     * @param volume the volume to delete
     * @throws Exception if there was an error waiting for the volume to be deleted
     */
    protected static void deleteVolume(
            final BlockstorageClient blockStorageClient, final Volume volume) throws Exception {

        blockStorageClient.deleteVolume(
                DeleteVolumeRequest.builder().volumeId(volume.getId()).build());

        blockStorageClient
                .getWaiters()
                .forVolume(
                        GetVolumeRequest.builder().volumeId(volume.getId()).build(),
                        Volume.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Attaches a volume to an instance as an iSCSI volume and waits for the attachment to complete
     *
     * @param computeClient the client used to communicate with the service
     * @param volume the volume to attach
     * @param instance the instance to attach the volume to
     * @return the volume attachment. Note that this is actually an {@link
     *     com.oracle.bmc.core.models.IScsiVolumeAttachment}, which is a subclass of {@link
     *     com.oracle.bmc.core.models.VolumeAttachment}
     * @throws Exception if there was an error waiting for the volume attachment
     */
    protected static VolumeAttachment attachIscsiVolume(
            final ComputeClient computeClient, final Volume volume, final Instance instance)
            throws Exception {

        /*
         * Note that when attaching we use AttachIScsiVolumeDetails, which is a subclass of AttachVolumeDetails. We
         * specify different types of volume attachment by using the different subclasses of AttachVolumeDetails
         */
        return attachVolume(
                computeClient,
                AttachIScsiVolumeDetails.builder()
                        .volumeId(volume.getId())
                        .instanceId(instance.getId())
                        .build());
    }

    /**
     * Attaches a volume to an instance as a paravirtualized volume and waits for the attachment to
     * complete
     *
     * @param computeClient the client used to communicate with the service
     * @param volume the volume to attach
     * @param instance the instance to attach the volume to
     * @return the volume attachment. Note that this is actually an {@link
     *     com.oracle.bmc.core.models.ParavirtualizedVolumeAttachment}, which is a subclass of
     *     {@link com.oracle.bmc.core.models.VolumeAttachment}
     * @throws Exception if there was an error waiting for the volume attachment
     */
    protected static VolumeAttachment attachParavirtualizedVolume(
            final ComputeClient computeClient, final Volume volume, final Instance instance)
            throws Exception {

        return attachVolume(
                computeClient,
                AttachParavirtualizedVolumeDetails.builder()
                        .volumeId(volume.getId())
                        .instanceId(instance.getId())
                        .build());
    }

    /**
     * Attaches a volume using the given volume attachment details and waits for the attachment to
     * become available
     *
     * @param computeClient the client used to communicate with the service
     * @param attachVolumeDetails the details of the volume attachment. This should be one of the
     *     subclasses of {@link com.oracle.bmc.core.models.AttachVolumeDetails}
     * @return the volume attachment. Note that this will be a subclass of {@link
     *     com.oracle.bmc.core.models.VolumeAttachment}. Which subclass it is will depend on what
     *     type of {@link com.oracle.bmc.core.models.AttachVolumeDetails} was passed to this method.
     *     For example if an {@link com.oracle.bmc.core.models.AttachIScsiVolumeDetails} was used
     *     then the returned {@link com.oracle.bmc.core.models.VolumeAttachment} will be an {@link
     *     com.oracle.bmc.core.models.IScsiVolumeAttachment}
     * @throws Exception if there was an error waiting for the volume attachment
     */
    protected static VolumeAttachment attachVolume(
            final ComputeClient computeClient, final AttachVolumeDetails attachVolumeDetails)
            throws Exception {

        System.out.println("Attaching volume");
        System.out.println("=================");

        final AttachVolumeResponse attachResponse =
                computeClient.attachVolume(
                        AttachVolumeRequest.builder()
                                .attachVolumeDetails(attachVolumeDetails)
                                .build());
        System.out.println("Attached volume: " + attachResponse.getVolumeAttachment().toString());

        final GetVolumeAttachmentResponse getResponse =
                computeClient
                        .getWaiters()
                        .forVolumeAttachment(
                                GetVolumeAttachmentRequest.builder()
                                        .volumeAttachmentId(
                                                attachResponse.getVolumeAttachment().getId())
                                        .build(),
                                VolumeAttachment.LifecycleState.Attached)
                        .execute();
        System.out.println(
                "Waited for volume to attach: " + getResponse.getVolumeAttachment().toString());
        System.out.println();
        System.out.println();

        return getResponse.getVolumeAttachment();
    }

    /**
     * Detaches a volume from an instance and waits for the detach to complete
     *
     * @param computeClient the client used to communicate with the service
     * @param volumeAttachment the details of the volume to detach
     * @throws Exception if there was an error waiting for the volume to detach
     */
    protected static void detachVolume(
            final ComputeClient computeClient, final VolumeAttachment volumeAttachment)
            throws Exception {

        computeClient.detachVolume(
                DetachVolumeRequest.builder().volumeAttachmentId(volumeAttachment.getId()).build());

        computeClient
                .getWaiters()
                .forVolumeAttachment(
                        GetVolumeAttachmentRequest.builder()
                                .volumeAttachmentId(volumeAttachment.getId())
                                .build(),
                        VolumeAttachment.LifecycleState.Detached)
                .execute();
    }

    /**
     * Lists volumes attached to a given instance
     *
     * @param computeClient the client used to communicate with the service
     * @param instance the instance we'll list volume attachments for
     */
    protected static void listVolumeAttachmentsOnInstance(
            final ComputeClient computeClient, final Instance instance) {
        System.out.println("Listing volume attachments for instance");
        System.out.println("========================================");

        /*
         * ListVolumeAttachments has a mandatory parameter of the compartment ID, but we can provide other values for more filtering.
         * In this case we provide the instance ID since we're only interested in volumes attached to that instance
         */
        final Iterable<VolumeAttachment> volAttachIterable =
                computeClient
                        .getPaginators()
                        .listVolumeAttachmentsRecordIterator(
                                ListVolumeAttachmentsRequest.builder()
                                        .compartmentId(instance.getCompartmentId())
                                        .instanceId(instance.getId())
                                        .build());
        for (VolumeAttachment va : volAttachIterable) {
            System.out.println(va);
        }

        System.out.println();
        System.out.println();
    }

    /**
     * Creates a VCN and waits for it to become available to use.
     *
     * @param vcnClient the service client to use to create the VCN
     * @param compartmentId the OCID of the compartment where the VCN will be created
     * @return the created VCN
     * @throws Exception if there is an error waiting on the VCN to become available to use
     */
    protected static Vcn createVcn(final VirtualNetworkClient vcnClient, final String compartmentId)
            throws Exception {
        final CreateVcnResponse createVcnResponse =
                vcnClient.createVcn(
                        CreateVcnRequest.builder()
                                .createVcnDetails(
                                        CreateVcnDetails.builder()
                                                .cidrBlock(CIDR_BLOCK)
                                                .compartmentId(compartmentId)
                                                .displayName(VCN_DISPLAY_NAME)
                                                .build())
                                .build());

        final GetVcnResponse getVcnResponse =
                vcnClient
                        .getWaiters()
                        .forVcn(
                                GetVcnRequest.builder()
                                        .vcnId(createVcnResponse.getVcn().getId())
                                        .build(),
                                Vcn.LifecycleState.Available)
                        .execute();

        return getVcnResponse.getVcn();
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN
     * @param vcn the VCN to delete
     * @throws Exception if there is an error waiting on the VCN to be deleted
     */
    protected static void deleteVcn(final VirtualNetworkClient vcnClient, final Vcn vcn)
            throws Exception {

        vcnClient.deleteVcn(DeleteVcnRequest.builder().vcnId(vcn.getId()).build());

        vcnClient
                .getWaiters()
                .forVcn(
                        GetVcnRequest.builder().vcnId(vcn.getId()).build(),
                        Vcn.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Creates a subnet in a VCN and waits for the subnet to become available to use.
     *
     * @param vcnClient the service client to use to create the subnet
     * @param compartmentId the OCID of the compartment which owns the VCN
     * @param availabilityDomain the availability domain where the subnet will be created
     * @param vcnId the ID of the VCN which will own the subnet
     * @return the created subnet
     * @throws Exception if there is an error waiting on the subnet to become available to use
     */
    protected static Subnet createSubnet(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final AvailabilityDomain availabilityDomain,
            final String vcnId)
            throws Exception {

        final CreateSubnetResponse createSubnetResponse =
                vcnClient.createSubnet(
                        CreateSubnetRequest.builder()
                                .createSubnetDetails(
                                        CreateSubnetDetails.builder()
                                                .availabilityDomain(availabilityDomain.getName())
                                                .compartmentId(compartmentId)
                                                .displayName(SUBNET_DISPLAY_NAME)
                                                .cidrBlock(CIDR_BLOCK)
                                                .vcnId(vcnId)
                                                .build())
                                .build());

        final GetSubnetResponse getSubnetResponse =
                vcnClient
                        .getWaiters()
                        .forSubnet(
                                GetSubnetRequest.builder()
                                        .subnetId(createSubnetResponse.getSubnet().getId())
                                        .build(),
                                Subnet.LifecycleState.Available)
                        .execute();

        return getSubnetResponse.getSubnet();
    }

    /**
     * Deletes a subnet and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the subnet
     * @param subnet the subnet to delete
     * @throws Exception if there is an error waiting on the subnet to be deleted
     */
    protected static void deleteSubnet(final VirtualNetworkClient vcnClient, final Subnet subnet)
            throws Exception {

        vcnClient.deleteSubnet(DeleteSubnetRequest.builder().subnetId(subnet.getId()).build());

        vcnClient
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(subnet.getId()).build(),
                        Subnet.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Retrieves a list of availability domains in a compartment.
     *
     * @param identityClient the client to use to retrieve the availability domains
     * @param compartmentId the OCID of the compartment whose availability domains we're listing
     * @return a list of all availability domains in a compartment
     */
    protected static List<AvailabilityDomain> getAvailabilityDomains(
            final IdentityClient identityClient, final String compartmentId) {

        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        return listAvailabilityDomainsResponse.getItems();
    }

    /**
     * Retrieves an image which is compatible with the given operating system, version and instance
     * shape
     *
     * @param computeClient the client used to communicate with the service
     * @param compartmentId the OCID of the compartment to search
     * @param operatingSystem the target operating system
     * @param operatingSystemVersion the target OS version
     * @param targetShape the target shape
     * @return an Image which is can be used to launch an instance with the specified operating
     *     system, version and shape
     */
    protected static Image getImageForOsAndShape(
            final ComputeClient computeClient,
            final String compartmentId,
            final String operatingSystem,
            final String operatingSystemVersion,
            final String targetShape) {

        final Iterable<Image> imageIterable =
                computeClient
                        .getPaginators()
                        .listImagesRecordIterator(
                                ListImagesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .operatingSystem(operatingSystem)
                                        .operatingSystemVersion(operatingSystemVersion)
                                        .build());
        for (Image image : imageIterable) {
            final Iterable<Shape> shapeIterable =
                    computeClient
                            .getPaginators()
                            .listShapesRecordIterator(
                                    ListShapesRequest.builder()
                                            .compartmentId(compartmentId)
                                            .imageId(image.getId())
                                            .build());
            for (Shape s : shapeIterable) {
                if (targetShape.equals(s.getShape())) {
                    return image;
                }
            }
        }

        throw new IllegalArgumentException(
                "No compatible image found for the specified operating system, version and shape");
    }

    /**
     * Launches an instance and waits for it to become available/running
     *
     * @param computeClient the client used to communicate with the service
     * @param subnet the subnet where the instance will be launched
     * @param compartmentId the OCID of the compartment where the instance will be launched
     * @param displayName the display name of the instance
     * @return the created instance
     * @throws Exception if an error was encountered while waiting for the instance to become
     *     running/available
     */
    protected static Instance launchInstance(
            final ComputeClient computeClient,
            final Subnet subnet,
            final String compartmentId,
            final String displayName)
            throws Exception {

        final LaunchInstanceResponse launchResponse =
                computeClient.launchInstance(
                        LaunchInstanceRequest.builder()
                                .launchInstanceDetails(
                                        LaunchInstanceDetails.builder()
                                                .availabilityDomain(subnet.getAvailabilityDomain())
                                                .compartmentId(compartmentId)
                                                .displayName(INSTANCE_DISPLAY_NAME)
                                                .imageId(
                                                        getImageForOsAndShape(
                                                                        computeClient,
                                                                        compartmentId,
                                                                        INSTANCE_OS,
                                                                        INSTANCE_OS_VERSION,
                                                                        INSTANCE_SHAPE)
                                                                .getId())
                                                .shape(INSTANCE_SHAPE)
                                                .subnetId(subnet.getId())
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
     * Terminates an instance and waits for it to be terminated
     *
     * @param computeClient the client used to communicate with the service
     * @param instance the instance to terminate
     * @throws Exception if an error occurred while waiting for the instance to be terminated
     */
    protected static void terminateInstance(
            final ComputeClient computeClient, final Instance instance) throws Exception {

        computeClient.terminateInstance(
                TerminateInstanceRequest.builder().instanceId(instance.getId()).build());

        computeClient
                .getWaiters()
                .forInstance(
                        GetInstanceRequest.builder().instanceId(instance.getId()).build(),
                        Instance.LifecycleState.Terminated)
                .execute();
    }
}
