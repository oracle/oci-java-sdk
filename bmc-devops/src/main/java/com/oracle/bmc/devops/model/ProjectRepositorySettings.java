/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * User configured settings for project resources and their child repositories. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProjectRepositorySettings.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProjectRepositorySettings
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"mergeSettings", "approvalRules"})
    public ProjectRepositorySettings(
            MergeSettings mergeSettings, ApprovalRuleCollection approvalRules) {
        super();
        this.mergeSettings = mergeSettings;
        this.approvalRules = approvalRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("mergeSettings")
        private MergeSettings mergeSettings;

        public Builder mergeSettings(MergeSettings mergeSettings) {
            this.mergeSettings = mergeSettings;
            this.__explicitlySet__.add("mergeSettings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("approvalRules")
        private ApprovalRuleCollection approvalRules;

        public Builder approvalRules(ApprovalRuleCollection approvalRules) {
            this.approvalRules = approvalRules;
            this.__explicitlySet__.add("approvalRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProjectRepositorySettings build() {
            ProjectRepositorySettings model =
                    new ProjectRepositorySettings(this.mergeSettings, this.approvalRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProjectRepositorySettings model) {
            if (model.wasPropertyExplicitlySet("mergeSettings")) {
                this.mergeSettings(model.getMergeSettings());
            }
            if (model.wasPropertyExplicitlySet("approvalRules")) {
                this.approvalRules(model.getApprovalRules());
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

    @com.fasterxml.jackson.annotation.JsonProperty("mergeSettings")
    private final MergeSettings mergeSettings;

    public MergeSettings getMergeSettings() {
        return mergeSettings;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("approvalRules")
    private final ApprovalRuleCollection approvalRules;

    public ApprovalRuleCollection getApprovalRules() {
        return approvalRules;
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
        sb.append("ProjectRepositorySettings(");
        sb.append("super=").append(super.toString());
        sb.append("mergeSettings=").append(String.valueOf(this.mergeSettings));
        sb.append(", approvalRules=").append(String.valueOf(this.approvalRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProjectRepositorySettings)) {
            return false;
        }

        ProjectRepositorySettings other = (ProjectRepositorySettings) o;
        return java.util.Objects.equals(this.mergeSettings, other.mergeSettings)
                && java.util.Objects.equals(this.approvalRules, other.approvalRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mergeSettings == null ? 43 : this.mergeSettings.hashCode());
        result =
                (result * PRIME)
                        + (this.approvalRules == null ? 43 : this.approvalRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
