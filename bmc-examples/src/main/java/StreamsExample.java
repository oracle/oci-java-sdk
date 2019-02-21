/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.common.util.concurrent.Uninterruptibles;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.streaming.StreamAdminClient;
import com.oracle.bmc.streaming.StreamClient;
import com.oracle.bmc.streaming.model.CreateCursorDetails;
import com.oracle.bmc.streaming.model.CreateCursorDetails.Type;
import com.oracle.bmc.streaming.model.CreateGroupCursorDetails;
import com.oracle.bmc.streaming.model.CreateStreamDetails;
import com.oracle.bmc.streaming.model.Message;
import com.oracle.bmc.streaming.model.PutMessagesDetails;
import com.oracle.bmc.streaming.model.PutMessagesDetailsEntry;
import com.oracle.bmc.streaming.model.PutMessagesResultEntry;
import com.oracle.bmc.streaming.model.Stream;
import com.oracle.bmc.streaming.model.Stream.LifecycleState;
import com.oracle.bmc.streaming.requests.CreateCursorRequest;
import com.oracle.bmc.streaming.requests.CreateGroupCursorRequest;
import com.oracle.bmc.streaming.requests.CreateStreamRequest;
import com.oracle.bmc.streaming.requests.DeleteStreamRequest;
import com.oracle.bmc.streaming.requests.GetMessagesRequest;
import com.oracle.bmc.streaming.requests.GetStreamRequest;
import com.oracle.bmc.streaming.requests.ListStreamsRequest;
import com.oracle.bmc.streaming.requests.PutMessagesRequest;
import com.oracle.bmc.streaming.responses.CreateCursorResponse;
import com.oracle.bmc.streaming.responses.CreateGroupCursorResponse;
import com.oracle.bmc.streaming.responses.CreateStreamResponse;
import com.oracle.bmc.streaming.responses.GetMessagesResponse;
import com.oracle.bmc.streaming.responses.GetStreamResponse;
import com.oracle.bmc.streaming.responses.ListStreamsResponse;
import com.oracle.bmc.streaming.responses.PutMessagesResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.StringUtils;

/**
 * This class provides an example of basic streaming usage.
 * - List streams
 * - Get a stream
 * - Create a stream
 * - Delete a stream
 * - Publish to a stream
 * - Consume from a stream partition, using a cursor
 * - Consume from a stream, using a group cursor
 */
public class StreamsExample {

    public static void main(String[] args) throws Exception {
        final String configurationFilePath = "~/.oci/config";
        final String profile = "DEFAULT";

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configurationFilePath, profile);

        // Create an admin-client for the phoenix region.
        final StreamAdminClient adminClient = new StreamAdminClient(provider);

        if (args.length < 1) {
            throw new IllegalArgumentException(
                    "This example expects an ocid for the compartment in which streams should be created.");
        }

        final String compartmentId = args[0];
        final String exampleStreamName = "sdk-example-stream";
        final int partitions = 1;

        // We want to be good samaritan, so we'll reuse a stream if its already created.
        // This will utilize ListStreams() to determine if a stream exists and return it, or create a new one.
        Stream stream =
                getOrCreateStream(adminClient, compartmentId, exampleStreamName, partitions);

        // Streams are assigned a specific endpoint url based on where they are provisioned.
        // Create a stream client using the provided message endpoint.
        StreamClient streamClient = new StreamClient(provider);
        streamClient.setEndpoint(stream.getMessagesEndpoint());

        String streamId = stream.getId();

        // publish some messages to the stream
        publishExampleMessages(streamClient, streamId);

        // give the streaming service a second to propagate messages
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);

        // Use a cursor for getting messages; each getMessages call will return a next-cursor for iteration.
        // There are a couple kinds of cursors.

        // A cursor can be created at a given partition/offset.
        // This gives explicit offset management control to the consumer.
        System.out.println("Starting a simple message loop with a partition cursor");
        String partitionCursor = getCursorByPartition(streamClient, streamId, "0");
        simpleMessageLoop(streamClient, streamId, partitionCursor);

        // A cursor can be created as part of a consumer group.
        // Committed offsets are managed for the group, and partitions
        // are dynamically balanced amongst consumers in the group.
        System.out.println("Starting a simple message loop with a group cursor");
        String groupCursor =
                getCursorByGroup(streamClient, streamId, "exampleGroup", "exampleInstance-1");
        simpleMessageLoop(streamClient, streamId, groupCursor);

        // Cleanup; remember to delete streams which are not in use.
        deleteStream(adminClient, streamId);

        // Stream deletion is an asynchronous operation, give it some time to complete.

        GetStreamRequest streamRequest = GetStreamRequest.builder().streamId(streamId).build();
        adminClient.getWaiters().forStream(streamRequest, LifecycleState.Deleted).execute();
    }

    private static void deleteStream(StreamAdminClient adminClient, String streamId) {
        System.out.println("Deleting stream " + streamId);
        adminClient.deleteStream(DeleteStreamRequest.builder().streamId(streamId).build());
    }

    private static String getCursorByGroup(
            StreamClient streamClient, String streamId, String groupName, String instanceName) {
        System.out.println(
                String.format(
                        "Creating a cursor for group %s, instance %s.", groupName, instanceName));

        CreateGroupCursorDetails cursorDetails =
                CreateGroupCursorDetails.builder()
                        .groupName(groupName)
                        .instanceName(instanceName)
                        .type(CreateGroupCursorDetails.Type.TrimHorizon)
                        .commitOnGet(true)
                        .build();

        CreateGroupCursorRequest createCursorRequest =
                CreateGroupCursorRequest.builder()
                        .streamId(streamId)
                        .createGroupCursorDetails(cursorDetails)
                        .build();

        CreateGroupCursorResponse groupCursorResponse =
                streamClient.createGroupCursor(createCursorRequest);
        return groupCursorResponse.getCursor().getValue();
    }

    private static String getCursorByPartition(
            StreamClient streamClient, String streamId, String partition) {
        System.out.println(String.format("Creating a cursor for partition %s.", partition));

        CreateCursorDetails cursorDetails =
                CreateCursorDetails.builder().partition(partition).type(Type.TrimHorizon).build();

        CreateCursorRequest createCursorRequest =
                CreateCursorRequest.builder()
                        .streamId(streamId)
                        .createCursorDetails(cursorDetails)
                        .build();

        CreateCursorResponse cursorResponse = streamClient.createCursor(createCursorRequest);
        return cursorResponse.getCursor().getValue();
    }

    private static Stream getStream(StreamAdminClient adminClient, String streamId) {
        GetStreamResponse getResponse =
                adminClient.getStream(GetStreamRequest.builder().streamId(streamId).build());
        return getResponse.getStream();
    }

    private static Stream getOrCreateStream(
            StreamAdminClient adminClient, String compartmentId, String streamName, int partitions)
            throws Exception {

        ListStreamsRequest listRequest =
                ListStreamsRequest.builder()
                        .compartmentId(compartmentId)
                        .lifecycleState(LifecycleState.Active)
                        .name(streamName)
                        .build();

        ListStreamsResponse listResponse = adminClient.listStreams(listRequest);

        if (!listResponse.getItems().isEmpty()) {
            // if we find an active stream with the correct name, we'll use it.
            System.out.println(String.format("An active stream named %s was found.", streamName));

            String streamId = listResponse.getItems().get(0).getId();
            return getStream(adminClient, streamId);
        }

        System.out.println(
                String.format("No active stream named %s was found; creating it now.", streamName));
        Stream createdStream = createStream(adminClient, compartmentId, streamName, partitions);

        // GetStream provides details about a specific stream.
        // Since stream creation is asynchronous; we need to wait for the stream to become active.
        GetStreamRequest streamRequest =
                GetStreamRequest.builder().streamId(createdStream.getId()).build();
        Stream activeStream =
                adminClient
                        .getWaiters()
                        .forStream(streamRequest, LifecycleState.Active)
                        .execute()
                        .getStream();

        // Give a little time for the stream to be ready.
        Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);
        return activeStream;
    }

    private static Stream createStream(
            StreamAdminClient adminClient,
            String compartmentId,
            String streamName,
            int partitions) {
        System.out.println(
                String.format("Creating stream %s with %s partitions", streamName, partitions));

        CreateStreamDetails streamDetails =
                CreateStreamDetails.builder()
                        .compartmentId(compartmentId)
                        .name(streamName)
                        .partitions(partitions)
                        .build();

        CreateStreamRequest createStreamRequest =
                CreateStreamRequest.builder().createStreamDetails(streamDetails).build();

        CreateStreamResponse createResponse = adminClient.createStream(createStreamRequest);
        return createResponse.getStream();
    }

    private static void publishExampleMessages(StreamClient streamClient, String streamId) {
        // build up a putRequest and publish some messages to the stream
        List<PutMessagesDetailsEntry> messages = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            messages.add(
                    PutMessagesDetailsEntry.builder()
                            .key(String.format("messageKey-%s", i).getBytes(UTF_8))
                            .value(String.format("messageValue-%s", i).getBytes(UTF_8))
                            .build());
        }

        System.out.println(
                String.format("Publishing %s messages to stream %s.", messages.size(), streamId));
        PutMessagesDetails messagesDetails =
                PutMessagesDetails.builder().messages(messages).build();

        PutMessagesRequest putRequest =
                PutMessagesRequest.builder()
                        .streamId(streamId)
                        .putMessagesDetails(messagesDetails)
                        .build();

        PutMessagesResponse putResponse = streamClient.putMessages(putRequest);

        // the putResponse can contain some useful metadata for handling failures
        for (PutMessagesResultEntry entry : putResponse.getPutMessagesResult().getEntries()) {
            if (StringUtils.isNotBlank(entry.getError())) {
                System.out.println(
                        String.format("Error(%s): %s", entry.getError(), entry.getErrorMessage()));
            } else {
                System.out.println(
                        String.format(
                                "Published message to partition %s, offset %s.",
                                entry.getPartition(),
                                entry.getOffset()));
            }
        }
    }

    private static void simpleMessageLoop(
            StreamClient streamClient, String streamId, String initialCursor) {
        String cursor = initialCursor;
        for (int i = 0; i < 10; i++) {

            GetMessagesRequest getRequest =
                    GetMessagesRequest.builder()
                            .streamId(streamId)
                            .cursor(cursor)
                            .limit(10)
                            .build();

            GetMessagesResponse getResponse = streamClient.getMessages(getRequest);

            // process the messages
            System.out.println(String.format("Read %s messages.", getResponse.getItems().size()));
            for (Message message : getResponse.getItems()) {
                System.out.println(
                        String.format(
                                "%s: %s",
                                new String(message.getKey(), UTF_8),
                                new String(message.getValue(), UTF_8)));
            }

            // getMessages is a throttled method; clients should retrieve sufficiently large message
            // batches, as to avoid too many http requests.
            Uninterruptibles.sleepUninterruptibly(1, TimeUnit.SECONDS);

            // use the next-cursor for iteration
            cursor = getResponse.getOpcNextCursor();
        }
    }
}
