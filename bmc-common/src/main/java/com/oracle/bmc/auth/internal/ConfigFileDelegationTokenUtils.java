/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.util.internal.StringUtils;
import com.oracle.bmc.util.internal.FileUtils;
import org.slf4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * This class allows users to load delegation token from the config file
 */
public class ConfigFileDelegationTokenUtils {

    private static final String OCI_DELEGATION_TOKEN_FILE_KEY = "delegation_token_file";
    private static final String OCI_DELEGATION_TOKEN = "delegation_token";

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ConfigFileDelegationTokenUtils.class);

    private ConfigFileDelegationTokenUtils() {
        throw new UnsupportedOperationException("This class cannot be instantiated.");
    }

    /**
     * parses the config file and retrieves token file and returns
     * the delegation token from the file
     */
    public static String parseAndGetToken(ConfigFileReader.ConfigFile effectiveConfigFile)
            throws IOException {

        if (effectiveConfigFile.get(OCI_DELEGATION_TOKEN) != null) {
            return effectiveConfigFile.get(OCI_DELEGATION_TOKEN);
        }

        String delegationTokenFilePath = getDelegationTokenFilePath(effectiveConfigFile);
        if (StringUtils.isBlank(delegationTokenFilePath)) {
            return "";
        }
        StringBuilder tokenBuilder = new StringBuilder();
        try (Stream<String> stream =
                Files.lines(
                        Paths.get(FileUtils.expandUserHome(delegationTokenFilePath)),
                        StandardCharsets.UTF_8)) {
            stream.forEach(s -> tokenBuilder.append(s));
        } catch (IOException e) {
            LOG.warn("Exception in reading or parsing delegation token file", e);
        }
        return tokenBuilder.toString();
    }

    private static String getDelegationTokenFilePath(ConfigFileReader.ConfigFile configFile) {
        String delegationTokenFilePath = configFile.get(OCI_DELEGATION_TOKEN_FILE_KEY);
        File delegationTokenFile = null;

        if (!StringUtils.isBlank(delegationTokenFilePath)) {
            delegationTokenFile = new File(FileUtils.expandUserHome(delegationTokenFilePath));
            if (delegationTokenFile.exists() && delegationTokenFile.isFile()) {
                LOG.debug(
                        "Loading delegation token from file: '%s'",
                        delegationTokenFile.getAbsolutePath());
            } else {
                LOG.debug(
                        String.format(
                                "Can't load the delegation token from file '%s' because it does not exist or it is not a file.",
                                delegationTokenFile.getAbsolutePath()));
            }
        }
        return delegationTokenFilePath;
    }
}
