/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A condition to apply to an access control rule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "attributeName",
    defaultImpl = RuleCondition.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SourceVcnIdCondition.class,
        name = "SOURCE_VCN_ID"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SourceIpAddressCondition.class,
        name = "SOURCE_IP_ADDRESS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = PathMatchCondition.class,
        name = "PATH"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SourceVcnIpAddressCondition.class,
        name = "SOURCE_VCN_IP_ADDRESS"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class RuleCondition {

    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AttributeName {
        SourceIpAddress("SOURCE_IP_ADDRESS"),
        SourceVcnId("SOURCE_VCN_ID"),
        SourceVcnIpAddress("SOURCE_VCN_IP_ADDRESS"),
        Path("PATH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AttributeName> map;

        static {
            map = new java.util.HashMap<>();
            for (AttributeName v : AttributeName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AttributeName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttributeName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttributeName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
