/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the rollout policy for compute instance group stages.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "policyType",
    defaultImpl = ComputeInstanceGroupRolloutPolicy.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupLinearRolloutPolicyByPercentage.class,
        name = "COMPUTE_INSTANCE_GROUP_LINEAR_ROLLOUT_POLICY_BY_PERCENTAGE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ComputeInstanceGroupLinearRolloutPolicyByCount.class,
        name = "COMPUTE_INSTANCE_GROUP_LINEAR_ROLLOUT_POLICY_BY_COUNT"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ComputeInstanceGroupRolloutPolicy
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"batchDelayInSeconds"})
    protected ComputeInstanceGroupRolloutPolicy(Integer batchDelayInSeconds) {
        super();
        this.batchDelayInSeconds = batchDelayInSeconds;
    }

    /**
     * The duration of delay between batch rollout. The default delay is 1 minute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("batchDelayInSeconds")
    private final Integer batchDelayInSeconds;

    /**
     * The duration of delay between batch rollout. The default delay is 1 minute.
     * @return the value
     **/
    public Integer getBatchDelayInSeconds() {
        return batchDelayInSeconds;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ComputeInstanceGroupRolloutPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("batchDelayInSeconds=").append(String.valueOf(this.batchDelayInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeInstanceGroupRolloutPolicy)) {
            return false;
        }

        ComputeInstanceGroupRolloutPolicy other = (ComputeInstanceGroupRolloutPolicy) o;
        return java.util.Objects.equals(this.batchDelayInSeconds, other.batchDelayInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.batchDelayInSeconds == null
                                ? 43
                                : this.batchDelayInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of policy used for rolling out a deployment stage.
     **/
    public enum PolicyType {
        ComputeInstanceGroupLinearRolloutPolicyByCount(
                "COMPUTE_INSTANCE_GROUP_LINEAR_ROLLOUT_POLICY_BY_COUNT"),
        ComputeInstanceGroupLinearRolloutPolicyByPercentage(
                "COMPUTE_INSTANCE_GROUP_LINEAR_ROLLOUT_POLICY_BY_PERCENTAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PolicyType.class);

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
