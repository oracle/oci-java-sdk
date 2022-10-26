/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.loadbalancer.LoadBalancerClient;
import com.oracle.bmc.loadbalancer.model.*;
import com.oracle.bmc.loadbalancer.requests.*;
import com.oracle.bmc.loadbalancer.responses.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateLoadBalancerSSLCipherExample {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // TODO: Fill in these values
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        String loadBalancerId = "SOME_OCID";
        String policy = "ROUND_ROBIN";
        int listenerPort = 80;
        String listenerName = "SOME_LISTENER_NAME";
        String backendSetName = "SOME_BACKEND_SET_NAME";
        String listenerProtocol =
                "HTTP"; // Rules in this example are applicable to HTTP or HTTP2 protocols
        String cipherName = "TEST_CIPHER";
        List<String> ciphers =
                Arrays.asList(
                        "ECDHE-RSA-AES256-GCM-SHA384",
                        "ECDHE-ECDSA-AES256-GCM-SHA384",
                        "ECDHE-RSA-AES128-GCM-SHA256");
        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        LoadBalancerClient loadBalancerClient = new LoadBalancerClient(provider);

        System.out.println(
                "Creating new ssl ciphers " + cipherName + " with ciphers" + ciphers + "...");

        createSSLCipherSuite(loadBalancerClient, loadBalancerId, cipherName, ciphers);

        SSLConfigurationDetails sslConfigurationDetails =
                SSLConfigurationDetails.builder()
                        .certificateName("Example-certificate")
                        .cipherSuiteName(cipherName)
                        .protocols(Arrays.asList("TLSv1.1", "TLSv1.2"))
                        .build();

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
                lbcspDetails,
                sslConfigurationDetails);

        System.out.println("Backend set " + backendSetName + " has been created.");

        System.out.println("Creating new Listener set " + listenerName + "...");

        createListener(
                loadBalancerClient,
                loadBalancerId,
                listenerPort,
                listenerName,
                backendSetName,
                listenerProtocol,
                sslConfigurationDetails);
        System.out.println("Listener " + listenerName + " is created...");

        updateSSLCipherSuite(
                loadBalancerClient,
                loadBalancerId,
                cipherName,
                Arrays.asList("DHE-DSS-AES256-SHA256", "CAMELLIA256-SHA"));

        loadBalancerClient.close();
    }

    private static void createListener(
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            int listenerPort,
            String listenerName,
            String backendSetName,
            String listenerProtocol,
            SSLConfigurationDetails sslConfigurationDetails)
            throws Exception {
        CreateListenerResponse response =
                loadBalancerClient.createListener(
                        CreateListenerRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .createListenerDetails(
                                        CreateListenerDetails.builder()
                                                .name(listenerName)
                                                .defaultBackendSetName(backendSetName)
                                                .port(listenerPort)
                                                .protocol(listenerProtocol)
                                                .sslConfiguration(sslConfigurationDetails)
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

    private static void createSSLCipherSuite(
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            String cipherName,
            List<String> ciphers)
            throws Exception {
        CreateSSLCipherSuiteResponse response =
                loadBalancerClient.createSSLCipherSuite(
                        CreateSSLCipherSuiteRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .createSSLCipherSuiteDetails(
                                        CreateSSLCipherSuiteDetails.builder()
                                                .name(cipherName)
                                                .ciphers(ciphers)
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
     * @param sslConfigurationDetails the ssl configuration object
     */
    private static void createBackendSet(
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            String backendSetName,
            String policy,
            HealthCheckerDetails healthChecker,
            LBCookieSessionPersistenceConfigurationDetails lbcspDetails,
            SSLConfigurationDetails sslConfigurationDetails)
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
                                                .sslConfiguration(sslConfigurationDetails)
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
     * @param cipherName the name of the cipher to be updated
     * @param updatedCiphers The updated array of ciphers
     */
    private static void updateSSLCipherSuite(
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            String cipherName,
            List<String> updatedCiphers)
            throws Exception {

        UpdateSSLCipherSuiteResponse response =
                loadBalancerClient.updateSSLCipherSuite(
                        UpdateSSLCipherSuiteRequest.builder()
                                .loadBalancerId(loadBalancerId)
                                .name(cipherName)
                                .updateSSLCipherSuiteDetails(
                                        UpdateSSLCipherSuiteDetails.builder()
                                                .ciphers(updatedCiphers)
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
