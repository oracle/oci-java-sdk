/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to download a masking report. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DownloadMaskingReportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DownloadMaskingReportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reportId", "reportFormat"})
    public DownloadMaskingReportDetails(String reportId, ReportFormat reportFormat) {
        super();
        this.reportId = reportId;
        this.reportFormat = reportFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the masking report to be downloaded. */
        @com.fasterxml.jackson.annotation.JsonProperty("reportId")
        private String reportId;

        /**
         * The OCID of the masking report to be downloaded.
         *
         * @param reportId the value to set
         * @return this builder
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            this.__explicitlySet__.add("reportId");
            return this;
        }
        /** Format of the report. */
        @com.fasterxml.jackson.annotation.JsonProperty("reportFormat")
        private ReportFormat reportFormat;

        /**
         * Format of the report.
         *
         * @param reportFormat the value to set
         * @return this builder
         */
        public Builder reportFormat(ReportFormat reportFormat) {
            this.reportFormat = reportFormat;
            this.__explicitlySet__.add("reportFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DownloadMaskingReportDetails build() {
            DownloadMaskingReportDetails model =
                    new DownloadMaskingReportDetails(this.reportId, this.reportFormat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DownloadMaskingReportDetails model) {
            if (model.wasPropertyExplicitlySet("reportId")) {
                this.reportId(model.getReportId());
            }
            if (model.wasPropertyExplicitlySet("reportFormat")) {
                this.reportFormat(model.getReportFormat());
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

    /** The OCID of the masking report to be downloaded. */
    @com.fasterxml.jackson.annotation.JsonProperty("reportId")
    private final String reportId;

    /**
     * The OCID of the masking report to be downloaded.
     *
     * @return the value
     */
    public String getReportId() {
        return reportId;
    }

    /** Format of the report. */
    public enum ReportFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Pdf("PDF"),
        Xls("XLS"),
        ;

        private final String value;
        private static java.util.Map<String, ReportFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (ReportFormat v : ReportFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReportFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReportFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReportFormat: " + key);
        }
    };
    /** Format of the report. */
    @com.fasterxml.jackson.annotation.JsonProperty("reportFormat")
    private final ReportFormat reportFormat;

    /**
     * Format of the report.
     *
     * @return the value
     */
    public ReportFormat getReportFormat() {
        return reportFormat;
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
        sb.append("DownloadMaskingReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("reportId=").append(String.valueOf(this.reportId));
        sb.append(", reportFormat=").append(String.valueOf(this.reportFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadMaskingReportDetails)) {
            return false;
        }

        DownloadMaskingReportDetails other = (DownloadMaskingReportDetails) o;
        return java.util.Objects.equals(this.reportId, other.reportId)
                && java.util.Objects.equals(this.reportFormat, other.reportFormat)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reportId == null ? 43 : this.reportId.hashCode());
        result = (result * PRIME) + (this.reportFormat == null ? 43 : this.reportFormat.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
