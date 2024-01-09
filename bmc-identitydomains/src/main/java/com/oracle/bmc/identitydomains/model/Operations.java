/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Each patch operation object MUST have exactly one "op" member, whose value indicates the
 * operation to perform and MAY be one of "add", "remove", or "replace". See [Section
 * 3.5.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.5.2) for details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Operations.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Operations extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"op", "path", "value"})
    public Operations(Op op, String path, Object value) {
        super();
        this.op = op;
        this.path = path;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defines the operation to be performed for this Patch. If op=remove, value is not
         * required.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("op")
        private Op op;

        /**
         * Defines the operation to be performed for this Patch. If op=remove, value is not
         * required.
         *
         * @param op the value to set
         * @return this builder
         */
        public Builder op(Op op) {
            this.op = op;
            this.__explicitlySet__.add("op");
            return this;
        }
        /**
         * String containing an attribute path describing the target of the operation. The "path"
         * attribute is OPTIONAL for "add" and "replace" and is REQUIRED for "remove" operations.
         * See [Section 3.5.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.5.2) for
         * details
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * String containing an attribute path describing the target of the operation. The "path"
         * attribute is OPTIONAL for "add" and "replace" and is REQUIRED for "remove" operations.
         * See [Section 3.5.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.5.2) for
         * details
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * The value could be either a simple value attribute e.g. string or number OR complex like
         * map of the attributes to be added or replaced OR multivalues complex attributes.q1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private Object value;

        /**
         * The value could be either a simple value attribute e.g. string or number OR complex like
         * map of the attributes to be added or replaced OR multivalues complex attributes.q1
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(Object value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Operations build() {
            Operations model = new Operations(this.op, this.path, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Operations model) {
            if (model.wasPropertyExplicitlySet("op")) {
                this.op(model.getOp());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
     * Defines the operation to be performed for this Patch. If op=remove, value is not required.
     */
    public enum Op implements com.oracle.bmc.http.internal.BmcEnum {
        Add("ADD"),
        Remove("REMOVE"),
        Replace("REPLACE"),
        ;

        private final String value;
        private static java.util.Map<String, Op> map;

        static {
            map = new java.util.HashMap<>();
            for (Op v : Op.values()) {
                map.put(v.getValue(), v);
            }
        }

        Op(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Op create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Op: " + key);
        }
    };
    /**
     * Defines the operation to be performed for this Patch. If op=remove, value is not required.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("op")
    private final Op op;

    /**
     * Defines the operation to be performed for this Patch. If op=remove, value is not required.
     *
     * @return the value
     */
    public Op getOp() {
        return op;
    }

    /**
     * String containing an attribute path describing the target of the operation. The "path"
     * attribute is OPTIONAL for "add" and "replace" and is REQUIRED for "remove" operations. See
     * [Section 3.5.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.5.2) for details
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * String containing an attribute path describing the target of the operation. The "path"
     * attribute is OPTIONAL for "add" and "replace" and is REQUIRED for "remove" operations. See
     * [Section 3.5.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.5.2) for details
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * The value could be either a simple value attribute e.g. string or number OR complex like map
     * of the attributes to be added or replaced OR multivalues complex attributes.q1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final Object value;

    /**
     * The value could be either a simple value attribute e.g. string or number OR complex like map
     * of the attributes to be added or replaced OR multivalues complex attributes.q1
     *
     * @return the value
     */
    public Object getValue() {
        return value;
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
        sb.append("Operations(");
        sb.append("super=").append(super.toString());
        sb.append("op=").append(String.valueOf(this.op));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Operations)) {
            return false;
        }

        Operations other = (Operations) o;
        return java.util.Objects.equals(this.op, other.op)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.op == null ? 43 : this.op.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
