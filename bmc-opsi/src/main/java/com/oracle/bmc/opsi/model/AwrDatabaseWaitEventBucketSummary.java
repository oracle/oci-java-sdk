/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * A summary of the AWR wait event bucket and waits percentage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AwrDatabaseWaitEventBucketSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AwrDatabaseWaitEventBucketSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"category", "percentage"})
    public AwrDatabaseWaitEventBucketSummary(String category, Double percentage) {
        super();
        this.category = category;
        this.percentage = percentage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the wait event frequency category. Normally, it is the upper range of the
         * waits within the AWR wait event bucket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * The name of the wait event frequency category. Normally, it is the upper range of the
         * waits within the AWR wait event bucket.
         *
         * @param category the value to set
         * @return this builder
         */
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /** The percentage of waits in a wait event bucket over the total waits of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentage")
        private Double percentage;

        /**
         * The percentage of waits in a wait event bucket over the total waits of the database.
         *
         * @param percentage the value to set
         * @return this builder
         */
        public Builder percentage(Double percentage) {
            this.percentage = percentage;
            this.__explicitlySet__.add("percentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDatabaseWaitEventBucketSummary build() {
            AwrDatabaseWaitEventBucketSummary model =
                    new AwrDatabaseWaitEventBucketSummary(this.category, this.percentage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDatabaseWaitEventBucketSummary model) {
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("percentage")) {
                this.percentage(model.getPercentage());
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
     * The name of the wait event frequency category. Normally, it is the upper range of the waits
     * within the AWR wait event bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * The name of the wait event frequency category. Normally, it is the upper range of the waits
     * within the AWR wait event bucket.
     *
     * @return the value
     */
    public String getCategory() {
        return category;
    }

    /** The percentage of waits in a wait event bucket over the total waits of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentage")
    private final Double percentage;

    /**
     * The percentage of waits in a wait event bucket over the total waits of the database.
     *
     * @return the value
     */
    public Double getPercentage() {
        return percentage;
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
        sb.append("AwrDatabaseWaitEventBucketSummary(");
        sb.append("super=").append(super.toString());
        sb.append("category=").append(String.valueOf(this.category));
        sb.append(", percentage=").append(String.valueOf(this.percentage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDatabaseWaitEventBucketSummary)) {
            return false;
        }

        AwrDatabaseWaitEventBucketSummary other = (AwrDatabaseWaitEventBucketSummary) o;
        return java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.percentage, other.percentage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.percentage == null ? 43 : this.percentage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
