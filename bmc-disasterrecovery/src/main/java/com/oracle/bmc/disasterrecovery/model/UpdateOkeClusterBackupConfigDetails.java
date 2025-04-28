/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Update backup configuration properties for an OKE member. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateOkeClusterBackupConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOkeClusterBackupConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespaces",
        "backupSchedule",
        "replicateImages",
        "maxNumberOfBackupsRetained",
        "imageReplicationVaultSecretId"
    })
    public UpdateOkeClusterBackupConfigDetails(
            java.util.List<String> namespaces,
            String backupSchedule,
            OkeClusterImageReplication replicateImages,
            Integer maxNumberOfBackupsRetained,
            String imageReplicationVaultSecretId) {
        super();
        this.namespaces = namespaces;
        this.backupSchedule = backupSchedule;
        this.replicateImages = replicateImages;
        this.maxNumberOfBackupsRetained = maxNumberOfBackupsRetained;
        this.imageReplicationVaultSecretId = imageReplicationVaultSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of namespaces that need to be backed up. The default value is null. If a list of
         * namespaces is not provided, all namespaces will be backed up. This property applies to
         * the OKE cluster member in primary region.
         *
         * <p>Example: ["default", "pv-nginx"]
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaces")
        private java.util.List<String> namespaces;

        /**
         * A list of namespaces that need to be backed up. The default value is null. If a list of
         * namespaces is not provided, all namespaces will be backed up. This property applies to
         * the OKE cluster member in primary region.
         *
         * <p>Example: ["default", "pv-nginx"]
         *
         * @param namespaces the value to set
         * @return this builder
         */
        public Builder namespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            this.__explicitlySet__.add("namespaces");
            return this;
        }
        /**
         * The schedule for backing up namespaces to the destination region. If a backup schedule is
         * not specified, only a single backup will be created. This format of the string specifying
         * the backup schedule must conform with RFC-5545. This schedule will use the UTC timezone.
         * This property applies to the OKE cluster member in primary region.
         *
         * <p>Example: FREQ=WEEKLY;BYDAY=MO,TU,WE,TH;BYHOUR=10;INTERVAL=1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupSchedule")
        private String backupSchedule;

        /**
         * The schedule for backing up namespaces to the destination region. If a backup schedule is
         * not specified, only a single backup will be created. This format of the string specifying
         * the backup schedule must conform with RFC-5545. This schedule will use the UTC timezone.
         * This property applies to the OKE cluster member in primary region.
         *
         * <p>Example: FREQ=WEEKLY;BYDAY=MO,TU,WE,TH;BYHOUR=10;INTERVAL=1
         *
         * @param backupSchedule the value to set
         * @return this builder
         */
        public Builder backupSchedule(String backupSchedule) {
            this.backupSchedule = backupSchedule;
            this.__explicitlySet__.add("backupSchedule");
            return this;
        }
        /**
         * Controls the behaviour of image replication across regions. This property applies to the
         * OKE cluster member in primary region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicateImages")
        private OkeClusterImageReplication replicateImages;

        /**
         * Controls the behaviour of image replication across regions. This property applies to the
         * OKE cluster member in primary region.
         *
         * @param replicateImages the value to set
         * @return this builder
         */
        public Builder replicateImages(OkeClusterImageReplication replicateImages) {
            this.replicateImages = replicateImages;
            this.__explicitlySet__.add("replicateImages");
            return this;
        }
        /**
         * The maximum number of backups that should be retained. This property applies to the OKE
         * cluster member in primary region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxNumberOfBackupsRetained")
        private Integer maxNumberOfBackupsRetained;

        /**
         * The maximum number of backups that should be retained. This property applies to the OKE
         * cluster member in primary region.
         *
         * @param maxNumberOfBackupsRetained the value to set
         * @return this builder
         */
        public Builder maxNumberOfBackupsRetained(Integer maxNumberOfBackupsRetained) {
            this.maxNumberOfBackupsRetained = maxNumberOfBackupsRetained;
            this.__explicitlySet__.add("maxNumberOfBackupsRetained");
            return this;
        }
        /**
         * The OCID of the vault secret that stores the image credential. This property applies to
         * the OKE cluster member in both the primary and standby region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageReplicationVaultSecretId")
        private String imageReplicationVaultSecretId;

        /**
         * The OCID of the vault secret that stores the image credential. This property applies to
         * the OKE cluster member in both the primary and standby region.
         *
         * @param imageReplicationVaultSecretId the value to set
         * @return this builder
         */
        public Builder imageReplicationVaultSecretId(String imageReplicationVaultSecretId) {
            this.imageReplicationVaultSecretId = imageReplicationVaultSecretId;
            this.__explicitlySet__.add("imageReplicationVaultSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOkeClusterBackupConfigDetails build() {
            UpdateOkeClusterBackupConfigDetails model =
                    new UpdateOkeClusterBackupConfigDetails(
                            this.namespaces,
                            this.backupSchedule,
                            this.replicateImages,
                            this.maxNumberOfBackupsRetained,
                            this.imageReplicationVaultSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOkeClusterBackupConfigDetails model) {
            if (model.wasPropertyExplicitlySet("namespaces")) {
                this.namespaces(model.getNamespaces());
            }
            if (model.wasPropertyExplicitlySet("backupSchedule")) {
                this.backupSchedule(model.getBackupSchedule());
            }
            if (model.wasPropertyExplicitlySet("replicateImages")) {
                this.replicateImages(model.getReplicateImages());
            }
            if (model.wasPropertyExplicitlySet("maxNumberOfBackupsRetained")) {
                this.maxNumberOfBackupsRetained(model.getMaxNumberOfBackupsRetained());
            }
            if (model.wasPropertyExplicitlySet("imageReplicationVaultSecretId")) {
                this.imageReplicationVaultSecretId(model.getImageReplicationVaultSecretId());
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
     * A list of namespaces that need to be backed up. The default value is null. If a list of
     * namespaces is not provided, all namespaces will be backed up. This property applies to the
     * OKE cluster member in primary region.
     *
     * <p>Example: ["default", "pv-nginx"]
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaces")
    private final java.util.List<String> namespaces;

    /**
     * A list of namespaces that need to be backed up. The default value is null. If a list of
     * namespaces is not provided, all namespaces will be backed up. This property applies to the
     * OKE cluster member in primary region.
     *
     * <p>Example: ["default", "pv-nginx"]
     *
     * @return the value
     */
    public java.util.List<String> getNamespaces() {
        return namespaces;
    }

    /**
     * The schedule for backing up namespaces to the destination region. If a backup schedule is not
     * specified, only a single backup will be created. This format of the string specifying the
     * backup schedule must conform with RFC-5545. This schedule will use the UTC timezone. This
     * property applies to the OKE cluster member in primary region.
     *
     * <p>Example: FREQ=WEEKLY;BYDAY=MO,TU,WE,TH;BYHOUR=10;INTERVAL=1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupSchedule")
    private final String backupSchedule;

    /**
     * The schedule for backing up namespaces to the destination region. If a backup schedule is not
     * specified, only a single backup will be created. This format of the string specifying the
     * backup schedule must conform with RFC-5545. This schedule will use the UTC timezone. This
     * property applies to the OKE cluster member in primary region.
     *
     * <p>Example: FREQ=WEEKLY;BYDAY=MO,TU,WE,TH;BYHOUR=10;INTERVAL=1
     *
     * @return the value
     */
    public String getBackupSchedule() {
        return backupSchedule;
    }

    /**
     * Controls the behaviour of image replication across regions. This property applies to the OKE
     * cluster member in primary region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicateImages")
    private final OkeClusterImageReplication replicateImages;

    /**
     * Controls the behaviour of image replication across regions. This property applies to the OKE
     * cluster member in primary region.
     *
     * @return the value
     */
    public OkeClusterImageReplication getReplicateImages() {
        return replicateImages;
    }

    /**
     * The maximum number of backups that should be retained. This property applies to the OKE
     * cluster member in primary region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxNumberOfBackupsRetained")
    private final Integer maxNumberOfBackupsRetained;

    /**
     * The maximum number of backups that should be retained. This property applies to the OKE
     * cluster member in primary region.
     *
     * @return the value
     */
    public Integer getMaxNumberOfBackupsRetained() {
        return maxNumberOfBackupsRetained;
    }

    /**
     * The OCID of the vault secret that stores the image credential. This property applies to the
     * OKE cluster member in both the primary and standby region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageReplicationVaultSecretId")
    private final String imageReplicationVaultSecretId;

    /**
     * The OCID of the vault secret that stores the image credential. This property applies to the
     * OKE cluster member in both the primary and standby region.
     *
     * @return the value
     */
    public String getImageReplicationVaultSecretId() {
        return imageReplicationVaultSecretId;
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
        sb.append("UpdateOkeClusterBackupConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("namespaces=").append(String.valueOf(this.namespaces));
        sb.append(", backupSchedule=").append(String.valueOf(this.backupSchedule));
        sb.append(", replicateImages=").append(String.valueOf(this.replicateImages));
        sb.append(", maxNumberOfBackupsRetained=")
                .append(String.valueOf(this.maxNumberOfBackupsRetained));
        sb.append(", imageReplicationVaultSecretId=")
                .append(String.valueOf(this.imageReplicationVaultSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOkeClusterBackupConfigDetails)) {
            return false;
        }

        UpdateOkeClusterBackupConfigDetails other = (UpdateOkeClusterBackupConfigDetails) o;
        return java.util.Objects.equals(this.namespaces, other.namespaces)
                && java.util.Objects.equals(this.backupSchedule, other.backupSchedule)
                && java.util.Objects.equals(this.replicateImages, other.replicateImages)
                && java.util.Objects.equals(
                        this.maxNumberOfBackupsRetained, other.maxNumberOfBackupsRetained)
                && java.util.Objects.equals(
                        this.imageReplicationVaultSecretId, other.imageReplicationVaultSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespaces == null ? 43 : this.namespaces.hashCode());
        result =
                (result * PRIME)
                        + (this.backupSchedule == null ? 43 : this.backupSchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.replicateImages == null ? 43 : this.replicateImages.hashCode());
        result =
                (result * PRIME)
                        + (this.maxNumberOfBackupsRetained == null
                                ? 43
                                : this.maxNumberOfBackupsRetained.hashCode());
        result =
                (result * PRIME)
                        + (this.imageReplicationVaultSecretId == null
                                ? 43
                                : this.imageReplicationVaultSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
