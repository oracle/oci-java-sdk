/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The particular finding reported by the security assessment. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FindingSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FindingSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "severity",
        "assessmentId",
        "targetId",
        "key",
        "isTopFinding",
        "title",
        "remarks",
        "details",
        "summary",
        "oneline",
        "references",
        "oracleDefinedSeverity",
        "isRiskModified",
        "hasTargetDbRiskLevelChanged",
        "justification",
        "timeValidUntil",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails"
    })
    public FindingSummary(
            Severity severity,
            String assessmentId,
            String targetId,
            String key,
            Boolean isTopFinding,
            String title,
            String remarks,
            Object details,
            String summary,
            String oneline,
            References references,
            Finding.Severity oracleDefinedSeverity,
            Boolean isRiskModified,
            Boolean hasTargetDbRiskLevelChanged,
            String justification,
            java.util.Date timeValidUntil,
            java.util.Date timeUpdated,
            FindingLifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.severity = severity;
        this.assessmentId = assessmentId;
        this.targetId = targetId;
        this.key = key;
        this.isTopFinding = isTopFinding;
        this.title = title;
        this.remarks = remarks;
        this.details = details;
        this.summary = summary;
        this.oneline = oneline;
        this.references = references;
        this.oracleDefinedSeverity = oracleDefinedSeverity;
        this.isRiskModified = isRiskModified;
        this.hasTargetDbRiskLevelChanged = hasTargetDbRiskLevelChanged;
        this.justification = justification;
        this.timeValidUntil = timeValidUntil;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The severity of the finding as determined by security assessment and is same as
         * oracleDefinedSeverity, unless modified by user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * The severity of the finding as determined by security assessment and is same as
         * oracleDefinedSeverity, unless modified by user.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** The OCID of the assessment that generated this finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * The OCID of the assessment that generated this finding.
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
         * The unique finding key. This is a system-generated identifier. To get the finding key for
         * a finding, use ListFindings.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique finding key. This is a system-generated identifier. To get the finding key for
         * a finding, use ListFindings.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Indicates whether a given finding is marked as topFinding or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isTopFinding")
        private Boolean isTopFinding;

        /**
         * Indicates whether a given finding is marked as topFinding or not.
         *
         * @param isTopFinding the value to set
         * @return this builder
         */
        public Builder isTopFinding(Boolean isTopFinding) {
            this.isTopFinding = isTopFinding;
            this.__explicitlySet__.add("isTopFinding");
            return this;
        }
        /** The short title for the finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private String title;

        /**
         * The short title for the finding.
         *
         * @param title the value to set
         * @return this builder
         */
        public Builder title(String title) {
            this.title = title;
            this.__explicitlySet__.add("title");
            return this;
        }
        /**
         * The explanation of the issue in this finding. It explains the reason for the rule and, if
         * a risk is reported, it may also explain the recommended actions for remediation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remarks")
        private String remarks;

        /**
         * The explanation of the issue in this finding. It explains the reason for the rule and, if
         * a risk is reported, it may also explain the recommended actions for remediation.
         *
         * @param remarks the value to set
         * @return this builder
         */
        public Builder remarks(String remarks) {
            this.remarks = remarks;
            this.__explicitlySet__.add("remarks");
            return this;
        }
        /**
         * The details of the finding. Provides detailed information to explain the finding summary,
         * typically results from the assessed database, followed by any recommendations for
         * changes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private Object details;

        /**
         * The details of the finding. Provides detailed information to explain the finding summary,
         * typically results from the assessed database, followed by any recommendations for
         * changes.
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(Object details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * The brief summary of the finding. When the finding is informational, the summary
         * typically reports only the number of data elements that were examined.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * The brief summary of the finding. When the finding is informational, the summary
         * typically reports only the number of data elements that were examined.
         *
         * @param summary the value to set
         * @return this builder
         */
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /** Provides a recommended approach to take to remediate the finding reported. */
        @com.fasterxml.jackson.annotation.JsonProperty("oneline")
        private String oneline;

        /**
         * Provides a recommended approach to take to remediate the finding reported.
         *
         * @param oneline the value to set
         * @return this builder
         */
        public Builder oneline(String oneline) {
            this.oneline = oneline;
            this.__explicitlySet__.add("oneline");
            return this;
        }
        /**
         * Provides information on whether the finding is related to a CIS Oracle Database Benchmark
         * recommendation, a STIG rule, or a GDPR Article/Recital.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("references")
        private References references;

        /**
         * Provides information on whether the finding is related to a CIS Oracle Database Benchmark
         * recommendation, a STIG rule, or a GDPR Article/Recital.
         *
         * @param references the value to set
         * @return this builder
         */
        public Builder references(References references) {
            this.references = references;
            this.__explicitlySet__.add("references");
            return this;
        }
        /**
         * The severity of the finding as determined by security assessment. This cannot be modified
         * by user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleDefinedSeverity")
        private Finding.Severity oracleDefinedSeverity;

        /**
         * The severity of the finding as determined by security assessment. This cannot be modified
         * by user.
         *
         * @param oracleDefinedSeverity the value to set
         * @return this builder
         */
        public Builder oracleDefinedSeverity(Finding.Severity oracleDefinedSeverity) {
            this.oracleDefinedSeverity = oracleDefinedSeverity;
            this.__explicitlySet__.add("oracleDefinedSeverity");
            return this;
        }
        /** Determines if this risk level was modified by user. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRiskModified")
        private Boolean isRiskModified;

        /**
         * Determines if this risk level was modified by user.
         *
         * @param isRiskModified the value to set
         * @return this builder
         */
        public Builder isRiskModified(Boolean isRiskModified) {
            this.isRiskModified = isRiskModified;
            this.__explicitlySet__.add("isRiskModified");
            return this;
        }
        /**
         * Determines if this risk level has changed on the target database since the last time
         * 'severity' was modified by user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hasTargetDbRiskLevelChanged")
        private Boolean hasTargetDbRiskLevelChanged;

        /**
         * Determines if this risk level has changed on the target database since the last time
         * 'severity' was modified by user.
         *
         * @param hasTargetDbRiskLevelChanged the value to set
         * @return this builder
         */
        public Builder hasTargetDbRiskLevelChanged(Boolean hasTargetDbRiskLevelChanged) {
            this.hasTargetDbRiskLevelChanged = hasTargetDbRiskLevelChanged;
            this.__explicitlySet__.add("hasTargetDbRiskLevelChanged");
            return this;
        }
        /** User provided reason for accepting or modifying this finding if they choose to do so. */
        @com.fasterxml.jackson.annotation.JsonProperty("justification")
        private String justification;

        /**
         * User provided reason for accepting or modifying this finding if they choose to do so.
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
         * The time until which the change in severity(deferred / modified) of this finding is
         * valid.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidUntil")
        private java.util.Date timeValidUntil;

        /**
         * The time until which the change in severity(deferred / modified) of this finding is
         * valid.
         *
         * @param timeValidUntil the value to set
         * @return this builder
         */
        public Builder timeValidUntil(java.util.Date timeValidUntil) {
            this.timeValidUntil = timeValidUntil;
            this.__explicitlySet__.add("timeValidUntil");
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
        /** The current state of the finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private FindingLifecycleState lifecycleState;

        /**
         * The current state of the finding.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(FindingLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the current state of the finding. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the finding.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FindingSummary build() {
            FindingSummary model =
                    new FindingSummary(
                            this.severity,
                            this.assessmentId,
                            this.targetId,
                            this.key,
                            this.isTopFinding,
                            this.title,
                            this.remarks,
                            this.details,
                            this.summary,
                            this.oneline,
                            this.references,
                            this.oracleDefinedSeverity,
                            this.isRiskModified,
                            this.hasTargetDbRiskLevelChanged,
                            this.justification,
                            this.timeValidUntil,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FindingSummary model) {
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("isTopFinding")) {
                this.isTopFinding(model.getIsTopFinding());
            }
            if (model.wasPropertyExplicitlySet("title")) {
                this.title(model.getTitle());
            }
            if (model.wasPropertyExplicitlySet("remarks")) {
                this.remarks(model.getRemarks());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("oneline")) {
                this.oneline(model.getOneline());
            }
            if (model.wasPropertyExplicitlySet("references")) {
                this.references(model.getReferences());
            }
            if (model.wasPropertyExplicitlySet("oracleDefinedSeverity")) {
                this.oracleDefinedSeverity(model.getOracleDefinedSeverity());
            }
            if (model.wasPropertyExplicitlySet("isRiskModified")) {
                this.isRiskModified(model.getIsRiskModified());
            }
            if (model.wasPropertyExplicitlySet("hasTargetDbRiskLevelChanged")) {
                this.hasTargetDbRiskLevelChanged(model.getHasTargetDbRiskLevelChanged());
            }
            if (model.wasPropertyExplicitlySet("justification")) {
                this.justification(model.getJustification());
            }
            if (model.wasPropertyExplicitlySet("timeValidUntil")) {
                this.timeValidUntil(model.getTimeValidUntil());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The severity of the finding as determined by security assessment and is same as
     * oracleDefinedSeverity, unless modified by user.
     */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        High("HIGH"),
        Medium("MEDIUM"),
        Low("LOW"),
        Evaluate("EVALUATE"),
        Advisory("ADVISORY"),
        Pass("PASS"),
        Deferred("DEFERRED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Severity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The severity of the finding as determined by security assessment and is same as
     * oracleDefinedSeverity, unless modified by user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * The severity of the finding as determined by security assessment and is same as
     * oracleDefinedSeverity, unless modified by user.
     *
     * @return the value
     */
    public Severity getSeverity() {
        return severity;
    }

    /** The OCID of the assessment that generated this finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * The OCID of the assessment that generated this finding.
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
     * The unique finding key. This is a system-generated identifier. To get the finding key for a
     * finding, use ListFindings.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique finding key. This is a system-generated identifier. To get the finding key for a
     * finding, use ListFindings.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Indicates whether a given finding is marked as topFinding or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTopFinding")
    private final Boolean isTopFinding;

    /**
     * Indicates whether a given finding is marked as topFinding or not.
     *
     * @return the value
     */
    public Boolean getIsTopFinding() {
        return isTopFinding;
    }

    /** The short title for the finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("title")
    private final String title;

    /**
     * The short title for the finding.
     *
     * @return the value
     */
    public String getTitle() {
        return title;
    }

    /**
     * The explanation of the issue in this finding. It explains the reason for the rule and, if a
     * risk is reported, it may also explain the recommended actions for remediation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remarks")
    private final String remarks;

    /**
     * The explanation of the issue in this finding. It explains the reason for the rule and, if a
     * risk is reported, it may also explain the recommended actions for remediation.
     *
     * @return the value
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * The details of the finding. Provides detailed information to explain the finding summary,
     * typically results from the assessed database, followed by any recommendations for changes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final Object details;

    /**
     * The details of the finding. Provides detailed information to explain the finding summary,
     * typically results from the assessed database, followed by any recommendations for changes.
     *
     * @return the value
     */
    public Object getDetails() {
        return details;
    }

    /**
     * The brief summary of the finding. When the finding is informational, the summary typically
     * reports only the number of data elements that were examined.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * The brief summary of the finding. When the finding is informational, the summary typically
     * reports only the number of data elements that were examined.
     *
     * @return the value
     */
    public String getSummary() {
        return summary;
    }

    /** Provides a recommended approach to take to remediate the finding reported. */
    @com.fasterxml.jackson.annotation.JsonProperty("oneline")
    private final String oneline;

    /**
     * Provides a recommended approach to take to remediate the finding reported.
     *
     * @return the value
     */
    public String getOneline() {
        return oneline;
    }

    /**
     * Provides information on whether the finding is related to a CIS Oracle Database Benchmark
     * recommendation, a STIG rule, or a GDPR Article/Recital.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("references")
    private final References references;

    /**
     * Provides information on whether the finding is related to a CIS Oracle Database Benchmark
     * recommendation, a STIG rule, or a GDPR Article/Recital.
     *
     * @return the value
     */
    public References getReferences() {
        return references;
    }

    /**
     * The severity of the finding as determined by security assessment. This cannot be modified by
     * user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDefinedSeverity")
    private final Finding.Severity oracleDefinedSeverity;

    /**
     * The severity of the finding as determined by security assessment. This cannot be modified by
     * user.
     *
     * @return the value
     */
    public Finding.Severity getOracleDefinedSeverity() {
        return oracleDefinedSeverity;
    }

    /** Determines if this risk level was modified by user. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRiskModified")
    private final Boolean isRiskModified;

    /**
     * Determines if this risk level was modified by user.
     *
     * @return the value
     */
    public Boolean getIsRiskModified() {
        return isRiskModified;
    }

    /**
     * Determines if this risk level has changed on the target database since the last time
     * 'severity' was modified by user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hasTargetDbRiskLevelChanged")
    private final Boolean hasTargetDbRiskLevelChanged;

    /**
     * Determines if this risk level has changed on the target database since the last time
     * 'severity' was modified by user.
     *
     * @return the value
     */
    public Boolean getHasTargetDbRiskLevelChanged() {
        return hasTargetDbRiskLevelChanged;
    }

    /** User provided reason for accepting or modifying this finding if they choose to do so. */
    @com.fasterxml.jackson.annotation.JsonProperty("justification")
    private final String justification;

    /**
     * User provided reason for accepting or modifying this finding if they choose to do so.
     *
     * @return the value
     */
    public String getJustification() {
        return justification;
    }

    /**
     * The time until which the change in severity(deferred / modified) of this finding is valid.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidUntil")
    private final java.util.Date timeValidUntil;

    /**
     * The time until which the change in severity(deferred / modified) of this finding is valid.
     *
     * @return the value
     */
    public java.util.Date getTimeValidUntil() {
        return timeValidUntil;
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

    /** The current state of the finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final FindingLifecycleState lifecycleState;

    /**
     * The current state of the finding.
     *
     * @return the value
     */
    public FindingLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the current state of the finding. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the finding.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("FindingSummary(");
        sb.append("super=").append(super.toString());
        sb.append("severity=").append(String.valueOf(this.severity));
        sb.append(", assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", isTopFinding=").append(String.valueOf(this.isTopFinding));
        sb.append(", title=").append(String.valueOf(this.title));
        sb.append(", remarks=").append(String.valueOf(this.remarks));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", summary=").append(String.valueOf(this.summary));
        sb.append(", oneline=").append(String.valueOf(this.oneline));
        sb.append(", references=").append(String.valueOf(this.references));
        sb.append(", oracleDefinedSeverity=").append(String.valueOf(this.oracleDefinedSeverity));
        sb.append(", isRiskModified=").append(String.valueOf(this.isRiskModified));
        sb.append(", hasTargetDbRiskLevelChanged=")
                .append(String.valueOf(this.hasTargetDbRiskLevelChanged));
        sb.append(", justification=").append(String.valueOf(this.justification));
        sb.append(", timeValidUntil=").append(String.valueOf(this.timeValidUntil));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FindingSummary)) {
            return false;
        }

        FindingSummary other = (FindingSummary) o;
        return java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.isTopFinding, other.isTopFinding)
                && java.util.Objects.equals(this.title, other.title)
                && java.util.Objects.equals(this.remarks, other.remarks)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.oneline, other.oneline)
                && java.util.Objects.equals(this.references, other.references)
                && java.util.Objects.equals(this.oracleDefinedSeverity, other.oracleDefinedSeverity)
                && java.util.Objects.equals(this.isRiskModified, other.isRiskModified)
                && java.util.Objects.equals(
                        this.hasTargetDbRiskLevelChanged, other.hasTargetDbRiskLevelChanged)
                && java.util.Objects.equals(this.justification, other.justification)
                && java.util.Objects.equals(this.timeValidUntil, other.timeValidUntil)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.isTopFinding == null ? 43 : this.isTopFinding.hashCode());
        result = (result * PRIME) + (this.title == null ? 43 : this.title.hashCode());
        result = (result * PRIME) + (this.remarks == null ? 43 : this.remarks.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.oneline == null ? 43 : this.oneline.hashCode());
        result = (result * PRIME) + (this.references == null ? 43 : this.references.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleDefinedSeverity == null
                                ? 43
                                : this.oracleDefinedSeverity.hashCode());
        result =
                (result * PRIME)
                        + (this.isRiskModified == null ? 43 : this.isRiskModified.hashCode());
        result =
                (result * PRIME)
                        + (this.hasTargetDbRiskLevelChanged == null
                                ? 43
                                : this.hasTargetDbRiskLevelChanged.hashCode());
        result =
                (result * PRIME)
                        + (this.justification == null ? 43 : this.justification.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidUntil == null ? 43 : this.timeValidUntil.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
