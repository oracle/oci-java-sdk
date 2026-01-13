/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Information about the associations to be added between a source log analytics entity and other
 * existing destination entities. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddEntityAssociationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddEntityAssociationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"associationEntities"})
    public AddEntityAssociationDetails(java.util.List<String> associationEntities) {
        super();
        this.associationEntities = associationEntities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Destination entities OCIDs with which associations are to be added. */
        @com.fasterxml.jackson.annotation.JsonProperty("associationEntities")
        private java.util.List<String> associationEntities;

        /**
         * Destination entities OCIDs with which associations are to be added.
         *
         * @param associationEntities the value to set
         * @return this builder
         */
        public Builder associationEntities(java.util.List<String> associationEntities) {
            this.associationEntities = associationEntities;
            this.__explicitlySet__.add("associationEntities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddEntityAssociationDetails build() {
            AddEntityAssociationDetails model =
                    new AddEntityAssociationDetails(this.associationEntities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddEntityAssociationDetails model) {
            if (model.wasPropertyExplicitlySet("associationEntities")) {
                this.associationEntities(model.getAssociationEntities());
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

    /** Destination entities OCIDs with which associations are to be added. */
    @com.fasterxml.jackson.annotation.JsonProperty("associationEntities")
    private final java.util.List<String> associationEntities;

    /**
     * Destination entities OCIDs with which associations are to be added.
     *
     * @return the value
     */
    public java.util.List<String> getAssociationEntities() {
        return associationEntities;
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
        sb.append("AddEntityAssociationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("associationEntities=").append(String.valueOf(this.associationEntities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddEntityAssociationDetails)) {
            return false;
        }

        AddEntityAssociationDetails other = (AddEntityAssociationDetails) o;
        return java.util.Objects.equals(this.associationEntities, other.associationEntities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.associationEntities == null
                                ? 43
                                : this.associationEntities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
