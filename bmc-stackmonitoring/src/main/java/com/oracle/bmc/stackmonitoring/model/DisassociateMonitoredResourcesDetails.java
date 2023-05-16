/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information required to create new monitored resource association. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DisassociateMonitoredResourcesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DisassociateMonitoredResourcesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "associationType",
        "sourceResourceId",
        "destinationResourceId"
    })
    public DisassociateMonitoredResourcesDetails(
            String compartmentId,
            String associationType,
            String sourceResourceId,
            String destinationResourceId) {
        super();
        this.compartmentId = compartmentId;
        this.associationType = associationType;
        this.sourceResourceId = sourceResourceId;
        this.destinationResourceId = destinationResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Association type between source and destination resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private String associationType;

        /**
         * Association type between source and destination resources.
         *
         * @param associationType the value to set
         * @return this builder
         */
        public Builder associationType(String associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }
        /**
         * Source Monitored Resource Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
        private String sourceResourceId;

        /**
         * Source Monitored Resource Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param sourceResourceId the value to set
         * @return this builder
         */
        public Builder sourceResourceId(String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            this.__explicitlySet__.add("sourceResourceId");
            return this;
        }
        /**
         * Destination Monitored Resource Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
        private String destinationResourceId;

        /**
         * Destination Monitored Resource Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param destinationResourceId the value to set
         * @return this builder
         */
        public Builder destinationResourceId(String destinationResourceId) {
            this.destinationResourceId = destinationResourceId;
            this.__explicitlySet__.add("destinationResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisassociateMonitoredResourcesDetails build() {
            DisassociateMonitoredResourcesDetails model =
                    new DisassociateMonitoredResourcesDetails(
                            this.compartmentId,
                            this.associationType,
                            this.sourceResourceId,
                            this.destinationResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisassociateMonitoredResourcesDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("associationType")) {
                this.associationType(model.getAssociationType());
            }
            if (model.wasPropertyExplicitlySet("sourceResourceId")) {
                this.sourceResourceId(model.getSourceResourceId());
            }
            if (model.wasPropertyExplicitlySet("destinationResourceId")) {
                this.destinationResourceId(model.getDestinationResourceId());
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
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Association type between source and destination resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final String associationType;

    /**
     * Association type between source and destination resources.
     *
     * @return the value
     */
    public String getAssociationType() {
        return associationType;
    }

    /**
     * Source Monitored Resource Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
    private final String sourceResourceId;

    /**
     * Source Monitored Resource Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getSourceResourceId() {
        return sourceResourceId;
    }

    /**
     * Destination Monitored Resource Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationResourceId")
    private final String destinationResourceId;

    /**
     * Destination Monitored Resource Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getDestinationResourceId() {
        return destinationResourceId;
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
        sb.append("DisassociateMonitoredResourcesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", associationType=").append(String.valueOf(this.associationType));
        sb.append(", sourceResourceId=").append(String.valueOf(this.sourceResourceId));
        sb.append(", destinationResourceId=").append(String.valueOf(this.destinationResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisassociateMonitoredResourcesDetails)) {
            return false;
        }

        DisassociateMonitoredResourcesDetails other = (DisassociateMonitoredResourcesDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.associationType, other.associationType)
                && java.util.Objects.equals(this.sourceResourceId, other.sourceResourceId)
                && java.util.Objects.equals(this.destinationResourceId, other.destinationResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.associationType == null ? 43 : this.associationType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceResourceId == null ? 43 : this.sourceResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationResourceId == null
                                ? 43
                                : this.destinationResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
