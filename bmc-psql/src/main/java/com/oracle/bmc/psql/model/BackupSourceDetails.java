/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Restoring to a new database system from the backup.
 * The database system details that are part of the CreateDbSystem request are not required, but if present will override the details from the backup's database system snapshot.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BackupSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BackupSourceDetails extends SourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database system backup.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupId")
        private String backupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database system backup.
         * @param backupId the value to set
         * @return this builder
         **/
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            this.__explicitlySet__.add("backupId");
            return this;
        }
        /**
         * Deprecated. Don't use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHavingRestoreConfigOverrides")
        private Boolean isHavingRestoreConfigOverrides;

        /**
         * Deprecated. Don't use.
         * @param isHavingRestoreConfigOverrides the value to set
         * @return this builder
         **/
        public Builder isHavingRestoreConfigOverrides(Boolean isHavingRestoreConfigOverrides) {
            this.isHavingRestoreConfigOverrides = isHavingRestoreConfigOverrides;
            this.__explicitlySet__.add("isHavingRestoreConfigOverrides");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupSourceDetails build() {
            BackupSourceDetails model =
                    new BackupSourceDetails(this.backupId, this.isHavingRestoreConfigOverrides);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupSourceDetails model) {
            if (model.wasPropertyExplicitlySet("backupId")) {
                this.backupId(model.getBackupId());
            }
            if (model.wasPropertyExplicitlySet("isHavingRestoreConfigOverrides")) {
                this.isHavingRestoreConfigOverrides(model.getIsHavingRestoreConfigOverrides());
            }
            return this;
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

    @Deprecated
    public BackupSourceDetails(String backupId, Boolean isHavingRestoreConfigOverrides) {
        super();
        this.backupId = backupId;
        this.isHavingRestoreConfigOverrides = isHavingRestoreConfigOverrides;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database system backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupId")
    private final String backupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database system backup.
     * @return the value
     **/
    public String getBackupId() {
        return backupId;
    }

    /**
     * Deprecated. Don't use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHavingRestoreConfigOverrides")
    private final Boolean isHavingRestoreConfigOverrides;

    /**
     * Deprecated. Don't use.
     * @return the value
     **/
    public Boolean getIsHavingRestoreConfigOverrides() {
        return isHavingRestoreConfigOverrides;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BackupSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", backupId=").append(String.valueOf(this.backupId));
        sb.append(", isHavingRestoreConfigOverrides=")
                .append(String.valueOf(this.isHavingRestoreConfigOverrides));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupSourceDetails)) {
            return false;
        }

        BackupSourceDetails other = (BackupSourceDetails) o;
        return java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(
                        this.isHavingRestoreConfigOverrides, other.isHavingRestoreConfigOverrides)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result =
                (result * PRIME)
                        + (this.isHavingRestoreConfigOverrides == null
                                ? 43
                                : this.isHavingRestoreConfigOverrides.hashCode());
        return result;
    }
}
