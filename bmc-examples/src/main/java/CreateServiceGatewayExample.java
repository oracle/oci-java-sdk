/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateServiceGatewayDetails;
import com.oracle.bmc.core.model.ServiceGateway;
import com.oracle.bmc.core.model.ServiceIdRequestDetails;
import com.oracle.bmc.core.requests.CreateServiceGatewayRequest;
import com.oracle.bmc.core.requests.DeleteServiceGatewayRequest;
import com.oracle.bmc.core.requests.GetServiceGatewayRequest;
import com.oracle.bmc.core.responses.CreateServiceGatewayResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an example of how to create a ServiceGateway from scratch.
 * <p>
 * The Service Gateway created by this example will be assigned:
 * <ul>
 * <li>a display name defined by constant DISPLAY_NAME</li>
 * <li>a VCN defined by constant VCN_ID</li>
 * <li>a route table defined by constant ROUTE_TABLE_ID</li>
 * <li>
 * The configuration file used by service clients will be sourced from the default
 * location (~/.oci/config) and the DEFAULT profile will be used
 * </li>
 * </ul>
 * </p>
 */
public class CreateServiceGatewayExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String DISPLAY_NAME = "javaSdk_ServiceGatewayExample_SG";
    private static final String VCN_ID = ""; // Required
    private static final String ROUTE_TABLE_ID = ""; // Required

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *             <ul>
     *             <li>The OCID of the compartment where a Service Gateway will be created for tagging.</li>
     *             </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "This example expects one argument: a compartment OCID");
        }
        final String compartmentId = args[0];

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parse(CONFIG_LOCATION);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final VirtualNetworkClient virtualNetworkClient = new VirtualNetworkClient(provider);

        // NOTE: For the purpose of this example, services field is passed empty.
        // Pass service values to reach required Oracle Services.
        List<ServiceIdRequestDetails> services = new ArrayList<>();

        final CreateServiceGatewayDetails serviceGatewayDetails =
                CreateServiceGatewayDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName(DISPLAY_NAME)
                        .vcnId(VCN_ID)
                        .routeTableId(ROUTE_TABLE_ID)
                        .services(services)
                        .build();

        final CreateServiceGatewayResponse serviceGatewayResponse =
                virtualNetworkClient.createServiceGateway(
                        CreateServiceGatewayRequest.builder()
                                .createServiceGatewayDetails(serviceGatewayDetails)
                                .build());

        final ServiceGateway serviceGateway = serviceGatewayResponse.getServiceGateway();
        System.out.println(String.format("Created service gateway %s", serviceGateway.getId()));

        if (serviceGateway != null) {
            System.out.println("Delete Service Gateway...");
            deleteServiceGateway(virtualNetworkClient, serviceGateway);
            System.out.println("Deleted Service Gateway");
        }
    }

    /**
     * Delete Service Gateway
     *
     * @param serviceGateway the service gateway to be deleted
     * @throws Exception
     */
    private static void deleteServiceGateway(
            VirtualNetworkClient virtualNetworkClient, ServiceGateway serviceGateway)
            throws Exception {
        DeleteServiceGatewayRequest request =
                DeleteServiceGatewayRequest.builder()
                        .serviceGatewayId(serviceGateway.getId())
                        .build();

        virtualNetworkClient.deleteServiceGateway(request);
        virtualNetworkClient
                .getWaiters()
                .forServiceGateway(
                        GetServiceGatewayRequest.builder()
                                .serviceGatewayId(serviceGateway.getId())
                                .build(),
                        ServiceGateway.LifecycleState.Terminated)
                .execute();
    }
}
