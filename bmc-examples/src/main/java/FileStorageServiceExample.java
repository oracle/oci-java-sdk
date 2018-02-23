/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetPrivateIpRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetPrivateIpResponse;
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.filestorage.FileStorageClient;
import com.oracle.bmc.filestorage.model.CreateExportDetails;
import com.oracle.bmc.filestorage.model.CreateFileSystemDetails;
import com.oracle.bmc.filestorage.model.CreateMountTargetDetails;
import com.oracle.bmc.filestorage.model.CreateSnapshotDetails;
import com.oracle.bmc.filestorage.model.Export;
import com.oracle.bmc.filestorage.model.ExportSet;
import com.oracle.bmc.filestorage.model.ExportSummary;
import com.oracle.bmc.filestorage.model.FileSystem;
import com.oracle.bmc.filestorage.model.MountTarget;
import com.oracle.bmc.filestorage.model.Snapshot;
import com.oracle.bmc.filestorage.requests.CreateExportRequest;
import com.oracle.bmc.filestorage.requests.CreateFileSystemRequest;
import com.oracle.bmc.filestorage.requests.CreateMountTargetRequest;
import com.oracle.bmc.filestorage.requests.CreateSnapshotRequest;
import com.oracle.bmc.filestorage.requests.DeleteExportRequest;
import com.oracle.bmc.filestorage.requests.DeleteFileSystemRequest;
import com.oracle.bmc.filestorage.requests.DeleteMountTargetRequest;
import com.oracle.bmc.filestorage.requests.DeleteSnapshotRequest;
import com.oracle.bmc.filestorage.requests.GetExportRequest;
import com.oracle.bmc.filestorage.requests.GetExportSetRequest;
import com.oracle.bmc.filestorage.requests.GetFileSystemRequest;
import com.oracle.bmc.filestorage.requests.GetMountTargetRequest;
import com.oracle.bmc.filestorage.requests.GetSnapshotRequest;
import com.oracle.bmc.filestorage.requests.ListExportsRequest;
import com.oracle.bmc.filestorage.requests.ListSnapshotsRequest;
import com.oracle.bmc.filestorage.responses.CreateExportResponse;
import com.oracle.bmc.filestorage.responses.CreateFileSystemResponse;
import com.oracle.bmc.filestorage.responses.CreateMountTargetResponse;
import com.oracle.bmc.filestorage.responses.CreateSnapshotResponse;
import com.oracle.bmc.filestorage.responses.GetExportResponse;
import com.oracle.bmc.filestorage.responses.GetExportSetResponse;
import com.oracle.bmc.filestorage.responses.GetFileSystemResponse;
import com.oracle.bmc.filestorage.responses.GetMountTargetResponse;
import com.oracle.bmc.filestorage.responses.GetSnapshotResponse;
import com.oracle.bmc.filestorage.responses.ListExportsResponse;
import com.oracle.bmc.filestorage.responses.ListSnapshotsResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.model.BmcException;

import java.util.List;
import java.security.SecureRandom;

/**
 * This class provides an example of how to use the File Storage service in the Java SDK.
 *
 * In order to demonstrate functionality for mount targets and export sets, this script will also create a VCN
 * and subnet. These will be deleted at the end of the script. This script also makes some assumptions about
 * the resources it will create:
 *
 * <ul>
 *   <li>The VCN created by this example will have a display name of java_sdk_fs_example_vcn</li>
 *   <li>The subnet created by this example will have a display name of: java_sdk_fs_example_subnet</li>
 *   <li>The VCN and subnet will have a private IP CIDR block of 10.0.0.0/16</li>
 *   <li>The file system export created by this example will have a path of /files</li>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>Resources will be created in us-phoenix-1</li>
 *   <li>Resources will be created in the first AD returned from the ListAvailabilityDomains call</li>
 * <ul>
 */
public class FileStorageServiceExample {

    private static final String VCN_DISPLAY_NAME = "java_sdk_fs_example_vcn";
    private static final String SUBNET_DISPLAY_NAME = "java_sdk_fs_example_subnet";
    private static final String CIDR_BLOCK = "10.0.0.0/16";
    private static final String EXPORT_PATH = "/files";

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static final int RETRY_TOKEN_LENGTH = 32;
    private static final char[] RETRY_TOKEN_CHARS =
            "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    /*
     * Sometimes we can't delete the subnet straight after a mount target has been deleted
     * as network resources still need to clear. If we get a conflict, try a few times before
     * bailing out.
     */
    private static final int DELETE_SUBNET_ATTEMPTS = 5;

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The OCID of the compartment where the file system and related resources will be created</li>
     *   <li>The display name of the file system</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                    "This example expects two arguments: the first argument is a compartment OCID and the second the display name of the file system to create");
        }

        final String compartmentId = args[0];
        final String fileSystemDisplayName = args[1];

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(CONFIG_LOCATION, CONFIG_PROFILE);
        final FileStorageClient fsClient = new FileStorageClient(provider);
        final VirtualNetworkClient vcnClient = new VirtualNetworkClient(provider);
        final IdentityClient identityClient = new IdentityClient(provider);

        vcnClient.setRegion(Region.US_PHOENIX_1);
        fsClient.setRegion(Region.US_PHOENIX_1);
        identityClient.setRegion(Region.US_PHOENIX_1);

        Vcn vcn = null;
        Subnet subnet = null;
        FileSystem fileSystem = null;
        MountTarget mountTarget = null;
        Export export = null;
        Snapshot snapshot = null;
        try {
            final List<AvailabilityDomain> availabilityDomains =
                    getAvailabilityDomains(identityClient, compartmentId);
            final AvailabilityDomain adToUse = availabilityDomains.get(0);

            // A VCN and subnet is required to create a mount target
            vcn = createVcn(vcnClient, compartmentId);
            subnet = createSubnet(vcnClient, compartmentId, adToUse, vcn.getId());
            System.out.println("Created VCN and subnet");
            System.out.println();

            /*
             * Here we demonstrate:
             *
             *     - Creating a new file system
             *     - Creating a mount target via which the file system can be accessed. The mount target and file system must
             *       be in the same availability domain in order to export the file system from the mount target
             *     - Creating an export so that we can mount the file system (see
             *       https://docs.us-phoenix-1.oraclecloud.com/Content/File/Tasks/mountingfilesystems.htm for more information)
             *     - Creating a snapshot of the file system
             *
             * And we'll delete these resources when we're done
             */
            fileSystem = createFileSystem(fsClient, compartmentId, fileSystemDisplayName, adToUse);

            mountTarget =
                    createMountTarget(
                            fsClient,
                            vcnClient,
                            compartmentId,
                            fileSystemDisplayName + "-mnt",
                            adToUse,
                            subnet);
            getExportSet(fsClient, mountTarget.getExportSetId());

            export = createExport(fsClient, fileSystem.getId(), mountTarget.getExportSetId());
            listExports(fsClient, compartmentId, fileSystem, mountTarget);

            snapshot = createSnapshot(fsClient, fileSystem);
        } finally {
            System.out.println("Clean Up");
            System.out.println("==========");

            if (snapshot != null) {
                deleteSnapshot(fsClient, snapshot);
                System.out.println("Deleted snapshot");
            }

            if (export != null) {
                deleteExport(fsClient, export);
                System.out.println("Deleted export");
            }

            if (mountTarget != null) {
                deleteMountTarget(fsClient, mountTarget);
                System.out.println("Deleted mount target");
            }

            if (fileSystem != null) {
                deleteFileSystem(fsClient, fileSystem);
                System.out.println("Deleted file system");
            }

            if (subnet != null) {
                deleteSubnet(vcnClient, subnet);
                System.out.println("Deleted subnet");
            }

            if (vcn != null) {
                deleteVcn(vcnClient, vcn);
                System.out.println("Deleted VCN");
            }

            fsClient.close();
            vcnClient.close();
            identityClient.close();
        }
    }

    /**
     * Creates a file system and waits for it to become available. We recommend using a retry token on these requests
     * so that if you receive a timeout or server error and need to retry the request you won't run the risk of
     * creating multiple resources.
     *
     * @param fsClient the service client to use to create the File System
     * @param compartmentId the OCID of the compartment where the file system will be created
     * @param availabilityDomain the availability domain where the file system will be created
     *
     * @return the created file system
     *
     * @throws Exception if there is an error waiting on the file system to become available to use
     */
    private static FileSystem createFileSystem(
            final FileStorageClient fsClient,
            final String compartmentId,
            final String displayName,
            final AvailabilityDomain availabilityDomain)
            throws Exception {

        System.out.println("Creating file system");
        System.out.println("=======================================");

        final String retryToken = getRetryToken(RETRY_TOKEN_LENGTH);

        final CreateFileSystemDetails createDetails =
                CreateFileSystemDetails.builder()
                        .displayName(displayName)
                        .compartmentId(compartmentId)
                        .availabilityDomain(availabilityDomain.getName())
                        .build();

        final CreateFileSystemResponse createResponse =
                fsClient.createFileSystem(
                        CreateFileSystemRequest.builder()
                                .createFileSystemDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println("Created file system: " + createResponse.getFileSystem().toString());
        System.out.println();

        final GetFileSystemResponse getFileSystemResponse =
                fsClient.getWaiters()
                        .forFileSystem(
                                GetFileSystemRequest.builder()
                                        .fileSystemId(createResponse.getFileSystem().getId())
                                        .build(),
                                FileSystem.LifecycleState.Active)
                        .execute();
        System.out.println(
                "Waited for file system to become available: "
                        + getFileSystemResponse.getFileSystem().toString());
        System.out.println();

        /*
         * If we try and send through the same request with the same retry token then this will not create a
         * new resource. Instead, the create response will contain the same resource which has already been
         * created
         */
        final CreateFileSystemResponse createWithRetryToken =
                fsClient.createFileSystem(
                        CreateFileSystemRequest.builder()
                                .createFileSystemDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println(
                "Try and create the file system again with the same retry token: "
                        + createWithRetryToken.getFileSystem().toString());
        System.out.println(
                "Same resource? "
                        + (createWithRetryToken
                                .getFileSystem()
                                .getId()
                                .equals(createResponse.getFileSystem().getId())));

        System.out.println();
        System.out.println();

        return getFileSystemResponse.getFileSystem();
    }

    /**
     * Creates a mount target and waits for it to become available. We recommend using a retry token on these requests
     * so that if you receive a timeout or server error and need to retry the request you won't run the risk of
     * creating multiple resources.
     *
     * This creates a mount target WITHOUT specifying a hostname. This means that the mount target will only be accessible
     * via its private IP address.
     *
     * @param fsClient the service client to use to create the mount target
     * @param vcnClient a client used to communiate with the Virtual Networking service
     * @param compartmentId the OCID of the compartment where the file system will be created
     * @param displayName the display name of the mount target
     * @param availabilityDomain the availability domain where the file system will be created
     * @param subnet the subnet where the mount target will reside. If no private IP address is explicitly specified at
     * creation time then the mount target will be assigned a free private IP address from the subnet
     *
     * @return the created mount target
     *
     * @throws Exception if there is an error waiting on the mount target to become available to use
     */
    private static MountTarget createMountTarget(
            final FileStorageClient fsClient,
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String displayName,
            final AvailabilityDomain availabilityDomain,
            final Subnet subnet)
            throws Exception {

        System.out.println("Creating mount target");
        System.out.println("=======================================");

        final String retryToken = getRetryToken(RETRY_TOKEN_LENGTH);

        final CreateMountTargetDetails createDetails =
                CreateMountTargetDetails.builder()
                        .availabilityDomain(availabilityDomain.getName())
                        .subnetId(subnet.getId())
                        .compartmentId(compartmentId)
                        .displayName(displayName)
                        .build();

        final CreateMountTargetResponse createResponse =
                fsClient.createMountTarget(
                        CreateMountTargetRequest.builder()
                                .createMountTargetDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println("Created mount target: " + createResponse.getMountTarget().toString());
        System.out.println();

        final GetMountTargetResponse getMountTargetResponse =
                fsClient.getWaiters()
                        .forMountTarget(
                                GetMountTargetRequest.builder()
                                        .mountTargetId(createResponse.getMountTarget().getId())
                                        .build(),
                                MountTarget.LifecycleState.Active)
                        .execute();
        System.out.println(
                "Waited for mount target to become available: "
                        + getMountTargetResponse.getMountTarget().toString());
        System.out.println();

        /*
         * If we try and send through the same request with the same retry token then this will not create a
         * new resource. Instead, the create response will contain the same resource which has already been
         * created
         */
        final CreateMountTargetResponse createWithRetryToken =
                fsClient.createMountTarget(
                        CreateMountTargetRequest.builder()
                                .createMountTargetDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println(
                "Try and create the mount target again with the same retry token: "
                        + createWithRetryToken.getMountTarget().toString());
        System.out.println(
                "Same resource? "
                        + (createWithRetryToken
                                .getMountTarget()
                                .getId()
                                .equals(createResponse.getMountTarget().getId())));
        System.out.println();

        /*
         * Note that the MountTarget contains an array of private IP OCIDs. In order to get the
         * IP address of the MountTarget, we can use VirtualNetworkClient's getPrivateIp() method
         */
        final String mountTargetPrivateIpId =
                getMountTargetResponse.getMountTarget().getPrivateIpIds().get(0);
        final GetPrivateIpResponse getPrivateIpResponse =
                vcnClient.getPrivateIp(
                        GetPrivateIpRequest.builder().privateIpId(mountTargetPrivateIpId).build());
        System.out.println(
                "Mount target private IP: " + getPrivateIpResponse.getPrivateIp().getIpAddress());

        System.out.println();
        System.out.println();

        return getMountTargetResponse.getMountTarget();
    }

    /**
     * Retrieves the details of an export set for a mount target
     *
     * @param exportSetId the OCID of the export set (obtained from a MountTarget)
     */
    private static void getExportSet(final FileStorageClient fsClient, final String exportSetId) {

        System.out.println("Get export set for mount target");
        System.out.println("=======================================");

        final GetExportSetResponse getResponse =
                fsClient.getExportSet(
                        GetExportSetRequest.builder().exportSetId(exportSetId).build());
        System.out.println("Export set for mount target: " + getResponse.getExportSet());

        System.out.println();
        System.out.println();
    }

    /**
     * Creates an export and waits for it to become available. This export enables us to access the file system
     * via the mount target. We recommend using a retry token on these requests
     * so that if you receive a timeout or server error and need to retry the request you won't run the risk of
     * creating multiple resources.
     *
     * There are rules around export paths and file system associations which you should review here:
     * https://docs.us-phoenix-1.oraclecloud.com/api/#/en/filestorage/20171215/Export/
     *
     * @param fsClient the service client to use to create the export
     * @param fileSystemId the OCID of the file system to associate with the export
     * @param exportSetId the OCID of the MountTarget's export set
     *
     * @return the created export
     *
     * @throws Exception if there is an error waiting on the export to become available to use
     */
    private static Export createExport(
            final FileStorageClient fsClient, final String fileSystemId, final String exportSetId)
            throws Exception {

        System.out.println("Creating export");
        System.out.println("=================");

        final String retryToken = getRetryToken(RETRY_TOKEN_LENGTH);

        final CreateExportDetails createDetails =
                CreateExportDetails.builder()
                        .exportSetId(exportSetId)
                        .fileSystemId(fileSystemId)
                        .path(EXPORT_PATH)
                        .build();

        final CreateExportResponse createResponse =
                fsClient.createExport(
                        CreateExportRequest.builder()
                                .createExportDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println("Created export: " + createResponse.getExport().toString());
        System.out.println();

        final GetExportResponse getExportResponse =
                fsClient.getWaiters()
                        .forExport(
                                GetExportRequest.builder()
                                        .exportId(createResponse.getExport().getId())
                                        .build(),
                                Export.LifecycleState.Active)
                        .execute();
        System.out.println(
                "Waited for export to become available: "
                        + getExportResponse.getExport().toString());
        System.out.println();

        /*
         * If we try and send through the same request with the same retry token then this will not create a
         * new resource. Instead, the create response will contain the same resource which has already been
         * created
         */
        final CreateExportResponse createWithRetryToken =
                fsClient.createExport(
                        CreateExportRequest.builder()
                                .createExportDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println(
                "Try and create the export again with the same retry token: "
                        + createWithRetryToken.getExport().toString());
        System.out.println(
                "Same resource? "
                        + (createWithRetryToken
                                .getExport()
                                .getId()
                                .equals(createResponse.getExport().getId())));

        System.out.println();
        System.out.println();

        return getExportResponse.getExport();
    }

    /**
     * Creates a point in time snapshot of a file system and waits for it to become available. Note that snapshot
     * names are immutable and must be unique amongst all non-DELETED snapshots for a file system.
     *
     * We recommend using a retry token on these requests so that if you receive a timeout or server error
     * and need to retry the request you won't run the risk of creating multiple resources.
     *
     * @param fsClient the service client used to communicate with the File Storage service
     * @param fileSystem the file system to create the snapshot of
     *
     * @throws Exception if there is an error waiting on the snapshot to become available
     */
    private static Snapshot createSnapshot(
            final FileStorageClient fsClient, final FileSystem fileSystem) throws Exception {

        System.out.println("Creating snapshot");
        System.out.println("====================");

        final String retryToken = getRetryToken(RETRY_TOKEN_LENGTH);

        final CreateSnapshotDetails createDetails =
                CreateSnapshotDetails.builder()
                        .fileSystemId(fileSystem.getId())
                        .name("example_snapshot")
                        .build();

        final CreateSnapshotResponse createSnapshotResponse =
                fsClient.createSnapshot(
                        CreateSnapshotRequest.builder()
                                .createSnapshotDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println("Created snapshot: " + createSnapshotResponse.getSnapshot().toString());
        System.out.println();

        final GetSnapshotResponse getSnapshotResponse =
                fsClient.getWaiters()
                        .forSnapshot(
                                GetSnapshotRequest.builder()
                                        .snapshotId(createSnapshotResponse.getSnapshot().getId())
                                        .build(),
                                Snapshot.LifecycleState.Active)
                        .execute();
        System.out.println(
                "Waited for snapshot to become available: "
                        + getSnapshotResponse.getSnapshot().toString());
        System.out.println();

        /*
         * If we try and send through the same request with the same retry token then this will not create a
         * new resource. Instead, the create response will contain the same resource which has already been
         * created
         */
        final CreateSnapshotResponse createWithRetryToken =
                fsClient.createSnapshot(
                        CreateSnapshotRequest.builder()
                                .createSnapshotDetails(createDetails)
                                .opcRetryToken(retryToken)
                                .build());
        System.out.println(
                "Try and create the snapshot again with the same retry token: "
                        + createWithRetryToken.getSnapshot().toString());
        System.out.println(
                "Same resource? "
                        + (createWithRetryToken
                                .getSnapshot()
                                .getId()
                                .equals(createSnapshotResponse.getSnapshot().getId())));

        System.out.println();
        System.out.println();

        return getSnapshotResponse.getSnapshot();
    }

    /**
     * Demonstrates how to list exports and using various criteria. Note that listing exports is a paginated call, so we should
     * get all pages until there is no more opcNextPage token
     *
     * @param fsClient the service client used to communicate with the File Storage service
     * @param compartmentId the OCID of the compartment which owns the resources
     * @param fileSystem the file system which we're working with
     * @param mountTarget the mount target which we're working with
     */
    private static void listExports(
            final FileStorageClient fsClient,
            final String compartmentId,
            final FileSystem fileSystem,
            final MountTarget mountTarget) {

        final ListExportsRequest.Builder requestBuilder =
                ListExportsRequest.builder().compartmentId(compartmentId);

        // The most basic call is to list exports by comparment ID
        System.out.println();
        System.out.println("Listing exports by compartment ID");
        System.out.println("=======================================");
        ListExportsResponse listResponse;
        do {
            listResponse = fsClient.listExports(requestBuilder.build());
            for (ExportSummary es : listResponse.getItems()) {
                System.out.println("Export Set: " + es.toString());
            }

            requestBuilder.page(listResponse.getOpcNextPage());
        } while (listResponse.getOpcNextPage() != null);

        // We can find all exports in a given export set
        requestBuilder.page(null).exportSetId(mountTarget.getExportSetId());
        System.out.println();
        System.out.println("Listing exports by export set");
        System.out.println("=======================================");
        do {
            listResponse = fsClient.listExports(requestBuilder.build());
            for (ExportSummary es : listResponse.getItems()) {
                System.out.println("Export Set: " + es.toString());
            }

            requestBuilder.page(listResponse.getOpcNextPage());
        } while (listResponse.getOpcNextPage() != null);

        // We can find all exports for a given file system
        requestBuilder.page(null).exportSetId(null).fileSystemId(fileSystem.getId());
        System.out.println();
        System.out.println("Listing exports by file system");
        System.out.println("=======================================");
        do {
            listResponse = fsClient.listExports(requestBuilder.build());
            for (ExportSummary es : listResponse.getItems()) {
                System.out.println("Export Set: " + es.toString());
            }

            requestBuilder.page(listResponse.getOpcNextPage());
        } while (listResponse.getOpcNextPage() != null);

        System.out.println();
        System.out.println();
    }

    /**
     * Deletes a snapshot and waits for it to be deleted.
     *
     * @param fsClient the service client used to communicate with the File Storage service
     * @param snapshot the snapshot to delete
     *
     * @throws Exception if there is an error waiting on the export to be deleted
     */
    private static void deleteSnapshot(final FileStorageClient fsClient, final Snapshot snapshot)
            throws Exception {

        fsClient.deleteSnapshot(
                DeleteSnapshotRequest.builder().snapshotId(snapshot.getId()).build());

        fsClient.getWaiters()
                .forSnapshot(
                        GetSnapshotRequest.builder().snapshotId(snapshot.getId()).build(),
                        Snapshot.LifecycleState.Deleted)
                .execute();
    }

    /**
     * Deletes an export and waits for it to be deleted.
     *
     * @param fsClient the service client used to communicate with the File Storage service
     * @param export the export to delete
     *
     * @throws Exception if there is an error waiting on the export to be deleted
     */
    private static void deleteExport(final FileStorageClient fsClient, final Export export)
            throws Exception {

        fsClient.deleteExport(DeleteExportRequest.builder().exportId(export.getId()).build());

        fsClient.getWaiters()
                .forExport(
                        GetExportRequest.builder().exportId(export.getId()).build(),
                        Export.LifecycleState.Deleted)
                .execute();
    }

    /**
     * Deletes a mount target and waits for it to be deleted.
     *
     * @param fsClient the service client used to communicate with the File Storage service
     * @param mountTarget the mount target to delete
     *
     * @throws Exception if there is an error waiting on the mount target to be deleted
     */
    private static void deleteMountTarget(
            final FileStorageClient fsClient, final MountTarget mountTarget) throws Exception {

        fsClient.deleteMountTarget(
                DeleteMountTargetRequest.builder().mountTargetId(mountTarget.getId()).build());

        fsClient.getWaiters()
                .forMountTarget(
                        GetMountTargetRequest.builder().mountTargetId(mountTarget.getId()).build(),
                        MountTarget.LifecycleState.Deleted)
                .execute();
    }

    /**
     * Deletes a file system and waits for it to be deleted.
     *
     * @param fsClient the service client used to communicate with the File Storage service
     * @param fileSystem the file system to delete
     *
     * @throws Exception if there is an error waiting on the file system to be deleted
     */
    private static void deleteFileSystem(
            final FileStorageClient fsClient, final FileSystem fileSystem) throws Exception {

        fsClient.deleteFileSystem(
                DeleteFileSystemRequest.builder().fileSystemId(fileSystem.getId()).build());

        fsClient.getWaiters()
                .forFileSystem(
                        GetFileSystemRequest.builder().fileSystemId(fileSystem.getId()).build(),
                        FileSystem.LifecycleState.Deleted)
                .execute();
    }

    /**
     * Creates a VCN and waits for it to become available to use.
     *
     * @param vcnClient the service client to use to create the VCN
     * @param compartmentId the OCID of the compartment where the VCN will be created
     *
     * @return the created VCN
     *
     * @throws Exception if there is an error waiting on the VCN to become available to use
     */
    private static Vcn createVcn(final VirtualNetworkClient vcnClient, final String compartmentId)
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
     *
     * @throws Exception if there is an error waiting on the VCN to be deleted
     */
    private static void deleteVcn(final VirtualNetworkClient vcnClient, final Vcn vcn)
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
     *
     * @return the created subnet
     *
     * @throws Exception if there is an error waiting on the subnet to become available to use
     */
    private static Subnet createSubnet(
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
     *
     * @throws Exception if there is an error waiting on the subnet to be deleted
     */
    private static void deleteSubnet(final VirtualNetworkClient vcnClient, final Subnet subnet)
            throws Exception {

        /*
         * Sometimes we can't delete the subnet straight after a mount target has been deleted
         * as network resources still need to clear. If we get a conflict, try a few times before
         * bailing out.
         */
        int numAttempts = 0;
        while (true) {
            try {
                vcnClient.deleteSubnet(
                        DeleteSubnetRequest.builder().subnetId(subnet.getId()).build());
                break;
            } catch (BmcException e) {
                numAttempts++;
                if (e.getStatusCode() == 409 && numAttempts < DELETE_SUBNET_ATTEMPTS) {
                    Thread.sleep(10000L);
                } else {
                    throw e;
                }
            }
        }

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
     *
     * @return a list of all availability domains in a compartment
     */
    private static List<AvailabilityDomain> getAvailabilityDomains(
            final IdentityClient identityClient, final String compartmentId) {

        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        return listAvailabilityDomainsResponse.getItems();
    }

    /**
     * Generates a retry token that we can use as the opc-retry-token in a request.
     *
     * @param tokenLength the length of the token
     *
     * @return A retry token
     */
    private static String getRetryToken(final int tokenLength) {
        final char[] c = new char[tokenLength];
        final SecureRandom random = new SecureRandom();
        for (int i = 0; i < tokenLength; i++) {
            c[i] = RETRY_TOKEN_CHARS[random.nextInt(RETRY_TOKEN_CHARS.length)];
        }

        return new String(c);
    }
}
