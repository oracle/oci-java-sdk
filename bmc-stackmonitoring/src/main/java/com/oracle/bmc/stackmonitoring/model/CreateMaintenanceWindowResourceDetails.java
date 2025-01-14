/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * List of resource IDs that are part of the Maintenance Window. <br>
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
        builder = CreateMaintenanceWindowResourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMaintenanceWindowResourceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceId", "areMembersIncluded"})
    public CreateMaintenanceWindowResourceDetails(String resourceId, Boolean areMembersIncluded) {
        super();
        this.resourceId = resourceId;
        this.areMembersIncluded = areMembersIncluded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * monitored resource part of the Maintenance window.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * monitored resource part of the Maintenance window.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Flag to indicate if the members of the resource has to be include in the Maintenance
         * Window.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areMembersIncluded")
        private Boolean areMembersIncluded;

        /**
         * Flag to indicate if the members of the resource has to be include in the Maintenance
         * Window.
         *
         * @param areMembersIncluded the value to set
         * @return this builder
         */
        public Builder areMembersIncluded(Boolean areMembersIncluded) {
            this.areMembersIncluded = areMembersIncluded;
            this.__explicitlySet__.add("areMembersIncluded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaintenanceWindowResourceDetails build() {
            CreateMaintenanceWindowResourceDetails model =
                    new CreateMaintenanceWindowResourceDetails(
                            this.resourceId, this.areMembersIncluded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaintenanceWindowResourceDetails model) {
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("areMembersIncluded")) {
                this.areMembersIncluded(model.getAreMembersIncluded());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
     * monitored resource part of the Maintenance window.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
     * monitored resource part of the Maintenance window.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Flag to indicate if the members of the resource has to be include in the Maintenance Window.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areMembersIncluded")
    private final Boolean areMembersIncluded;

    /**
     * Flag to indicate if the members of the resource has to be include in the Maintenance Window.
     *
     * @return the value
     */
    public Boolean getAreMembersIncluded() {
        return areMembersIncluded;
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
        sb.append("CreateMaintenanceWindowResourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", areMembersIncluded=").append(String.valueOf(this.areMembersIncluded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMaintenanceWindowResourceDetails)) {
            return false;
        }

        CreateMaintenanceWindowResourceDetails other = (CreateMaintenanceWindowResourceDetails) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.areMembersIncluded, other.areMembersIncluded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.areMembersIncluded == null
                                ? 43
                                : this.areMembersIncluded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
