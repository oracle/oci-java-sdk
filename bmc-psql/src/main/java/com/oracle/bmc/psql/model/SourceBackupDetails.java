/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Information about the Source Backup associated with a backup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SourceBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SourceBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceRegion", "sourceBackupId"})
    public SourceBackupDetails(String sourceRegion, String sourceBackupId) {
        super();
        this.sourceRegion = sourceRegion;
        this.sourceBackupId = sourceBackupId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Backup Region of the COPY source type. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
        private String sourceRegion;

        /**
         * Backup Region of the COPY source type.
         *
         * @param sourceRegion the value to set
         * @return this builder
         */
        public Builder sourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            this.__explicitlySet__.add("sourceRegion");
            return this;
        }
        /** Backup ID of the COPY source type. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceBackupId")
        private String sourceBackupId;

        /**
         * Backup ID of the COPY source type.
         *
         * @param sourceBackupId the value to set
         * @return this builder
         */
        public Builder sourceBackupId(String sourceBackupId) {
            this.sourceBackupId = sourceBackupId;
            this.__explicitlySet__.add("sourceBackupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceBackupDetails build() {
            SourceBackupDetails model =
                    new SourceBackupDetails(this.sourceRegion, this.sourceBackupId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceBackupDetails model) {
            if (model.wasPropertyExplicitlySet("sourceRegion")) {
                this.sourceRegion(model.getSourceRegion());
            }
            if (model.wasPropertyExplicitlySet("sourceBackupId")) {
                this.sourceBackupId(model.getSourceBackupId());
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

    /** Backup Region of the COPY source type. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
    private final String sourceRegion;

    /**
     * Backup Region of the COPY source type.
     *
     * @return the value
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /** Backup ID of the COPY source type. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceBackupId")
    private final String sourceBackupId;

    /**
     * Backup ID of the COPY source type.
     *
     * @return the value
     */
    public String getSourceBackupId() {
        return sourceBackupId;
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
        sb.append("SourceBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceRegion=").append(String.valueOf(this.sourceRegion));
        sb.append(", sourceBackupId=").append(String.valueOf(this.sourceBackupId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceBackupDetails)) {
            return false;
        }

        SourceBackupDetails other = (SourceBackupDetails) o;
        return java.util.Objects.equals(this.sourceRegion, other.sourceRegion)
                && java.util.Objects.equals(this.sourceBackupId, other.sourceBackupId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceRegion == null ? 43 : this.sourceRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceBackupId == null ? 43 : this.sourceBackupId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
