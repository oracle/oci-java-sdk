/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.http.ResteasyClientConfigurator;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.CreateUserDetails;
import com.oracle.bmc.identity.model.UpdateUserDetails;
import com.oracle.bmc.identity.requests.CreateUserRequest;
import com.oracle.bmc.identity.requests.DeleteUserRequest;
import com.oracle.bmc.identity.requests.GetUserRequest;
import com.oracle.bmc.identity.requests.UpdateUserRequest;
import com.oracle.bmc.identity.responses.CreateUserResponse;
import com.oracle.bmc.identity.responses.GetUserResponse;
import com.oracle.bmc.identity.responses.UpdateUserResponse;

import javax.ws.rs.client.ClientBuilder;
import java.net.ConnectException;
import java.net.SocketTimeoutException;

/**
 * An example to demonstrate how to use resteasy client with InstancePrincipalsAuthenticationDetailsProvider.
 */
public class InstancePrincipalsAuthenticationDetailsProviderWithResteasyClientExample {

    public static void main(String[] args) throws Exception {
        // The following line is only necessary for this example because we the configuration in
        // resources/META-INF/services/javax.ws.rs.client.ClientBuilder. If you are using Resteasy by default, this line
        // is not necessary
        System.setProperty(
                ClientBuilder.JAXRS_DEFAULT_CLIENT_BUILDER_PROPERTY,
                "org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder");

        final InstancePrincipalsAuthenticationDetailsProvider provider;
        try {
            provider =
                    InstancePrincipalsAuthenticationDetailsProvider.builder()
                            .additionalFederationClientConfigurator(
                                    new ResteasyClientConfigurator())
                            .build();
        } catch (Exception e) {
            if (e.getCause() instanceof SocketTimeoutException
                    || e.getCause() instanceof ConnectException) {
                System.out.println(
                        "This sample only works when running on an OCI instance. Are you sure you’re running on an OCI instance? For more info see: https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Tasks/callingservicesfrominstances.htm");
                return;
            }
            throw e;
        }

        final IdentityClient identityClient =
                IdentityClient.builder()
                        .additionalClientConfigurator(new ResteasyClientConfigurator())
                        .build(provider);

        // TODO: Pass in the compartment ID as an argument, or enter the value directly here (if known)
        final String compartmentId = args[0];
        System.out.println(compartmentId);

        try {
            CreateUserRequest createUserRequest =
                    CreateUserRequest.builder()
                            .createUserDetails(
                                    CreateUserDetails.builder()
                                            .compartmentId(compartmentId)
                                            .name("ResteasyUser")
                                            .description("Creating test user for ResteasyExample!")
                                            .build())
                            .build();

            CreateUserResponse createUserResponse = identityClient.createUser(createUserRequest);

            System.out.println(createUserResponse.getUser().getDescription());

            UpdateUserRequest updateUserRequest =
                    UpdateUserRequest.builder()
                            .userId(createUserResponse.getUser().getId())
                            .updateUserDetails(
                                    UpdateUserDetails.builder()
                                            .description("Updating test user for ResteasyExample!")
                                            .build())
                            .build();

            UpdateUserResponse updateUserResponse = identityClient.updateUser(updateUserRequest);

            GetUserRequest getUserRequest =
                    GetUserRequest.builder().userId(updateUserResponse.getUser().getId()).build();

            GetUserResponse getUserResponse = identityClient.getUser(getUserRequest);

            System.out.println(getUserResponse.getUser().getDescription());

            DeleteUserRequest deleteUserRequest =
                    DeleteUserRequest.builder().userId(getUserResponse.getUser().getId()).build();

            identityClient.deleteUser(deleteUserRequest);

        } finally {
            identityClient.close();
            System.clearProperty(ClientBuilder.JAXRS_DEFAULT_CLIENT_BUILDER_PROPERTY);
        }
    }
}
