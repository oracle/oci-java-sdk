/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.limits.Limits;
import com.oracle.bmc.limits.LimitsClient;
import com.oracle.bmc.limits.model.LimitDefinitionSummary;
import com.oracle.bmc.limits.requests.GetResourceAvailabilityRequest;
import com.oracle.bmc.limits.responses.GetResourceAvailabilityResponse;
import com.oracle.bmc.limits.requests.ListLimitDefinitionsRequest;
import com.oracle.bmc.limits.responses.ListLimitDefinitionsResponse;

/**
 * This class provides an example of how you can use the API to interact with the resource limits
 * of a specific resource type. You will be able to find the following information:
 * <ul>
 *   <li>Name</li>
 *   <li>Description</li>
 *   <li>Availability</li>
 *   <li>Usage</li>
 * </ul>
 */
public class LimitsExample {

    private static final String SERVICE_NAME = "limits";
    private static final String LIMIT_NAME = "policy-count";

    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        Limits client = new LimitsClient(provider);
        client.setRegion(Region.US_PHOENIX_1);

        // For a given compartmentId and service name it returns the name and description of the limit
        ListLimitDefinitionsRequest listLimitDefinitionsRequest =
                ListLimitDefinitionsRequest.builder()
                        .compartmentId(provider.getTenantId())
                        .serviceName(SERVICE_NAME)
                        .build();
        ListLimitDefinitionsResponse listLimitDefinitionsResponse =
                client.listLimitDefinitions(listLimitDefinitionsRequest);
        for (LimitDefinitionSummary summary : listLimitDefinitionsResponse.getItems()) {
            System.out.println("Limit Name: " + summary.getName());
            System.out.println("Limit Description: " + summary.getDescription());
        }

        // For a given compartmentId, service name and resource limit name, it returns
        // the number of available resources associated with the given limit and
        // the usage in the selected compartment for the given limit
        GetResourceAvailabilityRequest getResourceAvailabilityRequest =
                GetResourceAvailabilityRequest.builder()
                        .compartmentId(provider.getTenantId())
                        .serviceName(SERVICE_NAME)
                        .limitName(LIMIT_NAME)
                        .build();
        GetResourceAvailabilityResponse resourceAvailabilityResponse =
                client.getResourceAvailability(getResourceAvailabilityRequest);
        System.out.println(
                "Availability: "
                        + resourceAvailabilityResponse.getResourceAvailability().getAvailable());
        System.out.println(
                "Usage: " + resourceAvailabilityResponse.getResourceAvailability().getUsed());

        client.close();
    }
}
