/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The results of the comparison between two security assessment resources.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityAssessmentComparisonPerTarget.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SecurityAssessmentComparisonPerTarget {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("baselineTargetId")
        private String baselineTargetId;

        public Builder baselineTargetId(String baselineTargetId) {
            this.baselineTargetId = baselineTargetId;
            this.__explicitlySet__.add("baselineTargetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentTargetId")
        private String currentTargetId;

        public Builder currentTargetId(String currentTargetId) {
            this.currentTargetId = currentTargetId;
            this.__explicitlySet__.add("currentTargetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditing")
        private java.util.List<Diffs> auditing;

        public Builder auditing(java.util.List<Diffs> auditing) {
            this.auditing = auditing;
            this.__explicitlySet__.add("auditing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authorizationControl")
        private java.util.List<Diffs> authorizationControl;

        public Builder authorizationControl(java.util.List<Diffs> authorizationControl) {
            this.authorizationControl = authorizationControl;
            this.__explicitlySet__.add("authorizationControl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataEncryption")
        private java.util.List<Diffs> dataEncryption;

        public Builder dataEncryption(java.util.List<Diffs> dataEncryption) {
            this.dataEncryption = dataEncryption;
            this.__explicitlySet__.add("dataEncryption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbConfiguration")
        private java.util.List<Diffs> dbConfiguration;

        public Builder dbConfiguration(java.util.List<Diffs> dbConfiguration) {
            this.dbConfiguration = dbConfiguration;
            this.__explicitlySet__.add("dbConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControl")
        private java.util.List<Diffs> fineGrainedAccessControl;

        public Builder fineGrainedAccessControl(java.util.List<Diffs> fineGrainedAccessControl) {
            this.fineGrainedAccessControl = fineGrainedAccessControl;
            this.__explicitlySet__.add("fineGrainedAccessControl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRoles")
        private java.util.List<Diffs> privilegesAndRoles;

        public Builder privilegesAndRoles(java.util.List<Diffs> privilegesAndRoles) {
            this.privilegesAndRoles = privilegesAndRoles;
            this.__explicitlySet__.add("privilegesAndRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userAccounts")
        private java.util.List<Diffs> userAccounts;

        public Builder userAccounts(java.util.List<Diffs> userAccounts) {
            this.userAccounts = userAccounts;
            this.__explicitlySet__.add("userAccounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAssessmentComparisonPerTarget build() {
            SecurityAssessmentComparisonPerTarget __instance__ =
                    new SecurityAssessmentComparisonPerTarget(
                            baselineTargetId,
                            currentTargetId,
                            auditing,
                            authorizationControl,
                            dataEncryption,
                            dbConfiguration,
                            fineGrainedAccessControl,
                            privilegesAndRoles,
                            userAccounts);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessmentComparisonPerTarget o) {
            Builder copiedBuilder =
                    baselineTargetId(o.getBaselineTargetId())
                            .currentTargetId(o.getCurrentTargetId())
                            .auditing(o.getAuditing())
                            .authorizationControl(o.getAuthorizationControl())
                            .dataEncryption(o.getDataEncryption())
                            .dbConfiguration(o.getDbConfiguration())
                            .fineGrainedAccessControl(o.getFineGrainedAccessControl())
                            .privilegesAndRoles(o.getPrivilegesAndRoles())
                            .userAccounts(o.getUserAccounts());

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

    /**
     * The OCID of the target that is used as a baseline in this comparison.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineTargetId")
    String baselineTargetId;

    /**
     * The OCID of the target to be compared against the baseline target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentTargetId")
    String currentTargetId;

    /**
     * A comparison between findings belonging to Auditing category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditing")
    java.util.List<Diffs> auditing;

    /**
     * A comparison between findings belonging to Authorization Control category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationControl")
    java.util.List<Diffs> authorizationControl;

    /**
     * Comparison between findings belonging to Data Encryption category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataEncryption")
    java.util.List<Diffs> dataEncryption;

    /**
     * Comparison between findings belonging to Database Configuration category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbConfiguration")
    java.util.List<Diffs> dbConfiguration;

    /**
     * Comparison between findings belonging to Fine-Grained Access Control category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControl")
    java.util.List<Diffs> fineGrainedAccessControl;

    /**
     * Comparison between findings belonging to Privileges and Roles category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRoles")
    java.util.List<Diffs> privilegesAndRoles;

    /**
     * Comparison between findings belonging to User Accounts category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userAccounts")
    java.util.List<Diffs> userAccounts;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
