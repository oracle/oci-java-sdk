/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.jersey3.Jersey3ClientProperties;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;

/**
 * This shows how to configure idle connection monitor for Apache clients
 */
public class ConfigureApacheIdleConnectionMonitorExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     */
    public static void main(String[] args) throws Exception {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        ObjectStorageClient objectStorageClient = ObjectStorageClient
                .builder()
                .clientConfigurator(builder -> {
                    builder.property(Jersey3ClientProperties.APACHE_IDLE_CONNECTION_MONITOR_THREAD_ENABLED, true);
                    // configure whether to use apache idle connection monitor thread
                    builder.property(Jersey3ClientProperties.APACHE_IDLE_CONNECTION_MONITOR_THREAD_WAIT_TIME_SECONDS, 30);
                    // configure wait time for idle connection monitor thread
                    builder.property(Jersey3ClientProperties.APACHE_IDLE_CONNECTION_MONITOR_THREAD_IDLE_TIMEOUT_SECONDS, 15);
                    // configure idle timeout for idle connection monitor thread
                })
                .region(Region.US_PHOENIX_1)
                .build(provider);

        // Construct GetNamespaceRequest with the given compartmentId.
        String compartmentId = provider.getTenantId();
        GetNamespaceRequest getNamespaceRequest =
                GetNamespaceRequest.builder().compartmentId(compartmentId).build();
        String namespace = objectStorageClient.getNamespace(getNamespaceRequest).getValue();

        System.out.println(
                String.format(
                        "Object Storage namespace for compartment [%s] is [%s]",
                        compartmentId,
                        namespace));

    }
}