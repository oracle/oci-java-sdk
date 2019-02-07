/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.Region;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.ConfigFileReader.ConfigFile;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.email.EmailClient;
import com.oracle.bmc.email.EmailPaginators;
import com.oracle.bmc.email.model.CreateSenderDetails;
import com.oracle.bmc.email.model.CreateSuppressionDetails;
import com.oracle.bmc.email.model.Sender;
import com.oracle.bmc.email.model.SenderSummary;
import com.oracle.bmc.email.model.Suppression;
import com.oracle.bmc.email.model.SuppressionSummary;
import com.oracle.bmc.email.model.UpdateSenderDetails;
import com.oracle.bmc.email.requests.CreateSenderRequest;
import com.oracle.bmc.email.requests.CreateSuppressionRequest;
import com.oracle.bmc.email.requests.DeleteSenderRequest;
import com.oracle.bmc.email.requests.DeleteSuppressionRequest;
import com.oracle.bmc.email.requests.GetSenderRequest;
import com.oracle.bmc.email.requests.GetSuppressionRequest;
import com.oracle.bmc.email.requests.ListSendersRequest;
import com.oracle.bmc.email.requests.ListSuppressionsRequest;
import com.oracle.bmc.email.requests.UpdateSenderRequest;
import com.oracle.bmc.email.responses.UpdateSenderResponse;
import com.oracle.bmc.email.responses.CreateSenderResponse;
import com.oracle.bmc.email.responses.CreateSuppressionResponse;
import com.oracle.bmc.email.responses.DeleteSenderResponse;
import com.oracle.bmc.email.responses.GetSenderResponse;
import com.oracle.bmc.email.responses.GetSuppressionResponse;
import com.oracle.bmc.identity.IdentityClient;
import com.oracle.bmc.identity.model.SmtpCredential;
import com.oracle.bmc.identity.model.SmtpCredentialSummary;
import com.oracle.bmc.identity.model.CreateSmtpCredentialDetails;
import com.oracle.bmc.identity.model.UpdateSmtpCredentialDetails;
import com.oracle.bmc.identity.requests.CreateSmtpCredentialRequest;
import com.oracle.bmc.identity.requests.DeleteSmtpCredentialRequest;
import com.oracle.bmc.identity.requests.ListSmtpCredentialsRequest;
import com.oracle.bmc.identity.requests.UpdateSmtpCredentialRequest;
import com.oracle.bmc.identity.responses.CreateSmtpCredentialResponse;
import com.oracle.bmc.identity.responses.DeleteSmtpCredentialResponse;
import com.oracle.bmc.identity.responses.ListSmtpCredentialsResponse;
import com.oracle.bmc.identity.responses.UpdateSmtpCredentialResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * This class demonstrates how to use the Email Service in the Java SDK. This will cover:
 *
 * <ul>
 *   <li>Creating, retrieving, updating, listing, and deleting approved senders</li>
 *   <li>Creating, retrieving, listing, and deleting email suppressions</li>
 *   <li>
 *       Creating, updating, listing, and deleting SMTP credentials
 *       See <a href="https://docs.cloud.oracle.com/iaas/Content/Email/Tasks/configuresmtpconnection.htm">here</a> for more
 *       information on sending emails with your IAM user
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
 *   <li>An approved sender with the given email address does not already exist</li>
 *   <li>An SMTP credential will be created for user defined in the configuration file</li>
 *   <li>
 *      You have the appropriate permissions to create email senders in the compartment you've specified
 *      and can also create email suppressions at the tenancy level
 *   </li>
 *   <li>Your user does not already have the maximum number of smtp credentials [2]</li>
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
            getEmailSender(emailClient, sender);
            updateSender(emailClient, sender);
            listAllSenders(emailClient, compartmentId);
            listSendersFilteredByAddress(emailClient, compartmentId, senderEmailAddress);
            System.out.println();

            final String tenancy = configFile.get("tenancy");
            suppression = createSuppression(emailClient, tenancy, suppressionEmailAddress);
            getSuppression(emailClient, suppression);
            listAllSuppressions(emailClient, tenancy);
            listSuppressionsFilteredByAddress(emailClient, tenancy, suppressionEmailAddress);
            System.out.println();

            final String userId = configFile.get("user");
            smtpCredential = createSmtpCredential(identityClient, userId);
            updateSmtpCredential(identityClient, userId, smtpCredential);
            listSmtpCredentials(identityClient, userId);
            System.out.println();
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
     * Create an approved sender
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the compartment where the sender will be created
     * @param senderEmailAddress the email address of the approved sender
     *
     * @return the created Sender
     */
    private static Sender createEmailSender(
            final EmailClient emailClient,
            final String compartmentId,
            final String senderEmailAddress)
            throws Exception {
        System.out.println("Creating email sender " + senderEmailAddress);
        System.out.println("=======================");

        final CreateSenderDetails details =
                CreateSenderDetails.builder()
                        .compartmentId(compartmentId)
                        .emailAddress(senderEmailAddress)
                        .freeformTags(getFreeformTagData())
                        .build();
        final CreateSenderRequest request =
                CreateSenderRequest.builder().createSenderDetails(details).build();
        final CreateSenderResponse response = emailClient.createSender(request);

        System.out.println("Created sender: " + response.getSender().toString());
        System.out.println();

        return response.getSender();
    }

    /**
     * Retrieve email sender
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param sender the sender to retrieve
     */
    private static void getEmailSender(final EmailClient emailClient, final Sender sender)
            throws Exception {
        System.out.println("Retrieving email sender after state becomes active");
        System.out.println("=======================");

        final GetSenderRequest request =
                GetSenderRequest.builder().senderId(sender.getId()).build();
        final GetSenderResponse getSenderResponse =
                emailClient.getWaiters().forSender(request, Sender.LifecycleState.Active).execute();
        System.out.println(
                "Waited for sender to become available: "
                        + getSenderResponse.getSender().toString());
        System.out.println();
    }

    /**
     * Update email sender
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param sender the sender to update
     */
    private static void updateSender(final EmailClient emailClient, final Sender sender) {
        System.out.println("Updating email sender");
        System.out.println("=======================");

        final UpdateSenderDetails details =
                UpdateSenderDetails.builder().freeformTags(Collections.EMPTY_MAP).build();
        final UpdateSenderRequest request =
                UpdateSenderRequest.builder()
                        .senderId(sender.getId())
                        .updateSenderDetails(details)
                        .build();
        final UpdateSenderResponse response = emailClient.updateSender(request);

        System.out.println("Updated sender: " + response.getSender().toString());
        System.out.println();
    }

    /**
     * List email senders in the provided compartment
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the compartment to list resources in
     */
    private static void listAllSenders(final EmailClient emailClient, final String compartmentId) {
        System.out.println("Listing all senders");
        System.out.println("=======================");

        final EmailPaginators paginators = emailClient.getPaginators();
        final ListSendersRequest request =
                ListSendersRequest.builder().compartmentId(compartmentId).build();
        final Iterable<SenderSummary> senderIterator =
                paginators.listSendersRecordIterator(request);

        for (SenderSummary senderSummary : senderIterator) {
            System.out.println(senderSummary);
        }
        System.out.println();
    }

    /**
     * List email senders in the provided compartment that match an email address
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the compartment to list resources in
     * @param senderEmailAddress the email address to filter by in list calls
     */
    private static void listSendersFilteredByAddress(
            final EmailClient emailClient,
            final String compartmentId,
            final String senderEmailAddress) {
        System.out.println("Listing senders filtered by email address");
        System.out.println("=======================");

        final EmailPaginators paginators = emailClient.getPaginators();
        final ListSendersRequest request =
                ListSendersRequest.builder()
                        .compartmentId(compartmentId)
                        .emailAddress(senderEmailAddress)
                        .build();
        final Iterable<SenderSummary> senderIterator =
                paginators.listSendersRecordIterator(request);

        for (SenderSummary senderSummary : senderIterator) {
            System.out.println(senderSummary);
        }
        System.out.println();
    }

    /**
     * Delete an approved sender and wait for it to be deleted
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param sender the sender to delete
     */
    private static void deleteSender(final EmailClient emailClient, final Sender sender)
            throws Exception {
        System.out.println("Deleting sender");
        System.out.println("=======================");

        final DeleteSenderRequest request =
                DeleteSenderRequest.builder().senderId(sender.getId()).build();
        emailClient.deleteSender(request);

        final GetSenderRequest getRequest =
                GetSenderRequest.builder().senderId(sender.getId()).build();
        emailClient.getWaiters().forSender(getRequest, Sender.LifecycleState.Deleted).execute();

        System.out.println("Deleted sender " + sender.getId());
        System.out.println();
    }

    /**
     * Create suppression record.
     * For informational purposes only, as suppression records are not normally created directly.
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
        System.out.println("Creating suppression " + suppressionEmailAddress);
        System.out.println("=======================");

        final CreateSuppressionDetails details =
                CreateSuppressionDetails.builder()
                        .compartmentId(compartmentId)
                        .emailAddress(suppressionEmailAddress)
                        .build();
        final CreateSuppressionRequest request =
                CreateSuppressionRequest.builder().createSuppressionDetails(details).build();
        final CreateSuppressionResponse response = emailClient.createSuppression(request);

        System.out.println("Created suppression: " + response.getSuppression().toString());
        System.out.println();

        return response.getSuppression();
    }

    /**
     * Retrieve suppression record
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param suppression the suppression to retrieve
     */
    private static Suppression getSuppression(
            final EmailClient emailClient, final Suppression suppression) {
        System.out.println("Retrieving suppression");
        System.out.println("=======================");

        final GetSuppressionRequest request =
                GetSuppressionRequest.builder().suppressionId(suppression.getId()).build();
        final GetSuppressionResponse response = emailClient.getSuppression(request);

        System.out.println("Retrieved suppression: " + response.getSuppression().toString());
        System.out.println();

        return response.getSuppression();
    }

    /**
     * List suppression records in the provided ocid
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the <b>TENANCY</b> to list suppressions for
     */
    private static void listAllSuppressions(
            final EmailClient emailClient, final String compartmentId) {
        System.out.println("Listing suppressions");
        System.out.println("=======================");

        final EmailPaginators paginators = emailClient.getPaginators();
        final ListSuppressionsRequest request =
                ListSuppressionsRequest.builder().compartmentId(compartmentId).build();
        final Iterable<SuppressionSummary> suppressionRecordIterator =
                paginators.listSuppressionsRecordIterator(request);

        for (SuppressionSummary suppressionSummary : suppressionRecordIterator) {
            System.out.println(suppressionSummary);
        }
        System.out.println();
    }

    /**
     * List suppression records filtered by the email address
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param compartmentId the OCID of the <b>TENANCY</b> to list suppressions for
     * @param suppressionEmailAddress the email address to filter by in list calls
     */
    private static void listSuppressionsFilteredByAddress(
            final EmailClient emailClient,
            final String compartmentId,
            final String suppressionEmailAddress) {
        System.out.println("Listing suppressions filtered by address");
        System.out.println("=======================");

        final EmailPaginators paginators = emailClient.getPaginators();
        final ListSuppressionsRequest request =
                ListSuppressionsRequest.builder()
                        .compartmentId(compartmentId)
                        .emailAddress(suppressionEmailAddress)
                        .build();
        final Iterable<SuppressionSummary> suppressionRecordIterator =
                paginators.listSuppressionsRecordIterator(request);

        for (SuppressionSummary suppressionSummary : suppressionRecordIterator) {
            System.out.println(suppressionSummary);
        }
        System.out.println();
    }

    /**
     * Delete suppression
     *
     * @param emailClient the client used to communicate with the Email Service
     * @param suppression the suppression to delete
     */
    private static void deleteSuppression(
            final EmailClient emailClient, final Suppression suppression) {
        System.out.println("Deleting suppression");
        System.out.println("=======================");

        final DeleteSuppressionRequest request =
                DeleteSuppressionRequest.builder().suppressionId(suppression.getId()).build();
        emailClient.deleteSuppression(request);

        System.out.println("Deleted suppression " + suppression.getEmailAddress());
        System.out.println();
    }

    /**
     * Create an SMTP credential.
     * Be sure to retrieve the password from the response as it is the only time it is available.
     *
     * @param identityClient the client used to communicate with the Identity Service
     * @param userId the OCID of the user to create the SMTP credential for
     *
     * @return SmtpCredential the created credential
     */
    private static SmtpCredential createSmtpCredential(
            final IdentityClient identityClient, final String userId) {
        System.out.println("Creating SMTP credential");
        System.out.println("=======================");

        final CreateSmtpCredentialDetails details =
                CreateSmtpCredentialDetails.builder().description("Original description").build();
        final CreateSmtpCredentialRequest request =
                CreateSmtpCredentialRequest.builder()
                        .userId(userId)
                        .createSmtpCredentialDetails(details)
                        .build();
        /*
         * Note that when a SMTP credential is created that the password is ONLY available from the
         * create response and it cannot subsequently be retrieved
         */
        final CreateSmtpCredentialResponse response = identityClient.createSmtpCredential(request);

        System.out.println("Created credential: " + response.getSmtpCredential().toString());
        System.out.println();

        return response.getSmtpCredential();
    }

    /**
     * Update an SMTP credential.
     * We can update the description for the credential, but not anything else
     *
     * @param identityClient the client used to communicate with the Identity Service
     * @param userId the OCID of the user to create the SMTP credential for
     * @param smtpCredential the credential to update
     *
     * @return SmtpCredentialSummary a summary of the updated credential
     */
    private static SmtpCredentialSummary updateSmtpCredential(
            final IdentityClient identityClient,
            final String userId,
            final SmtpCredential smtpCredential) {
        System.out.println("Updating SMTP credential");
        System.out.println("=======================");

        // We can update the description for the credential, but not anything else
        final UpdateSmtpCredentialDetails details =
                UpdateSmtpCredentialDetails.builder().description("Updated description").build();
        final UpdateSmtpCredentialRequest request =
                UpdateSmtpCredentialRequest.builder()
                        .userId(userId)
                        .smtpCredentialId(smtpCredential.getId())
                        .updateSmtpCredentialDetails(details)
                        .build();
        final UpdateSmtpCredentialResponse response = identityClient.updateSmtpCredential(request);

        System.out.println("Updated credential: " + response.getSmtpCredentialSummary().toString());
        System.out.println();

        return response.getSmtpCredentialSummary();
    }

    /**
     * List SMTP credentials for a user.
     * A user can only have two active SMTP credentials
     *
     * @param identityClient the client used to communicate with the Identity Service
     * @param userId the OCID of the user to retrieve credentials for
     */
    private static void listSmtpCredentials(
            final IdentityClient identityClient, final String userId) {
        System.out.println("Listing SMTP credentials");
        System.out.println("=======================");

        final ListSmtpCredentialsRequest request =
                ListSmtpCredentialsRequest.builder().userId(userId).build();
        final ListSmtpCredentialsResponse response = identityClient.listSmtpCredentials(request);

        for (SmtpCredentialSummary scs : response.getItems()) {
            System.out.println(scs);
        }
        System.out.println();
    }

    /**
     * Delete an SMTP credential
     *
     * @param identityClient the client used to communicate with the Identity Service
     * @param smtpCredential the SMTP credential to delete
     */
    private static void deleteSmtpCredential(
            final IdentityClient identityClient, final SmtpCredential smtpCredential) {
        System.out.println("Deleting SMTP credential");
        System.out.println("=======================");

        final DeleteSmtpCredentialRequest request =
                DeleteSmtpCredentialRequest.builder()
                        .userId(smtpCredential.getUserId())
                        .smtpCredentialId(smtpCredential.getId())
                        .build();
        final DeleteSmtpCredentialResponse response = identityClient.deleteSmtpCredential(request);

        System.out.println("Deleted SMTP credential " + response.toString());
        System.out.println();
    }

    /**
     * Provide sample tag data
     *
     * @return Map data that can be used for freeform tags
     */
    private static Map<String, String> getFreeformTagData() {
        final Map<String, String> freeformTags = new HashMap<String, String>();
        freeformTags.put("freeform_name1", "freeform_value1");
        freeformTags.put("freeform_name2", "freeform_value2");
        return freeformTags;
    }
}
