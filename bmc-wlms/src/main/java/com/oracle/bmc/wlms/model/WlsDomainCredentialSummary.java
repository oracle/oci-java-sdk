/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * The WebLogic domain credentials summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WlsDomainCredentialSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WlsDomainCredentialSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "strategy"})
    public WlsDomainCredentialSummary(String type, WlsDomainCredential.Strategy strategy) {
        super();
        this.type = type;
        this.strategy = strategy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of credential.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The strategy for passing new WebLogic credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("strategy")
        private WlsDomainCredential.Strategy strategy;

        /**
         * The strategy for passing new WebLogic credential.
         *
         * @param strategy the value to set
         * @return this builder
         */
        public Builder strategy(WlsDomainCredential.Strategy strategy) {
            this.strategy = strategy;
            this.__explicitlySet__.add("strategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WlsDomainCredentialSummary build() {
            WlsDomainCredentialSummary model =
                    new WlsDomainCredentialSummary(this.type, this.strategy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WlsDomainCredentialSummary model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("strategy")) {
                this.strategy(model.getStrategy());
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

    /** The type of credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of credential.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** The strategy for passing new WebLogic credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("strategy")
    private final WlsDomainCredential.Strategy strategy;

    /**
     * The strategy for passing new WebLogic credential.
     *
     * @return the value
     */
    public WlsDomainCredential.Strategy getStrategy() {
        return strategy;
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
        sb.append("WlsDomainCredentialSummary(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", strategy=").append(String.valueOf(this.strategy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WlsDomainCredentialSummary)) {
            return false;
        }

        WlsDomainCredentialSummary other = (WlsDomainCredentialSummary) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.strategy, other.strategy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.strategy == null ? 43 : this.strategy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
