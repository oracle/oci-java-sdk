/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.loadbalancer.LoadBalancerClient;
import com.oracle.bmc.loadbalancer.model.ChangeLoadBalancerCompartmentDetails;
import com.oracle.bmc.loadbalancer.requests.ChangeLoadBalancerCompartmentRequest;
import com.oracle.bmc.loadbalancer.requests.GetWorkRequestRequest;
import com.oracle.bmc.loadbalancer.responses.ChangeLoadBalancerCompartmentResponse;

/**
 * Example Class to demonstrate changing the compartment of an existing LoadBalancer via the API
 */
public class ChangeLoadBalancerCompartmentExample {

    /**
     * The entry point for the example.
     * Please refer to https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer
     * for information about using the load balancer API
     * This example changes the compartment for an existing LoadBalancer
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *             <ul>
     *             <li>The OCID of the compartment where the load balancer will be moved.</li>
     *             </ul>
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO: Fill in these values
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";
        String loadBalancerId = "SOME OCID";

        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects one argument: a target compartment OCID");
        }
        final String compartmentId = args[0];

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        LoadBalancerClient loadBalancerClient = new LoadBalancerClient(provider);

        changeLoadBalancerCompartment(loadBalancerClient, loadBalancerId, compartmentId);

        System.out.println("DONE");
    }

    /**
     * Changes the compartment for an existing LoadBalancer
     *
     * @param loadBalancerClient  client used to communicate with the service
     * @param loadBalancerId      ID of the LoadBalancer to be updated
     * @param targetCompartment   target compartment to which the LoadBalancer will be moved
     */
    private static void changeLoadBalancerCompartment(
            LoadBalancerClient loadBalancerClient, String loadBalancerId, String targetCompartment)
            throws Exception {
        ChangeLoadBalancerCompartmentResponse response =
                loadBalancerClient.changeLoadBalancerCompartment(
                        ChangeLoadBalancerCompartmentRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .changeLoadBalancerCompartmentDetails(
                                        ChangeLoadBalancerCompartmentDetails.builder()
                                                .compartmentId(targetCompartment)
                                                .build())
                                .build());

        loadBalancerClient
                .getWaiters()
                .forWorkRequest(
                        GetWorkRequestRequest.builder()
                                .workRequestId(response.getOpcWorkRequestId())
                                .build())
                .execute();
    }
}
