/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The results of the comparison between two security assessment resources. <br>
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
        builder = SecurityAssessmentComparisonPerTarget.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SecurityAssessmentComparisonPerTarget
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "baselineTargetId",
        "currentTargetId",
        "auditing",
        "authorizationControl",
        "dataEncryption",
        "dbConfiguration",
        "fineGrainedAccessControl",
        "privilegesAndRoles",
        "userAccounts"
    })
    public SecurityAssessmentComparisonPerTarget(
            String baselineTargetId,
            String currentTargetId,
            java.util.List<Diffs> auditing,
            java.util.List<Diffs> authorizationControl,
            java.util.List<Diffs> dataEncryption,
            java.util.List<Diffs> dbConfiguration,
            java.util.List<Diffs> fineGrainedAccessControl,
            java.util.List<Diffs> privilegesAndRoles,
            java.util.List<Diffs> userAccounts) {
        super();
        this.baselineTargetId = baselineTargetId;
        this.currentTargetId = currentTargetId;
        this.auditing = auditing;
        this.authorizationControl = authorizationControl;
        this.dataEncryption = dataEncryption;
        this.dbConfiguration = dbConfiguration;
        this.fineGrainedAccessControl = fineGrainedAccessControl;
        this.privilegesAndRoles = privilegesAndRoles;
        this.userAccounts = userAccounts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the target that is used as a baseline in this comparison. */
        @com.fasterxml.jackson.annotation.JsonProperty("baselineTargetId")
        private String baselineTargetId;

        /**
         * The OCID of the target that is used as a baseline in this comparison.
         *
         * @param baselineTargetId the value to set
         * @return this builder
         */
        public Builder baselineTargetId(String baselineTargetId) {
            this.baselineTargetId = baselineTargetId;
            this.__explicitlySet__.add("baselineTargetId");
            return this;
        }
        /** The OCID of the target to be compared against the baseline target. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentTargetId")
        private String currentTargetId;

        /**
         * The OCID of the target to be compared against the baseline target.
         *
         * @param currentTargetId the value to set
         * @return this builder
         */
        public Builder currentTargetId(String currentTargetId) {
            this.currentTargetId = currentTargetId;
            this.__explicitlySet__.add("currentTargetId");
            return this;
        }
        /** A comparison between findings belonging to Auditing category. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditing")
        private java.util.List<Diffs> auditing;

        /**
         * A comparison between findings belonging to Auditing category.
         *
         * @param auditing the value to set
         * @return this builder
         */
        public Builder auditing(java.util.List<Diffs> auditing) {
            this.auditing = auditing;
            this.__explicitlySet__.add("auditing");
            return this;
        }
        /** A comparison between findings belonging to Authorization Control category. */
        @com.fasterxml.jackson.annotation.JsonProperty("authorizationControl")
        private java.util.List<Diffs> authorizationControl;

        /**
         * A comparison between findings belonging to Authorization Control category.
         *
         * @param authorizationControl the value to set
         * @return this builder
         */
        public Builder authorizationControl(java.util.List<Diffs> authorizationControl) {
            this.authorizationControl = authorizationControl;
            this.__explicitlySet__.add("authorizationControl");
            return this;
        }
        /** Comparison between findings belonging to Data Encryption category. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataEncryption")
        private java.util.List<Diffs> dataEncryption;

        /**
         * Comparison between findings belonging to Data Encryption category.
         *
         * @param dataEncryption the value to set
         * @return this builder
         */
        public Builder dataEncryption(java.util.List<Diffs> dataEncryption) {
            this.dataEncryption = dataEncryption;
            this.__explicitlySet__.add("dataEncryption");
            return this;
        }
        /** Comparison between findings belonging to Database Configuration category. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbConfiguration")
        private java.util.List<Diffs> dbConfiguration;

        /**
         * Comparison between findings belonging to Database Configuration category.
         *
         * @param dbConfiguration the value to set
         * @return this builder
         */
        public Builder dbConfiguration(java.util.List<Diffs> dbConfiguration) {
            this.dbConfiguration = dbConfiguration;
            this.__explicitlySet__.add("dbConfiguration");
            return this;
        }
        /** Comparison between findings belonging to Fine-Grained Access Control category. */
        @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControl")
        private java.util.List<Diffs> fineGrainedAccessControl;

        /**
         * Comparison between findings belonging to Fine-Grained Access Control category.
         *
         * @param fineGrainedAccessControl the value to set
         * @return this builder
         */
        public Builder fineGrainedAccessControl(java.util.List<Diffs> fineGrainedAccessControl) {
            this.fineGrainedAccessControl = fineGrainedAccessControl;
            this.__explicitlySet__.add("fineGrainedAccessControl");
            return this;
        }
        /** Comparison between findings belonging to Privileges and Roles category. */
        @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRoles")
        private java.util.List<Diffs> privilegesAndRoles;

        /**
         * Comparison between findings belonging to Privileges and Roles category.
         *
         * @param privilegesAndRoles the value to set
         * @return this builder
         */
        public Builder privilegesAndRoles(java.util.List<Diffs> privilegesAndRoles) {
            this.privilegesAndRoles = privilegesAndRoles;
            this.__explicitlySet__.add("privilegesAndRoles");
            return this;
        }
        /** Comparison between findings belonging to User Accounts category. */
        @com.fasterxml.jackson.annotation.JsonProperty("userAccounts")
        private java.util.List<Diffs> userAccounts;

        /**
         * Comparison between findings belonging to User Accounts category.
         *
         * @param userAccounts the value to set
         * @return this builder
         */
        public Builder userAccounts(java.util.List<Diffs> userAccounts) {
            this.userAccounts = userAccounts;
            this.__explicitlySet__.add("userAccounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAssessmentComparisonPerTarget build() {
            SecurityAssessmentComparisonPerTarget model =
                    new SecurityAssessmentComparisonPerTarget(
                            this.baselineTargetId,
                            this.currentTargetId,
                            this.auditing,
                            this.authorizationControl,
                            this.dataEncryption,
                            this.dbConfiguration,
                            this.fineGrainedAccessControl,
                            this.privilegesAndRoles,
                            this.userAccounts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessmentComparisonPerTarget model) {
            if (model.wasPropertyExplicitlySet("baselineTargetId")) {
                this.baselineTargetId(model.getBaselineTargetId());
            }
            if (model.wasPropertyExplicitlySet("currentTargetId")) {
                this.currentTargetId(model.getCurrentTargetId());
            }
            if (model.wasPropertyExplicitlySet("auditing")) {
                this.auditing(model.getAuditing());
            }
            if (model.wasPropertyExplicitlySet("authorizationControl")) {
                this.authorizationControl(model.getAuthorizationControl());
            }
            if (model.wasPropertyExplicitlySet("dataEncryption")) {
                this.dataEncryption(model.getDataEncryption());
            }
            if (model.wasPropertyExplicitlySet("dbConfiguration")) {
                this.dbConfiguration(model.getDbConfiguration());
            }
            if (model.wasPropertyExplicitlySet("fineGrainedAccessControl")) {
                this.fineGrainedAccessControl(model.getFineGrainedAccessControl());
            }
            if (model.wasPropertyExplicitlySet("privilegesAndRoles")) {
                this.privilegesAndRoles(model.getPrivilegesAndRoles());
            }
            if (model.wasPropertyExplicitlySet("userAccounts")) {
                this.userAccounts(model.getUserAccounts());
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

    /** The OCID of the target that is used as a baseline in this comparison. */
    @com.fasterxml.jackson.annotation.JsonProperty("baselineTargetId")
    private final String baselineTargetId;

    /**
     * The OCID of the target that is used as a baseline in this comparison.
     *
     * @return the value
     */
    public String getBaselineTargetId() {
        return baselineTargetId;
    }

    /** The OCID of the target to be compared against the baseline target. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentTargetId")
    private final String currentTargetId;

    /**
     * The OCID of the target to be compared against the baseline target.
     *
     * @return the value
     */
    public String getCurrentTargetId() {
        return currentTargetId;
    }

    /** A comparison between findings belonging to Auditing category. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditing")
    private final java.util.List<Diffs> auditing;

    /**
     * A comparison between findings belonging to Auditing category.
     *
     * @return the value
     */
    public java.util.List<Diffs> getAuditing() {
        return auditing;
    }

    /** A comparison between findings belonging to Authorization Control category. */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationControl")
    private final java.util.List<Diffs> authorizationControl;

    /**
     * A comparison between findings belonging to Authorization Control category.
     *
     * @return the value
     */
    public java.util.List<Diffs> getAuthorizationControl() {
        return authorizationControl;
    }

    /** Comparison between findings belonging to Data Encryption category. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataEncryption")
    private final java.util.List<Diffs> dataEncryption;

    /**
     * Comparison between findings belonging to Data Encryption category.
     *
     * @return the value
     */
    public java.util.List<Diffs> getDataEncryption() {
        return dataEncryption;
    }

    /** Comparison between findings belonging to Database Configuration category. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbConfiguration")
    private final java.util.List<Diffs> dbConfiguration;

    /**
     * Comparison between findings belonging to Database Configuration category.
     *
     * @return the value
     */
    public java.util.List<Diffs> getDbConfiguration() {
        return dbConfiguration;
    }

    /** Comparison between findings belonging to Fine-Grained Access Control category. */
    @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControl")
    private final java.util.List<Diffs> fineGrainedAccessControl;

    /**
     * Comparison between findings belonging to Fine-Grained Access Control category.
     *
     * @return the value
     */
    public java.util.List<Diffs> getFineGrainedAccessControl() {
        return fineGrainedAccessControl;
    }

    /** Comparison between findings belonging to Privileges and Roles category. */
    @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRoles")
    private final java.util.List<Diffs> privilegesAndRoles;

    /**
     * Comparison between findings belonging to Privileges and Roles category.
     *
     * @return the value
     */
    public java.util.List<Diffs> getPrivilegesAndRoles() {
        return privilegesAndRoles;
    }

    /** Comparison between findings belonging to User Accounts category. */
    @com.fasterxml.jackson.annotation.JsonProperty("userAccounts")
    private final java.util.List<Diffs> userAccounts;

    /**
     * Comparison between findings belonging to User Accounts category.
     *
     * @return the value
     */
    public java.util.List<Diffs> getUserAccounts() {
        return userAccounts;
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
        sb.append("SecurityAssessmentComparisonPerTarget(");
        sb.append("super=").append(super.toString());
        sb.append("baselineTargetId=").append(String.valueOf(this.baselineTargetId));
        sb.append(", currentTargetId=").append(String.valueOf(this.currentTargetId));
        sb.append(", auditing=").append(String.valueOf(this.auditing));
        sb.append(", authorizationControl=").append(String.valueOf(this.authorizationControl));
        sb.append(", dataEncryption=").append(String.valueOf(this.dataEncryption));
        sb.append(", dbConfiguration=").append(String.valueOf(this.dbConfiguration));
        sb.append(", fineGrainedAccessControl=")
                .append(String.valueOf(this.fineGrainedAccessControl));
        sb.append(", privilegesAndRoles=").append(String.valueOf(this.privilegesAndRoles));
        sb.append(", userAccounts=").append(String.valueOf(this.userAccounts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityAssessmentComparisonPerTarget)) {
            return false;
        }

        SecurityAssessmentComparisonPerTarget other = (SecurityAssessmentComparisonPerTarget) o;
        return java.util.Objects.equals(this.baselineTargetId, other.baselineTargetId)
                && java.util.Objects.equals(this.currentTargetId, other.currentTargetId)
                && java.util.Objects.equals(this.auditing, other.auditing)
                && java.util.Objects.equals(this.authorizationControl, other.authorizationControl)
                && java.util.Objects.equals(this.dataEncryption, other.dataEncryption)
                && java.util.Objects.equals(this.dbConfiguration, other.dbConfiguration)
                && java.util.Objects.equals(
                        this.fineGrainedAccessControl, other.fineGrainedAccessControl)
                && java.util.Objects.equals(this.privilegesAndRoles, other.privilegesAndRoles)
                && java.util.Objects.equals(this.userAccounts, other.userAccounts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.baselineTargetId == null ? 43 : this.baselineTargetId.hashCode());
        result =
                (result * PRIME)
                        + (this.currentTargetId == null ? 43 : this.currentTargetId.hashCode());
        result = (result * PRIME) + (this.auditing == null ? 43 : this.auditing.hashCode());
        result =
                (result * PRIME)
                        + (this.authorizationControl == null
                                ? 43
                                : this.authorizationControl.hashCode());
        result =
                (result * PRIME)
                        + (this.dataEncryption == null ? 43 : this.dataEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.dbConfiguration == null ? 43 : this.dbConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.fineGrainedAccessControl == null
                                ? 43
                                : this.fineGrainedAccessControl.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegesAndRoles == null
                                ? 43
                                : this.privilegesAndRoles.hashCode());
        result = (result * PRIME) + (this.userAccounts == null ? 43 : this.userAccounts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
