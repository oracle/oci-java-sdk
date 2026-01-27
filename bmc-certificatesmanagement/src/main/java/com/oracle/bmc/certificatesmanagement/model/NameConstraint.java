/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * A constraint that specifies permitted and excluded namespaces for the hierarchical name forms in
 * certificates that any CA in the certificate chain issues. You can define name constraints on a
 * directory name, DNS address, or IP address. If you have a name constraint, you must define at
 * least one permitted namespace or one excluded namespace. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NameConstraint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NameConstraint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"permittedSubtree", "excludedSubtree"})
    public NameConstraint(
            java.util.List<NameConstraintSubtreeNode> permittedSubtree,
            java.util.List<NameConstraintSubtreeNode> excludedSubtree) {
        super();
        this.permittedSubtree = permittedSubtree;
        this.excludedSubtree = excludedSubtree;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list that contains permitted namespaces. If you have a name constraint with no excluded
         * namespaces, you must specify at least one permitted namespace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("permittedSubtree")
        private java.util.List<NameConstraintSubtreeNode> permittedSubtree;

        /**
         * A list that contains permitted namespaces. If you have a name constraint with no excluded
         * namespaces, you must specify at least one permitted namespace.
         *
         * @param permittedSubtree the value to set
         * @return this builder
         */
        public Builder permittedSubtree(
                java.util.List<NameConstraintSubtreeNode> permittedSubtree) {
            this.permittedSubtree = permittedSubtree;
            this.__explicitlySet__.add("permittedSubtree");
            return this;
        }
        /**
         * A list that contains excluded (or prohibited) namespaces. If you have a name constraint
         * with no permitted namespaces, you must specify at least one excluded namespace.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("excludedSubtree")
        private java.util.List<NameConstraintSubtreeNode> excludedSubtree;

        /**
         * A list that contains excluded (or prohibited) namespaces. If you have a name constraint
         * with no permitted namespaces, you must specify at least one excluded namespace.
         *
         * @param excludedSubtree the value to set
         * @return this builder
         */
        public Builder excludedSubtree(java.util.List<NameConstraintSubtreeNode> excludedSubtree) {
            this.excludedSubtree = excludedSubtree;
            this.__explicitlySet__.add("excludedSubtree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NameConstraint build() {
            NameConstraint model = new NameConstraint(this.permittedSubtree, this.excludedSubtree);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NameConstraint model) {
            if (model.wasPropertyExplicitlySet("permittedSubtree")) {
                this.permittedSubtree(model.getPermittedSubtree());
            }
            if (model.wasPropertyExplicitlySet("excludedSubtree")) {
                this.excludedSubtree(model.getExcludedSubtree());
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
     * A list that contains permitted namespaces. If you have a name constraint with no excluded
     * namespaces, you must specify at least one permitted namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("permittedSubtree")
    private final java.util.List<NameConstraintSubtreeNode> permittedSubtree;

    /**
     * A list that contains permitted namespaces. If you have a name constraint with no excluded
     * namespaces, you must specify at least one permitted namespace.
     *
     * @return the value
     */
    public java.util.List<NameConstraintSubtreeNode> getPermittedSubtree() {
        return permittedSubtree;
    }

    /**
     * A list that contains excluded (or prohibited) namespaces. If you have a name constraint with
     * no permitted namespaces, you must specify at least one excluded namespace.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("excludedSubtree")
    private final java.util.List<NameConstraintSubtreeNode> excludedSubtree;

    /**
     * A list that contains excluded (or prohibited) namespaces. If you have a name constraint with
     * no permitted namespaces, you must specify at least one excluded namespace.
     *
     * @return the value
     */
    public java.util.List<NameConstraintSubtreeNode> getExcludedSubtree() {
        return excludedSubtree;
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
        sb.append("NameConstraint(");
        sb.append("super=").append(super.toString());
        sb.append("permittedSubtree=").append(String.valueOf(this.permittedSubtree));
        sb.append(", excludedSubtree=").append(String.valueOf(this.excludedSubtree));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NameConstraint)) {
            return false;
        }

        NameConstraint other = (NameConstraint) o;
        return java.util.Objects.equals(this.permittedSubtree, other.permittedSubtree)
                && java.util.Objects.equals(this.excludedSubtree, other.excludedSubtree)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.permittedSubtree == null ? 43 : this.permittedSubtree.hashCode());
        result =
                (result * PRIME)
                        + (this.excludedSubtree == null ? 43 : this.excludedSubtree.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
