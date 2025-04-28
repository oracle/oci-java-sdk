/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to download a discovery report. <br>
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
        builder = DownloadDiscoveryReportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DownloadDiscoveryReportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"discoveryJobId", "reportFormat"})
    public DownloadDiscoveryReportDetails(String discoveryJobId, ReportFormat reportFormat) {
        super();
        this.discoveryJobId = discoveryJobId;
        this.reportFormat = reportFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the discovery job. */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryJobId")
        private String discoveryJobId;

        /**
         * The OCID of the discovery job.
         *
         * @param discoveryJobId the value to set
         * @return this builder
         */
        public Builder discoveryJobId(String discoveryJobId) {
            this.discoveryJobId = discoveryJobId;
            this.__explicitlySet__.add("discoveryJobId");
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

        public DownloadDiscoveryReportDetails build() {
            DownloadDiscoveryReportDetails model =
                    new DownloadDiscoveryReportDetails(this.discoveryJobId, this.reportFormat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DownloadDiscoveryReportDetails model) {
            if (model.wasPropertyExplicitlySet("discoveryJobId")) {
                this.discoveryJobId(model.getDiscoveryJobId());
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

    /** The OCID of the discovery job. */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryJobId")
    private final String discoveryJobId;

    /**
     * The OCID of the discovery job.
     *
     * @return the value
     */
    public String getDiscoveryJobId() {
        return discoveryJobId;
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
        sb.append("DownloadDiscoveryReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("discoveryJobId=").append(String.valueOf(this.discoveryJobId));
        sb.append(", reportFormat=").append(String.valueOf(this.reportFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadDiscoveryReportDetails)) {
            return false;
        }

        DownloadDiscoveryReportDetails other = (DownloadDiscoveryReportDetails) o;
        return java.util.Objects.equals(this.discoveryJobId, other.discoveryJobId)
                && java.util.Objects.equals(this.reportFormat, other.reportFormat)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.discoveryJobId == null ? 43 : this.discoveryJobId.hashCode());
        result = (result * PRIME) + (this.reportFormat == null ? 43 : this.reportFormat.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
