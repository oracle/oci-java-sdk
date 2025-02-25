/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Backup operation details of the model.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BackupOperationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BackupOperationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeLastBackup", "backupState", "backupStateDetails"})
    public BackupOperationDetails(
            java.util.Date timeLastBackup,
            ModelSettingActionState backupState,
            String backupStateDetails) {
        super();
        this.timeLastBackup = timeLastBackup;
        this.backupState = backupState;
        this.backupStateDetails = backupStateDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The last backup execution time of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastBackup")
        private java.util.Date timeLastBackup;

        /**
         * The last backup execution time of the model.
         * @param timeLastBackup the value to set
         * @return this builder
         **/
        public Builder timeLastBackup(java.util.Date timeLastBackup) {
            this.timeLastBackup = timeLastBackup;
            this.__explicitlySet__.add("timeLastBackup");
            return this;
        }
        /**
         * The backup status of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupState")
        private ModelSettingActionState backupState;

        /**
         * The backup status of the model.
         * @param backupState the value to set
         * @return this builder
         **/
        public Builder backupState(ModelSettingActionState backupState) {
            this.backupState = backupState;
            this.__explicitlySet__.add("backupState");
            return this;
        }
        /**
         * The backup execution status details of the model.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupStateDetails")
        private String backupStateDetails;

        /**
         * The backup execution status details of the model.
         * @param backupStateDetails the value to set
         * @return this builder
         **/
        public Builder backupStateDetails(String backupStateDetails) {
            this.backupStateDetails = backupStateDetails;
            this.__explicitlySet__.add("backupStateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BackupOperationDetails build() {
            BackupOperationDetails model =
                    new BackupOperationDetails(
                            this.timeLastBackup, this.backupState, this.backupStateDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BackupOperationDetails model) {
            if (model.wasPropertyExplicitlySet("timeLastBackup")) {
                this.timeLastBackup(model.getTimeLastBackup());
            }
            if (model.wasPropertyExplicitlySet("backupState")) {
                this.backupState(model.getBackupState());
            }
            if (model.wasPropertyExplicitlySet("backupStateDetails")) {
                this.backupStateDetails(model.getBackupStateDetails());
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

    /**
     * The last backup execution time of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastBackup")
    private final java.util.Date timeLastBackup;

    /**
     * The last backup execution time of the model.
     * @return the value
     **/
    public java.util.Date getTimeLastBackup() {
        return timeLastBackup;
    }

    /**
     * The backup status of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupState")
    private final ModelSettingActionState backupState;

    /**
     * The backup status of the model.
     * @return the value
     **/
    public ModelSettingActionState getBackupState() {
        return backupState;
    }

    /**
     * The backup execution status details of the model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupStateDetails")
    private final String backupStateDetails;

    /**
     * The backup execution status details of the model.
     * @return the value
     **/
    public String getBackupStateDetails() {
        return backupStateDetails;
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
        sb.append("BackupOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeLastBackup=").append(String.valueOf(this.timeLastBackup));
        sb.append(", backupState=").append(String.valueOf(this.backupState));
        sb.append(", backupStateDetails=").append(String.valueOf(this.backupStateDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BackupOperationDetails)) {
            return false;
        }

        BackupOperationDetails other = (BackupOperationDetails) o;
        return java.util.Objects.equals(this.timeLastBackup, other.timeLastBackup)
                && java.util.Objects.equals(this.backupState, other.backupState)
                && java.util.Objects.equals(this.backupStateDetails, other.backupStateDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeLastBackup == null ? 43 : this.timeLastBackup.hashCode());
        result = (result * PRIME) + (this.backupState == null ? 43 : this.backupState.hashCode());
        result =
                (result * PRIME)
                        + (this.backupStateDetails == null
                                ? 43
                                : this.backupStateDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
