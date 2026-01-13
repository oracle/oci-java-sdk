/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of audit log of risk updates of findings of specified security assessment. <br>
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
        builder = FindingsChangeAuditLogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FindingsChangeAuditLogSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "findingKey",
        "findingTitle",
        "assessmentId",
        "targetId",
        "timeUpdated",
        "severity",
        "oracleDefinedSeverity",
        "isRiskDeferred",
        "previousSeverity",
        "justification",
        "timeValidUntil",
        "modifiedBy"
    })
    public FindingsChangeAuditLogSummary(
            String key,
            String findingKey,
            String findingTitle,
            String assessmentId,
            String targetId,
            java.util.Date timeUpdated,
            Finding.Severity severity,
            Finding.Severity oracleDefinedSeverity,
            Boolean isRiskDeferred,
            Finding.Severity previousSeverity,
            String justification,
            java.util.Date timeValidUntil,
            String modifiedBy) {
        super();
        this.key = key;
        this.findingKey = findingKey;
        this.findingTitle = findingTitle;
        this.assessmentId = assessmentId;
        this.targetId = targetId;
        this.timeUpdated = timeUpdated;
        this.severity = severity;
        this.oracleDefinedSeverity = oracleDefinedSeverity;
        this.isRiskDeferred = isRiskDeferred;
        this.previousSeverity = previousSeverity;
        this.justification = justification;
        this.timeValidUntil = timeValidUntil;
        this.modifiedBy = modifiedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique key that identifies the finding risk change. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies the finding risk change.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The unique key that identifies the finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("findingKey")
        private String findingKey;

        /**
         * The unique key that identifies the finding.
         *
         * @param findingKey the value to set
         * @return this builder
         */
        public Builder findingKey(String findingKey) {
            this.findingKey = findingKey;
            this.__explicitlySet__.add("findingKey");
            return this;
        }
        /** The short title for the finding whose risk is being modified. */
        @com.fasterxml.jackson.annotation.JsonProperty("findingTitle")
        private String findingTitle;

        /**
         * The short title for the finding whose risk is being modified.
         *
         * @param findingTitle the value to set
         * @return this builder
         */
        public Builder findingTitle(String findingTitle) {
            this.findingTitle = findingTitle;
            this.__explicitlySet__.add("findingTitle");
            return this;
        }
        /** The OCID of the latest security assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * The OCID of the latest security assessment.
         *
         * @param assessmentId the value to set
         * @return this builder
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            this.__explicitlySet__.add("assessmentId");
            return this;
        }
        /** The OCID of the target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The date and time the risk level of finding was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the risk level of finding was last updated, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The original severity / risk level of the finding as determined by security assessment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Finding.Severity severity;

        /**
         * The original severity / risk level of the finding as determined by security assessment.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Finding.Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** The severity of the finding as determined by security assessment by Oracle. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleDefinedSeverity")
        private Finding.Severity oracleDefinedSeverity;

        /**
         * The severity of the finding as determined by security assessment by Oracle.
         *
         * @param oracleDefinedSeverity the value to set
         * @return this builder
         */
        public Builder oracleDefinedSeverity(Finding.Severity oracleDefinedSeverity) {
            this.oracleDefinedSeverity = oracleDefinedSeverity;
            this.__explicitlySet__.add("oracleDefinedSeverity");
            return this;
        }
        /**
         * Determines if the user has deferred the risk level of this finding when he is ok with it
         * and does not plan to do anything about it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRiskDeferred")
        private Boolean isRiskDeferred;

        /**
         * Determines if the user has deferred the risk level of this finding when he is ok with it
         * and does not plan to do anything about it.
         *
         * @param isRiskDeferred the value to set
         * @return this builder
         */
        public Builder isRiskDeferred(Boolean isRiskDeferred) {
            this.isRiskDeferred = isRiskDeferred;
            this.__explicitlySet__.add("isRiskDeferred");
            return this;
        }
        /** If the risk level is changed more than once, the previous modified value. */
        @com.fasterxml.jackson.annotation.JsonProperty("previousSeverity")
        private Finding.Severity previousSeverity;

        /**
         * If the risk level is changed more than once, the previous modified value.
         *
         * @param previousSeverity the value to set
         * @return this builder
         */
        public Builder previousSeverity(Finding.Severity previousSeverity) {
            this.previousSeverity = previousSeverity;
            this.__explicitlySet__.add("previousSeverity");
            return this;
        }
        /** The justification given by the user for accepting or modifying the risk level. */
        @com.fasterxml.jackson.annotation.JsonProperty("justification")
        private String justification;

        /**
         * The justification given by the user for accepting or modifying the risk level.
         *
         * @param justification the value to set
         * @return this builder
         */
        public Builder justification(String justification) {
            this.justification = justification;
            this.__explicitlySet__.add("justification");
            return this;
        }
        /**
         * The date and time, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), the risk level change as updated by user
         * is valid until. After this date passes, the risk level will be that of what is determined
         * by the latest security assessment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidUntil")
        private java.util.Date timeValidUntil;

        /**
         * The date and time, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339), the risk level change as updated by user
         * is valid until. After this date passes, the risk level will be that of what is determined
         * by the latest security assessment.
         *
         * @param timeValidUntil the value to set
         * @return this builder
         */
        public Builder timeValidUntil(java.util.Date timeValidUntil) {
            this.timeValidUntil = timeValidUntil;
            this.__explicitlySet__.add("timeValidUntil");
            return this;
        }
        /** The user who initiated change of risk level of the finding */
        @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
        private String modifiedBy;

        /**
         * The user who initiated change of risk level of the finding
         *
         * @param modifiedBy the value to set
         * @return this builder
         */
        public Builder modifiedBy(String modifiedBy) {
            this.modifiedBy = modifiedBy;
            this.__explicitlySet__.add("modifiedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FindingsChangeAuditLogSummary build() {
            FindingsChangeAuditLogSummary model =
                    new FindingsChangeAuditLogSummary(
                            this.key,
                            this.findingKey,
                            this.findingTitle,
                            this.assessmentId,
                            this.targetId,
                            this.timeUpdated,
                            this.severity,
                            this.oracleDefinedSeverity,
                            this.isRiskDeferred,
                            this.previousSeverity,
                            this.justification,
                            this.timeValidUntil,
                            this.modifiedBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FindingsChangeAuditLogSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("findingKey")) {
                this.findingKey(model.getFindingKey());
            }
            if (model.wasPropertyExplicitlySet("findingTitle")) {
                this.findingTitle(model.getFindingTitle());
            }
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("oracleDefinedSeverity")) {
                this.oracleDefinedSeverity(model.getOracleDefinedSeverity());
            }
            if (model.wasPropertyExplicitlySet("isRiskDeferred")) {
                this.isRiskDeferred(model.getIsRiskDeferred());
            }
            if (model.wasPropertyExplicitlySet("previousSeverity")) {
                this.previousSeverity(model.getPreviousSeverity());
            }
            if (model.wasPropertyExplicitlySet("justification")) {
                this.justification(model.getJustification());
            }
            if (model.wasPropertyExplicitlySet("timeValidUntil")) {
                this.timeValidUntil(model.getTimeValidUntil());
            }
            if (model.wasPropertyExplicitlySet("modifiedBy")) {
                this.modifiedBy(model.getModifiedBy());
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

    /** The unique key that identifies the finding risk change. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies the finding risk change.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The unique key that identifies the finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("findingKey")
    private final String findingKey;

    /**
     * The unique key that identifies the finding.
     *
     * @return the value
     */
    public String getFindingKey() {
        return findingKey;
    }

    /** The short title for the finding whose risk is being modified. */
    @com.fasterxml.jackson.annotation.JsonProperty("findingTitle")
    private final String findingTitle;

    /**
     * The short title for the finding whose risk is being modified.
     *
     * @return the value
     */
    public String getFindingTitle() {
        return findingTitle;
    }

    /** The OCID of the latest security assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * The OCID of the latest security assessment.
     *
     * @return the value
     */
    public String getAssessmentId() {
        return assessmentId;
    }

    /** The OCID of the target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * The date and time the risk level of finding was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the risk level of finding was last updated, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The original severity / risk level of the finding as determined by security assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Finding.Severity severity;

    /**
     * The original severity / risk level of the finding as determined by security assessment.
     *
     * @return the value
     */
    public Finding.Severity getSeverity() {
        return severity;
    }

    /** The severity of the finding as determined by security assessment by Oracle. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDefinedSeverity")
    private final Finding.Severity oracleDefinedSeverity;

    /**
     * The severity of the finding as determined by security assessment by Oracle.
     *
     * @return the value
     */
    public Finding.Severity getOracleDefinedSeverity() {
        return oracleDefinedSeverity;
    }

    /**
     * Determines if the user has deferred the risk level of this finding when he is ok with it and
     * does not plan to do anything about it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRiskDeferred")
    private final Boolean isRiskDeferred;

    /**
     * Determines if the user has deferred the risk level of this finding when he is ok with it and
     * does not plan to do anything about it.
     *
     * @return the value
     */
    public Boolean getIsRiskDeferred() {
        return isRiskDeferred;
    }

    /** If the risk level is changed more than once, the previous modified value. */
    @com.fasterxml.jackson.annotation.JsonProperty("previousSeverity")
    private final Finding.Severity previousSeverity;

    /**
     * If the risk level is changed more than once, the previous modified value.
     *
     * @return the value
     */
    public Finding.Severity getPreviousSeverity() {
        return previousSeverity;
    }

    /** The justification given by the user for accepting or modifying the risk level. */
    @com.fasterxml.jackson.annotation.JsonProperty("justification")
    private final String justification;

    /**
     * The justification given by the user for accepting or modifying the risk level.
     *
     * @return the value
     */
    public String getJustification() {
        return justification;
    }

    /**
     * The date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * the risk level change as updated by user is valid until. After this date passes, the risk
     * level will be that of what is determined by the latest security assessment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidUntil")
    private final java.util.Date timeValidUntil;

    /**
     * The date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * the risk level change as updated by user is valid until. After this date passes, the risk
     * level will be that of what is determined by the latest security assessment.
     *
     * @return the value
     */
    public java.util.Date getTimeValidUntil() {
        return timeValidUntil;
    }

    /** The user who initiated change of risk level of the finding */
    @com.fasterxml.jackson.annotation.JsonProperty("modifiedBy")
    private final String modifiedBy;

    /**
     * The user who initiated change of risk level of the finding
     *
     * @return the value
     */
    public String getModifiedBy() {
        return modifiedBy;
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
        sb.append("FindingsChangeAuditLogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", findingKey=").append(String.valueOf(this.findingKey));
        sb.append(", findingTitle=").append(String.valueOf(this.findingTitle));
        sb.append(", assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", oracleDefinedSeverity=").append(String.valueOf(this.oracleDefinedSeverity));
        sb.append(", isRiskDeferred=").append(String.valueOf(this.isRiskDeferred));
        sb.append(", previousSeverity=").append(String.valueOf(this.previousSeverity));
        sb.append(", justification=").append(String.valueOf(this.justification));
        sb.append(", timeValidUntil=").append(String.valueOf(this.timeValidUntil));
        sb.append(", modifiedBy=").append(String.valueOf(this.modifiedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FindingsChangeAuditLogSummary)) {
            return false;
        }

        FindingsChangeAuditLogSummary other = (FindingsChangeAuditLogSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.findingKey, other.findingKey)
                && java.util.Objects.equals(this.findingTitle, other.findingTitle)
                && java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.oracleDefinedSeverity, other.oracleDefinedSeverity)
                && java.util.Objects.equals(this.isRiskDeferred, other.isRiskDeferred)
                && java.util.Objects.equals(this.previousSeverity, other.previousSeverity)
                && java.util.Objects.equals(this.justification, other.justification)
                && java.util.Objects.equals(this.timeValidUntil, other.timeValidUntil)
                && java.util.Objects.equals(this.modifiedBy, other.modifiedBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        result = (result * PRIME) + (this.findingTitle == null ? 43 : this.findingTitle.hashCode());
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleDefinedSeverity == null
                                ? 43
                                : this.oracleDefinedSeverity.hashCode());
        result =
                (result * PRIME)
                        + (this.isRiskDeferred == null ? 43 : this.isRiskDeferred.hashCode());
        result =
                (result * PRIME)
                        + (this.previousSeverity == null ? 43 : this.previousSeverity.hashCode());
        result =
                (result * PRIME)
                        + (this.justification == null ? 43 : this.justification.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidUntil == null ? 43 : this.timeValidUntil.hashCode());
        result = (result * PRIME) + (this.modifiedBy == null ? 43 : this.modifiedBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
