/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * SQL Plan details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SqlPlanSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlPlanSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"planHash", "planContent"})
    public SqlPlanSummary(Long planHash, String planContent) {
        super();
        this.planHash = planHash;
        this.planContent = planContent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Plan hash value for the SQL Execution Plan
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planHash")
        private Long planHash;

        /**
         * Plan hash value for the SQL Execution Plan
         * @param planHash the value to set
         * @return this builder
         **/
        public Builder planHash(Long planHash) {
            this.planHash = planHash;
            this.__explicitlySet__.add("planHash");
            return this;
        }
        /**
         * Plan XML Content
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planContent")
        private String planContent;

        /**
         * Plan XML Content
         * @param planContent the value to set
         * @return this builder
         **/
        public Builder planContent(String planContent) {
            this.planContent = planContent;
            this.__explicitlySet__.add("planContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanSummary build() {
            SqlPlanSummary __instance__ = new SqlPlanSummary(planHash, planContent);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanSummary o) {
            Builder copiedBuilder = planHash(o.getPlanHash()).planContent(o.getPlanContent());

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
     * Plan hash value for the SQL Execution Plan
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planHash")
    private final Long planHash;

    /**
     * Plan hash value for the SQL Execution Plan
     * @return the value
     **/
    public Long getPlanHash() {
        return planHash;
    }

    /**
     * Plan XML Content
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planContent")
    private final String planContent;

    /**
     * Plan XML Content
     * @return the value
     **/
    public String getPlanContent() {
        return planContent;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SqlPlanSummary(");
        sb.append("planHash=").append(String.valueOf(this.planHash));
        sb.append(", planContent=").append(String.valueOf(this.planContent));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlPlanSummary)) {
            return false;
        }

        SqlPlanSummary other = (SqlPlanSummary) o;
        return java.util.Objects.equals(this.planHash, other.planHash)
                && java.util.Objects.equals(this.planContent, other.planContent)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.planHash == null ? 43 : this.planHash.hashCode());
        result = (result * PRIME) + (this.planContent == null ? 43 : this.planContent.hashCode());
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
