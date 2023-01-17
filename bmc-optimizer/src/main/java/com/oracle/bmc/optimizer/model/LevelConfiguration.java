/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * Details about the configuration level for the recommendation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LevelConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LevelConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"recommendationId", "level"})
    public LevelConfiguration(String recommendationId, String level) {
        super();
        this.recommendationId = recommendationId;
        this.level = level;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique OCID of the recommendation. */
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationId")
        private String recommendationId;

        /**
         * The unique OCID of the recommendation.
         *
         * @param recommendationId the value to set
         * @return this builder
         */
        public Builder recommendationId(String recommendationId) {
            this.recommendationId = recommendationId;
            this.__explicitlySet__.add("recommendationId");
            return this;
        }
        /** The pre-defined profile level. */
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private String level;

        /**
         * The pre-defined profile level.
         *
         * @param level the value to set
         * @return this builder
         */
        public Builder level(String level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LevelConfiguration build() {
            LevelConfiguration model = new LevelConfiguration(this.recommendationId, this.level);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LevelConfiguration model) {
            if (model.wasPropertyExplicitlySet("recommendationId")) {
                this.recommendationId(model.getRecommendationId());
            }
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
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

    /** The unique OCID of the recommendation. */
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationId")
    private final String recommendationId;

    /**
     * The unique OCID of the recommendation.
     *
     * @return the value
     */
    public String getRecommendationId() {
        return recommendationId;
    }

    /** The pre-defined profile level. */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final String level;

    /**
     * The pre-defined profile level.
     *
     * @return the value
     */
    public String getLevel() {
        return level;
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
        sb.append("LevelConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("recommendationId=").append(String.valueOf(this.recommendationId));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LevelConfiguration)) {
            return false;
        }

        LevelConfiguration other = (LevelConfiguration) o;
        return java.util.Objects.equals(this.recommendationId, other.recommendationId)
                && java.util.Objects.equals(this.level, other.level)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.recommendationId == null ? 43 : this.recommendationId.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
