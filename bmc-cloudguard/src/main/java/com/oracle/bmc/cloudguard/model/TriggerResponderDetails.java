/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The Responder details to be pushed to responder
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TriggerResponderDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TriggerResponderDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"responderRuleId", "configurations"})
    public TriggerResponderDetails(
            String responderRuleId, java.util.List<ResponderConfiguration> configurations) {
        super();
        this.responderRuleId = responderRuleId;
        this.configurations = configurations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ResponderRule ID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        /**
         * ResponderRule ID
         * @param responderRuleId the value to set
         * @return this builder
         **/
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }
        /**
         * ResponderRule configurations
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<ResponderConfiguration> configurations;

        /**
         * ResponderRule configurations
         * @param configurations the value to set
         * @return this builder
         **/
        public Builder configurations(java.util.List<ResponderConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TriggerResponderDetails build() {
            TriggerResponderDetails __instance__ =
                    new TriggerResponderDetails(responderRuleId, configurations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TriggerResponderDetails o) {
            Builder copiedBuilder =
                    responderRuleId(o.getResponderRuleId()).configurations(o.getConfigurations());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * ResponderRule ID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    private final String responderRuleId;

    /**
     * ResponderRule ID
     * @return the value
     **/
    public String getResponderRuleId() {
        return responderRuleId;
    }

    /**
     * ResponderRule configurations
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<ResponderConfiguration> configurations;

    /**
     * ResponderRule configurations
     * @return the value
     **/
    public java.util.List<ResponderConfiguration> getConfigurations() {
        return configurations;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TriggerResponderDetails(");
        sb.append("responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TriggerResponderDetails)) {
            return false;
        }

        TriggerResponderDetails other = (TriggerResponderDetails) o;
        return java.util.Objects.equals(this.responderRuleId, other.responderRuleId)
                && java.util.Objects.equals(this.configurations, other.configurations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.responderRuleId == null ? 43 : this.responderRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.configurations == null ? 43 : this.configurations.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
