/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of peer target databases of a primary target database. <br>
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
        builder = PeerTargetDatabaseCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PeerTargetDatabaseCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "targetDatabaseId", "items"})
    public PeerTargetDatabaseCollection(
            String compartmentId,
            String targetDatabaseId,
            java.util.List<PeerTargetDatabaseSummary> items) {
        super();
        this.compartmentId = compartmentId;
        this.targetDatabaseId = targetDatabaseId;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment that contains the primary target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the primary target database.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The OCID of the Data Safe target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseId")
        private String targetDatabaseId;

        /**
         * The OCID of the Data Safe target database.
         *
         * @param targetDatabaseId the value to set
         * @return this builder
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            this.__explicitlySet__.add("targetDatabaseId");
            return this;
        }
        /** The list of peer target databases associated to the primary target database. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<PeerTargetDatabaseSummary> items;

        /**
         * The list of peer target databases associated to the primary target database.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<PeerTargetDatabaseSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PeerTargetDatabaseCollection build() {
            PeerTargetDatabaseCollection model =
                    new PeerTargetDatabaseCollection(
                            this.compartmentId, this.targetDatabaseId, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PeerTargetDatabaseCollection model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetDatabaseId")) {
                this.targetDatabaseId(model.getTargetDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    /** The OCID of the compartment that contains the primary target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the primary target database.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The OCID of the Data Safe target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabaseId")
    private final String targetDatabaseId;

    /**
     * The OCID of the Data Safe target database.
     *
     * @return the value
     */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }

    /** The list of peer target databases associated to the primary target database. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<PeerTargetDatabaseSummary> items;

    /**
     * The list of peer target databases associated to the primary target database.
     *
     * @return the value
     */
    public java.util.List<PeerTargetDatabaseSummary> getItems() {
        return items;
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
        sb.append("PeerTargetDatabaseCollection(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PeerTargetDatabaseCollection)) {
            return false;
        }

        PeerTargetDatabaseCollection other = (PeerTargetDatabaseCollection) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(this.items, other.items)
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
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
