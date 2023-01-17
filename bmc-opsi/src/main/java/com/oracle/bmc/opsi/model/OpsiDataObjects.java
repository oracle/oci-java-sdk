/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Logical grouping used for OPSI data object targeted operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OpsiDataObjects.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OpsiDataObjects
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"opsiDataObjects"})
    public OpsiDataObjects(Object opsiDataObjects) {
        super();
        this.opsiDataObjects = opsiDataObjects;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OPSI Data Object. */
        @com.fasterxml.jackson.annotation.JsonProperty("opsiDataObjects")
        private Object opsiDataObjects;

        /**
         * OPSI Data Object.
         *
         * @param opsiDataObjects the value to set
         * @return this builder
         */
        public Builder opsiDataObjects(Object opsiDataObjects) {
            this.opsiDataObjects = opsiDataObjects;
            this.__explicitlySet__.add("opsiDataObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpsiDataObjects build() {
            OpsiDataObjects model = new OpsiDataObjects(this.opsiDataObjects);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpsiDataObjects model) {
            if (model.wasPropertyExplicitlySet("opsiDataObjects")) {
                this.opsiDataObjects(model.getOpsiDataObjects());
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

    /** OPSI Data Object. */
    @com.fasterxml.jackson.annotation.JsonProperty("opsiDataObjects")
    private final Object opsiDataObjects;

    /**
     * OPSI Data Object.
     *
     * @return the value
     */
    public Object getOpsiDataObjects() {
        return opsiDataObjects;
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
        sb.append("OpsiDataObjects(");
        sb.append("super=").append(super.toString());
        sb.append("opsiDataObjects=").append(String.valueOf(this.opsiDataObjects));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiDataObjects)) {
            return false;
        }

        OpsiDataObjects other = (OpsiDataObjects) o;
        return java.util.Objects.equals(this.opsiDataObjects, other.opsiDataObjects)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.opsiDataObjects == null ? 43 : this.opsiDataObjects.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
