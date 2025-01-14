/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The responder triggering details to be pushed to responder rules. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TriggerResponderDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TriggerResponderDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Unique identifier for the responder rule */
        @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
        private String responderRuleId;

        /**
         * Unique identifier for the responder rule
         *
         * @param responderRuleId the value to set
         * @return this builder
         */
        public Builder responderRuleId(String responderRuleId) {
            this.responderRuleId = responderRuleId;
            this.__explicitlySet__.add("responderRuleId");
            return this;
        }
        /** List of responder rule configurations */
        @com.fasterxml.jackson.annotation.JsonProperty("configurations")
        private java.util.List<ResponderConfiguration> configurations;

        /**
         * List of responder rule configurations
         *
         * @param configurations the value to set
         * @return this builder
         */
        public Builder configurations(java.util.List<ResponderConfiguration> configurations) {
            this.configurations = configurations;
            this.__explicitlySet__.add("configurations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TriggerResponderDetails build() {
            TriggerResponderDetails model =
                    new TriggerResponderDetails(this.responderRuleId, this.configurations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TriggerResponderDetails model) {
            if (model.wasPropertyExplicitlySet("responderRuleId")) {
                this.responderRuleId(model.getResponderRuleId());
            }
            if (model.wasPropertyExplicitlySet("configurations")) {
                this.configurations(model.getConfigurations());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Unique identifier for the responder rule */
    @com.fasterxml.jackson.annotation.JsonProperty("responderRuleId")
    private final String responderRuleId;

    /**
     * Unique identifier for the responder rule
     *
     * @return the value
     */
    public String getResponderRuleId() {
        return responderRuleId;
    }

    /** List of responder rule configurations */
    @com.fasterxml.jackson.annotation.JsonProperty("configurations")
    private final java.util.List<ResponderConfiguration> configurations;

    /**
     * List of responder rule configurations
     *
     * @return the value
     */
    public java.util.List<ResponderConfiguration> getConfigurations() {
        return configurations;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TriggerResponderDetails(");
        sb.append("super=").append(super.toString());
        sb.append("responderRuleId=").append(String.valueOf(this.responderRuleId));
        sb.append(", configurations=").append(String.valueOf(this.configurations));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
