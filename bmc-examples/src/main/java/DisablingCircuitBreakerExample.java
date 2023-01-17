/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ClientConfiguration;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.requests.ListRegionsRequest;
import com.oracle.bmc.identity.responses.ListRegionsResponse;
import com.oracle.bmc.limits.Limits;
import com.oracle.bmc.limits.LimitsClient;
import com.oracle.bmc.limits.model.LimitDefinitionSummary;
import com.oracle.bmc.limits.requests.ListLimitDefinitionsRequest;
import com.oracle.bmc.limits.responses.ListLimitDefinitionsResponse;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.responses.GetNamespaceResponse;
import com.oracle.bmc.util.CircuitBreakerUtils;

/** A sample to demonstrate how to disable circuit breaker configuration at client level. */
public class DisablingCircuitBreakerExample {

    public static void main(String[] args) throws Exception {

        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // Example for disabling circuit breaker at client level
        ClientConfiguration configuration =
                ClientConfiguration.builder()
                        .circuitBreakerConfiguration(
                                CircuitBreakerUtils.getNoCircuitBreakerConfiguration())
                        .build();

        // Create client using above ClientConfiguration
        ObjectStorage objectStorageClient = new ObjectStorageClient(provider, configuration);
        objectStorageClient.setRegion(Region.US_PHOENIX_1);

        GetNamespaceResponse namespaceResponse =
                objectStorageClient.getNamespace(GetNamespaceRequest.builder().build());
        String namespaceName = namespaceResponse.getValue();
        System.out.println("Using namespace: " + namespaceName);

        // Example for disabling circuit breaker at global level
        CircuitBreakerUtils.setDefaultCircuitBreakerConfiguration(
                CircuitBreakerUtils.getNoCircuitBreakerConfiguration());
        Identity identityClient = new IdentityClient(provider);
        identityClient.setRegion(Region.US_PHOENIX_1);
        final ListRegionsResponse response =
                identityClient.listRegions(ListRegionsRequest.builder().build());
        System.out.println("List of regions: " + response.getItems());

        // To disable circuit breaker at environment level, set
        // OCI_SDK_DEFAULT_CIRCUITBREAKER_ENABLED=false
        Limits limitsClient = new LimitsClient(provider);
        limitsClient.setRegion(Region.US_PHOENIX_1);
        ListLimitDefinitionsRequest listLimitDefinitionsRequest =
                ListLimitDefinitionsRequest.builder().compartmentId(provider.getTenantId()).build();
        ListLimitDefinitionsResponse listLimitDefinitionsResponse =
                limitsClient.listLimitDefinitions(listLimitDefinitionsRequest);
        for (LimitDefinitionSummary summary : listLimitDefinitionsResponse.getItems()) {
            System.out.println("Limit Name: " + summary.getName());
        }
    }
}
