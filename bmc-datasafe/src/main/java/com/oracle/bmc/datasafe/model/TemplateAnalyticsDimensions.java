/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The scope of analytics data. <br>
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
        builder = TemplateAnalyticsDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TemplateAnalyticsDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "templateAssessmentId",
        "totalChecks",
        "templateBaselineAssessmentId",
        "targetId",
        "targetDatabaseGroupId",
        "isGroup",
        "isCompared",
        "timeLastCompared",
        "isCompliant",
        "totalChecksFailed",
        "totalTargets",
        "totalNonCompliantTargets"
    })
    public TemplateAnalyticsDimensions(
            String templateAssessmentId,
            Integer totalChecks,
            String templateBaselineAssessmentId,
            String targetId,
            String targetDatabaseGroupId,
            Boolean isGroup,
            Boolean isCompared,
            java.util.Date timeLastCompared,
            Boolean isCompliant,
            Integer totalChecksFailed,
            Integer totalTargets,
            Integer totalNonCompliantTargets) {
        super();
        this.templateAssessmentId = templateAssessmentId;
        this.totalChecks = totalChecks;
        this.templateBaselineAssessmentId = templateBaselineAssessmentId;
        this.targetId = targetId;
        this.targetDatabaseGroupId = targetDatabaseGroupId;
        this.isGroup = isGroup;
        this.isCompared = isCompared;
        this.timeLastCompared = timeLastCompared;
        this.isCompliant = isCompliant;
        this.totalChecksFailed = totalChecksFailed;
        this.totalTargets = totalTargets;
        this.totalNonCompliantTargets = totalNonCompliantTargets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the security assessment of type TEMPLATE. */
        @com.fasterxml.jackson.annotation.JsonProperty("templateAssessmentId")
        private String templateAssessmentId;

        /**
         * The OCID of the security assessment of type TEMPLATE.
         *
         * @param templateAssessmentId the value to set
         * @return this builder
         */
        public Builder templateAssessmentId(String templateAssessmentId) {
            this.templateAssessmentId = templateAssessmentId;
            this.__explicitlySet__.add("templateAssessmentId");
            return this;
        }
        /** The number of checks inside the template assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalChecks")
        private Integer totalChecks;

        /**
         * The number of checks inside the template assessment.
         *
         * @param totalChecks the value to set
         * @return this builder
         */
        public Builder totalChecks(Integer totalChecks) {
            this.totalChecks = totalChecks;
            this.__explicitlySet__.add("totalChecks");
            return this;
        }
        /** The OCID of the security assessment of type TEMPLATE_BASELINE. */
        @com.fasterxml.jackson.annotation.JsonProperty("templateBaselineAssessmentId")
        private String templateBaselineAssessmentId;

        /**
         * The OCID of the security assessment of type TEMPLATE_BASELINE.
         *
         * @param templateBaselineAssessmentId the value to set
         * @return this builder
         */
        public Builder templateBaselineAssessmentId(String templateBaselineAssessmentId) {
            this.templateBaselineAssessmentId = templateBaselineAssessmentId;
            this.__explicitlySet__.add("templateBaselineAssessmentId");
            return this;
        }
        /**
         * The OCID of the target database. This field will be in the response if the template was
         * applied on an individual target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database. This field will be in the response if the template was
         * applied on an individual target.
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
         * The OCID of the target database group that the group assessment is created for. This
         * field will be in the response if the template was applied on a target group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseGroupId")
        private String targetDatabaseGroupId;

        /**
         * The OCID of the target database group that the group assessment is created for. This
         * field will be in the response if the template was applied on a target group.
         *
         * @param targetDatabaseGroupId the value to set
         * @return this builder
         */
        public Builder targetDatabaseGroupId(String targetDatabaseGroupId) {
            this.targetDatabaseGroupId = targetDatabaseGroupId;
            this.__explicitlySet__.add("targetDatabaseGroupId");
            return this;
        }
        /**
         * Indicates whether or not the template security assessment is applied to a target group.
         * If the value is false, it means the template security assessment is applied to a
         * individual target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isGroup")
        private Boolean isGroup;

        /**
         * Indicates whether or not the template security assessment is applied to a target group.
         * If the value is false, it means the template security assessment is applied to a
         * individual target.
         *
         * @param isGroup the value to set
         * @return this builder
         */
        public Builder isGroup(Boolean isGroup) {
            this.isGroup = isGroup;
            this.__explicitlySet__.add("isGroup");
            return this;
        }
        /**
         * Indicates whether or not the comparison between the latest assessment and the template
         * baseline assessment is done. If the value is false, it means the comparison is not done
         * yet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCompared")
        private Boolean isCompared;

        /**
         * Indicates whether or not the comparison between the latest assessment and the template
         * baseline assessment is done. If the value is false, it means the comparison is not done
         * yet.
         *
         * @param isCompared the value to set
         * @return this builder
         */
        public Builder isCompared(Boolean isCompared) {
            this.isCompared = isCompared;
            this.__explicitlySet__.add("isCompared");
            return this;
        }
        /**
         * The date and time when the comparison was made upon the template baseline. Conforms to
         * the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastCompared")
        private java.util.Date timeLastCompared;

        /**
         * The date and time when the comparison was made upon the template baseline. Conforms to
         * the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeLastCompared the value to set
         * @return this builder
         */
        public Builder timeLastCompared(java.util.Date timeLastCompared) {
            this.timeLastCompared = timeLastCompared;
            this.__explicitlySet__.add("timeLastCompared");
            return this;
        }
        /**
         * Indicates whether or not the latest assessment is compliant with the template baseline
         * assessment. If the value is false, it means there is drift in the comparison report and
         * the totalChecksFailed field will have a non-zero value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCompliant")
        private Boolean isCompliant;

        /**
         * Indicates whether or not the latest assessment is compliant with the template baseline
         * assessment. If the value is false, it means there is drift in the comparison report and
         * the totalChecksFailed field will have a non-zero value.
         *
         * @param isCompliant the value to set
         * @return this builder
         */
        public Builder isCompliant(Boolean isCompliant) {
            this.isCompliant = isCompliant;
            this.__explicitlySet__.add("isCompliant");
            return this;
        }
        /**
         * Indicates how many checks in the template have drifts in the comparison report. This
         * field is only present if isCompliant is false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalChecksFailed")
        private Integer totalChecksFailed;

        /**
         * Indicates how many checks in the template have drifts in the comparison report. This
         * field is only present if isCompliant is false.
         *
         * @param totalChecksFailed the value to set
         * @return this builder
         */
        public Builder totalChecksFailed(Integer totalChecksFailed) {
            this.totalChecksFailed = totalChecksFailed;
            this.__explicitlySet__.add("totalChecksFailed");
            return this;
        }
        /**
         * The number of the target(s) inside the target group for which the template baseline
         * assessment was created for. If the isGroup field is false, the value will be 1,
         * representing the single target.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalTargets")
        private Integer totalTargets;

        /**
         * The number of the target(s) inside the target group for which the template baseline
         * assessment was created for. If the isGroup field is false, the value will be 1,
         * representing the single target.
         *
         * @param totalTargets the value to set
         * @return this builder
         */
        public Builder totalTargets(Integer totalTargets) {
            this.totalTargets = totalTargets;
            this.__explicitlySet__.add("totalTargets");
            return this;
        }
        /**
         * The number of the target(s) that have drifts in the comparison report. This field is only
         * present if isCompared is true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalNonCompliantTargets")
        private Integer totalNonCompliantTargets;

        /**
         * The number of the target(s) that have drifts in the comparison report. This field is only
         * present if isCompared is true.
         *
         * @param totalNonCompliantTargets the value to set
         * @return this builder
         */
        public Builder totalNonCompliantTargets(Integer totalNonCompliantTargets) {
            this.totalNonCompliantTargets = totalNonCompliantTargets;
            this.__explicitlySet__.add("totalNonCompliantTargets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TemplateAnalyticsDimensions build() {
            TemplateAnalyticsDimensions model =
                    new TemplateAnalyticsDimensions(
                            this.templateAssessmentId,
                            this.totalChecks,
                            this.templateBaselineAssessmentId,
                            this.targetId,
                            this.targetDatabaseGroupId,
                            this.isGroup,
                            this.isCompared,
                            this.timeLastCompared,
                            this.isCompliant,
                            this.totalChecksFailed,
                            this.totalTargets,
                            this.totalNonCompliantTargets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TemplateAnalyticsDimensions model) {
            if (model.wasPropertyExplicitlySet("templateAssessmentId")) {
                this.templateAssessmentId(model.getTemplateAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("totalChecks")) {
                this.totalChecks(model.getTotalChecks());
            }
            if (model.wasPropertyExplicitlySet("templateBaselineAssessmentId")) {
                this.templateBaselineAssessmentId(model.getTemplateBaselineAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseGroupId")) {
                this.targetDatabaseGroupId(model.getTargetDatabaseGroupId());
            }
            if (model.wasPropertyExplicitlySet("isGroup")) {
                this.isGroup(model.getIsGroup());
            }
            if (model.wasPropertyExplicitlySet("isCompared")) {
                this.isCompared(model.getIsCompared());
            }
            if (model.wasPropertyExplicitlySet("timeLastCompared")) {
                this.timeLastCompared(model.getTimeLastCompared());
            }
            if (model.wasPropertyExplicitlySet("isCompliant")) {
                this.isCompliant(model.getIsCompliant());
            }
            if (model.wasPropertyExplicitlySet("totalChecksFailed")) {
                this.totalChecksFailed(model.getTotalChecksFailed());
            }
            if (model.wasPropertyExplicitlySet("totalTargets")) {
                this.totalTargets(model.getTotalTargets());
            }
            if (model.wasPropertyExplicitlySet("totalNonCompliantTargets")) {
                this.totalNonCompliantTargets(model.getTotalNonCompliantTargets());
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

    /** The OCID of the security assessment of type TEMPLATE. */
    @com.fasterxml.jackson.annotation.JsonProperty("templateAssessmentId")
    private final String templateAssessmentId;

    /**
     * The OCID of the security assessment of type TEMPLATE.
     *
     * @return the value
     */
    public String getTemplateAssessmentId() {
        return templateAssessmentId;
    }

    /** The number of checks inside the template assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalChecks")
    private final Integer totalChecks;

    /**
     * The number of checks inside the template assessment.
     *
     * @return the value
     */
    public Integer getTotalChecks() {
        return totalChecks;
    }

    /** The OCID of the security assessment of type TEMPLATE_BASELINE. */
    @com.fasterxml.jackson.annotation.JsonProperty("templateBaselineAssessmentId")
    private final String templateBaselineAssessmentId;

    /**
     * The OCID of the security assessment of type TEMPLATE_BASELINE.
     *
     * @return the value
     */
    public String getTemplateBaselineAssessmentId() {
        return templateBaselineAssessmentId;
    }

    /**
     * The OCID of the target database. This field will be in the response if the template was
     * applied on an individual target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database. This field will be in the response if the template was
     * applied on an individual target.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * The OCID of the target database group that the group assessment is created for. This field
     * will be in the response if the template was applied on a target group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseGroupId")
    private final String targetDatabaseGroupId;

    /**
     * The OCID of the target database group that the group assessment is created for. This field
     * will be in the response if the template was applied on a target group.
     *
     * @return the value
     */
    public String getTargetDatabaseGroupId() {
        return targetDatabaseGroupId;
    }

    /**
     * Indicates whether or not the template security assessment is applied to a target group. If
     * the value is false, it means the template security assessment is applied to a individual
     * target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isGroup")
    private final Boolean isGroup;

    /**
     * Indicates whether or not the template security assessment is applied to a target group. If
     * the value is false, it means the template security assessment is applied to a individual
     * target.
     *
     * @return the value
     */
    public Boolean getIsGroup() {
        return isGroup;
    }

    /**
     * Indicates whether or not the comparison between the latest assessment and the template
     * baseline assessment is done. If the value is false, it means the comparison is not done yet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCompared")
    private final Boolean isCompared;

    /**
     * Indicates whether or not the comparison between the latest assessment and the template
     * baseline assessment is done. If the value is false, it means the comparison is not done yet.
     *
     * @return the value
     */
    public Boolean getIsCompared() {
        return isCompared;
    }

    /**
     * The date and time when the comparison was made upon the template baseline. Conforms to the
     * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastCompared")
    private final java.util.Date timeLastCompared;

    /**
     * The date and time when the comparison was made upon the template baseline. Conforms to the
     * format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeLastCompared() {
        return timeLastCompared;
    }

    /**
     * Indicates whether or not the latest assessment is compliant with the template baseline
     * assessment. If the value is false, it means there is drift in the comparison report and the
     * totalChecksFailed field will have a non-zero value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCompliant")
    private final Boolean isCompliant;

    /**
     * Indicates whether or not the latest assessment is compliant with the template baseline
     * assessment. If the value is false, it means there is drift in the comparison report and the
     * totalChecksFailed field will have a non-zero value.
     *
     * @return the value
     */
    public Boolean getIsCompliant() {
        return isCompliant;
    }

    /**
     * Indicates how many checks in the template have drifts in the comparison report. This field is
     * only present if isCompliant is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalChecksFailed")
    private final Integer totalChecksFailed;

    /**
     * Indicates how many checks in the template have drifts in the comparison report. This field is
     * only present if isCompliant is false.
     *
     * @return the value
     */
    public Integer getTotalChecksFailed() {
        return totalChecksFailed;
    }

    /**
     * The number of the target(s) inside the target group for which the template baseline
     * assessment was created for. If the isGroup field is false, the value will be 1, representing
     * the single target.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTargets")
    private final Integer totalTargets;

    /**
     * The number of the target(s) inside the target group for which the template baseline
     * assessment was created for. If the isGroup field is false, the value will be 1, representing
     * the single target.
     *
     * @return the value
     */
    public Integer getTotalTargets() {
        return totalTargets;
    }

    /**
     * The number of the target(s) that have drifts in the comparison report. This field is only
     * present if isCompared is true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalNonCompliantTargets")
    private final Integer totalNonCompliantTargets;

    /**
     * The number of the target(s) that have drifts in the comparison report. This field is only
     * present if isCompared is true.
     *
     * @return the value
     */
    public Integer getTotalNonCompliantTargets() {
        return totalNonCompliantTargets;
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
        sb.append("TemplateAnalyticsDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("templateAssessmentId=").append(String.valueOf(this.templateAssessmentId));
        sb.append(", totalChecks=").append(String.valueOf(this.totalChecks));
        sb.append(", templateBaselineAssessmentId=")
                .append(String.valueOf(this.templateBaselineAssessmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetDatabaseGroupId=").append(String.valueOf(this.targetDatabaseGroupId));
        sb.append(", isGroup=").append(String.valueOf(this.isGroup));
        sb.append(", isCompared=").append(String.valueOf(this.isCompared));
        sb.append(", timeLastCompared=").append(String.valueOf(this.timeLastCompared));
        sb.append(", isCompliant=").append(String.valueOf(this.isCompliant));
        sb.append(", totalChecksFailed=").append(String.valueOf(this.totalChecksFailed));
        sb.append(", totalTargets=").append(String.valueOf(this.totalTargets));
        sb.append(", totalNonCompliantTargets=")
                .append(String.valueOf(this.totalNonCompliantTargets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TemplateAnalyticsDimensions)) {
            return false;
        }

        TemplateAnalyticsDimensions other = (TemplateAnalyticsDimensions) o;
        return java.util.Objects.equals(this.templateAssessmentId, other.templateAssessmentId)
                && java.util.Objects.equals(this.totalChecks, other.totalChecks)
                && java.util.Objects.equals(
                        this.templateBaselineAssessmentId, other.templateBaselineAssessmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetDatabaseGroupId, other.targetDatabaseGroupId)
                && java.util.Objects.equals(this.isGroup, other.isGroup)
                && java.util.Objects.equals(this.isCompared, other.isCompared)
                && java.util.Objects.equals(this.timeLastCompared, other.timeLastCompared)
                && java.util.Objects.equals(this.isCompliant, other.isCompliant)
                && java.util.Objects.equals(this.totalChecksFailed, other.totalChecksFailed)
                && java.util.Objects.equals(this.totalTargets, other.totalTargets)
                && java.util.Objects.equals(
                        this.totalNonCompliantTargets, other.totalNonCompliantTargets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.templateAssessmentId == null
                                ? 43
                                : this.templateAssessmentId.hashCode());
        result = (result * PRIME) + (this.totalChecks == null ? 43 : this.totalChecks.hashCode());
        result =
                (result * PRIME)
                        + (this.templateBaselineAssessmentId == null
                                ? 43
                                : this.templateBaselineAssessmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseGroupId == null
                                ? 43
                                : this.targetDatabaseGroupId.hashCode());
        result = (result * PRIME) + (this.isGroup == null ? 43 : this.isGroup.hashCode());
        result = (result * PRIME) + (this.isCompared == null ? 43 : this.isCompared.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastCompared == null ? 43 : this.timeLastCompared.hashCode());
        result = (result * PRIME) + (this.isCompliant == null ? 43 : this.isCompliant.hashCode());
        result =
                (result * PRIME)
                        + (this.totalChecksFailed == null ? 43 : this.totalChecksFailed.hashCode());
        result = (result * PRIME) + (this.totalTargets == null ? 43 : this.totalTargets.hashCode());
        result =
                (result * PRIME)
                        + (this.totalNonCompliantTargets == null
                                ? 43
                                : this.totalNonCompliantTargets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
