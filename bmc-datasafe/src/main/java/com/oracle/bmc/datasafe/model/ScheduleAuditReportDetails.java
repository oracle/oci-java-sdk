/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details for the audit report schedule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ScheduleAuditReportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "reportType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ScheduleAuditReportDetails extends ReportDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies the limit on the number of rows in the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rowLimit")
        private Integer rowLimit;

        /**
         * Specifies the limit on the number of rows in the report.
         * @param rowLimit the value to set
         * @return this builder
         **/
        public Builder rowLimit(Integer rowLimit) {
            this.rowLimit = rowLimit;
            this.__explicitlySet__.add("rowLimit");
            return this;
        }
        /**
         * The time span of records in report to be scheduled.
         * <period-value><period>
         * Allowed period strings - "H","D","M","Y"
         * Each of the above fields potentially introduce constraints. A workRequest is created only
         * when period-value satisfies all the constraints. Constraints introduced:
         * 1. period = H (The allowed range for period-value is [1, 23])
         * 2. period = D (The allowed range for period-value is [1, 30])
         * 3. period = M (The allowed range for period-value is [1, 11])
         * 4. period = Y (The minimum period-value is 1)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recordTimeSpan")
        private String recordTimeSpan;

        /**
         * The time span of records in report to be scheduled.
         * <period-value><period>
         * Allowed period strings - "H","D","M","Y"
         * Each of the above fields potentially introduce constraints. A workRequest is created only
         * when period-value satisfies all the constraints. Constraints introduced:
         * 1. period = H (The allowed range for period-value is [1, 23])
         * 2. period = D (The allowed range for period-value is [1, 30])
         * 3. period = M (The allowed range for period-value is [1, 11])
         * 4. period = Y (The minimum period-value is 1)
         *
         * @param recordTimeSpan the value to set
         * @return this builder
         **/
        public Builder recordTimeSpan(String recordTimeSpan) {
            this.recordTimeSpan = recordTimeSpan;
            this.__explicitlySet__.add("recordTimeSpan");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScheduleAuditReportDetails build() {
            ScheduleAuditReportDetails model =
                    new ScheduleAuditReportDetails(this.rowLimit, this.recordTimeSpan);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScheduleAuditReportDetails model) {
            if (model.wasPropertyExplicitlySet("rowLimit")) {
                this.rowLimit(model.getRowLimit());
            }
            if (model.wasPropertyExplicitlySet("recordTimeSpan")) {
                this.recordTimeSpan(model.getRecordTimeSpan());
            }
            return this;
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

    @Deprecated
    public ScheduleAuditReportDetails(Integer rowLimit, String recordTimeSpan) {
        super();
        this.rowLimit = rowLimit;
        this.recordTimeSpan = recordTimeSpan;
    }

    /**
     * Specifies the limit on the number of rows in the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowLimit")
    private final Integer rowLimit;

    /**
     * Specifies the limit on the number of rows in the report.
     * @return the value
     **/
    public Integer getRowLimit() {
        return rowLimit;
    }

    /**
     * The time span of records in report to be scheduled.
     * <period-value><period>
     * Allowed period strings - "H","D","M","Y"
     * Each of the above fields potentially introduce constraints. A workRequest is created only
     * when period-value satisfies all the constraints. Constraints introduced:
     * 1. period = H (The allowed range for period-value is [1, 23])
     * 2. period = D (The allowed range for period-value is [1, 30])
     * 3. period = M (The allowed range for period-value is [1, 11])
     * 4. period = Y (The minimum period-value is 1)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recordTimeSpan")
    private final String recordTimeSpan;

    /**
     * The time span of records in report to be scheduled.
     * <period-value><period>
     * Allowed period strings - "H","D","M","Y"
     * Each of the above fields potentially introduce constraints. A workRequest is created only
     * when period-value satisfies all the constraints. Constraints introduced:
     * 1. period = H (The allowed range for period-value is [1, 23])
     * 2. period = D (The allowed range for period-value is [1, 30])
     * 3. period = M (The allowed range for period-value is [1, 11])
     * 4. period = Y (The minimum period-value is 1)
     *
     * @return the value
     **/
    public String getRecordTimeSpan() {
        return recordTimeSpan;
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
        sb.append("ScheduleAuditReportDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", rowLimit=").append(String.valueOf(this.rowLimit));
        sb.append(", recordTimeSpan=").append(String.valueOf(this.recordTimeSpan));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScheduleAuditReportDetails)) {
            return false;
        }

        ScheduleAuditReportDetails other = (ScheduleAuditReportDetails) o;
        return java.util.Objects.equals(this.rowLimit, other.rowLimit)
                && java.util.Objects.equals(this.recordTimeSpan, other.recordTimeSpan)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.rowLimit == null ? 43 : this.rowLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.recordTimeSpan == null ? 43 : this.recordTimeSpan.hashCode());
        return result;
    }
}
