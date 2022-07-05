/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

import org.slf4j.Logger;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import com.oracle.bmc.util.internal.StringUtils;
import static com.oracle.bmc.util.internal.FileUtils.expandUserHome;

/**
 * Simple implementation to read OCI configuration files.
 * <p>
 * Note, config files <b>MUST</b> contain a "DEFAULT" profile, else validation
 * will fail. Additional profiles are optional.
 */
public final class ConfigFileReader {
    /**
     * Default location of the config file.
     */
    public static final String DEFAULT_FILE_PATH = "~/.oci/config";

    /**
     * The fallback default location of the config file. If and only if the {@link #DEFAULT_FILE_PATH} does not exist,
     * this fallback default location will be used.
     */
    public static final String FALLBACK_DEFAULT_FILE_PATH = "~/.oraclebmc/config";

    private static final String DEFAULT_PROFILE_NAME = "DEFAULT";

    /**
     * Environment variable name for the config file location
     */
    public static final String OCI_CONFIG_FILE_PATH_ENV_VAR_NAME = "OCI_CONFIG_FILE";
    private static final Logger LOG = org.slf4j.LoggerFactory.getLogger(ConfigFileReader.class);

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
        File effectiveFile = null;

        File defaultFile = new File(expandUserHome(DEFAULT_FILE_PATH));
        String fallbackConfigFilePath = System.getenv(OCI_CONFIG_FILE_PATH_ENV_VAR_NAME);

        if (StringUtils.isBlank(fallbackConfigFilePath)) {
            fallbackConfigFilePath = FALLBACK_DEFAULT_FILE_PATH;
        }
        File fallbackDefaultFile = new File(expandUserHome(fallbackConfigFilePath));

        if (defaultFile.exists() && defaultFile.isFile()) {
            effectiveFile = defaultFile;
        } else if (fallbackDefaultFile.exists() && fallbackDefaultFile.isFile()) {
            effectiveFile = fallbackDefaultFile;
        }

        if (effectiveFile != null) {
            LOG.debug("Loading config file from: {}", effectiveFile);
            return parse(effectiveFile.getAbsolutePath(), profile);
        } else {
            throw new IOException(
                    String.format(
                            "Can't load the default config from '%s' or '%s' because it does not exist or it is not a file.",
                            defaultFile.getAbsolutePath(),
                            fallbackDefaultFile.getAbsolutePath()));
        }
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
     * Create a new instance using an UTF-8 input stream.
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
        return parse(configurationStream, profile, StandardCharsets.UTF_8);
    }

    /**
     * Create a new instance using an input stream.
     *
     * @param configurationStream
     *            The path to the config file.
     * @param profile
     *            The profile name to load, or null if you want to load the
     *            "DEFAULT" profile.
     * @param charset
     *            The charset used when parsing the input stream
     * @return A new ConfigFile instance.
     * @throws IOException
     *             if the file could not be read.
     */
    public static ConfigFile parse(
            InputStream configurationStream, @Nullable String profile, @Nonnull Charset charset)
            throws IOException {
        final ConfigAccumulator accumulator = new ConfigAccumulator();
        try (final BufferedReader reader =
                new BufferedReader(new InputStreamReader(configurationStream, charset))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                accumulator.accept(line);
            }
        }
        if (!accumulator.foundDefaultProfile) {
            LOG.info("No DEFAULT profile was specified in the configuration");
        }
        if (profile != null && !accumulator.configurationsByProfile.containsKey(profile)) {
            throw new IllegalArgumentException(
                    "No profile named " + profile + " exists in the configuration file");
        }

        return new ConfigFile(accumulator, profile);
    }

    private ConfigFileReader() {}

    /**
     * ConfigFile represents a simple lookup mechanism for a OCI config file.
     */
    public static final class ConfigFile {
        private final ConfigAccumulator accumulator;
        private final String profile;

        @java.beans.ConstructorProperties({"accumulator", "profile"})
        private ConfigFile(ConfigAccumulator accumulator, String profile) {
            this.accumulator = accumulator;
            this.profile = profile;
        }

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
            return accumulator.foundDefaultProfile
                    ? accumulator.configurationsByProfile.get(DEFAULT_PROFILE_NAME).get(key)
                    : null;
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

            if (trimmedLine.charAt(0) == '['
                    && trimmedLine.charAt(trimmedLine.length() - 1) == ']') {
                currentProfile = trimmedLine.substring(1, trimmedLine.length() - 1).trim();
                if (currentProfile.isEmpty()) {
                    throw new IllegalStateException("Cannot have empty profile name: " + line);
                }
                if (currentProfile.equals(DEFAULT_PROFILE_NAME)) {
                    foundDefaultProfile = true;
                }
                if (!configurationsByProfile.containsKey(currentProfile)) {
                    configurationsByProfile.put(currentProfile, new HashMap<String, String>());
                }

                return;
            }

            final int splitIndex = trimmedLine.indexOf('=');
            if (splitIndex == -1) {
                throw new IllegalStateException("Found line with no key-value pair: " + line);
            }

            final String key = trimmedLine.substring(0, splitIndex).trim();
            final String value = trimmedLine.substring(splitIndex + 1).trim();
            if (key.isEmpty()) {
                throw new IllegalStateException("Found line with no key: " + line);
            }

            if (currentProfile == null) {
                throw new IllegalStateException(
                        "Config parse error, attempted to read configuration without specifying a profile: "
                                + line);
            }

            configurationsByProfile.get(currentProfile).put(key, value);
        }
    }
}
