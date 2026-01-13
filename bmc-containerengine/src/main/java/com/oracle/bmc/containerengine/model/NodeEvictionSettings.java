/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Node Eviction Configuration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NodeEvictionSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NodeEvictionSettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"evictionGraceDuration", "isForceActionAfterGraceDuration"})
    public NodeEvictionSettings(
            String evictionGraceDuration, Boolean isForceActionAfterGraceDuration) {
        super();
        this.evictionGraceDuration = evictionGraceDuration;
        this.isForceActionAfterGraceDuration = isForceActionAfterGraceDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Duration after which OKE will give up eviction of the pods on the node. PT0M will
         * indicate you want to perform node action without cordon and drain. Default PT60M, Min
         * PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
         */
        @com.fasterxml.jackson.annotation.JsonProperty("evictionGraceDuration")
        private String evictionGraceDuration;

        /**
         * Duration after which OKE will give up eviction of the pods on the node. PT0M will
         * indicate you want to perform node action without cordon and drain. Default PT60M, Min
         * PT0M, Max: PT60M. Format ISO 8601 e.g PT30M
         *
         * @param evictionGraceDuration the value to set
         * @return this builder
         */
        public Builder evictionGraceDuration(String evictionGraceDuration) {
            this.evictionGraceDuration = evictionGraceDuration;
            this.__explicitlySet__.add("evictionGraceDuration");
            return this;
        }
        /**
         * If the node action should be performed if not all the pods can be evicted in the grace
         * period
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isForceActionAfterGraceDuration")
        private Boolean isForceActionAfterGraceDuration;

        /**
         * If the node action should be performed if not all the pods can be evicted in the grace
         * period
         *
         * @param isForceActionAfterGraceDuration the value to set
         * @return this builder
         */
        public Builder isForceActionAfterGraceDuration(Boolean isForceActionAfterGraceDuration) {
            this.isForceActionAfterGraceDuration = isForceActionAfterGraceDuration;
            this.__explicitlySet__.add("isForceActionAfterGraceDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeEvictionSettings build() {
            NodeEvictionSettings model =
                    new NodeEvictionSettings(
                            this.evictionGraceDuration, this.isForceActionAfterGraceDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeEvictionSettings model) {
            if (model.wasPropertyExplicitlySet("evictionGraceDuration")) {
                this.evictionGraceDuration(model.getEvictionGraceDuration());
            }
            if (model.wasPropertyExplicitlySet("isForceActionAfterGraceDuration")) {
                this.isForceActionAfterGraceDuration(model.getIsForceActionAfterGraceDuration());
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

    /**
     * Duration after which OKE will give up eviction of the pods on the node. PT0M will indicate
     * you want to perform node action without cordon and drain. Default PT60M, Min PT0M, Max:
     * PT60M. Format ISO 8601 e.g PT30M
     */
    @com.fasterxml.jackson.annotation.JsonProperty("evictionGraceDuration")
    private final String evictionGraceDuration;

    /**
     * Duration after which OKE will give up eviction of the pods on the node. PT0M will indicate
     * you want to perform node action without cordon and drain. Default PT60M, Min PT0M, Max:
     * PT60M. Format ISO 8601 e.g PT30M
     *
     * @return the value
     */
    public String getEvictionGraceDuration() {
        return evictionGraceDuration;
    }

    /**
     * If the node action should be performed if not all the pods can be evicted in the grace period
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isForceActionAfterGraceDuration")
    private final Boolean isForceActionAfterGraceDuration;

    /**
     * If the node action should be performed if not all the pods can be evicted in the grace period
     *
     * @return the value
     */
    public Boolean getIsForceActionAfterGraceDuration() {
        return isForceActionAfterGraceDuration;
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
        sb.append("NodeEvictionSettings(");
        sb.append("super=").append(super.toString());
        sb.append("evictionGraceDuration=").append(String.valueOf(this.evictionGraceDuration));
        sb.append(", isForceActionAfterGraceDuration=")
                .append(String.valueOf(this.isForceActionAfterGraceDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeEvictionSettings)) {
            return false;
        }

        NodeEvictionSettings other = (NodeEvictionSettings) o;
        return java.util.Objects.equals(this.evictionGraceDuration, other.evictionGraceDuration)
                && java.util.Objects.equals(
                        this.isForceActionAfterGraceDuration, other.isForceActionAfterGraceDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.evictionGraceDuration == null
                                ? 43
                                : this.evictionGraceDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.isForceActionAfterGraceDuration == null
                                ? 43
                                : this.isForceActionAfterGraceDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
