/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.realtimespeech.internal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

public class AudioResamplingSupportTest {
    @Test
    public void testResolveServiceTargetSampleRate() {
        Assert.assertEquals(
                Optional.of(Integer.valueOf(16000)),
                AudioResamplingSupport.resolveServiceTargetSampleRate(24000));
        Assert.assertEquals(
                Optional.of(Integer.valueOf(16000)),
                AudioResamplingSupport.resolveServiceTargetSampleRate(48000));
        Assert.assertFalse(
                AudioResamplingSupport.resolveServiceTargetSampleRate(16000).isPresent());
        Assert.assertFalse(
                AudioResamplingSupport.resolveServiceTargetSampleRate(44100).isPresent());
    }

    @Test
    public void testParseEncodingDefaultsAndSegments() {
        AudioResamplingSupport.AudioEncodingSettings defaultSettings =
                AudioResamplingSupport.parseEncoding(null);
        Assert.assertEquals(16000, defaultSettings.getSampleRate());
        Assert.assertNull(defaultSettings.getCodec());
        Assert.assertEquals(16, defaultSettings.getBitDepth());
        Assert.assertEquals(1, defaultSettings.getChannels());

        AudioResamplingSupport.AudioEncodingSettings settings =
                AudioResamplingSupport.parseEncoding(
                        "audio/raw;rate=48000;bitDepth=24;channels=2;codec=mulaw");
        Assert.assertEquals(48000, settings.getSampleRate());
        Assert.assertEquals("mulaw", settings.getCodec());
        Assert.assertEquals(24, settings.getBitDepth());
        Assert.assertEquals(2, settings.getChannels());
    }

    @Test
    public void testServiceRateAndCompatibilityChecks() {
        Assert.assertTrue(AudioResamplingSupport.isServiceSupportedSampleRate(8000));
        Assert.assertTrue(AudioResamplingSupport.isServiceSupportedSampleRate(16000));
        Assert.assertFalse(AudioResamplingSupport.isServiceSupportedSampleRate(24000));

        Assert.assertTrue(
                AudioResamplingSupport.isAutoResamplingCompatible(
                        AudioResamplingSupport.parseEncoding("audio/raw;rate=24000")));
        Assert.assertFalse(
                AudioResamplingSupport.isAutoResamplingCompatible(
                        AudioResamplingSupport.parseEncoding("audio/raw;rate=24000;codec=mulaw")));
        Assert.assertFalse(
                AudioResamplingSupport.isAutoResamplingCompatible(
                        AudioResamplingSupport.parseEncoding("audio/raw;rate=24000;bitDepth=24")));
        Assert.assertFalse(
                AudioResamplingSupport.isAutoResamplingCompatible(
                        AudioResamplingSupport.parseEncoding("audio/raw;rate=24000;channels=2")));
    }

    @Test
    public void testRewriteEncodingSampleRate() {
        Assert.assertEquals(
                "audio/raw;rate=16000",
                AudioResamplingSupport.rewriteEncodingSampleRate(null, 16000));
        Assert.assertEquals(
                "audio/raw;rate=16000",
                AudioResamplingSupport.rewriteEncodingSampleRate("audio/raw;rate=24000", 16000));
        Assert.assertEquals(
                "audio/raw;rate=16000;bitDepth=16",
                AudioResamplingSupport.rewriteEncodingSampleRate(
                        "audio/raw;rate=48000;bitDepth=16", 16000));
        Assert.assertEquals(
                "audio/raw;bitDepth=16;rate=16000",
                AudioResamplingSupport.rewriteEncodingSampleRate("audio/raw;bitDepth=16", 16000));
    }

    @Test
    public void testValidateStreamingRequestRejectsUnsupportedInputs() {
        assertInvalidRequest("audio/raw;rate=16000", 44100);
        assertInvalidRequest("audio/raw;rate=16000;codec=mulaw", 24000);
        assertInvalidRequest("audio/raw;rate=16000;bitDepth=24", 24000);
        assertInvalidRequest("audio/raw;rate=16000;channels=2", 24000);
    }

    @Test
    public void testStreamingResamplerMatchesOneShotForSupportedConversions() {
        assertChunkedResamplingMatchesOneShot(24000, 16000);
        assertChunkedResamplingMatchesOneShot(48000, 16000);
    }

    @Test
    public void testStreamingResamplerRejectsUnalignedPcm16Input() {
        AudioResamplingSupport.StreamingAudioResampler resampler =
                AudioResamplingSupport.createStreamingResampler(
                        24000, AudioResamplingSupport.parseEncoding("audio/raw;rate=16000"));

        try {
            resampler.process(new byte[] {1});
            Assert.fail("Expected unaligned PCM input to be rejected");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("2-byte samples"));
        }
    }

    private static void assertInvalidRequest(String encoding, int sourceSampleRate) {
        try {
            AudioResamplingSupport.validateStreamingRequest(
                    sourceSampleRate, AudioResamplingSupport.parseEncoding(encoding));
            Assert.fail("Expected resampling request to be rejected for " + encoding);
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().toLowerCase(Locale.US).contains("resampling"));
        }
    }

    private static void assertChunkedResamplingMatchesOneShot(
            int sourceSampleRate, int targetSampleRate) {
        byte[] audioBytes = createPcm16Ramp(960);
        AudioResamplingSupport.AudioEncodingSettings targetSettings =
                AudioResamplingSupport.parseEncoding("audio/raw;rate=" + targetSampleRate);

        AudioResamplingSupport.StreamingAudioResampler oneShotResampler =
                AudioResamplingSupport.createStreamingResampler(sourceSampleRate, targetSettings);
        byte[] oneShot = append(oneShotResampler.process(audioBytes), oneShotResampler.flush());

        AudioResamplingSupport.StreamingAudioResampler chunkedResampler =
                AudioResamplingSupport.createStreamingResampler(sourceSampleRate, targetSettings);
        byte[] chunked =
                append(
                        append(
                                chunkedResampler.process(Arrays.copyOfRange(audioBytes, 0, 638)),
                                chunkedResampler.process(
                                        Arrays.copyOfRange(audioBytes, 638, 1282))),
                        append(
                                chunkedResampler.process(
                                        Arrays.copyOfRange(audioBytes, 1282, audioBytes.length)),
                                chunkedResampler.flush()));

        Assert.assertArrayEquals(oneShot, chunked);
        Assert.assertTrue(oneShot.length > 0);
        Assert.assertEquals(0, oneShot.length % 2);
    }

    private static byte[] createPcm16Ramp(int sampleCount) {
        byte[] audioBytes = new byte[sampleCount * 2];
        for (int i = 0; i < sampleCount; i++) {
            short sample = (short) ((i % 200) * 120 - 12000);
            audioBytes[i * 2] = (byte) (sample & 0xff);
            audioBytes[i * 2 + 1] = (byte) ((sample >> 8) & 0xff);
        }
        return audioBytes;
    }

    private static byte[] append(byte[] first, byte[] second) {
        byte[] combined = new byte[first.length + second.length];
        System.arraycopy(first, 0, combined, 0, first.length);
        System.arraycopy(second, 0, combined, first.length, second.length);
        return combined;
    }
}
