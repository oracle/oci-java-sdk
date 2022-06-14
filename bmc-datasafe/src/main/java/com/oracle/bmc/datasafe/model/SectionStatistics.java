/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SectionStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SectionStatistics {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetsCount",
        "auditingFindingsCount",
        "authorizationControlFindingsCount",
        "dataEncryptionFindingsCount",
        "dbConfigurationFindingsCount",
        "fineGrainedAccessControlFindingsCount",
        "privilegesAndRolesFindingsCount",
        "userAccountsFindingsCount"
    })
    public SectionStatistics(
            Integer targetsCount,
            Integer auditingFindingsCount,
            Integer authorizationControlFindingsCount,
            Integer dataEncryptionFindingsCount,
            Integer dbConfigurationFindingsCount,
            Integer fineGrainedAccessControlFindingsCount,
            Integer privilegesAndRolesFindingsCount,
            Integer userAccountsFindingsCount) {
        super();
        this.targetsCount = targetsCount;
        this.auditingFindingsCount = auditingFindingsCount;
        this.authorizationControlFindingsCount = authorizationControlFindingsCount;
        this.dataEncryptionFindingsCount = dataEncryptionFindingsCount;
        this.dbConfigurationFindingsCount = dbConfigurationFindingsCount;
        this.fineGrainedAccessControlFindingsCount = fineGrainedAccessControlFindingsCount;
        this.privilegesAndRolesFindingsCount = privilegesAndRolesFindingsCount;
        this.userAccountsFindingsCount = userAccountsFindingsCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of targets that contributed to the counts at this risk level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
        private Integer targetsCount;

        /**
         * The number of targets that contributed to the counts at this risk level.
         * @param targetsCount the value to set
         * @return this builder
         **/
        public Builder targetsCount(Integer targetsCount) {
            this.targetsCount = targetsCount;
            this.__explicitlySet__.add("targetsCount");
            return this;
        }
        /**
         * The number of findings in the Auditing category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditingFindingsCount")
        private Integer auditingFindingsCount;

        /**
         * The number of findings in the Auditing category.
         * @param auditingFindingsCount the value to set
         * @return this builder
         **/
        public Builder auditingFindingsCount(Integer auditingFindingsCount) {
            this.auditingFindingsCount = auditingFindingsCount;
            this.__explicitlySet__.add("auditingFindingsCount");
            return this;
        }
        /**
         * The number of findings in the Authorization Control category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authorizationControlFindingsCount")
        private Integer authorizationControlFindingsCount;

        /**
         * The number of findings in the Authorization Control category.
         * @param authorizationControlFindingsCount the value to set
         * @return this builder
         **/
        public Builder authorizationControlFindingsCount(
                Integer authorizationControlFindingsCount) {
            this.authorizationControlFindingsCount = authorizationControlFindingsCount;
            this.__explicitlySet__.add("authorizationControlFindingsCount");
            return this;
        }
        /**
         * The number of findings in the Data Encryption category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataEncryptionFindingsCount")
        private Integer dataEncryptionFindingsCount;

        /**
         * The number of findings in the Data Encryption category.
         * @param dataEncryptionFindingsCount the value to set
         * @return this builder
         **/
        public Builder dataEncryptionFindingsCount(Integer dataEncryptionFindingsCount) {
            this.dataEncryptionFindingsCount = dataEncryptionFindingsCount;
            this.__explicitlySet__.add("dataEncryptionFindingsCount");
            return this;
        }
        /**
         * The number of findings in the Database Configuration category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbConfigurationFindingsCount")
        private Integer dbConfigurationFindingsCount;

        /**
         * The number of findings in the Database Configuration category.
         * @param dbConfigurationFindingsCount the value to set
         * @return this builder
         **/
        public Builder dbConfigurationFindingsCount(Integer dbConfigurationFindingsCount) {
            this.dbConfigurationFindingsCount = dbConfigurationFindingsCount;
            this.__explicitlySet__.add("dbConfigurationFindingsCount");
            return this;
        }
        /**
         * The number of findings in the Fine-Grained Access Control category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControlFindingsCount")
        private Integer fineGrainedAccessControlFindingsCount;

        /**
         * The number of findings in the Fine-Grained Access Control category.
         * @param fineGrainedAccessControlFindingsCount the value to set
         * @return this builder
         **/
        public Builder fineGrainedAccessControlFindingsCount(
                Integer fineGrainedAccessControlFindingsCount) {
            this.fineGrainedAccessControlFindingsCount = fineGrainedAccessControlFindingsCount;
            this.__explicitlySet__.add("fineGrainedAccessControlFindingsCount");
            return this;
        }
        /**
         * The number of findings in the Privileges and Roles category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRolesFindingsCount")
        private Integer privilegesAndRolesFindingsCount;

        /**
         * The number of findings in the Privileges and Roles category.
         * @param privilegesAndRolesFindingsCount the value to set
         * @return this builder
         **/
        public Builder privilegesAndRolesFindingsCount(Integer privilegesAndRolesFindingsCount) {
            this.privilegesAndRolesFindingsCount = privilegesAndRolesFindingsCount;
            this.__explicitlySet__.add("privilegesAndRolesFindingsCount");
            return this;
        }
        /**
         * The number of findings in the User Accounts category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userAccountsFindingsCount")
        private Integer userAccountsFindingsCount;

        /**
         * The number of findings in the User Accounts category.
         * @param userAccountsFindingsCount the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The number of targets that contributed to the counts at this risk level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
    private final Integer targetsCount;

    /**
     * The number of targets that contributed to the counts at this risk level.
     * @return the value
     **/
    public Integer getTargetsCount() {
        return targetsCount;
    }

    /**
     * The number of findings in the Auditing category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditingFindingsCount")
    private final Integer auditingFindingsCount;

    /**
     * The number of findings in the Auditing category.
     * @return the value
     **/
    public Integer getAuditingFindingsCount() {
        return auditingFindingsCount;
    }

    /**
     * The number of findings in the Authorization Control category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorizationControlFindingsCount")
    private final Integer authorizationControlFindingsCount;

    /**
     * The number of findings in the Authorization Control category.
     * @return the value
     **/
    public Integer getAuthorizationControlFindingsCount() {
        return authorizationControlFindingsCount;
    }

    /**
     * The number of findings in the Data Encryption category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataEncryptionFindingsCount")
    private final Integer dataEncryptionFindingsCount;

    /**
     * The number of findings in the Data Encryption category.
     * @return the value
     **/
    public Integer getDataEncryptionFindingsCount() {
        return dataEncryptionFindingsCount;
    }

    /**
     * The number of findings in the Database Configuration category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbConfigurationFindingsCount")
    private final Integer dbConfigurationFindingsCount;

    /**
     * The number of findings in the Database Configuration category.
     * @return the value
     **/
    public Integer getDbConfigurationFindingsCount() {
        return dbConfigurationFindingsCount;
    }

    /**
     * The number of findings in the Fine-Grained Access Control category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fineGrainedAccessControlFindingsCount")
    private final Integer fineGrainedAccessControlFindingsCount;

    /**
     * The number of findings in the Fine-Grained Access Control category.
     * @return the value
     **/
    public Integer getFineGrainedAccessControlFindingsCount() {
        return fineGrainedAccessControlFindingsCount;
    }

    /**
     * The number of findings in the Privileges and Roles category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privilegesAndRolesFindingsCount")
    private final Integer privilegesAndRolesFindingsCount;

    /**
     * The number of findings in the Privileges and Roles category.
     * @return the value
     **/
    public Integer getPrivilegesAndRolesFindingsCount() {
        return privilegesAndRolesFindingsCount;
    }

    /**
     * The number of findings in the User Accounts category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userAccountsFindingsCount")
    private final Integer userAccountsFindingsCount;

    /**
     * The number of findings in the User Accounts category.
     * @return the value
     **/
    public Integer getUserAccountsFindingsCount() {
        return userAccountsFindingsCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SectionStatistics(");
        sb.append("targetsCount=").append(String.valueOf(this.targetsCount));
        sb.append(", auditingFindingsCount=").append(String.valueOf(this.auditingFindingsCount));
        sb.append(", authorizationControlFindingsCount=")
                .append(String.valueOf(this.authorizationControlFindingsCount));
        sb.append(", dataEncryptionFindingsCount=")
                .append(String.valueOf(this.dataEncryptionFindingsCount));
        sb.append(", dbConfigurationFindingsCount=")
                .append(String.valueOf(this.dbConfigurationFindingsCount));
        sb.append(", fineGrainedAccessControlFindingsCount=")
                .append(String.valueOf(this.fineGrainedAccessControlFindingsCount));
        sb.append(", privilegesAndRolesFindingsCount=")
                .append(String.valueOf(this.privilegesAndRolesFindingsCount));
        sb.append(", userAccountsFindingsCount=")
                .append(String.valueOf(this.userAccountsFindingsCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SectionStatistics)) {
            return false;
        }

        SectionStatistics other = (SectionStatistics) o;
        return java.util.Objects.equals(this.targetsCount, other.targetsCount)
                && java.util.Objects.equals(this.auditingFindingsCount, other.auditingFindingsCount)
                && java.util.Objects.equals(
                        this.authorizationControlFindingsCount,
                        other.authorizationControlFindingsCount)
                && java.util.Objects.equals(
                        this.dataEncryptionFindingsCount, other.dataEncryptionFindingsCount)
                && java.util.Objects.equals(
                        this.dbConfigurationFindingsCount, other.dbConfigurationFindingsCount)
                && java.util.Objects.equals(
                        this.fineGrainedAccessControlFindingsCount,
                        other.fineGrainedAccessControlFindingsCount)
                && java.util.Objects.equals(
                        this.privilegesAndRolesFindingsCount, other.privilegesAndRolesFindingsCount)
                && java.util.Objects.equals(
                        this.userAccountsFindingsCount, other.userAccountsFindingsCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetsCount == null ? 43 : this.targetsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.auditingFindingsCount == null
                                ? 43
                                : this.auditingFindingsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.authorizationControlFindingsCount == null
                                ? 43
                                : this.authorizationControlFindingsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataEncryptionFindingsCount == null
                                ? 43
                                : this.dataEncryptionFindingsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dbConfigurationFindingsCount == null
                                ? 43
                                : this.dbConfigurationFindingsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.fineGrainedAccessControlFindingsCount == null
                                ? 43
                                : this.fineGrainedAccessControlFindingsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.privilegesAndRolesFindingsCount == null
                                ? 43
                                : this.privilegesAndRolesFindingsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.userAccountsFindingsCount == null
                                ? 43
                                : this.userAccountsFindingsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
