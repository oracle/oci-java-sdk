/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * The audit log report details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DelegatedResourceAccessRequestAuditLogReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DelegatedResourceAccessRequestAuditLogReport
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "report",
        "processTree",
        "auditReportStatus",
        "timeReportGenerated"
    })
    public DelegatedResourceAccessRequestAuditLogReport(
            String report,
            String processTree,
            AuditReportStatus auditReportStatus,
            java.util.Date timeReportGenerated) {
        super();
        this.report = report;
        this.processTree = processTree;
        this.auditReportStatus = auditReportStatus;
        this.timeReportGenerated = timeReportGenerated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Audit log report. */
        @com.fasterxml.jackson.annotation.JsonProperty("report")
        private String report;

        /**
         * Audit log report.
         *
         * @param report the value to set
         * @return this builder
         */
        public Builder report(String report) {
            this.report = report;
            this.__explicitlySet__.add("report");
            return this;
        }
        /** The process tree data */
        @com.fasterxml.jackson.annotation.JsonProperty("processTree")
        private String processTree;

        /**
         * The process tree data
         *
         * @param processTree the value to set
         * @return this builder
         */
        public Builder processTree(String processTree) {
            this.processTree = processTree;
            this.__explicitlySet__.add("processTree");
            return this;
        }
        /** Status of the audit report */
        @com.fasterxml.jackson.annotation.JsonProperty("auditReportStatus")
        private AuditReportStatus auditReportStatus;

        /**
         * Status of the audit report
         *
         * @param auditReportStatus the value to set
         * @return this builder
         */
        public Builder auditReportStatus(AuditReportStatus auditReportStatus) {
            this.auditReportStatus = auditReportStatus;
            this.__explicitlySet__.add("auditReportStatus");
            return this;
        }
        /**
         * Time when the audit report was generated [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format, e.g. '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReportGenerated")
        private java.util.Date timeReportGenerated;

        /**
         * Time when the audit report was generated [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * timestamp format, e.g. '2020-05-22T21:10:29.600Z'
         *
         * @param timeReportGenerated the value to set
         * @return this builder
         */
        public Builder timeReportGenerated(java.util.Date timeReportGenerated) {
            this.timeReportGenerated = timeReportGenerated;
            this.__explicitlySet__.add("timeReportGenerated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DelegatedResourceAccessRequestAuditLogReport build() {
            DelegatedResourceAccessRequestAuditLogReport model =
                    new DelegatedResourceAccessRequestAuditLogReport(
                            this.report,
                            this.processTree,
                            this.auditReportStatus,
                            this.timeReportGenerated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DelegatedResourceAccessRequestAuditLogReport model) {
            if (model.wasPropertyExplicitlySet("report")) {
                this.report(model.getReport());
            }
            if (model.wasPropertyExplicitlySet("processTree")) {
                this.processTree(model.getProcessTree());
            }
            if (model.wasPropertyExplicitlySet("auditReportStatus")) {
                this.auditReportStatus(model.getAuditReportStatus());
            }
            if (model.wasPropertyExplicitlySet("timeReportGenerated")) {
                this.timeReportGenerated(model.getTimeReportGenerated());
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

    /** Audit log report. */
    @com.fasterxml.jackson.annotation.JsonProperty("report")
    private final String report;

    /**
     * Audit log report.
     *
     * @return the value
     */
    public String getReport() {
        return report;
    }

    /** The process tree data */
    @com.fasterxml.jackson.annotation.JsonProperty("processTree")
    private final String processTree;

    /**
     * The process tree data
     *
     * @return the value
     */
    public String getProcessTree() {
        return processTree;
    }

    /** Status of the audit report */
    @com.fasterxml.jackson.annotation.JsonProperty("auditReportStatus")
    private final AuditReportStatus auditReportStatus;

    /**
     * Status of the audit report
     *
     * @return the value
     */
    public AuditReportStatus getAuditReportStatus() {
        return auditReportStatus;
    }

    /**
     * Time when the audit report was generated [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReportGenerated")
    private final java.util.Date timeReportGenerated;

    /**
     * Time when the audit report was generated [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeReportGenerated() {
        return timeReportGenerated;
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
        sb.append("DelegatedResourceAccessRequestAuditLogReport(");
        sb.append("super=").append(super.toString());
        sb.append("report=").append(String.valueOf(this.report));
        sb.append(", processTree=").append(String.valueOf(this.processTree));
        sb.append(", auditReportStatus=").append(String.valueOf(this.auditReportStatus));
        sb.append(", timeReportGenerated=").append(String.valueOf(this.timeReportGenerated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DelegatedResourceAccessRequestAuditLogReport)) {
            return false;
        }

        DelegatedResourceAccessRequestAuditLogReport other =
                (DelegatedResourceAccessRequestAuditLogReport) o;
        return java.util.Objects.equals(this.report, other.report)
                && java.util.Objects.equals(this.processTree, other.processTree)
                && java.util.Objects.equals(this.auditReportStatus, other.auditReportStatus)
                && java.util.Objects.equals(this.timeReportGenerated, other.timeReportGenerated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.report == null ? 43 : this.report.hashCode());
        result = (result * PRIME) + (this.processTree == null ? 43 : this.processTree.hashCode());
        result =
                (result * PRIME)
                        + (this.auditReportStatus == null ? 43 : this.auditReportStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeReportGenerated == null
                                ? 43
                                : this.timeReportGenerated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
