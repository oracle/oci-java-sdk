/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A reference to the object's parent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParentReference.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ParentReference
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"parent", "rootDocId"})
    public ParentReference(String parent, String rootDocId) {
        super();
        this.parent = parent;
        this.rootDocId = rootDocId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Key of the parent object. */
        @com.fasterxml.jackson.annotation.JsonProperty("parent")
        private String parent;

        /**
         * Key of the parent object.
         *
         * @param parent the value to set
         * @return this builder
         */
        public Builder parent(String parent) {
            this.parent = parent;
            this.__explicitlySet__.add("parent");
            return this;
        }
        /** Key of the root document object. */
        @com.fasterxml.jackson.annotation.JsonProperty("rootDocId")
        private String rootDocId;

        /**
         * Key of the root document object.
         *
         * @param rootDocId the value to set
         * @return this builder
         */
        public Builder rootDocId(String rootDocId) {
            this.rootDocId = rootDocId;
            this.__explicitlySet__.add("rootDocId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParentReference build() {
            ParentReference model = new ParentReference(this.parent, this.rootDocId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParentReference model) {
            if (model.wasPropertyExplicitlySet("parent")) {
                this.parent(model.getParent());
            }
            if (model.wasPropertyExplicitlySet("rootDocId")) {
                this.rootDocId(model.getRootDocId());
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

    /** Key of the parent object. */
    @com.fasterxml.jackson.annotation.JsonProperty("parent")
    private final String parent;

    /**
     * Key of the parent object.
     *
     * @return the value
     */
    public String getParent() {
        return parent;
    }

    /** Key of the root document object. */
    @com.fasterxml.jackson.annotation.JsonProperty("rootDocId")
    private final String rootDocId;

    /**
     * Key of the root document object.
     *
     * @return the value
     */
    public String getRootDocId() {
        return rootDocId;
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
        sb.append("ParentReference(");
        sb.append("super=").append(super.toString());
        sb.append("parent=").append(String.valueOf(this.parent));
        sb.append(", rootDocId=").append(String.valueOf(this.rootDocId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParentReference)) {
            return false;
        }

        ParentReference other = (ParentReference) o;
        return java.util.Objects.equals(this.parent, other.parent)
                && java.util.Objects.equals(this.rootDocId, other.rootDocId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.parent == null ? 43 : this.parent.hashCode());
        result = (result * PRIME) + (this.rootDocId == null ? 43 : this.rootDocId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
