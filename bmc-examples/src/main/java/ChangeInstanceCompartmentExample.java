/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.model.ChangeInstanceCompartmentDetails;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.Instance.LifecycleState;
import com.oracle.bmc.core.requests.ChangeInstanceCompartmentRequest;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.responses.ChangeInstanceCompartmentResponse;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.workrequests.WorkRequestClient;
import com.oracle.bmc.workrequests.WorkRequestWaiters;
import com.oracle.bmc.workrequests.model.WorkRequest;
import com.oracle.bmc.workrequests.requests.GetWorkRequestRequest;
import com.oracle.bmc.workrequests.responses.GetWorkRequestResponse;

/**
 * This example shows how to change the compartment in which an instance lives. It makes use of the
 * Work Request service to know that this operation has completed and whether it was successful.
 *
 * <p>Requirements for running this example: - Java SDK 1.4.4 or later (you can check this by
 * running oci --version) - An existing, functional CLI configuration. If it is not in the default
 * location, you will need to change the code near the beginning of "main" to match your setup.
 *
 * <p>Usage: ChangeInstanceCompartmentExample instanceid compartmentid
 */
public class ChangeInstanceCompartmentExample {

    public static void main(String[] args) throws Exception {

        if (args.length != 2) {
            System.out.println("Usage: ChangeInstanceCompartment instance-id new-compartment-id");
            return;
        }

        // TODO: Fill in these values if they do not match your configuration
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        String instanceId = args[0];
        String newCompartmentId = args[1];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        try (ComputeClient computeClient = new ComputeClient(provider);
                WorkRequestClient workRequestsClient = new WorkRequestClient(provider)) {

            // First get the instance Id so we know what state it is in.
            // this will help us know when the move is complete.
            GetInstanceRequest getRequest =
                    GetInstanceRequest.builder().instanceId(instanceId).build();
            GetInstanceResponse getResponse = computeClient.getInstance(getRequest);

            // This will help is ensure that the instance doesn't change between now
            // and the move call
            String eTag = getResponse.getEtag();
            Instance instance = getResponse.getInstance();

            String oldCompartment = instance.getCompartmentId();
            LifecycleState state = instance.getLifecycleState();

            System.out.println("About to move instance!");
            System.out.println("\tCurrent compartment = " + oldCompartment);
            System.out.println("\tNew compartment = " + newCompartmentId);
            System.out.println("\tLifecycle state = " + state);

            // We have everything we need to know. Let's move it!
            ChangeInstanceCompartmentDetails details =
                    ChangeInstanceCompartmentDetails.builder()
                            .compartmentId(newCompartmentId)
                            .build();
            ChangeInstanceCompartmentRequest changeRequest =
                    ChangeInstanceCompartmentRequest.builder()
                            .instanceId(instanceId)
                            .ifMatch(eTag)
                            .changeInstanceCompartmentDetails(details)
                            .build();

            ChangeInstanceCompartmentResponse changeResponse =
                    computeClient.changeInstanceCompartment(changeRequest);

            String workRequestId = changeResponse.getOpcWorkRequestId();

            // We can use the work request Id from the above request to
            // wait for completion. Once it completes we'll know if it succeeded or failed.
            System.out.println(
                    "Change Instance Compartment initiated. Waiting for the move to complete.");
            System.out.println("Work request ID is " + workRequestId);

            WorkRequestWaiters waiter = workRequestsClient.getWaiters();
            GetWorkRequestResponse response =
                    waiter.forWorkRequest(
                                    GetWorkRequestRequest.builder()
                                            .workRequestId(workRequestId)
                                            .build())
                            .execute();

            System.out.println("Finished waiting for instanceID " + instanceId);

            // Now let's check the response to see if the move was successful.
            WorkRequest wr = response.getWorkRequest();

            if (wr.getStatus() == WorkRequest.Status.Succeeded) {
                System.out.println("Move was successful!");
            } else {
                System.out.println("Move was not successful. Status is " + wr.getStatus());
            }
        }
    }
}
