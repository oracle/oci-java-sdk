/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Compliance details for a fleet in Fleet Application Management. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ComplianceReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComplianceReport
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "fleetId",
        "complianceState",
        "percentCompliant",
        "resources"
    })
    public ComplianceReport(
            String id,
            String fleetId,
            ComplianceState complianceState,
            Float percentCompliant,
            java.util.List<ComplianceReportResource> resources) {
        super();
        this.id = id;
        this.fleetId = fleetId;
        this.complianceState = complianceState;
        this.percentCompliant = percentCompliant;
        this.resources = resources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compliance Report Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Compliance Report Identifier
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The fleet OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The fleet OCID.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /** The last known compliance state of the fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
        private ComplianceState complianceState;

        /**
         * The last known compliance state of the fleet.
         *
         * @param complianceState the value to set
         * @return this builder
         */
        public Builder complianceState(ComplianceState complianceState) {
            this.complianceState = complianceState;
            this.__explicitlySet__.add("complianceState");
            return this;
        }
        /** The compliance percentage. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentCompliant")
        private Float percentCompliant;

        /**
         * The compliance percentage.
         *
         * @param percentCompliant the value to set
         * @return this builder
         */
        public Builder percentCompliant(Float percentCompliant) {
            this.percentCompliant = percentCompliant;
            this.__explicitlySet__.add("percentCompliant");
            return this;
        }
        /** Resources associated with the Fleet. */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<ComplianceReportResource> resources;

        /**
         * Resources associated with the Fleet.
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<ComplianceReportResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceReport build() {
            ComplianceReport model =
                    new ComplianceReport(
                            this.id,
                            this.fleetId,
                            this.complianceState,
                            this.percentCompliant,
                            this.resources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceReport model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("complianceState")) {
                this.complianceState(model.getComplianceState());
            }
            if (model.wasPropertyExplicitlySet("percentCompliant")) {
                this.percentCompliant(model.getPercentCompliant());
            }
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
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

    /** Compliance Report Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Compliance Report Identifier
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The fleet OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The fleet OCID.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /** The last known compliance state of the fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("complianceState")
    private final ComplianceState complianceState;

    /**
     * The last known compliance state of the fleet.
     *
     * @return the value
     */
    public ComplianceState getComplianceState() {
        return complianceState;
    }

    /** The compliance percentage. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentCompliant")
    private final Float percentCompliant;

    /**
     * The compliance percentage.
     *
     * @return the value
     */
    public Float getPercentCompliant() {
        return percentCompliant;
    }

    /** Resources associated with the Fleet. */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<ComplianceReportResource> resources;

    /**
     * Resources associated with the Fleet.
     *
     * @return the value
     */
    public java.util.List<ComplianceReportResource> getResources() {
        return resources;
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
        sb.append("ComplianceReport(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", complianceState=").append(String.valueOf(this.complianceState));
        sb.append(", percentCompliant=").append(String.valueOf(this.percentCompliant));
        sb.append(", resources=").append(String.valueOf(this.resources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceReport)) {
            return false;
        }

        ComplianceReport other = (ComplianceReport) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.complianceState, other.complianceState)
                && java.util.Objects.equals(this.percentCompliant, other.percentCompliant)
                && java.util.Objects.equals(this.resources, other.resources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.complianceState == null ? 43 : this.complianceState.hashCode());
        result =
                (result * PRIME)
                        + (this.percentCompliant == null ? 43 : this.percentCompliant.hashCode());
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
