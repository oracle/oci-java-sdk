/**
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

import static com.oracle.bmc.util.internal.FileUtils.expandUserHome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

/**
 * Simple implementation to read BMC configuration files.
 * <p>
 * Note, config files <b>MUST</b> contain a "DEFAULT" profile, else validation
 * will fail. Additional profiles are optional.
 */
public final class ConfigFileReader {
    /**
     * Default location of the config file.
     */
    public static final String DEFAULT_FILE_PATH = "~/.oraclebmc/config";

    /**
     * Creates a new ConfigFile instance using the configuration at the default location,
     * using the default profile.  See {@link #DEFAULT_FILE_PATH}.
     * @return A new ConfigFile instance.
     * @throws IOException
     *             if the file could not be read.
     */
    public static ConfigFile parseDefault() throws IOException {
        return parseDefault(null);
    }

    /**
     * Creates a new ConfigFile instance using the configuration at the default location,
     * using the given profile.  See {@link #DEFAULT_FILE_PATH}.
     * @param profile The profile name to load, or null if you want to load the
     *            "DEFAULT" profile.
     * @return A new ConfigFile instance.
     * @throws IOException
     *             if the file could not be read.
     */
    public static ConfigFile parseDefault(@Nullable String profile) throws IOException {
        return parse(DEFAULT_FILE_PATH, profile);
    }

    /**
     * Create a new instance using a file at a given location.
     * <p>
     * This method is the same as calling {@link #parse(String, String)} with
     * "DEFAULT" as the profile.
     *
     * @param configurationFilePath
     *            The path to the config file.
     * @return A new ConfigFile instance.
     * @throws IOException
     *             if the file could not be read.
     */
    public static ConfigFile parse(String configurationFilePath) throws IOException {
        return parse(configurationFilePath, null);
    }

    /**
     * Create a new instance using a file at a given location.
     *
     * @param configurationFilePath
     *            The path to the config file.
     * @param profile
     *            The profile name to load, or null if you want to load the
     *            "DEFAULT" profile.
     * @return A new ConfigFile instance.
     * @throws IOException
     *             if the file could not be read.
     */
    public static ConfigFile parse(String configurationFilePath, @Nullable String profile)
            throws IOException {
        return parse(new FileInputStream(new File(expandUserHome(configurationFilePath))), profile);
    }

    /**
     * Create a new instance using an input stream.
     *
     * @param configurationStream
     *            The path to the config file.
     * @param profile
     *            The profile name to load, or null if you want to load the
     *            "DEFAULT" profile.
     * @return A new ConfigFile instance.
     * @throws IOException
     *             if the file could not be read.
     */
    public static ConfigFile parse(InputStream configurationStream, @Nullable String profile)
            throws IOException {
        final ConfigAccumulator accumulator = new ConfigAccumulator();
        try (final BufferedReader reader =
                new BufferedReader(new InputStreamReader(configurationStream))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                accumulator.accept(line);
            }
        }
        if (!accumulator.foundDefaultProfile) {
            throw new IllegalStateException(
                    "No DEFAULT profile was specified in the configuration");
        }
        if (profile != null && !accumulator.configurationsByProfile.containsKey(profile)) {
            throw new IllegalArgumentException(
                    "No profile named " + profile + " exists in the configuration file");
        }

        return new ConfigFile(accumulator, profile);
    }

    private ConfigFileReader() {}

    /**
     * ConfigFile represents a simple lookup mechanism for a BMC config file.
     */
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    public static final class ConfigFile {
        private final ConfigAccumulator accumulator;
        private final String profile;

        /**
         * Gets the value associated with a given key. The value returned will
         * be the one for the selected profile (if available), else the value in
         * the DEFAULT profile (if specified), else null.
         *
         * @param key
         *            The key to look up.
         * @return The value, or null if it didn't exist.
         */
        public String get(String key) {
            if (profile != null
                    && (accumulator.configurationsByProfile.get(profile).containsKey(key))) {
                return accumulator.configurationsByProfile.get(profile).get(key);
            }
            return accumulator.configurationsByProfile.get("DEFAULT").get(key);
        }
    }

    private static final class ConfigAccumulator {
        final Map<String, Map<String, String>> configurationsByProfile = new HashMap<>();

        private String currentProfile = null;
        private boolean foundDefaultProfile = false;

        private void accept(String line) {
            final String trimmedLine = line.trim();

            // no blank lines
            if (trimmedLine.isEmpty()) {
                return;
            }

            // skip comments
            if (trimmedLine.charAt(0) == '#') {
                return;
            }

            if (trimmedLine.charAt(0) == '[') {
                currentProfile = trimmedLine.substring(1, trimmedLine.length() - 1).trim();
                if (currentProfile.equals("DEFAULT")) {
                    foundDefaultProfile = true;
                }
            }

            if (currentProfile == null) {
                throw new IllegalStateException(
                        "Config parse error, attempted to read configuration without specifying a profile: "
                                + trimmedLine);
            }

            final String[] keyValue = trimmedLine.split("=");
            if (keyValue.length != 2) {
                return;
            }

            final String key = keyValue[0];
            final String value = keyValue[1];

            if (!configurationsByProfile.containsKey(currentProfile)) {
                configurationsByProfile.put(currentProfile, new HashMap<String, String>());
            }
            configurationsByProfile.get(currentProfile).put(key, value);
        }
    }
}
