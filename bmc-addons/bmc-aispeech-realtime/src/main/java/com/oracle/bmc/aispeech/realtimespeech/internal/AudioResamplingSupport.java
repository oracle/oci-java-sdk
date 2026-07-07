/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.realtimespeech.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Internal utilities for normalizing realtime speech PCM audio to sample rates accepted by the
 * service.
 */
public final class AudioResamplingSupport {
    private static final int DEFAULT_SAMPLE_RATE = 16000;
    private static final int DEFAULT_BIT_DEPTH = 16;
    private static final int DEFAULT_CHANNELS = 1;
    private static final int[] SERVICE_SUPPORTED_SAMPLE_RATES = {8000, 16000};
    private static final int[][] NORMALIZATION_CONVERSIONS = {
        {24000, 16000},
        {48000, 16000},
    };

    /*
     * Linear-phase low-pass FIR coefficients used before 3:1 decimation. The same tap set is used
     * for 48 kHz -> 16 kHz direct decimation and for 24 kHz -> 16 kHz after 2x zero-stuffing
     * interpolation. In the interpolation path, the polyphase loop only evaluates taps that
     * contribute to the current output phase and applies the interpolation gain before writing PCM.
     */
    private static final double[] LP_3_TO_1_FIR = {
        -2.5033838264794034e-5,
        -3.6451561137378568e-5,
        -1.1489993827892933e-5,
        3.9324378887465603e-5,
        6.9984193520672766e-5,
        3.7556691270439976e-5,
        -4.7696645534530499e-5,
        -0.00011379935461751734,
        -8.4009576971176187e-5,
        4.2088177776074692e-5,
        0.00016391587447478332,
        0.00015508372993570357,
        -1.253765788919669e-5,
        -0.00021258262011091092,
        -0.00025240598961751948,
        -5.1874329668708116e-5,
        0.00024792300097682143,
        0.00037351534477673157,
        0.00016157590781788105,
        -0.00025410852391986031,
        -0.00051048686533259301,
        -0.00032461046175409392,
        0.00021219136947965464,
        0.00064888778256045612,
        0.00054444169352930365,
        -0.0001016639071691704,
        -0.0007673001147209819,
        -0.00081767209129386914,
        -9.7269698241155101e-5,
        0.00083761858525280384,
        0.0011319450250252222,
        0.00040081933397990521,
        -0.0008262743020160207,
        -0.0014643282305934196,
        -0.00081833650450470333,
        0.00069644717721537768,
        0.0017804679224891051,
        0.0013489288090360295,
        -0.00041122152287042,
        -0.0020347535966250413,
        -0.0019782994815083733,
        -6.2477942460992689e-5,
        0.0021716438099647051,
        0.0026761621389245617,
        0.00074944268608934995,
        -0.0021281777588728801,
        -0.003394541347147186,
        -0.0016615884301227524,
        0.001837545335885159,
        0.0040671707022465458,
        0.0027936171643976352,
        -0.001233420727213658,
        -0.0046100353145374761,
        -0.0041193191532029718,
        0.00025459137646049936,
        0.00492286494534436,
        0.0055888057003698156,
        0.0011507624257558831,
        -0.004891042781491068,
        -0.0071267634777626675,
        -0.0030219790398189408,
        0.0043868863131564196,
        0.008631467181982988,
        0.0053851392366346717,
        -0.0032684060793252661,
        -0.0099736612552352843,
        -0.0082562565027453159,
        0.0013719935383757782,
        0.010993210336541666,
        0.011651337116264694,
        0.0015082475865128093,
        -0.011488721952090169,
        -0.015609515327517686,
        -0.0056715044416709888,
        0.011188303272599716,
        0.020245190585021479,
        0.011637590928971467,
        -0.009667754909210324,
        -0.025878090076785515,
        -0.020500381603699786,
        0.0060989081377006418,
        0.033428666116203716,
        0.035134870175731782,
        0.0017197396227647229,
        -0.046085580848361105,
        -0.066230781503150371,
        -0.023349941728869696,
        0.082922132071591242,
        0.21069217442624302,
        0.29738297113974183,
        0.29738297113974188,
        0.21069217442624305,
        0.082922132071591242,
        -0.023349941728869693,
        -0.066230781503150371,
        -0.046085580848361105,
        0.0017197396227647225,
        0.035134870175731782,
        0.033428666116203716,
        0.0060989081377006409,
        -0.020500381603699783,
        -0.025878090076785508,
        -0.0096677549092103257,
        0.011637590928971469,
        0.020245190585021472,
        0.011188303272599716,
        -0.0056715044416709897,
        -0.015609515327517682,
        -0.011488721952090169,
        0.0015082475865128089,
        0.011651337116264699,
        0.010993210336541666,
        0.0013719935383757782,
        -0.0082562565027453141,
        -0.0099736612552352825,
        -0.0032684060793252657,
        0.0053851392366346699,
        0.008631467181982988,
        0.0043868863131564188,
        -0.0030219790398189413,
        -0.0071267634777626675,
        -0.0048910427814910715,
        0.0011507624257558842,
        0.005588805700369813,
        0.00492286494534436,
        0.00025459137646049936,
        -0.0041193191532029726,
        -0.0046100353145374752,
        -0.0012334207272136583,
        0.0027936171643976361,
        0.0040671707022465458,
        0.0018375453358851592,
        -0.0016615884301227509,
        -0.0033945413471471847,
        -0.0021281777588728797,
        0.00074944268608935049,
        0.0026761621389245612,
        0.0021716438099647056,
        -6.2477942460992527e-5,
        -0.0019782994815083729,
        -0.0020347535966250404,
        -0.00041122152287042,
        0.0013489288090360292,
        0.0017804679224891048,
        0.00069644717721537768,
        -0.00081833650450470257,
        -0.00146432823059342,
        -0.0008262743020160207,
        0.0004008193339799063,
        0.0011319450250252222,
        0.00083761858525280373,
        -9.7269698241154938e-5,
        -0.00081767209129386936,
        -0.00076730011472097832,
        -0.00010166390716916983,
        0.00054444169352930332,
        0.00064888778256045622,
        0.00021219136947965461,
        -0.00032461046175409424,
        -0.00051048686533259301,
        -0.00025410852391986036,
        0.0001615759078178811,
        0.00037351534477673152,
        0.00024792300097682137,
        -5.1874329668708082e-5,
        -0.00025240598961751942,
        -0.00021258262011091095,
        -1.253765788919669e-5,
        0.0001550837299357036,
        0.00016391587447478329,
        4.2088177776074685e-5,
        -8.4009576971176228e-5,
        -0.00011379935461751733,
        -4.7696645534530512e-5,
        3.7556691270440023e-5,
        6.9984193520672793e-5,
        3.9324378887465603e-5,
        -1.1489993827892933e-5,
        -3.6451561137378561e-5,
        -2.503383826479402e-5
    };
    private static final Map<String, SupportedResamplingConversion> SUPPORTED_CONVERSIONS =
            createSupportedConversions();

    private AudioResamplingSupport() {}

    /**
     * Creates a streaming resampler for the source sample rate and requested service encoding.
     *
     * @param sourceSampleRate the sample rate, in hertz, of incoming PCM audio
     * @param audioEncodingSettings the target encoding settings sent to the service
     * @return a stateful streaming resampler
     */
    public static StreamingAudioResampler createStreamingResampler(
            int sourceSampleRate, AudioEncodingSettings audioEncodingSettings) {
        return createStreamingResampler(
                validateResamplingRequest(sourceSampleRate, audioEncodingSettings));
    }

    /**
     * Validates that a streaming resampling request is supported.
     *
     * @param sourceSampleRate the sample rate, in hertz, of incoming PCM audio
     * @param audioEncodingSettings the target encoding settings sent to the service
     */
    public static void validateStreamingRequest(
            int sourceSampleRate, AudioEncodingSettings audioEncodingSettings) {
        validateResamplingRequest(sourceSampleRate, audioEncodingSettings);
    }

    /**
     * Parses a realtime speech encoding string into normalized audio settings.
     *
     * @param encoding the encoding string, for example {@code audio/raw;rate=16000}
     * @return parsed audio encoding settings
     */
    public static AudioEncodingSettings parseEncoding(String encoding) {
        return AudioEncodingSettings.fromEncoding(encoding);
    }

    /**
     * Resolves the service-supported target sample rate for a source sample rate that can be
     * resampled by the SDK.
     *
     * @param sourceSampleRate the sample rate, in hertz, requested by the caller
     * @return the target sample rate when SDK-side normalization is supported
     */
    public static Optional<Integer> resolveServiceTargetSampleRate(int sourceSampleRate) {
        for (int[] conversion : NORMALIZATION_CONVERSIONS) {
            if (conversion[0] == sourceSampleRate) {
                return Optional.of(Integer.valueOf(conversion[1]));
            }
        }
        return Optional.empty();
    }

    /**
     * Checks whether the realtime speech service accepts a sample rate without SDK-side
     * normalization.
     *
     * @param sampleRate the sample rate, in hertz
     * @return {@code true} when the service accepts the sample rate directly
     */
    public static boolean isServiceSupportedSampleRate(int sampleRate) {
        for (int supportedSampleRate : SERVICE_SUPPORTED_SAMPLE_RATES) {
            if (supportedSampleRate == sampleRate) {
                return true;
            }
        }
        return false;
    }

    /**
     * Checks whether an encoding can be normalized by the SDK resampler.
     *
     * @param audioEncodingSettings parsed audio encoding settings
     * @return {@code true} for raw 16-bit mono PCM without a codec
     */
    public static boolean isAutoResamplingCompatible(AudioEncodingSettings audioEncodingSettings) {
        return audioEncodingSettings.getCodec() == null
                && audioEncodingSettings.getBitDepth() == 16
                && audioEncodingSettings.getChannels() == 1;
    }

    /**
     * Rewrites or adds the {@code rate=} segment in a realtime speech encoding string.
     *
     * @param encoding the original encoding string
     * @param targetSampleRate the service-supported target sample rate
     * @return the encoding string with the target sample rate
     */
    public static String rewriteEncodingSampleRate(String encoding, int targetSampleRate) {
        final String normalizedRateSegment = "rate=" + targetSampleRate;
        if (encoding == null || encoding.trim().isEmpty()) {
            return "audio/raw;" + normalizedRateSegment;
        }

        if (encoding.matches(".*(^|;)rate=\\d+.*")) {
            return encoding.replaceFirst("(^|;)rate=\\d+", "$1" + normalizedRateSegment);
        }

        return encoding + ";" + normalizedRateSegment;
    }

    private static StreamingAudioResampler createStreamingResampler(
            SupportedResamplingConversion conversion) {
        return new Pcm16MonoStreamingResampler(conversion);
    }

    private static SupportedResamplingConversion validateResamplingRequest(
            int sourceSampleRate, AudioEncodingSettings audioEncodingSettings) {
        if (sourceSampleRate == audioEncodingSettings.getSampleRate()) {
            return null;
        }

        final SupportedResamplingConversion conversion =
                SUPPORTED_CONVERSIONS.get(
                        key(sourceSampleRate, audioEncodingSettings.getSampleRate()));
        if (conversion == null) {
            throw new IllegalArgumentException(
                    "Resampling is only supported for the following PCM output conversions: "
                            + supportedConversionsDescription()
                            + ". Use 8000 Hz or 16000 Hz audio as-is with matching encoding.");
        }

        if (audioEncodingSettings.getCodec() != null) {
            throw new IllegalArgumentException(
                    "Audio resampling is only supported for raw PCM audio streams without a codec.");
        }

        if (audioEncodingSettings.getBitDepth() != 16) {
            throw new IllegalArgumentException(
                    "Audio resampling currently supports only 16-bit PCM audio.");
        }

        if (audioEncodingSettings.getChannels() != 1) {
            throw new IllegalArgumentException(
                    "Audio resampling currently supports only mono PCM audio.");
        }

        return conversion;
    }

    private static Map<String, SupportedResamplingConversion> createSupportedConversions() {
        final Map<String, SupportedResamplingConversion> conversions = new LinkedHashMap<>();
        registerConversion(
                conversions,
                new SupportedResamplingConversion(
                        24000, 16000, 2, 3, LP_3_TO_1_FIR, "24000 Hz -> 16000 Hz"));
        registerConversion(
                conversions,
                new SupportedResamplingConversion(
                        48000, 16000, 1, 3, LP_3_TO_1_FIR, "48000 Hz -> 16000 Hz"));
        return conversions;
    }

    private static void registerConversion(
            Map<String, SupportedResamplingConversion> conversions,
            SupportedResamplingConversion conversion) {
        conversions.put(key(conversion.sourceSampleRate, conversion.targetSampleRate), conversion);
    }

    private static String supportedConversionsDescription() {
        return SUPPORTED_CONVERSIONS.values().stream()
                .map(conversion -> conversion.description)
                .collect(Collectors.joining(", "));
    }

    private static String key(int sourceSampleRate, int targetSampleRate) {
        return sourceSampleRate + "->" + targetSampleRate;
    }

    /** Parsed audio encoding settings used to validate realtime speech audio streams. */
    public static final class AudioEncodingSettings {
        private final int sampleRate;
        private final String codec;
        private final int bitDepth;
        private final int channels;

        private AudioEncodingSettings(int sampleRate, String codec, int bitDepth, int channels) {
            this.sampleRate = sampleRate;
            this.codec = codec;
            this.bitDepth = bitDepth;
            this.channels = channels;
        }

        /** Returns the default realtime speech PCM encoding settings. */
        public static AudioEncodingSettings defaultSettings() {
            return new AudioEncodingSettings(
                    DEFAULT_SAMPLE_RATE, null, DEFAULT_BIT_DEPTH, DEFAULT_CHANNELS);
        }

        /**
         * Parses a realtime speech encoding string.
         *
         * @param encoding the encoding string to parse
         * @return parsed audio encoding settings
         */
        public static AudioEncodingSettings fromEncoding(String encoding) {
            if (encoding == null || encoding.trim().isEmpty()) {
                return defaultSettings();
            }

            int sampleRate = DEFAULT_SAMPLE_RATE;
            int bitDepth = DEFAULT_BIT_DEPTH;
            int channels = DEFAULT_CHANNELS;
            String codec = null;

            final String[] segments = encoding.split(";");
            for (String segment : segments) {
                final String[] keyValue = segment.split("=", 2);
                if (keyValue.length != 2) {
                    continue;
                }

                final String key = keyValue[0].trim();
                final String value = keyValue[1].trim();

                switch (key) {
                    case "rate":
                        sampleRate = Integer.parseInt(value);
                        break;
                    case "codec":
                        codec = value;
                        break;
                    case "bitDepth":
                        bitDepth = Integer.parseInt(value);
                        break;
                    case "channels":
                        channels = Integer.parseInt(value);
                        break;
                    default:
                        break;
                }
            }

            return new AudioEncodingSettings(sampleRate, codec, bitDepth, channels);
        }

        /** Returns the sample rate, in hertz. */
        public int getSampleRate() {
            return sampleRate;
        }

        /** Returns the codec name, or {@code null} for raw PCM audio. */
        public String getCodec() {
            return codec;
        }

        /** Returns the PCM bit depth. */
        public int getBitDepth() {
            return bitDepth;
        }

        /** Returns the number of PCM audio channels. */
        public int getChannels() {
            return channels;
        }
    }

    /**
     * Stateful resampler for processing realtime audio chunks without dropping boundary samples.
     */
    public interface StreamingAudioResampler {
        /**
         * Resamples an audio chunk.
         *
         * @param audioBytes the PCM audio bytes to resample
         * @return resampled PCM audio bytes
         */
        byte[] process(byte[] audioBytes);

        /**
         * Emits any delayed samples and resets the resampler state.
         *
         * @return remaining resampled PCM audio bytes
         */
        byte[] flush();
    }

    /** Describes one supported source-to-target sample-rate conversion. */
    private static final class SupportedResamplingConversion {
        private final int sourceSampleRate;
        private final int targetSampleRate;
        private final int interpolationFactor;
        private final int decimationFactor;
        private final double[] filter;
        private final String description;

        private SupportedResamplingConversion(
                int sourceSampleRate,
                int targetSampleRate,
                int interpolationFactor,
                int decimationFactor,
                double[] filter,
                String description) {
            this.sourceSampleRate = sourceSampleRate;
            this.targetSampleRate = targetSampleRate;
            this.interpolationFactor = interpolationFactor;
            this.decimationFactor = decimationFactor;
            this.filter = filter;
            this.description = description;
        }
    }

    /** Streaming FIR resampler for 16-bit mono little-endian PCM audio. */
    private static final class Pcm16MonoStreamingResampler implements StreamingAudioResampler {
        private final SupportedResamplingConversion conversion;
        private float[] filterHistory = new float[0];
        private Float pendingSample;
        private int decimationPhase = 0;
        private long upsampledSampleIndex = 0L;

        private Pcm16MonoStreamingResampler(SupportedResamplingConversion conversion) {
            this.conversion = conversion;
        }

        @Override
        public byte[] process(byte[] audioBytes) {
            if (audioBytes.length == 0) {
                return audioBytes;
            }

            if (audioBytes.length % 2 != 0) {
                throw new IllegalArgumentException(
                        "PCM resampling expects 16-bit audio aligned to 2-byte samples.");
            }

            final float[] pcmSamples = decodePcm16(audioBytes);
            final float[] upsampled = upsampleStreaming(pcmSamples, false);
            return filterGainAndDecimateToPcm16Streaming(upsampled);
        }

        @Override
        public byte[] flush() {
            final float[] upsampled = upsampleStreaming(new float[0], true);
            final byte[] flushedAudioBytes = filterGainAndDecimateToPcm16Streaming(upsampled);
            reset();
            return flushedAudioBytes;
        }

        private static float[] decodePcm16(byte[] audioBytes) {
            final float[] samples = new float[audioBytes.length / 2];
            for (int i = 0; i < samples.length; i++) {
                final int lo = audioBytes[i * 2] & 0xff;
                final int hi = audioBytes[i * 2 + 1];
                final short sample = (short) ((hi << 8) | lo);
                samples[i] = sample / 32768.0f;
            }
            return samples;
        }

        private float[] upsampleStreaming(float[] inputSamples, boolean finalize) {
            if (conversion.interpolationFactor <= 1) {
                return inputSamples;
            }

            final int sourceLength = inputSamples.length + (pendingSample == null ? 0 : 1);
            if (sourceLength == 0) {
                return new float[0];
            }

            if (!finalize && sourceLength == 1) {
                if (pendingSample == null) {
                    pendingSample = Float.valueOf(inputSamples[0]);
                }
                return new float[0];
            }

            final float[] sourceSamples = new float[sourceLength];
            int sourceIndex = 0;
            if (pendingSample != null) {
                sourceSamples[sourceIndex++] = pendingSample.floatValue();
            }
            System.arraycopy(inputSamples, 0, sourceSamples, sourceIndex, inputSamples.length);

            final int interpolationFactor = conversion.interpolationFactor;
            final int sourceSamplesToEmit =
                    finalize ? sourceSamples.length : sourceSamples.length - 1;
            final float[] upsampled = new float[sourceSamplesToEmit * interpolationFactor];

            for (int i = 0; i < sourceSamplesToEmit; i++) {
                upsampled[i * interpolationFactor] = sourceSamples[i];
            }

            if (finalize) {
                pendingSample = null;
            } else {
                pendingSample = sourceSamples[sourceSamples.length - 1];
            }

            return upsampled;
        }

        private byte[] filterGainAndDecimateToPcm16Streaming(float[] inputSamples) {
            if (inputSamples.length == 0) {
                return new byte[0];
            }

            final double[] filter = conversion.filter;
            final int interpolationFactor = conversion.interpolationFactor;
            final int decimationFactor = conversion.decimationFactor;
            final float gain = interpolationFactor;

            final float[] workBuffer = new float[filterHistory.length + inputSamples.length];
            System.arraycopy(filterHistory, 0, workBuffer, 0, filterHistory.length);
            System.arraycopy(
                    inputSamples, 0, workBuffer, filterHistory.length, inputSamples.length);

            final int startIndex = decimationPhase == 0 ? 0 : decimationFactor - decimationPhase;
            decimationPhase = (decimationPhase + inputSamples.length) % decimationFactor;
            if (startIndex >= inputSamples.length) {
                upsampledSampleIndex += inputSamples.length;
                final int historyLength = Math.min(filter.length - 1, workBuffer.length);
                filterHistory = new float[historyLength];
                System.arraycopy(
                        workBuffer,
                        workBuffer.length - historyLength,
                        filterHistory,
                        0,
                        historyLength);
                return new byte[0];
            }

            final int outputSamples =
                    1 + ((inputSamples.length - 1 - startIndex) / decimationFactor);
            final byte[] outputBytes = new byte[outputSamples * 2];
            int byteIndex = 0;
            int nextEmit = startIndex;

            for (int i = 0; i < inputSamples.length; i++) {
                double acc = 0;
                final int workIndex = filterHistory.length + i;
                if (interpolationFactor > 1) {
                    final int phase = (int) ((upsampledSampleIndex + i) % interpolationFactor);
                    for (int k = phase; k < filter.length; k += interpolationFactor) {
                        final int sampleIndex = workIndex - k;
                        if (sampleIndex < 0) {
                            break;
                        }
                        acc += workBuffer[sampleIndex] * filter[k];
                    }
                } else {
                    for (int k = 0; k < filter.length; k++) {
                        final int sampleIndex = workIndex - k;
                        if (sampleIndex < 0) {
                            break;
                        }
                        acc += workBuffer[sampleIndex] * filter[k];
                    }
                }

                if (i == nextEmit) {
                    final float sample = interpolationFactor > 1 ? clamp(acc * gain) : clamp(acc);
                    final short pcm16 = toPcm16(sample);
                    outputBytes[byteIndex++] = (byte) (pcm16 & 0xff);
                    outputBytes[byteIndex++] = (byte) ((pcm16 >> 8) & 0xff);
                    nextEmit += decimationFactor;
                    if (nextEmit >= inputSamples.length) {
                        nextEmit = inputSamples.length;
                    }
                }
            }

            upsampledSampleIndex += inputSamples.length;
            final int historyLength = Math.min(filter.length - 1, workBuffer.length);
            filterHistory = new float[historyLength];
            System.arraycopy(
                    workBuffer, workBuffer.length - historyLength, filterHistory, 0, historyLength);
            return outputBytes;
        }

        private void reset() {
            filterHistory = new float[0];
            pendingSample = null;
            decimationPhase = 0;
            upsampledSampleIndex = 0L;
        }

        private static float clamp(double value) {
            return (float) Math.max(Math.min(value, 1.0d), -1.0d);
        }

        private static short toPcm16(float value) {
            final float clipped = Math.max(-1.0f, Math.min(1.0f, value));
            return (short) Math.round(clipped * 32767.0f);
        }
    }
}
