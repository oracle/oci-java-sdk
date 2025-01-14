/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package realtimespeech;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.oracle.bmc.aispeech.model.RealtimeMessage;
import com.oracle.bmc.aispeech.model.RealtimeMessageAckAudio;
import com.oracle.bmc.aispeech.model.RealtimeMessageAuthenticationCredentials;
import com.oracle.bmc.aispeech.model.RealtimeMessageConnect;
import com.oracle.bmc.aispeech.model.RealtimeMessageError;
import com.oracle.bmc.aispeech.model.RealtimeMessageResult;
import com.oracle.bmc.aispeech.model.RealtimeMessageSendFinalResult;
import com.oracle.bmc.aispeech.model.RealtimeParameters;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.serialization.jackson.JacksonSerializer;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;

import java.io.IOException;
import java.net.ConnectException;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@WebSocket
@SuppressWarnings({"PMD.AvoidCatchingGenericException", "PMD.AvoidThrowingRawExceptionTypes"})
public class RealtimeSpeechClient {

    private final String compartmentId;
    private WebSocketClient client;
    private Session session;
    private boolean isConnected;
    private RealtimeSpeechClientListener listener;
    private BasicAuthenticationDetailsProvider authenticationDetailsProvider;
    private URI destUri;
    private Boolean isClosureClientInitiated = false;

    private Status status;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RealtimeSpeechClient.class);

    private final FilterProvider filters =
            new SimpleFilterProvider()
                    .setFailOnUnknownId(false)
                    .addFilter("explicitlySetFilter", SimpleBeanPropertyFilter.serializeAll());

    private final ObjectMapper objectMapper =
            JacksonSerializer.getDefaultObjectMapper().setFilterProvider(filters);

    /**
     * Constructor.
     *
     * @param listener for the RealtimeSpeechClientListener
     * @param authenticationDetailsProvider for the BasicAuthenticationDetailsProvider
     * @param compartmentId for the compartmentId
     * @param client for the WebsocketClient
     */
    public RealtimeSpeechClient(
            RealtimeSpeechClientListener listener,
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            String compartmentId,
            WebSocketClient client) {

        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.isConnected = false;
        this.listener = listener;
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        this.compartmentId = compartmentId;
        this.client = client;
    }

    /**
     * the onClose event handler.
     *
     * @param statusCode the status code sent from remote
     * @param reason the close reason sent from remote
     */
    @OnWebSocketClose
    public void onClose(int statusCode, String reason) {
        LOG.info(
                "Session closed by {} : reason = {}, status code = {}",
                isClosureClientInitiated ? "client" : "server",
                reason,
                statusCode);

        isConnected = false;
        status = Status.DISCONNECTED;

        // The listener can implement their own closing LOGic
        this.listener.onClose(statusCode, reason);

        this.session = null;
        this.client = null;
        this.listener = null;
    }

    /**
     * the openError event handler.
     *
     * @param error the error throwable sent from remote
     */
    @OnWebSocketError
    public void onError(Throwable error) {
        LOG.info("Error: {}", error.getMessage());
        isConnected = false;
        this.session = null;

        this.status = Status.ERROR;

        // Pass the exception down to the listener.
        if (listener != null) {
            listener.onError(error);
        }
    }

    /**
     * the onConnect event handler.
     *
     * @param session the session that got connected
     */
    @OnWebSocketConnect
    public void onConnect(Session session) {
        LOG.info("Connect: {}", session.getRemoteAddress().getAddress());
        synchronized (this) {
            this.session = session;
        }

        // We need to decide if we want to send tokens or credentials in the client
        // initialization
        sendCreds(compartmentId);

        status = Status.CONNECTED;

        isConnected = true;
        if (listener != null) {
            listener.onConnect();
        }
    }

    /**
     * The onMessage event handler.
     *
     * @param message the message sent from remote string of server
     * @throws JsonProcessingException if errors happens on processing json response
     */
    @OnWebSocketMessage
    public void onMessage(String message) throws JsonProcessingException {
        if (listener == null) {
            return;
        }

        try {
            final RealtimeMessage realtimeMessage =
                    objectMapper.readValue(message, RealtimeMessage.class);
            if (realtimeMessage instanceof RealtimeMessageAckAudio) {
                listener.onAckMessage((RealtimeMessageAckAudio) realtimeMessage);
            } else if (realtimeMessage instanceof RealtimeMessageConnect) {
                listener.onConnectMessage((RealtimeMessageConnect) realtimeMessage);
            } else if (realtimeMessage instanceof RealtimeMessageResult) {
                listener.onResult((RealtimeMessageResult) realtimeMessage);
            } else if (realtimeMessage instanceof RealtimeMessageError) {
                final RealtimeMessageError errorMessage = (RealtimeMessageError) realtimeMessage;
                LOG.error(
                        "Received RealtimeMessageError with message {}", errorMessage.getMessage());
                listener.onError(new ConnectException(errorMessage.getMessage()));
            }
        } catch (JsonProcessingException e) {
            LOG.error("Text Message: JsonProcessingException {}", e);
        }
    }

    /**
     * Opens a connection to the specified remote.
     *
     * @param realtimeSpeechEndpoint the URL string of server
     * @param parameters other additional connection parameters
     * @throws RealtimeSpeechConnectException If there are connection errors
     */
    public void open(String realtimeSpeechEndpoint, RealtimeParameters parameters)
            throws RealtimeSpeechConnectException {
        try {
            status = Status.CONNECTING;

            final String customizationsJson =
                    objectMapper.writeValueAsString(parameters.getCustomizations());
            String queryParameter = "";
            if (parameters.getIsAckEnabled() != null) {
                queryParameter +=
                        "isAckEnabled=" + (parameters.getIsAckEnabled() ? "true" : "false") + "&";
            }
            if (parameters.getShouldIgnoreInvalidCustomizations() != null) {
                queryParameter +=
                        "shouldIgnoreInvalidCustomizations="
                                + (parameters.getShouldIgnoreInvalidCustomizations()
                                        ? "true"
                                        : "false")
                                + "&";
            }
            if (parameters.getPartialSilenceThresholdInMs() != null) {
                queryParameter +=
                        "partialSilenceThresholdInMs="
                                + parameters.getPartialSilenceThresholdInMs()
                                + "&";
            }
            if (parameters.getFinalSilenceThresholdInMs() != null) {
                queryParameter +=
                        "finalSilenceThresholdInMs="
                                + parameters.getFinalSilenceThresholdInMs()
                                + "&";
            }
            if (parameters.getStabilizePartialResults() != null) {
                queryParameter +=
                        "stabilizePartialResults="
                                + parameters.getStabilizePartialResults().getValue()
                                + "&";
            }
            if (parameters.getLanguageCode() != null) {
                queryParameter += "languageCode=" + parameters.getLanguageCode() + "&";
            }
            if (parameters.getModelDomain() != null) {
                queryParameter += "modelDomain=" + parameters.getModelDomain().getValue() + "&";
            }
            if (parameters.getCustomizations() != null
                    && !parameters.getCustomizations().isEmpty()) {
                queryParameter +=
                        "customizations=" + URLEncoder.encode(customizationsJson, "UTF-8");
            }
            if (queryParameter.charAt(queryParameter.length() - 1) == '&') {
                queryParameter = queryParameter.substring(0, queryParameter.length() - 1);
            }
            // The server should contain ws or wss
            destUri =
                    new URI(
                            realtimeSpeechEndpoint
                                    + "/ws/transcribe/stream?"
                                    + queryParameter); // TODO

            LOG.info("Connecting to {} \n", destUri);

            final ClientUpgradeRequest request = new ClientUpgradeRequest();
            LOG.info("Content-Type: {}", parameters.getEncoding());
            request.setHeader("Content-Type", parameters.getEncoding());

            if (!client.isStarted()) {
                LOG.info("Client not started, starting it now");
                client.start();
            }

            this.session = client.connect(this, destUri, request).get(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            status = Status.ERROR;
            LOG.error("Open connection exception {}", e);
            throw new RealtimeSpeechConnectException(e);
        }
    }

    /**
     * Checks the connection status.
     *
     * @return true if connected
     */
    public boolean isConnected() {
        return isConnected;
    }

    /**
     * Sends the audio data of bytes to remote.
     *
     * @param audioBytes represeting the audio data
     * @throws RealtimeSpeechConnectException If session is closed
     * @throws IOException If errors happens on sending
     */
    public void sendAudioData(byte[] audioBytes)
            throws RealtimeSpeechConnectException, IOException {
        if (this.session == null || this.status.equals(Status.DISCONNECTED)) {
            LOG.error("Session has been closed, cannot send audio anymore");
            throw new RealtimeSpeechConnectException(
                    "Session has been closed, cannot send audio anymore");
        } else {
            try {
                if (this.status.equals(Status.CONNECTED)) {
                    this.session.getRemote().sendBytes(ByteBuffer.wrap(audioBytes));

                } else {
                    this.status = Status.ERROR;
                    throw new ConnectException("Websocket not connected.");
                }
            } catch (IOException e) {
                this.status = Status.ERROR;
                LOG.error("Send exception {}", e);
                // throw e;
            }
        }
    }

    /** Closes the connection. */
    public void close() {
        isClosureClientInitiated = true;
        LOG.info("Closing SDK connection");

        try {
            if (this.session != null) {
                LOG.info(
                        "Here are the sessions shared by the client: {}",
                        client.getOpenSessions().stream().count());
                this.session.close(1000, "Session Closed by Client");
                // this.session = null;
            }
        } catch (Exception e) {
            LOG.warn("Encountered an issue while closing the session: {}", e.getMessage());
        }

        this.isConnected = false;
        this.authenticationDetailsProvider = null;
    }

    private void sendCreds(String compartmentId) {

        final RequestSigner requestSigner =
                DefaultRequestSigner.createRequestSigner(authenticationDetailsProvider);
        LOG.info("Sending credentials");
        final Map<String, List<String>> headers = new HashMap<>();
        final Map<String, String> newHeaders =
                requestSigner.signRequest(destUri, "GET", headers, null);
        newHeaders.put("uri", destUri.toString());

        final RealtimeMessageAuthenticationCredentials authenticationMessage =
                RealtimeMessageAuthenticationCredentials.builder()
                        .compartmentId(compartmentId)
                        .headers(newHeaders)
                        .build();

        try {
            sendMessage(objectMapper.writeValueAsString(authenticationMessage));
        } catch (JsonProcessingException e) {
            LOG.info("Could not serialize authentication credentials: {}", e);
            // TODO: Add better exceptions
            this.status = Status.ERROR;
        }

        LOG.info("Credentials sent");
    }

    public void sendMessage(String message) {
        try {
            session.getRemote().sendString(message);
        } catch (IOException e) {
            LOG.info("Could not send message to the remote server: {}", e);
            // TODO: Add better exceptions
            this.status = Status.ERROR;
        }
    }
    /**
     * Use this to request the final result without waiting for the timeout if you need to close the
     * session immediately
     */
    public void requestFinalResult() {
        try {
            String message =
                    objectMapper.writeValueAsString(
                            RealtimeMessageSendFinalResult.builder().build());
            LOG.info("Requesting final result: " + message);
            session.getRemote().sendString(message);
        } catch (IOException e) {
            LOG.info("Could not request final result from the remote server: {}", e);
            this.status = Status.ERROR;
        }
    }

    public Status getStatus() {
        return status;
    }

    public static enum Status {
        CONNECTED, // When the connection is active
        CONNECTING, // When the connection is being initiated
        DISCONNECTED, // Connection closed by client/server
        ERROR // Something went wrong while connecting
    }
}
