/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details required to validate backup. <br>
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
        builder = ValidateBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValidateBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isPreparedBackupRequired"})
    public ValidateBackupDetails(Boolean isPreparedBackupRequired) {
        super();
        this.isPreparedBackupRequired = isPreparedBackupRequired;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies whether the backup needs to be prepared for fast restore or not. Set to true to
         * prepare the backup, set to false (default) if not required. Note: The prepared backup
         * will replace the original backup and will not generate a new backup copy. The cost
         * associated with the backup may vary, as the prepared backup will consistently be a full
         * backup, it may also change the storage size of the original backup.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPreparedBackupRequired")
        private Boolean isPreparedBackupRequired;

        /**
         * Specifies whether the backup needs to be prepared for fast restore or not. Set to true to
         * prepare the backup, set to false (default) if not required. Note: The prepared backup
         * will replace the original backup and will not generate a new backup copy. The cost
         * associated with the backup may vary, as the prepared backup will consistently be a full
         * backup, it may also change the storage size of the original backup.
         *
         * @param isPreparedBackupRequired the value to set
         * @return this builder
         */
        public Builder isPreparedBackupRequired(Boolean isPreparedBackupRequired) {
            this.isPreparedBackupRequired = isPreparedBackupRequired;
            this.__explicitlySet__.add("isPreparedBackupRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateBackupDetails build() {
            ValidateBackupDetails model = new ValidateBackupDetails(this.isPreparedBackupRequired);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateBackupDetails model) {
            if (model.wasPropertyExplicitlySet("isPreparedBackupRequired")) {
                this.isPreparedBackupRequired(model.getIsPreparedBackupRequired());
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
     * Specifies whether the backup needs to be prepared for fast restore or not. Set to true to
     * prepare the backup, set to false (default) if not required. Note: The prepared backup will
     * replace the original backup and will not generate a new backup copy. The cost associated with
     * the backup may vary, as the prepared backup will consistently be a full backup, it may also
     * change the storage size of the original backup.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPreparedBackupRequired")
    private final Boolean isPreparedBackupRequired;

    /**
     * Specifies whether the backup needs to be prepared for fast restore or not. Set to true to
     * prepare the backup, set to false (default) if not required. Note: The prepared backup will
     * replace the original backup and will not generate a new backup copy. The cost associated with
     * the backup may vary, as the prepared backup will consistently be a full backup, it may also
     * change the storage size of the original backup.
     *
     * @return the value
     */
    public Boolean getIsPreparedBackupRequired() {
        return isPreparedBackupRequired;
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
        sb.append("ValidateBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isPreparedBackupRequired=")
                .append(String.valueOf(this.isPreparedBackupRequired));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateBackupDetails)) {
            return false;
        }

        ValidateBackupDetails other = (ValidateBackupDetails) o;
        return java.util.Objects.equals(
                        this.isPreparedBackupRequired, other.isPreparedBackupRequired)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPreparedBackupRequired == null
                                ? 43
                                : this.isPreparedBackupRequired.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
