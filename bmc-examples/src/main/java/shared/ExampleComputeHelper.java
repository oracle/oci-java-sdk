/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package shared;

import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.Shape;
import com.oracle.bmc.core.model.VnicAttachment;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.LaunchInstanceRequest;
import com.oracle.bmc.core.requests.ListImagesRequest;
import com.oracle.bmc.core.requests.ListShapesRequest;
import com.oracle.bmc.core.requests.ListVnicAttachmentsRequest;
import com.oracle.bmc.core.requests.TerminateInstanceRequest;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.core.responses.LaunchInstanceResponse;

import com.oracle.bmc.core.responses.ListImagesResponse;
import com.oracle.bmc.core.responses.ListShapesResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This class provides several utility functions for basic interactions with the Compute service. These functions
 * may be referenced by multiple examples in order to keep example files focused on the behavior being showcased.
 */
public final class ExampleComputeHelper {

    /**
     * Retrieves an image which is compatible with the given operating system, version and instance shape.
     *
     * @param computeClient the client used to communicate with the service
     * @param compartmentId the OCID of the compartment to search
     * @param instanceShape the target shape for the instance
     * @param instanceOs    the OS installed on the instance
     * @param osVersion     the version of the OS installed on the instance
     * @return an Image which may be used to launch an instance
     */
    public static Image getImageForShape(
            ComputeClient computeClient,
            String compartmentId,
            String instanceShape,
            String instanceOs,
            String osVersion) {

        Iterable<Image> imageIterable =
                computeClient
                        .getPaginators()
                        .listImagesRecordIterator(
                                ListImagesRequest.builder()
                                        .compartmentId(compartmentId)
                                        .operatingSystem(instanceOs)
                                        .operatingSystemVersion(osVersion)
                                        .build());
        for (Image image : imageIterable) {
            Iterable<Shape> shapeIterable =
                    computeClient
                            .getPaginators()
                            .listShapesRecordIterator(
                                    ListShapesRequest.builder()
                                            .compartmentId(compartmentId)
                                            .imageId(image.getId())
                                            .build());
            for (Shape s : shapeIterable) {
                if (instanceShape.equals(s.getShape())) {
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
     * @param computeClient   the client used to communicate with the service
     * @param instanceDetails tLaunchInstanceDetails for the instance to be created
     * @return the created instance
     * @throws Exception if an error was encountered while waiting for the instance to become running/available
     */
    public static Instance launchInstance(
            final ComputeClient computeClient, final LaunchInstanceDetails instanceDetails)
            throws Exception {

        System.out.println("Creating Instance");

        final LaunchInstanceResponse launchResponse =
                computeClient.launchInstance(
                        LaunchInstanceRequest.builder()
                                .launchInstanceDetails(instanceDetails)
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

        Instance instance = getResponse.getInstance();
        System.out.println(String.format("Created Instance %s", instance.getId()));
        return instance;
    }

    /**
     * Terminates an instance and waits for it to be terminated.
     *
     * @param computeClient the client used to communicate with the service
     * @param instanceId    the instance OCID to terminate
     * @throws Exception if an error occurred while waiting for the instance to be terminated
     */
    public static void terminateInstance(final ComputeClient computeClient, final String instanceId)
            throws Exception {
        System.out.println(String.format("Terminating Instance %s", instanceId));
        computeClient.terminateInstance(
                TerminateInstanceRequest.builder().instanceId(instanceId).build());

        computeClient
                .getWaiters()
                .forInstance(
                        GetInstanceRequest.builder().instanceId(instanceId).build(),
                        Instance.LifecycleState.Terminated)
                .execute();
        System.out.println(String.format("Terminated Instance %s", instanceId));
    }

    /**
     * Retrieves VNIC attachments for a given compute instance OCID.
     *
     * @param computeClient the client used to communicate with the service
     * @param vnicAttachmentsRequest  ListVnicAttachmentsRequest used to retrieve VNICs
     * @return the ids of the returned VNIC attachments
     */
    public static List<String> getVnicIds(
            final ComputeClient computeClient,
            final ListVnicAttachmentsRequest vnicAttachmentsRequest) {

        final Iterable<VnicAttachment> vnicAttachmentsIterable =
                computeClient
                        .getPaginators()
                        .listVnicAttachmentsRecordIterator(vnicAttachmentsRequest);

        final List<String> vnicIds = new ArrayList<>();
        for (VnicAttachment va : vnicAttachmentsIterable) {
            vnicIds.add(va.getVnicId());
        }

        return vnicIds;
    }

    /**
     * Retrieve the list of shapes available for the compartment
     * @param computeClient the client used to communicate with the service
     * @param compartmentId the OCID of the compartment to search
     * @return List of VM shapes available for the given compartment
     */
    public static List<Shape> getVMShapes(ComputeClient computeClient, String compartmentId) {
        List<Shape> vmShapes =
                getShapes(computeClient, compartmentId)
                        .stream()
                        .filter(name -> name.getShape().startsWith("VM"))
                        .collect(Collectors.toList());
        if (vmShapes.isEmpty()) {
            throw new IllegalStateException("No VM shape was found.");
        }
        return vmShapes;
    }

    /**
     * Retieves the images available for the given shape
     * and operating system
     * @param computeClient the client used to communicate with the service
     * @param compartmentId the OCID of the compartment to search
     * @param shape the target shape for the instance
     * @param operatingSystem the version of the OS installed on the instance
     * @return Images available for given shape and OS
     */
    public static List<Image> getImages(
            ComputeClient computeClient,
            String compartmentId,
            String shape,
            String operatingSystem) {

        ListImagesResponse response =
                computeClient.listImages(
                        ListImagesRequest.builder()
                                .shape(shape)
                                .compartmentId(compartmentId)
                                .operatingSystem(operatingSystem)
                                .build());

        return response.getItems();
    }

    /**
     * Retrieve the list of shapes available for the compartment
     * @param computeClient the client used to communicate with the service
     * @param compartmentId the OCID of the compartment to search
     * @return List of shapes available for the given compartment
     */
    public static List<Shape> getShapes(ComputeClient computeClient, String compartmentId) {
        ListShapesResponse response =
                computeClient.listShapes(
                        ListShapesRequest.builder().compartmentId(compartmentId).build());

        return response.getItems();
    }
}
