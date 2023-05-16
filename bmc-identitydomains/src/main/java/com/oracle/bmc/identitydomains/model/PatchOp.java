/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * See [Section 3.5.2](https://tools.ietf.org/html/draft-ietf-scim-api-19#section-3.5.2). HTTP PATCH
 * is an OPTIONAL server function that enables clients to update one or more attributes of a SCIM
 * resource using a sequence of operations to "add", "remove", or "replace" values. Clients may
 * discover service provider support for PATCH by querying the service provider configuration. The
 * general form of the SCIM patch request is based on JavaScript Object Notation (JSON) Patch
 * [RFC6902]. One difference between SCIM patch and JSON patch is that SCIM servers do not support
 * array indexing and do not support [RFC6902] operation types relating to array element
 * manipulation such as "move". A patch request, regardless of the number of operations, SHALL be
 * treated as atomic. If a single operation encounters an error condition, the original SCIM
 * resource MUST be restored, and a failure status SHALL be returned. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchOp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PatchOp extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"schemas", "operations"})
    public PatchOp(java.util.List<String> schemas, java.util.List<Operations> operations) {
        super();
        this.schemas = schemas;
        this.operations = operations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The schemas attribute is an array of Strings which allows introspection of the supported
         * schema version for a SCIM representation as well any schema extensions supported by that
         * representation. Each String value must be a unique URI. All representations of SCIM
         * schema MUST include a non-zero value array with value(s) of the URIs supported by that
         * representation. Duplicate values MUST NOT be included. Value order is not specified and
         * MUST not impact behavior. REQUIRED.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<String> schemas;

        /**
         * The schemas attribute is an array of Strings which allows introspection of the supported
         * schema version for a SCIM representation as well any schema extensions supported by that
         * representation. Each String value must be a unique URI. All representations of SCIM
         * schema MUST include a non-zero value array with value(s) of the URIs supported by that
         * representation. Duplicate values MUST NOT be included. Value order is not specified and
         * MUST not impact behavior. REQUIRED.
         *
         * @param schemas the value to set
         * @return this builder
         */
        public Builder schemas(java.util.List<String> schemas) {
            this.schemas = schemas;
            this.__explicitlySet__.add("schemas");
            return this;
        }
        /**
         * The body of an HTTP PATCH request MUST contain the attribute "Operations", whose value is
         * an array of one or more patch operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("Operations")
        private java.util.List<Operations> operations;

        /**
         * The body of an HTTP PATCH request MUST contain the attribute "Operations", whose value is
         * an array of one or more patch operations.
         *
         * @param operations the value to set
         * @return this builder
         */
        public Builder operations(java.util.List<Operations> operations) {
            this.operations = operations;
            this.__explicitlySet__.add("operations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PatchOp build() {
            PatchOp model = new PatchOp(this.schemas, this.operations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchOp model) {
            if (model.wasPropertyExplicitlySet("schemas")) {
                this.schemas(model.getSchemas());
            }
            if (model.wasPropertyExplicitlySet("operations")) {
                this.operations(model.getOperations());
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
     * The schemas attribute is an array of Strings which allows introspection of the supported
     * schema version for a SCIM representation as well any schema extensions supported by that
     * representation. Each String value must be a unique URI. All representations of SCIM schema
     * MUST include a non-zero value array with value(s) of the URIs supported by that
     * representation. Duplicate values MUST NOT be included. Value order is not specified and MUST
     * not impact behavior. REQUIRED.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<String> schemas;

    /**
     * The schemas attribute is an array of Strings which allows introspection of the supported
     * schema version for a SCIM representation as well any schema extensions supported by that
     * representation. Each String value must be a unique URI. All representations of SCIM schema
     * MUST include a non-zero value array with value(s) of the URIs supported by that
     * representation. Duplicate values MUST NOT be included. Value order is not specified and MUST
     * not impact behavior. REQUIRED.
     *
     * @return the value
     */
    public java.util.List<String> getSchemas() {
        return schemas;
    }

    /**
     * The body of an HTTP PATCH request MUST contain the attribute "Operations", whose value is an
     * array of one or more patch operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("Operations")
    private final java.util.List<Operations> operations;

    /**
     * The body of an HTTP PATCH request MUST contain the attribute "Operations", whose value is an
     * array of one or more patch operations.
     *
     * @return the value
     */
    public java.util.List<Operations> getOperations() {
        return operations;
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
        sb.append("PatchOp(");
        sb.append("super=").append(super.toString());
        sb.append("schemas=").append(String.valueOf(this.schemas));
        sb.append(", operations=").append(String.valueOf(this.operations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PatchOp)) {
            return false;
        }

        PatchOp other = (PatchOp) o;
        return java.util.Objects.equals(this.schemas, other.schemas)
                && java.util.Objects.equals(this.operations, other.operations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemas == null ? 43 : this.schemas.hashCode());
        result = (result * PRIME) + (this.operations == null ? 43 : this.operations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
