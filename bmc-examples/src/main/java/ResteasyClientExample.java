/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.http.ResteasyClientConfigurator;
import com.oracle.bmc.identity.IdentityAsyncClient;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.AvailabilityDomain;
import com.oracle.bmc.identity.model.CreateUserDetails;
import com.oracle.bmc.identity.model.UpdateUserDetails;
import com.oracle.bmc.identity.requests.CreateUserRequest;
import com.oracle.bmc.identity.requests.DeleteUserRequest;
import com.oracle.bmc.identity.requests.GetUserRequest;
import com.oracle.bmc.identity.requests.ListAvailabilityDomainsRequest;
import com.oracle.bmc.identity.requests.UpdateUserRequest;
import com.oracle.bmc.identity.responses.CreateUserResponse;
import com.oracle.bmc.identity.responses.GetUserResponse;
import com.oracle.bmc.identity.responses.ListAvailabilityDomainsResponse;
import com.oracle.bmc.identity.responses.UpdateUserResponse;
import com.oracle.bmc.responses.AsyncHandler;
import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.client.ClientBuilder;
import java.util.concurrent.CountDownLatch;

/**
 * An example to demonstrate how to use resteasy client with JavaSDK.
 */
@Slf4j
public class ResteasyClientExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    public static void main(String[] args) throws Exception {

        final String compartmentId = args[0];

        final ConfigFileReader.ConfigFile configFile =
                ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        // The following line is only necessary for this example because we the configuration in
        // resources/META-INF/services/javax.ws.rs.client.ClientBuilder. If you are using Resteasy by default, this line
        // is not necessary
        System.setProperty(
                ClientBuilder.JAXRS_DEFAULT_CLIENT_BUILDER_PROPERTY,
                "org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder");

        IdentityClient identityClient =
                IdentityClient.builder()
                        .additionalClientConfigurator(new ResteasyClientConfigurator())
                        .build(provider);

        IdentityAsyncClient identityAsyncClient =
                IdentityAsyncClient.builder()
                        .additionalClientConfigurator(new ResteasyClientConfigurator())
                        .build(provider);

        identityClient.setRegion(Region.US_PHOENIX_1);
        identityAsyncClient.setRegion(Region.US_PHOENIX_1);

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

            // Due to https://jira.oci.oraclecorp.com/browse/DEX-4844, the following code does not work yet.
            //            System.out.println();
            //            System.out.println();
            //            System.out.println(
            //                    "*************Asynchronous List Availability Domains with Futures*************************");
            //            final ListAvailabilityDomainsRequest request =
            //                    ListAvailabilityDomainsRequest.builder().compartmentId(compartmentId).build();
            //
            //            final Future<ListAvailabilityDomainsResponse> future =
            //                    identityAsyncClient.listAvailabilityDomains(request, null);
            //            final ListAvailabilityDomainsResponse responseFromFuture = future.get();
            //
            //            for (AvailabilityDomain domain : responseFromFuture.getItems()) {
            //                System.out.println(domain.toString());
            //            }
            //            System.out.println(
            //                    "*****************************************************************************************");

            System.out.println();
            System.out.println();

            System.out.println(
                    "***********Asynchronous List Availability Domains with Async Handler************");
            final ListAvailabilityDomainsRequest request =
                    ListAvailabilityDomainsRequest.builder().compartmentId(compartmentId).build();
            final AsyncHandler<ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse>
                    asyncHandler = new ResteasyClientExample.ExampleAsyncHandler();
            identityAsyncClient.listAvailabilityDomains(request, asyncHandler);
            ((ResteasyClientExample.ExampleAsyncHandler) asyncHandler).waitForCompletion();
            System.out.println(
                    "*****************************************************************************************");

        } finally {
            identityClient.close();
            identityAsyncClient.close();
            System.clearProperty(ClientBuilder.JAXRS_DEFAULT_CLIENT_BUILDER_PROPERTY);
        }
    }

    static class ExampleAsyncHandler
            implements AsyncHandler<
                    ListAvailabilityDomainsRequest, ListAvailabilityDomainsResponse> {
        private final CountDownLatch latch = new CountDownLatch(1);

        @Override
        public void onSuccess(
                ListAvailabilityDomainsRequest request, ListAvailabilityDomainsResponse response) {
            for (AvailabilityDomain domain : response.getItems()) {
                System.out.println(domain.toString());
            }
            latch.countDown();
        }

        @Override
        public void onError(ListAvailabilityDomainsRequest request, Throwable t) {
            t.printStackTrace();
            latch.countDown();
        }

        public void waitForCompletion() throws Exception {
            latch.await();
        }
    }
}
