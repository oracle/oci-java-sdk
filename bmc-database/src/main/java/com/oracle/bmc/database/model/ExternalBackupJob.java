/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Provides all the details that apply to an external backup job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalBackupJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalBackupJob
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * associated backup resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupId")
        private String backupId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * associated backup resource.
         *
         * @param backupId the value to set
         * @return this builder
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            this.__explicitlySet__.add("backupId");
            return this;
        }
        /**
         * An indicator for the provisioning state of the resource. If {@code TRUE}, the resource is
         * still being provisioned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provisioning")
        private Boolean provisioning;

        /**
         * An indicator for the provisioning state of the resource. If {@code TRUE}, the resource is
         * still being provisioned.
         *
         * @param provisioning the value to set
         * @return this builder
         */
        public Builder provisioning(Boolean provisioning) {
            this.provisioning = provisioning;
            this.__explicitlySet__.add("provisioning");
            return this;
        }
        /** The Swift path to use as a destination for the standalone backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("swiftPath")
        private String swiftPath;

        /**
         * The Swift path to use as a destination for the standalone backup.
         *
         * @param swiftPath the value to set
         * @return this builder
         */
        public Builder swiftPath(String swiftPath) {
            this.swiftPath = swiftPath;
            this.__explicitlySet__.add("swiftPath");
            return this;
        }
        /** The name of the Swift compartment bucket where the backup should be stored. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the Swift compartment bucket where the backup should be stored.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The tag for RMAN to apply to the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private String tag;

        /**
         * The tag for RMAN to apply to the backup.
         *
         * @param tag the value to set
         * @return this builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            this.__explicitlySet__.add("tag");
            return this;
        }
        /**
         * The Swift user name to use for transferring the standalone backup to the designated Swift
         * compartment bucket.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * The Swift user name to use for transferring the standalone backup to the designated Swift
         * compartment bucket.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * The auth token to use for access to the Swift compartment bucket that will store the
         * standalone backup. For information about auth tokens, see [Working with Auth
         * Tokens](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm#two).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("swiftPassword")
        private String swiftPassword;

        /**
         * The auth token to use for access to the Swift compartment bucket that will store the
         * standalone backup. For information about auth tokens, see [Working with Auth
         * Tokens](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm#two).
         *
         * @param swiftPassword the value to set
         * @return this builder
         */
        public Builder swiftPassword(String swiftPassword) {
            this.swiftPassword = swiftPassword;
            this.__explicitlySet__.add("swiftPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalBackupJob build() {
            ExternalBackupJob model =
                    new ExternalBackupJob(
                            this.backupId,
                            this.provisioning,
                            this.swiftPath,
                            this.bucketName,
                            this.tag,
                            this.userName,
                            this.swiftPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalBackupJob model) {
            if (model.wasPropertyExplicitlySet("backupId")) {
                this.backupId(model.getBackupId());
            }
            if (model.wasPropertyExplicitlySet("provisioning")) {
                this.provisioning(model.getProvisioning());
            }
            if (model.wasPropertyExplicitlySet("swiftPath")) {
                this.swiftPath(model.getSwiftPath());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("tag")) {
                this.tag(model.getTag());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("swiftPassword")) {
                this.swiftPassword(model.getSwiftPassword());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * associated backup resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupId")
    private final String backupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * associated backup resource.
     *
     * @return the value
     */
    public String getBackupId() {
        return backupId;
    }

    /**
     * An indicator for the provisioning state of the resource. If {@code TRUE}, the resource is
     * still being provisioned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioning")
    private final Boolean provisioning;

    /**
     * An indicator for the provisioning state of the resource. If {@code TRUE}, the resource is
     * still being provisioned.
     *
     * @return the value
     */
    public Boolean getProvisioning() {
        return provisioning;
    }

    /** The Swift path to use as a destination for the standalone backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("swiftPath")
    private final String swiftPath;

    /**
     * The Swift path to use as a destination for the standalone backup.
     *
     * @return the value
     */
    public String getSwiftPath() {
        return swiftPath;
    }

    /** The name of the Swift compartment bucket where the backup should be stored. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the Swift compartment bucket where the backup should be stored.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The tag for RMAN to apply to the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    private final String tag;

    /**
     * The tag for RMAN to apply to the backup.
     *
     * @return the value
     */
    public String getTag() {
        return tag;
    }

    /**
     * The Swift user name to use for transferring the standalone backup to the designated Swift
     * compartment bucket.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * The Swift user name to use for transferring the standalone backup to the designated Swift
     * compartment bucket.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /**
     * The auth token to use for access to the Swift compartment bucket that will store the
     * standalone backup. For information about auth tokens, see [Working with Auth
     * Tokens](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm#two).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("swiftPassword")
    private final String swiftPassword;

    /**
     * The auth token to use for access to the Swift compartment bucket that will store the
     * standalone backup. For information about auth tokens, see [Working with Auth
     * Tokens](https://docs.cloud.oracle.com/Content/Identity/Tasks/managingcredentials.htm#two).
     *
     * @return the value
     */
    public String getSwiftPassword() {
        return swiftPassword;
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
        sb.append("ExternalBackupJob(");
        sb.append("super=").append(super.toString());
        sb.append("backupId=").append(String.valueOf(this.backupId));
        sb.append(", provisioning=").append(String.valueOf(this.provisioning));
        sb.append(", swiftPath=").append(String.valueOf(this.swiftPath));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", tag=").append(String.valueOf(this.tag));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", swiftPassword=").append(String.valueOf(this.swiftPassword));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
