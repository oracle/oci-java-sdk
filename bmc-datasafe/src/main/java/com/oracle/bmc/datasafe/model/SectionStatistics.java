/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Statistics showing the number of findings with a particular risk level for each category.
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
    builder = SectionStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SectionStatistics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
        private Integer targetsCount;

        public Builder targetsCount(Integer targetsCount) {
            this.targetsCount = targetsCount;
            this.__explicitlySet__.add("targetsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditingFindingsCount")
        private Integer auditingFindingsCount;

        public Builder auditingFindingsCount(Integer auditingFindingsCount) {
            this.auditingFindingsCount = auditingFindingsCount;
            this.__explicitlySet__.add("auditingFindingsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authorizationControlFindingsCount")
        private Integer authorizationControlFindingsCount;

        public Builder authorizationControlFindingsCount(
                Integer authorizationControlFindingsCount) {
            this.authorizationControlFindingsCount = authorizationControlFindingsCount;
            this.__explicitlySet__.add("authorizationControlFindingsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataEncryptionFindingsCount")
        private Integer dataEncryptionFindingsCount;

        public Builder dataEncryptionFindingsCount(Integer dataEncryptionFindingsCount) {
            this.dataEncryptionFindingsCount = dataEncryptionFindingsCount;
            this.__explicitlySet__.add("dataEncryptionFindingsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbConfigurationFindingsCount")
        private Integer dbConfigurationFindingsCount;

        public Builder dbConfigurationFindingsCount(Integer dbConfigurationFindingsCount) {
            this.dbConfigurationFindingsCount = dbConfigurationFindingsCount;
            this.__explicitlySet__.add("dbConfigurationFindingsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControlFindingsCount")
        private Integer fineGrainedAccessControlFindingsCount;

        public Builder fineGrainedAccessControlFindingsCount(
                Integer fineGrainedAccessControlFindingsCount) {
            this.fineGrainedAccessControlFindingsCount = fineGrainedAccessControlFindingsCount;
            this.__explicitlySet__.add("fineGrainedAccessControlFindingsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRolesFindingsCount")
        private Integer privilegesAndRolesFindingsCount;

        public Builder privilegesAndRolesFindingsCount(Integer privilegesAndRolesFindingsCount) {
            this.privilegesAndRolesFindingsCount = privilegesAndRolesFindingsCount;
            this.__explicitlySet__.add("privilegesAndRolesFindingsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userAccountsFindingsCount")
        private Integer userAccountsFindingsCount;

        public Builder userAccountsFindingsCount(Integer userAccountsFindingsCount) {
            this.userAccountsFindingsCount = userAccountsFindingsCount;
            this.__explicitlySet__.add("userAccountsFindingsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SectionStatistics build() {
            SectionStatistics __instance__ =
                    new SectionStatistics(
                            targetsCount,
                            auditingFindingsCount,
                            authorizationControlFindingsCount,
                            dataEncryptionFindingsCount,
                            dbConfigurationFindingsCount,
                            fineGrainedAccessControlFindingsCount,
                            privilegesAndRolesFindingsCount,
                            userAccountsFindingsCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SectionStatistics o) {
            Builder copiedBuilder =
                    targetsCount(o.getTargetsCount())
                            .auditingFindingsCount(o.getAuditingFindingsCount())
                            .authorizationControlFindingsCount(
                                    o.getAuthorizationControlFindingsCount())
                            .dataEncryptionFindingsCount(o.getDataEncryptionFindingsCount())
                            .dbConfigurationFindingsCount(o.getDbConfigurationFindingsCount())
                            .fineGrainedAccessControlFindingsCount(
                                    o.getFineGrainedAccessControlFindingsCount())
                            .privilegesAndRolesFindingsCount(o.getPrivilegesAndRolesFindingsCount())
                            .userAccountsFindingsCount(o.getUserAccountsFindingsCount());

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
     * The number of targets that contributed to the counts at this risk level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
    Integer targetsCount;

    /**
     * The number of findings in the Auditing category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditingFindingsCount")
    Integer auditingFindingsCount;

    /**
     * The number of findings in the Authorization Control category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationControlFindingsCount")
    Integer authorizationControlFindingsCount;

    /**
     * The number of findings in the Data Encryption category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataEncryptionFindingsCount")
    Integer dataEncryptionFindingsCount;

    /**
     * The number of findings in the Database Configuration category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbConfigurationFindingsCount")
    Integer dbConfigurationFindingsCount;

    /**
     * The number of findings in the Fine-Grained Access Control category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControlFindingsCount")
    Integer fineGrainedAccessControlFindingsCount;

    /**
     * The number of findings in the Privileges and Roles category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRolesFindingsCount")
    Integer privilegesAndRolesFindingsCount;

    /**
     * The number of findings in the User Accounts category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userAccountsFindingsCount")
    Integer userAccountsFindingsCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
