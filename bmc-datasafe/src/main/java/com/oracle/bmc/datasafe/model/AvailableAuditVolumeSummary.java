/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Represents the audit data volume collected by Data Safe from the target database for the
 * specified audit profile. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailableAuditVolumeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AvailableAuditVolumeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "auditProfileId",
        "auditTrailId",
        "databaseUniqueName",
        "trailLocation",
        "monthInConsideration",
        "volume"
    })
    public AvailableAuditVolumeSummary(
            String auditProfileId,
            String auditTrailId,
            String databaseUniqueName,
            String trailLocation,
            java.util.Date monthInConsideration,
            Long volume) {
        super();
        this.auditProfileId = auditProfileId;
        this.auditTrailId = auditTrailId;
        this.databaseUniqueName = databaseUniqueName;
        this.trailLocation = trailLocation;
        this.monthInConsideration = monthInConsideration;
        this.volume = volume;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the audit profile resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
        private String auditProfileId;

        /**
         * The OCID of the audit profile resource.
         *
         * @param auditProfileId the value to set
         * @return this builder
         */
        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = auditProfileId;
            this.__explicitlySet__.add("auditProfileId");
            return this;
        }
        /** The OCID of the audit trail. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditTrailId")
        private String auditTrailId;

        /**
         * The OCID of the audit trail.
         *
         * @param auditTrailId the value to set
         * @return this builder
         */
        public Builder auditTrailId(String auditTrailId) {
            this.auditTrailId = auditTrailId;
            this.__explicitlySet__.add("auditTrailId");
            return this;
        }
        /** Unique name of the database associated to the peer target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseUniqueName")
        private String databaseUniqueName;

        /**
         * Unique name of the database associated to the peer target database.
         *
         * @param databaseUniqueName the value to set
         * @return this builder
         */
        public Builder databaseUniqueName(String databaseUniqueName) {
            this.databaseUniqueName = databaseUniqueName;
            this.__explicitlySet__.add("databaseUniqueName");
            return this;
        }
        /**
         * Audit trail location on the target database from where the audit data is being collected
         * by Data Safe.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trailLocation")
        private String trailLocation;

        /**
         * Audit trail location on the target database from where the audit data is being collected
         * by Data Safe.
         *
         * @param trailLocation the value to set
         * @return this builder
         */
        public Builder trailLocation(String trailLocation) {
            this.trailLocation = trailLocation;
            this.__explicitlySet__.add("trailLocation");
            return this;
        }
        /**
         * Represents the month under consideration for which aggregated audit data volume available
         * at the target is computed. This field will be the UTC start of the day of the first day
         * of the month for which the aggregate count corresponds to, in the format defined by
         * RFC3339.. For instance, the value of 01-01-2021T00:00:00Z represents Jan 2021.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("monthInConsideration")
        private java.util.Date monthInConsideration;

        /**
         * Represents the month under consideration for which aggregated audit data volume available
         * at the target is computed. This field will be the UTC start of the day of the first day
         * of the month for which the aggregate count corresponds to, in the format defined by
         * RFC3339.. For instance, the value of 01-01-2021T00:00:00Z represents Jan 2021.
         *
         * @param monthInConsideration the value to set
         * @return this builder
         */
        public Builder monthInConsideration(java.util.Date monthInConsideration) {
            this.monthInConsideration = monthInConsideration;
            this.__explicitlySet__.add("monthInConsideration");
            return this;
        }
        /**
         * Represents the aggregated audit data volume available in the audit trails on the target
         * database which is yet to be collected by Data Safe for the specified month.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("volume")
        private Long volume;

        /**
         * Represents the aggregated audit data volume available in the audit trails on the target
         * database which is yet to be collected by Data Safe for the specified month.
         *
         * @param volume the value to set
         * @return this builder
         */
        public Builder volume(Long volume) {
            this.volume = volume;
            this.__explicitlySet__.add("volume");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableAuditVolumeSummary build() {
            AvailableAuditVolumeSummary model =
                    new AvailableAuditVolumeSummary(
                            this.auditProfileId,
                            this.auditTrailId,
                            this.databaseUniqueName,
                            this.trailLocation,
                            this.monthInConsideration,
                            this.volume);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableAuditVolumeSummary model) {
            if (model.wasPropertyExplicitlySet("auditProfileId")) {
                this.auditProfileId(model.getAuditProfileId());
            }
            if (model.wasPropertyExplicitlySet("auditTrailId")) {
                this.auditTrailId(model.getAuditTrailId());
            }
            if (model.wasPropertyExplicitlySet("databaseUniqueName")) {
                this.databaseUniqueName(model.getDatabaseUniqueName());
            }
            if (model.wasPropertyExplicitlySet("trailLocation")) {
                this.trailLocation(model.getTrailLocation());
            }
            if (model.wasPropertyExplicitlySet("monthInConsideration")) {
                this.monthInConsideration(model.getMonthInConsideration());
            }
            if (model.wasPropertyExplicitlySet("volume")) {
                this.volume(model.getVolume());
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

    /** The OCID of the audit profile resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
    private final String auditProfileId;

    /**
     * The OCID of the audit profile resource.
     *
     * @return the value
     */
    public String getAuditProfileId() {
        return auditProfileId;
    }

    /** The OCID of the audit trail. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditTrailId")
    private final String auditTrailId;

    /**
     * The OCID of the audit trail.
     *
     * @return the value
     */
    public String getAuditTrailId() {
        return auditTrailId;
    }

    /** Unique name of the database associated to the peer target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseUniqueName")
    private final String databaseUniqueName;

    /**
     * Unique name of the database associated to the peer target database.
     *
     * @return the value
     */
    public String getDatabaseUniqueName() {
        return databaseUniqueName;
    }

    /**
     * Audit trail location on the target database from where the audit data is being collected by
     * Data Safe.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trailLocation")
    private final String trailLocation;

    /**
     * Audit trail location on the target database from where the audit data is being collected by
     * Data Safe.
     *
     * @return the value
     */
    public String getTrailLocation() {
        return trailLocation;
    }

    /**
     * Represents the month under consideration for which aggregated audit data volume available at
     * the target is computed. This field will be the UTC start of the day of the first day of the
     * month for which the aggregate count corresponds to, in the format defined by RFC3339.. For
     * instance, the value of 01-01-2021T00:00:00Z represents Jan 2021.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monthInConsideration")
    private final java.util.Date monthInConsideration;

    /**
     * Represents the month under consideration for which aggregated audit data volume available at
     * the target is computed. This field will be the UTC start of the day of the first day of the
     * month for which the aggregate count corresponds to, in the format defined by RFC3339.. For
     * instance, the value of 01-01-2021T00:00:00Z represents Jan 2021.
     *
     * @return the value
     */
    public java.util.Date getMonthInConsideration() {
        return monthInConsideration;
    }

    /**
     * Represents the aggregated audit data volume available in the audit trails on the target
     * database which is yet to be collected by Data Safe for the specified month.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volume")
    private final Long volume;

    /**
     * Represents the aggregated audit data volume available in the audit trails on the target
     * database which is yet to be collected by Data Safe for the specified month.
     *
     * @return the value
     */
    public Long getVolume() {
        return volume;
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
        sb.append("AvailableAuditVolumeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("auditProfileId=").append(String.valueOf(this.auditProfileId));
        sb.append(", auditTrailId=").append(String.valueOf(this.auditTrailId));
        sb.append(", databaseUniqueName=").append(String.valueOf(this.databaseUniqueName));
        sb.append(", trailLocation=").append(String.valueOf(this.trailLocation));
        sb.append(", monthInConsideration=").append(String.valueOf(this.monthInConsideration));
        sb.append(", volume=").append(String.valueOf(this.volume));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailableAuditVolumeSummary)) {
            return false;
        }

        AvailableAuditVolumeSummary other = (AvailableAuditVolumeSummary) o;
        return java.util.Objects.equals(this.auditProfileId, other.auditProfileId)
                && java.util.Objects.equals(this.auditTrailId, other.auditTrailId)
                && java.util.Objects.equals(this.databaseUniqueName, other.databaseUniqueName)
                && java.util.Objects.equals(this.trailLocation, other.trailLocation)
                && java.util.Objects.equals(this.monthInConsideration, other.monthInConsideration)
                && java.util.Objects.equals(this.volume, other.volume)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.auditProfileId == null ? 43 : this.auditProfileId.hashCode());
        result = (result * PRIME) + (this.auditTrailId == null ? 43 : this.auditTrailId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseUniqueName == null
                                ? 43
                                : this.databaseUniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.trailLocation == null ? 43 : this.trailLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.monthInConsideration == null
                                ? 43
                                : this.monthInConsideration.hashCode());
        result = (result * PRIME) + (this.volume == null ? 43 : this.volume.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
