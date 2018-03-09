/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.email.EmailClient;
import com.oracle.bmc.email.model.CreateSenderDetails;
import com.oracle.bmc.email.model.CreateSuppressionDetails;
import com.oracle.bmc.email.model.Sender;
import com.oracle.bmc.email.model.SenderSummary;
import com.oracle.bmc.email.model.Suppression;
import com.oracle.bmc.email.model.SuppressionSummary;
import com.oracle.bmc.email.requests.CreateSenderRequest;
import com.oracle.bmc.email.requests.CreateSuppressionRequest;
import com.oracle.bmc.email.requests.DeleteSenderRequest;
import com.oracle.bmc.email.requests.DeleteSuppressionRequest;
import com.oracle.bmc.email.requests.GetSenderRequest;
import com.oracle.bmc.email.requests.GetSuppressionRequest;
import com.oracle.bmc.email.requests.ListSendersRequest;
import com.oracle.bmc.email.requests.ListSuppressionsRequest;
import com.oracle.bmc.email.responses.CreateSenderResponse;
import com.oracle.bmc.email.responses.CreateSuppressionResponse;
import com.oracle.bmc.email.responses.DeleteSenderResponse;
import com.oracle.bmc.email.responses.GetSenderResponse;
import com.oracle.bmc.email.responses.GetSuppressionResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.CreateSmtpCredentialDetails;
import com.oracle.bmc.identity.model.SmtpCredential;
import com.oracle.bmc.identity.model.SmtpCredentialSummary;
import com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails;
import com.oracle.bmc.identity.requests.CreateSmtpCredentialRequest;
import com.oracle.bmc.identity.requests.DeleteSmtpCredentialRequest;
import com.oracle.bmc.identity.requests.ListSmtpCredentialsRequest;
import com.oracle.bmc.identity.requests.UpdateSmtpCredentialRequest;
import com.oracle.bmc.identity.responses.CreateSmtpCredentialResponse;
import com.oracle.bmc.identity.responses.ListSmtpCredentialsResponse;
import com.oracle.bmc.identity.responses.UpdateSmtpCredentialResponse;

/**
 * This class demonstrates how to use the Email Service in the Java SDK. This will cover:
 *
 * <ul>
 *   <li>Creating, retrieving, listing and deleting email senders</li>
 *   <li>Creating, retrieving, listing and deleting email suppressions</li>
 *   <li>
 *       Obtaining SMTP credentials for your IAM user so that you can send emails.
 *       See <a href="https://docs.us-phoenix-1.oraclecloud.com/Content/Email/Tasks/configuresmtpconnection.htm">here</a> for more
 *       information on sending emails
 *   </li>
 * </ul>
 *
 * This class makes the following assumptions:
 * <ul>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>Resources will be created in us-phoenix-1</li>
 *   <li>An SMTP credential will be created for user defined in the configuration file</li>
 *   <li>
 *      You have the appropriate permissions to create email senders in the compartment you've specified
 *      and can also create email suppressions at the tenancy level
 *   </li>
 * <ul>
 */
public class EmailServiceExample {

    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";

    /**
     * The entry point for the example.
     *
     * @param args Arguments to provide to the example. The following arguments are expected:
     * <ul>
     *   <li>
     *       The OCID of the compartment where email senders will be created.
     *       <p>
     *         <b>Note:</b> Suppressions are always created at the tenancy level. Your tenancy OCID will be read
     *         from your configuration file
     *       </p>
     *   </li>
     *   <li>The email address to add as a sender</li>
     *   <li>The email address to add as a suppression</li>
     * </ul>
     */
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            throw new IllegalArgumentException(
                    "This example expects three arguments: a compartment OCID, the sender email address and the suppression email address");
        }

        final String compartmentId = args[0];
        final String senderEmailAddress = args[1];
        final String suppressionEmailAddress = args[2];

        final ConfigFile configFile = ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);
        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);
        final EmailClient emailClient = new EmailClient(provider);
        final IdentityClient identityClient = new IdentityClient(provider);

        emailClient.setRegion(Region.US_PHOENIX_1);
        identityClient.setRegion(Region.US_PHOENIX_1);

        Sender sender = null;
        Suppression suppression = null;
        SmtpCredential smtpCredential = null;
        try {
            sender = createEmailSender(emailClient, compartmentId, senderEmailAddress);
            listSenders(emailClient, compartmentId, senderEmailAddress);

            suppression =
                    createSuppression(
                            emailClient, configFile.get("tenancy"), suppressionEmailAddress);
            listSuppressions(emailClient, configFile.get("tenancy"), suppressionEmailAddress);

            smtpCredential = createSmtpCredential(identityClient, configFile.get("user"));
            listSmtpCredentials(identityClient, configFile.get("user"));
        } finally {
            if (sender != null) {
                deleteSender(emailClient, sender);
            }

            if (suppression != null) {
                deleteSuppression(emailClient, suppression);
            }

            if (smtpCredential != null) {
                deleteSmtpCredential(identityClient, smtpCredential);
            }

            emailClient.close();
            identityClient.close();
        }
    }

    /**
     * Creates a sender and waits for it to become available
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the compartment where the email sender will be created
     * @param senderEmailAddress the email address of the sender
     *
     * @return the created Sender
     */
    private static Sender createEmailSender(
            final EmailClient emailClient,
            final String compartmentId,
            final String senderEmailAddress)
            throws Exception {

        System.out.println("Creating email sender");
        System.out.println("=======================");

        final CreateSenderResponse createResponse =
                emailClient.createSender(
                        CreateSenderRequest.builder()
                                .createSenderDetails(
                                        CreateSenderDetails.builder()
                                                .compartmentId(compartmentId)
                                                .emailAddress(senderEmailAddress)
                                                .build())
                                .build());
        System.out.println("Created sender: " + createResponse.getSender().toString());
        System.out.println();

        final GetSenderResponse getSenderResponse =
                emailClient
                        .getWaiters()
                        .forSender(
                                GetSenderRequest.builder()
                                        .senderId(createResponse.getSender().getId())
                                        .build(),
                                Sender.LifecycleState.Active)
                        .execute();
        System.out.println(
                "Waited for sender to become available: "
                        + getSenderResponse.getSender().toString());
        System.out.println();

        return getSenderResponse.getSender();
    }

    /**
     * Lists email senders. This method will first list all email senders in a compartment and then will
     * list them filtered by a (fake) email address, which should return no results
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the compartment to list resources in
     * @param senderEmailAddress the email address to filter by in list calls
     */
    private static void listSenders(
            final EmailClient emailClient,
            final String compartmentId,
            final String senderEmailAddress) {

        System.out.println("Listing Senders");
        System.out.println("=======================");

        ListSendersRequest listSendersRequest =
                ListSendersRequest.builder().compartmentId(compartmentId).build();
        Iterable<SenderSummary> senderRecordIterator =
                emailClient.getPaginators().listSendersRecordIterator(listSendersRequest);
        for (SenderSummary ss : senderRecordIterator) {
            System.out.println(ss);
        }

        System.out.println();
        System.out.println();

        System.out.println("Listing Senders Filtered By Email");
        System.out.println("===================================");
        listSendersRequest =
                ListSendersRequest.builder()
                        .compartmentId(compartmentId)
                        .emailAddress("fake-" + senderEmailAddress)
                        .build();
        senderRecordIterator =
                emailClient.getPaginators().listSendersRecordIterator(listSendersRequest);
        for (SenderSummary ss : senderRecordIterator) {
            System.out.println(ss);
        }

        System.out.println();
    }

    /**
     * Deletes an email sender and waits for it to be deleted
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param sender the sender to delete
     */
    private static void deleteSender(final EmailClient emailClient, final Sender sender)
            throws Exception {

        final DeleteSenderResponse deleteResponse =
                emailClient.deleteSender(
                        DeleteSenderRequest.builder().senderId(sender.getId()).build());

        emailClient
                .getWaiters()
                .forSender(
                        GetSenderRequest.builder().senderId(sender.getId()).build(),
                        Sender.LifecycleState.Deleted)
                .execute();

        System.out.println("Deleted sender");
        System.out.println();
    }

    /**
     * Creates a suppression record
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the <b>TENANCY</b> where the suppression will be created
     * @param suppressionEmailAddress the suppression to add
     *
     * @return the created Suppression
     */
    private static Suppression createSuppression(
            final EmailClient emailClient,
            final String compartmentId,
            final String suppressionEmailAddress) {

        System.out.println("Creating email suppression");
        System.out.println("=======================");

        final CreateSuppressionResponse createResponse =
                emailClient.createSuppression(
                        CreateSuppressionRequest.builder()
                                .createSuppressionDetails(
                                        CreateSuppressionDetails.builder()
                                                .compartmentId(compartmentId)
                                                .emailAddress(suppressionEmailAddress)
                                                .build())
                                .build());
        System.out.println("Created suppression: " + createResponse.getSuppression().toString());
        System.out.println();
        System.out.println();

        final GetSuppressionResponse getSuppressionResponse =
                emailClient.getSuppression(
                        GetSuppressionRequest.builder()
                                .suppressionId(createResponse.getSuppression().getId())
                                .build());

        return getSuppressionResponse.getSuppression();
    }

    /**
     * Lists email suppressions. This method will first list all suppressions in a
     * tenancy and then will list them filtered by a (fake) email address, which
     * should return no results
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the <b>TENANCY</b> to list suppressions for
     * @param suppressionEmailAddress the email address to filter by in list calls
     */
    private static void listSuppressions(
            final EmailClient emailClient,
            final String compartmentId,
            final String suppressionEmailAddress) {

        System.out.println("Listing Suppressions");
        System.out.println("=======================");

        ListSuppressionsRequest listSuppressionsRequest =
                ListSuppressionsRequest.builder().compartmentId(compartmentId).build();
        Iterable<SuppressionSummary> suppressionRecordIterator =
                emailClient.getPaginators().listSuppressionsRecordIterator(listSuppressionsRequest);
        for (SuppressionSummary ss : suppressionRecordIterator) {
            System.out.println(ss);
        }

        System.out.println();
        System.out.println();

        System.out.println("Listing Suppressions Filtered By Email");
        System.out.println("===================================");
        listSuppressionsRequest =
                ListSuppressionsRequest.builder()
                        .compartmentId(compartmentId)
                        .emailAddress("fake-" + suppressionEmailAddress)
                        .build();
        suppressionRecordIterator =
                emailClient.getPaginators().listSuppressionsRecordIterator(listSuppressionsRequest);
        for (SuppressionSummary ss : suppressionRecordIterator) {
            System.out.println(ss);
        }

        System.out.println();
    }

    /**
     * Deletes a suppression
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param suppression the suppression to delete
     */
    private static void deleteSuppression(
            final EmailClient emailClient, final Suppression suppression) {

        emailClient.deleteSuppression(
                DeleteSuppressionRequest.builder().suppressionId(suppression.getId()).build());

        System.out.println("Deleted suppression");
        System.out.println();
    }

    /**
     * Creates a SMTP credential so that you can send emails. See
     * <a href="https://docs.us-phoenix-1.oraclecloud.com/Content/Email/Tasks/configuresmtpconnection.htm">here</a> for
     * more information on sending emails.
     *
     * @param identityClient the client used to communicate with the Identity Service
     * @param userId the OCID of the user to create the SMTP credential for
     *
     * @return SmtpCredential the created credential
     */
    private static SmtpCredential createSmtpCredential(
            final IdentityClient identityClient, final String userId) {

        System.out.println("Creating SMTP Credential");
        System.out.println("=======================");

        /*
         * Note that when a SMTP credential is created that the password is ONLY available from the
         * create response and it cannot subsequently be retrieved
         */
        final CreateSmtpCredentialResponse createResponse =
                identityClient.createSmtpCredential(
                        CreateSmtpCredentialRequest.builder()
                                .userId(userId)
                                .createSmtpCredentialDetails(
                                        CreateSmtpCredentialDetails.builder()
                                                .description("Original description")
                                                .build())
                                .build());
        System.out.println("Created credential: " + createResponse.getSmtpCredential().toString());
        System.out.println();

        // We can update the description for the credential, but not anything else
        final UpdateSmtpCredentialResponse updateResponse =
                identityClient.updateSmtpCredential(
                        UpdateSmtpCredentialRequest.builder()
                                .userId(userId)
                                .smtpCredentialId(createResponse.getSmtpCredential().getId())
                                .updateSmtpCredentialDetails(
                                        UpdateSmtpCredentialDetails.builder()
                                                .description("Updated description")
                                                .build())
                                .build());
        System.out.println(
                "Updated credential: " + updateResponse.getSmtpCredentialSummary().toString());
        System.out.println();

        return createResponse.getSmtpCredential();
    }

    /**
     * Lists SMTP credentials for a user. A user can only have two active SMTP credentials
     *
     * @param identityClient the client used to communicate with the Identity Service
     * @param userId the OCID of the user to retrieve credentials for
     */
    private static void listSmtpCredentials(
            final IdentityClient identityClient, final String userId) {
        System.out.println("Listing Suppressions");
        System.out.println("=======================");

        final ListSmtpCredentialsResponse listResponse =
                identityClient.listSmtpCredentials(
                        ListSmtpCredentialsRequest.builder().userId(userId).build());
        for (SmtpCredentialSummary scs : listResponse.getItems()) {
            System.out.println(scs);
        }

        System.out.println();
    }

    /**
     * Deletes a SMTP credential
     *
     * @param identityClient the client used to communicate with the Identity Service
     * @param smtpCredential the SMTP credential to delete
     */
    private static void deleteSmtpCredential(
            final IdentityClient identityClient, final SmtpCredential smtpCredential) {

        identityClient.deleteSmtpCredential(
                DeleteSmtpCredentialRequest.builder()
                        .userId(smtpCredential.getUserId())
                        .smtpCredentialId(smtpCredential.getId())
                        .build());

        System.out.println("Deleted SMTP credential");
        System.out.println();
    }
}
