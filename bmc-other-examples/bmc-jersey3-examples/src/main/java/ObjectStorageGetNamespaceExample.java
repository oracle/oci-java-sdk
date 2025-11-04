/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.client.jersey3.Jersey3ClientProperty;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;
import com.oracle.bmc.objectstorage.requests.PutObjectRequest;
import com.oracle.bmc.objectstorage.responses.PutObjectResponse;
import org.glassfish.jersey.logging.LoggingFeature;

import java.io.ByteArrayInputStream;
import java.util.logging.Level;

import static org.glassfish.jersey.logging.LoggingFeature.LOGGING_FEATURE_LOGGER_LEVEL_CLIENT;
import static org.glassfish.jersey.logging.LoggingFeature.LOGGING_FEATURE_VERBOSITY_CLIENT;

/**
 * This class provides a basic example of how to get Object Storage namespace of a tenancy that is not their own. This
 * is useful in cross-tenant Object Storage operations. Object Storage namespace can be retrieved using the
 * compartment id of the target tenancy if the user has necessary permissions to access that tenancy.
 *
 * For example if Tenant A wants to access Tenant B's object storage namespace then Tenant A has to define
 * a policy similar to following:
 *
 * DEFINE TENANCY TenantB AS <TenantB OCID>
 * ENDORSE GROUP <TenantA user group name> TO {OBJECTSTORAGE_NAMESPACE_READ} IN TENANCY TenantB
 *
 * and Tenant B should add a policy similar to following:
 *
 * DEFINE TENANCY TenantA AS <TenantA OCID>
 * DEFINE GROUP TenantAGroup AS <TenantA user group OCID>
 * ADMIT GROUP TenantAGroup OF TENANCY TenantA TO {OBJECTSTORAGE_NAMESPACE_READ} IN TENANCY
 *
 * This example covers only GetNamespace operation across tenants. Additional permissions will be required to
 * perform more Object Storage operations.
 *
 * Usage: 0 or 1 arguments
 * - If 1 argument is provided, it should be the compartmentId.
 * - If 0 arguments are provided, the tenancyId will be used as compartmentId.
 */
public class ObjectStorageGetNamespaceExample {
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

        final ConfigFileReader.ConfigFile configFile;
        if (args.length < 1) {
            configFile = ConfigFileReader.parseDefault();
        } else {
            configFile = ConfigFileReader.parse(args[0], "DEFAULT");
        }

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        String compartmentId = provider.getTenantId();
        if (args.length > 2) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Syntax: [<ociConfigFile> [<compartmentId>]]");
        } else if (args.length == 2) {
            compartmentId = args[1];
        }

        ObjectStorageClient objectStorageClient = ObjectStorageClient.builder()
                .region(Region.US_PHOENIX_1)
                .clientConfigurator(builder -> {
                    builder.property(Jersey3ClientProperty.create(LOGGING_FEATURE_VERBOSITY_CLIENT), LoggingFeature.Verbosity.PAYLOAD_ANY);
                    builder.property(Jersey3ClientProperty.create(LOGGING_FEATURE_LOGGER_LEVEL_CLIENT), Level.INFO.getName());})
                .build(provider);

        // Construct GetNamespaceRequest with the given compartmentId.
        GetNamespaceRequest getNamespaceRequest = GetNamespaceRequest.builder()
                .compartmentId(compartmentId).build();
        String namespaceName = objectStorageClient.getNamespace(getNamespaceRequest).getValue();

        System.out.println(
                String.format(
                        "Object Storage namespace for compartment [%s] is [%s]",
                        compartmentId,
                        namespaceName));

        PutObjectRequest putObjectRequest = PutObjectRequest.builder()
                .namespaceName(namespaceName)
                .bucketName("dex-22927")
                .objectName("test.txt")
                .putObjectBody(new ByteArrayInputStream("Hello world!".getBytes()))
                .build();
        PutObjectResponse putObjectResponse = objectStorageClient.putObject(putObjectRequest);
        System.out.println(putObjectResponse.get__httpStatusCode__());
    }
}
