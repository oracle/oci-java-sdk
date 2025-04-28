/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * FieldSummaryReport <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FieldSummaryReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FieldSummaryReport
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nonOobCount", "oobCount", "usageDetails"})
    public FieldSummaryReport(
            Integer nonOobCount, Integer oobCount, java.util.List<UsageStatusItem> usageDetails) {
        super();
        this.nonOobCount = nonOobCount;
        this.oobCount = oobCount;
        this.usageDetails = usageDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The count of custom (user defined) fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("nonOobCount")
        private Integer nonOobCount;

        /**
         * The count of custom (user defined) fields.
         *
         * @param nonOobCount the value to set
         * @return this builder
         */
        public Builder nonOobCount(Integer nonOobCount) {
            this.nonOobCount = nonOobCount;
            this.__explicitlySet__.add("nonOobCount");
            return this;
        }
        /** The count of built in fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("oobCount")
        private Integer oobCount;

        /**
         * The count of built in fields.
         *
         * @param oobCount the value to set
         * @return this builder
         */
        public Builder oobCount(Integer oobCount) {
            this.oobCount = oobCount;
            this.__explicitlySet__.add("oobCount");
            return this;
        }
        /** Field usage detailss */
        @com.fasterxml.jackson.annotation.JsonProperty("usageDetails")
        private java.util.List<UsageStatusItem> usageDetails;

        /**
         * Field usage detailss
         *
         * @param usageDetails the value to set
         * @return this builder
         */
        public Builder usageDetails(java.util.List<UsageStatusItem> usageDetails) {
            this.usageDetails = usageDetails;
            this.__explicitlySet__.add("usageDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FieldSummaryReport build() {
            FieldSummaryReport model =
                    new FieldSummaryReport(this.nonOobCount, this.oobCount, this.usageDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FieldSummaryReport model) {
            if (model.wasPropertyExplicitlySet("nonOobCount")) {
                this.nonOobCount(model.getNonOobCount());
            }
            if (model.wasPropertyExplicitlySet("oobCount")) {
                this.oobCount(model.getOobCount());
            }
            if (model.wasPropertyExplicitlySet("usageDetails")) {
                this.usageDetails(model.getUsageDetails());
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

    /** The count of custom (user defined) fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("nonOobCount")
    private final Integer nonOobCount;

    /**
     * The count of custom (user defined) fields.
     *
     * @return the value
     */
    public Integer getNonOobCount() {
        return nonOobCount;
    }

    /** The count of built in fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("oobCount")
    private final Integer oobCount;

    /**
     * The count of built in fields.
     *
     * @return the value
     */
    public Integer getOobCount() {
        return oobCount;
    }

    /** Field usage detailss */
    @com.fasterxml.jackson.annotation.JsonProperty("usageDetails")
    private final java.util.List<UsageStatusItem> usageDetails;

    /**
     * Field usage detailss
     *
     * @return the value
     */
    public java.util.List<UsageStatusItem> getUsageDetails() {
        return usageDetails;
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
        sb.append("FieldSummaryReport(");
        sb.append("super=").append(super.toString());
        sb.append("nonOobCount=").append(String.valueOf(this.nonOobCount));
        sb.append(", oobCount=").append(String.valueOf(this.oobCount));
        sb.append(", usageDetails=").append(String.valueOf(this.usageDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FieldSummaryReport)) {
            return false;
        }

        FieldSummaryReport other = (FieldSummaryReport) o;
        return java.util.Objects.equals(this.nonOobCount, other.nonOobCount)
                && java.util.Objects.equals(this.oobCount, other.oobCount)
                && java.util.Objects.equals(this.usageDetails, other.usageDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nonOobCount == null ? 43 : this.nonOobCount.hashCode());
        result = (result * PRIME) + (this.oobCount == null ? 43 : this.oobCount.hashCode());
        result = (result * PRIME) + (this.usageDetails == null ? 43 : this.usageDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
