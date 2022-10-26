/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specification of both from and to compartments. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ChangeTableCompartmentDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ChangeTableCompartmentDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fromCompartmentId", "toCompartmentId"})
    public ChangeTableCompartmentDetails(String fromCompartmentId, String toCompartmentId) {
        super();
        this.fromCompartmentId = fromCompartmentId;
        this.toCompartmentId = toCompartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the table's current compartment. Required if the tableNameOrId path parameter
         * is a table name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and
         * fromCompartmentId is supplied, the latter must match the identified table's current
         * compartmentId.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fromCompartmentId")
        private String fromCompartmentId;

        /**
         * The OCID of the table's current compartment. Required if the tableNameOrId path parameter
         * is a table name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and
         * fromCompartmentId is supplied, the latter must match the identified table's current
         * compartmentId.
         *
         * @param fromCompartmentId the value to set
         * @return this builder
         */
        public Builder fromCompartmentId(String fromCompartmentId) {
            this.fromCompartmentId = fromCompartmentId;
            this.__explicitlySet__.add("fromCompartmentId");
            return this;
        }
        /** The OCID of the table's new compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("toCompartmentId")
        private String toCompartmentId;

        /**
         * The OCID of the table's new compartment.
         *
         * @param toCompartmentId the value to set
         * @return this builder
         */
        public Builder toCompartmentId(String toCompartmentId) {
            this.toCompartmentId = toCompartmentId;
            this.__explicitlySet__.add("toCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeTableCompartmentDetails build() {
            ChangeTableCompartmentDetails model =
                    new ChangeTableCompartmentDetails(this.fromCompartmentId, this.toCompartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeTableCompartmentDetails model) {
            if (model.wasPropertyExplicitlySet("fromCompartmentId")) {
                this.fromCompartmentId(model.getFromCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("toCompartmentId")) {
                this.toCompartmentId(model.getToCompartmentId());
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
     * The OCID of the table's current compartment. Required if the tableNameOrId path parameter is
     * a table name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and
     * fromCompartmentId is supplied, the latter must match the identified table's current
     * compartmentId.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fromCompartmentId")
    private final String fromCompartmentId;

    /**
     * The OCID of the table's current compartment. Required if the tableNameOrId path parameter is
     * a table name. Optional if tableNameOrId is an OCID. If tableNameOrId is an OCID, and
     * fromCompartmentId is supplied, the latter must match the identified table's current
     * compartmentId.
     *
     * @return the value
     */
    public String getFromCompartmentId() {
        return fromCompartmentId;
    }

    /** The OCID of the table's new compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("toCompartmentId")
    private final String toCompartmentId;

    /**
     * The OCID of the table's new compartment.
     *
     * @return the value
     */
    public String getToCompartmentId() {
        return toCompartmentId;
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
        sb.append("ChangeTableCompartmentDetails(");
        sb.append("super=").append(super.toString());
        sb.append("fromCompartmentId=").append(String.valueOf(this.fromCompartmentId));
        sb.append(", toCompartmentId=").append(String.valueOf(this.toCompartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeTableCompartmentDetails)) {
            return false;
        }

        ChangeTableCompartmentDetails other = (ChangeTableCompartmentDetails) o;
        return java.util.Objects.equals(this.fromCompartmentId, other.fromCompartmentId)
                && java.util.Objects.equals(this.toCompartmentId, other.toCompartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.fromCompartmentId == null ? 43 : this.fromCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.toCompartmentId == null ? 43 : this.toCompartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
