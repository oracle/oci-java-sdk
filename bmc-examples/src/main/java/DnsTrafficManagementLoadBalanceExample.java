/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.dns.Dns;
import com.oracle.bmc.dns.DnsClient;
import com.oracle.bmc.dns.model.CreateSteeringPolicyAttachmentDetails;
import com.oracle.bmc.dns.model.CreateSteeringPolicyDetails;
import com.oracle.bmc.dns.model.CreateZoneDetails;
import com.oracle.bmc.dns.model.SteeringPolicyAnswer;
import com.oracle.bmc.dns.model.SteeringPolicyFilterAnswerData;
import com.oracle.bmc.dns.model.SteeringPolicyFilterRule;
import com.oracle.bmc.dns.model.SteeringPolicyLimitRule;
import com.oracle.bmc.dns.model.SteeringPolicyRule;
import com.oracle.bmc.dns.model.SteeringPolicyWeightedAnswerData;
import com.oracle.bmc.dns.model.SteeringPolicyWeightedRule;
import com.oracle.bmc.dns.requests.CreateSteeringPolicyAttachmentRequest;
import com.oracle.bmc.dns.requests.CreateSteeringPolicyRequest;
import com.oracle.bmc.dns.requests.CreateZoneRequest;
import com.oracle.bmc.dns.requests.GetZoneRequest;
import com.oracle.bmc.dns.requests.ListSteeringPolicyAttachmentsRequest;
import com.oracle.bmc.dns.responses.CreateSteeringPolicyAttachmentResponse;
import com.oracle.bmc.dns.responses.CreateSteeringPolicyResponse;
import com.oracle.bmc.dns.responses.CreateZoneResponse;
import com.oracle.bmc.dns.responses.GetZoneResponse;
import com.oracle.bmc.dns.responses.ListSteeringPolicyAttachmentsResponse;
import com.oracle.bmc.model.BmcException;

import java.util.Arrays;
import java.util.List;

/**
 * This class provides a basic example of how to use the DNS Traffic Management features in the Java SDK. This
 * program takes the following four arguments:
 * <p>
 * - The first is the OCID of the compartment where we'll create the DNS Zone, Steering Policy, and Steering Policy
 * Attachment.
 * - The second is the name of the DNS Zone (e.g. my-example-zone.com)
 * - The third is the name of the Steering Policy (e.g. "Priority Policy")
 * - The fourth is the domain name to attach the Steering Policy to within the Zone we created
 * (e.g. www.my-example-zone.com)
 * <p>
 * The program checks if the specified zone already exists and creates it if does not. It then creates a steering
 * policy that uses the LOAD_BALANCE template and attaches it to a domain within the zone.
 */
public class DnsTrafficManagementLoadBalanceExample {
    public static void main(String[] args) throws Exception {
        // TODO: Update to the path to your configuration file
        final String configurationFilePath = "~/.oci/config";

        // TODO: Update to the name of the profile to use
        final String profile = "DEFAULT";

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        final Dns client = new DnsClient(provider);

        if (args.length != 4) {
            System.err.println(
                    "Missing required arguments: <compartment-id> <zone-name> <steering-policy-name> "
                            + "domain-name>");
        }
        final String compartmentId = args[0];
        final String zoneName = args[1];
        final String steeringPolicyName = args[2];
        final String domainName = args[3];

        System.out.println(
                "Creating a steering policy and attaching it with the following attributes:");
        System.out.println("  compartment id: " + compartmentId);
        System.out.println("  zone name: " + zoneName);
        System.out.println("  steering policy name: " + steeringPolicyName);
        System.out.println("  domain name: " + domainName);

        // Check if the zone already exists
        final GetZoneResponse getZoneResponse;
        String zoneID = "";
        System.out.print("Checking if zone " + zoneName + " already exists... ");
        try {
            getZoneResponse =
                    client.getZone(
                            GetZoneRequest.builder()
                                    .compartmentId(compartmentId)
                                    .zoneNameOrId(zoneName)
                                    .build());
            System.out.println("found.");
            zoneID = getZoneResponse.getZone().getId();
        } catch (BmcException e) {
            if (e.getStatusCode() == 404) {
                System.out.println("not found.");
            } else {
                throw (e);
            }
        }

        // If the zone doesn't already exist, create it
        if (zoneID.isEmpty()) {
            System.out.print("Creating zone " + zoneName + "... ");
            final CreateZoneResponse createZoneResponse;
            createZoneResponse =
                    client.createZone(
                            CreateZoneRequest.builder()
                                    .compartmentId(compartmentId)
                                    .createZoneDetails(
                                            CreateZoneDetails.builder()
                                                    .name(zoneName)
                                                    .zoneType(CreateZoneDetails.ZoneType.Primary)
                                                    .compartmentId(compartmentId)
                                                    .build())
                                    .build());
            System.out.println("done.");
            zoneID = createZoneResponse.getZone().getId();
        }

        // Construct a Steering Policy

        // Build the list of answers for the policy
        List<SteeringPolicyAnswer> answerList =
                Arrays.asList(
                        SteeringPolicyAnswer.builder()
                                .name("Server 1")
                                .rtype("A")
                                .rdata("1.2.3.4")
                                .build(),
                        SteeringPolicyAnswer.builder()
                                .name("Server 2")
                                .rtype("A")
                                .rdata("5.6.7.8")
                                .build(),
                        SteeringPolicyAnswer.builder()
                                .name("Broken Server 3")
                                .rtype("A")
                                .rdata("9.10.11.12")
                                .isDisabled(true)
                                .build());

        // The first rule in a LOAD_BALANCE policy template is a FILTER rule that only keeps answers that
        // do not have their isDisabled property set to true. Answers without an isDisable property defined are
        // kept.
        SteeringPolicyFilterRule filterRule =
                SteeringPolicyFilterRule.builder()
                        .defaultAnswerData(
                                Arrays.asList(
                                        SteeringPolicyFilterAnswerData.builder()
                                                .answerCondition("answer.isDisabled != true")
                                                .shouldKeep(true)
                                                .build()))
                        .build();

        // If we need to remove answers for unhealthy hosts then we would define a health check monitor for the
        // policy using the healthCheckMonitorId property in the steering policy details and the next rule would be a
        // HEALTH rule:
        // SteeringPolicyHealthRule healthRule = SteeringPolicyHealthRule.builder().build();

        // The next rule in a LOAD_BALANCE policy template is a WEIGHTED rule where we define the weights for each
        // answer by the answer's name property to determine how often an answer will be at the beginning of the list
        // of answers in response to a DNS query. This rule is the main point of a LOAD_BALANCE policy.
        //
        // In this example, we want to return Server 1 first in the list three times as often as Server 2.
        SteeringPolicyWeightedRule weightedRule =
                SteeringPolicyWeightedRule.builder()
                        .defaultAnswerData(
                                Arrays.asList(
                                        SteeringPolicyWeightedAnswerData.builder()
                                                .answerCondition("answer.name == 'Server 1'")
                                                .value(75)
                                                .build(),
                                        SteeringPolicyWeightedAnswerData.builder()
                                                .answerCondition("answer.name == 'Server 2'")
                                                .value(25)
                                                .build(),
                                        SteeringPolicyWeightedAnswerData.builder()
                                                .answerCondition("answer.name == 'Broken Server 3'")
                                                .value(1)
                                                .build()))
                        .build();

        // The final rule in a LOAD_BALANCE policy template is a LIMIT rule that limits the number of answers returned
        // in the response to a DNS query.
        SteeringPolicyLimitRule limitRule =
                SteeringPolicyLimitRule.builder().defaultCount(1).build();

        // Build the list of rules for the policy
        List<SteeringPolicyRule> ruleList = Arrays.asList(filterRule, weightedRule, limitRule);

        // Build the steering policy details
        CreateSteeringPolicyDetails steeringPolicyDetails =
                CreateSteeringPolicyDetails.builder()
                        .compartmentId(compartmentId)
                        .displayName(steeringPolicyName)
                        .template(CreateSteeringPolicyDetails.Template.LoadBalance)
                        // If we were going to remove unhealthy servers from the policy then we would add the
                        // healthCheckMonitorId here:
                        // .healthCheckMonitorId("ocid...")
                        .answers(answerList)
                        .rules(ruleList)
                        .build();

        System.out.print("Creating steering policy " + steeringPolicyName + "... ");
        final CreateSteeringPolicyResponse steeringPolicyResponse =
                client.createSteeringPolicy(
                        CreateSteeringPolicyRequest.builder()
                                .createSteeringPolicyDetails(steeringPolicyDetails)
                                .build());
        System.out.println("done.");
        String policyID = steeringPolicyResponse.getSteeringPolicy().getId();
        System.out.println("Created steering policy " + policyID);

        // In order to activate a policy for a domain within a zone we have to create a steering policy attachment that
        // references the policy, the zone, and the domain within the zone to attach to.

        // Before we can create the attachment we need to check to see if there is already an attachment on this domain
        // because only one policy can be attached to a domain at a time. We accomplish that by listing available
        // attachments and filtering for the domain name that we're going to attach to.
        System.out.print("Checking for existing attachment at " + domainName + "... ");
        final ListSteeringPolicyAttachmentsResponse attachmentsResponse =
                client.listSteeringPolicyAttachments(
                        ListSteeringPolicyAttachmentsRequest.builder()
                                .compartmentId(compartmentId)
                                .domain(domainName)
                                .build());
        if (attachmentsResponse.getOpcTotalItems() > 0) {
            // There's already an attachment at the domain, so we can't attach the new policy we created.
            System.out.println("found.");
            System.out.println(
                    "You will need to delete the existing attachment at "
                            + domainName
                            + " before you can "
                            + "attach a new policy.");
        } else {
            // We didn't find an attachment at the domain, so we can go ahead and create the attachment for our
            // policy.
            System.out.println("not found.");
            System.out.print("Attaching steering policy to " + domainName + "... ");
            final CreateSteeringPolicyAttachmentResponse attachmentResponse =
                    client.createSteeringPolicyAttachment(
                            CreateSteeringPolicyAttachmentRequest.builder()
                                    .createSteeringPolicyAttachmentDetails(
                                            CreateSteeringPolicyAttachmentDetails.builder()
                                                    .displayName(
                                                            steeringPolicyName
                                                                    + " attachment to "
                                                                    + zoneName)
                                                    .domainName(domainName)
                                                    .zoneId(zoneID)
                                                    .steeringPolicyId(policyID)
                                                    .build())
                                    .build());
            System.out.println("done.");
            System.out.println(
                    "Attached steering policy "
                            + attachmentResponse.getSteeringPolicyAttachment().getId());
        }

        client.close();
    }
}
