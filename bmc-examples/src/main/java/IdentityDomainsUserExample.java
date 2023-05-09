/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import java.io.IOException;
import java.util.Collections;

import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.identitydomains.IdentityDomainsClient;
import com.oracle.bmc.identitydomains.model.AttributeSets;
import com.oracle.bmc.identitydomains.model.ExtensionCapabilitiesUser;
import com.oracle.bmc.identitydomains.model.FreeformTags;
import com.oracle.bmc.identitydomains.model.UserEmails;
import com.oracle.bmc.identitydomains.model.UserName;
import com.oracle.bmc.identitydomains.model.ExtensionOCITags;
import com.oracle.bmc.identitydomains.model.ExtensionSelfChangeUser;
import com.oracle.bmc.identitydomains.model.Operations;
import com.oracle.bmc.identitydomains.model.PatchOp;
import com.oracle.bmc.identitydomains.model.SortOrder;
import com.oracle.bmc.identitydomains.model.User;
import com.oracle.bmc.identitydomains.model.UserSearchRequest;
import com.oracle.bmc.identitydomains.model.Operations.Op;
import com.oracle.bmc.identitydomains.model.UserEmails.Type;
import com.oracle.bmc.identitydomains.requests.CreateUserRequest;
import com.oracle.bmc.identitydomains.requests.DeleteUserRequest;
import com.oracle.bmc.identitydomains.requests.ListUsersRequest;
import com.oracle.bmc.identitydomains.requests.PatchUserRequest;
import com.oracle.bmc.identitydomains.requests.PutUserRequest;
import com.oracle.bmc.identitydomains.requests.SearchUsersRequest;
import com.oracle.bmc.identitydomains.responses.CreateUserResponse;
import com.oracle.bmc.identitydomains.responses.ListUsersResponse;
import com.oracle.bmc.identitydomains.responses.PatchUserResponse;
import com.oracle.bmc.identitydomains.responses.PutUserResponse;
import com.oracle.bmc.identitydomains.responses.SearchUsersResponse;

/**
 * This class provides an example of how to create an identity domain client based on the
 * <i>~/.oci/config</i> file and how to use the client to create/read/update/delete User instances.
 * It will:
 *
 * <ul>
 *   <li>Create a new user
 *   <li>Get the user by id
 *   <li>Find the user by the displayName using LIST method
 *   <li>Find the user by the displayName using POST method
 *   <li>Update the user with PUT method
 *   <li>Update the user with PATCH method
 *   <li>Delete the user
 * </ul>
 */
public class IdentityDomainsUserExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws IOException {

        final ConfigFile configFile = ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final IdentityDomainsClient identityDomainsClient =
                IdentityDomainsClient.builder().build(provider);

        /*
         * To find Domain URL, navigate to Identity > Domains in OCI console, choose relevant domain,
         * then in the overview page, find "Domain URL" under "Domain Information", click "Copy",
         * open ~/.oci/config in editor of your choice, create custom value "domain_endpoint",
         * paste the URL after the value name.
         * Should look like: domain_endpoint=https://idcs-...identity.oraclecloud.com
         * Further reading: https://docs.oracle.com/en-us/iaas/Content/Identity/domains/to-view-identity-domains.htm#view-identity-domains
         * OCI config docs: https://docs.oracle.com/en-us/iaas/Content/API/Concepts/sdkconfig.htm
         */
        final String DOMAIN_ENDPOINT = configFile.get("domain_endpoint");
        if (DOMAIN_ENDPOINT == null || DOMAIN_ENDPOINT.isEmpty()) {
            throw new IllegalArgumentException(
                    "Please specify domain_endpoint in your ~/.oci/config.");
        }
        identityDomainsClient.setEndpoint(DOMAIN_ENDPOINT);

        try {
            User user = createTestUser(identityDomainsClient);
            findUserByDisplayName(identityDomainsClient, user.getDisplayName());
            findUserByDisplayNameUsingPost(identityDomainsClient, user.getDisplayName());
            replaceUser(identityDomainsClient, user);
            updateUser(identityDomainsClient, user);
            deleteUser(identityDomainsClient, user);
        } catch (Exception e) {
            print(e.getMessage());
        } finally {
            identityDomainsClient.close();
        }
    }

    /**
     * Creates a User object and calls the client createUser function to create the user.
     *
     * @param client the identity domain client
     * @return the created user
     */
    private static User createTestUser(final IdentityDomainsClient client) {
        User user =
                User.builder()
                        .name(
                                UserName.builder()
                                        .familyName("testFamilyName")
                                        .givenName("testGivenName")
                                        .build())
                        .userName("javaUserName" + System.currentTimeMillis())
                        .displayName("javaDisplayName" + System.currentTimeMillis())
                        .description("test user")
                        .emails(
                                Collections.singletonList(
                                        UserEmails.builder()
                                                .type(Type.Work)
                                                .primary(true)
                                                .value("example@email.com")
                                                .build()))
                        .urnIetfParamsScimSchemasOracleIdcsExtensionOciTags(
                                ExtensionOCITags.builder()
                                        .freeformTags(
                                                Collections.singletonList(
                                                        FreeformTags.builder()
                                                                .key("Domains-Test")
                                                                .value("Java tester")
                                                                .build()))
                                        .build())
                        .urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser(
                                ExtensionCapabilitiesUser.builder()
                                        .canUseApiKeys(true)
                                        .canUseAuthTokens(true)
                                        .canUseConsolePassword(true)
                                        .canUseCustomerSecretKeys(false)
                                        .canUseDbCredentials(false)
                                        .canUseOAuth2ClientCredentials(true)
                                        .canUseSmtpCredentials(false)
                                        .build())
                        .schemas(
                                Collections.singletonList(
                                        "urn:ietf:params:scim:schemas:core:2.0:User"))
                        .build();
        CreateUserResponse response =
                client.createUser(CreateUserRequest.builder().user(user).build());
        printUser("Created user", response.getUser());
        return response.getUser();
    }

    /**
     * Uses listUsers function to retrieve users. The filter string needs to be created manually,
     * read more about the filter string in <a
     * href="https://datatracker.ietf.org/doc/rfc7644/">System for Cross-domain Identity Management:
     * Protocol</a> section 3.4.2.2.
     *
     * @param client the identity domain client
     * @param displayName the displayName of the target user
     */
    private static void findUserByDisplayName(
            final IdentityDomainsClient client, String displayName) {
        String filter = "displayName eq \"" + displayName + "\"";
        ListUsersResponse response =
                client.listUsers(
                        ListUsersRequest.builder()
                                .attributeSets(Collections.singletonList(AttributeSets.All))
                                .filter(filter)
                                .count(1)
                                .startIndex(1)
                                .sortBy("id")
                                .sortOrder(SortOrder.Descending)
                                .build());
        User user = response.getUsers().getResources().get(0);
        printUser("Found user by displayName", user);
    }

    /**
     * Uses searchUsers function to retrieve users. The filter string needs to be created manually,
     * read more about the filter string in <a
     * href="https://datatracker.ietf.org/doc/rfc7644/">System for Cross-domain Identity Management:
     * Protocol</a> section 3.4.2.2.
     *
     * @param client the identity domain client
     * @param displayName the displayName of the target user
     */
    private static void findUserByDisplayNameUsingPost(
            final IdentityDomainsClient client, String displayName) {
        String filter = "displayName eq \"" + displayName + "\"";
        UserSearchRequest body =
                UserSearchRequest.builder()
                        .count(1)
                        .startIndex(1)
                        .sortOrder(SortOrder.Descending)
                        .attributeSets(Collections.singletonList(AttributeSets.All))
                        .filter(filter)
                        .schemas(
                                Collections.singletonList(
                                        "urn:ietf:params:scim:api:messages:2.0:SearchRequest"))
                        .build();
        SearchUsersResponse response =
                client.searchUsers(SearchUsersRequest.builder().userSearchRequest(body).build());
        User user = response.getUsers().getResources().get(0);
        printUser("Found user by displayName using POST", user);
    }

    /**
     * Replaces a user with updated description and capabilities, allow self change.
     *
     * @param client the identity domain client
     * @param user the user needs to be updated
     */
    private static void replaceUser(final IdentityDomainsClient client, User user) {
        User updatedUser =
                User.builder()
                        .copy(user)
                        .description("new description")
                        .urnIetfParamsScimSchemasOracleIdcsExtensionCapabilitiesUser(
                                ExtensionCapabilitiesUser.builder()
                                        .canUseSmtpCredentials(true)
                                        .build())
                        .urnIetfParamsScimSchemasOracleIdcsExtensionSelfChangeUser(
                                ExtensionSelfChangeUser.builder().allowSelfChange(true).build())
                        .build();
        PutUserResponse response =
                client.putUser(
                        PutUserRequest.builder().userId(user.getOcid()).user(updatedUser).build());
        printUser(
                "Replaced user with updated description, capabilities and self change value",
                response.getUser());
    }

    /**
     * Updates user description using patchUser method.
     *
     * @param client the identity domain client
     * @param user the user needs to be updated
     */
    private static void updateUser(final IdentityDomainsClient client, User user) {
        PatchOp patchBody =
                PatchOp.builder()
                        .operations(
                                Collections.singletonList(
                                        Operations.builder()
                                                .op(Op.Replace)
                                                .path("description")
                                                .value("updated description after patchOp")
                                                .build()))
                        .schemas(
                                Collections.singletonList(
                                        "urn:ietf:params:scim:api:messages:2.0:PatchOp"))
                        .build();
        PatchUserResponse response =
                client.patchUser(
                        PatchUserRequest.builder()
                                .userId(user.getOcid())
                                .patchOp(patchBody)
                                .build());
        printUser("Updated domains user description", response.getUser());
    }

    /**
     * Deletes a user.
     *
     * @param client the identity domain client
     * @param user the user needs to be deleted
     */
    private static void deleteUser(final IdentityDomainsClient client, User user) {
        client.deleteUser(DeleteUserRequest.builder().userId(user.getOcid()).build());
        print("Deleted user " + user.getDisplayName());
    }

    private static void print(String text) {
        System.out.println("-------------------------------------------------");
        System.out.println(text);
    }

    private static void printUser(String text, User user) {
        print(text);
        System.out.println("- User name: " + user.getUserName());
        System.out.println("- Display name: " + user.getDisplayName());
        System.out.println("- Description: " + user.getDescription());
        System.out.println("- Ocid: " + user.getOcid());
    }
}
