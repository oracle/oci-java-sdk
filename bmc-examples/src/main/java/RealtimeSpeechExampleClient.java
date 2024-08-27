/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.aispeech.model.CustomizationInference;
import com.oracle.bmc.aispeech.model.RealtimeMessageAckAudio;
import com.oracle.bmc.aispeech.model.RealtimeMessageConnect;
import com.oracle.bmc.aispeech.model.RealtimeMessageResult;
import com.oracle.bmc.aispeech.model.RealtimeParameters;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import org.eclipse.jetty.websocket.client.WebSocketClient;
import com.oracle.bmc.aispeech.realtimespeech.RealtimeSpeechClient;

import com.oracle.bmc.aispeech.realtimespeech.RealtimeSpeechClientListener;
import com.oracle.bmc.aispeech.realtimespeech.RealtimeSpeechConnectException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class RealtimeSpeechExampleClient implements RealtimeSpeechClientListener {

    private static final String DEFAULT_REALTIME_SPEECH_ENDPOINT = "<endpoint>";
    private static final String DEFAULT_COMPARTMENT = "<compartmentId>";
    private static final String LANGUAGE_CODE = "en-US";
    private static final String MODEL_DOMAIN = "GENERIC";
    private static final String STABILIZE_PARTIAL_RESULTS = "NONE";
    private static final String ENCODING = "audio/raw;rate=16000";
    private static final int PARTIAL_SILENCE_THRESHOLD = 0;
    private static final int FINAL_SILENCE_THRESHOLD = 2000;
    private static final boolean SHOULD_IGNORE_CUSTOMIZATION_LOAD_ERRORS = false;

    // Settings to be sent to the microphone work loop
    private static final float AUDIO_SAMPLE_RATE = 16_000.0f;
    private static final int AUDIO_SAMPLE_SIZE = 16;
    private static final int AUDIO_NUM_CHANNELS = 1;
    private static final boolean AUDIO_SIGNED = true;
    private static final boolean AUDIO_BIG_ENDIAN = false;

    private RealtimeSpeechClient realtimeClient;

    String endpoint;
    String compartmentId;

    RealtimeSpeechExampleClient(String endpoint, String compartmentId) {
        this.endpoint = endpoint;
        this.compartmentId = compartmentId;
    }

    public static void main(String[] args) throws IOException {
        try {
            final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();
            // Can include profile here if needed.
            // final ConfigFileReader.ConfigFile configFile =
            // ConfigFileReader.parse("~/.oci/config", "US-PHOENIX-1");

            String endpoint = DEFAULT_REALTIME_SPEECH_ENDPOINT;
            String compartmentId = DEFAULT_COMPARTMENT;

            // You can specify endpoint and compartment ID in the CLI args
            if (args.length >= 1) {
                endpoint = args[0];
            }

            if (args.length == 2) {
                compartmentId = args[1];
            }

            WebSocketClient client = new WebSocketClient();
            client.start();

            startSession(
                    new RealtimeSpeechExampleClient(endpoint, compartmentId), configFile, client);

        } catch (IOException e) {
            System.out.println("Realtime Client: Unable to connect!");
        } catch (RealtimeSpeechConnectException e) {
            System.out.println("Unable to connect to the realtime service " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
        }
        return;
    }

    private void playMicrophone() {
        // open mic and start the work loop
        final AudioFormat format =
                new AudioFormat(
                        AUDIO_SAMPLE_RATE,
                        AUDIO_SAMPLE_SIZE,
                        AUDIO_NUM_CHANNELS,
                        AUDIO_SIGNED,
                        AUDIO_BIG_ENDIAN);
        final DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

        try (TargetDataLine microphone = (TargetDataLine) AudioSystem.getLine(info)) {
            microphone.open(format);
            microphone.start();
            final AudioInputStream ais = new AudioInputStream(microphone);
            final int bufferDuration = 96; // 96 ms
            final int bufferSize =
                    ((int) ais.getFormat().getFrameRate()
                                    * ais.getFormat().getFrameSize()
                                    * bufferDuration)
                            / 1000;

            workLoop(ais, bufferDuration, bufferSize);
        } catch (LineUnavailableException e) {
            System.out.println("Realtime Client: Unable to get microphone");
        } catch (RealtimeSpeechConnectException e) {
            System.out.println("Realtime Client: Connection is closed");
        }
    }

    private void workLoop(InputStream inputStream, int simulateRealtimeMs, int bufferSize)
            throws RealtimeSpeechConnectException {
        int res = 0;
        final int zeroLength = 0;

        final byte[] audioBytes = new byte[bufferSize];

        try (InputStream ais = inputStream) {
            int totalBufferSize = 0;
            long start = System.currentTimeMillis();
            System.out.println("Simulate start");
            while (res >= zeroLength) {
                res = ais.read(audioBytes);
                if (res > zeroLength) {
                    realtimeClient.sendAudioData(audioBytes);
                    // System.out.println("Simulate data {} {} {}", res, audioBytes.length,
                    // totalBufferSize);
                    totalBufferSize += audioBytes.length;
                    if (simulateRealtimeMs > 0) {
                        try {
                            Thread.sleep(simulateRealtimeMs);
                        } catch (InterruptedException e) {
                            System.out.println("InterruptedException {}" + e.getMessage());
                        }
                    }
                }
            }
            System.out.println("Simulate end : {}" + (System.currentTimeMillis() - start));
        } catch (IOException e) {
            System.out.println(
                    "Realtime Client: Unable to read audio from microphone or send it for transcription!");
        }
    }

    @Override
    public void onClose(int statusCode, String statusMessage) {
        System.out.println("onNetworkEvent");
    }

    @Override
    public void onAckMessage(RealtimeMessageAckAudio ackMessage) {
        System.out.println("Ack Message : {}" + ackMessage.toString());
    }

    @Override
    public void onResult(RealtimeMessageResult result) {
        if (result.getTranscriptions().size() > 0) {
            if (result.getTranscriptions().get(0).getIsFinal()) {
                System.out.println(
                        "Final Result  : "
                                + result.getTranscriptions()
                                        .get(0)
                                        .getTranscription()
                                        .trim()); // TODO remove trim
            } else {
                System.out.println(
                        "Partial Result: "
                                + result.getTranscriptions()
                                        .get(0)
                                        .getTranscription()
                                        .trim()); // TODO remove trim
            }
        } else {
            System.out.println("Result Error : " + result);
        }
    }

    @Override
    public void onError(Throwable error) {
        System.out.println("Error" + error.toString()); // TODO
        error.printStackTrace();
    }

    @Override
    public void onConnect() {
        System.out.println("Connected");
    }

    @Override
    public void onConnectMessage(RealtimeMessageConnect realtimeConnectMessage) {
        System.out.println(
                "Received Connect message for session id: "
                        + realtimeConnectMessage.getSessionId());
    }

    public static void startSession(
            RealtimeSpeechExampleClient realtimeTestClient,
            ConfigFileReader.ConfigFile configFile,
            WebSocketClient client) {
        try {
            // All these parameters are mandatory, otherwise you may see an IllegalStateException
            realtimeTestClient.realtimeClient =
                    RealtimeSpeechClient.builder()
                            .listener(realtimeTestClient)
                            .authenticationDetailsProvider(
                                    new SessionTokenAuthenticationDetailsProvider(configFile))
                            // for API keys use
                            // new ConfigFileAuthenticationDetailsProvider(configFile)
                            .compartmentId(realtimeTestClient.compartmentId)
                            .webSocketClient(client)
                            .build();

            // Map<String, String> freeformTags = new HashMap<String, String>();
            // freeformTags.put("sampleTag", "sampleTagValue");

            final CustomizationInference customizationInference =
                    CustomizationInference.builder().customizationId("<customizationId>").build();

            List<CustomizationInference> customizationInferenceList = new ArrayList<>();

            // Can add more if needed
            customizationInferenceList.add(customizationInference);

            final RealtimeParameters realtimeClientParameters =
                    RealtimeParameters.builder()
                            .isAckEnabled(false)
                            .partialSilenceThresholdInMs(PARTIAL_SILENCE_THRESHOLD)
                            .finalSilenceThresholdInMs(FINAL_SILENCE_THRESHOLD)
                            .shouldIgnoreInvalidCustomizations(
                                    SHOULD_IGNORE_CUSTOMIZATION_LOAD_ERRORS)
                            .languageCode(LANGUAGE_CODE) // Could be one
                            .modelDomain(RealtimeParameters.ModelDomain.create(MODEL_DOMAIN))
                            .encoding(ENCODING)
                            .stabilizePartialResults(
                                    RealtimeParameters.StabilizePartialResults.create(
                                            STABILIZE_PARTIAL_RESULTS))
                            // .customizations(customizationInferenceList)
                            .build();

            realtimeTestClient.realtimeClient.open(
                    realtimeTestClient.endpoint, realtimeClientParameters);

        } catch (RealtimeSpeechConnectException e) {
            System.out.println("Could not connect to the realtime service: " + e.getMessage());
            realtimeTestClient.realtimeClient.close();
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
            realtimeTestClient.realtimeClient.close();
        }

        try {
            while (realtimeTestClient.realtimeClient.getStatus()
                    != RealtimeSpeechClient.Status.CONNECTED) {
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Realtime Client: Unable to connect!");
            return;
        }

        // Alternatively, you can supply audio from a given wav file as well.
        realtimeTestClient.playMicrophone();

        // Optionally call the realtimeClient.requestFinalResult() to request the
        // service to generate final result.
        // This is particularly useful if the session needs to be closed but a final
        // result has not been received yet.
        // realtimeTestClient.realtimeClient.requestFinalResult();

        realtimeTestClient.realtimeClient.close();
    }
}
