/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.core.BlockstorageClient;
import com.oracle.bmc.core.ComputeClient;
import com.oracle.bmc.core.ComputeWaiters;
import com.oracle.bmc.core.VirtualNetworkClient;
import com.oracle.bmc.core.model.AddNetworkSecurityGroupSecurityRulesDetails;
import com.oracle.bmc.core.model.AddSecurityRuleDetails;
import com.oracle.bmc.core.model.AddSecurityRuleDetails.Direction;
import com.oracle.bmc.core.model.AddSecurityRuleDetails.SourceType;
import com.oracle.bmc.core.model.AttachIScsiVolumeDetails;
import com.oracle.bmc.core.model.AttachVolumeDetails;
import com.oracle.bmc.core.model.CreateInternetGatewayDetails;
import com.oracle.bmc.core.model.CreateNetworkSecurityGroupDetails;
import com.oracle.bmc.core.model.CreateSubnetDetails;
import com.oracle.bmc.core.model.CreateVcnDetails;
import com.oracle.bmc.core.model.CreateVnicDetails;
import com.oracle.bmc.core.model.CreateVolumeDetails;
import com.oracle.bmc.core.model.Image;
import com.oracle.bmc.core.model.Instance;
import com.oracle.bmc.core.model.InstanceSourceViaImageDetails;
import com.oracle.bmc.core.model.InternetGateway;
import com.oracle.bmc.core.model.LaunchInstanceAgentConfigDetails;
import com.oracle.bmc.core.model.LaunchInstanceDetails;
import com.oracle.bmc.core.model.NetworkSecurityGroup;
import com.oracle.bmc.core.model.PortRange;
import com.oracle.bmc.core.model.PrivateIp;
import com.oracle.bmc.core.model.RemoveNetworkSecurityGroupSecurityRulesDetails;
import com.oracle.bmc.core.model.RouteRule;
import com.oracle.bmc.core.model.RouteTable;
import com.oracle.bmc.core.model.SecurityRule;
import com.oracle.bmc.core.model.Shape;
import com.oracle.bmc.core.model.Subnet;
import com.oracle.bmc.core.model.TcpOptions;
import com.oracle.bmc.core.model.UpdateRouteTableDetails;
import com.oracle.bmc.core.model.Vcn;
import com.oracle.bmc.core.model.Volume;
import com.oracle.bmc.core.model.VolumeAttachment;
import com.oracle.bmc.core.requests.AddNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.AttachVolumeRequest;
import com.oracle.bmc.core.requests.CreateInternetGatewayRequest;
import com.oracle.bmc.core.requests.CreateNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.CreateSubnetRequest;
import com.oracle.bmc.core.requests.CreateVcnRequest;
import com.oracle.bmc.core.requests.CreateVolumeRequest;
import com.oracle.bmc.core.requests.DeleteInternetGatewayRequest;
import com.oracle.bmc.core.requests.DeleteNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.DeleteSubnetRequest;
import com.oracle.bmc.core.requests.DeleteVcnRequest;
import com.oracle.bmc.core.requests.DeleteVolumeRequest;
import com.oracle.bmc.core.requests.DetachVolumeRequest;
import com.oracle.bmc.core.requests.GetInstanceRequest;
import com.oracle.bmc.core.requests.GetInternetGatewayRequest;
import com.oracle.bmc.core.requests.GetNetworkSecurityGroupRequest;
import com.oracle.bmc.core.requests.GetRouteTableRequest;
import com.oracle.bmc.core.requests.GetSubnetRequest;
import com.oracle.bmc.core.requests.GetVcnRequest;
import com.oracle.bmc.core.requests.GetVolumeAttachmentRequest;
import com.oracle.bmc.core.requests.GetVolumeRequest;
import com.oracle.bmc.core.requests.LaunchInstanceRequest;
import com.oracle.bmc.core.requests.ListImagesRequest;
import com.oracle.bmc.core.requests.ListNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.ListPrivateIpsRequest;
import com.oracle.bmc.core.requests.ListShapesRequest;
import com.oracle.bmc.core.requests.RemoveNetworkSecurityGroupSecurityRulesRequest;
import com.oracle.bmc.core.requests.TerminateInstanceRequest;
import com.oracle.bmc.core.requests.UpdateRouteTableRequest;
import com.oracle.bmc.core.responses.AttachVolumeResponse;
import com.oracle.bmc.core.responses.CreateInternetGatewayResponse;
import com.oracle.bmc.core.responses.CreateNetworkSecurityGroupResponse;
import com.oracle.bmc.core.responses.CreateSubnetResponse;
import com.oracle.bmc.core.responses.CreateVcnResponse;
import com.oracle.bmc.core.responses.CreateVolumeResponse;
import com.oracle.bmc.core.responses.GetInstanceResponse;
import com.oracle.bmc.core.responses.GetInternetGatewayResponse;
import com.oracle.bmc.core.responses.GetNetworkSecurityGroupResponse;
import com.oracle.bmc.core.responses.GetRouteTableResponse;
import com.oracle.bmc.core.responses.GetSubnetResponse;
import com.oracle.bmc.core.responses.GetVcnResponse;
import com.oracle.bmc.core.responses.GetVolumeAttachmentResponse;
import com.oracle.bmc.core.responses.GetVolumeResponse;
import com.oracle.bmc.core.responses.LaunchInstanceResponse;
import com.oracle.bmc.core.responses.ListImagesResponse;
import com.oracle.bmc.core.responses.ListNetworkSecurityGroupSecurityRulesResponse;
import com.oracle.bmc.core.responses.ListShapesResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.loadbalancer.LoadBalancerClient;
import com.oracle.bmc.loadbalancer.LoadBalancerWaiters;
import com.oracle.bmc.loadbalancer.model.AddHttpRequestHeaderRule;
import com.oracle.bmc.loadbalancer.model.AddHttpResponseHeaderRule;
import com.oracle.bmc.loadbalancer.model.BackendDetails;
import com.oracle.bmc.loadbalancer.model.CertificateDetails;
import com.oracle.bmc.loadbalancer.model.ControlAccessUsingHttpMethodsRule;
import com.oracle.bmc.loadbalancer.model.CreateBackendSetDetails;
import com.oracle.bmc.loadbalancer.model.CreateListenerDetails;
import com.oracle.bmc.loadbalancer.model.CreateLoadBalancerDetails;
import com.oracle.bmc.loadbalancer.model.CreateRuleSetDetails;
import com.oracle.bmc.loadbalancer.model.ExtendHttpRequestHeaderValueRule;
import com.oracle.bmc.loadbalancer.model.ExtendHttpResponseHeaderValueRule;
import com.oracle.bmc.loadbalancer.model.HealthCheckerDetails;
import com.oracle.bmc.loadbalancer.model.IpAddress;
import com.oracle.bmc.loadbalancer.model.PathMatchCondition;
import com.oracle.bmc.loadbalancer.model.RedirectRule;
import com.oracle.bmc.loadbalancer.model.RedirectUri;
import com.oracle.bmc.loadbalancer.model.RemoveHttpRequestHeaderRule;
import com.oracle.bmc.loadbalancer.model.RemoveHttpResponseHeaderRule;
import com.oracle.bmc.loadbalancer.model.Rule;
import com.oracle.bmc.loadbalancer.model.RuleCondition;
import com.oracle.bmc.loadbalancer.model.RuleSet;
import com.oracle.bmc.loadbalancer.requests.CreateBackendSetRequest;
import com.oracle.bmc.loadbalancer.requests.CreateListenerRequest;
import com.oracle.bmc.loadbalancer.requests.CreateLoadBalancerRequest;
import com.oracle.bmc.loadbalancer.requests.CreateRuleSetRequest;
import com.oracle.bmc.loadbalancer.requests.DeleteBackendSetRequest;
import com.oracle.bmc.loadbalancer.requests.DeleteListenerRequest;
import com.oracle.bmc.loadbalancer.requests.DeleteLoadBalancerRequest;
import com.oracle.bmc.loadbalancer.requests.GetLoadBalancerRequest;
import com.oracle.bmc.loadbalancer.requests.GetRuleSetRequest;
import com.oracle.bmc.loadbalancer.requests.GetWorkRequestRequest;
import com.oracle.bmc.loadbalancer.responses.CreateBackendSetResponse;
import com.oracle.bmc.loadbalancer.responses.CreateListenerResponse;
import com.oracle.bmc.loadbalancer.responses.CreateLoadBalancerResponse;
import com.oracle.bmc.loadbalancer.responses.CreateRuleSetResponse;
import com.oracle.bmc.loadbalancer.responses.DeleteBackendSetResponse;
import com.oracle.bmc.loadbalancer.responses.DeleteListenerResponse;
import com.oracle.bmc.loadbalancer.responses.DeleteLoadBalancerResponse;
import com.oracle.bmc.loadbalancer.responses.GetLoadBalancerResponse;
import com.oracle.bmc.loadbalancer.responses.GetWorkRequestResponse;
import com.oracle.bmc.workrequests.WorkRequestClient;

public class LoadBalancedWebServer {
    private static final String CA_CERTIFICATE = "<put your CA certificate here>";
    private static final String PRIVATE_KEY = "<put your private key here>";
    private static final String PUBLIC_CERT = "<put your public certificate here>";

    private static final String PROFILE_DEFAULT = "DEFAULT";

    private static final int NUM_INSTANCES = 2;
    private static final String LB_SHAPE = "100Mbps";
    private static final long SIZE_IN_GB = 130L;
    private static final String LB_BES_NAME = LoadBalancedWebServer.class.getSimpleName() + "-BES";
    public static final String INSTANCE_DISPLAYNAME_PREFIX = "java-sdk-example-instance-";
    private static final String LISTENER_NAME =
            LoadBalancedWebServer.class.getSimpleName() + "-LISTENER";

    private static long startTimestamp;
    private static long endTimestamp = 0;
    private static long destroyStartTimestamp;
    private static long destroyEndTimestamp = 0;

    private static boolean shouldPause = true;

    private static final String CLOUD_INIT =
            "#!/bin/bash -x\n"
                    + "echo '################### webserver userdata begins #####################'\n"
                    + "touch ~opc/userdata.`date +%s`.start\n"
                    + "\n"
                    + "# echo '########## yum update all ###############'\n"
                    + "# yum update -y\n"
                    + "\n"
                    + "echo '########## basic webserver ##############'\n"
                    + "yum install -y httpd\n"
                    + "systemctl enable  httpd.service\n"
                    + "systemctl start  httpd.service\n"
                    + "echo '<html><head></head><body><pre><code>' > /var/www/html/index.html\n"
                    + "hostname >> /var/www/html/index.html\n"
                    + "echo '' >> /var/www/html/index.html\n"
                    + "cat /etc/os-release >> /var/www/html/index.html\n"
                    + "echo '</code></pre></body></html>' >> /var/www/html/index.html\n"
                    + "firewall-offline-cmd --add-service=http\n"
                    + "systemctl enable  firewalld\n"
                    + "systemctl restart  firewalld\n"
                    + "\n"
                    + "touch ~opc/userdata.`date +%s`.finish\n"
                    + "echo '################### webserver userdata ends #######################'";

    private static final List<Long> createTimes = new ArrayList<>();
    private static final List<Long> destroyTimes = new ArrayList<>();

    /**
     * This program will:
     * - create two instances with basic HTTP server
     * - create two block volumes and attach them to the instances
     * - create a load balancer in front of the two instances
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 4 || args.length > 5) {
            throw new IllegalArgumentException(
                    "Invalid number of arguments provided to the script:\n"
                            + "1) path to config file\n"
                            + "2) compartmentId\n"
                            + "3) path to public SSH key\n"
                            + "4) region name (e.g. us-phoenix-1)\n"
                            + "5) number of runs (optional)");
        }

        String compartmentId = args[1];
        String networkCidrBlock = "10.1.20.0/23";
        String sshPublicKey = new String(Files.readAllBytes(Paths.get(args[2])));
        String regionName = args[3];
        Region region = Region.fromRegionCodeOrId(regionName);
        int numRuns = 1;
        if (args.length == 5) {
            // if the number of runs was specified, don't wait after creating the resources, tear down immediately
            Integer.valueOf(args[4]);
            shouldPause = false;
        }

        // Read config from the profile DEFAULT in the file "~/.oci/config". You can switch to different profile.
        AuthenticationDetailsProvider authenticationDetailsProvider =
                new ConfigFileAuthenticationDetailsProvider(args[0], PROFILE_DEFAULT);

        System.out.println("Test started: " + new java.util.Date());
        for (int i = 0; i < numRuns; ++i) {
            System.out.println("############################################################");
            System.out.println("Run " + (i + 1) + " of " + numRuns);
            System.out.println("############################################################");
            try {
                singleTestRun(
                        compartmentId,
                        networkCidrBlock,
                        sshPublicKey,
                        region,
                        authenticationDetailsProvider);
            } catch (Exception e) {
                errorPrintln("Run " + i + " failed");
                e.printStackTrace();
            }
            System.out.println("\n\n\n");
        }
        System.out.println("Test finished: " + new java.util.Date());
        System.out.println("\n\n\n");

        System.out.println("CREATE TIMES");
        if (createTimes.isEmpty()) {
            System.out.println("No successful runs");
        } else {
            long acc = 0;
            for (long delta : createTimes) {
                acc += delta;
                System.out.printf("%20d ns (%s)\n", delta, getHumanReadableTime(delta));
            }
            long avg = acc / createTimes.size();
            System.out.printf("Average create %20d ns (%s)\n", avg, getHumanReadableTime(avg));
        }

        System.out.println("\n");
        System.out.println("DESTROY TIMES");
        if (destroyTimes.isEmpty()) {
            System.out.println("No successful runs");
        } else {
            long acc = 0;
            for (long delta : destroyTimes) {
                acc += delta;
                System.out.printf("%20d ns (%s)\n", delta, getHumanReadableTime(delta));
            }
            long avg = acc / createTimes.size();
            System.out.printf("Average destroy %20d ns (%s)\n", avg, getHumanReadableTime(avg));
        }
    }

    private static void singleTestRun(
            String compartmentId,
            String networkCidrBlock,
            String sshPublicKey,
            Region region,
            AuthenticationDetailsProvider authenticationDetailsProvider)
            throws Exception {
        //
        // timer starts
        //
        startTimestamp = System.nanoTime();

        //
        // set up clients
        //

        IdentityClient identityClient =
                IdentityClient.builder().build(authenticationDetailsProvider);
        identityClient.setRegion(region);

        ComputeClient computeClient = ComputeClient.builder().build(authenticationDetailsProvider);
        computeClient.setRegion(region);

        WorkRequestClient workRequestClient =
                WorkRequestClient.builder().build(authenticationDetailsProvider);
        workRequestClient.setRegion(region);
        ComputeWaiters computeWaiters = computeClient.newWaiters(workRequestClient);

        VirtualNetworkClient virtualNetworkClient =
                VirtualNetworkClient.builder().build(authenticationDetailsProvider);
        virtualNetworkClient.setRegion(region);

        BlockstorageClient blockStorageClient =
                BlockstorageClient.builder().build(authenticationDetailsProvider);
        blockStorageClient.setRegion(region);

        LoadBalancerClient loadBalancerClient =
                LoadBalancerClient.builder().build(authenticationDetailsProvider);
        loadBalancerClient.setRegion(region);
        LoadBalancerWaiters lbWaiters = loadBalancerClient.getWaiters();

        //
        // query ADs, set up (hard-coded) shape and image
        //

        List<AvailabilityDomain> availablityDomains =
                getAvailabilityDomains(identityClient, compartmentId);
        String shapeName = getShape(computeClient, compartmentId, availablityDomains.get(0));
        String imageId = getImage(region, computeClient, compartmentId, shapeName);

        List<Future<?>> futures = new ArrayList<>();

        Vcn vcn = null;
        InternetGateway internetGateway = null;
        Map<String, Subnet> subnets = new HashMap<>();
        NetworkSecurityGroup networkSecurityGroup = null;
        Map<String, Instance> instances = new HashMap<>();
        List<String> loadBalancerIds = new ArrayList<>();
        Map<String, Volume> volumes = new HashMap<>();
        List<VolumeAttachment> volumeAttachments = new ArrayList<>();
        try {
            //
            // set up block volumes
            //
            ExecutorService bvx = newExecutorService(10, "block");

            for (int i = 0; i < NUM_INSTANCES; ++i) {
                AvailabilityDomain availabilityDomain =
                        availablityDomains.get(i % availablityDomains.size());
                String displayName = LoadBalancedWebServer.class.getSimpleName() + i;
                submit(
                        futures,
                        bvx,
                        () -> {
                            volumes.put(
                                    availabilityDomain.getName(),
                                    createVolume(
                                            blockStorageClient,
                                            compartmentId,
                                            availabilityDomain,
                                            displayName));
                        });
            }
            println("Scheduled all create block volume runnables...");

            //
            // set up VCN, internet gateway, and NSG
            //
            vcn = createVcn(virtualNetworkClient, compartmentId, networkCidrBlock);

            // The Internet Gateway with updated Route Rules will enable the instance to connect to the public
            // internet. If it is not desired, remove the following two lines below that create an internet
            // gateway and add that internet gateway to the VCN route table.
            internetGateway = createInternetGateway(virtualNetworkClient, compartmentId, vcn);
            addInternetGatewayToDefaultRouteTable(virtualNetworkClient, vcn, internetGateway);

            // The Network Security Group with Security Rules will allow external HTTP traffic go to the instance
            // through port 80. The HTTP server hosted on the instance will be open to the public. You update
            // the Security Rules with your need accordingly.
            networkSecurityGroup =
                    createNetworkSecurityGroup(virtualNetworkClient, compartmentId, vcn);
            addNetworkSecurityGroupSecurityRules(virtualNetworkClient, networkSecurityGroup);

            //
            // create subnets
            //
            ExecutorService x = newExecutorService(10, "subnets");

            for (int i = 0; i < NUM_INSTANCES; ++i) {
                submit(
                        futures,
                        x,
                        getCreateSubnetRunnable(
                                i,
                                virtualNetworkClient,
                                compartmentId,
                                availablityDomains,
                                vcn,
                                // networkCidrBlock,
                                "10.1.2" + i + ".0/24",
                                subnets));
            }
            println("Scheduled all create subnet runnables...");

            finishAll(x, futures, "create subnet");

            //
            // create instances and load balancer in parallel
            //
            x = newExecutorService(10, "vm/lb");

            for (int i = 0; i < NUM_INSTANCES; ++i) {
                submit(
                        futures,
                        x,
                        getStartInstanceRunnable(
                                i,
                                computeWaiters,
                                compartmentId,
                                availablityDomains,
                                "10.1.2" + i + ".0/24",
                                imageId,
                                shapeName,
                                sshPublicKey,
                                networkSecurityGroup,
                                subnets,
                                instances));
            }
            String nsgId = networkSecurityGroup.getId();
            submit(
                    futures,
                    x,
                    () -> {
                        //
                        // create load balancer
                        //
                        try {
                            loadBalancerIds.add(
                                    createLoadBalancer(
                                            compartmentId,
                                            loadBalancerClient,
                                            lbWaiters,
                                            nsgId,
                                            subnets));
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                    });
            println("Scheduled all launch instance/create LB runnables...");

            finishAll(x, futures, "launch instance/create LB");
            finishAll(bvx, futures, "create block volume");

            //
            // now both instances and block volumes have been created
            // attach volumes to instances
            // also throw in the LB backend set
            //

            bvx = newExecutorService(10, "attach/lbbes");

            for (Map.Entry<String, Volume> e : volumes.entrySet()) {
                Volume volume = e.getValue();
                Instance instance = instances.get(e.getKey());
                submit(
                        futures,
                        bvx,
                        () -> {
                            volumeAttachments.add(
                                    attachIscsiVolume(computeClient, volume, instance));
                        });
            }
            submit(
                    futures,
                    bvx,
                    () -> {
                        println("Creating new backend set " + LB_BES_NAME + "...");

                        HealthCheckerDetails healthChecker =
                                HealthCheckerDetails.builder()
                                        .port(80)
                                        .protocol("HTTP")
                                        .urlPath("/")
                                        .responseBodyRegex(".*")
                                        .build();

                        createBackendSet(
                                virtualNetworkClient,
                                loadBalancerClient,
                                loadBalancerIds.get(0),
                                LB_BES_NAME,
                                "ROUND_ROBIN",
                                healthChecker,
                                instances,
                                subnets);

                        println("Backend set " + LB_BES_NAME + " has been created.");
                    });
            println("Scheduled all attach block volume/create LB backend set runnables...");

            finishAll(bvx, futures, "attach block volume/create LB backend set");

            //
            // now create the LB listener, it needs the LB backend set
            //
            createListener(
                    loadBalancerClient,
                    loadBalancerIds.get(0),
                    80,
                    LISTENER_NAME,
                    LB_BES_NAME,
                    "HTTP");

            // check if any of the futures failed
            checkIfAnyFutureFailed(futures);

            //
            // timer ends
            //
            endTimestamp = getTimestamp("Total time elapsed", startTimestamp);
            createTimes.add(endTimestamp - startTimestamp);

            GetLoadBalancerResponse getLoadBalancerResponse =
                    loadBalancerClient.getLoadBalancer(
                            GetLoadBalancerRequest.builder()
                                    .loadBalancerId(loadBalancerIds.get(0))
                                    .build());
            List<IpAddress> ipAddresses =
                    getLoadBalancerResponse.getLoadBalancer().getIpAddresses();
            Optional<IpAddress> publicIp =
                    ipAddresses.stream().filter(a -> a.getIsPublic()).findAny();
            if (publicIp.isPresent()) {
                System.out.println(
                        "Point your web browser at: http://" + publicIp.get().getIpAddress());
            }
        } catch (Exception e) {
            errorPrintln("EXCEPTION: " + e.getMessage());
            e.printStackTrace();
            throw e;
        } finally {
            pause();

            futures.clear();

            destroyStartTimestamp = System.nanoTime();

            deleteListener(loadBalancerClient, loadBalancerIds.get(0));

            ExecutorService x = newExecutorService(10, "destroy-detv");
            for (VolumeAttachment volumeAttachment : volumeAttachments) {
                if (volumeAttachment != null) {
                    submit(
                            futures,
                            x,
                            () -> {
                                detachVolume(computeClient, volumeAttachment);
                            });
                }
            }
            for (String loadBalancerId : loadBalancerIds) {
                submit(
                        futures,
                        x,
                        () -> {
                            println("Deleting backend set " + LB_BES_NAME + "...");
                            deleteBackendSet(loadBalancerClient, loadBalancerId, LB_BES_NAME);
                            println("Deleted backend set " + LB_BES_NAME + ".");
                        });
            }
            finishAllNoThrow(x, "detaching volume/deleting backend set");

            x = newExecutorService(10, "destroy-delv");
            for (Volume volume : volumes.values()) {
                if (volume != null) {
                    submit(
                            futures,
                            x,
                            () -> {
                                deleteVolume(blockStorageClient, volume);
                            });
                }
            }
            finishAllNoThrow(x, "delete volume");

            for (String loadBalancerId : loadBalancerIds) {
                deleteLoadBalancer(loadBalancerClient, lbWaiters, loadBalancerId);
            }

            x = newExecutorService(10, "destroy-vm");
            for (Instance instance : instances.values()) {
                if (instance != null) {
                    submit(
                            futures,
                            x,
                            () -> {
                                terminateInstance(computeClient, instance);
                            });
                }
            }
            finishAllNoThrow(x, "terminate instance");

            if (networkSecurityGroup != null) {
                clearNetworkSecurityGroupSecurityRules(virtualNetworkClient, networkSecurityGroup);
                deleteNetworkSecurityGroup(virtualNetworkClient, networkSecurityGroup);
            }
            if (internetGateway != null) {
                clearRouteRulesFromDefaultRouteTable(virtualNetworkClient, vcn);
                deleteInternetGateway(virtualNetworkClient, internetGateway);
            }
            x = newExecutorService(10, "destroy-sub");
            for (Subnet subnet : subnets.values()) {
                if (subnet != null) {
                    submit(
                            futures,
                            x,
                            () -> {
                                if (subnet != null) {
                                    deleteSubnet(virtualNetworkClient, subnet);
                                }
                            });
                }
            }
            finishAllNoThrow(x, "delete subnet");

            if (vcn != null) {
                deleteVcn(virtualNetworkClient, vcn);
            }

            loadBalancerClient.close();
            identityClient.close();
            computeClient.close();
            workRequestClient.close();
            virtualNetworkClient.close();
            blockStorageClient.close();

            checkIfAnyFutureFailed(futures);

            destroyEndTimestamp = getTimestamp("Total destroy time elapsed", destroyStartTimestamp);
            destroyTimes.add(destroyEndTimestamp - destroyStartTimestamp);

            if (endTimestamp > 0) {
                long delta = endTimestamp - startTimestamp;
                println(
                        "Total create time elapsed: "
                                + delta
                                + " ns ("
                                + getHumanReadableTime(delta)
                                + ")");
            }
        }
    }

    private static Runnable getCreateSubnetRunnable(
            int index,
            VirtualNetworkClient virtualNetworkClient,
            String compartmentId,
            List<AvailabilityDomain> availabilityDomains,
            Vcn vcn,
            String networkCidrBlock,
            Map<String, Subnet> subnets) {
        return () -> {
            try {
                AvailabilityDomain ad = availabilityDomains.get(index % availabilityDomains.size());
                println("Subnet's ad is " + ad);
                Subnet subnet =
                        createSubnet(
                                virtualNetworkClient, compartmentId, ad, networkCidrBlock, vcn);
                subnets.put(ad.getName(), subnet);
            } catch (Exception e) {
                errorPrintln("Failed to create subnet");
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        };
    }

    private static Runnable getStartInstanceRunnable(
            int index,
            ComputeWaiters computeWaiters,
            String compartmentId,
            List<AvailabilityDomain> availabilityDomains,
            String networkCidrBlock,
            String imageId,
            String shapeName,
            String sshPublicKey,
            NetworkSecurityGroup networkSecurityGroup,
            Map<String, Subnet> subnets,
            Map<String, Instance> instances) {
        return () -> {
            println("Instance is being created via image...");
            println("Instance's subnet uses cidr " + networkCidrBlock);
            try {
                AvailabilityDomain ad = availabilityDomains.get(index % availabilityDomains.size());
                println("Instance's ad is " + ad);

                LaunchInstanceDetails launchInstanceDetails =
                        createLaunchInstanceDetails(
                                compartmentId,
                                ad,
                                shapeName,
                                imageId,
                                subnets.get(ad.getName()),
                                networkSecurityGroup,
                                sshPublicKey);

                Instance instance = createInstance(computeWaiters, launchInstanceDetails);
                instances.put(ad.getName(), instance);
            } catch (Exception e) {
                errorPrintln("Failed to start instance");
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        };
    }

    private static List<AvailabilityDomain> getAvailabilityDomains(
            IdentityClient identityClient, String compartmentId) {
        ListAvailabilityDomainsResponse listAvailabilityDomainsResponse =
                identityClient.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(compartmentId)
                                .build());
        List<AvailabilityDomain> availabilityDomains = listAvailabilityDomainsResponse.getItems();

        for (AvailabilityDomain ad : availabilityDomains) {
            println("Found Availability Domain: " + ad.getName());
        }

        return availabilityDomains;
    }

    private static String getShape(
            ComputeClient computeClient,
            String compartmentId,
            AvailabilityDomain availabilityDomain) {
        ListShapesRequest listShapesRequest =
                ListShapesRequest.builder()
                        .availabilityDomain(availabilityDomain.getName())
                        .compartmentId(compartmentId)
                        .build();
        ListShapesResponse listShapesResponse = computeClient.listShapes(listShapesRequest);
        List<Shape> shapes = listShapesResponse.getItems();
        if (shapes.isEmpty()) {
            throw new IllegalStateException("No available shape was found.");
        }
        List<Shape> vmShapes =
                shapes.stream()
                        .filter(shape -> shape.getShape().startsWith("VM"))
                        .collect(Collectors.toList());
        if (vmShapes.isEmpty()) {
            throw new IllegalStateException("No available VM shape was found.");
        }
        // For demonstration, we just return the first shape but for Production code you should have a better
        // way of determining what is needed
        Shape shape = vmShapes.get(0);

        println("Found Shape: " + shape.getShape());

        return shape.getShape();
    }

    private static String getImage(
            Region region, ComputeClient computeClient, String compartmentId, String shapeName) {
        ListImagesRequest listImagesRequest =
                ListImagesRequest.builder()
                        .shape(shapeName)
                        .compartmentId(compartmentId)
                        .operatingSystem("Oracle Linux")
                        .build();
        ListImagesResponse response = computeClient.listImages(listImagesRequest);
        List<Image> images = response.getItems();
        if (images.isEmpty()) {
            throw new IllegalStateException("No available image was found.");
        }

        // For demonstration, we just return the first image but for Production code you should have a better
        // way of determining what is needed.
        //
        // Note the latest version of the images for the same operating system is returned firstly.
        Image image = images.get(0);

        println("Found Image: " + image.getDisplayName());
        return image.getId();
    }

    private static Vcn createVcn(
            VirtualNetworkClient virtualNetworkClient, String compartmentId, String cidrBlock)
            throws Exception {
        String vcnName = "java-sdk-example-vcn";
        CreateVcnDetails createVcnDetails =
                CreateVcnDetails.builder()
                        .cidrBlock(cidrBlock)
                        .compartmentId(compartmentId)
                        .displayName(vcnName)
                        .build();
        CreateVcnRequest createVcnRequest =
                CreateVcnRequest.builder().createVcnDetails(createVcnDetails).build();
        CreateVcnResponse createVcnResponse = virtualNetworkClient.createVcn(createVcnRequest);

        GetVcnRequest getVcnRequest =
                GetVcnRequest.builder().vcnId(createVcnResponse.getVcn().getId()).build();
        GetVcnResponse getVcnResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forVcn(getVcnRequest, Vcn.LifecycleState.Available)
                        .execute();
        Vcn vcn = getVcnResponse.getVcn();

        println("Created Vcn: " + vcn.getId());
        println(vcn);

        return vcn;
    }

    private static void deleteVcn(VirtualNetworkClient virtualNetworkClient, Vcn vcn) {
        try {
            DeleteVcnRequest deleteVcnRequest =
                    DeleteVcnRequest.builder().vcnId(vcn.getId()).build();
            virtualNetworkClient.deleteVcn(deleteVcnRequest);

            GetVcnRequest getVcnRequest = GetVcnRequest.builder().vcnId(vcn.getId()).build();
            virtualNetworkClient
                    .getWaiters()
                    .forVcn(getVcnRequest, Vcn.LifecycleState.Terminated)
                    .execute();

            println("Deleted Vcn: " + vcn.getId());

        } catch (Exception e) {
            errorPrintln("Failed to delete VCN");
            e.printStackTrace();
        }
    }

    private static InternetGateway createInternetGateway(
            VirtualNetworkClient virtualNetworkClient, String compartmentId, Vcn vcn)
            throws Exception {
        String internetGatewayName = "java-sdk-example-internet-gateway";
        CreateInternetGatewayDetails createInternetGatewayDetails =
                CreateInternetGatewayDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName(internetGatewayName)
                        .isEnabled(true)
                        .vcnId(vcn.getId())
                        .build();
        CreateInternetGatewayRequest createInternetGatewayRequest =
                CreateInternetGatewayRequest.builder()
                        .createInternetGatewayDetails(createInternetGatewayDetails)
                        .build();
        CreateInternetGatewayResponse createInternetGatewayResponse =
                virtualNetworkClient.createInternetGateway(createInternetGatewayRequest);

        GetInternetGatewayRequest getInternetGatewayRequest =
                GetInternetGatewayRequest.builder()
                        .igId(createInternetGatewayResponse.getInternetGateway().getId())
                        .build();
        GetInternetGatewayResponse getInternetGatewayResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forInternetGateway(
                                getInternetGatewayRequest, InternetGateway.LifecycleState.Available)
                        .execute();
        InternetGateway internetGateway = getInternetGatewayResponse.getInternetGateway();

        println("Created Internet Gateway: " + internetGateway.getId());
        println(internetGateway);

        return internetGateway;
    }

    private static void deleteInternetGateway(
            VirtualNetworkClient virtualNetworkClient, InternetGateway internetGateway) {
        try {
            DeleteInternetGatewayRequest deleteInternetGatewayRequest =
                    DeleteInternetGatewayRequest.builder().igId(internetGateway.getId()).build();
            virtualNetworkClient.deleteInternetGateway(deleteInternetGatewayRequest);

            GetInternetGatewayRequest getInternetGatewayRequest =
                    GetInternetGatewayRequest.builder().igId(internetGateway.getId()).build();
            virtualNetworkClient
                    .getWaiters()
                    .forInternetGateway(
                            getInternetGatewayRequest, InternetGateway.LifecycleState.Terminated)
                    .execute();

            println("Deleted Internet Gateway: " + internetGateway.getId());
        } catch (Exception e) {
            errorPrintln("Failed to delete internet gateway");
            e.printStackTrace();
        }
    }

    private static void addInternetGatewayToDefaultRouteTable(
            VirtualNetworkClient virtualNetworkClient, Vcn vcn, InternetGateway internetGateway)
            throws Exception {
        GetRouteTableRequest getRouteTableRequest =
                GetRouteTableRequest.builder().rtId(vcn.getDefaultRouteTableId()).build();
        GetRouteTableResponse getRouteTableResponse =
                virtualNetworkClient.getRouteTable(getRouteTableRequest);
        List<RouteRule> routeRules = getRouteTableResponse.getRouteTable().getRouteRules();

        println("Current Route Rules in Default Route Table: " + routeRules.size());
        routeRules.forEach(System.out::println);

        RouteRule internetAccessRoute =
                RouteRule.builder()
                        .destination("0.0.0.0/0")
                        .destinationType(RouteRule.DestinationType.CidrBlock)
                        .networkEntityId(internetGateway.getId())
                        .build();
        routeRules.add(internetAccessRoute);
        UpdateRouteTableDetails updateRouteTableDetails =
                UpdateRouteTableDetails.builder().routeRules(routeRules).build();
        UpdateRouteTableRequest updateRouteTableRequest =
                UpdateRouteTableRequest.builder()
                        .updateRouteTableDetails(updateRouteTableDetails)
                        .rtId(vcn.getDefaultRouteTableId())
                        .build();
        virtualNetworkClient.updateRouteTable(updateRouteTableRequest);

        println("Updated Route Rules in Default Route Table");
    }

    private static void clearRouteRulesFromDefaultRouteTable(
            VirtualNetworkClient virtualNetworkClient, Vcn vcn) {
        try {
            List<RouteRule> routeRules = new ArrayList<>();
            UpdateRouteTableDetails updateRouteTableDetails =
                    UpdateRouteTableDetails.builder().routeRules(routeRules).build();
            UpdateRouteTableRequest updateRouteTableRequest =
                    UpdateRouteTableRequest.builder()
                            .updateRouteTableDetails(updateRouteTableDetails)
                            .rtId(vcn.getDefaultRouteTableId())
                            .build();
            virtualNetworkClient.updateRouteTable(updateRouteTableRequest);

            GetRouteTableRequest getRouteTableRequest =
                    GetRouteTableRequest.builder().rtId(vcn.getDefaultRouteTableId()).build();
            virtualNetworkClient
                    .getWaiters()
                    .forRouteTable(getRouteTableRequest, RouteTable.LifecycleState.Available)
                    .execute();

            println("Cleared route rules from route table: " + vcn.getDefaultRouteTableId());
        } catch (Exception e) {
            errorPrintln("Failed to clear route rules from route table");
            e.printStackTrace();
        }
    }

    private static Subnet createSubnet(
            VirtualNetworkClient virtualNetworkClient,
            String compartmentId,
            AvailabilityDomain availabilityDomain,
            String networkCidrBlock,
            Vcn vcn)
            throws Exception {
        String subnetName = "java-sdk-example-subnet-" + availabilityDomain.getName();

        // In order to launch instances in a regional subnet, build this CreateSubnetDetails with
        // the field availablityDomain set to null.
        CreateSubnetDetails createSubnetDetails =
                CreateSubnetDetails.builder()
                        .availabilityDomain(availabilityDomain.getName())
                        .compartmentId(compartmentId)
                        .displayName(subnetName)
                        .cidrBlock(networkCidrBlock)
                        .vcnId(vcn.getId())
                        .routeTableId(vcn.getDefaultRouteTableId())
                        .build();
        CreateSubnetRequest createSubnetRequest =
                CreateSubnetRequest.builder().createSubnetDetails(createSubnetDetails).build();
        CreateSubnetResponse createSubnetResponse =
                virtualNetworkClient.createSubnet(createSubnetRequest);

        GetSubnetRequest getSubnetRequest =
                GetSubnetRequest.builder()
                        .subnetId(createSubnetResponse.getSubnet().getId())
                        .build();
        GetSubnetResponse getSubnetResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forSubnet(getSubnetRequest, Subnet.LifecycleState.Available)
                        .execute();
        Subnet subnet = getSubnetResponse.getSubnet();

        println("Created Subnet: " + subnet.getId());
        println(subnet);

        return subnet;
    }

    private static void deleteSubnet(VirtualNetworkClient virtualNetworkClient, Subnet subnet) {
        try {
            DeleteSubnetRequest deleteSubnetRequest =
                    DeleteSubnetRequest.builder().subnetId(subnet.getId()).build();
            virtualNetworkClient.deleteSubnet(deleteSubnetRequest);

            GetSubnetRequest getSubnetRequest =
                    GetSubnetRequest.builder().subnetId(subnet.getId()).build();
            virtualNetworkClient
                    .getWaiters()
                    .forSubnet(getSubnetRequest, Subnet.LifecycleState.Terminated)
                    .execute();

            println("Deleted Subnet: " + subnet.getId());
        } catch (Exception e) {
            errorPrintln("Failed to delete subnet");
            e.printStackTrace();
        }
    }

    private static NetworkSecurityGroup createNetworkSecurityGroup(
            VirtualNetworkClient virtualNetworkClient, String compartmentId, Vcn vcn)
            throws Exception {
        String networkSecurityGroupName = "java-sdk-example-nsg";
        CreateNetworkSecurityGroupDetails createNetworkSecurityGroupDetails =
                CreateNetworkSecurityGroupDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName(networkSecurityGroupName)
                        .vcnId(vcn.getId())
                        .build();
        CreateNetworkSecurityGroupRequest createNetworkSecurityGroupRequest =
                CreateNetworkSecurityGroupRequest.builder()
                        .createNetworkSecurityGroupDetails(createNetworkSecurityGroupDetails)
                        .build();
        CreateNetworkSecurityGroupResponse createNetworkSecurityGroupResponse =
                virtualNetworkClient.createNetworkSecurityGroup(createNetworkSecurityGroupRequest);

        GetNetworkSecurityGroupRequest getNetworkSecurityGroupRequest =
                GetNetworkSecurityGroupRequest.builder()
                        .networkSecurityGroupId(
                                createNetworkSecurityGroupResponse
                                        .getNetworkSecurityGroup()
                                        .getId())
                        .build();
        GetNetworkSecurityGroupResponse getNetworkSecurityGroupResponse =
                virtualNetworkClient
                        .getWaiters()
                        .forNetworkSecurityGroup(
                                getNetworkSecurityGroupRequest,
                                NetworkSecurityGroup.LifecycleState.Available)
                        .execute();
        NetworkSecurityGroup networkSecurityGroup =
                getNetworkSecurityGroupResponse.getNetworkSecurityGroup();

        println("Created Network Security Group: " + networkSecurityGroup.getId());
        println(networkSecurityGroup);

        return networkSecurityGroup;
    }

    private static void deleteNetworkSecurityGroup(
            VirtualNetworkClient virtualNetworkClient, NetworkSecurityGroup networkSecurityGroup) {
        try {
            DeleteNetworkSecurityGroupRequest deleteNetworkSecurityGroupRequest =
                    DeleteNetworkSecurityGroupRequest.builder()
                            .networkSecurityGroupId(networkSecurityGroup.getId())
                            .build();
            virtualNetworkClient.deleteNetworkSecurityGroup(deleteNetworkSecurityGroupRequest);

            GetNetworkSecurityGroupRequest getNetworkSecurityGroupRequest =
                    GetNetworkSecurityGroupRequest.builder()
                            .networkSecurityGroupId(networkSecurityGroup.getId())
                            .build();
            virtualNetworkClient
                    .getWaiters()
                    .forNetworkSecurityGroup(
                            getNetworkSecurityGroupRequest,
                            NetworkSecurityGroup.LifecycleState.Terminated)
                    .execute();

            println("Deleted Network Security Group: " + networkSecurityGroup.getId());
        } catch (Exception e) {
            errorPrintln("Failed to delete NSG");
            e.printStackTrace();
        }
    }

    private static void addNetworkSecurityGroupSecurityRules(
            VirtualNetworkClient virtualNetworkClient, NetworkSecurityGroup networkSecurityGroup) {
        println("Adding Security Rule to Network Security Group");

        AddSecurityRuleDetails incomingHttpRule =
                AddSecurityRuleDetails.builder()
                        .description("Incoming HTTP connections")
                        .direction(Direction.Ingress)
                        .protocol("6")
                        .source("0.0.0.0/0")
                        .sourceType(SourceType.CidrBlock)
                        .tcpOptions(
                                TcpOptions.builder()
                                        .destinationPortRange(
                                                PortRange.builder().min(80).max(80).build())
                                        .build())
                        .build();
        AddSecurityRuleDetails incomingHttpsRule =
                AddSecurityRuleDetails.builder()
                        .description("Incoming HTTP connections")
                        .direction(Direction.Ingress)
                        .protocol("6")
                        .source("0.0.0.0/0")
                        .sourceType(SourceType.CidrBlock)
                        .tcpOptions(
                                TcpOptions.builder()
                                        .destinationPortRange(
                                                PortRange.builder().min(443).max(443).build())
                                        .build())
                        .build();
        AddSecurityRuleDetails outgoingRule =
                AddSecurityRuleDetails.builder()
                        .description("Outgoing connections")
                        .direction(Direction.Egress)
                        .protocol("all")
                        .destination("0.0.0.0/0")
                        .destinationType(AddSecurityRuleDetails.DestinationType.CidrBlock)
                        .build();

        AddNetworkSecurityGroupSecurityRulesDetails addNetworkSecurityGroupSecurityRulesDetails =
                AddNetworkSecurityGroupSecurityRulesDetails.builder()
                        .securityRules(
                                Arrays.asList(incomingHttpRule, incomingHttpsRule, outgoingRule))
                        .build();

        AddNetworkSecurityGroupSecurityRulesRequest addNetworkSecurityGroupSecurityRulesRequest =
                AddNetworkSecurityGroupSecurityRulesRequest.builder()
                        .networkSecurityGroupId(networkSecurityGroup.getId())
                        .addNetworkSecurityGroupSecurityRulesDetails(
                                addNetworkSecurityGroupSecurityRulesDetails)
                        .build();
        virtualNetworkClient.addNetworkSecurityGroupSecurityRules(
                addNetworkSecurityGroupSecurityRulesRequest);

        println("Added Security Rule to Network Security Group");
    }

    private static void clearNetworkSecurityGroupSecurityRules(
            VirtualNetworkClient virtualNetworkClient, NetworkSecurityGroup networkSecurityGroup) {
        try {
            ListNetworkSecurityGroupSecurityRulesRequest
                    listNetworkSecurityGroupSecurityRulesRequest =
                            ListNetworkSecurityGroupSecurityRulesRequest.builder()
                                    .networkSecurityGroupId(networkSecurityGroup.getId())
                                    .build();
            ListNetworkSecurityGroupSecurityRulesResponse
                    listNetworkSecurityGroupSecurityRulesResponse =
                            virtualNetworkClient.listNetworkSecurityGroupSecurityRules(
                                    listNetworkSecurityGroupSecurityRulesRequest);
            List<SecurityRule> securityRules =
                    listNetworkSecurityGroupSecurityRulesResponse.getItems();

            List<String> securityRuleIds =
                    securityRules.stream().map(SecurityRule::getId).collect(Collectors.toList());
            RemoveNetworkSecurityGroupSecurityRulesDetails
                    removeNetworkSecurityGroupSecurityRulesDetails =
                            RemoveNetworkSecurityGroupSecurityRulesDetails.builder()
                                    .securityRuleIds(securityRuleIds)
                                    .build();
            RemoveNetworkSecurityGroupSecurityRulesRequest
                    removeNetworkSecurityGroupSecurityRulesRequest =
                            RemoveNetworkSecurityGroupSecurityRulesRequest.builder()
                                    .networkSecurityGroupId(networkSecurityGroup.getId())
                                    .removeNetworkSecurityGroupSecurityRulesDetails(
                                            removeNetworkSecurityGroupSecurityRulesDetails)
                                    .build();
            virtualNetworkClient.removeNetworkSecurityGroupSecurityRules(
                    removeNetworkSecurityGroupSecurityRulesRequest);

            println(
                    "Removed all Security Rules in Network Security Group: "
                            + networkSecurityGroup.getId());
        } catch (Exception e) {
            errorPrintln("Failed to clear NSG security rules");
            e.printStackTrace();
        }
    }

    private static Instance createInstance(
            ComputeWaiters computeWaiters, LaunchInstanceDetails launchInstanceDetails)
            throws Exception {
        LaunchInstanceRequest launchInstanceRequest =
                LaunchInstanceRequest.builder()
                        .launchInstanceDetails(launchInstanceDetails)
                        .build();
        LaunchInstanceResponse launchInstanceResponse =
                computeWaiters.forLaunchInstance(launchInstanceRequest).execute();

        GetInstanceRequest getInstanceRequest =
                GetInstanceRequest.builder()
                        .instanceId(launchInstanceResponse.getInstance().getId())
                        .build();
        GetInstanceResponse getInstanceResponse =
                computeWaiters
                        .forInstance(getInstanceRequest, Instance.LifecycleState.Running)
                        .execute();
        Instance instance = getInstanceResponse.getInstance();

        println("Launched Instance: " + instance.getId());
        println(instance);

        return instance;
    }

    private static LaunchInstanceDetails createLaunchInstanceDetails(
            String compartmentId,
            AvailabilityDomain availabilityDomain,
            String shapeName,
            String imageId,
            Subnet subnet,
            NetworkSecurityGroup networkSecurityGroup,
            String sshPublicKey) {
        String instanceName = "java-sdk-example-instance-" + availabilityDomain.getName();
        Map<String, String> metadata =
                ImmutableMap.<String, String>builder()
                        .put("ssh_authorized_keys", sshPublicKey)
                        .build();
        Map<String, Object> extendedMetadata =
                ImmutableMap.<String, Object>builder()
                        .put("user_data", Base64.getEncoder().encodeToString(CLOUD_INIT.getBytes()))
                        .build();
        InstanceSourceViaImageDetails instanceSourceViaImageDetails =
                InstanceSourceViaImageDetails.builder().imageId(imageId).build();
        CreateVnicDetails createVnicDetails =
                CreateVnicDetails.builder()
                        .subnetId(subnet.getId())
                        .nsgIds(Arrays.asList(networkSecurityGroup.getId()))
                        .build();
        LaunchInstanceAgentConfigDetails launchInstanceAgentConfigDetails =
                LaunchInstanceAgentConfigDetails.builder().isMonitoringDisabled(false).build();
        return LaunchInstanceDetails.builder()
                .availabilityDomain(availabilityDomain.getName())
                .compartmentId(compartmentId)
                .displayName(instanceName)
                // faultDomain is optional parameter
                .faultDomain("FAULT-DOMAIN-1")
                .sourceDetails(instanceSourceViaImageDetails)
                .metadata(metadata)
                .extendedMetadata(extendedMetadata)
                .shape(shapeName)
                .createVnicDetails(createVnicDetails)
                // agentConfig is an optional parameter
                .agentConfig(launchInstanceAgentConfigDetails)
                .build();
    }

    private static void terminateInstance(ComputeClient computeClient, Instance instance) {
        try {
            println("Terminating Instance: " + instance.getId());
            TerminateInstanceRequest terminateInstanceRequest =
                    TerminateInstanceRequest.builder().instanceId(instance.getId()).build();
            computeClient.terminateInstance(terminateInstanceRequest);

            GetInstanceRequest getInstanceRequest =
                    GetInstanceRequest.builder().instanceId(instance.getId()).build();
            computeClient
                    .getWaiters()
                    .forInstance(getInstanceRequest, Instance.LifecycleState.Terminated)
                    .execute();

            println("Terminated Instance: " + instance.getId());
        } catch (Exception e) {
            errorPrintln("Failed to terminate instance");
            e.printStackTrace();
        }
    }

    //
    // Load balancer
    //

    private static void deleteLoadBalancer(
            LoadBalancerClient loadBalancerClient,
            LoadBalancerWaiters lbWaiters,
            String loadBalancerId) {
        try {
            println("Deleting load balancer...");
            DeleteLoadBalancerResponse deleteLoadBalancerResponse =
                    loadBalancerClient.deleteLoadBalancer(
                            DeleteLoadBalancerRequest.builder()
                                    .loadBalancerId(loadBalancerId)
                                    .build());
            println("Waiting for load balancer work request...");
            GetWorkRequestResponse getWorkRequestResponse =
                    lbWaiters
                            .forWorkRequest(
                                    GetWorkRequestRequest.builder()
                                            .workRequestId(
                                                    deleteLoadBalancerResponse
                                                            .getOpcWorkRequestId())
                                            .build())
                            .execute();

            println("Deleted load balancer.");
        } catch (Exception e) {
            errorPrintln("Failed to delete load balancer");
            e.printStackTrace();
        }
    }

    private static String createLoadBalancer(
            String compartmentId,
            LoadBalancerClient loadBalancerClient,
            LoadBalancerWaiters lbWaiters,
            String nsgId,
            Map<String, Subnet> subnets)
            throws Exception {
        try {
            println("Creating load balancer...");
            Map<String, CertificateDetails> certs = new HashMap<>();
            certs.put(
                    "certificate1",
                    CertificateDetails.builder()
                            .caCertificate(CA_CERTIFICATE)
                            .certificateName("certificate1")
                            .privateKey(PRIVATE_KEY)
                            .publicCertificate(PUBLIC_CERT)
                            .build());

            CreateLoadBalancerDetails loadBalancerDetails =
                    CreateLoadBalancerDetails.builder()
                            .compartmentId(compartmentId)
                            .subnetIds(
                                    subnets.values()
                                            .stream()
                                            .map(sn -> sn.getId())
                                            .collect(Collectors.toList()))
                            .displayName(LoadBalancedWebServer.class.getSimpleName() + "Lb")
                            .shapeName(LB_SHAPE)
                            .ipMode(CreateLoadBalancerDetails.IpMode.Ipv4)
                            .certificates(certs)
                            .isPrivate(false)
                            .networkSecurityGroupIds(Arrays.asList(nsgId))
                            .build();

            CreateLoadBalancerResponse createLoadBalancerResponse =
                    loadBalancerClient.createLoadBalancer(
                            CreateLoadBalancerRequest.builder()
                                    .createLoadBalancerDetails(loadBalancerDetails)
                                    .build());

            println("Waiting for load balancer work request...");
            GetWorkRequestResponse getWorkRequestResponse =
                    lbWaiters
                            .forWorkRequest(
                                    GetWorkRequestRequest.builder()
                                            .workRequestId(
                                                    createLoadBalancerResponse
                                                            .getOpcWorkRequestId())
                                            .build())
                            .execute();

            println("Created load balancer.");
            return getWorkRequestResponse.getWorkRequest().getLoadBalancerId();
        } catch (Exception e) {
            errorPrintln("Failed to create load balancer");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a backend set in a given load balancer.
     *
     * @param loadBalancerClient the client used to communicate with the service
     * @param loadBalancerId  the OCID of the load balancer we're adding the backend set to
     * @param backendSetName a string display name for the backend set
     * @param policy The load balancing policy for the backends (such as ROUND_ROBIN, LEAST_CONNECTIONS, etc)
     * @param healthChecker a healthCheckerDetails object describing the health check parameters for the backends
     */
    private static String createBackendSet(
            VirtualNetworkClient virtualNetworkClient,
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            String backendSetName,
            String policy,
            HealthCheckerDetails healthChecker,
            Map<String, Instance> instances,
            Map<String, Subnet> subnets) {
        try {
            List<BackendDetails> backends = new ArrayList<>();
            for (Instance instance : instances.values()) {
                println("Looking for private ip of instance " + instance.getId());
                Subnet subnet = subnets.get(instance.getAvailabilityDomain());

                String privateIp = null;
                // seems like there is no good way to find the subnet or VNIC of an instance if the instance is created
                // using LaunchInstanceDetails.createVnicDetails.
                for (PrivateIp pip :
                        virtualNetworkClient
                                .getPaginators()
                                .listPrivateIpsRecordIterator(
                                        ListPrivateIpsRequest.builder()
                                                .subnetId(subnet.getId())
                                                .build())) {
                    println("Retrieved private ip " + pip.getId() + ": " + pip.getDisplayName());
                    if (pip.getDisplayName().startsWith(INSTANCE_DISPLAYNAME_PREFIX)) {
                        privateIp = pip.getIpAddress();
                        println("Found private ip address: " + privateIp);
                        break;
                    }
                }

                if (privateIp == null) {
                    throw new RuntimeException(
                            "Couldn't find private ip for instance " + instance.getId());
                }

                backends.add(
                        BackendDetails.builder()
                                .ipAddress(privateIp)
                                .port(80)
                                .backup(false)
                                .drain(false)
                                .offline(false)
                                .weight(1)
                                .build());
            }

            println("Creating LB backend set...");
            CreateBackendSetResponse response =
                    loadBalancerClient.createBackendSet(
                            CreateBackendSetRequest.builder()
                                    .loadBalancerId(loadBalancerId)
                                    .createBackendSetDetails(
                                            CreateBackendSetDetails.builder()
                                                    .name(backendSetName)
                                                    .policy(policy)
                                                    .healthChecker(healthChecker)
                                                    .backends(backends)
                                                    .build())
                                    .build());
            println("Waiting for LB backend set work request...");
            GetWorkRequestResponse getResponse =
                    loadBalancerClient
                            .getWaiters()
                            .forWorkRequest(
                                    GetWorkRequestRequest.builder()
                                            .workRequestId(response.getOpcWorkRequestId())
                                            .build())
                            .execute();
            String id = getResponse.getWorkRequest().getLoadBalancerId();
            println("Finished creating LB backend set: " + id);
            return id;
        } catch (Exception e) {
            errorPrintln("Failed to create LB backend set");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Updates a backend set in a given load balancer.
     *
     * @param loadBalancerClient the client used to communicate with the service
     * @param loadBalancerId  the OCID of the load balancer that contains the backend set to delete
     * @param backendSetName the name of the backend set to delete
     */
    private static void deleteBackendSet(
            LoadBalancerClient loadBalancerClient, String loadBalancerId, String backendSetName) {
        try {
            println("Deleting LB backend set...");
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
            println("Deleted LB backend set.");
        } catch (Exception e) {
            errorPrintln("Failed to delete LB backend set");
            e.printStackTrace();
        }
    }

    private static void createListener(
            LoadBalancerClient loadBalancerClient,
            String loadBalancerId,
            int listenerPort,
            String listenerName,
            String backendSetName,
            String listenerProtocol) {
        try {
            println("Creating LB listener...");
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
                                                    .build())
                                    .build());
            loadBalancerClient
                    .getWaiters()
                    .forWorkRequest(
                            GetWorkRequestRequest.builder()
                                    .workRequestId(response.getOpcWorkRequestId())
                                    .build())
                    .execute();

            println("Created LB listener");
        } catch (Exception e) {
            errorPrintln("Failed to create listener");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    private static void deleteListener(
            LoadBalancerClient loadBalancerClient, String loadBalancerId) {
        try {
            println("Deleting LB listener...");
            DeleteListenerResponse deleteListenerResponse =
                    loadBalancerClient.deleteListener(
                            DeleteListenerRequest.builder()
                                    .listenerName(LISTENER_NAME)
                                    .loadBalancerId(loadBalancerId)
                                    .build());

            loadBalancerClient
                    .getWaiters()
                    .forWorkRequest(
                            GetWorkRequestRequest.builder()
                                    .workRequestId(deleteListenerResponse.getOpcWorkRequestId())
                                    .build())
                    .execute();
        } catch (Exception e) {
            errorPrintln("Failed to delete LB listener.");
            e.printStackTrace();
        }
    }

    private static List<RuleCondition> getPathMatchConditions() {
        PathMatchCondition condition =
                PathMatchCondition.builder()
                        .attributeValue("/xyz")
                        .operator(PathMatchCondition.Operator.ForceLongestPrefixMatch)
                        .build();
        List<RuleCondition> conditions = new ArrayList<>();
        conditions.add(condition);
        return conditions;
    }

    //
    // Block volume
    //

    /**
     * Creates a volume and waits for it to become available
     *
     * @param blockStorageClient the client used to communicate with the service
     * @param compartmentId the compartment in which to create the volume
     * @param availabilityDomain the availability domain in which to create the volume
     * @param displayName the display name of the volume
     *
     * @return the created volume
     */
    protected static Volume createVolume(
            final BlockstorageClient blockStorageClient,
            final String compartmentId,
            final AvailabilityDomain availabilityDomain,
            final String displayName) {
        try {
            println("Creating volume");

            final CreateVolumeResponse createResponse =
                    blockStorageClient.createVolume(
                            CreateVolumeRequest.builder()
                                    .createVolumeDetails(
                                            getCreateVolumeDetails(
                                                    compartmentId, availabilityDomain, displayName))
                                    .build());
            println("Created volume: " + createResponse.getVolume().toString());

            final GetVolumeResponse getResponse =
                    blockStorageClient
                            .getWaiters()
                            .forVolume(
                                    GetVolumeRequest.builder()
                                            .volumeId(createResponse.getVolume().getId())
                                            .build(),
                                    Volume.LifecycleState.Available)
                            .execute();
            println("Waited for volume to be available: " + getResponse.getVolume().toString());

            return getResponse.getVolume();
        } catch (Exception e) {
            errorPrintln("Failed to create volume");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    protected static CreateVolumeDetails getCreateVolumeDetails(
            final String compartmentId,
            final AvailabilityDomain availabilityDomain,
            final String displayName) {
        return CreateVolumeDetails.builder()
                .availabilityDomain(availabilityDomain.getName())
                .compartmentId(compartmentId)
                .displayName(displayName)
                .sizeInGBs(SIZE_IN_GB)
                .build();
    }

    /**
     * Deletes a volume and waits for it to be deleted
     *
     * @param blockStorageClient the client used to communicate with the service
     * @param volume the volume to delete
     *
     * @throws Exception if there was an error waiting for the volume to be deleted
     */
    protected static void deleteVolume(
            final BlockstorageClient blockStorageClient, final Volume volume) {
        println("Deleting volume " + volume.getId() + "...");
        try {
            blockStorageClient.deleteVolume(
                    DeleteVolumeRequest.builder().volumeId(volume.getId()).build());

            blockStorageClient
                    .getWaiters()
                    .forVolume(
                            GetVolumeRequest.builder().volumeId(volume.getId()).build(),
                            Volume.LifecycleState.Terminated)
                    .execute();

            println("Deleted volume " + volume.getId() + ".");
        } catch (Exception e) {
            errorPrintln("Failed to delete volume " + volume.getId());
            e.printStackTrace();
        }
    }

    /**
     * Attaches a volume to an instance as an iSCSI volume and waits for the attachment to complete
     *
     * @param computeClient the client used to communicate with the service
     * @param volume the volume to attach
     * @param instance the instance to attach the volume to
     *
     * @return the volume attachment. Note that this is actually an {@link com.oracle.bmc.core.model.IScsiVolumeAttachment}, which is a subclass
     * of {@link com.oracle.bmc.core.model.VolumeAttachment}
     *
     * @throws Exception if there was an error waiting for the volume attachment
     */
    protected static VolumeAttachment attachIscsiVolume(
            final ComputeClient computeClient, final Volume volume, final Instance instance) {
        try {
            println(
                    "Attaching volume "
                            + volume.getId()
                            + " to instance "
                            + instance.getId()
                            + "...");

            /*
             * Note that when attaching we use AttachIScsiVolumeDetails, which is a subclass of AttachVolumeDetails. We
             * specify different types of volume attachment by using the different subclasses of AttachVolumeDetails
             */
            VolumeAttachment volumeAttachment =
                    attachVolume(
                            computeClient,
                            AttachIScsiVolumeDetails.builder()
                                    .volumeId(volume.getId())
                                    .instanceId(instance.getId())
                                    .build());
            println("Attached volume " + volume.getId() + " to instance " + instance.getId());
            return volumeAttachment;
        } catch (Exception e) {
            errorPrintln(
                    "Failed to attach ISCSI volume "
                            + volume.getId()
                            + " to instance "
                            + instance.getId());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * Attaches a volume using the given volume attachment details and waits for the attachment to become available
     *
     * @param computeClient the client used to communicate with the service
     * @param attachVolumeDetails the details of the volume attachment. This should be one of the subclasses of
     * {@link com.oracle.bmc.core.model.AttachVolumeDetails}
     *
     * @return the volume attachment. Note that this will be a subclass of {@link com.oracle.bmc.core.model.VolumeAttachment}. Which
     * subclass it is will depend on what type of {@link com.oracle.bmc.core.model.AttachVolumeDetails} was passed to this method. For
     * example if an {@link com.oracle.bmc.core.model.AttachIScsiVolumeDetails} was used then the returned  {@link com.oracle.bmc.core.model.VolumeAttachment}
     * will be an {@link com.oracle.bmc.core.model.IScsiVolumeAttachment}
     *
     * @throws Exception if there was an error waiting for the volume attachment
     */
    protected static VolumeAttachment attachVolume(
            final ComputeClient computeClient, final AttachVolumeDetails attachVolumeDetails)
            throws Exception {

        println("Attaching volume");

        final AttachVolumeResponse attachResponse =
                computeClient.attachVolume(
                        AttachVolumeRequest.builder()
                                .attachVolumeDetails(attachVolumeDetails)
                                .build());
        println("Attached volume: " + attachResponse.getVolumeAttachment().toString());

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
        println("Waited for volume to attach: " + getResponse.getVolumeAttachment().toString());

        return getResponse.getVolumeAttachment();
    }

    /**
     * Detaches a volume from an instance and waits for the detach to complete
     *
     * @param computeClient the client used to communicate with the service
     * @param volumeAttachment the details of the volume to detach
     *
     * @throws Exception if there was an error waiting for the volume to detach
     */
    protected static void detachVolume(
            final ComputeClient computeClient, final VolumeAttachment volumeAttachment) {
        try {
            println("Detaching volume attachment " + volumeAttachment.getId() + "...");
            computeClient.detachVolume(
                    DetachVolumeRequest.builder()
                            .volumeAttachmentId(volumeAttachment.getId())
                            .build());

            computeClient
                    .getWaiters()
                    .forVolumeAttachment(
                            GetVolumeAttachmentRequest.builder()
                                    .volumeAttachmentId(volumeAttachment.getId())
                                    .build(),
                            VolumeAttachment.LifecycleState.Detached)
                    .execute();
            println("Detached volume attachment " + volumeAttachment.getId() + ".");
        } catch (Exception e) {
            errorPrintln("Failed to detach volume attachment " + volumeAttachment.getId());
            e.printStackTrace();
        }
    }

    //
    // Utils
    //

    private static void finishAll(ExecutorService bvx, List<Future<?>> futures, String taskName)
            throws InterruptedException {
        if (!finishAllNoThrow(bvx, taskName)) {
            throw new RuntimeException("Failed to finish all " + taskName + " runnables");
        }
        // check if any of the futures failed
        checkIfAnyFutureFailed(futures);
    }

    private static boolean finishAllNoThrow(ExecutorService xs, String taskName)
            throws InterruptedException {
        xs.shutdown();
        boolean finished = xs.awaitTermination(1, TimeUnit.HOURS);
        if (finished) {
            println("All " + taskName + " runnables finished.");
        }
        return finished;
    }

    private static boolean submit(List<Future<?>> futures, ExecutorService xs, Runnable runnable) {
        return futures.add(xs.submit(runnable));
    }

    private static void checkIfAnyFutureFailed(List<Future<?>> futures)
            throws InterruptedException {
        try {
            for (Future<?> f : futures) {
                f.get();
            }
        } catch (ExecutionException ee) {
            throw new RuntimeException("At least one task failed", ee);
        }
    }

    private static void pause() {
        if (!shouldPause) {
            return;
        }
        System.out.println("Press RETURN to continue.");
        try {
            new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long getTimestamp(String message, long start) {
        long timestamp = System.nanoTime();

        long delta = timestamp - start;
        System.out.println(message + ": " + delta + " ns (" + getHumanReadableTime(delta) + ")");
        return timestamp;
    }

    private static String getHumanReadableTime(long nanos) {
        TimeUnit unitToPrint = null;
        String result = "";
        long rest = nanos;
        for (TimeUnit t : TimeUnit.values()) {
            if (unitToPrint == null) {
                unitToPrint = t;
                continue;
            }
            // convert 1 of "t" to "unitToPrint", to get the conversion factor
            long factor = unitToPrint.convert(1, t);
            long value = rest % factor;
            rest /= factor;

            result = value + " " + unitToPrint + " " + result;

            unitToPrint = t;
            if (rest == 0) {
                break;
            }
        }
        if (rest != 0) {
            result = rest + " " + unitToPrint + " " + result;
        }

        return result.trim();
    }

    private static void println(Object message) {
        System.out.printf(
                "%-25s|%s\n", Thread.currentThread().getName(), Objects.toString(message));
    }

    private static void errorPrintln(String message) {
        System.err.printf("%-25s|%s\n", Thread.currentThread().getName(), message);
    }

    private static ExecutorService newExecutorService(int numThreads, String prefix) {
        return Executors.newFixedThreadPool(10, new NamedThreadFactory(prefix));
    }

    static class NamedThreadFactory implements ThreadFactory {
        private final AtomicInteger poolNumber = new AtomicInteger(1);
        private final ThreadGroup group;
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private final String namePrefix;

        NamedThreadFactory(String prefix) {
            SecurityManager s = System.getSecurityManager();
            group = (s != null) ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
            namePrefix = prefix + "-" + poolNumber.getAndIncrement() + "-thread-";
        }

        public Thread newThread(Runnable r) {
            Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement(), 0);
            if (t.isDaemon()) t.setDaemon(false);
            if (t.getPriority() != Thread.NORM_PRIORITY) t.setPriority(Thread.NORM_PRIORITY);
            return t;
        }
    }
}
