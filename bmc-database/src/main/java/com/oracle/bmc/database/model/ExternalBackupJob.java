/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Provides all the details that apply to an external backup job.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalBackupJob.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalBackupJob {
    @Deprecated
    @java.beans.ConstructorProperties({
        "backupId",
        "provisioning",
        "swiftPath",
        "bucketName",
        "tag",
        "userName",
        "swiftPassword"
    })
    public ExternalBackupJob(
            String backupId,
            Boolean provisioning,
            String swiftPath,
            String bucketName,
            String tag,
            String userName,
            String swiftPassword) {
        super();
        this.backupId = backupId;
        this.provisioning = provisioning;
        this.swiftPath = swiftPath;
        this.bucketName = bucketName;
        this.tag = tag;
        this.userName = userName;
        this.swiftPassword = swiftPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backupId")
        private String backupId;

        public Builder backupId(String backupId) {
            this.backupId = backupId;
            this.__explicitlySet__.add("backupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("provisioning")
        private Boolean provisioning;

        public Builder provisioning(Boolean provisioning) {
            this.provisioning = provisioning;
            this.__explicitlySet__.add("provisioning");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("swiftPath")
        private String swiftPath;

        public Builder swiftPath(String swiftPath) {
            this.swiftPath = swiftPath;
            this.__explicitlySet__.add("swiftPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private String tag;

        public Builder tag(String tag) {
            this.tag = tag;
            this.__explicitlySet__.add("tag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("swiftPassword")
        private String swiftPassword;

        public Builder swiftPassword(String swiftPassword) {
            this.swiftPassword = swiftPassword;
            this.__explicitlySet__.add("swiftPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalBackupJob build() {
            ExternalBackupJob __instance__ =
                    new ExternalBackupJob(
                            backupId,
                            provisioning,
                            swiftPath,
                            bucketName,
                            tag,
                            userName,
                            swiftPassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalBackupJob o) {
            Builder copiedBuilder =
                    backupId(o.getBackupId())
                            .provisioning(o.getProvisioning())
                            .swiftPath(o.getSwiftPath())
                            .bucketName(o.getBucketName())
                            .tag(o.getTag())
                            .userName(o.getUserName())
                            .swiftPassword(o.getSwiftPassword());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the associated backup resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupId")
    private final String backupId;

    public String getBackupId() {
        return backupId;
    }

    /**
     * An indicator for the provisioning state of the resource. If {@code TRUE}, the resource is still being provisioned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioning")
    private final Boolean provisioning;

    public Boolean getProvisioning() {
        return provisioning;
    }

    /**
     * The Swift path to use as a destination for the standalone backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("swiftPath")
    private final String swiftPath;

    public String getSwiftPath() {
        return swiftPath;
    }

    /**
     * The name of the Swift compartment bucket where the backup should be stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    public String getBucketName() {
        return bucketName;
    }

    /**
     * The tag for RMAN to apply to the backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    private final String tag;

    public String getTag() {
        return tag;
    }

    /**
     * The Swift user name to use for transferring the standalone backup to the designated Swift compartment bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    public String getUserName() {
        return userName;
    }

    /**
     * The auth token to use for access to the Swift compartment bucket that will store the standalone backup.
     * For information about auth tokens, see [Working with Auth Tokens](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm#two).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("swiftPassword")
    private final String swiftPassword;

    public String getSwiftPassword() {
        return swiftPassword;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExternalBackupJob(");
        sb.append("backupId=").append(String.valueOf(this.backupId));
        sb.append(", provisioning=").append(String.valueOf(this.provisioning));
        sb.append(", swiftPath=").append(String.valueOf(this.swiftPath));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", tag=").append(String.valueOf(this.tag));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", swiftPassword=").append(String.valueOf(this.swiftPassword));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalBackupJob)) {
            return false;
        }

        ExternalBackupJob other = (ExternalBackupJob) o;
        return java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(this.provisioning, other.provisioning)
                && java.util.Objects.equals(this.swiftPath, other.swiftPath)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.tag, other.tag)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.swiftPassword, other.swiftPassword)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result = (result * PRIME) + (this.provisioning == null ? 43 : this.provisioning.hashCode());
        result = (result * PRIME) + (this.swiftPath == null ? 43 : this.swiftPath.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.tag == null ? 43 : this.tag.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result =
                (result * PRIME)
                        + (this.swiftPassword == null ? 43 : this.swiftPassword.hashCode());
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
