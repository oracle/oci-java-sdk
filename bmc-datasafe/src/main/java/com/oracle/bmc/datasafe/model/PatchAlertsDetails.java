/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The alert details to update the status of one or more alert specified by the alert IDs.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PatchAlertsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchAlertsDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "compartmentId"})
    public PatchAlertsDetails(java.util.List<PatchInstruction> items, String compartmentId) {
        super();
        this.items = items;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Array of alert detail to update the status of the alert specified by the alert ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<PatchInstruction> items;

        /**
         * Array of alert detail to update the status of the alert specified by the alert ID.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<PatchInstruction> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /**
         * The OCID of the compartment that contains the alerts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the alerts.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchAlertsDetails build() {
            PatchAlertsDetails model = new PatchAlertsDetails(this.items, this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchAlertsDetails model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
     * Array of alert detail to update the status of the alert specified by the alert ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<PatchInstruction> items;

    /**
     * Array of alert detail to update the status of the alert specified by the alert ID.
     * @return the value
     **/
    public java.util.List<PatchInstruction> getItems() {
        return items;
    }

    /**
     * The OCID of the compartment that contains the alerts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the alerts.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("PatchAlertsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchAlertsDetails)) {
            return false;
        }

        PatchAlertsDetails other = (PatchAlertsDetails) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
