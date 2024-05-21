/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * An object that defines the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) and the availability of a vendor software source.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SoftwareSourceAvailability.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SoftwareSourceAvailability
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"softwareSourceId", "availability", "availabilityAtOci"})
    public SoftwareSourceAvailability(
            String softwareSourceId, Availability availability, Availability availabilityAtOci) {
        super();
        this.softwareSourceId = softwareSourceId;
        this.availability = availability;
        this.availabilityAtOci = availabilityAtOci;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the vendor software source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
        private String softwareSourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the vendor software source.
         * @param softwareSourceId the value to set
         * @return this builder
         **/
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            this.__explicitlySet__.add("softwareSourceId");
            return this;
        }
        /**
         * Availability of the software source to instances in private data centers or third-party clouds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availability")
        private Availability availability;

        /**
         * Availability of the software source to instances in private data centers or third-party clouds.
         * @param availability the value to set
         * @return this builder
         **/
        public Builder availability(Availability availability) {
            this.availability = availability;
            this.__explicitlySet__.add("availability");
            return this;
        }
        /**
         * Availability of the software source to OCI instances.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityAtOci")
        private Availability availabilityAtOci;

        /**
         * Availability of the software source to OCI instances.
         * @param availabilityAtOci the value to set
         * @return this builder
         **/
        public Builder availabilityAtOci(Availability availabilityAtOci) {
            this.availabilityAtOci = availabilityAtOci;
            this.__explicitlySet__.add("availabilityAtOci");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwareSourceAvailability build() {
            SoftwareSourceAvailability model =
                    new SoftwareSourceAvailability(
                            this.softwareSourceId, this.availability, this.availabilityAtOci);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwareSourceAvailability model) {
            if (model.wasPropertyExplicitlySet("softwareSourceId")) {
                this.softwareSourceId(model.getSoftwareSourceId());
            }
            if (model.wasPropertyExplicitlySet("availability")) {
                this.availability(model.getAvailability());
            }
            if (model.wasPropertyExplicitlySet("availabilityAtOci")) {
                this.availabilityAtOci(model.getAvailabilityAtOci());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the vendor software source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceId")
    private final String softwareSourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the vendor software source.
     * @return the value
     **/
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }

    /**
     * Availability of the software source to instances in private data centers or third-party clouds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availability")
    private final Availability availability;

    /**
     * Availability of the software source to instances in private data centers or third-party clouds.
     * @return the value
     **/
    public Availability getAvailability() {
        return availability;
    }

    /**
     * Availability of the software source to OCI instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityAtOci")
    private final Availability availabilityAtOci;

    /**
     * Availability of the software source to OCI instances.
     * @return the value
     **/
    public Availability getAvailabilityAtOci() {
        return availabilityAtOci;
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
        sb.append("SoftwareSourceAvailability(");
        sb.append("super=").append(super.toString());
        sb.append("softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(", availability=").append(String.valueOf(this.availability));
        sb.append(", availabilityAtOci=").append(String.valueOf(this.availabilityAtOci));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwareSourceAvailability)) {
            return false;
        }

        SoftwareSourceAvailability other = (SoftwareSourceAvailability) o;
        return java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(this.availability, other.availability)
                && java.util.Objects.equals(this.availabilityAtOci, other.availabilityAtOci)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result = (result * PRIME) + (this.availability == null ? 43 : this.availability.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityAtOci == null ? 43 : this.availabilityAtOci.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
