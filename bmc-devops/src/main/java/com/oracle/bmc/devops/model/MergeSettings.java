/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Enabled and disabled merge strategies for a project or repository, also contains a default
 * strategy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MergeSettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MergeSettings extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"defaultMergeStrategy", "allowedMergeStrategies"})
    public MergeSettings(
            MergeStrategy defaultMergeStrategy,
            java.util.List<MergeStrategy> allowedMergeStrategies) {
        super();
        this.defaultMergeStrategy = defaultMergeStrategy;
        this.allowedMergeStrategies = allowedMergeStrategies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Default type of merge strategy associated with the a Project or Repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultMergeStrategy")
        private MergeStrategy defaultMergeStrategy;

        /**
         * Default type of merge strategy associated with the a Project or Repository.
         *
         * @param defaultMergeStrategy the value to set
         * @return this builder
         */
        public Builder defaultMergeStrategy(MergeStrategy defaultMergeStrategy) {
            this.defaultMergeStrategy = defaultMergeStrategy;
            this.__explicitlySet__.add("defaultMergeStrategy");
            return this;
        }
        /** List of merge strategies which are allowed for a Project or Repository. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedMergeStrategies")
        private java.util.List<MergeStrategy> allowedMergeStrategies;

        /**
         * List of merge strategies which are allowed for a Project or Repository.
         *
         * @param allowedMergeStrategies the value to set
         * @return this builder
         */
        public Builder allowedMergeStrategies(
                java.util.List<MergeStrategy> allowedMergeStrategies) {
            this.allowedMergeStrategies = allowedMergeStrategies;
            this.__explicitlySet__.add("allowedMergeStrategies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MergeSettings build() {
            MergeSettings model =
                    new MergeSettings(this.defaultMergeStrategy, this.allowedMergeStrategies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MergeSettings model) {
            if (model.wasPropertyExplicitlySet("defaultMergeStrategy")) {
                this.defaultMergeStrategy(model.getDefaultMergeStrategy());
            }
            if (model.wasPropertyExplicitlySet("allowedMergeStrategies")) {
                this.allowedMergeStrategies(model.getAllowedMergeStrategies());
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

    /** Default type of merge strategy associated with the a Project or Repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMergeStrategy")
    private final MergeStrategy defaultMergeStrategy;

    /**
     * Default type of merge strategy associated with the a Project or Repository.
     *
     * @return the value
     */
    public MergeStrategy getDefaultMergeStrategy() {
        return defaultMergeStrategy;
    }

    /** List of merge strategies which are allowed for a Project or Repository. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedMergeStrategies")
    private final java.util.List<MergeStrategy> allowedMergeStrategies;

    /**
     * List of merge strategies which are allowed for a Project or Repository.
     *
     * @return the value
     */
    public java.util.List<MergeStrategy> getAllowedMergeStrategies() {
        return allowedMergeStrategies;
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
        sb.append("MergeSettings(");
        sb.append("super=").append(super.toString());
        sb.append("defaultMergeStrategy=").append(String.valueOf(this.defaultMergeStrategy));
        sb.append(", allowedMergeStrategies=").append(String.valueOf(this.allowedMergeStrategies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MergeSettings)) {
            return false;
        }

        MergeSettings other = (MergeSettings) o;
        return java.util.Objects.equals(this.defaultMergeStrategy, other.defaultMergeStrategy)
                && java.util.Objects.equals(
                        this.allowedMergeStrategies, other.allowedMergeStrategies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultMergeStrategy == null
                                ? 43
                                : this.defaultMergeStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedMergeStrategies == null
                                ? 43
                                : this.allowedMergeStrategies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
