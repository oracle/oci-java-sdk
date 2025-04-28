/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.loadbalancer.LoadBalancerClient;
import com.oracle.bmc.loadbalancer.model.CreateLoadBalancerDetails;
import com.oracle.bmc.loadbalancer.model.CreateLoadBalancerDetails.IpMode;
import com.oracle.bmc.loadbalancer.requests.CreateLoadBalancerRequest;

import java.util.Arrays;

/**
 * This class provides an example of how to create an IPv6-Enabled Load Balancer.
 *
 * <ul>
 *   <li>The load balancer will be created within the provided compartment OCID
 *   <li>The configuration file used by service clients will be sourced from the default location
 *       (~/.oci/config) and the DEFAULT profile will be used
 *       <ul>
 */
public class CreateIpv6LoadBalancerExample {
    private static String CONFIG_LOCATION = "~/.oci/config";
    private static String CONFIG_PROFILE = "DEFAULT";

    private static String LB_DISPLAY_NAME = "java-sdk-test-LB1";
    private static String LB_SHAPE = "100Mbps";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The OCID of the compartment where the load balancer will be created.
     *       <li>The OCID of the subnet to be assigned to the load balancer.
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            throw new IllegalArgumentException(
                    "This example expects two arguments: compartment OCID, subnet OCID (subnet must be regional!)");
        }
        final String compartmentId = args[0];
        final String loadBalSubnet = args[1];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        LoadBalancerClient loadBalancerClient = LoadBalancerClient.builder().build(provider);

        CreateLoadBalancerDetails loadBalancerDetails =
                CreateLoadBalancerDetails.builder()
                        .compartmentId(compartmentId)
                        .subnetIds(Arrays.asList(loadBalSubnet))
                        .displayName(LB_DISPLAY_NAME)
                        .shapeName(LB_SHAPE)
                        .ipMode(IpMode.Ipv6)
                        .build();

        loadBalancerClient.createLoadBalancer(
                CreateLoadBalancerRequest.builder()
                        .createLoadBalancerDetails(loadBalancerDetails)
                        .build());
        System.out.println("DONE");
    }
}
