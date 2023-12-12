/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Config for incremental read operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IncrementalReadConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IncrementalReadConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lastExtractedFieldDate", "lastExtractedDataEntityDate"})
    public IncrementalReadConfig(
            java.util.List<IncrementalFieldClause> lastExtractedFieldDate,
            java.util.List<IncrementalDataEntityClause> lastExtractedDataEntityDate) {
        super();
        this.lastExtractedFieldDate = lastExtractedFieldDate;
        this.lastExtractedDataEntityDate = lastExtractedDataEntityDate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of incremental field clauses. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastExtractedFieldDate")
        private java.util.List<IncrementalFieldClause> lastExtractedFieldDate;

        /**
         * List of incremental field clauses.
         *
         * @param lastExtractedFieldDate the value to set
         * @return this builder
         */
        public Builder lastExtractedFieldDate(
                java.util.List<IncrementalFieldClause> lastExtractedFieldDate) {
            this.lastExtractedFieldDate = lastExtractedFieldDate;
            this.__explicitlySet__.add("lastExtractedFieldDate");
            return this;
        }
        /** List of incremental data entity clauses. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastExtractedDataEntityDate")
        private java.util.List<IncrementalDataEntityClause> lastExtractedDataEntityDate;

        /**
         * List of incremental data entity clauses.
         *
         * @param lastExtractedDataEntityDate the value to set
         * @return this builder
         */
        public Builder lastExtractedDataEntityDate(
                java.util.List<IncrementalDataEntityClause> lastExtractedDataEntityDate) {
            this.lastExtractedDataEntityDate = lastExtractedDataEntityDate;
            this.__explicitlySet__.add("lastExtractedDataEntityDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IncrementalReadConfig build() {
            IncrementalReadConfig model =
                    new IncrementalReadConfig(
                            this.lastExtractedFieldDate, this.lastExtractedDataEntityDate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IncrementalReadConfig model) {
            if (model.wasPropertyExplicitlySet("lastExtractedFieldDate")) {
                this.lastExtractedFieldDate(model.getLastExtractedFieldDate());
            }
            if (model.wasPropertyExplicitlySet("lastExtractedDataEntityDate")) {
                this.lastExtractedDataEntityDate(model.getLastExtractedDataEntityDate());
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

    /** List of incremental field clauses. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastExtractedFieldDate")
    private final java.util.List<IncrementalFieldClause> lastExtractedFieldDate;

    /**
     * List of incremental field clauses.
     *
     * @return the value
     */
    public java.util.List<IncrementalFieldClause> getLastExtractedFieldDate() {
        return lastExtractedFieldDate;
    }

    /** List of incremental data entity clauses. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastExtractedDataEntityDate")
    private final java.util.List<IncrementalDataEntityClause> lastExtractedDataEntityDate;

    /**
     * List of incremental data entity clauses.
     *
     * @return the value
     */
    public java.util.List<IncrementalDataEntityClause> getLastExtractedDataEntityDate() {
        return lastExtractedDataEntityDate;
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
        sb.append("IncrementalReadConfig(");
        sb.append("super=").append(super.toString());
        sb.append("lastExtractedFieldDate=").append(String.valueOf(this.lastExtractedFieldDate));
        sb.append(", lastExtractedDataEntityDate=")
                .append(String.valueOf(this.lastExtractedDataEntityDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncrementalReadConfig)) {
            return false;
        }

        IncrementalReadConfig other = (IncrementalReadConfig) o;
        return java.util.Objects.equals(this.lastExtractedFieldDate, other.lastExtractedFieldDate)
                && java.util.Objects.equals(
                        this.lastExtractedDataEntityDate, other.lastExtractedDataEntityDate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.lastExtractedFieldDate == null
                                ? 43
                                : this.lastExtractedFieldDate.hashCode());
        result =
                (result * PRIME)
                        + (this.lastExtractedDataEntityDate == null
                                ? 43
                                : this.lastExtractedDataEntityDate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
