/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details for calculating audit data volume collected by data safe. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CalculateAuditVolumeCollectedDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CalculateAuditVolumeCollectedDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeFromMonth", "timeToMonth"})
    public CalculateAuditVolumeCollectedDetails(
            java.util.Date timeFromMonth, java.util.Date timeToMonth) {
        super();
        this.timeFromMonth = timeFromMonth;
        this.timeToMonth = timeToMonth;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date from which the audit volume collected by data safe has to be calculated, in the
         * format defined by RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFromMonth")
        private java.util.Date timeFromMonth;

        /**
         * The date from which the audit volume collected by data safe has to be calculated, in the
         * format defined by RFC3339.
         *
         * @param timeFromMonth the value to set
         * @return this builder
         */
        public Builder timeFromMonth(java.util.Date timeFromMonth) {
            this.timeFromMonth = timeFromMonth;
            this.__explicitlySet__.add("timeFromMonth");
            return this;
        }
        /**
         * The date from which the audit volume collected by data safe has to be calculated, in the
         * format defined by RFC3339. If not specified, this will default to the current date.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeToMonth")
        private java.util.Date timeToMonth;

        /**
         * The date from which the audit volume collected by data safe has to be calculated, in the
         * format defined by RFC3339. If not specified, this will default to the current date.
         *
         * @param timeToMonth the value to set
         * @return this builder
         */
        public Builder timeToMonth(java.util.Date timeToMonth) {
            this.timeToMonth = timeToMonth;
            this.__explicitlySet__.add("timeToMonth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CalculateAuditVolumeCollectedDetails build() {
            CalculateAuditVolumeCollectedDetails model =
                    new CalculateAuditVolumeCollectedDetails(this.timeFromMonth, this.timeToMonth);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CalculateAuditVolumeCollectedDetails model) {
            if (model.wasPropertyExplicitlySet("timeFromMonth")) {
                this.timeFromMonth(model.getTimeFromMonth());
            }
            if (model.wasPropertyExplicitlySet("timeToMonth")) {
                this.timeToMonth(model.getTimeToMonth());
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
     * The date from which the audit volume collected by data safe has to be calculated, in the
     * format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFromMonth")
    private final java.util.Date timeFromMonth;

    /**
     * The date from which the audit volume collected by data safe has to be calculated, in the
     * format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeFromMonth() {
        return timeFromMonth;
    }

    /**
     * The date from which the audit volume collected by data safe has to be calculated, in the
     * format defined by RFC3339. If not specified, this will default to the current date.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeToMonth")
    private final java.util.Date timeToMonth;

    /**
     * The date from which the audit volume collected by data safe has to be calculated, in the
     * format defined by RFC3339. If not specified, this will default to the current date.
     *
     * @return the value
     */
    public java.util.Date getTimeToMonth() {
        return timeToMonth;
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
        sb.append("CalculateAuditVolumeCollectedDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeFromMonth=").append(String.valueOf(this.timeFromMonth));
        sb.append(", timeToMonth=").append(String.valueOf(this.timeToMonth));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalculateAuditVolumeCollectedDetails)) {
            return false;
        }

        CalculateAuditVolumeCollectedDetails other = (CalculateAuditVolumeCollectedDetails) o;
        return java.util.Objects.equals(this.timeFromMonth, other.timeFromMonth)
                && java.util.Objects.equals(this.timeToMonth, other.timeToMonth)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeFromMonth == null ? 43 : this.timeFromMonth.hashCode());
        result = (result * PRIME) + (this.timeToMonth == null ? 43 : this.timeToMonth.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
