/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.loadbalancer.LoadBalancerClient;
import com.oracle.bmc.loadbalancer.model.BackendDetails;
import com.oracle.bmc.loadbalancer.model.CreateBackendSetDetails;
import com.oracle.bmc.loadbalancer.model.HealthCheckerDetails;
import com.oracle.bmc.loadbalancer.requests.CreateBackendSetRequest;
import com.oracle.bmc.loadbalancer.requests.DeleteBackendSetRequest;
import com.oracle.bmc.loadbalancer.responses.CreateBackendSetResponse;
import com.oracle.bmc.loadbalancer.requests.UpdateBackendSetRequest;
import com.oracle.bmc.loadbalancer.responses.DeleteBackendSetResponse;
import com.oracle.bmc.loadbalancer.responses.UpdateBackendSetResponse;
import com.oracle.bmc.loadbalancer.model.UpdateBackendSetDetails;
import com.oracle.bmc.loadbalancer.requests.GetWorkRequestRequest;
import com.oracle.bmc.loadbalancer.model.LBCookieSessionPersistenceConfigurationDetails;

import java.util.ArrayList;
import java.util.List;

/**
 * This document demonstrates the creation of a backend set with various configurations. A backend
 * set is a collection of backend servers which receive traffic from a load balancer. Each backend
 * set must define a list of backend servers, a policy for distribution of traffic, and establish a
 * method for periodically determining the health state of each of the backend servers. At least one
 * properly configured backend set is a requirement for a functioning load balancer. Please refer to
 * https://docs.cloud.oracle.com/iaas/api/#/en/loadbalancer/20170115/BackendSet/CreateBackendSet for
 * information about using the API to create a backend set. This example requires an existing load
 * balancer and will do the following 1) Create a new backend set with one backend, the "round
 * robin" distribution policy, a health check on port 80 of the backend at the location
 * "/healthcheck", and LB cookie session persistence enabled. 2) Update this backend set by removing
 * the LB cookie session persistence configuration 3) Remove the backend set from the load balancer.
 *
 * @throws Exception
 */
public class CreateLoadBalancerBackendSetExample {
    public static void main(String[] args) throws Exception {

        // TODO: Alter these values if they differ on your system
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // TODO: You will need an existing load balancer's OCID
        String loadBalancerId = "YOUR.LOAD.BALANCER.OCID.HERE";

        String backendSetName = "BackendSetExample";
        String policy = "ROUND_ROBIN";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        LoadBalancerClient loadBalancerClient = LoadBalancerClient.builder().build(provider);

        System.out.println("Creating new backend set " + backendSetName + "...");

        LBCookieSessionPersistenceConfigurationDetails lbcspDetails =
                LBCookieSessionPersistenceConfigurationDetails.builder()
                        .cookieName("X-ORACLE-OCI-lb-persist-cookie-1")
                        .disableFallback(Boolean.FALSE)
                        .domain("www.example.org")
                        .path("/")
                        .build();

        HealthCheckerDetails healthChecker =
                HealthCheckerDetails.builder()
                        .port(80)
                        .protocol("HTTP")
                        .urlPath("/healthcheck")
                        .responseBodyRegex(".*")
                        .build();

        createBackendSet(
                loadBalancerClient,
                loadBalancerId,
                backendSetName,
                policy,
                healthChecker,
                lbcspDetails);

        System.out.println("Backend set " + backendSetName + " has been created.");

        System.out.println(
                "Removing LB Cookie Session Persistence config from " + backendSetName + "...");
        updateBackendSet(loadBalancerClient, loadBalancerId, backendSetName, policy, healthChecker);

        System.out.println(
                "Removing backend set " + backendSetName + " from LB " + loadBalancerId + "...");
        deleteBackendSet(loadBalancerClient, loadBalancerId, backendSetName);
        loadBalancerClient.close();
    }

    /**
     * Creates a backend set in a given load balancer.
     *
     * @param loadBalancerClient the client used to communicate with the service
     * @param loadBalancerId the OCID of the load balancer we're adding the backend set to
     * @param backendSetName a string display name for the backend set
     * @param policy The load balancing policy for the backends (such as ROUND_ROBIN,
     *     LEAST_CONNECTIONS, etc)
     * @param healthChecker a healthCheckerDetails object describing the health check parameters for
     *     the backends
     * @param lbcspDetails a LBCookieSessionPersistenceConfigurationDetails object describing the
     *     parameters for LB cookie-based session persistence
     */
    private static void createBackendSet(
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            String backendSetName,
            String policy,
            HealthCheckerDetails healthChecker,
            LBCookieSessionPersistenceConfigurationDetails lbcspDetails)
            throws Exception {

        CreateBackendSetResponse response =
                loadBalancerClient.createBackendSet(
                        CreateBackendSetRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .createBackendSetDetails(
                                        CreateBackendSetDetails.builder()
                                                .name(backendSetName)
                                                .policy(policy)
                                                .healthChecker(healthChecker)
                                                .lbCookieSessionPersistenceConfiguration(
                                                        lbcspDetails)
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

    /**
     * Updates a backend set in a given load balancer.
     *
     * @param loadBalancerClient the client used to communicate with the service
     * @param loadBalancerId the OCID of the load balancer that contains the backend set to update
     * @param backendSetName the name of the backend set to be updated
     * @param policy The load balancing policy for the backends (such as ROUND_ROBIN,
     *     LEAST_CONNECTIONS, etc)
     * @param healthChecker a healthCheckerDetails object describing the health check parameters for
     *     the backend.
     */
    private static void updateBackendSet(
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            String backendSetName,
            String policy,
            HealthCheckerDetails healthChecker)
            throws Exception {

        List<BackendDetails> backends = new ArrayList<BackendDetails>();
        backends.add(BackendDetails.builder().ipAddress("10.0.0.5").port(80).build());

        UpdateBackendSetResponse response =
                loadBalancerClient.updateBackendSet(
                        UpdateBackendSetRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .backendSetName(backendSetName)
                                .updateBackendSetDetails(
                                        UpdateBackendSetDetails.builder()
                                                .backends(backends)
                                                .policy(policy)
                                                .healthChecker(healthChecker)
                                                .lbCookieSessionPersistenceConfiguration(null)
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

    /**
     * Updates a backend set in a given load balancer.
     *
     * @param loadBalancerClient the client used to communicate with the service
     * @param loadBalancerId the OCID of the load balancer that contains the backend set to delete
     * @param backendSetName the name of the backend set to delete
     */
    private static void deleteBackendSet(
            LoadBalancerClient loadBalancerClient, String loadBalancerId, String backendSetName)
            throws Exception {
        DeleteBackendSetResponse response =
                loadBalancerClient.deleteBackendSet(
                        DeleteBackendSetRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .backendSetName(backendSetName)
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
