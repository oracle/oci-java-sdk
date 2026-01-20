/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The scope of template association analytics data. <br>
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
        builder = TemplateAssociationAnalyticsDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TemplateAssociationAnalyticsDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "templateAssessmentId",
        "templateBaselineAssessmentId",
        "targetDatabaseGroupId",
        "targetId"
    })
    public TemplateAssociationAnalyticsDimensions(
            String templateAssessmentId,
            String templateBaselineAssessmentId,
            String targetDatabaseGroupId,
            String targetId) {
        super();
        this.templateAssessmentId = templateAssessmentId;
        this.templateBaselineAssessmentId = templateBaselineAssessmentId;
        this.targetDatabaseGroupId = targetDatabaseGroupId;
        this.targetId = targetId;
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
         * The OCID of the target database. If the template was applied on a target group, this
         * field will be the OCID of the target members of the target group. If the template was
         * applied on an individual target, this field will contain that targetId.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target database. If the template was applied on a target group, this
         * field will be the OCID of the target members of the target group. If the template was
         * applied on an individual target, this field will contain that targetId.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TemplateAssociationAnalyticsDimensions build() {
            TemplateAssociationAnalyticsDimensions model =
                    new TemplateAssociationAnalyticsDimensions(
                            this.templateAssessmentId,
                            this.templateBaselineAssessmentId,
                            this.targetDatabaseGroupId,
                            this.targetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TemplateAssociationAnalyticsDimensions model) {
            if (model.wasPropertyExplicitlySet("templateAssessmentId")) {
                this.templateAssessmentId(model.getTemplateAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("templateBaselineAssessmentId")) {
                this.templateBaselineAssessmentId(model.getTemplateBaselineAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseGroupId")) {
                this.targetDatabaseGroupId(model.getTargetDatabaseGroupId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
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
     * The OCID of the target database. If the template was applied on a target group, this field
     * will be the OCID of the target members of the target group. If the template was applied on an
     * individual target, this field will contain that targetId.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target database. If the template was applied on a target group, this field
     * will be the OCID of the target members of the target group. If the template was applied on an
     * individual target, this field will contain that targetId.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
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
        sb.append("TemplateAssociationAnalyticsDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("templateAssessmentId=").append(String.valueOf(this.templateAssessmentId));
        sb.append(", templateBaselineAssessmentId=")
                .append(String.valueOf(this.templateBaselineAssessmentId));
        sb.append(", targetDatabaseGroupId=").append(String.valueOf(this.targetDatabaseGroupId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TemplateAssociationAnalyticsDimensions)) {
            return false;
        }

        TemplateAssociationAnalyticsDimensions other = (TemplateAssociationAnalyticsDimensions) o;
        return java.util.Objects.equals(this.templateAssessmentId, other.templateAssessmentId)
                && java.util.Objects.equals(
                        this.templateBaselineAssessmentId, other.templateBaselineAssessmentId)
                && java.util.Objects.equals(this.targetDatabaseGroupId, other.targetDatabaseGroupId)
                && java.util.Objects.equals(this.targetId, other.targetId)
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
        result =
                (result * PRIME)
                        + (this.templateBaselineAssessmentId == null
                                ? 43
                                : this.templateBaselineAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDatabaseGroupId == null
                                ? 43
                                : this.targetDatabaseGroupId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
