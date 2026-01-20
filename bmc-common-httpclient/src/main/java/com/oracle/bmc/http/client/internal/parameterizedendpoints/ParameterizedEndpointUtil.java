/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client.internal.parameterizedendpoints;

import com.oracle.bmc.http.client.InternalSdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@InternalSdk
public enum ParameterizedEndpointUtil {
    INSTANCE;

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ParameterizedEndpointUtil.class);
    private static final Pattern PLACEHOLDER_PATTERN = Pattern.compile("\\{(.*?)\\}");

    /**
     * Regex to detect options defined in the endpoint template. It checks for the following
     * pattern:
     *
     * <ul>
     *   <li>Starts with an opening curly brace ({)
     *   <li>Followed by 1 or more word characters
     *   <li>Followed by a question mark (?)
     *   <li>Followed by any one of the following:
     *       <ul>
     *         <li>one or more word characters, followed by a period:one or more word characters,
     *             followed by a period
     *         <li>one or more word characters, followed by a period:zero or more whitespace
     *             characters
     *         <li>zero or more whitespace characters:one or more word characters, followed by a
     *             period
     *       </ul>
     *   <li>Ends with a closing curly brace (})
     * </ul>
     *
     * <p>Example: {option?v1.:v2.}, {option?:v2.}, {option?v1.:} are valid patterns
     *
     * <p>Example: {option?v1:v2+}, {option?:v2}, {option?v1?:} {option?:} are invalid pattern
     */
    public static final String OPTIONS_REGEX =
            "\\{(\\w+)\\?((\\w+\\.\\:\\w+\\.)|(\\w+\\.:\\s*)|(\\s*:\\w+\\.))\\}+";

    public static final Pattern OPTIONS_PATTERN = Pattern.compile(OPTIONS_REGEX);

    public static final String DUAL_STACK_OPTION = "dualStack";

    /**
     * Populate the parameters in the endpoint with its corresponding value, process options, and
     * return the processed endpoint.
     *
     * <p>For parameters, the value will be populated iff the parameter in endpoint is a required
     * request path parameter or a required request query parameter. If not, the parameter in the
     * endpoint will be ignored and left blank.
     *
     * <p>For options, the true-choice or the false-choice will be entered into the endpoint,
     * depending on the state of the option. If the option is unknown, the entire option construct
     * will be removed, meaning neither the true-choice nor the false-choice will be used.
     *
     * @param baseUriString base URI string, may be parameterized
     * @param requiredParametersMap the map from required parameter name to their values
     * @param optionsMap the map from option name to enabled/disabled status
     * @return endpoint with parameters replaced with their values
     */
    public String getEndpointWithPopulatedServiceParameters(
            String baseUriString,
            Map<String, Object> requiredParametersMap,
            Map<String, Boolean> optionsMap) {
        String endpoint = baseUriString;
        LOG.trace("getEndpointWithPopulateServiceParameters: baseUriString='{}'", endpoint);
        if (!isEndpointParameterized(endpoint)) {
            LOG.trace(
                    "getEndpointWithPopulateServiceParameters: baseUriString not parameterized, endpoint='{}'",
                    endpoint);
            return endpoint;
        }

        StringBuilder updatedEndpointBuilder = new StringBuilder();
        int afterLastMatch = 0;

        Matcher matcher = PLACEHOLDER_PATTERN.matcher(endpoint);
        while (matcher.find()) {
            // append part between last match and this match
            updatedEndpointBuilder.append(endpoint.substring(afterLastMatch, matcher.start()));
            afterLastMatch = matcher.end();

            String group = matcher.group();
            Matcher optionMatcher = OPTIONS_PATTERN.matcher(group);
            if (optionMatcher.matches()) {
                // handle option
                String option = matcher.group();
                String optionName = optionMatcher.group(1);
                if (!optionsMap.containsKey(optionName)) {
                    LOG.debug(
                            "The option {} cannot be populated since its value was not provided, removing {} from endpoint entirely",
                            optionName,
                            option);
                    continue;
                }
                boolean optionValue = optionsMap.get(optionName);
                String optionEnabledParam =
                        option.substring(option.indexOf("?") + 1, option.indexOf(":"));
                String optionDisabledParam =
                        option.substring(option.indexOf(":") + 1, option.indexOf("}"));
                String replacement = optionValue ? optionEnabledParam : optionDisabledParam;
                updatedEndpointBuilder.append(replacement);
            } else {
                // handle parameter
                String parameter = matcher.group();

                boolean appendDot = false;
                String paramName;

                // If the parameter is defined with a "+Dot" string, it means we need to append a
                // "." after populating the paramName value
                if (parameter.endsWith("+Dot}")) {
                    appendDot = true;
                    paramName = parameter.substring(1, parameter.indexOf("+"));
                } else {
                    paramName = parameter.substring(1, parameter.length() - 1);
                }

                if (requiredParametersMap.containsKey(paramName)) {
                    Object paramValue = requiredParametersMap.get(paramName);
                    if (!(paramValue instanceof String)) {
                        LOG.debug(
                                "The parameter for {} cannot be populated since the value is not of type String",
                                paramName);
                        continue;
                    }
                    updatedEndpointBuilder.append(paramValue);
                    if (appendDot) {
                        updatedEndpointBuilder.append('.');
                    }
                } else {
                    LOG.trace(
                            "getEndpointWithPopulateServiceParameters: parameter '{}' not found in requiredParametersMap, removing placeholder",
                            paramName);
                }
            }
        }

        // append part after last match
        updatedEndpointBuilder.append(endpoint.substring(afterLastMatch));

        String updatedEndpoint = updatedEndpointBuilder.toString();
        LOG.trace(
                "getEndpointWithPopulateServiceParameters: processed all parameters, endpoint='{}'",
                updatedEndpoint);

        return updatedEndpoint;
    }

    /**
     * Checks if the given endpoint string contains any placeholders. A placeholder is denoted by
     * the presence of '{' character.
     *
     * @param endpoint the endpoint string to check for parameterization
     * @return true if the endpoint is parameterized, false otherwise
     */
    public boolean isEndpointParameterized(String endpoint) {
        return endpoint.contains("{");
    }

    /**
     * Removes all placeholders from the given endpoint string.
     *
     * @param updatedEndpoint the endpoint string to remove parameters from
     * @return the endpoint string with all placeholders removed
     */
    public String removeAllParametersFromEndpoint(String updatedEndpoint) {
        return updatedEndpoint.replaceAll("\\{.*?\\}", "");
    }
}
