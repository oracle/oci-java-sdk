/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Details applicable for all OPSI data objects of a specific OpsiDataObjectType used in a data
 * object query. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OpsiDataObjectTypeOpsiDataObjectDetailsInQuery.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dataObjectDetailsTarget")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpsiDataObjectTypeOpsiDataObjectDetailsInQuery
        extends OpsiDataObjectDetailsInQuery {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("queryParams")
        private java.util.List<OpsiDataObjectQueryParam> queryParams;

        public Builder queryParams(java.util.List<OpsiDataObjectQueryParam> queryParams) {
            this.queryParams = queryParams;
            this.__explicitlySet__.add("queryParams");
            return this;
        }
        /** Type of OPSI data object. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataObjectType")
        private OpsiDataObjectType dataObjectType;

        /**
         * Type of OPSI data object.
         *
         * @param dataObjectType the value to set
         * @return this builder
         */
        public Builder dataObjectType(OpsiDataObjectType dataObjectType) {
            this.dataObjectType = dataObjectType;
            this.__explicitlySet__.add("dataObjectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpsiDataObjectTypeOpsiDataObjectDetailsInQuery build() {
            OpsiDataObjectTypeOpsiDataObjectDetailsInQuery model =
                    new OpsiDataObjectTypeOpsiDataObjectDetailsInQuery(
                            this.queryParams, this.dataObjectType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpsiDataObjectTypeOpsiDataObjectDetailsInQuery model) {
            if (model.wasPropertyExplicitlySet("queryParams")) {
                this.queryParams(model.getQueryParams());
            }
            if (model.wasPropertyExplicitlySet("dataObjectType")) {
                this.dataObjectType(model.getDataObjectType());
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

    @Deprecated
    public OpsiDataObjectTypeOpsiDataObjectDetailsInQuery(
            java.util.List<OpsiDataObjectQueryParam> queryParams,
            OpsiDataObjectType dataObjectType) {
        super(queryParams);
        this.dataObjectType = dataObjectType;
    }

    /** Type of OPSI data object. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataObjectType")
    private final OpsiDataObjectType dataObjectType;

    /**
     * Type of OPSI data object.
     *
     * @return the value
     */
    public OpsiDataObjectType getDataObjectType() {
        return dataObjectType;
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
        sb.append("OpsiDataObjectTypeOpsiDataObjectDetailsInQuery(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataObjectType=").append(String.valueOf(this.dataObjectType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiDataObjectTypeOpsiDataObjectDetailsInQuery)) {
            return false;
        }

        OpsiDataObjectTypeOpsiDataObjectDetailsInQuery other =
                (OpsiDataObjectTypeOpsiDataObjectDetailsInQuery) o;
        return java.util.Objects.equals(this.dataObjectType, other.dataObjectType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dataObjectType == null ? 43 : this.dataObjectType.hashCode());
        return result;
    }
}
