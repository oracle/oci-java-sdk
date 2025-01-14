/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * OSN summary information for returning in a list. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OsnSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OsnSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"osnKey", "lifecycleState"})
    public OsnSummary(String osnKey, Osn.LifecycleState lifecycleState) {
        super();
        this.osnKey = osnKey;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OSN identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("osnKey")
        private String osnKey;

        /**
         * OSN identifier
         *
         * @param osnKey the value to set
         * @return this builder
         */
        public Builder osnKey(String osnKey) {
            this.osnKey = osnKey;
            this.__explicitlySet__.add("osnKey");
            return this;
        }
        /** The current state of the OSN. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Osn.LifecycleState lifecycleState;

        /**
         * The current state of the OSN.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Osn.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OsnSummary build() {
            OsnSummary model = new OsnSummary(this.osnKey, this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OsnSummary model) {
            if (model.wasPropertyExplicitlySet("osnKey")) {
                this.osnKey(model.getOsnKey());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** OSN identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("osnKey")
    private final String osnKey;

    /**
     * OSN identifier
     *
     * @return the value
     */
    public String getOsnKey() {
        return osnKey;
    }

    /** The current state of the OSN. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Osn.LifecycleState lifecycleState;

    /**
     * The current state of the OSN.
     *
     * @return the value
     */
    public Osn.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("OsnSummary(");
        sb.append("super=").append(super.toString());
        sb.append("osnKey=").append(String.valueOf(this.osnKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OsnSummary)) {
            return false;
        }

        OsnSummary other = (OsnSummary) o;
        return java.util.Objects.equals(this.osnKey, other.osnKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.osnKey == null ? 43 : this.osnKey.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
