/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.aispeech.model.RealtimeMessageAckAudio;
import com.oracle.bmc.aispeech.model.RealtimeMessageConnect;
import com.oracle.bmc.aispeech.model.RealtimeMessageResult;
import com.oracle.bmc.aispeech.model.RealtimeParameters;
import com.oracle.bmc.aispeech.realtimespeech.AudioChunkProcessingDetails;
import com.oracle.bmc.aispeech.realtimespeech.RealtimeSpeechClient;
import com.oracle.bmc.aispeech.realtimespeech.RealtimeSpeechClientListener;
import com.oracle.bmc.aispeech.realtimespeech.RealtimeSpeechConnectException;
import com.oracle.bmc.auth.SessionTokenAuthenticationDetailsProvider;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import org.eclipse.jetty.websocket.client.WebSocketClient;

/**
 * Example realtime speech client that streams microphone audio or WAV audio and lets the Java SDK
 * resample supported PCM inputs to a service-supported sample rate.
 */
public class RealtimeSpeechResamplingExampleClient implements RealtimeSpeechClientListener {

    private static final String DEFAULT_REALTIME_SPEECH_ENDPOINT = "<endpoint>";
    private static final String DEFAULT_COMPARTMENT = "<compartmentId>";
    private static final String LANGUAGE_CODE = "en-US";
    private static final RealtimeParameters.ModelDomain MODEL_DOMAIN =
            RealtimeParameters.ModelDomain.Generic;
    private static final String MODEL_TYPE = "ORACLE";
    private static final RealtimeParameters.Punctuation PUNCTUATION =
            RealtimeParameters.Punctuation.None;

    private static final float AUDIO_SAMPLE_RATE = 48_000.0f;
    private static final int AUDIO_SAMPLE_SIZE = 16;
    private static final int AUDIO_NUM_CHANNELS = 1;
    private static final boolean AUDIO_SIGNED = true;
    private static final boolean AUDIO_BIG_ENDIAN = false;

    private RealtimeSpeechClient realtimeClient;

    private final String endpoint;
    private final String compartmentId;
    private final String wavFile;
    private String encoding = "audio/raw;rate=48000";

    RealtimeSpeechResamplingExampleClient(String endpoint, String compartmentId, String wavFile) {
        this.endpoint = endpoint;
        this.compartmentId = compartmentId;
        this.wavFile = wavFile;
    }

    /**
     * Runs the realtime speech resampling example.
     *
     * @param args optional endpoint, compartment ID, and WAV file path
     * @throws IOException if the OCI configuration file cannot be read
     */
    public static void main(String[] args) throws IOException {
        try {
            final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

            String endpoint = DEFAULT_REALTIME_SPEECH_ENDPOINT;
            String compartmentId = DEFAULT_COMPARTMENT;
            String wavFile = null;

            if (args.length >= 1) {
                endpoint = args[0];
            }

            if (args.length >= 2) {
                compartmentId = args[1];
            }

            if (args.length >= 3) {
                wavFile = args[2];
            }

            WebSocketClient client = new WebSocketClient();
            client.start();

            startSession(
                    new RealtimeSpeechResamplingExampleClient(endpoint, compartmentId, wavFile),
                    configFile,
                    client);
        } catch (IOException e) {
            System.out.println("Realtime Client: Unable to connect!");
        } catch (RealtimeSpeechConnectException e) {
            System.out.println("Unable to connect to the realtime service " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }

    private void playMicrophone() {
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
            final int bufferDuration = 96;
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

    private void prepareWavEncoding() throws IOException, UnsupportedAudioFileException {
        if (wavFile == null) {
            return;
        }

        try (AudioInputStream audioInputStream =
                AudioSystem.getAudioInputStream(new File(wavFile))) {
            final AudioFormat audioFormat = audioInputStream.getFormat();
            encoding = "audio/raw;rate=" + Math.round(audioFormat.getSampleRate());
            System.out.println(
                    "Detected WAV format: "
                            + audioFormat.getSampleRate()
                            + " Hz, "
                            + audioFormat.getSampleSizeInBits()
                            + " bit, "
                            + audioFormat.getChannels()
                            + " channel(s)");
        }
    }

    private void playWav() {
        try (AudioInputStream audioInputStream =
                AudioSystem.getAudioInputStream(new File(wavFile))) {
            final int bufferDuration = 96;
            final int bufferSize =
                    ((int) audioInputStream.getFormat().getFrameRate()
                                    * audioInputStream.getFormat().getFrameSize()
                                    * bufferDuration)
                            / 1000;
            workLoop(audioInputStream, bufferDuration, bufferSize);
            realtimeClient.requestFinalResult();
            Thread.sleep(1000);
        } catch (UnsupportedAudioFileException e) {
            System.out.println("UnsupportedAudioFileException " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("InterruptedException {}" + e.getMessage());
            Thread.currentThread().interrupt();
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
            System.out.println("Simulate start");
            while (res >= zeroLength) {
                res = ais.read(audioBytes);
                if (res > zeroLength) {
                    realtimeClient.sendAudioData(Arrays.copyOf(audioBytes, res));
                    if (simulateRealtimeMs > 0) {
                        Thread.sleep(simulateRealtimeMs);
                    }
                }
            }
            System.out.println("Simulate end");
        } catch (InterruptedException e) {
            System.out.println("InterruptedException {}" + e.getMessage());
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            System.out.println(
                    "Realtime Client: Unable to read audio from microphone or send it for transcription!");
        }
    }

    /** {@inheritDoc} */
    @Override
    public void onClose(int statusCode, String statusMessage) {
        System.out.println("onNetworkEvent");
    }

    /** {@inheritDoc} */
    @Override
    public void onAckMessage(RealtimeMessageAckAudio ackMessage) {
        System.out.println("Ack Message : {}" + ackMessage);
    }

    /** {@inheritDoc} */
    @Override
    public void onResult(RealtimeMessageResult result) {
        if (result.getTranscriptions().size() > 0) {
            System.out.println(
                    (result.getTranscriptions().get(0).getIsFinal()
                                    ? "Final Result  : "
                                    : "Partial Result: ")
                            + result.getTranscriptions().get(0).getTranscription().trim());
        } else {
            System.out.println("Result Error : " + result);
        }
    }

    /** {@inheritDoc} */
    @Override
    public void onError(Throwable error) {
        System.out.println("Error" + error);
        error.printStackTrace();
    }

    /** {@inheritDoc} */
    @Override
    public void onConnect() {
        System.out.println("Connected");
    }

    /** {@inheritDoc} */
    @Override
    public void onConnectMessage(RealtimeMessageConnect realtimeConnectMessage) {
        System.out.println(
                "Received Connect message for session id: "
                        + realtimeConnectMessage.getSessionId());
    }

    /** {@inheritDoc} */
    @Override
    public void onAudioChunkProcessed(AudioChunkProcessingDetails processingDetails) {
        if (processingDetails.getResampled()) {
            System.out.println(
                    "Resampled audio chunk from "
                            + processingDetails.getSourceSampleRate()
                            + " Hz to "
                            + processingDetails.getTargetSampleRate()
                            + " Hz in "
                            + processingDetails.getResamplingMillis()
                            + " ms");
        }
    }

    /**
     * Opens a realtime speech session and streams either the configured WAV file or microphone
     * audio.
     *
     * @param realtimeTestClient the example client instance
     * @param configFile the OCI SDK configuration file
     * @param client the websocket client used for the realtime speech connection
     */
    public static void startSession(
            RealtimeSpeechResamplingExampleClient realtimeTestClient,
            ConfigFileReader.ConfigFile configFile,
            WebSocketClient client) {
        try {
            realtimeTestClient.prepareWavEncoding();

            realtimeTestClient.realtimeClient =
                    RealtimeSpeechClient.builder()
                            .listener(realtimeTestClient)
                            .authenticationDetailsProvider(
                                    new SessionTokenAuthenticationDetailsProvider(configFile))
                            .compartmentId(realtimeTestClient.compartmentId)
                            .webSocketClient(client)
                            .build();

            final RealtimeParameters realtimeClientParameters =
                    RealtimeParameters.builder()
                            .isAckEnabled(false)
                            .languageCode(LANGUAGE_CODE)
                            .modelDomain(MODEL_DOMAIN)
                            .modelType(MODEL_TYPE)
                            .punctuation(PUNCTUATION)
                            .encoding(realtimeTestClient.encoding)
                            .build();

            realtimeTestClient.realtimeClient.open(
                    realtimeTestClient.endpoint, realtimeClientParameters);
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio file: " + e.getMessage());
            return;
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
            Thread.currentThread().interrupt();
            return;
        }

        if (realtimeTestClient.wavFile != null) {
            realtimeTestClient.playWav();
        } else {
            realtimeTestClient.playMicrophone();
        }
        realtimeTestClient.realtimeClient.close();
    }
}
