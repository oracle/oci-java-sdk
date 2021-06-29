/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies a failure policy for a compute instance group rolling deployment stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType",
    defaultImpl = ComputeInstanceGroupFailurePolicy.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupFailurePolicyByPercentage.class,
        name = "COMPUTE_INSTANCE_GROUP_FAILURE_POLICY_BY_PERCENTAGE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupFailurePolicyByCount.class,
        name = "COMPUTE_INSTANCE_GROUP_FAILURE_POLICY_BY_COUNT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ComputeInstanceGroupFailurePolicy {

    /**
     * Specifies if the failure instance size is given by absolute number or by percentage.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PolicyType {
        ComputeInstanceGroupFailurePolicyByCount("COMPUTE_INSTANCE_GROUP_FAILURE_POLICY_BY_COUNT"),
        ComputeInstanceGroupFailurePolicyByPercentage(
                "COMPUTE_INSTANCE_GROUP_FAILURE_POLICY_BY_PERCENTAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PolicyType> map;

        static {
            map = new java.util.HashMap<>();
            for (PolicyType v : PolicyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PolicyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PolicyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PolicyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
