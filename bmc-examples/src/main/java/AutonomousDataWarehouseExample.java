/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.database.DatabaseClient;
import com.oracle.bmc.database.DatabaseWaiters;
import com.oracle.bmc.database.model.AutonomousDatabase;
import com.oracle.bmc.database.model.GenerateAutonomousDatabaseWalletDetails;
import com.oracle.bmc.database.model.UpdateAutonomousDatabaseDetails;
import com.oracle.bmc.database.requests.DeleteAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.GetAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.StartAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.StopAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.UpdateAutonomousDatabaseRequest;
import com.oracle.bmc.database.requests.CreateAutonomousDatabaseRequest;
import com.oracle.bmc.database.responses.CreateAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.GetAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.UpdateAutonomousDatabaseResponse;
import com.oracle.bmc.database.responses.GenerateAutonomousDatabaseWalletResponse;
import com.oracle.bmc.database.requests.GenerateAutonomousDatabaseWalletRequest;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseDetails;
import com.oracle.bmc.database.model.CreateAutonomousDatabaseBase;
import java.util.zip.ZipInputStream;
import java.util.Random;

public class AutonomousDatawarehouseExample {

    public static void main(String[] args) throws Exception {
        String configurationFilePath = "~/.oci/config";
        String profile = "DEFAULT";

        if (args.length != 2) {
            throw new IllegalArgumentException(
                    String.format(
                            "Unexpected number of arguments.  Expected 2, got %s", args.length));
        }

        // TODO: Fill in these values
        String compartmentId = args[0];
        String password = args[1];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        DatabaseClient dbClient = new DatabaseClient(provider);
        dbClient.setRegion(Region.US_PHOENIX_1);

        // Create
        CreateAutonomousDatabaseDetails createRequest = createAdwRequest(compartmentId);

        System.out.println("Creating Autonomous Datawarehouse with request : " + createRequest);
        AutonomousDatabase adw = createADW(dbClient, createRequest);
        System.out.println("ADW instance is provisioning : " + adw);

        adw = waitForInstanceToBecomeAvailable(dbClient, adw.getId());
        System.out.println("Instance is provisioned:" + adw);

        // Get
        adw =
                dbClient.getAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(adw.getId())
                                        .build())
                        .getAutonomousDatabase();
        System.out.println("GET request returned :" + adw);

        // Scale
        UpdateAutonomousDatabaseDetails updateRequest = scaleAdwRequest();
        System.out.println("Updating Autonomous Datawarehouse with request : " + updateRequest);
        AutonomousDatabase updatedAdw = updateADW(dbClient, updateRequest, adw.getId());
        System.out.println("ADW instance is scaling : " + updatedAdw);

        updatedAdw = waitForInstanceToBecomeAvailable(dbClient, adw.getId());
        System.out.println("Instance is updated:" + updatedAdw);

        // Update Display Name
        updateRequest = updateDisplayNameAdwRequest();
        System.out.println("Updating Autonomous Datawarehouse with request : " + updateRequest);
        updatedAdw = updateADW(dbClient, updateRequest, adw.getId());
        System.out.println("Instance is updated:" + updatedAdw);

        // Stop
        System.out.println("Stopping Autonomous Datawarehouse Shared : " + updatedAdw);
        adw =
                dbClient.stopAutonomousDatabase(
                                StopAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(updatedAdw.getId())
                                        .build())
                        .getAutonomousDatabase();
        adw = waitForInstanceToBeStopped(dbClient, adw.getId());
        System.out.println("Stopped Autonomous Datawarehouse Shared : " + adw);

        // Start
        System.out.println("Starting Autonomous Datawarehouse Shared : " + adw);
        adw =
                dbClient.startAutonomousDatabase(
                                StartAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(updatedAdw.getId())
                                        .build())
                        .getAutonomousDatabase();
        adw = waitForInstanceToBecomeAvailable(dbClient, adw.getId());
        System.out.println("Started Autonomous Datawarehouse Shared : " + adw);

        //download wallet

        System.out.println("Downloading wallet for  : " + adw);
        GenerateAutonomousDatabaseWalletDetails adwWalletDetails = createAdwWalletDetails(password);
        GenerateAutonomousDatabaseWalletResponse adwWalletResponse =
                generateADWWallet(dbClient, adwWalletDetails, adw.getId());
        System.out.println(
                "Autonomous data warehouse downloaded wallet content length is : "
                        + adwWalletResponse.getContentLength());
        ZipInputStream zin = new ZipInputStream(adwWalletResponse.getInputStream());
        // Delete
        System.out.println("Deleting Autonomous Datawarehouse Shared : " + adw);
        dbClient.deleteAutonomousDatabase(
                DeleteAutonomousDatabaseRequest.builder()
                        .autonomousDatabaseId(updatedAdw.getId())
                        .build());

        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDatabaseResponse response =
                waiter.forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(adw.getId())
                                        .build(),
                                AutonomousDatabase.LifecycleState.Terminated)
                        .execute();

        dbClient.close();
    }

    public static AutonomousDatabase createADW(
            DatabaseClient dbClient, CreateAutonomousDatabaseDetails request) {

        CreateAutonomousDatabaseResponse response =
                dbClient.createAutonomousDatabase(
                        CreateAutonomousDatabaseRequest.builder()
                                .createAutonomousDatabaseDetails(request)
                                .build());

        return response.getAutonomousDatabase();
    }

    private static AutonomousDatabase waitForInstanceToBecomeAvailable(
            DatabaseClient dbClient, String id) throws Exception {

        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDatabaseResponse response =
                waiter.forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(id)
                                        .build(),
                                AutonomousDatabase.LifecycleState.Available)
                        .execute();

        return response.getAutonomousDatabase();
    }

    private static AutonomousDatabase updateADW(
            DatabaseClient dbClient, UpdateAutonomousDatabaseDetails updateRequest, String adwId) {
        UpdateAutonomousDatabaseResponse response =
                dbClient.updateAutonomousDatabase(
                        UpdateAutonomousDatabaseRequest.builder()
                                .updateAutonomousDatabaseDetails(updateRequest)
                                .autonomousDatabaseId(adwId)
                                .build());

        return response.getAutonomousDatabase();
    }

    private static GenerateAutonomousDatabaseWalletResponse generateADWWallet(
            DatabaseClient dbClient,
            GenerateAutonomousDatabaseWalletDetails adwWalletDetails,
            String adwId) {
        GenerateAutonomousDatabaseWalletResponse response =
                dbClient.generateAutonomousDatabaseWallet(
                        GenerateAutonomousDatabaseWalletRequest.builder()
                                .generateAutonomousDatabaseWalletDetails(adwWalletDetails)
                                .autonomousDatabaseId(adwId)
                                .build());

        return response;
    }

    private static GenerateAutonomousDatabaseWalletDetails createAdwWalletDetails(String password) {
        return GenerateAutonomousDatabaseWalletDetails.builder().password(password).build();
    }

    private static AutonomousDatabase waitForInstanceToBeStopped(DatabaseClient dbClient, String id)
            throws Exception {
        DatabaseWaiters waiter = dbClient.getWaiters();
        GetAutonomousDatabaseResponse response =
                waiter.forAutonomousDatabase(
                                GetAutonomousDatabaseRequest.builder()
                                        .autonomousDatabaseId(id)
                                        .build(),
                                AutonomousDatabase.LifecycleState.Stopped)
                        .execute();

        return response.getAutonomousDatabase();
    }

    private static CreateAutonomousDatabaseDetails createAdwRequest(String compartmentId) {
        Random rand = new Random();
        return CreateAutonomousDatabaseDetails.builder()
                .dbWorkload(CreateAutonomousDatabaseBase.DbWorkload.Dw)
                .cpuCoreCount(1)
                .dataStorageSizeInTBs(1)
                .displayName("javaSdkExample")
                .adminPassword("DBaaS12345_#")
                .dbName("javaSdkExam" + rand.nextInt(500))
                .compartmentId(compartmentId)
                .licenseModel(CreateAutonomousDatabaseDetails.LicenseModel.LicenseIncluded)
                .build();
    }

    private static UpdateAutonomousDatabaseDetails scaleAdwRequest() {
        return UpdateAutonomousDatabaseDetails.builder()
                .cpuCoreCount(2)
                .dataStorageSizeInTBs(2)
                .build();
    }

    private static UpdateAutonomousDatabaseDetails updateDisplayNameAdwRequest() {
        return UpdateAutonomousDatabaseDetails.builder().displayName("newDisplayName").build();
    }
}
