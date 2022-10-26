/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.jersey.apacheconfigurator.ApacheConfigurator;
import com.oracle.bmc.http.client.StandardClientProperties;
import com.oracle.bmc.http.client.jersey.ApacheClientProperties;
import com.oracle.bmc.http.client.jersey.apacheconfigurator.ApacheConnectorProperties;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.User;
import com.oracle.bmc.identity.requests.GetUserRequest;
import com.oracle.bmc.identity.responses.GetUserResponse;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;

/**
 * This shows how to disable the use of NoConnectionReuseStrategy.
 *
 * GitHub issue: https://github.com/oracle/oci-java-sdk/issues/378
 *
 * In versions 2.14.1 and later, you may encounter performance regressions when using the SDK to call API operations to any of the OCI services. The regression ranges from 30% to 60% increase in latency in SDK operations to any of the OCI services.
 *
 * The change that causes the performance regression is itself a fix for the issue of the Apache client retrying internally, and fixing that problem takes priority over the performance regression. Hence, we will not be working on fixing this. Please use the below suggested workarounds if you encounter any performance regressions.
 *
 * If you are experiencing this issue, and would like to get the older performance back, there are some workarounds you can do:
 *
 * 1. Switch back to the Jersey’s default HttpUrlConnectorProvider by setting the OCI_JAVASDK_JERSEY_CLIENT_DEFAULT_CONNECTOR_ENABLED environment variable to true
 * 2. Disable the use of NoConnectionReuseStrategy for the ApacheConnectorProvider by setting the {@link ApacheClientProperties#REUSE_STRATEGY} to null and
 * {@link ApacheClientProperties#RETRY_HANDLER} to null.
 *
 * This example shows workaround 2,
 *
 */
public class DisableNoConnectionReuseStrategyUsingApacheConfiguratorExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>The first argument is the OCID of the compartment for which we will get the namespace</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // For clients that should not buffer requests into memory:
        ObjectStorageClient nonBufferingObjectStorageClient = ObjectStorageClient
                .builder()
                .clientConfigurator(new ApacheConfigurator.NonBuffering(
                        ApacheConnectorProperties.builder()
                                                 .connectionReuseStrategy(null)
                                                 .requestRetryHandler(null)
                                                 .build()))
                .region(Region.US_PHOENIX_1)
                .build(provider);

        // Construct GetNamespaceRequest with the given compartmentId.
        String compartmentId = provider.getTenantId();
        GetNamespaceRequest getNamespaceRequest =
                GetNamespaceRequest.builder().compartmentId(compartmentId).build();
        String namespace = nonBufferingObjectStorageClient.getNamespace(getNamespaceRequest).getValue();

        System.out.println(
                String.format(
                        "Object Storage namespace for compartment [%s] is [%s]",
                        compartmentId,
                        namespace));


        // For clients that should buffer requests into memory:
        IdentityClient bufferingIdentityClient = IdentityClient
                .builder()
                .clientConfigurator(new ApacheConfigurator(
                        ApacheConnectorProperties.builder()
                                                 .connectionReuseStrategy(null)
                                                 .requestRetryHandler(null)
                                                 .build()))
                .region(Region.US_PHOENIX_1)
                .build(provider);

        GetUserResponse response =
                bufferingIdentityClient.getUser(GetUserRequest.builder().userId(provider.getUserId()).build());
        User user = response.getUser();
        System.out.println(
                String.format(
                        "User [%s] is in compartment [%s] and has description [%s]",
                        user.getId(),
                        user.getCompartmentId(),
                        user.getDescription()));
    }
}
