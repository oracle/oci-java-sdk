/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.base.Supplier;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.ons.NotificationControlPlaneClient;
import com.oracle.bmc.ons.NotificationDataPlaneClient;
import com.oracle.bmc.ons.model.BackoffRetryPolicy;
import com.oracle.bmc.ons.model.ConfirmationResult;
import com.oracle.bmc.ons.model.CreateSubscriptionDetails;
import com.oracle.bmc.ons.model.CreateTopicDetails;
import com.oracle.bmc.ons.model.DeliveryPolicy;
import com.oracle.bmc.ons.model.MessageDetails;
import com.oracle.bmc.ons.model.NotificationTopic;
import com.oracle.bmc.ons.model.NotificationTopicSummary;
import com.oracle.bmc.ons.model.SubscriptionSummary;
import com.oracle.bmc.ons.model.TopicAttributesDetails;
import com.oracle.bmc.ons.model.UpdateSubscriptionDetails;
import com.oracle.bmc.ons.requests.CreateSubscriptionRequest;
import com.oracle.bmc.ons.requests.CreateTopicRequest;
import com.oracle.bmc.ons.requests.DeleteTopicRequest;
import com.oracle.bmc.ons.requests.GetConfirmSubscriptionRequest;
import com.oracle.bmc.ons.requests.GetSubscriptionRequest;
import com.oracle.bmc.ons.requests.GetTopicRequest;
import com.oracle.bmc.ons.requests.GetUnsubscriptionRequest;
import com.oracle.bmc.ons.requests.ListSubscriptionsRequest;
import com.oracle.bmc.ons.requests.ListTopicsRequest;
import com.oracle.bmc.ons.requests.PublishMessageRequest;
import com.oracle.bmc.ons.requests.ResendSubscriptionConfirmationRequest;
import com.oracle.bmc.ons.requests.UpdateSubscriptionRequest;
import com.oracle.bmc.ons.requests.UpdateTopicRequest;
import com.oracle.bmc.ons.responses.CreateSubscriptionResponse;
import com.oracle.bmc.ons.responses.CreateTopicResponse;
import com.oracle.bmc.ons.responses.DeleteTopicResponse;
import com.oracle.bmc.ons.responses.GetConfirmSubscriptionResponse;
import com.oracle.bmc.ons.responses.GetSubscriptionResponse;
import com.oracle.bmc.ons.responses.GetTopicResponse;
import com.oracle.bmc.ons.responses.GetUnsubscriptionResponse;
import com.oracle.bmc.ons.responses.ListSubscriptionsResponse;
import com.oracle.bmc.ons.responses.ListTopicsResponse;
import com.oracle.bmc.ons.responses.PublishMessageResponse;
import com.oracle.bmc.ons.responses.ResendSubscriptionConfirmationResponse;
import com.oracle.bmc.ons.responses.UpdateSubscriptionResponse;
import com.oracle.bmc.ons.responses.UpdateTopicResponse;
import com.oracle.bmc.waiter.BmcGenericWaiter;
import com.oracle.bmc.waiter.Waiters;

import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class demonstrates how to use the Notification service api in the Java SDK. This will cover:
 *
 * <ul>
 *   <li>Create one topic</li>
 *   <li>Update this topic</li>
 *   <li>Create one subscription for this topic</li>
 *   <li>Get the subscription<li/>
 *   <li>List all the subscription for given topic<li/>
 *   <li>Confirm the subscription</li>
 *   <li>Update the subscription</li>
 *   <li>Publish message to this topic</li>
 *   <li>Unsubscribe the subscription<li/>
 *   <li>Delete this topic</li>
 * </ul>
 *
 * This class makes the following assumptions:
 * <ul>
 *   <li>
 *      The configuration file used by service clients will be sourced from the default
 *      location (~/.oci/config) and the DEFAULT profile will be used
 *   </li>
 *   <li>Region where the example will be run is: us-phoenix-1</li>
 *   <li>
 *      The user has the appropriate permissions to manage topic, subscription and can publish message in the compartment specified.
 *   </li>
 *   <li>
 *       It will be run in two parts. Since for purpose of publishing messages we need a confirmation token.
 *       In the first run the user can create a topic, update topic, create subscription, list subscription, resend confirmation request.
 *
 *       In the second run the user can comment the code run in first part and continue with running the remaining code with
 *       the following details updated: token, topicId, subscriptionId. The second run will confirm subscription, update retry policy,
 *       send a message, delete the subscription and delete the topic.
 *   </li>
 * <ul>
 */
public class NotificationExample {
    public static void main(String[] args) throws Exception {
        Pattern pattern = Pattern.compile("token=(.*)&");
        String compartmentId = args[0];
        String ociConfigurationFilePath = "~/.oci/config";
        String ociConfigurationProfile = "DEFAULT";
        String protocol = "EMAIL";

        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(ociConfigurationFilePath, ociConfigurationProfile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        final NotificationControlPlaneClient controlPlaneClient =
                new NotificationControlPlaneClient(provider);

        // Example contents of ~/.oci/config file:
        // [DEFAULT]
        // ...
        // ONSControlPlaneEndpoint = https://notification.us-phoenix-1.oraclecloud.com
        controlPlaneClient.setEndpoint(
                ConfigFileReader.parse(ociConfigurationFilePath, ociConfigurationProfile)
                        .get("ONSControlPlaneEndpoint"));
        // Create topic
        System.out.println("Creating topic");
        System.out.println("=======================");
        CreateTopicResponse createTopicResponse =
                createTopic(
                        "first_topic",
                        "the first topic description",
                        compartmentId,
                        controlPlaneClient);
        NotificationTopic notificationTopic = createTopicResponse.getNotificationTopic();
        final String topicId = notificationTopic.getTopicId();
        System.out.println("Create topic successfully with topic id: " + topicId);

        BmcGenericWaiter waiter = Waiters.newWaiter(null, null);
        waiter.execute(
                new Supplier<GetTopicRequest>() {
                    @Override
                    public GetTopicRequest get() {
                        return GetTopicRequest.builder().topicId(topicId).build();
                    }
                },
                new Function<GetTopicRequest, GetTopicResponse>() {
                    @Override
                    public GetTopicResponse apply(GetTopicRequest request) {
                        return controlPlaneClient.getTopic(request);
                    }
                },
                new Predicate<GetTopicResponse>() {
                    @Override
                    public boolean apply(GetTopicResponse response) {
                        return response.getNotificationTopic().getLifecycleState()
                                == NotificationTopic.LifecycleState.Active;
                    }
                },
                false);

        // Update topic description
        System.out.println("Updating topic description");
        System.out.println("=======================");
        UpdateTopicResponse updatedTopic =
                updateTopic(topicId, "description changed", controlPlaneClient);
        System.out.println(
                "Update topic successfully for topic id: "
                        + topicId
                        + " with new description: "
                        + updatedTopic.getNotificationTopic().getDescription());

        // List all topics
        System.out.println("ListTopics for Compartment: " + compartmentId + "\n");
        System.out.println("=======================");
        ListTopicsResponse listTopicsResponse = listTopics(compartmentId, controlPlaneClient);
        System.out.println("ListTopics Response for: " + compartmentId + "\n");
        for (NotificationTopicSummary topic : listTopicsResponse.getItems()) {
            System.out.println(topic);
        }

        // Create EMAIL subscription
        System.out.println("Creating EMAIL subscription");
        System.out.println("=======================");
        CreateSubscriptionResponse createSubscriptionResponse =
                createSubscription(
                        compartmentId,
                        topicId,
                        protocol,
                        "no-reply@example.com",
                        controlPlaneClient,
                        provider);
        String subscriptionId = createSubscriptionResponse.getSubscription().getId();
        System.out.println(
                "Create subscription successfully for topic id: "
                        + topicId
                        + " with subscription id: "
                        + subscriptionId);

        // Get the subscription
        System.out.println("Getting the subscription");
        System.out.println("=======================");
        GetSubscriptionResponse getSubscriptionResponse =
                getSubscription(topicId, subscriptionId, controlPlaneClient, provider);
        System.out.println(
                "Get subscription successfully for subscription id: "
                        + getSubscriptionResponse.getSubscription().getId());

        // List all subscriptions
        System.out.println("ListSubscriptions for Topic: " + topicId + "\n");
        System.out.println("=======================");
        ListSubscriptionsResponse listSubscriptionsResponse =
                listSubscriptionsForTopic(topicId, compartmentId, controlPlaneClient, provider);
        System.out.println("ListSubscriptions Response for: " + topicId + "\n");
        for (SubscriptionSummary subscriptionSummary : listSubscriptionsResponse.getItems()) {
            System.out.println(subscriptionSummary);
        }

        // Re-send subscription confirmation
        System.out.println("Resending the subscription confirmation request");
        System.out.println("=======================");
        ResendSubscriptionConfirmationResponse resendSubscriptionConfirmationResponse =
                resendSubscriptionConfirmation(
                        topicId, subscriptionId, controlPlaneClient, provider);
        System.out.println(
                "Resend confirmation request id: "
                        + resendSubscriptionConfirmationResponse.getOpcRequestId());

        // Copy auth token received in email and paste here
        // One example of auth token: MDAwMHJpeWF3RFVzREhRMGlsOE9NUFNFY0R3cUd4clc0V0xLQjRNR3grMGI3bzRMT2xiT0Y0PQ==
        String token =
                "MDAwMHNCRmh4eE0xZVRyUnF3OWJ6SkdJL0ZiaGluTFJvTkRlbi9xS0x4dmhITHZWcTBzbXJnPQ==";

        // Confirm subscription
        System.out.println("Confirming the subscription");
        System.out.println("=======================");
        GetConfirmSubscriptionResponse getConfirmSubscriptionResponse =
                confirmSubscription(
                        topicId, subscriptionId, token, protocol, controlPlaneClient, provider);
        ConfirmationResult confirmationResult =
                getConfirmSubscriptionResponse.getConfirmationResult();
        System.out.println(
                "Confirm subscription successfully for subscription id: "
                        + confirmationResult.getSubscriptionId());

        // Get auth token
        Matcher matcher =
                pattern.matcher(
                        confirmationResult
                                .getUnsubscribeUrl()
                                // converting unicode characters back so the regular expression pattern will work
                                .replace("\\u003d", "=")
                                .replace("\\u0026", "&"));
        matcher.find();
        token = matcher.group(1);

        // Update subscription delivery retry policy
        System.out.println("Updating subscription delivery retry policy");
        System.out.println("=======================");
        UpdateSubscriptionResponse updateSubscriptionResponse =
                updateSubscriptionRetryPolicy(
                        topicId,
                        subscriptionId,
                        controlPlaneClient,
                        provider,
                        BackoffRetryPolicy.PolicyType.Exponential,
                        5000);

        System.out.println(
                "Update subscription delivery retry policy successfully for subscription id: "
                        + subscriptionId
                        + " with retry duration: "
                        + updateSubscriptionResponse
                                .getUpdateSubscriptionDetails()
                                .getDeliveryPolicy()
                                .getBackoffRetryPolicy()
                                .getMaxRetryDuration());

        // Publish message to the topic
        System.out.println("Publishing message to the topic");
        System.out.println("=======================");
        PublishMessageResponse publishMessageResponse =
                publishMessage(topicId, "hello world!", controlPlaneClient, provider);
        System.out.println(
                "Publish message successfully for topic id: "
                        + topicId
                        + " with messageId: "
                        + publishMessageResponse.getPublishResult().getMessageId());

        // Un-subscribe the subscription
        System.out.println("Un-subscribing the subscription");
        System.out.println("=======================");
        GetUnsubscriptionResponse getUnsubscriptionResponse =
                unsubscribeSubscription(
                        topicId, subscriptionId, token, protocol, controlPlaneClient, provider);
        System.out.println(
                "Un-subscribe successfully for subscription id: "
                        + subscriptionId
                        + " with opcRequestId: "
                        + getUnsubscriptionResponse.getOpcRequestId());

        // Delete the topic
        System.out.println("Deleting the topic");
        System.out.println("=======================");
        DeleteTopicResponse deleteTopicResponse = deleteTopic(topicId, controlPlaneClient);
        System.out.println(
                "Delete topic successfully for topic id: "
                        + topicId
                        + " with Id: "
                        + deleteTopicResponse.getOpcRequestId());
    }

    private static CreateTopicResponse createTopic(
            String topicName,
            String topicDescription,
            String compartmentId,
            NotificationControlPlaneClient controlPlaneClient) {
        CreateTopicDetails createTopicDetails =
                CreateTopicDetails.builder()
                        .compartmentId(compartmentId)
                        .name(topicName)
                        .description(topicDescription)
                        .build();
        CreateTopicRequest createTopicRequest =
                CreateTopicRequest.builder().createTopicDetails(createTopicDetails).build();
        return controlPlaneClient.createTopic(createTopicRequest);
    }

    private static UpdateTopicResponse updateTopic(
            String topicId,
            String updatedDescription,
            NotificationControlPlaneClient controlPlaneClient) {
        TopicAttributesDetails topicAttributesDetails =
                TopicAttributesDetails.builder().description(updatedDescription).build();
        UpdateTopicRequest updateTopicRequest =
                UpdateTopicRequest.builder()
                        .topicId(topicId)
                        .topicAttributesDetails(topicAttributesDetails)
                        .build();
        return controlPlaneClient.updateTopic(updateTopicRequest);
    }

    private static ListTopicsResponse listTopics(
            String compartmentId, NotificationControlPlaneClient controlPlaneClient) {
        ListTopicsRequest listTopicsRequest =
                ListTopicsRequest.builder().compartmentId(compartmentId).limit(10).build();
        return controlPlaneClient.listTopics(listTopicsRequest);
    }

    private static CreateSubscriptionResponse createSubscription(
            String compartmentId,
            String topicId,
            String protocol,
            String subscriptionEndpoint,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider) {
        CreateSubscriptionDetails createSubscriptionDetails =
                CreateSubscriptionDetails.builder()
                        .compartmentId(compartmentId)
                        .topicId(topicId)
                        .protocol(protocol)
                        .endpoint(subscriptionEndpoint)
                        .build();

        CreateSubscriptionRequest createSubscriptionRequest =
                CreateSubscriptionRequest.builder()
                        .createSubscriptionDetails(createSubscriptionDetails)
                        .build();

        NotificationDataPlaneClient dataPlaneClient =
                getDataPlaneClient(topicId, controlPlaneClient, provider);

        return dataPlaneClient.createSubscription(createSubscriptionRequest);
    }

    private static GetSubscriptionResponse getSubscription(
            String topicId,
            String subscriptionId,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider) {
        GetSubscriptionRequest getSubscriptionRequest =
                GetSubscriptionRequest.builder().subscriptionId(subscriptionId).build();
        NotificationDataPlaneClient dataPlaneClient =
                getDataPlaneClient(topicId, controlPlaneClient, provider);
        return dataPlaneClient.getSubscription(getSubscriptionRequest);
    }

    private static ListSubscriptionsResponse listSubscriptionsForTopic(
            String topicId,
            String compartmentId,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider) {
        ListSubscriptionsRequest listSubscriptionsRequest =
                ListSubscriptionsRequest.builder().compartmentId(compartmentId).limit(10).build();
        NotificationDataPlaneClient dataPlaneClient =
                getDataPlaneClient(topicId, controlPlaneClient, provider);
        return dataPlaneClient.listSubscriptions(listSubscriptionsRequest);
    }

    private static ResendSubscriptionConfirmationResponse resendSubscriptionConfirmation(
            String topicId,
            String subscriptionId,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider) {
        ResendSubscriptionConfirmationRequest resendSubscriptionConfirmationRequest =
                ResendSubscriptionConfirmationRequest.builder().id(subscriptionId).build();
        NotificationDataPlaneClient dataPlaneClient =
                getDataPlaneClient(topicId, controlPlaneClient, provider);
        return dataPlaneClient.resendSubscriptionConfirmation(
                resendSubscriptionConfirmationRequest);
    }

    private static GetConfirmSubscriptionResponse confirmSubscription(
            String topicId,
            String subscriptionId,
            String token,
            String protocol,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider) {
        GetConfirmSubscriptionRequest getConfirmSubscriptionRequest =
                GetConfirmSubscriptionRequest.builder()
                        .id(subscriptionId)
                        .token(token)
                        .protocol(protocol)
                        .build();
        NotificationDataPlaneClient dataPlaneClient =
                getDataPlaneClient(topicId, controlPlaneClient, provider);
        return dataPlaneClient.getConfirmSubscription(getConfirmSubscriptionRequest);
    }

    private static UpdateSubscriptionResponse updateSubscriptionRetryPolicy(
            String topicId,
            String subscriptionId,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider,
            BackoffRetryPolicy.PolicyType policyType,
            int maxRetryDuration) {
        BackoffRetryPolicy backoffRetryPolicy =
                BackoffRetryPolicy.builder()
                        .policyType(policyType)
                        .maxRetryDuration(maxRetryDuration)
                        .build();
        DeliveryPolicy deliveryPolicy =
                DeliveryPolicy.builder().backoffRetryPolicy(backoffRetryPolicy).build();
        UpdateSubscriptionDetails updateSubscriptionDetails =
                UpdateSubscriptionDetails.builder().deliveryPolicy(deliveryPolicy).build();
        UpdateSubscriptionRequest updateSubscriptionRequest =
                UpdateSubscriptionRequest.builder()
                        .subscriptionId(subscriptionId)
                        .updateSubscriptionDetails(updateSubscriptionDetails)
                        .build();
        NotificationDataPlaneClient dataPlaneClient =
                getDataPlaneClient(topicId, controlPlaneClient, provider);
        return dataPlaneClient.updateSubscription(updateSubscriptionRequest);
    }

    private static PublishMessageResponse publishMessage(
            String topicId,
            String messageBody,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider) {
        MessageDetails messageDetails = MessageDetails.builder().body(messageBody).build();
        PublishMessageRequest publishMessageRequest =
                PublishMessageRequest.builder()
                        .topicId(topicId)
                        .messageDetails(messageDetails)
                        .build();
        NotificationDataPlaneClient dataPlaneClient =
                getDataPlaneClient(topicId, controlPlaneClient, provider);
        return dataPlaneClient.publishMessage(publishMessageRequest);
    }

    private static GetUnsubscriptionResponse unsubscribeSubscription(
            String topicId,
            String subscriptionId,
            String token,
            String protocol,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider) {
        GetUnsubscriptionRequest getUnsubscriptionRequest =
                GetUnsubscriptionRequest.builder()
                        .id(subscriptionId)
                        .token(token)
                        .protocol(protocol)
                        .build();
        NotificationDataPlaneClient dataPlaneClient =
                getDataPlaneClient(topicId, controlPlaneClient, provider);
        return dataPlaneClient.getUnsubscription(getUnsubscriptionRequest);
    }

    private static DeleteTopicResponse deleteTopic(
            String topicId, NotificationControlPlaneClient controlPlaneClient) {
        DeleteTopicRequest deleteTopicRequest =
                DeleteTopicRequest.builder().topicId(topicId).build();
        return controlPlaneClient.deleteTopic(deleteTopicRequest);
    }

    private static GetTopicResponse getTopic(
            String topicId, NotificationControlPlaneClient controlPlaneClient) {
        String rid = UUID.randomUUID().toString();
        GetTopicRequest request =
                GetTopicRequest.builder().opcRequestId(rid).topicId(topicId).build();
        return controlPlaneClient.getTopic(request);
    }

    private static NotificationDataPlaneClient getDataPlaneClient(
            String topicId,
            NotificationControlPlaneClient controlPlaneClient,
            AuthenticationDetailsProvider provider) {
        NotificationDataPlaneClient dataPlaneClient = new NotificationDataPlaneClient(provider);
        dataPlaneClient.setEndpoint(
                getTopic(topicId, controlPlaneClient).getNotificationTopic().getApiEndpoint());
        return dataPlaneClient;
    }
}
