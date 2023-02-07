/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.limits.QuotasClient;
import com.oracle.bmc.limits.QuotasPaginators;
import com.oracle.bmc.limits.model.CreateQuotaDetails;
import com.oracle.bmc.limits.model.Quota;
import com.oracle.bmc.limits.model.QuotaSummary;
import com.oracle.bmc.limits.model.UpdateQuotaDetails;
import com.oracle.bmc.limits.requests.CreateQuotaRequest;
import com.oracle.bmc.limits.requests.DeleteQuotaRequest;
import com.oracle.bmc.limits.requests.GetQuotaRequest;
import com.oracle.bmc.limits.requests.ListQuotasRequest;
import com.oracle.bmc.limits.requests.UpdateQuotaRequest;
import com.oracle.bmc.limits.responses.CreateQuotaResponse;
import com.oracle.bmc.limits.responses.GetQuotaResponse;
import com.oracle.bmc.limits.responses.UpdateQuotaResponse;

import java.util.Arrays;
import java.util.List;

/**
 * This class provides an example of how you can create a quota. It then shows how to perform
 * updates, reads, and deletes. It will:
 *
 * <ul>
 *   <li>Create a quota
 *   <li>List quotas in the compartment
 *   <li>Get a single quota (the one that was created above)
 *   <li>Update the quota (description and statements)
 *   <li>Delete the quota
 * </ul>
 */
public class QuotasExample {
    private static final String CONFIG_LOCATION = "~/.oci/config";
    private static final String CONFIG_PROFILE = "DEFAULT";
    private static final int REQUIRED_ARGS_LENGTH = 4;

    private static QuotasClient quotasClient;

    /**
     * @param args Parameters to use for the limits service quotas example are as follows:
     *     <ul>
     *       <li>The 1st argument is the OCID of the target compartment for the quota.
     *       <li>The 2nd is the name for this quota.
     *       <li>The 3rd is one statement containing the quota-family (and if needed, quota-name)
     *           which should be whitelisted in the tenancy beforehand.
     *       <li>The 4th is another statement (valid as above), which will be used to replace the
     *           original quota statement during update.
     *       <li>Optional params below may be left unspecified or fully specified, but not partially
     *           specified:
     *     </ul>
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length != REQUIRED_ARGS_LENGTH) {
            throw new IllegalArgumentException(
                    "This example expects 4 arguments: compartment OCID, quota name, original quota statement, updated quota statement");
        }

        for (String arg : args) {
            System.out.println(arg);
        }

        String compartmentId = args[0];
        String quotaName = args[1];
        String quotaStatement = args[2];
        String quotaStatementToUpdate = args[3];

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI
        // config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to
        // the following
        // line if needed and use ConfigFileReader.parse(CONFIG_LOCATION, CONFIG_PROFILE);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        quotasClient = QuotasClient.builder().build(provider);

        // Create a quota
        CreateQuotaDetails createQuotaDetails =
                CreateQuotaDetails.builder()
                        .compartmentId(compartmentId)
                        .name(quotaName)
                        .description("Description of a sample quota")
                        .statements(Arrays.asList(quotaStatement))
                        .build();
        CreateQuotaRequest createQuotaRequest =
                CreateQuotaRequest.builder().createQuotaDetails(createQuotaDetails).build();
        CreateQuotaResponse createQuotaResponse = quotasClient.createQuota(createQuotaRequest);

        Quota quota = createQuotaResponse.getQuota();

        // List out all quotas in the compartment
        QuotasPaginators quotasPaginators = quotasClient.getPaginators();

        Iterable<QuotaSummary> quotaSummaries =
                quotasPaginators.listQuotasRecordIterator(
                        ListQuotasRequest.builder().compartmentId(compartmentId).limit(50).build());

        System.out.println(
                String.format("ListQuotas for compartment with OCID: %s", compartmentId));
        for (QuotaSummary quotaSummary : quotaSummaries) {
            System.out.println(quotaSummary);
        }

        // Get a single quota (the one we just created).
        System.out.println(String.format("GetQuota with OCID: %s", quota.getId()));
        GetQuotaResponse getQuotaResponse =
                quotasClient.getQuota(GetQuotaRequest.builder().quotaId(quota.getId()).build());

        System.out.println(getQuotaResponse.getQuota());

        // Update the quota description
        String updatedDesc = "Updated description for quota";
        List<String> updatedStatements = Arrays.asList(quotaStatementToUpdate);
        UpdateQuotaDetails updateQuotaDetails =
                UpdateQuotaDetails.builder()
                        .description(updatedDesc)
                        .statements(updatedStatements)
                        .build();
        UpdateQuotaRequest updateQuotaRequest =
                UpdateQuotaRequest.builder()
                        .quotaId(quota.getId())
                        .updateQuotaDetails(updateQuotaDetails)
                        .build();
        UpdateQuotaResponse updateQuotaResponse = quotasClient.updateQuota(updateQuotaRequest);

        quota = updateQuotaResponse.getQuota();
        System.out.println(String.format("New quota description: '%s'", quota.getDescription()));
        System.out.println(String.format("New quota statements: %s", quota.getStatements()));

        // (Clean-up) Delete the quota
        quotasClient.deleteQuota(DeleteQuotaRequest.builder().quotaId(quota.getId()).build());
    }
}
