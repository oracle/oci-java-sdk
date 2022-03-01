/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The match criteria in a route distribution statement. The match criteria outlines which routes
 * should be imported or exported.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "matchType",
    defaultImpl = DrgRouteDistributionMatchCriteria.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrgAttachmentIdDrgRouteDistributionMatchCriteria.class,
        name = "DRG_ATTACHMENT_ID"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrgAttachmentTypeDrgRouteDistributionMatchCriteria.class,
        name = "DRG_ATTACHMENT_TYPE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DrgAttachmentMatchAllDrgRouteDistributionMatchCriteria.class,
        name = "MATCH_ALL"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DrgRouteDistributionMatchCriteria {

    /**
     * The type of the match criteria for a route distribution statement.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MatchType {
        DrgAttachmentType("DRG_ATTACHMENT_TYPE"),
        DrgAttachmentId("DRG_ATTACHMENT_ID"),
        MatchAll("MATCH_ALL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MatchType> map;

        static {
            map = new java.util.HashMap<>();
            for (MatchType v : MatchType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MatchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MatchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MatchType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
