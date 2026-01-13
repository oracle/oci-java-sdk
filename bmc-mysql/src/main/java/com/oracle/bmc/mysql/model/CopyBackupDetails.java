/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details required to copy a DB system backup from its source region to a destination region. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CopyBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CopyBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "description",
        "displayName",
        "backupCopyRetentionInDays",
        "sourceBackupId",
        "sourceRegion",
        "encryptData"
    })
    public CopyBackupDetails(
            String compartmentId,
            String description,
            String displayName,
            Integer backupCopyRetentionInDays,
            String sourceBackupId,
            String sourceRegion,
            EncryptDataDetails encryptData) {
        super();
        this.compartmentId = compartmentId;
        this.description = description;
        this.displayName = displayName;
        this.backupCopyRetentionInDays = backupCopyRetentionInDays;
        this.sourceBackupId = sourceBackupId;
        this.sourceRegion = sourceRegion;
        this.encryptData = encryptData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment the DB system backup is to be copied to.
         *
         * <p>*Note:** The compartment must be the same as the compartment of the DB system backup
         * in the source region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment the DB system backup is to be copied to.
         *
         * <p>*Note:** The compartment must be the same as the compartment of the DB system backup
         * in the source region.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-supplied description for the DB system backup. By default, the source backup
         * description will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-supplied description for the DB system backup. By default, the source backup
         * description will be used.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A user-supplied display name for the DB system backup. By default, the source backup
         * display name will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-supplied display name for the DB system backup. By default, the source backup
         * display name will be used.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Number of days to retain the copied DB system backup.
         *
         * <p>*Note:** The maximum value for an automatic backup is 35, and the maximum value for a
         * manual backup is 365.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupCopyRetentionInDays")
        private Integer backupCopyRetentionInDays;

        /**
         * Number of days to retain the copied DB system backup.
         *
         * <p>*Note:** The maximum value for an automatic backup is 35, and the maximum value for a
         * manual backup is 365.
         *
         * @param backupCopyRetentionInDays the value to set
         * @return this builder
         */
        public Builder backupCopyRetentionInDays(Integer backupCopyRetentionInDays) {
            this.backupCopyRetentionInDays = backupCopyRetentionInDays;
            this.__explicitlySet__.add("backupCopyRetentionInDays");
            return this;
        }
        /** The OCID of DB system backup to be copied. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceBackupId")
        private String sourceBackupId;

        /**
         * The OCID of DB system backup to be copied.
         *
         * @param sourceBackupId the value to set
         * @return this builder
         */
        public Builder sourceBackupId(String sourceBackupId) {
            this.sourceBackupId = sourceBackupId;
            this.__explicitlySet__.add("sourceBackupId");
            return this;
        }
        /**
         * The region identifier of the source region where the DB system backup exists. For more
         * information, please see [Regions and Availability
         * Domains](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
        private String sourceRegion;

        /**
         * The region identifier of the source region where the DB system backup exists. For more
         * information, please see [Regions and Availability
         * Domains](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
         *
         * @param sourceRegion the value to set
         * @return this builder
         */
        public Builder sourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            this.__explicitlySet__.add("sourceRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptData")
        private EncryptDataDetails encryptData;

        public Builder encryptData(EncryptDataDetails encryptData) {
            this.encryptData = encryptData;
            this.__explicitlySet__.add("encryptData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CopyBackupDetails build() {
            CopyBackupDetails model =
                    new CopyBackupDetails(
                            this.compartmentId,
                            this.description,
                            this.displayName,
                            this.backupCopyRetentionInDays,
                            this.sourceBackupId,
                            this.sourceRegion,
                            this.encryptData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CopyBackupDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("backupCopyRetentionInDays")) {
                this.backupCopyRetentionInDays(model.getBackupCopyRetentionInDays());
            }
            if (model.wasPropertyExplicitlySet("sourceBackupId")) {
                this.sourceBackupId(model.getSourceBackupId());
            }
            if (model.wasPropertyExplicitlySet("sourceRegion")) {
                this.sourceRegion(model.getSourceRegion());
            }
            if (model.wasPropertyExplicitlySet("encryptData")) {
                this.encryptData(model.getEncryptData());
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
     * The OCID of the compartment the DB system backup is to be copied to.
     *
     * <p>*Note:** The compartment must be the same as the compartment of the DB system backup in
     * the source region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment the DB system backup is to be copied to.
     *
     * <p>*Note:** The compartment must be the same as the compartment of the DB system backup in
     * the source region.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-supplied description for the DB system backup. By default, the source backup
     * description will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-supplied description for the DB system backup. By default, the source backup
     * description will be used.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * A user-supplied display name for the DB system backup. By default, the source backup display
     * name will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-supplied display name for the DB system backup. By default, the source backup display
     * name will be used.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Number of days to retain the copied DB system backup.
     *
     * <p>*Note:** The maximum value for an automatic backup is 35, and the maximum value for a
     * manual backup is 365.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupCopyRetentionInDays")
    private final Integer backupCopyRetentionInDays;

    /**
     * Number of days to retain the copied DB system backup.
     *
     * <p>*Note:** The maximum value for an automatic backup is 35, and the maximum value for a
     * manual backup is 365.
     *
     * @return the value
     */
    public Integer getBackupCopyRetentionInDays() {
        return backupCopyRetentionInDays;
    }

    /** The OCID of DB system backup to be copied. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBackupId")
    private final String sourceBackupId;

    /**
     * The OCID of DB system backup to be copied.
     *
     * @return the value
     */
    public String getSourceBackupId() {
        return sourceBackupId;
    }

    /**
     * The region identifier of the source region where the DB system backup exists. For more
     * information, please see [Regions and Availability
     * Domains](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
    private final String sourceRegion;

    /**
     * The region identifier of the source region where the DB system backup exists. For more
     * information, please see [Regions and Availability
     * Domains](https://docs.oracle.com/en-us/iaas/Content/General/Concepts/regions.htm).
     *
     * @return the value
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptData")
    private final EncryptDataDetails encryptData;

    public EncryptDataDetails getEncryptData() {
        return encryptData;
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
        sb.append("CopyBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", backupCopyRetentionInDays=")
                .append(String.valueOf(this.backupCopyRetentionInDays));
        sb.append(", sourceBackupId=").append(String.valueOf(this.sourceBackupId));
        sb.append(", sourceRegion=").append(String.valueOf(this.sourceRegion));
        sb.append(", encryptData=").append(String.valueOf(this.encryptData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CopyBackupDetails)) {
            return false;
        }

        CopyBackupDetails other = (CopyBackupDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.backupCopyRetentionInDays, other.backupCopyRetentionInDays)
                && java.util.Objects.equals(this.sourceBackupId, other.sourceBackupId)
                && java.util.Objects.equals(this.sourceRegion, other.sourceRegion)
                && java.util.Objects.equals(this.encryptData, other.encryptData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.backupCopyRetentionInDays == null
                                ? 43
                                : this.backupCopyRetentionInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceBackupId == null ? 43 : this.sourceBackupId.hashCode());
        result = (result * PRIME) + (this.sourceRegion == null ? 43 : this.sourceRegion.hashCode());
        result = (result * PRIME) + (this.encryptData == null ? 43 : this.encryptData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
