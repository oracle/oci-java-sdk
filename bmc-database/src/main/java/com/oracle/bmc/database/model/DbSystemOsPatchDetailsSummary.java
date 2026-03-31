/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The details of available/applied OS patch on a DB Node.
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
    builder = DbSystemOsPatchDetailsSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystemOsPatchDetailsSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbNodeId", "isRebootRequired", "rpms"})
    public DbSystemOsPatchDetailsSummary(
            String dbNodeId, Boolean isRebootRequired, java.util.List<String> rpms) {
        super();
        this.dbNodeId = dbNodeId;
        this.isRebootRequired = isRebootRequired;
        this.rpms = rpms;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the DB node targeted for this patch action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeId")
        private String dbNodeId;

        /**
         * The OCID of the DB node targeted for this patch action.
         * @param dbNodeId the value to set
         * @return this builder
         **/
        public Builder dbNodeId(String dbNodeId) {
            this.dbNodeId = dbNodeId;
            this.__explicitlySet__.add("dbNodeId");
            return this;
        }
        /**
         * Indicates whether a reboot is required after applying the patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
        private Boolean isRebootRequired;

        /**
         * Indicates whether a reboot is required after applying the patch.
         * @param isRebootRequired the value to set
         * @return this builder
         **/
        public Builder isRebootRequired(Boolean isRebootRequired) {
            this.isRebootRequired = isRebootRequired;
            this.__explicitlySet__.add("isRebootRequired");
            return this;
        }
        /**
         * List of OS package identifiers (e.g., RPM strings).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rpms")
        private java.util.List<String> rpms;

        /**
         * List of OS package identifiers (e.g., RPM strings).
         * @param rpms the value to set
         * @return this builder
         **/
        public Builder rpms(java.util.List<String> rpms) {
            this.rpms = rpms;
            this.__explicitlySet__.add("rpms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemOsPatchDetailsSummary build() {
            DbSystemOsPatchDetailsSummary model =
                    new DbSystemOsPatchDetailsSummary(
                            this.dbNodeId, this.isRebootRequired, this.rpms);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemOsPatchDetailsSummary model) {
            if (model.wasPropertyExplicitlySet("dbNodeId")) {
                this.dbNodeId(model.getDbNodeId());
            }
            if (model.wasPropertyExplicitlySet("isRebootRequired")) {
                this.isRebootRequired(model.getIsRebootRequired());
            }
            if (model.wasPropertyExplicitlySet("rpms")) {
                this.rpms(model.getRpms());
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
     * The OCID of the DB node targeted for this patch action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeId")
    private final String dbNodeId;

    /**
     * The OCID of the DB node targeted for this patch action.
     * @return the value
     **/
    public String getDbNodeId() {
        return dbNodeId;
    }

    /**
     * Indicates whether a reboot is required after applying the patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRebootRequired")
    private final Boolean isRebootRequired;

    /**
     * Indicates whether a reboot is required after applying the patch.
     * @return the value
     **/
    public Boolean getIsRebootRequired() {
        return isRebootRequired;
    }

    /**
     * List of OS package identifiers (e.g., RPM strings).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rpms")
    private final java.util.List<String> rpms;

    /**
     * List of OS package identifiers (e.g., RPM strings).
     * @return the value
     **/
    public java.util.List<String> getRpms() {
        return rpms;
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
        sb.append("DbSystemOsPatchDetailsSummary(");
        sb.append("super=").append(super.toString());
        sb.append("dbNodeId=").append(String.valueOf(this.dbNodeId));
        sb.append(", isRebootRequired=").append(String.valueOf(this.isRebootRequired));
        sb.append(", rpms=").append(String.valueOf(this.rpms));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemOsPatchDetailsSummary)) {
            return false;
        }

        DbSystemOsPatchDetailsSummary other = (DbSystemOsPatchDetailsSummary) o;
        return java.util.Objects.equals(this.dbNodeId, other.dbNodeId)
                && java.util.Objects.equals(this.isRebootRequired, other.isRebootRequired)
                && java.util.Objects.equals(this.rpms, other.rpms)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbNodeId == null ? 43 : this.dbNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.isRebootRequired == null ? 43 : this.isRebootRequired.hashCode());
        result = (result * PRIME) + (this.rpms == null ? 43 : this.rpms.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
