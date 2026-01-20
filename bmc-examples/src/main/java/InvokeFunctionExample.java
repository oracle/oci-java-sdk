/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.CreateInternetGatewayDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.InternetGateway;
import com.oracle.bmc.core.model.RouteRule;
import com.oracle.bmc.core.model.RouteRule.DestinationType;
import com.oracle.bmc.core.model.RouteTable;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.UpdateRouteTableDetails;
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
import com.oracle.bmc.core.requests.ListInternetGatewaysRequest;
import com.oracle.bmc.core.requests.ListRouteTablesRequest;
import com.oracle.bmc.core.requests.ListSubnetsRequest;
import com.oracle.bmc.core.requests.ListVcnsRequest;
import com.oracle.bmc.core.requests.UpdateRouteTableRequest;
import com.oracle.bmc.core.responses.CreateInternetGatewayResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.core.responses.ListInternetGatewaysResponse;
import com.oracle.bmc.core.responses.ListRouteTablesResponse;
import com.oracle.bmc.core.responses.ListSubnetsResponse;
import com.oracle.bmc.core.responses.ListVcnsResponse;
import com.oracle.bmc.core.responses.UpdateRouteTableResponse;
import com.oracle.bmc.functions.FunctionsInvokeClient;
import com.oracle.bmc.functions.FunctionsManagementClient;
import com.oracle.bmc.functions.model.Application;
import com.oracle.bmc.functions.model.ApplicationSummary;
import com.oracle.bmc.functions.model.CreateApplicationDetails;
import com.oracle.bmc.functions.model.CreateFunctionDetails;
import com.oracle.bmc.functions.model.Function;
import com.oracle.bmc.functions.model.FunctionSummary;
import com.oracle.bmc.functions.requests.CreateApplicationRequest;
import com.oracle.bmc.functions.requests.CreateFunctionRequest;
import com.oracle.bmc.functions.requests.DeleteApplicationRequest;
import com.oracle.bmc.functions.requests.DeleteFunctionRequest;
import com.oracle.bmc.functions.requests.GetApplicationRequest;
import com.oracle.bmc.functions.requests.GetFunctionRequest;
import com.oracle.bmc.functions.requests.InvokeFunctionRequest;
import com.oracle.bmc.functions.requests.ListApplicationsRequest;
import com.oracle.bmc.functions.requests.ListFunctionsRequest;
import com.oracle.bmc.functions.responses.CreateApplicationResponse;
import com.oracle.bmc.functions.responses.CreateFunctionResponse;
import com.oracle.bmc.functions.responses.GetApplicationResponse;
import com.oracle.bmc.functions.responses.GetFunctionResponse;
import com.oracle.bmc.functions.responses.InvokeFunctionResponse;
import com.oracle.bmc.functions.responses.ListApplicationsResponse;
import com.oracle.bmc.functions.responses.ListFunctionsResponse;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.StreamUtils;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class InvokeFunctionExample {

    static final Region DEFAULT_REGION = Region.US_PHOENIX_1;

    static final String SETUP = "setup";
    static final String INVOKE = "invoke";
    static final String TEARDOWN = "teardown";

    /**
     * This is a basic example of how to register and invoke a serverless Function on OCI using the
     * Java SDK.
     *
     * <p>The example has some pre-requisites. In particular you will need to create a Function
     * image and publish it to OCI Registry. The best way to do this is with the 'Fn CLI':
     *
     * <p>1. Install Fn CLI : https://github.com/fnproject/cli
     *
     * <p>2. Create Function - Quick Guide : https://github.com/fnproject/fn/blob/master/README.md
     *
     * <p>This sample will do following things:
     *
     * <p>1. Create VCN and subnets - Provide an endpoint on which your function can be invoked.
     *
     * <p>2. Create Application and Function - Register and configure your function.
     *
     * <p>3. Invoke Function - How your function can be invoked.
     *
     * <p>4. Clean-up - Tidy up the resources created above.
     *
     * <p>NB: To simplify things, this example is hardcoded to use the 'us-phoenix-1' OCI region.
     *
     * <p>NB: Currently, after invoking a function we must wait up to 30 minutes before clearing
     * down any supporting Subnets and VCN.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The operation to perform - 'setup', 'invoke' or 'teardown'.
     *       <li>The OCID of the compartment where the function and associated resources will be
     *           created.
     *       <li>A valid OCI Registry function image.
     *       <li>The payload to be sent to the function on invocation (optional).
     *     </ul>
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            throw new IllegalArgumentException(
                    "Invalid number of arguments provided to the script.");
        }

        // Handle commands: {setup, invoke, teardown}
        final String command = args[0];
        if (!command.equalsIgnoreCase(SETUP)
                && !command.equalsIgnoreCase(INVOKE)
                && !command.equalsIgnoreCase(TEARDOWN)) {
            throw new Exception(
                    "Please provide 'setup', 'invoke' or 'teardown' as the first argument.");
        }

        // We need a target compartment.
        final String compartmentId = args[1];

        // We need an accessible image in the Phoenix region to invoke.
        // e.g. phx.ocir.io/tenancy-name/registry/imagename:version
        final String image = args[2];

        // All resources will be prefixed with this name.
        final String name = "oci-java-sdk-function-example";

        // The default region to use.
        final Region region = DEFAULT_REGION;

        // Depending on the image chosen a payload can be specified.
        final String payload = (args.length >= 4) ? args[3] : "";

        // Configure Auth
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        try {
            if (command.equalsIgnoreCase(SETUP)) {
                setupResources(provider, region, compartmentId, name, image);
            }

            if (command.equalsIgnoreCase(INVOKE)) {
                invokeFunction(provider, region, compartmentId, name, payload);
            }

            if (command.equalsIgnoreCase(TEARDOWN)) {
                teardownResources(provider, region, compartmentId, name);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error: " + e);
        }
    }

    /**
     * Create all the OCI and Fn resources required to invoke a function.
     *
     * @param provider the OCI credentials provider.
     * @param region the OCI region in which to create the required resources.
     * @param compartmentId the compartment in which to create the required resources.
     * @param name a name prefix to easily identify the resources.
     * @param image a valid OCI Registry image for the function.
     * @throws Exception
     */
    public static void setupResources(
            final AuthenticationDetailsProvider provider,
            final Region region,
            final String compartmentId,
            final String name,
            final String image)
            throws Exception {

        final Identity identityClient = IdentityClient.builder().region(region).build(provider);

        final VirtualNetworkClient vcnClient =
                VirtualNetworkClient.builder().region(region).build(provider);

        final FunctionsManagementClient fnManagementClient =
                FunctionsManagementClient.builder().region(region).build(provider);

        try {
            // 1. A list of AvailabilityDomains are required to determine where to host each
            // subnet.
            final List<AvailabilityDomain> availabilityDomains =
                    getAvailabilityDomains(identityClient, compartmentId);
            final AvailabilityDomain ad = availabilityDomains.get(0);
            System.out.println("Using availability domain: " + ad.getName());

            // 2. A VCN is required to host subnets.
            final String vcnDisplayName = vcnName(name);
            final String vcnCidrBlock = "10.0.0.0/16";
            final Vcn vcn = createVcn(vcnClient, compartmentId, vcnDisplayName, vcnCidrBlock);
            System.out.println("Created VCN: " + vcn.getDisplayName());

            // 3. An Internet Gateway is required to enable the VCN to talk to the wider world.
            final String igDisplayName = igName(name);
            final InternetGateway ig =
                    createInternetGateway(vcnClient, compartmentId, igDisplayName, vcn.getId());

            // 4. We must configure the VCN's traffic to be routed through the IG.
            final String drtDisplayName = drtName(name);
            configureInternetGateway(
                    vcnClient, compartmentId, vcn.getId(), ig.getId(), drtDisplayName);

            // 5. A subnet is required to expose and be able invoke the function.
            // In multiple AD regions, subnets can be created in multiple ADs to provide
            // redundancy.
            final String subnetDisplayName = subnetName(name);
            final String subnetCidrBlock = "10.0.0.0/24";
            final Subnet subnet =
                    createSubnet(
                            vcnClient,
                            compartmentId,
                            vcn.getId(),
                            subnetDisplayName,
                            ad.getName(),
                            subnetCidrBlock);
            System.out.println("Created VCN subnet: " + subnet.getDisplayName());

            // 6. Create an Application to host and manage the function(s).
            final String appDisplayName = applicationName(name);
            final List<String> subnetIds = new ArrayList<>();
            subnetIds.add(subnet.getId());
            final Application app =
                    createApplication(fnManagementClient, compartmentId, appDisplayName, subnetIds);
            System.out.println("Created Application: " + app.getDisplayName());

            // 7. Create a single Function, set its execution image and limits.
            final String fnDisplayName = functionName(name);
            final long memoryInMBs = 128L;
            final int timeoutInSeconds = 30;
            final Function fn =
                    createFunction(
                            fnManagementClient,
                            app.getId(),
                            fnDisplayName,
                            image,
                            memoryInMBs,
                            timeoutInSeconds);
            System.out.println("Created Function: " + fn.getDisplayName());

        } finally {
            fnManagementClient.close();
            vcnClient.close();
            identityClient.close();
        }
    }

    /**
     * Invoke a function.
     *
     * @param provider the OCI credentials provider.
     * @param region the OCI region in which to create the required resources.
     * @param compartmentId the compartment in which to created the required resources.
     * @param name a name prefix to easily identify the resources.
     * @param payload the payload to be sent to the function on invocation.
     * @throws Exception
     */
    public static void invokeFunction(
            final AuthenticationDetailsProvider provider,
            final Region region,
            final String compartmentId,
            final String name,
            final String payload)
            throws Exception {

        final FunctionsManagementClient fnManagementClient =
                FunctionsManagementClient.builder().region(region).build(provider);

        final FunctionsInvokeClient fnInvokeClient =
                FunctionsInvokeClient.builder().build(provider);

        try {
            // Invoke the function!
            final String appName = applicationName(name);
            final String fnName = functionName(name);
            final FunctionSummary fn =
                    getUniqueFunctionByName(fnManagementClient, compartmentId, appName, fnName);

            final String response = invokeFunction(fnInvokeClient, fn, payload);
            if (response != null) {
                System.out.println("Response from function:  " + response);
            }
        } finally {
            fnInvokeClient.close();
            fnManagementClient.close();
        }
    }

    /**
     * Remove all resources created by the 'setup' operation.
     *
     * <p>NB: Resources can only be removed 30 minutes after the last Function invocation.
     *
     * @param provider the OCI credentials provider.
     * @param region the OCI region in which to create the required resources.
     * @param compartmentId the compartment in which to created the required resources.
     * @param name a name prefix to easily identify the resources.
     * @throws Exception
     */
    public static void teardownResources(
            final AuthenticationDetailsProvider provider,
            final Region region,
            final String compartmentId,
            final String name)
            throws Exception {

        final Identity identityClient = IdentityClient.builder().region(region).build(provider);

        final VirtualNetworkClient vcnClient =
                VirtualNetworkClient.builder().region(region).build(provider);

        final FunctionsManagementClient fnManagementClient =
                FunctionsManagementClient.builder().region(region).build(provider);

        try {
            System.out.println("Cleaning up");

            final String vcnName = vcnName(name);
            final String igName = igName(name);
            final String drtName = drtName(name);
            final String subnetName = subnetName(name);
            final String appName = applicationName(name);
            final String fnName = functionName(name);

            final Vcn vcn = getUniqueVcnByName(vcnClient, compartmentId, vcnName);

            final InternetGateway ig =
                    getUniqueInternetGatewayByName(vcnClient, compartmentId, vcn.getId(), igName);

            final RouteTable rt =
                    getUniqueRouteTableByName(vcnClient, compartmentId, vcn.getId(), drtName);

            final Subnet subnet =
                    getUniqueSubnetByName(vcnClient, compartmentId, vcn.getId(), subnetName);

            final ApplicationSummary application =
                    getUniqueApplicationByName(fnManagementClient, compartmentId, appName);

            final FunctionSummary fn =
                    getUniqueFunctionByName(fnManagementClient, application.getId(), fnName);

            if (fn != null) {
                deleteFunction(fnManagementClient, fn.getId());
                System.out.println("Deleted function: " + fn.getDisplayName());
            }

            if (application != null) {
                deleteApplication(fnManagementClient, application.getId());
                System.out.println("Deleted application: " + application.getDisplayName());
            }

            if (subnet != null) {
                deleteSubnet(vcnClient, subnet.getId());
                System.out.println("Deleted subnet: " + subnet.getDisplayName());
            }

            if (rt != null) {
                prepareDefaultRouteTableForDelete(vcnClient, rt.getId());
                System.out.println("Cleaned route table: " + subnet.getDisplayName());
            }

            if (ig != null) {
                deleteInternetGateway(vcnClient, ig.getId());
                System.out.println("Deleted internet gateway: " + subnet.getDisplayName());
            }

            if (vcn != null) {
                deleteVcn(vcnClient, vcn);
                System.out.println("Deleted VCN: " + vcn.getDisplayName());
            }

        } finally {
            fnManagementClient.close();
            vcnClient.close();
            identityClient.close();
        }
    }

    // === OCI Identity Helpers ===

    /**
     * List the AvailabilityDomains.
     *
     * @param identityClient the service client to use to fetch the AvailabilityDomains.
     * @param compartmentId the OCID of the compartment to check.
     * @return the list of AvailabilityDomains.
     * @throws Exception
     */
    public static List<AvailabilityDomain> getAvailabilityDomains(
            final Identity identityClient, final String compartmentId) throws Exception {

        final ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());

        return listAvailabilityDomainsResponse.getItems();
    }

    // === OCI VCN Helpers ===

    /**
     * Creates a VCN and waits for it to become available to use.
     *
     * @param vcnClient the service client to use to create the VCN.
     * @param compartmentId the OCID of the compartment where the VCN will be created.
     * @param displayName the displayName of the VCN.
     * @param cidrBlock the CidrBlock allocated for the VCN.
     * @return the created VCN.
     * @throws Exception
     */
    private static Vcn createVcn(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String displayName,
            final String cidrBlock)
            throws Exception {

        final CreateVcnResponse createVcnResponse =
                vcnClient.createVcn(
                        CreateVcnRequest.builder()
                                .createVcnDetails(
                                        CreateVcnDetails.builder()
                                                .compartmentId(compartmentId)
                                                .displayName(displayName)
                                                .cidrBlock(cidrBlock)
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
     * Gets VCN info of a single uniquely named VCN in the specified compartment.
     *
     * @param vcnClient the service client to use to query the VCN.
     * @param compartmentId of the VCN.
     * @param vcnDisplayName of the VCN.
     * @return the VCN.
     * @throws Exception
     */
    public static Vcn getUniqueVcnByName(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnDisplayName)
            throws Exception {

        // Find the application in a specific compartment
        final ListVcnsRequest listVcnsRequest =
                ListVcnsRequest.builder()
                        .compartmentId(compartmentId)
                        .displayName(vcnDisplayName)
                        .build();

        final ListVcnsResponse listVcnsResponse = vcnClient.listVcns(listVcnsRequest);

        if (listVcnsResponse.getItems().size() != 1) {
            throw new Exception(
                    "Could not find unique VCN with name "
                            + vcnDisplayName
                            + " in compartment "
                            + compartmentId);
        }

        return listVcnsResponse.getItems().get(0);
    }

    /**
     * Deletes a VCN and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the VCN.
     * @param vcn the VCN to delete.
     * @throws Exception
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

    // === OCI Internet Gateway Helpers ===

    private static InternetGateway createInternetGateway(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String displayName,
            final String vcnId)
            throws Exception {

        final CreateInternetGatewayResponse createInternetGatewayResponse =
                vcnClient.createInternetGateway(
                        CreateInternetGatewayRequest.builder()
                                .createInternetGatewayDetails(
                                        CreateInternetGatewayDetails.builder()
                                                .compartmentId(compartmentId)
                                                .displayName(displayName)
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
     * Gets InternetGateway info of a single uniquely named InternetGateway in the specified
     * compartment.
     *
     * @param vcnClient the service client to use to query the InternetGateway.
     * @param compartmentId of the InternetGateway.
     * @param vcnId of the InternetGateway's associated VCN.
     * @param igDisplayName of the InternetGateway.
     * @return the InternetGateway.
     * @throws Exception
     */
    public static InternetGateway getUniqueInternetGatewayByName(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnId,
            final String igDisplayName)
            throws Exception {

        // Find the application in a specific compartment
        final ListInternetGatewaysRequest listInternetGatewaysRequest =
                ListInternetGatewaysRequest.builder()
                        .compartmentId(compartmentId)
                        .vcnId(vcnId)
                        .displayName(igDisplayName)
                        .build();

        final ListInternetGatewaysResponse listInternetGatewaysResponse =
                vcnClient.listInternetGateways(listInternetGatewaysRequest);

        if (listInternetGatewaysResponse.getItems().size() != 1) {
            throw new Exception(
                    "Could not find unique InternetGateway with name "
                            + igDisplayName
                            + " in compartment "
                            + compartmentId);
        }

        return listInternetGatewaysResponse.getItems().get(0);
    }

    /**
     * Deletes a InternetGateway and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the InternetGateway.
     * @param igId the InternetGateway to delete.
     * @throws Exception
     */
    private static void deleteInternetGateway(
            final VirtualNetworkClient vcnClient, final String igId) throws Exception {

        vcnClient.deleteInternetGateway(DeleteInternetGatewayRequest.builder().igId(igId).build());

        vcnClient
                .getWaiters()
                .forInternetGateway(
                        GetInternetGatewayRequest.builder().igId(igId).build(),
                        InternetGateway.LifecycleState.Terminated)
                .execute();
    }

    // === OCI Route Table Helpers ===

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
     * @param drtDisplayName of the RouteTable.
     * @return the InternetGateway.
     * @throws Exception
     */
    private static RouteTable configureInternetGateway(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnId,
            final String igId,
            final String rtDisplayName)
            throws Exception {

        final RouteTable defaultRouteTable =
                getUniqueRouteTableByName(vcnClient, compartmentId, vcnId, rtDisplayName);

        final String destinationCidr = "0.0.0.0/0";
        final List<RouteRule> routeRules = defaultRouteTable.getRouteRules();
        routeRules.add(
                RouteRule.builder()
                        .cidrBlock(destinationCidr)
                        .destination(destinationCidr)
                        .destinationType(DestinationType.valueOf("CidrBlock"))
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
     * @return the InternetGateway.
     * @throws Exception
     */
    public static RouteTable getUniqueRouteTableByName(
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
     * Prepares a DefaultRouteTable for deletion by deleting all RouteRules.
     *
     * @param vcnClient the service client to use to delete the RouteTable.
     * @param rtId the RouteTable to delete.
     * @throws Exception
     */
    private static void prepareDefaultRouteTableForDelete(
            final VirtualNetworkClient vcnClient, final String rtId) throws Exception {

        vcnClient.updateRouteTable(
                UpdateRouteTableRequest.builder()
                        .rtId(rtId)
                        .updateRouteTableDetails(
                                UpdateRouteTableDetails.builder()
                                        .routeRules(new ArrayList<RouteRule>())
                                        .build())
                        .build());
    }

    // === OCI Subnet Helpers ===

    /**
     * Creates a subnet in a VCN and waits for the subnet to become available to use.
     *
     * @param vcnClient the service client to use to create the subnet.
     * @param compartmentId the OCID of the compartment which owns the VCN.
     * @param vcnId the ID of the VCN which will own the subnet.
     * @param displayName the display name of the subnet.
     * @param availabilityDomainName the availability domain where the subnet will be created.
     * @param subnetCidrBlock the subnet CidrBlock allocated from the parent VCN range.
     * @return the created subnet.
     * @throws Exception
     */
    private static Subnet createSubnet(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnId,
            final String displayName,
            final String availabilityDomain,
            final String subnetCidrBlock)
            throws Exception {

        // Create the subnet
        final CreateSubnetResponse createSubnetResponse =
                vcnClient.createSubnet(
                        CreateSubnetRequest.builder()
                                .createSubnetDetails(
                                        CreateSubnetDetails.builder()
                                                .availabilityDomain(availabilityDomain)
                                                .compartmentId(compartmentId)
                                                .displayName(displayName)
                                                .cidrBlock(subnetCidrBlock)
                                                .vcnId(vcnId)
                                                .build())
                                .build());

        // Wait for the subnet to be active
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
     * Gets Subnet info of a single uniquely named VCN in the specified compartment.
     *
     * @param vcnClient the service client to use to query the Subnet.
     * @param compartmentId of the Subnet.
     * @param vcnId of the Subnet.
     * @param subnetDisplayName of the Subnet.
     * @return the Subnet.
     * @throws Exception
     */
    public static Subnet getUniqueSubnetByName(
            final VirtualNetworkClient vcnClient,
            final String compartmentId,
            final String vcnId,
            final String subnetDisplayName)
            throws Exception {

        // Find the application in a specific compartment
        final ListSubnetsRequest listSubnetsRequest =
                ListSubnetsRequest.builder()
                        .compartmentId(compartmentId)
                        .vcnId(vcnId)
                        .displayName(subnetDisplayName)
                        .build();

        final ListSubnetsResponse listSubnetsResponse = vcnClient.listSubnets(listSubnetsRequest);

        if (listSubnetsResponse.getItems().size() != 1) {
            throw new Exception(
                    "Could not find unique subnet with name "
                            + subnetDisplayName
                            + " in compartment "
                            + compartmentId);
        }

        return listSubnetsResponse.getItems().get(0);
    }

    /**
     * Deletes a subnet and waits for it to be deleted.
     *
     * @param vcnClient the service client to use to delete the subnet.
     * @param subnetId the subnet to delete.
     * @throws Exception
     */
    private static void deleteSubnet(final VirtualNetworkClient vcnClient, final String subnetId)
            throws Exception {

        final int DELETE_SUBNET_ATTEMPTS = 5;
        /*
         * Sometimes we can't delete the subnet straight after a mount target has been deleted
         * as network resources still need to clear. If we get a conflict, try a few times before
         * bailing out.
         */
        int numAttempts = 0;
        while (true) {
            try {
                vcnClient.deleteSubnet(DeleteSubnetRequest.builder().subnetId(subnetId).build());
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
                        GetSubnetRequest.builder().subnetId(subnetId).build(),
                        Subnet.LifecycleState.Terminated)
                .execute();
    }

    // === OCI Application Helpers ===

    /**
     * Creates an Application and waits for the it to become available to use.
     *
     * @param fnManagementClient the service client to use to create the application.
     * @param compartmentId the OCID of the compartment which owns the Application.
     * @param displayName the display name ofr the created Application.
     * @param subnetIds a List of subnets (in different ADs) that will expose the function.
     * @return the created application.
     * @throws Exception if there is an error waiting on the application to become available to use.
     */
    private static Application createApplication(
            final FunctionsManagementClient fnManagementClient,
            final String compartmentId,
            final String displayName,
            final List<String> subnetIds)
            throws Exception {

        // Create a new Application.
        final CreateApplicationResponse createApplicationResponse =
                fnManagementClient.createApplication(
                        CreateApplicationRequest.builder()
                                .createApplicationDetails(
                                        CreateApplicationDetails.builder()
                                                .compartmentId(compartmentId)
                                                .displayName(displayName)
                                                .subnetIds(subnetIds)
                                                .build())
                                .build());

        // Wait for Application to be in 'Active' state.
        final GetApplicationResponse getApplicationResponse =
                fnManagementClient
                        .getWaiters()
                        .forApplication(
                                GetApplicationRequest.builder()
                                        .applicationId(
                                                createApplicationResponse.getApplication().getId())
                                        .build(),
                                Application.LifecycleState.Active)
                        .execute();

        return getApplicationResponse.getApplication();
    }

    /**
     * Gets the Application info of a single uniquely named Application in the specified
     * compartment.
     *
     * @param fnManagementClient the service client to use to get the Application information.
     * @param compartmentId of the application.
     * @param applicationDisplayName of the application.
     * @return the ApplicationSummary.
     * @throws Exception
     */
    public static ApplicationSummary getUniqueApplicationByName(
            final FunctionsManagementClient fnManagementClient,
            final String compartmentId,
            final String applicationDisplayName)
            throws Exception {

        // Find the application in a specific compartment
        final ListApplicationsRequest listApplicationsRequest =
                ListApplicationsRequest.builder()
                        .displayName(applicationDisplayName)
                        .compartmentId(compartmentId)
                        .build();

        final ListApplicationsResponse resp =
                fnManagementClient.listApplications(listApplicationsRequest);

        if (resp.getItems().size() != 1) {
            throw new Exception(
                    "Could not find unique application with name "
                            + applicationDisplayName
                            + " in compartment "
                            + compartmentId);
        }

        final ApplicationSummary application = resp.getItems().get(0);
        return application;
    }

    /**
     * Deletes an Application and waits for it to be deleted.
     *
     * @param fnManagementClient the service client to use to delete the Application.
     * @param applicationId the Application to delete.
     * @throws Exception if there is an error waiting on the Application to be deleted.
     */
    private static void deleteApplication(
            final FunctionsManagementClient fnManagementClient, final String applicationId)
            throws Exception {

        // Delete the specified Application
        fnManagementClient.deleteApplication(
                DeleteApplicationRequest.builder().applicationId(applicationId).build());

        // Wait for the 'Deleted' status.
        fnManagementClient
                .getWaiters()
                .forApplication(
                        GetApplicationRequest.builder().applicationId(applicationId).build(),
                        Application.LifecycleState.Deleted)
                .execute();
    }

    // === OCI Function Helpers ===

    /**
     * Creates a Function and waits for the it to become available to use.
     *
     * @param fnManagementClient the service client to use to create the Application.
     * @param applicationId the OCID of the Application which owns the Function.
     * @param displayName the display name of created Function.
     * @param image an accessible OCI Registry image implementing the function to be executed.
     * @param memoryInMBs the maximum amount of memory available (128, 256, 512, 1024) to the
     *     function in MB.
     * @param timeoutInSeconds the maximum amount of time a function can execute (30 - 120) in
     *     seconds.
     * @return the created Function.
     * @throws Exception
     */
    private static Function createFunction(
            final FunctionsManagementClient fnManagementClient,
            final String applicationId,
            final String displayName,
            final String image,
            final long memoryInMBs,
            final int timeoutInSeconds)
            throws Exception {

        // Create a new Function.
        final CreateFunctionResponse createFunctionResponse =
                fnManagementClient.createFunction(
                        CreateFunctionRequest.builder()
                                .createFunctionDetails(
                                        CreateFunctionDetails.builder()
                                                .applicationId(applicationId)
                                                .displayName(displayName)
                                                .image(image)
                                                .memoryInMBs(memoryInMBs)
                                                .timeoutInSeconds(timeoutInSeconds)
                                                .build())
                                .build());

        // Wait for Function to be in 'Active' state.
        final GetFunctionResponse getFunctionResponse =
                fnManagementClient
                        .getWaiters()
                        .forFunction(
                                GetFunctionRequest.builder()
                                        .functionId(createFunctionResponse.getFunction().getId())
                                        .build(),
                                Function.LifecycleState.Active)
                        .execute();

        return getFunctionResponse.getFunction();
    }

    /**
     * Gets Function information. This is an expensive operation and the results should be cached.
     *
     * @param fnManagementClient the service client to use to get the Function information.
     * @param compartmentId of the application and function.
     * @param applicationDisplayName of the application.
     * @param functionDisplayName of the function.
     * @return the FunctionSummary.
     * @throws Exception
     */
    public static FunctionSummary getUniqueFunctionByName(
            final FunctionsManagementClient fnManagementClient,
            final String compartmentId,
            final String applicationDisplayName,
            final String functionDisplayName)
            throws Exception {
        final ApplicationSummary application =
                getUniqueApplicationByName(
                        fnManagementClient, compartmentId, applicationDisplayName);
        return getUniqueFunctionByName(
                fnManagementClient, application.getId(), functionDisplayName);
    }

    /**
     * Gets Function information. This is an expensive operation and the results should be cached.
     *
     * @param fnManagementClient the service client to use to get the Function information.
     * @param applicationId of the function to find.
     * @param functionDisplayName of the function to find.
     * @return the FunctionSummary.
     * @throws Exception
     */
    public static FunctionSummary getUniqueFunctionByName(
            final FunctionsManagementClient fnManagementClient,
            final String applicationId,
            final String functionDisplayName)
            throws Exception {

        final ListFunctionsRequest listFunctionsRequest =
                ListFunctionsRequest.builder()
                        .applicationId(applicationId)
                        .displayName(functionDisplayName)
                        .build();

        final ListFunctionsResponse listFunctionsResponse =
                fnManagementClient.listFunctions(listFunctionsRequest);

        if (listFunctionsResponse.getItems().size() != 1) {
            throw new Exception(
                    "Could not find function with name "
                            + functionDisplayName
                            + " in application "
                            + applicationId);
        }

        return listFunctionsResponse.getItems().get(0);
    }

    /**
     * Deletes a Function and waits for it to be deleted.
     *
     * @param fnManagementClient the service client to use to delete the Function.
     * @param functionId the Function to delete.
     * @throws Exception
     */
    private static void deleteFunction(
            final FunctionsManagementClient fnManagementClient, final String functionId)
            throws Exception {

        // Delete the specified Function.
        fnManagementClient.deleteFunction(
                DeleteFunctionRequest.builder().functionId(functionId).build());

        // Wait for the 'Deleted' status.
        fnManagementClient
                .getWaiters()
                .forFunction(
                        GetFunctionRequest.builder().functionId(functionId).build(),
                        Function.LifecycleState.Deleted)
                .execute();
    }

    /**
     * Invokes a function.
     *
     * @param fnInvokeClient the service client to use to delete the Function.
     * @param function the Function to invoke.
     * @param payload the payload to pass to the function.
     */
    private static String invokeFunction(
            final FunctionsInvokeClient fnInvokeClient,
            final FunctionSummary function,
            final String payload)
            throws Exception {
        String response;
        try {
            System.err.println("Invoking function endpoint - " + function.getInvokeEndpoint());

            // Configure the client to use the assigned function endpoint.
            fnInvokeClient.setEndpoint(function.getInvokeEndpoint());
            final InvokeFunctionRequest invokeFunctionRequest =
                    InvokeFunctionRequest.builder()
                            .functionId(function.getId())
                            .invokeFunctionBody(
                                    StreamUtils.createByteArrayInputStream(payload.getBytes()))
                            .build();

            // Invoke the function!
            final InvokeFunctionResponse invokeFunctionResponse =
                    fnInvokeClient.invokeFunction(invokeFunctionRequest);

            // Handle the response.
            response =
                    StreamUtils.toString(
                            invokeFunctionResponse.getInputStream(), StandardCharsets.UTF_8);

        } catch (final Exception e) {
            e.printStackTrace();
            System.err.println("Failed to invoke function: " + e);
            throw e;
        }

        return response;
    }

    // === Utility Helpers ===

    private static String vcnName(final String name) {
        return name + "-vcn";
    }

    private static String igName(final String name) {
        return name + "-ig";
    }

    private static String drtName(final String name) {
        return "Default Route Table for " + name + "-vcn";
    }

    private static String subnetName(final String name) {
        return name + "-subnet";
    }

    private static String applicationName(final String name) {
        return name + "-app";
    }

    private static String functionName(final String name) {
        return name + "-fn";
    }
}
