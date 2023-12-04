/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * List of the objects. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ListObjects.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListObjects extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"prefixes", "nextStartWith", "objects"})
    public ListObjects(
            java.util.List<String> prefixes,
            String nextStartWith,
            java.util.List<ObjectSummary> objects) {
        super();
        this.prefixes = prefixes;
        this.nextStartWith = nextStartWith;
        this.objects = objects;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Array comprising of all the prefixes. */
        @com.fasterxml.jackson.annotation.JsonProperty("prefixes")
        private java.util.List<String> prefixes;

        /**
         * Array comprising of all the prefixes.
         *
         * @param prefixes the value to set
         * @return this builder
         */
        public Builder prefixes(java.util.List<String> prefixes) {
            this.prefixes = prefixes;
            this.__explicitlySet__.add("prefixes");
            return this;
        }
        /** Object names returned by a list query must be greater or equal to this parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("nextStartWith")
        private String nextStartWith;

        /**
         * Object names returned by a list query must be greater or equal to this parameter.
         *
         * @param nextStartWith the value to set
         * @return this builder
         */
        public Builder nextStartWith(String nextStartWith) {
            this.nextStartWith = nextStartWith;
            this.__explicitlySet__.add("nextStartWith");
            return this;
        }
        /** List of the object summary data. */
        @com.fasterxml.jackson.annotation.JsonProperty("objects")
        private java.util.List<ObjectSummary> objects;

        /**
         * List of the object summary data.
         *
         * @param objects the value to set
         * @return this builder
         */
        public Builder objects(java.util.List<ObjectSummary> objects) {
            this.objects = objects;
            this.__explicitlySet__.add("objects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListObjects build() {
            ListObjects model = new ListObjects(this.prefixes, this.nextStartWith, this.objects);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListObjects model) {
            if (model.wasPropertyExplicitlySet("prefixes")) {
                this.prefixes(model.getPrefixes());
            }
            if (model.wasPropertyExplicitlySet("nextStartWith")) {
                this.nextStartWith(model.getNextStartWith());
            }
            if (model.wasPropertyExplicitlySet("objects")) {
                this.objects(model.getObjects());
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

    /** Array comprising of all the prefixes. */
    @com.fasterxml.jackson.annotation.JsonProperty("prefixes")
    private final java.util.List<String> prefixes;

    /**
     * Array comprising of all the prefixes.
     *
     * @return the value
     */
    public java.util.List<String> getPrefixes() {
        return prefixes;
    }

    /** Object names returned by a list query must be greater or equal to this parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("nextStartWith")
    private final String nextStartWith;

    /**
     * Object names returned by a list query must be greater or equal to this parameter.
     *
     * @return the value
     */
    public String getNextStartWith() {
        return nextStartWith;
    }

    /** List of the object summary data. */
    @com.fasterxml.jackson.annotation.JsonProperty("objects")
    private final java.util.List<ObjectSummary> objects;

    /**
     * List of the object summary data.
     *
     * @return the value
     */
    public java.util.List<ObjectSummary> getObjects() {
        return objects;
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
        sb.append("ListObjects(");
        sb.append("super=").append(super.toString());
        sb.append("prefixes=").append(String.valueOf(this.prefixes));
        sb.append(", nextStartWith=").append(String.valueOf(this.nextStartWith));
        sb.append(", objects=").append(String.valueOf(this.objects));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListObjects)) {
            return false;
        }

        ListObjects other = (ListObjects) o;
        return java.util.Objects.equals(this.prefixes, other.prefixes)
                && java.util.Objects.equals(this.nextStartWith, other.nextStartWith)
                && java.util.Objects.equals(this.objects, other.objects)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.prefixes == null ? 43 : this.prefixes.hashCode());
        result =
                (result * PRIME)
                        + (this.nextStartWith == null ? 43 : this.nextStartWith.hashCode());
        result = (result * PRIME) + (this.objects == null ? 43 : this.objects.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
