/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
import com.oracle.bmc.ons.responses.GetConfirmSubscriptionResponse;
import com.oracle.bmc.ons.responses.GetTopicResponse;
import com.oracle.bmc.ons.responses.ListSubscriptionsResponse;
import com.oracle.bmc.ons.responses.ListTopicsResponse;
import com.oracle.bmc.ons.responses.ResendSubscriptionConfirmationResponse;
import com.oracle.bmc.waiter.BmcGenericWaiter;
import com.oracle.bmc.waiter.Waiters;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class demonstrates how to use the Notification service api in the Java SDK. This will cover:
 *
 * <ul>
 *   <li>Create one topic</li>
 *   <li>Update this topic</li>
 *   <li>Create one subscription for this topic</li>
 *   <li>Confirm the subscription</li>
 *   <li>Update the subscription</li>
 *   <li>Publish message to this topic</li>
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
 * <ul>
 */
public class NotificationExample {
    public static void main(String[] args) throws Exception {
        Pattern pattern = Pattern.compile("token=(.*)&");
        String compartmentId = args[0];
        String ociConfigurationFilePath = "~/.oci/config";
        String ociConfigurationProfile = "DEFAULT";

        AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(
                        ociConfigurationFilePath, ociConfigurationProfile);

        final NotificationControlPlaneClient controlPlaneClient =
                new NotificationControlPlaneClient(provider);
        NotificationDataPlaneClient dataPlaneClient = new NotificationDataPlaneClient(provider);

        // Example contents of ~/.oci/config file:
        // [DEFAULT]
        // ...
        // ONSControlPlaneEndpoint = https://cp.notification.us-phoenix-1.oraclecloud.com
        // ONSDataPlaneEndpoint = https://cell1.notification.us-phoenix-1.oraclecloud.com
        controlPlaneClient.setEndpoint(
                ConfigFileReader.parse(ociConfigurationFilePath, ociConfigurationProfile)
                        .get("ONSControlPlaneEndpoint"));
        dataPlaneClient.setEndpoint(
                ConfigFileReader.parse(ociConfigurationFilePath, ociConfigurationProfile)
                        .get("ONSDataPlaneEndpoint"));

        // Create topic
        System.out.println("Creating topic");
        System.out.println("=======================");
        CreateTopicDetails createTopicDetails =
                CreateTopicDetails.builder()
                        .compartmentId(compartmentId)
                        .name("first_topic")
                        .description("the first topic description")
                        .build();
        CreateTopicRequest createTopicRequest =
                CreateTopicRequest.builder().createTopicDetails(createTopicDetails).build();
        CreateTopicResponse createTopicResponse =
                controlPlaneClient.createTopic(createTopicRequest);

        final String topicId = createTopicResponse.getNotificationTopic().getTopicId();
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
        TopicAttributesDetails topicAttributesDetails =
                TopicAttributesDetails.builder().description("description changed").build();
        UpdateTopicRequest updateTopicRequest =
                UpdateTopicRequest.builder()
                        .topicId(topicId)
                        .topicAttributesDetails(topicAttributesDetails)
                        .build();
        controlPlaneClient.updateTopic(updateTopicRequest);
        System.out.println("Update topic successfully for topic id: " + topicId);

        // List all topics
        System.out.println("ListTopics for Compartment: " + compartmentId + "\n");
        System.out.println("=======================");
        ListTopicsRequest listTopicsRequest =
                ListTopicsRequest.builder().compartmentId(compartmentId).limit(10).build();
        ListTopicsResponse listTopicsResponse = controlPlaneClient.listTopics(listTopicsRequest);

        System.out.println("ListTopics Response for: " + compartmentId + "\n");
        for (NotificationTopicSummary topic : listTopicsResponse.getItems()) {
            System.out.println(topic);
        }

        // Create HTTPS subscription
        System.out.println("Creating HTTPS subscription");
        System.out.println("=======================");
        CreateSubscriptionDetails createSubscriptionDetails =
                CreateSubscriptionDetails.builder()
                        .compartmentId(compartmentId)
                        .topicId(topicId)
                        .protocol("EMAIL")
                        .endpoint("no-reply@example.com")
                        .build();

        CreateSubscriptionRequest createSubscriptionRequest =
                CreateSubscriptionRequest.builder()
                        .createSubscriptionDetails(createSubscriptionDetails)
                        .build();

        CreateSubscriptionResponse createSubscriptionResponse =
                dataPlaneClient.createSubscription(createSubscriptionRequest);

        String subscriptionId = createSubscriptionResponse.getSubscription().getId();
        System.out.println("Create subscription successfully for topic id: " + topicId);

        // Get the subscription
        System.out.println("Getting the subscription");
        System.out.println("=======================");
        GetSubscriptionRequest getSubscriptionRequest =
                GetSubscriptionRequest.builder().subscriptionId(subscriptionId).build();
        dataPlaneClient.getSubscription(getSubscriptionRequest);
        System.out.println("Get subscription successfully for subscription id: " + subscriptionId);

        // List all subscriptions
        System.out.println("ListSubscriptions for Topic: " + topicId + "\n");
        System.out.println("=======================");
        ListSubscriptionsRequest listSubscriptionsRequest =
                ListSubscriptionsRequest.builder().compartmentId(compartmentId).limit(10).build();
        ListSubscriptionsResponse listSubscriptionsResponse =
                dataPlaneClient.listSubscriptions(listSubscriptionsRequest);
        System.out.println("ListSubscriptions Response for: " + topicId + "\n");
        for (SubscriptionSummary subscription : listSubscriptionsResponse.getItems()) {
            System.out.println(subscription);
        }

        // Re-send subscription confirmation
        ResendSubscriptionConfirmationRequest resendSubscriptionConfirmationRequest =
                ResendSubscriptionConfirmationRequest.builder()
                        .id(createSubscriptionResponse.getSubscription().getId())
                        .build();

        dataPlaneClient.resendSubscriptionConfirmation(resendSubscriptionConfirmationRequest);

        // Copy auth token received in email and paste here
        // One example of auth token: token=MDAwMHJpeWF3RFVzREhRMGlsOE9NUFNFY0R3cUd4clc0V0xLQjRNR3grMGI3bzRMT2xiT0Y0PQ==&
        String token =
                "MDAwMHJpeWF3RFVzREhRMGlsOE9NUFNFY0R3cUd4clc0V0xLQjRNR3grMGI3bzRMT2xiT0Y0PQ==";

        // Confirm subscription
        System.out.println("Confirming the subscription");
        System.out.println("=======================");
        GetConfirmSubscriptionRequest getConfirmSubscriptionRequest =
                GetConfirmSubscriptionRequest.builder()
                        .id(createSubscriptionResponse.getSubscription().getId())
                        .token(token)
                        .protocol("HTTPS")
                        .build();
        GetConfirmSubscriptionResponse getConfirmSubscriptionResponse =
                dataPlaneClient.getConfirmSubscription(getConfirmSubscriptionRequest);
        System.out.println(
                "Confirm subscription successfully for subscription id: " + subscriptionId);

        // Get auth token
        Matcher matcher =
                pattern.matcher(
                        getConfirmSubscriptionResponse
                                .getConfirmationResult()
                                .getUnsubscribeUrl()
                                // converting unicode characters back so the regular expression pattern will work
                                .replace("\\u003d", "=")
                                .replace("\\u0026", "&"));
        matcher.find();
        token = matcher.group(1);

        // Update subscription delivery retry policy
        System.out.println("Updating subscription delivery retry policy");
        System.out.println("=======================");
        BackoffRetryPolicy backoffRetryPolicy =
                BackoffRetryPolicy.builder()
                        .policyType(BackoffRetryPolicy.PolicyType.Exponential)
                        .maxRetryDuration(5000)
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
        dataPlaneClient.updateSubscription(updateSubscriptionRequest);
        System.out.println(
                "Update subscription delivery retry policy successfully for subscription id: "
                        + subscriptionId);

        // Publish message to the topic
        System.out.println("Publishing message to the topic");
        System.out.println("=======================");
        MessageDetails messageDetails = MessageDetails.builder().body("hello world!").build();
        PublishMessageRequest publishMessageRequest =
                PublishMessageRequest.builder()
                        .topicId(topicId)
                        .messageDetails(messageDetails)
                        .build();
        dataPlaneClient.publishMessage(publishMessageRequest);
        System.out.println("Publish message successfully for topic id: " + topicId);

        // Un-subscribe the subscription
        System.out.println("Un-subscribing the subscription");
        System.out.println("=======================");
        GetUnsubscriptionRequest getUnsubscriptionRequest =
                GetUnsubscriptionRequest.builder()
                        .id(subscriptionId)
                        .token(token)
                        .protocol("HTTPS")
                        .build();
        dataPlaneClient.getUnsubscription(getUnsubscriptionRequest);
        System.out.println("Un-subscribe successfully for subscription id: " + subscriptionId);

        // Delete the topic
        System.out.println("Deleting the topic");
        System.out.println("=======================");
        DeleteTopicRequest deleteTopicRequest =
                DeleteTopicRequest.builder().topicId(topicId).build();
        controlPlaneClient.deleteTopic(deleteTopicRequest);
        System.out.println("Delete topic successfully for topic id: " + topicId);
    }
}
