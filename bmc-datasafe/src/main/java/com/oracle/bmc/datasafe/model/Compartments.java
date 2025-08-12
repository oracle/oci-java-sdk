/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Containing the OCID of the compartment and a boolean value to indicates compartmentIdInSubtree.
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Compartments.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Compartments extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "isIncludeSubtree"})
    public Compartments(String id, Boolean isIncludeSubtree) {
        super();
        this.id = id;
        this.isIncludeSubtree = isIncludeSubtree;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment for including target databases to the target database group.
         * All target databases in the compartment will be members of the target database group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the compartment for including target databases to the target database group.
         * All target databases in the compartment will be members of the target database group.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * This indicates whether the target databases of sub-compartments should also be included
         * in the target database group. By default, this parameter is set to false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeSubtree")
        private Boolean isIncludeSubtree;

        /**
         * This indicates whether the target databases of sub-compartments should also be included
         * in the target database group. By default, this parameter is set to false.
         *
         * @param isIncludeSubtree the value to set
         * @return this builder
         */
        public Builder isIncludeSubtree(Boolean isIncludeSubtree) {
            this.isIncludeSubtree = isIncludeSubtree;
            this.__explicitlySet__.add("isIncludeSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Compartments build() {
            Compartments model = new Compartments(this.id, this.isIncludeSubtree);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Compartments model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("isIncludeSubtree")) {
                this.isIncludeSubtree(model.getIsIncludeSubtree());
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
     * The OCID of the compartment for including target databases to the target database group. All
     * target databases in the compartment will be members of the target database group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the compartment for including target databases to the target database group. All
     * target databases in the compartment will be members of the target database group.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * This indicates whether the target databases of sub-compartments should also be included in
     * the target database group. By default, this parameter is set to false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeSubtree")
    private final Boolean isIncludeSubtree;

    /**
     * This indicates whether the target databases of sub-compartments should also be included in
     * the target database group. By default, this parameter is set to false.
     *
     * @return the value
     */
    public Boolean getIsIncludeSubtree() {
        return isIncludeSubtree;
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
        sb.append("Compartments(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", isIncludeSubtree=").append(String.valueOf(this.isIncludeSubtree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Compartments)) {
            return false;
        }

        Compartments other = (Compartments) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.isIncludeSubtree, other.isIncludeSubtree)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncludeSubtree == null ? 43 : this.isIncludeSubtree.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
