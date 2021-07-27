/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalBackupJob.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExternalBackupJob {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the associated backup resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupId")
    String backupId;

    /**
     * An indicator for the provisioning state of the resource. If {@code TRUE}, the resource is still being provisioned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioning")
    Boolean provisioning;

    /**
     * The Swift path to use as a destination for the standalone backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("swiftPath")
    String swiftPath;

    /**
     * The name of the Swift compartment bucket where the backup should be stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    /**
     * The tag for RMAN to apply to the backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    String tag;

    /**
     * The Swift user name to use for transferring the standalone backup to the designated Swift compartment bucket.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    String userName;

    /**
     * The auth token to use for access to the Swift compartment bucket that will store the standalone backup.
     * For information about auth tokens, see [Working with Auth Tokens](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm#two).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("swiftPassword")
    String swiftPassword;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
