/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.graalvm;

import com.oracle.bmc.Region;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AddUserToGroupDetails;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.model.CreateApiKeyDetails;
import com.oracle.bmc.identity.model.CreateGroupDetails;
import com.oracle.bmc.identity.model.CreatePolicyDetails;
import com.oracle.bmc.identity.model.CreateUserDetails;
import com.oracle.bmc.identity.model.Group;
import com.oracle.bmc.identity.model.Policy.LifecycleState;
import com.oracle.bmc.identity.model.User;
import com.oracle.bmc.identity.requests.AddUserToGroupRequest;
import com.oracle.bmc.identity.requests.CreateGroupRequest;
import com.oracle.bmc.identity.requests.CreatePolicyRequest;
import com.oracle.bmc.identity.requests.CreateUserRequest;
import com.oracle.bmc.identity.requests.GetCompartmentRequest;
import com.oracle.bmc.identity.requests.GetPolicyRequest;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.requests.ListGroupsRequest;
import com.oracle.bmc.identity.requests.ListUsersRequest;
import com.oracle.bmc.identity.requests.UploadApiKeyRequest;
import com.oracle.bmc.identity.responses.CreateGroupResponse;
import com.oracle.bmc.identity.responses.CreatePolicyResponse;
import com.oracle.bmc.identity.responses.CreateUserResponse;
import com.oracle.bmc.identity.responses.GetCompartmentResponse;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.identity.responses.ListGroupsResponse;
import com.oracle.bmc.identity.responses.ListUsersResponse;
import com.oracle.bmc.model.BmcException;
import net.jodah.failsafe.Failsafe;
import net.jodah.failsafe.RetryPolicy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class TestUserResource implements TestResource {
    // This retry policy is intended to be used when we try and ensure that a policy has been applied
    // to the user created inside this resource. We retry on 404s as they'd indicate we're not authorised
    // (or the compartment doesn't exist, but that shouldn't be the case based on where this policy is used)
    final RetryPolicy CHECK_IAM_POLICY_APPLIED_RETRY_POLICY =
            new RetryPolicy()
                    .retryOn(
                            e ->
                                    e instanceof BmcException
                                            && ((BmcException) e).getStatusCode() == 404)
                    .withDelay(10, TimeUnit.SECONDS)
                    .withMaxRetries(10);
    final String TEST_USER_NAME = "JavaSDK.TestUser";

    private final List<String> availabilityDomains = new ArrayList<>();

    // provider must have admin privileges
    private final BasicAuthenticationDetailsProvider provider;
    private final String publicKey;
    private final ClientConfigurator configurator;
    private final String tenantId;

    private Identity identity;
    private String userId;
    private String groupId;
    private String policyId;

    private String compartmentName;

    private String userName;
    private String policyTesterGroupName;

    @java.beans.ConstructorProperties({"provider", "publicKey", "configurator", "tenantId"})
    public TestUserResource(
            BasicAuthenticationDetailsProvider provider,
            String publicKey,
            ClientConfigurator configurator,
            String tenantId) {
        this.provider = provider;
        this.publicKey = publicKey;
        this.configurator = configurator;
        this.tenantId = tenantId;
    }

    @Override
    public void before() throws Exception {
        try {
            identity = new IdentityClient(provider, null, configurator);
            Optional<Region> testRegion = BaseTest.getTestRegion();
            if (testRegion.isPresent()) {
                identity.setRegion(testRegion.get());
            } else {
                String testEndpoint = BaseTest.getTestEndpoint(IdentityClient.SERVICE);
                System.out.println(
                        "Using "
                                + testEndpoint
                                + " for "
                                + IdentityClient.SERVICE.getServiceName());
                identity.setEndpoint(testEndpoint);
            }

            Optional<User> foundTestUser = findUserByName(TEST_USER_NAME);
            if (foundTestUser.isPresent()) {
                System.out.println(
                        "Found existing TEST USER:"
                                + foundTestUser.get().getName()
                                + ", userId="
                                + foundTestUser.get().getId());
                userId = foundTestUser.get().getId();
                loadAvailabilityDomains();
                return;
            }

            System.out.println("Start creating TEST USER...");

            userName = TEST_USER_NAME;
            CreateUserResponse createUserResponse =
                    identity.createUser(
                            CreateUserRequest.builder()
                                    .createUserDetails(
                                            CreateUserDetails.builder()
                                                    .compartmentId(tenantId)
                                                    .name(userName)
                                                    .description("OK to delete")
                                                    .build())
                                    .build());
            userId = createUserResponse.getUser().getId();
            identity.uploadApiKey(
                    UploadApiKeyRequest.builder()
                            .userId(userId)
                            .createApiKeyDetails(
                                    CreateApiKeyDetails.builder().key(publicKey).build())
                            .build());

            String groupName = "GroupFor." + userName;
            Optional<Group> groupByName = findGroupByName(groupName);
            if (groupByName.isPresent()) {
                groupId = groupByName.get().getId();
            } else {
                CreateGroupResponse createGroupResponse =
                        identity.createGroup(
                                CreateGroupRequest.builder()
                                        .createGroupDetails(
                                                CreateGroupDetails.builder()
                                                        .compartmentId(tenantId)
                                                        .description("OK to delete")
                                                        .name(groupName)
                                                        .build())
                                        .build());
                groupId = createGroupResponse.getGroup().getId();
            }

            policyTesterGroupName = "2GroupFor." + userName;
            Optional<Group> policyTesterGroupByName = findGroupByName(policyTesterGroupName);
            if (!policyTesterGroupByName.isPresent()) {
                identity.createGroup(
                        CreateGroupRequest.builder()
                                .createGroupDetails(
                                        CreateGroupDetails.builder()
                                                .compartmentId(tenantId)
                                                .description("OK to delete")
                                                .name(policyTesterGroupName)
                                                .build())
                                .build());
            }

            identity.addUserToGroup(
                    AddUserToGroupRequest.builder()
                            .addUserToGroupDetails(
                                    AddUserToGroupDetails.builder()
                                            .groupId(groupId)
                                            .userId(userId)
                                            .build())
                            .build());

            GetCompartmentResponse compartmentResponse =
                    identity.getCompartment(
                            GetCompartmentRequest.builder()
                                    .compartmentId(BaseTest.getTestCompartmentId())
                                    .build());
            compartmentName = compartmentResponse.getCompartment().getName();

            List<String> statements = new ArrayList<>();
            statements.add(
                    "Allow group "
                            + groupName
                            + " manage all-resources on compartment "
                            + compartmentName);

            // allow user to call listVolumeBackupPolicies
            statements.add("Allow group " + groupName + " to read volume-family in tenancy");
            // allow user to use tag-namespaces across compartments.
            statements.add("Allow group " + groupName + " to use tag-namespaces in tenancy");
            CreatePolicyResponse createPolicyResponse =
                    identity.createPolicy(
                            CreatePolicyRequest.builder()
                                    .createPolicyDetails(
                                            CreatePolicyDetails.builder()
                                                    .compartmentId(tenantId)
                                                    .description("OK to delete")
                                                    .name("PolicyFor." + userName)
                                                    .statements(statements)
                                                    .build())
                                    .build());
            policyId = createPolicyResponse.getPolicy().getId();

            identity.getWaiters()
                    .forPolicy(
                            GetPolicyRequest.builder().policyId(policyId).build(),
                            LifecycleState.Active)
                    .execute();

            // small sleep to allow policy to take effect
            Thread.sleep(10000L);

            loadAvailabilityDomains();

            testPolicyActive();

            System.out.println("End creating TEST USER");
        } catch (Exception e) {
            e.printStackTrace(System.err);
            throw e;
        }
    }

    @Override
    public void after() throws Exception {
        identity.close();
    }

    /**
     * This makes sure that the policy applied to the temporary user in this class is active. The policy we're giving them is:
     *
     *    Allow group <group> to manage all-resources on compartment <compartment>
     *
     * So we can make sure that the policy is active by performing some action against the compartment. In this case we'll create
     * a policy in the compartment. This method will also retry in case it takes longer to apply the policy than "normal" (according
     * to the docs "New policies take effect typically within 10 seconds")
     */
    private void testPolicyActive() throws Exception {
        try (Identity testClient =
                new IdentityClient(
                        BaseTest.createUserProvider(userId),
                        null,
                        BaseTest.createUserConfigurator(userId))) {
            Optional<Region> testRegion = BaseTest.getTestRegion();
            if (testRegion.isPresent()) {
                testClient.setRegion(testRegion.get());
            } else {
                String testEndpoint = BaseTest.getTestEndpoint(IdentityClient.SERVICE);
                System.out.println(
                        "Using "
                                + testEndpoint
                                + " for "
                                + IdentityClient.SERVICE.getServiceName());

                testClient.setEndpoint(testEndpoint);
            }

            final String policyStatement =
                    String.format(
                            "Allow group %s to manage instance-family in compartment %s",
                            policyTesterGroupName,
                            compartmentName);

            final List<String> statements = Arrays.asList(policyStatement);
            final CreatePolicyRequest createPolicyRequest =
                    CreatePolicyRequest.builder()
                            .createPolicyDetails(
                                    CreatePolicyDetails.builder()
                                            .compartmentId(BaseTest.getTestCompartmentId())
                                            .description("OK to delete")
                                            .name("2PolicyFor." + userName)
                                            .statements(statements)
                                            .build())
                            .build();

            //Try and create the policy. We don't have any waiters since a successful creation should be sufficient to know that
            //temporary user's policy has been applied and is being used/evaluated
            final CreatePolicyResponse createPolicyResponse =
                    Failsafe.with(CHECK_IAM_POLICY_APPLIED_RETRY_POLICY)
                            .get(() -> testClient.createPolicy(createPolicyRequest));
        }
    }

    private Optional<User> findUserByName(String name) {
        for (ListUsersResponse users :
                identity.getPaginators()
                        .listUsersResponseIterator(
                                ListUsersRequest.builder().compartmentId(tenantId).build())) {
            Optional<User> foundUser =
                    users.getItems().stream().filter(user -> user.getName().equals(name)).findAny();
            if (foundUser.isPresent()) {
                return foundUser;
            }
        }
        return Optional.empty();
    }

    private Optional<Group> findGroupByName(String name) {
        for (ListGroupsResponse groups :
                identity.getPaginators()
                        .listGroupsResponseIterator(
                                ListGroupsRequest.builder().compartmentId(tenantId).build())) {
            Optional<Group> foundGroup =
                    groups.getItems()
                            .stream()
                            .filter(user -> user.getName().equals(name))
                            .findAny();
            if (foundGroup.isPresent()) {
                return foundGroup;
            }
        }
        return Optional.empty();
    }

    private void loadAvailabilityDomains() {
        ListAvailabilityDomainsResponse availabilityDomainsResponse =
                identity.listAvailabilityDomains(
                        ListAvailabilityDomainsRequest.builder()
                                .compartmentId(BaseTest.getTestCompartmentId())
                                .build());
        for (AvailabilityDomain ad :
                BaseTest.reorderAvailabilityDomain(availabilityDomainsResponse.getItems())) {
            availabilityDomains.add(ad.getName());
        }
    }

    public List<String> getAvailabilityDomains() {
        return this.availabilityDomains;
    }

    public String getUserId() {
        return this.userId;
    }
}
