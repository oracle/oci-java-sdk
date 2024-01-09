/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.apigateway.DeploymentClient;
import com.oracle.bmc.apigateway.GatewayClient;
import com.oracle.bmc.apigateway.model.ApiSpecification;
import com.oracle.bmc.apigateway.model.ApiSpecificationRoute;
import com.oracle.bmc.apigateway.model.CreateDeploymentDetails;
import com.oracle.bmc.apigateway.model.CreateGatewayDetails;
import com.oracle.bmc.apigateway.model.Deployment;
import com.oracle.bmc.apigateway.model.Gateway;
import com.oracle.bmc.apigateway.model.HTTPBackend;
import com.oracle.bmc.apigateway.requests.CreateDeploymentRequest;
import com.oracle.bmc.apigateway.requests.CreateGatewayRequest;
import com.oracle.bmc.apigateway.requests.DeleteDeploymentRequest;
import com.oracle.bmc.apigateway.requests.DeleteGatewayRequest;
import com.oracle.bmc.apigateway.requests.GetDeploymentRequest;
import com.oracle.bmc.apigateway.requests.GetGatewayRequest;
import com.oracle.bmc.apigateway.responses.CreateDeploymentResponse;
import com.oracle.bmc.apigateway.responses.CreateGatewayResponse;
import com.oracle.bmc.apigateway.responses.GetDeploymentResponse;
import com.oracle.bmc.apigateway.responses.GetGatewayResponse;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateInternetGatewayDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.IngressSecurityRule;
import com.oracle.bmc.core.model.InternetGateway;
import com.oracle.bmc.core.model.PortRange;
import com.oracle.bmc.core.model.RouteRule;
import com.oracle.bmc.core.model.RouteTable;
import com.oracle.bmc.core.model.SecurityList;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.TcpOptions;
import com.oracle.bmc.core.model.UpdateRouteTableDetails;
import com.oracle.bmc.core.model.UpdateSecurityListDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.requests.CreateInternetGatewayRequest;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.DeleteInternetGatewayRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.GetInternetGatewayRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.ListRouteTablesRequest;
import com.oracle.bmc.core.requests.ListSecurityListsRequest;
import com.oracle.bmc.core.requests.UpdateRouteTableRequest;
import com.oracle.bmc.core.requests.UpdateSecurityListRequest;
import com.oracle.bmc.core.responses.CreateInternetGatewayResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.core.responses.ListRouteTablesResponse;
import com.oracle.bmc.core.responses.ListSecurityListsResponse;
import com.oracle.bmc.core.responses.UpdateRouteTableResponse;
import com.oracle.bmc.model.BmcException;

/**
 * This class provides a basic example of how to create a Gateway and Deployment using the Java SDK.
 * It creates a public gateway and deploys a simple endpoint with a HTTP backend.
 *
 * <p>The example has some pre-requisites. You will need to create a Compartment and add policies to
 * allow the API Gateway service to use the Virtual Network Family, Functions Family and manage
 * Public IPs in that compartment.
 *
 * <p>This example will do the following things:
 *
 * <ul>
 *   <li>Create VCN, Internet Gateway and Subnet in the provided compartment
 *   <li>Create a API Gateway and Deployment
 *   <li>Clean up, destroy the resources created
 *       <ul>
 */
public class ApiGatewayExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    private static final String NAME = "java-sdk-apigw-example";
    private static final String CIDR_BLOCK = "10.0.0.0/24";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment where the gateway and associated resources will be
     *           created
     *       <li>Optional. The regionId for the region where the resources will be created
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            throw new IllegalArgumentException("OCID for the compartment is required");
        }

        final String compartmentId = args[0];
        final Region region = args.length == 1 ? Region.US_PHOENIX_1 : Region.fromRegionId(args[2]);

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final VirtualNetworkClient vcnClient =
                VirtualNetworkClient.builder().region(region).build(provider);
        final GatewayClient gatewayClient = GatewayClient.builder().region(region).build(provider);
        final DeploymentClient deploymentClient =
                DeploymentClient.builder().region(region).build(provider);

        vcnClient.setRegion(region);
        gatewayClient.setRegion(region);
        deploymentClient.setRegion(region);

        Vcn vcn = null;
        InternetGateway ig = null;
        RouteTable rt = null;
        Subnet subnet = null;
        Gateway gateway = null;
        Deployment deployment = null;
        try {
            // A VCN and subnet is required to create a gateway
            System.out.print("Creating VCN... ");
            vcn = createVcn(vcnClient, compartmentId);
            System.out.println("OK");
            System.out.println("Name: " + vcn.getDisplayName() + "\n");

            System.out.print("Creating internet gateway... ");
            ig = createInternetGateway(vcnClient, compartmentId, vcn.getId());
            System.out.println("OK");
            System.out.println("Name: " + ig.getDisplayName() + "\n");

            rt = configureInternetGateway(vcnClient, compartmentId, vcn.getId(), ig.getId());
            configureSecurityList(vcnClient, compartmentId, vcn.getId());

            System.out.print("Creating VCN subnet... ");
            subnet = createSubnet(vcnClient, compartmentId, vcn.getId());
            System.out.println("OK");
            System.out.println("Name: " + subnet.getDisplayName() + "\n");

            System.out.print("Creating gateway... ");
            gateway = createGateway(gatewayClient, compartmentId, subnet.getId());
            System.out.println("OK");
            System.out.println("Name: " + gateway.getDisplayName());
            System.out.println("Gateway hostname: " + gateway.getHostname() + "\n");

            System.out.print("Creating deployment... ");
            deployment = createDeployment(deploymentClient, compartmentId, gateway.getId());
            System.out.println("OK");
            System.out.println("Name: " + deployment.getDisplayName());
            System.out.println(
                    "Sample API Endpoint: https://" + gateway.getHostname() + "/v1/hello" + "\n");

            // Uncomment this line if you want to wait before deleting the sample endpoint
            // pressEnterToContinue();
        } finally {
            System.out.println("Cleaning Up");
            System.out.println("==========");

            if (deployment != null) {
                System.out.print("Deleting deployment... ");
                deleteDeployment(deploymentClient, deployment);
                System.out.println("OK");
            }

            if (gateway != null) {
                System.out.print("Deleting gateway... ");
                deleteGateway(gatewayClient, gateway);
                System.out.println("OK");
            }

            if (subnet != null) {
                System.out.print("Deleting VCN subnet... ");
                deleteSubnet(vcnClient, subnet);
                System.out.println("OK");
            }

            if (ig != null) {
                System.out.print("Deleting internet gateway... ");
                if (rt != null) {
                    prepareDefaultRouteTableForDelete(vcnClient, rt.getId());
                }
                deleteInternetGateway(vcnClient, ig);
                System.out.println("OK");
            }

            if (vcn != null) {
                System.out.print("Deleting VCN... ");
                deleteVcn(vcnClient, vcn);
                System.out.println("OK");
            }

            deploymentClient.close();
            gatewayClient.close();
            vcnClient.close();
        }
    }

    /**
     * Creates a VCN and waits for it to become available to use.
     *
     * @param vcnClient the service client to use to create the VCN
     * @param compartmentId the OCID of the compartment where the VCN will be created
     * @return the created VCN
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
                                                .displayName(vcnName())
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
     * Creates a Internet Gateway and waits for it to become available to use.
     *
     * @param vcnClient the service client to use to create the InternetGateway
     * @param compartmentId the OCID of the compartment where the InternetGateway will be created
     * @return the created InternetGateway
     * @throws Exception if there is an error waiting on the InternetGateway to become available to
     *     use
     */
    private static InternetGateway createInternetGateway(
            final VirtualNetworkClient vcnClient, final String compartmentId, final String vcnId)
            throws Exception {

        final CreateInternetGatewayResponse createInternetGatewayResponse =
                vcnClient.createInternetGateway(
                        CreateInternetGatewayRequest.builder()
                                .createInternetGatewayDetails(
                                        CreateInternetGatewayDetails.builder()
                                                .compartmentId(compartmentId)
                                                .displayName(igName())
                                                .vcnId(vcnId)
                                                .isEnabled(true)
                                                .build())
                                .build());

        vcnClient
                .getWaiters()
                .forInternetGateway(
                        GetInternetGatewayRequest.builder()
                                .igId(createInternetGatewayResponse.getInternetGateway().getId())
                                .build(),
                        InternetGateway.LifecycleState.Available)
                .execute();

        return createInternetGatewayResponse.getInternetGateway();
    }

    /**
     * Configure the default RouteTable of the specified InternetGateway to ensure it contains a
     * single outbound route for all traffic.
     *
     * <p>NB: You should restrict these routes further if you keep this piece of OCI infrastructure.
     *
     * @param vcnClient the service client to use to query a RouteTable.
     * @param compartmentId of the RouteTable.
     * @param vcnId of the RouteTable's associated VCN.
     * @param igId of the RouteTable's associated InternetGateway.
     * @return the RouteTable
     * @throws Exception when its not able to find a uniquely named InternetGateway
     */
    private static RouteTable configureInternetGateway(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnId,
            final String igId)
            throws Exception {

        final RouteTable defaultRouteTable =
                getUniqueRouteTableByName(vcnClient, compartmentId, vcnId, drtName());

        final String destinationCidr = "0.0.0.0/0";
        final List<RouteRule> routeRules = defaultRouteTable.getRouteRules();
        routeRules.add(
                RouteRule.builder()
                        .cidrBlock(destinationCidr)
                        .destination(destinationCidr)
                        .destinationType(RouteRule.DestinationType.valueOf("CidrBlock"))
                        .networkEntityId(igId)
                        .build());

        final UpdateRouteTableResponse updateRouteTableResponse =
                vcnClient.updateRouteTable(
                        UpdateRouteTableRequest.builder()
                                .rtId(defaultRouteTable.getId())
                                .updateRouteTableDetails(
                                        UpdateRouteTableDetails.builder()
                                                .routeRules(routeRules)
                                                .build())
                                .build());

        return updateRouteTableResponse.getRouteTable();
    }

    /**
     * Gets RouteTable info of a single uniquely named RouteTable in the specified compartment.
     *
     * @param vcnClient the service client to use to query a RouteTable.
     * @param compartmentId of the RouteTable.
     * @param vcnId of the RouteTable's associated VCN.
     * @param rtDisplayName of the RouteTable.
     * @return the RouteTable.
     * @throws Exception when its not able to find a uniquely named RouteTable
     */
    private static RouteTable getUniqueRouteTableByName(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnId,
            final String rtDisplayName)
            throws Exception {

        // Find the route table in a specific compartment
        final ListRouteTablesRequest listRouteTablesRequest =
                ListRouteTablesRequest.builder()
                        .compartmentId(compartmentId)
                        .vcnId(vcnId)
                        .displayName(rtDisplayName)
                        .build();

        final ListRouteTablesResponse listRouteTablesResponse =
                vcnClient.listRouteTables(listRouteTablesRequest);

        if (listRouteTablesResponse.getItems().size() != 1) {
            throw new Exception(
                    "Could not find unique RouteTable with name "
                            + rtDisplayName
                            + " in compartment "
                            + compartmentId);
        }

        return listRouteTablesResponse.getItems().get(0);
    }

    /**
     * Configure the default SecurityList of the specified VCN to ensure it contains an inbound rule
     * to allow traffic on port 443.
     *
     * <p>NB: You should restrict this traffic further if you keep this piece of OCI infrastructure.
     *
     * @param vcnClient the service client to use to query a SecurityList.
     * @param compartmentId of the SecurityList.
     * @param vcnId of the SecurityList's associated VCN.
     * @throws Exception when its not able to find a uniquely named SecurityList
     */
    private static void configureSecurityList(
            final VirtualNetworkClient vcnClient, final String compartmentId, final String vcnId)
            throws Exception {

        final SecurityList defaultSecurityList =
                getUniqueSecurityListByName(vcnClient, compartmentId, vcnId, dslName());

        final String sourceCidr = "0.0.0.0/0";
        final List<IngressSecurityRule> ingressRules =
                defaultSecurityList.getIngressSecurityRules();
        ingressRules.add(
                IngressSecurityRule.builder()
                        .sourceType(IngressSecurityRule.SourceType.CidrBlock)
                        .source(sourceCidr)
                        .protocol("6") // TCP
                        .tcpOptions(
                                TcpOptions.builder()
                                        .destinationPortRange(
                                                PortRange.builder().min(443).max(443).build())
                                        .build())
                        .build());

        vcnClient.updateSecurityList(
                UpdateSecurityListRequest.builder()
                        .securityListId(defaultSecurityList.getId())
                        .updateSecurityListDetails(
                                UpdateSecurityListDetails.builder()
                                        .ingressSecurityRules(ingressRules)
                                        .build())
                        .build());
    }

    /**
     * Gets SecurityList info of a single uniquely named SecurityList in the specified compartment.
     *
     * @param vcnClient the service client to use to query a SecurityList.
     * @param compartmentId of the SecurityList.
     * @param vcnId of the SecurityList's associated VCN.
     * @param slDisplayName of the SecurityList.
     * @return the SecurityList.
     * @throws Exception when its not able to find a uniquely named SecurityList
     */
    private static SecurityList getUniqueSecurityListByName(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnId,
            final String slDisplayName)
            throws Exception {

        // Find the route table in a specific compartment
        final ListSecurityListsRequest listSecurityListsRequest =
                ListSecurityListsRequest.builder()
                        .compartmentId(compartmentId)
                        .vcnId(vcnId)
                        .displayName(slDisplayName)
                        .build();

        final ListSecurityListsResponse listSecurityListsResponse =
                vcnClient.listSecurityLists(listSecurityListsRequest);

        if (listSecurityListsResponse.getItems().size() != 1) {
            throw new Exception(
                    "Could not find unique SecurityList with name "
                            + slDisplayName
                            + " in compartment "
                            + compartmentId);
        }

        return listSecurityListsResponse.getItems().get(0);
    }

    /**
     * Creates a subnet in a VCN and waits for the subnet to become available to use.
     *
     * @param vcnClient the service client to use to create the subnet
     * @param compartmentId the OCID of the compartment which owns the VCN
     * @param vcnId the ID of the VCN which will own the subnet
     * @return the created subnet
     * @throws Exception if there is an error waiting on the subnet to become available to use
     */
    private static Subnet createSubnet(
            final VirtualNetworkClient vcnClient, final String compartmentId, final String vcnId)
            throws Exception {

        final CreateSubnetResponse createSubnetResponse =
                vcnClient.createSubnet(
                        CreateSubnetRequest.builder()
                                .createSubnetDetails(
                                        CreateSubnetDetails.builder()
                                                .compartmentId(compartmentId)
                                                .displayName(subnetName())
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
     * Creates a gateway in a subnet and waits for the gateway to become available to use.
     *
     * @param gatewayClient the service client to use to create the gateway
     * @param compartmentId the OCID of the compartment which owns the subnet
     * @param subnetId the ID of the subnet which will own the gateway
     * @return the created gateway
     * @throws Exception if there is an error waiting on the gateway to become available to use
     */
    private static Gateway createGateway(
            final GatewayClient gatewayClient, final String compartmentId, final String subnetId)
            throws Exception {

        final CreateGatewayResponse createGatewayResponse =
                gatewayClient.createGateway(
                        CreateGatewayRequest.builder()
                                .createGatewayDetails(
                                        CreateGatewayDetails.builder()
                                                .compartmentId(compartmentId)
                                                .subnetId(subnetId)
                                                .displayName(gatewayName())
                                                .endpointType(Gateway.EndpointType.Public)
                                                .build())
                                .build());

        final GetGatewayResponse getGatewayResponse =
                gatewayClient
                        .getWaiters()
                        .forGateway(
                                GetGatewayRequest.builder()
                                        .gatewayId(createGatewayResponse.getGateway().getId())
                                        .build(),
                                Gateway.LifecycleState.Active)
                        .execute();

        return getGatewayResponse.getGateway();
    }

    /**
     * Creates a deployment in a gateway and waits for the deployment to become available to use.
     *
     * @param deploymentClient the service client to use to create the deployment
     * @param compartmentId the OCID of the compartment which owns the gateway
     * @param gatewayId the ID of the gateway which will own the deployment
     * @return the created deployment
     * @throws Exception if there is an error waiting on the deployment to become available to use
     */
    private static Deployment createDeployment(
            final DeploymentClient deploymentClient,
            final String compartmentId,
            final String gatewayId)
            throws Exception {

        final CreateDeploymentResponse createDeploymentResponse =
                deploymentClient.createDeployment(
                        CreateDeploymentRequest.builder()
                                .createDeploymentDetails(
                                        CreateDeploymentDetails.builder()
                                                .compartmentId(compartmentId)
                                                .gatewayId(gatewayId)
                                                .displayName(deploymentName())
                                                .pathPrefix("/v1")
                                                .specification(
                                                        ApiSpecification.builder()
                                                                .routes(
                                                                        Collections
                                                                                .unmodifiableList(
                                                                                        Arrays
                                                                                                .asList(
                                                                                                        ApiSpecificationRoute
                                                                                                                .builder()
                                                                                                                .methods(
                                                                                                                        Collections
                                                                                                                                .singletonList(
                                                                                                                                        ApiSpecificationRoute
                                                                                                                                                .Methods
                                                                                                                                                .Get))
                                                                                                                .path(
                                                                                                                        "/hello")
                                                                                                                .backend(
                                                                                                                        HTTPBackend
                                                                                                                                .builder()
                                                                                                                                .url(
                                                                                                                                        "https://api.weather.gov")
                                                                                                                                .build())
                                                                                                                .build())))
                                                                .build())
                                                .build())
                                .build());

        final GetDeploymentResponse getDeploymentResponse =
                deploymentClient
                        .getWaiters()
                        .forDeployment(
                                GetDeploymentRequest.builder()
                                        .deploymentId(
                                                createDeploymentResponse.getDeployment().getId())
                                        .build(),
                                Deployment.LifecycleState.Active)
                        .execute();

        return getDeploymentResponse.getDeployment();
    }

    private static void pressEnterToContinue() {
        System.out.println("Press ENTER to continue... ");
        new Scanner(System.in).nextLine();
    }

    /**
     * Deletes a deployment and waits for it to be deleted.
     *
     * @param deploymentClient the service client to use to delete the deployment
     * @param deployment the deployment to delete
     * @throws Exception if there is an error waiting on the deployment to be deleted
     */
    private static void deleteDeployment(
            final DeploymentClient deploymentClient, final Deployment deployment) throws Exception {

        deploymentClient.deleteDeployment(
                DeleteDeploymentRequest.builder().deploymentId(deployment.getId()).build());

        deploymentClient
                .getWaiters()
                .forDeployment(
                        GetDeploymentRequest.builder().deploymentId(deployment.getId()).build(),
                        Deployment.LifecycleState.Deleted)
                .execute();
    }

    /**
     * Deletes a gateway and waits for it to be deleted.
     *
     * @param gatewayClient the service client to use to delete the gateway
     * @param gateway the gateway to delete
     * @throws Exception if there is an error waiting on the gateway to be deleted
     */
    private static void deleteGateway(final GatewayClient gatewayClient, final Gateway gateway)
            throws Exception {

        gatewayClient.deleteGateway(
                DeleteGatewayRequest.builder().gatewayId(gateway.getId()).build());

        gatewayClient
                .getWaiters()
                .forGateway(
                        GetGatewayRequest.builder().gatewayId(gateway.getId()).build(),
                        Gateway.LifecycleState.Deleted)
                .execute();
    }

    /**
     * Deletes a subnet and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the subnet
     * @param subnet the subnet to delete
     * @throws Exception if there is an error waiting on the subnet to be deleted
     */
    private static void deleteSubnet(final VirtualNetworkClient vcnClient, final Subnet subnet)
            throws Exception {

        final int DELETE_SUBNET_ATTEMPTS = 5;
        /*
         * Sometimes we can't delete the subnet straight after a deployment has been deleted
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
        // Wait for 'Terminated' state.
        vcnClient
                .getWaiters()
                .forSubnet(
                        GetSubnetRequest.builder().subnetId(subnet.getId()).build(),
                        Subnet.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Prepares a DefaultRouteTable for deletion by deleting all RouteRules.
     *
     * @param vcnClient the service client to use to delete the RouteTable.
     * @param rtId the RouteTable to delete.
     */
    private static void prepareDefaultRouteTableForDelete(
            final VirtualNetworkClient vcnClient, final String rtId) {

        vcnClient.updateRouteTable(
                UpdateRouteTableRequest.builder()
                        .rtId(rtId)
                        .updateRouteTableDetails(
                                UpdateRouteTableDetails.builder()
                                        .routeRules(new ArrayList<>())
                                        .build())
                        .build());
    }

    /**
     * Deletes a InternetGateway and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the InternetGateway.
     * @param ig the InternetGateway to delete.
     * @throws Exception if there is an error waiting on the InternetGateway to be deleted
     */
    private static void deleteInternetGateway(
            final VirtualNetworkClient vcnClient, final InternetGateway ig) throws Exception {

        vcnClient.deleteInternetGateway(
                DeleteInternetGatewayRequest.builder().igId(ig.getId()).build());

        vcnClient
                .getWaiters()
                .forInternetGateway(
                        GetInternetGatewayRequest.builder().igId(ig.getId()).build(),
                        InternetGateway.LifecycleState.Terminated)
                .execute();
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN.
     * @param vcn the VCN to delete.
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

    // === Utility Helpers ===

    private static String vcnName() {
        return ApiGatewayExample.NAME + "-vcn";
    }

    private static String igName() {
        return ApiGatewayExample.NAME + "-ig";
    }

    private static String drtName() {
        return "Default Route Table for " + ApiGatewayExample.NAME + "-vcn";
    }

    private static String dslName() {
        return "Default Security List for " + ApiGatewayExample.NAME + "-vcn";
    }

    private static String subnetName() {
        return ApiGatewayExample.NAME + "-subnet";
    }

    private static String gatewayName() {
        return ApiGatewayExample.NAME + "-gateway";
    }

    private static String deploymentName() {
        return ApiGatewayExample.NAME + "-deployment";
    }
}
