/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Request to check resource tagging. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CheckResourceTaggingDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CheckResourceTaggingDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "fleetDisplayName", "resourceIds"})
    public CheckResourceTaggingDetails(
            String compartmentId, String fleetDisplayName, java.util.List<String> resourceIds) {
        super();
        this.compartmentId = compartmentId;
        this.fleetDisplayName = fleetDisplayName;
        this.resourceIds = resourceIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Compartment OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Fleet Display Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetDisplayName")
        private String fleetDisplayName;

        /**
         * Fleet Display Name.
         *
         * @param fleetDisplayName the value to set
         * @return this builder
         */
        public Builder fleetDisplayName(String fleetDisplayName) {
            this.fleetDisplayName = fleetDisplayName;
            this.__explicitlySet__.add("fleetDisplayName");
            return this;
        }
        /** Resource OCIDS that need to be verified if a tag can be enabled for them. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
        private java.util.List<String> resourceIds;

        /**
         * Resource OCIDS that need to be verified if a tag can be enabled for them.
         *
         * @param resourceIds the value to set
         * @return this builder
         */
        public Builder resourceIds(java.util.List<String> resourceIds) {
            this.resourceIds = resourceIds;
            this.__explicitlySet__.add("resourceIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CheckResourceTaggingDetails build() {
            CheckResourceTaggingDetails model =
                    new CheckResourceTaggingDetails(
                            this.compartmentId, this.fleetDisplayName, this.resourceIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CheckResourceTaggingDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fleetDisplayName")) {
                this.fleetDisplayName(model.getFleetDisplayName());
            }
            if (model.wasPropertyExplicitlySet("resourceIds")) {
                this.resourceIds(model.getResourceIds());
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

    /** Compartment OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Fleet Display Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetDisplayName")
    private final String fleetDisplayName;

    /**
     * Fleet Display Name.
     *
     * @return the value
     */
    public String getFleetDisplayName() {
        return fleetDisplayName;
    }

    /** Resource OCIDS that need to be verified if a tag can be enabled for them. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceIds")
    private final java.util.List<String> resourceIds;

    /**
     * Resource OCIDS that need to be verified if a tag can be enabled for them.
     *
     * @return the value
     */
    public java.util.List<String> getResourceIds() {
        return resourceIds;
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
        sb.append("CheckResourceTaggingDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fleetDisplayName=").append(String.valueOf(this.fleetDisplayName));
        sb.append(", resourceIds=").append(String.valueOf(this.resourceIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CheckResourceTaggingDetails)) {
            return false;
        }

        CheckResourceTaggingDetails other = (CheckResourceTaggingDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fleetDisplayName, other.fleetDisplayName)
                && java.util.Objects.equals(this.resourceIds, other.resourceIds)
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
                        + (this.fleetDisplayName == null ? 43 : this.fleetDisplayName.hashCode());
        result = (result * PRIME) + (this.resourceIds == null ? 43 : this.resourceIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
