/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * The information about monitored resource association. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssociationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AssociationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceResourceId", "associationType"})
    public AssociationDetails(String sourceResourceId, String associationType) {
        super();
        this.sourceResourceId = sourceResourceId;
        this.associationType = associationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Source Monitored Resource Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
        private String sourceResourceId;

        /**
         * Source Monitored Resource Identifier
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
         *
         * @param sourceResourceId the value to set
         * @return this builder
         */
        public Builder sourceResourceId(String sourceResourceId) {
            this.sourceResourceId = sourceResourceId;
            this.__explicitlySet__.add("sourceResourceId");
            return this;
        }
        /** Association Type */
        @com.fasterxml.jackson.annotation.JsonProperty("associationType")
        private String associationType;

        /**
         * Association Type
         *
         * @param associationType the value to set
         * @return this builder
         */
        public Builder associationType(String associationType) {
            this.associationType = associationType;
            this.__explicitlySet__.add("associationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociationDetails build() {
            AssociationDetails model =
                    new AssociationDetails(this.sourceResourceId, this.associationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociationDetails model) {
            if (model.wasPropertyExplicitlySet("sourceResourceId")) {
                this.sourceResourceId(model.getSourceResourceId());
            }
            if (model.wasPropertyExplicitlySet("associationType")) {
                this.associationType(model.getAssociationType());
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
     * Source Monitored Resource Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceResourceId")
    private final String sourceResourceId;

    /**
     * Source Monitored Resource Identifier
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     *
     * @return the value
     */
    public String getSourceResourceId() {
        return sourceResourceId;
    }

    /** Association Type */
    @com.fasterxml.jackson.annotation.JsonProperty("associationType")
    private final String associationType;

    /**
     * Association Type
     *
     * @return the value
     */
    public String getAssociationType() {
        return associationType;
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
        sb.append("AssociationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceResourceId=").append(String.valueOf(this.sourceResourceId));
        sb.append(", associationType=").append(String.valueOf(this.associationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociationDetails)) {
            return false;
        }

        AssociationDetails other = (AssociationDetails) o;
        return java.util.Objects.equals(this.sourceResourceId, other.sourceResourceId)
                && java.util.Objects.equals(this.associationType, other.associationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceResourceId == null ? 43 : this.sourceResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.associationType == null ? 43 : this.associationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
