/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.realtimespeech;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.oracle.bmc.aispeech.model.CustomizationInference;
import com.oracle.bmc.aispeech.model.RealtimeParameters;
import com.oracle.bmc.auth.BasicAuthenticationDetailsProvider;
import com.oracle.bmc.http.signing.RequestSigner;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.client.ClientUpgradeRequest;
import org.eclipse.jetty.websocket.client.WebSocketClient;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class RealtimeSpeechClientTest {

    @Mock WebSocketClient mockWebsocketClient;

    @Mock RealtimeSpeechClientListener mockListener;

    @Mock BasicAuthenticationDetailsProvider authenticationDetailsProvider;

    RealtimeSpeechClient realtimeSpeechClient;

    final String compartmentId = "COMPARTMENT_ID";

    @Mock Session mockSession;

    @Mock RequestSigner mockRequestSigner;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        this.realtimeSpeechClient =
                new RealtimeSpeechClient(
                        mockListener,
                        authenticationDetailsProvider,
                        compartmentId,
                        mockWebsocketClient);
    }

    @Test
    public void testOnClose() {
        this.realtimeSpeechClient.onClose(1008, "Policy Violation");

        Assert.assertEquals(false, realtimeSpeechClient.isConnected());
        Assert.assertEquals(
                RealtimeSpeechClient.Status.DISCONNECTED, realtimeSpeechClient.getStatus());
        Mockito.verify(mockListener, Mockito.times(1)).onClose(eq(1008), eq("Policy Violation"));
    }

    @Test
    public void testOnError() {
        Throwable throwable = new ConnectException("Test Error Message");
        this.realtimeSpeechClient.onError(throwable);

        Assert.assertEquals(false, realtimeSpeechClient.isConnected());
        Assert.assertEquals(RealtimeSpeechClient.Status.ERROR, realtimeSpeechClient.getStatus());
        Mockito.verify(mockListener, Mockito.times(1)).onError(eq(throwable));
    }

    @Test
    public void testOnConnectAndClose()
            throws RealtimeSpeechConnectException, ExecutionException, InterruptedException,
                    TimeoutException, IOException {

        RealtimeSpeechClient realtimeSpeechClientSpy = Mockito.spy(realtimeSpeechClient);

        Mockito.doReturn(true).when(mockWebsocketClient).isStarted();

        Future<Session> futureMock = mock(Future.class);
        when(mockWebsocketClient.connect(any(), any(), any())).thenReturn(futureMock);
        // doReturn(mockSession).when(futureMock).get(any(), any());
        realtimeSpeechClientSpy.open(
                "wss://test-endpoint.com", RealtimeParameters.builder().build());

        when(mockSession.getRemoteAddress()).thenReturn(new InetSocketAddress(8000));
        Mockito.doReturn(mockRequestSigner)
                .when(realtimeSpeechClientSpy)
                .getRequestSignerFromAuthenticationDetailsProvider(
                        eq(authenticationDetailsProvider));

        final Map<String, String> newHeaders = new HashMap<>();
        newHeaders.put("testKey", "testValue");

        ArgumentCaptor<String> stringArgumentCaptor = ArgumentCaptor.forClass(String.class);
        Mockito.doNothing()
                .when(realtimeSpeechClientSpy)
                .sendMessage(stringArgumentCaptor.capture());
        when(mockRequestSigner.signRequest(any(), eq("GET"), any(), any())).thenReturn(newHeaders);

        realtimeSpeechClientSpy.onConnect(mockSession);

        Mockito.verify(mockRequestSigner)
                .signRequest(
                        eq(URI.create("wss://test-endpoint.com/ws/transcribe/stream")),
                        eq("GET"),
                        any(),
                        eq(null));
        Assert.assertEquals(
                RealtimeSpeechClient.Status.CONNECTED, realtimeSpeechClientSpy.getStatus());

        Mockito.verify(mockListener, times(1)).onConnect();

        String credentialString =
                "{\"authenticationType\":\"CREDENTIALS\",\"compartmentId\":\"COMPARTMENT_ID\",\"headers\":{\"testKey\":\"testValue\",\"uri\":\"wss://test-endpoint.com/ws/transcribe/stream\"}}";
        Assert.assertEquals(credentialString, stringArgumentCaptor.getValue());

        // Test onClose along with this
        realtimeSpeechClientSpy.close();
        Mockito.verify(mockSession, times(1)).close(eq(1000), eq("Session Closed by Client"));
    }

    @Test
    public void testOnMessage() throws JsonProcessingException {
        String testMessageBoilerPlate =
                "{\n" + "    \"sessionId\": \"testSessionId\",\n" + "    \"event\": \"%s\"\n" + "}";

        final String resultMessage = String.format(testMessageBoilerPlate, "RESULT");
        realtimeSpeechClient.onMessage(resultMessage);
        Mockito.verify(mockListener, times(1)).onResult(any());

        final String ackAudioMessage = String.format(testMessageBoilerPlate, "ACKAUDIO");
        realtimeSpeechClient.onMessage(ackAudioMessage);
        Mockito.verify(mockListener, times(1)).onAckMessage(any());

        final String connectMessage = String.format(testMessageBoilerPlate, "CONNECT");
        realtimeSpeechClient.onMessage(connectMessage);
        Mockito.verify(mockListener, times(1)).onConnectMessage(any());

        final String errorMessage = String.format(testMessageBoilerPlate, "ERROR");
        realtimeSpeechClient.onMessage(errorMessage);
        Mockito.verify(mockListener, times(1)).onError(any());
    }

    @Test
    public void testOpen()
            throws IOException, RealtimeSpeechConnectException, ExecutionException,
                    InterruptedException, TimeoutException {
        RealtimeSpeechClient realtimeSpeechClientSpy = Mockito.spy(realtimeSpeechClient);

        Mockito.doReturn(true).when(mockWebsocketClient).isStarted();

        Future<Session> futureMock = mock(Future.class);
        when(mockWebsocketClient.connect(any(), any(), any())).thenReturn(futureMock);
        doReturn(mockSession).when(futureMock).get(eq(10), eq(TimeUnit.SECONDS));

        CustomizationInference cm1 =
                CustomizationInference.builder()
                        .customizationId("testCustomizationId")
                        .compartmentId("testCompartmentId")
                        .build();

        final RealtimeParameters realtimeParameters =
                RealtimeParameters.builder()
                        .isAckEnabled(true)
                        .encoding("audio/raw;rate=16000")
                        .stabilizePartialResults(RealtimeParameters.StabilizePartialResults.None)
                        .shouldIgnoreInvalidCustomizations(false)
                        .partialSilenceThresholdInMs(501)
                        .finalSilenceThresholdInMs(2005)
                        .languageCode("en-US")
                        .modelDomain(RealtimeParameters.ModelDomain.Generic)
                        .punctuation(RealtimeParameters.Punctuation.None)
                        .customizations(Arrays.asList(cm1))
                        .build();

        realtimeSpeechClient.open("wss://test-endpoint.com", realtimeParameters);

        ArgumentCaptor<URI> uriArgumentCaptor = ArgumentCaptor.forClass(URI.class);
        ArgumentCaptor<ClientUpgradeRequest> upgradeRequestArgCaptor =
                ArgumentCaptor.forClass(ClientUpgradeRequest.class);
        Mockito.verify(mockWebsocketClient, times(1))
                .connect(any(), uriArgumentCaptor.capture(), upgradeRequestArgCaptor.capture());

        final String expectedURIString =
                "wss://test-endpoint.com/ws/transcribe/stream?isAckEnabled=true&encoding=audio%2Fraw%3Brate%3D16000&shouldIgnoreInvalidCustomizations=false"
                        + "&partialSilenceThresholdInMs=501&finalSilenceThresholdInMs=2005&stabilizePartialResults=NONE&languageCode=en-US&modelDomain=GENERIC"
                        + "&customizations=%5B%7B%22customizationId%22%3A%22testCustomizationId%22%2C%22customizationAlias%22%3Anull%2C%22"
                        + "compartmentId%22%3A%22testCompartmentId%22%2C%22entities%22%3Anull%7D%5D";

        Assert.assertEquals(expectedURIString, uriArgumentCaptor.getValue().toString());
    }

    @Test
    public void testOpenPunctuationAuto()
            throws IOException, RealtimeSpeechConnectException, ExecutionException,
                    InterruptedException, TimeoutException {
        RealtimeSpeechClient realtimeSpeechClientSpy = Mockito.spy(realtimeSpeechClient);

        Mockito.doReturn(true).when(mockWebsocketClient).isStarted();

        Future<Session> futureMock = mock(Future.class);
        when(mockWebsocketClient.connect(any(), any(), any())).thenReturn(futureMock);
        doReturn(mockSession).when(futureMock).get(eq(10), eq(TimeUnit.SECONDS));

        CustomizationInference cm1 =
                CustomizationInference.builder()
                        .customizationId("testCustomizationId")
                        .compartmentId("testCompartmentId")
                        .build();

        final RealtimeParameters realtimeParameters =
                RealtimeParameters.builder()
                        .isAckEnabled(true)
                        .encoding("audio/raw;rate=16000")
                        .stabilizePartialResults(RealtimeParameters.StabilizePartialResults.None)
                        .shouldIgnoreInvalidCustomizations(false)
                        .partialSilenceThresholdInMs(501)
                        .finalSilenceThresholdInMs(2005)
                        .languageCode("en-US")
                        .modelDomain(RealtimeParameters.ModelDomain.Generic)
                        .punctuation(RealtimeParameters.Punctuation.Auto)
                        .customizations(Arrays.asList(cm1))
                        .build();

        realtimeSpeechClient.open("wss://test-endpoint.com", realtimeParameters);

        ArgumentCaptor<URI> uriArgumentCaptor = ArgumentCaptor.forClass(URI.class);
        ArgumentCaptor<ClientUpgradeRequest> upgradeRequestArgCaptor =
                ArgumentCaptor.forClass(ClientUpgradeRequest.class);
        Mockito.verify(mockWebsocketClient, times(1))
                .connect(any(), uriArgumentCaptor.capture(), upgradeRequestArgCaptor.capture());

        final String expectedURIString =
                "wss://test-endpoint.com/ws/transcribe/stream?isAckEnabled=true&encoding=audio%2Fraw%3Brate%3D16000&shouldIgnoreInvalidCustomizations=false"
                        + "&partialSilenceThresholdInMs=501&finalSilenceThresholdInMs=2005&stabilizePartialResults=NONE&languageCode=en-US&modelDomain=GENERIC"
                        + "&punctuation=AUTO"
                        + "&customizations=%5B%7B%22customizationId%22%3A%22testCustomizationId%22%2C%22customizationAlias%22%3Anull%2C%22"
                        + "compartmentId%22%3A%22testCompartmentId%22%2C%22entities%22%3Anull%7D%5D";

        Assert.assertEquals(expectedURIString, uriArgumentCaptor.getValue().toString());
    }

    @Test
    public void testSpoken()
            throws IOException, RealtimeSpeechConnectException, ExecutionException,
                    InterruptedException, TimeoutException {
        RealtimeSpeechClient realtimeSpeechClientSpy = Mockito.spy(realtimeSpeechClient);

        Mockito.doReturn(true).when(mockWebsocketClient).isStarted();

        Future<Session> futureMock = mock(Future.class);
        when(mockWebsocketClient.connect(any(), any(), any())).thenReturn(futureMock);
        doReturn(mockSession).when(futureMock).get(eq(10), eq(TimeUnit.SECONDS));

        CustomizationInference cm1 =
                CustomizationInference.builder()
                        .customizationId("testCustomizationId")
                        .compartmentId("testCompartmentId")
                        .build();

        final RealtimeParameters realtimeParameters =
                RealtimeParameters.builder()
                        .isAckEnabled(true)
                        .encoding("audio/raw;rate=16000")
                        .stabilizePartialResults(RealtimeParameters.StabilizePartialResults.None)
                        .shouldIgnoreInvalidCustomizations(false)
                        .partialSilenceThresholdInMs(501)
                        .finalSilenceThresholdInMs(2005)
                        .languageCode("en-US")
                        .modelDomain(RealtimeParameters.ModelDomain.Generic)
                        .punctuation(RealtimeParameters.Punctuation.Spoken)
                        .customizations(Arrays.asList(cm1))
                        .build();

        realtimeSpeechClient.open("wss://test-endpoint.com", realtimeParameters);

        ArgumentCaptor<URI> uriArgumentCaptor = ArgumentCaptor.forClass(URI.class);
        ArgumentCaptor<ClientUpgradeRequest> upgradeRequestArgCaptor =
                ArgumentCaptor.forClass(ClientUpgradeRequest.class);
        Mockito.verify(mockWebsocketClient, times(1))
                .connect(any(), uriArgumentCaptor.capture(), upgradeRequestArgCaptor.capture());

        final String expectedURIString =
                "wss://test-endpoint.com/ws/transcribe/stream?isAckEnabled=true&encoding=audio%2Fraw%3Brate%3D16000&shouldIgnoreInvalidCustomizations=false"
                        + "&partialSilenceThresholdInMs=501&finalSilenceThresholdInMs=2005&stabilizePartialResults=NONE&languageCode=en-US&modelDomain=GENERIC"
                        + "&punctuation=SPOKEN"
                        + "&customizations=%5B%7B%22customizationId%22%3A%22testCustomizationId%22%2C%22customizationAlias%22%3Anull%2C%22"
                        + "compartmentId%22%3A%22testCompartmentId%22%2C%22entities%22%3Anull%7D%5D";

        Assert.assertEquals(expectedURIString, uriArgumentCaptor.getValue().toString());
    }

    @Test
    public void testModelTypeOracle()
            throws IOException, RealtimeSpeechConnectException, ExecutionException,
                    InterruptedException, TimeoutException {
        RealtimeSpeechClient realtimeSpeechClientSpy = Mockito.spy(realtimeSpeechClient);

        Mockito.doReturn(true).when(mockWebsocketClient).isStarted();

        Future<Session> futureMock = mock(Future.class);
        when(mockWebsocketClient.connect(any(), any(), any())).thenReturn(futureMock);
        doReturn(mockSession).when(futureMock).get(eq(10), eq(TimeUnit.SECONDS));

        CustomizationInference cm1 =
                CustomizationInference.builder()
                        .customizationId("testCustomizationId")
                        .compartmentId("testCompartmentId")
                        .build();

        final RealtimeParameters realtimeParameters =
                RealtimeParameters.builder()
                        .isAckEnabled(true)
                        .encoding("audio/raw;rate=16000")
                        .stabilizePartialResults(RealtimeParameters.StabilizePartialResults.None)
                        .shouldIgnoreInvalidCustomizations(false)
                        .partialSilenceThresholdInMs(501)
                        .finalSilenceThresholdInMs(2005)
                        .languageCode("en-US")
                        .modelDomain(RealtimeParameters.ModelDomain.Generic)
                        .modelType("ORACLE")
                        .punctuation(RealtimeParameters.Punctuation.Spoken)
                        .customizations(Arrays.asList(cm1))
                        .build();

        realtimeSpeechClient.open("wss://test-endpoint.com", realtimeParameters);

        ArgumentCaptor<URI> uriArgumentCaptor = ArgumentCaptor.forClass(URI.class);
        ArgumentCaptor<ClientUpgradeRequest> upgradeRequestArgCaptor =
                ArgumentCaptor.forClass(ClientUpgradeRequest.class);
        Mockito.verify(mockWebsocketClient, times(1))
                .connect(any(), uriArgumentCaptor.capture(), upgradeRequestArgCaptor.capture());

        final String expectedURIString =
                "wss://test-endpoint.com/ws/transcribe/stream?isAckEnabled=true&encoding=audio%2Fraw%3Brate%3D16000&shouldIgnoreInvalidCustomizations=false"
                        + "&partialSilenceThresholdInMs=501&finalSilenceThresholdInMs=2005&stabilizePartialResults=NONE&languageCode=en-US&modelDomain=GENERIC"
                        + "&punctuation=SPOKEN"
                        + "&customizations=%5B%7B%22customizationId%22%3A%22testCustomizationId%22%2C%22customizationAlias%22%3Anull%2C%22"
                        + "compartmentId%22%3A%22testCompartmentId%22%2C%22entities%22%3Anull%7D%5D";

        Assert.assertEquals(expectedURIString, uriArgumentCaptor.getValue().toString());
    }

    @Test
    public void testModelTypeWhisper()
            throws IOException, RealtimeSpeechConnectException, ExecutionException,
                    InterruptedException, TimeoutException {
        RealtimeSpeechClient realtimeSpeechClientSpy = Mockito.spy(realtimeSpeechClient);

        Mockito.doReturn(true).when(mockWebsocketClient).isStarted();

        Future<Session> futureMock = mock(Future.class);
        when(mockWebsocketClient.connect(any(), any(), any())).thenReturn(futureMock);
        doReturn(mockSession).when(futureMock).get(eq(10), eq(TimeUnit.SECONDS));

        CustomizationInference cm1 =
                CustomizationInference.builder()
                        .customizationId("testCustomizationId")
                        .compartmentId("testCompartmentId")
                        .build();

        final RealtimeParameters realtimeParameters =
                RealtimeParameters.builder()
                        .isAckEnabled(true)
                        .encoding("audio/raw;rate=16000")
                        .languageCode("en")
                        .modelDomain(RealtimeParameters.ModelDomain.Generic)
                        .modelType("WHISPER")
                        .punctuation(RealtimeParameters.Punctuation.Auto)
                        .build();

        realtimeSpeechClient.open("wss://test-endpoint.com", realtimeParameters);

        ArgumentCaptor<URI> uriArgumentCaptor = ArgumentCaptor.forClass(URI.class);
        ArgumentCaptor<ClientUpgradeRequest> upgradeRequestArgCaptor =
                ArgumentCaptor.forClass(ClientUpgradeRequest.class);
        Mockito.verify(mockWebsocketClient, times(1))
                .connect(any(), uriArgumentCaptor.capture(), upgradeRequestArgCaptor.capture());

        final String expectedURIString =
                "wss://test-endpoint.com/ws/transcribe/stream?isAckEnabled=true&encoding=audio%2Fraw%3Brate%3D16000"
                        + "&languageCode=en&modelDomain=GENERIC&modelType=WHISPER&punctuation=AUTO";

        Assert.assertEquals(expectedURIString, uriArgumentCaptor.getValue().toString());
    }

    @Test
    public void testOnOpenWithSingleParameters()
            throws IOException, RealtimeSpeechConnectException, InvocationTargetException,
                    NoSuchMethodException, IllegalAccessException, ExecutionException,
                    InterruptedException, TimeoutException {

        runSingleTest("isAckEnabled", true, "?isAckEnabled=true");
        runSingleTest("encoding", "audio/raw;rate=16000", "?encoding=audio%2Fraw%3Brate%3D16000");
        runSingleTest(
                "stabilizePartialResults",
                RealtimeParameters.StabilizePartialResults.None,
                "?stabilizePartialResults=NONE");
        runSingleTest(
                "shouldIgnoreInvalidCustomizations",
                false,
                "?shouldIgnoreInvalidCustomizations=false");
        runSingleTest("partialSilenceThresholdInMs", 501, "?partialSilenceThresholdInMs=501");
        runSingleTest("finalSilenceThresholdInMs", 2005, "?finalSilenceThresholdInMs=2005");
        runSingleTest("languageCode", "en-US", "?languageCode=en-US");
        runSingleTest(
                "modelDomain", RealtimeParameters.ModelDomain.Generic, "?modelDomain=GENERIC");
        runSingleTest("punctuation", RealtimeParameters.Punctuation.None, "");
        runSingleTest("punctuation", RealtimeParameters.Punctuation.Auto, "?punctuation=AUTO");
        runSingleTest("modelType", "ORACLE", "");
        runSingleTest("modelType", "WHISPER", "?modelType=WHISPER");
    }

    private void runSingleTest(String paramName, Object paramValue, String queryParamValue)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException,
                    IOException, RealtimeSpeechConnectException, ExecutionException,
                    InterruptedException, TimeoutException {
        Mockito.reset(mockWebsocketClient);
        Mockito.reset(mockSession);

        RealtimeSpeechClient realtimeSpeechClientSpy = Mockito.spy(realtimeSpeechClient);

        Mockito.doReturn(true).when(mockWebsocketClient).isStarted();

        Future<Session> futureMock = mock(Future.class);
        when(mockWebsocketClient.connect(any(), any(), any())).thenReturn(futureMock);
        doReturn(mockSession).when(futureMock).get(eq(10), eq(TimeUnit.SECONDS));

        RealtimeParameters.Builder builder = RealtimeParameters.builder();

        // Use reflection to call the setter dynamically
        Method method =
                RealtimeParameters.Builder.class.getMethod(paramName, paramValue.getClass());
        method.invoke(builder, paramValue);

        // Build the parameters object
        RealtimeParameters realtimeParameters = builder.build();

        realtimeSpeechClient.open("wss://test-endpoint.com", realtimeParameters);

        ArgumentCaptor<URI> uriArgumentCaptor = ArgumentCaptor.forClass(URI.class);
        ArgumentCaptor<ClientUpgradeRequest> upgradeRequestArgCaptor =
                ArgumentCaptor.forClass(ClientUpgradeRequest.class);
        Mockito.verify(mockWebsocketClient, times(1))
                .connect(any(), uriArgumentCaptor.capture(), upgradeRequestArgCaptor.capture());

        final String expectedURIString =
                "wss://test-endpoint.com/ws/transcribe/stream" + queryParamValue;

        Assert.assertEquals(expectedURIString, uriArgumentCaptor.getValue().toString());
    }
}
