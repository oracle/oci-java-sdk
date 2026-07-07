/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.realtimespeech;

import com.fasterxml.jackson.core.JsonProcessingException;
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
import com.oracle.bmc.aispeech.model.RealtimeParameters.Punctuation;
import com.oracle.bmc.aispeech.realtimespeech.internal.AudioResamplingSupport;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.serialization.jackson.JacksonSerializer;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.util.internal.StringUtils;
import org.apache.http.client.utils.URIBuilder;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketError;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

/**
 * This is the client to be used for connecting to the realtime speech service. Note that this
 * contains an instance of the RealtimeSpeechClientListener class which will be called on the
 * appropriate event (CONNECT, RESULT, etc). Make sure you use the right combination of the
 * endpoint, compartmentId, and authenticationDetailsProvider to use this client.
 */
@WebSocket
@SuppressWarnings({"PMD.AvoidCatchingGenericException", "PMD.AvoidThrowingRawExceptionTypes"})
public class RealtimeSpeechClient {

    private final String compartmentId;
    private WebSocketClient webSocketClient;
    private Session session;
    private boolean isConnected;
    private RealtimeSpeechClientListener listener;
    private BasicAuthenticationDetailsProvider authenticationDetailsProvider;
    private URI destUri;
    private Boolean isClosureClientInitiated = false;
    private AudioResamplingSupport.AudioEncodingSettings audioEncodingSettings =
            AudioResamplingSupport.AudioEncodingSettings.defaultSettings();
    private Integer defaultSourceSampleRate;
    private AudioResamplingSupport.StreamingAudioResampler streamingAudioResampler;

    private Status status;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(RealtimeSpeechClient.class);

    private final FilterProvider filters =
            new SimpleFilterProvider()
                    .setFailOnUnknownId(false)
                    .addFilter("explicitlySetFilter", SimpleBeanPropertyFilter.serializeAll());

    private final ObjectMapper objectMapper =
            JacksonSerializer.getDefaultObjectMapper().copy().setFilterProvider(filters);

    private static final String shouldIgnoreInvalidCustomizationsParamString =
            "shouldIgnoreInvalidCustomizations";
    private static final String isAckEnabledParamString = "isAckEnabled";
    private static final String encodingParamString = "encoding";
    private static final String partialSilenceThresholdInMsParamString =
            "partialSilenceThresholdInMs";
    private static final String finalSilenceThresholdInMsParamString = "finalSilenceThresholdInMs";
    private static final String stabilizePartialResultsParamString = "stabilizePartialResults";
    private static final String languageCodeParamString = "languageCode";
    private static final String modelDomainParamString = "modelDomain";
    private static final String modelTypeParamString = "modelType";
    private static final String punctuationParamString = "punctuation";
    private static final String customizationsParamString = "customizations";
    private static final String modelTypeDefaultValue = "ORACLE";

    /**
     * Constructor.
     *
     * @param listener for the RealtimeSpeechClientListener
     * @param authenticationDetailsProvider for the BasicAuthenticationDetailsProvider
     * @param compartmentId for the compartmentId
     * @param webSocketClient for the WebsocketClient
     */
    public RealtimeSpeechClient(
            RealtimeSpeechClientListener listener,
            BasicAuthenticationDetailsProvider authenticationDetailsProvider,
            String compartmentId,
            WebSocketClient webSocketClient) {

        this.isConnected = false;
        this.listener = listener;
        this.authenticationDetailsProvider = authenticationDetailsProvider;
        this.compartmentId = compartmentId;
        this.webSocketClient = webSocketClient;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        RealtimeSpeechClientListener listener;

        public Builder listener(RealtimeSpeechClientListener listener) {
            this.listener = listener;
            return this;
        }

        BasicAuthenticationDetailsProvider authenticationDetailsProvider;

        public Builder authenticationDetailsProvider(
                BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
            this.authenticationDetailsProvider = authenticationDetailsProvider;
            return this;
        }

        WebSocketClient webSocketClient;

        public Builder webSocketClient(WebSocketClient webSocketClient) {
            this.webSocketClient = webSocketClient;
            return this;
        }

        String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        public RealtimeSpeechClient build() {
            if (StringUtils.isBlank(compartmentId)) {
                throw new IllegalStateException("Please initialize with a non-null compartmentId");
            }

            if (listener == null) {
                throw new IllegalStateException("Please initialize the listener parameter");
            }

            if (authenticationDetailsProvider == null) {
                throw new IllegalStateException(
                        "Please initialize the authentication details provider");
            }

            if (webSocketClient == null) {
                throw new IllegalStateException("Please initialize the websocket client");
            }

            return new RealtimeSpeechClient(
                    listener, authenticationDetailsProvider, compartmentId, webSocketClient);
        }
    }

    public static Builder builder() {
        return new Builder();
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

        // The listener can implement their own closing logic
        this.listener.onClose(statusCode, reason);

        this.session = null;
        this.webSocketClient = null;
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
            final EncodingNormalizationResult encodingNormalizationResult =
                    normalizeEncodingForService(parameters.getEncoding());
            final String effectiveEncoding = encodingNormalizationResult.normalizedEncoding;
            this.defaultSourceSampleRate = encodingNormalizationResult.defaultSourceSampleRate;
            this.audioEncodingSettings = AudioResamplingSupport.parseEncoding(effectiveEncoding);
            this.streamingAudioResampler = null;

            final String customizationsJson =
                    objectMapper.writeValueAsString(parameters.getCustomizations());

            final URIBuilder queryParameterStringBuilder =
                    new URIBuilder(realtimeSpeechEndpoint + "/ws/transcribe/stream");

            if (parameters.getIsAckEnabled() != null) {
                queryParameterStringBuilder.addParameter(
                        isAckEnabledParamString, parameters.getIsAckEnabled().toString());
            }

            if (effectiveEncoding != null && !effectiveEncoding.isEmpty()) {
                queryParameterStringBuilder.addParameter(encodingParamString, effectiveEncoding);
            }

            if (parameters.getShouldIgnoreInvalidCustomizations() != null) {
                queryParameterStringBuilder.addParameter(
                        shouldIgnoreInvalidCustomizationsParamString,
                        parameters.getShouldIgnoreInvalidCustomizations().toString());
            }

            if (parameters.getPartialSilenceThresholdInMs() != null) {
                queryParameterStringBuilder.addParameter(
                        partialSilenceThresholdInMsParamString,
                        parameters.getPartialSilenceThresholdInMs().toString());
            }

            if (parameters.getFinalSilenceThresholdInMs() != null) {
                queryParameterStringBuilder.addParameter(
                        finalSilenceThresholdInMsParamString,
                        parameters.getFinalSilenceThresholdInMs().toString());
            }

            if (parameters.getStabilizePartialResults() != null) {
                queryParameterStringBuilder.addParameter(
                        stabilizePartialResultsParamString,
                        parameters.getStabilizePartialResults().getValue());
            }

            if (parameters.getLanguageCode() != null) {
                queryParameterStringBuilder.addParameter(
                        languageCodeParamString, parameters.getLanguageCode());
            }

            if (parameters.getModelDomain() != null) {
                queryParameterStringBuilder.addParameter(
                        modelDomainParamString, parameters.getModelDomain().getValue());
            }

            if (parameters.getModelType() != null
                    && !parameters.getModelType().equalsIgnoreCase(modelTypeDefaultValue)) {
                queryParameterStringBuilder.addParameter(
                        modelTypeParamString, parameters.getModelType());
            }

            if (parameters.getPunctuation() != null
                    && !parameters.getPunctuation().equals(Punctuation.None)) {
                queryParameterStringBuilder.addParameter(
                        punctuationParamString, parameters.getPunctuation().getValue());
            }

            if (parameters.getCustomizations() != null
                    && !parameters.getCustomizations().isEmpty()) {
                queryParameterStringBuilder.addParameter(
                        customizationsParamString, customizationsJson);
            }

            destUri = queryParameterStringBuilder.build();

            LOG.info("Connecting to {} \n", destUri);

            final ClientUpgradeRequest request = new ClientUpgradeRequest();
            LOG.debug("Content-Type: {}", effectiveEncoding);

            if (!webSocketClient.isStarted()) {
                LOG.info("Client not started, starting it now");
                webSocketClient.start();
            }

            this.session =
                    webSocketClient.connect(this, destUri, request).get(10, TimeUnit.SECONDS);
        } catch (UnsupportedEncodingException e) {
            status = Status.ERROR;
            LOG.error("Unable to construct the request {}", e);
            throw new RealtimeSpeechConnectException(e);
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
     * @param audioBytes representing the audio data
     * @throws RealtimeSpeechConnectException If there are errors while sending audio data
     */
    public void sendAudioData(byte[] audioBytes) throws RealtimeSpeechConnectException {
        if (this.session == null || this.status.equals(Status.DISCONNECTED)) {
            LOG.error("Session has been closed, cannot send audio anymore");
            throw new RealtimeSpeechConnectException(
                    "Session has been closed, cannot send audio anymore");
        } else {
            try {
                if (this.status.equals(Status.CONNECTED)) {
                    final int effectiveSourceSampleRate =
                            defaultSourceSampleRate == null
                                    ? audioEncodingSettings.getSampleRate()
                                    : defaultSourceSampleRate;
                    final long resamplingStartNanos = System.nanoTime();
                    final byte[] normalizedAudioBytes =
                            normalizeAudioForStreaming(audioBytes, effectiveSourceSampleRate);
                    final long resamplingNanos = System.nanoTime() - resamplingStartNanos;
                    final long sendStartNanos = System.nanoTime();
                    this.session.getRemote().sendBytes(ByteBuffer.wrap(normalizedAudioBytes));
                    final long sendNanos = System.nanoTime() - sendStartNanos;
                    if (listener != null) {
                        listener.onAudioChunkProcessed(
                                AudioChunkProcessingDetails.builder()
                                        .sourceSampleRate(effectiveSourceSampleRate)
                                        .targetSampleRate(audioEncodingSettings.getSampleRate())
                                        .inputBytes(audioBytes.length)
                                        .outputBytes(normalizedAudioBytes.length)
                                        .resampled(
                                                effectiveSourceSampleRate
                                                        != audioEncodingSettings.getSampleRate())
                                        .resamplingNanos(resamplingNanos)
                                        .sendNanos(sendNanos)
                                        .build());
                    }

                } else {
                    this.status = Status.ERROR;
                    throw new RealtimeSpeechConnectException(
                            "Could not send audio data to the realtime speech service");
                }
            } catch (IOException e) {
                this.status = Status.ERROR;
                LOG.error("Send exception {}", e);
                throw new RealtimeSpeechConnectException(e);
            }
        }
    }

    /** Closes the connection. */
    public void close() {
        isClosureClientInitiated = true;
        LOG.info("Closing SDK connection");

        try {
            if (this.session != null) {
                flushPendingResampledAudio();
                LOG.info(
                        "Here are the sessions shared by the client: {}",
                        webSocketClient.getOpenSessions().stream().count());
                this.session.close(1000, "Session Closed by Client");
                // this.session = null;
            }
        } catch (Exception e) {
            LOG.warn("Encountered an issue while closing the session: {}", e.getMessage());
        }

        this.isConnected = false;
        this.authenticationDetailsProvider = null;
        this.streamingAudioResampler = null;
        this.defaultSourceSampleRate = null;
    }

    private void sendCreds(String compartmentId) {

        final RequestSigner requestSigner =
                getRequestSignerFromAuthenticationDetailsProvider(authenticationDetailsProvider);
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
            flushPendingResampledAudio();
            String message =
                    objectMapper.writeValueAsString(
                            RealtimeMessageSendFinalResult.builder().build());
            LOG.info("Requesting final result: " + message);
            sendMessage(message);
        } catch (IOException e) {
            LOG.info("Could not request final result from the remote server: {}", e);
            this.status = Status.ERROR;
        }
    }

    @VisibleForTesting
    protected RequestSigner getRequestSignerFromAuthenticationDetailsProvider(
            BasicAuthenticationDetailsProvider authenticationDetailsProvider) {
        return DefaultRequestSigner.createRequestSigner(authenticationDetailsProvider);
    }

    public Status getStatus() {
        return status;
    }

    private byte[] normalizeAudioForStreaming(byte[] audioBytes, Integer sourceSampleRate) {
        if (sourceSampleRate == null
                || sourceSampleRate.intValue() == audioEncodingSettings.getSampleRate()) {
            return audioBytes;
        }

        AudioResamplingSupport.validateStreamingRequest(
                sourceSampleRate.intValue(), audioEncodingSettings);

        if (streamingAudioResampler == null) {
            streamingAudioResampler =
                    AudioResamplingSupport.createStreamingResampler(
                            sourceSampleRate.intValue(), audioEncodingSettings);
        }

        return streamingAudioResampler.process(audioBytes);
    }

    private EncodingNormalizationResult normalizeEncodingForService(String requestedEncoding) {
        final AudioResamplingSupport.AudioEncodingSettings requestedSettings =
                AudioResamplingSupport.parseEncoding(requestedEncoding);
        final int requestedSampleRate = requestedSettings.getSampleRate();

        if (requestedEncoding == null || requestedEncoding.trim().isEmpty()) {
            return new EncodingNormalizationResult(requestedEncoding, null);
        }

        if (AudioResamplingSupport.isServiceSupportedSampleRate(requestedSampleRate)) {
            return new EncodingNormalizationResult(requestedEncoding, null);
        }

        final Optional<Integer> serviceTargetSampleRate =
                AudioResamplingSupport.resolveServiceTargetSampleRate(requestedSampleRate);
        final boolean canAutoNormalize =
                serviceTargetSampleRate.isPresent()
                        && AudioResamplingSupport.isAutoResamplingCompatible(requestedSettings);
        if (!canAutoNormalize) {
            return new EncodingNormalizationResult(requestedEncoding, null);
        }

        return new EncodingNormalizationResult(
                AudioResamplingSupport.rewriteEncodingSampleRate(
                        requestedEncoding, serviceTargetSampleRate.get().intValue()),
                requestedSampleRate);
    }

    private void flushPendingResampledAudio() {
        if (streamingAudioResampler == null || session == null) {
            return;
        }

        try {
            final byte[] flushedAudioBytes = streamingAudioResampler.flush();
            if (flushedAudioBytes.length > 0) {
                session.getRemote().sendBytes(ByteBuffer.wrap(flushedAudioBytes));
            }
        } catch (IOException e) {
            LOG.error("Could not flush resampled audio before finalization", e);
            this.status = Status.ERROR;
        }
    }

    private static final class EncodingNormalizationResult {
        private final String normalizedEncoding;
        private final Integer defaultSourceSampleRate;

        private EncodingNormalizationResult(
                String normalizedEncoding, Integer defaultSourceSampleRate) {
            this.normalizedEncoding = normalizedEncoding;
            this.defaultSourceSampleRate = defaultSourceSampleRate;
        }
    }

    public static enum Status {
        CONNECTED, // When the connection is active
        CONNECTING, // When the connection is being initiated
        DISCONNECTED, // Connection closed by client/server
        ERROR // Something went wrong while connecting
    }
}
