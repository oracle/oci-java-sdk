/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.User;
import com.oracle.bmc.identity.requests.GetUserRequest;
import com.oracle.bmc.identity.responses.GetUserResponse;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;

/**
 * This shows the default behavior of the Apache Connector.
 */
public class DefaultApacheConnectorSettingsExample {
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

        ObjectStorageClient nonBufferingObjectStorageClient = ObjectStorageClient
                .builder()
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


        IdentityClient bufferingIdentityClient = IdentityClient
                .builder()
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
