/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to generate a downloadable masking report.
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
    builder = GenerateMaskingReportForDownloadDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GenerateMaskingReportForDownloadDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"reportId", "reportFormat"})
    public GenerateMaskingReportForDownloadDetails(String reportId, ReportFormat reportFormat) {
        super();
        this.reportId = reportId;
        this.reportFormat = reportFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the masking report for which a downloadable file is to be generated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reportId")
        private String reportId;

        /**
         * The OCID of the masking report for which a downloadable file is to be generated.
         * @param reportId the value to set
         * @return this builder
         **/
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            this.__explicitlySet__.add("reportId");
            return this;
        }
        /**
         * Format of the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reportFormat")
        private ReportFormat reportFormat;

        /**
         * Format of the report.
         * @param reportFormat the value to set
         * @return this builder
         **/
        public Builder reportFormat(ReportFormat reportFormat) {
            this.reportFormat = reportFormat;
            this.__explicitlySet__.add("reportFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GenerateMaskingReportForDownloadDetails build() {
            GenerateMaskingReportForDownloadDetails __instance__ =
                    new GenerateMaskingReportForDownloadDetails(reportId, reportFormat);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GenerateMaskingReportForDownloadDetails o) {
            Builder copiedBuilder = reportId(o.getReportId()).reportFormat(o.getReportFormat());

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
     * The OCID of the masking report for which a downloadable file is to be generated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportId")
    private final String reportId;

    /**
     * The OCID of the masking report for which a downloadable file is to be generated.
     * @return the value
     **/
    public String getReportId() {
        return reportId;
    }

    /**
     * Format of the report.
     **/
    public enum ReportFormat {
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
    /**
     * Format of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportFormat")
    private final ReportFormat reportFormat;

    /**
     * Format of the report.
     * @return the value
     **/
    public ReportFormat getReportFormat() {
        return reportFormat;
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
        sb.append("GenerateMaskingReportForDownloadDetails(");
        sb.append("reportId=").append(String.valueOf(this.reportId));
        sb.append(", reportFormat=").append(String.valueOf(this.reportFormat));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GenerateMaskingReportForDownloadDetails)) {
            return false;
        }

        GenerateMaskingReportForDownloadDetails other = (GenerateMaskingReportForDownloadDetails) o;
        return java.util.Objects.equals(this.reportId, other.reportId)
                && java.util.Objects.equals(this.reportFormat, other.reportFormat)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reportId == null ? 43 : this.reportId.hashCode());
        result = (result * PRIME) + (this.reportFormat == null ? 43 : this.reportFormat.hashCode());
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
