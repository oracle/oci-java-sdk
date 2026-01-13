/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import com.oracle.bmc.objectstorage.requests.GetNamespaceRequest;

/**
 * This class provides a basic example of how to get Object Storage namespace of a tenancy that is
 * not their own. This is useful in cross-tenant Object Storage operations. Object Storage namespace
 * can be retrieved using the compartment id of the target tenancy if the user has necessary
 * permissions to access that tenancy.
 *
 * <p>For example if Tenant A wants to access Tenant B's object storage namespace then Tenant A has
 * to define a policy similar to following:
 *
 * <p>DEFINE TENANCY TenantB AS <TenantB OCID> ENDORSE GROUP <TenantA user group name> TO
 * {OBJECTSTORAGE_NAMESPACE_READ} IN TENANCY TenantB
 *
 * <p>and Tenant B should add a policy similar to following:
 *
 * <p>DEFINE TENANCY TenantA AS <TenantA OCID> DEFINE GROUP TenantAGroup AS <TenantA user group
 * OCID> ADMIT GROUP TenantAGroup OF TENANCY TenantA TO {OBJECTSTORAGE_NAMESPACE_READ} IN TENANCY
 *
 * <p>This example covers only GetNamespace operation across tenants. Additional permissions will be
 * required to perform more Object Storage operations.
 */
public class ObjectStorageGetNamespaceExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     *     <ul>
     *       <li>The first argument is the OCID of the compartment for which we will get the
     *           namespace
     *     </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Unexpected number of arguments received. Consult the script header comments for expected arguments");
        }

        final String compartmentId = args[0];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        ObjectStorageClient objectStorageClient =
                ObjectStorageClient.builder().region(Region.US_PHOENIX_1).build(provider);

        // Construct GetNamespaceRequest with the given compartmentId.
        GetNamespaceRequest getNamespaceRequest =
                GetNamespaceRequest.builder().compartmentId(compartmentId).build();
        String namespace = objectStorageClient.getNamespace(getNamespaceRequest).getValue();

        System.out.println(
                String.format(
                        "Object Storage namespace for compartment [%s] is [%s]",
                        compartmentId, namespace));
    }
}
