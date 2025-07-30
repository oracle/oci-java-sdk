/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * The object representing the agent matching attribute keys. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MatchAgentsWithAttributeKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MatchAgentsWithAttributeKey
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"agentAttributeKeys"})
    public MatchAgentsWithAttributeKey(java.util.List<String> agentAttributeKeys) {
        super();
        this.agentAttributeKeys = agentAttributeKeys;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of agent matching attribute keys to be updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentAttributeKeys")
        private java.util.List<String> agentAttributeKeys;

        /**
         * The list of agent matching attribute keys to be updated.
         *
         * @param agentAttributeKeys the value to set
         * @return this builder
         */
        public Builder agentAttributeKeys(java.util.List<String> agentAttributeKeys) {
            this.agentAttributeKeys = agentAttributeKeys;
            this.__explicitlySet__.add("agentAttributeKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MatchAgentsWithAttributeKey build() {
            MatchAgentsWithAttributeKey model =
                    new MatchAgentsWithAttributeKey(this.agentAttributeKeys);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MatchAgentsWithAttributeKey model) {
            if (model.wasPropertyExplicitlySet("agentAttributeKeys")) {
                this.agentAttributeKeys(model.getAgentAttributeKeys());
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

    /** The list of agent matching attribute keys to be updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentAttributeKeys")
    private final java.util.List<String> agentAttributeKeys;

    /**
     * The list of agent matching attribute keys to be updated.
     *
     * @return the value
     */
    public java.util.List<String> getAgentAttributeKeys() {
        return agentAttributeKeys;
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
        sb.append("MatchAgentsWithAttributeKey(");
        sb.append("super=").append(super.toString());
        sb.append("agentAttributeKeys=").append(String.valueOf(this.agentAttributeKeys));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MatchAgentsWithAttributeKey)) {
            return false;
        }

        MatchAgentsWithAttributeKey other = (MatchAgentsWithAttributeKey) o;
        return java.util.Objects.equals(this.agentAttributeKeys, other.agentAttributeKeys)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.agentAttributeKeys == null
                                ? 43
                                : this.agentAttributeKeys.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
