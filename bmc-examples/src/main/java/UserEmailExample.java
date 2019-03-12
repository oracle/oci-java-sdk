/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.identity.Identity;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.CreateUserDetails;
import com.oracle.bmc.identity.model.UpdateUserDetails;
import com.oracle.bmc.identity.requests.CreateUserRequest;
import com.oracle.bmc.identity.requests.GetUserRequest;
import com.oracle.bmc.identity.requests.UpdateUserRequest;
import com.oracle.bmc.identity.responses.CreateUserResponse;
import com.oracle.bmc.identity.responses.GetUserResponse;
import com.oracle.bmc.identity.responses.UpdateUserResponse;

/*
 * Example Class to show the usage of Emails on user accounts in the context of Account Recovery.
 * This sample will do the following things:
 * 1) Create an user and provide an email
 * 2) Update an existing user with a new email
 * 3) Get an user with an existing email
 */
public class UserEmailExample {

    public static void main(String[] args) throws Exception {
        // TODO: Fill in this value
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final String tenantId = provider.getTenantId();
        System.out.println("tenantId: " + tenantId);

        Identity identityClient = new IdentityClient(provider);

        //Create new user with email
        CreateUserDetails createUserDetails =
                CreateUserDetails.builder()
                        .compartmentId(tenantId)
                        .name("SDK-Sample-User")
                        .description("SDK sample user")
                        .email("SDKsampleEmail")
                        .build();
        CreateUserRequest createUserRequest =
                CreateUserRequest.builder().createUserDetails(createUserDetails).build();
        CreateUserResponse createUserResponse = identityClient.createUser(createUserRequest);
        String userId = createUserResponse.getUser().getId();

        System.out.println(
                "Created user: "
                        + createUserResponse.getUser().getName()
                        + " with email: "
                        + createUserResponse.getUser().getEmail());

        //Update existing user email
        UpdateUserDetails updateUserDetails =
                UpdateUserDetails.builder().email("SDKsampleEmail2").build();
        UpdateUserRequest updateUserRequest =
                UpdateUserRequest.builder()
                        .userId(userId)
                        .updateUserDetails(updateUserDetails)
                        .build();
        UpdateUserResponse updateUserResponse = identityClient.updateUser(updateUserRequest);

        System.out.println(
                "Updated user: "
                        + updateUserResponse.getUser().getName()
                        + " with email: "
                        + updateUserResponse.getUser().getEmail());

        //Get user details with email
        GetUserRequest getUserRequest = GetUserRequest.builder().userId(userId).build();
        GetUserResponse getUserReponse = identityClient.getUser(getUserRequest);

        System.out.println(
                "Get user: "
                        + getUserReponse.getUser().getName()
                        + " and got email: "
                        + getUserReponse.getUser().getEmail());
    }
}
