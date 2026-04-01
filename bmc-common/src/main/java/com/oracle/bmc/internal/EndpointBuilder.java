/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.oracle.bmc.Realm;
import com.oracle.bmc.Region;
import com.oracle.bmc.Service;

import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.WrappedWebTarget;
import com.oracle.bmc.util.RealmSpecificEndpointTemplateUtils;
import com.oracle.bmc.util.VisibleForTesting;
import com.oracle.bmc.util.internal.StringUtils;
import javax.annotation.Nonnull;

/**
 * EndpointBuilder provides a wrapper to construct the appropriate
 * endpoint for a service.  The service may override the endpoint template, but
 * if not, a default template will be used.
 */
public class EndpointBuilder {
    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(EndpointBuilder.class);
    public static final String DEFAULT_ENDPOINT_TEMPLATE =
            "https://{serviceEndpointPrefix}.{region}.{secondLevelDomain}";

    private static final Pattern PLACEHOLDER_PATTERN = Pattern.compile("\\{(.*?)\\}");

    private static final String ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT =
            "https://{endpointServiceName}.{region}";

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
            "\\{(\\w+)\\?(((\\w+\\.)+\\:(\\w+\\.)+)|((\\w+\\.)+:\\s*)|(\\s*:(\\w+\\.)+))\\}+";
    public static final Pattern OPTIONS_PATTERN = Pattern.compile(OPTIONS_REGEX);
    public static final String DUAL_STACK_OPTION = "dualStack";

    private static final Map<String, String> OVERRIDE_REGION_IDS = new HashMap<>();

    /**
     * Creates the service endpoint using the {@link DefaultEndpointConfiguration}
     * method.
     *
     * @param service The service
     * @param regionId The regionId
     * @param realm The realm this region belongs to.
     * @return The endpoint (protocol + FQDN) for this service.
     */
    public static String createEndpoint(
            @Nonnull Service service, @Nonnull String regionId, @Nonnull Realm realm) {
        if (service == null) {
            throw new java.lang.NullPointerException("service is marked non-null but is null");
        }
        if (regionId == null) {
            throw new java.lang.NullPointerException("regionId is marked non-null but is null");
        }
        if (realm == null) {
            throw new java.lang.NullPointerException("realm is marked non-null but is null");
        }
        final String regionIdToUse;
        synchronized (OVERRIDE_REGION_IDS) {
            regionIdToUse = OVERRIDE_REGION_IDS.getOrDefault(regionId, regionId);
        }

        // Do not append any other endpoint suffix like '.service.oci.oraclecloud.com` at the end
        // Ex: If regionId is 'broom6.us.oracle.com', then endpoint should be 'https://{service}.broom6.us.oracle.com'
        if (StringUtils.isNotBlank(regionId) && regionId.contains(".")) {
            final String endpoint;
            if (StringUtils.isNotBlank(service.getEndpointServiceName())) {
                endpoint =
                        DefaultEndpointConfiguration.builder(ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT)
                                .endpointServiceName(service.getEndpointServiceName())
                                .regionId(regionIdToUse)
                                .build();
                LOG.debug(
                        "Endpoint created from dotted region {} using endpoint service name {}. Endpoint: {}",
                        regionIdToUse,
                        service.getEndpointServiceName(),
                        endpoint);
            } else if (StringUtils.isNotBlank(service.getServiceEndpointTemplate())) {
                String serviceEndpointTemplate = service.getServiceEndpointTemplate();
                String endpointServiceNameFromTemplate =
                        getEndpointServiceNameFromTemplate(serviceEndpointTemplate);
                endpoint =
                        DefaultEndpointConfiguration.builder(ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT)
                                .endpointServiceName(endpointServiceNameFromTemplate)
                                .regionId(regionIdToUse)
                                .build();
                LOG.debug(
                        "Endpoint created from dotted region {} using endpoint template {}. Endpoint: {}",
                        regionIdToUse,
                        ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT,
                        endpoint);
            } else if (StringUtils.isNotBlank(service.getServiceEndpointPrefix())) {
                endpoint =
                        DefaultEndpointConfiguration.builder(ENDPOINT_TEMPLATE_FOR_REGION_WITH_DOT)
                                .endpointServiceName(service.getServiceEndpointPrefix())
                                .regionId(regionIdToUse)
                                .build();
                LOG.debug(
                        "Endpoint created from dotted region {} using service endpoint prefix {}. Endpoint: {}",
                        regionIdToUse,
                        service.getServiceEndpointPrefix(),
                        endpoint);
            } else {
                throw new IllegalArgumentException("Unknown service: " + service.getServiceName());
            }
            return endpoint;
        }

        boolean useOfRealmSpecificEndpointTemplateEnabled =
                RealmSpecificEndpointTemplateUtils.getUseOfRealmSpecificEndpointTemplateByDefault();
        boolean realmSpecificEndpointTemplateDefined =
                service.getServiceEndpointTemplateForRealmMap() != null
                        && service.getServiceEndpointTemplateForRealmMap()
                                .containsKey(realm.getRealmId().toLowerCase(Locale.ROOT));

        if (useOfRealmSpecificEndpointTemplateEnabled) {
            if (realmSpecificEndpointTemplateDefined) {
                return getRealmSpecificEndpointTemplate(regionIdToUse, service, realm);
            } else {
                LOG.debug(
                        "Realm-specific endpoint template not defined for realm {}, using non-realm-specific endpoint template instead.",
                        realm.getRealmId());
            }
        }
        return getServiceEndpointTemplateToUse(regionIdToUse, service, realm);
    }

    public static String getRealmSpecificEndpointTemplate(
            String regionId, Service service, Realm realm) {
        Map<String, String> serviceEndpointTemplateForRealmMap =
                service.getServiceEndpointTemplateForRealmMap();
        String endpointTemplateToUse;
        if (serviceEndpointTemplateForRealmMap.containsKey(
                realm.getRealmId().toLowerCase(Locale.ROOT))) {
            endpointTemplateToUse =
                    serviceEndpointTemplateForRealmMap.get(
                            realm.getRealmId().toLowerCase(Locale.ROOT));
        } else {
            LOG.debug(
                    "Endpoint template not defined for {} realm, using non-realm-specific endpoint template instead",
                    realm.getRealmId());
            endpointTemplateToUse = getServiceEndpointTemplateToUse(regionId, service, realm);
        }
        LOG.debug("Setting endpoint template to: {}", endpointTemplateToUse);
        return DefaultEndpointConfiguration.builder(endpointTemplateToUse)
                .regionId(regionId)
                .serviceEndpointPrefix(service.getServiceEndpointPrefix())
                .secondLevelDomain(realm.getSecondLevelDomain())
                .build();
    }

    public static String getServiceEndpointTemplateToUse(
            String regionId, Service service, Realm realm) {
        String endpointTemplateToUse;
        if (StringUtils.isNotBlank(service.getServiceEndpointTemplate())) {
            endpointTemplateToUse = service.getServiceEndpointTemplate();
        } else {
            endpointTemplateToUse = DEFAULT_ENDPOINT_TEMPLATE;
        }

        return DefaultEndpointConfiguration.builder(endpointTemplateToUse)
                .regionId(regionId)
                .serviceEndpointPrefix(service.getServiceEndpointPrefix())
                .secondLevelDomain(realm.getSecondLevelDomain())
                .build();
    }

    private static String getEndpointServiceNameFromTemplate(String serviceEndpointTemplate) {
        int doubleSlashPos = serviceEndpointTemplate.indexOf("//");
        int dotPos = serviceEndpointTemplate.indexOf(".", doubleSlashPos);
        if (doubleSlashPos == -1 || dotPos == -1) {
            throw new IllegalArgumentException(
                    "The service endpoint template "
                            + serviceEndpointTemplate
                            + " is not in the expected format. The expected format is "
                            + DEFAULT_ENDPOINT_TEMPLATE);
        }
        return serviceEndpointTemplate.substring(doubleSlashPos + 2, dotPos);
    }

    /**
     * Creates the service endpoint using the {@link DefaultEndpointConfiguration}
     * method.
     *
     * @param service The service
     * @param region The region
     * @return The endpoint (protocol + FQDN) for this service.
     */
    public static String createEndpoint(@Nonnull Service service, @Nonnull Region region) {
        if (service == null) {
            throw new java.lang.NullPointerException("service is marked non-null but is null");
        }
        if (region == null) {
            throw new java.lang.NullPointerException("region is marked non-null but is null");
        }
        return createEndpoint(service, region.getRegionId(), region.getRealm());
    }

    /**
     * Temporary ability to override the region for a given regionId.
     * <p>
     * This will most likely be removed at a later point in time.  It is not intended
     * for use outside of the SDK.
     * @param regionId The value obtained from {@link Region#getRegionId()}.
     * @param overrideRegionId The alternative regionId to use.
     */
    public static void overrideRegionId(
            @Nonnull String regionId, @Nonnull String overrideRegionId) {
        if (regionId == null) {
            throw new java.lang.NullPointerException("regionId is marked non-null but is null");
        }
        if (overrideRegionId == null) {
            throw new java.lang.NullPointerException(
                    "overrideRegionId is marked non-null but is null");
        }
        synchronized (OVERRIDE_REGION_IDS) {
            LOG.warn(
                    "Overriding regionId for regionId \'{}\' to \'{}\'",
                    regionId,
                    overrideRegionId);
            OVERRIDE_REGION_IDS.put(regionId, overrideRegionId);
        }
    }

    /**
     * Populate the parameters in the endpoint with its corresponding value and update the base
     * endpoint. The value will be populated iff the parameter in endpoint is a required request
     * path parameter or a required request query parameter. If not, the parameter in the endpoint
     * will be ignored and left blank.
     *
     * @param client The RestClient in use
     * @param requiredParametersMap Map of parameter name as key and value set in request path or
     *     query parameter as value
     */
    public static final WrappedWebTarget populateServiceParametersInEndpoint(
            RestClient client, Map<String, Object> requiredParametersMap) {
        String endpointTemplate = client.getEndpoint();
        if (!endpointTemplate.contains("{")) {
            return client.getBaseTarget();
        }
        String endpoint =
                getEndpointWithPopulatedServiceParams(
                        endpointTemplate, requiredParametersMap, client.getOptionsMap());
        return new WrappedWebTarget(client.getClient().target(endpoint));
    }

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
    @VisibleForTesting
    protected static String getEndpointWithPopulatedServiceParams(
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
    public static boolean isEndpointParameterized(String endpoint) {
        return endpoint.contains("{");
    }

    /**
     * Removes all placeholders from the given endpoint string.
     *
     * @param updatedEndpoint the endpoint string to remove parameters from
     * @return the endpoint string with all placeholders removed
     */
    public static String removeAllParametersFromEndpoint(String updatedEndpoint) {
        return updatedEndpoint.replaceAll("\\{.*?\\}", "");
    }

    private EndpointBuilder() {}
}
