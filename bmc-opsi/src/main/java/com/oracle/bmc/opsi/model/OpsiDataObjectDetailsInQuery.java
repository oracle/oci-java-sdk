/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Details for OPSI data object used in a data object query. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "dataObjectDetailsTarget",
        defaultImpl = OpsiDataObjectDetailsInQuery.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = IndividualOpsiDataObjectDetailsInQuery.class,
            name = "INDIVIDUAL_OPSIDATAOBJECT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = OpsiDataObjectTypeOpsiDataObjectDetailsInQuery.class,
            name = "OPSIDATAOBJECTTYPE_OPSIDATAOBJECTS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class OpsiDataObjectDetailsInQuery
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"queryParams"})
    protected OpsiDataObjectDetailsInQuery(java.util.List<OpsiDataObjectQueryParam> queryParams) {
        super();
        this.queryParams = queryParams;
    }

    /**
     * An array of query parameters to be applied, for the OPSI data objects targetted by
     * dataObjectDetailsTarget, before executing the query. Refer to supportedQueryParams of
     * OpsiDataObject for the supported query parameters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryParams")
    private final java.util.List<OpsiDataObjectQueryParam> queryParams;

    /**
     * An array of query parameters to be applied, for the OPSI data objects targetted by
     * dataObjectDetailsTarget, before executing the query. Refer to supportedQueryParams of
     * OpsiDataObject for the supported query parameters.
     *
     * @return the value
     */
    public java.util.List<OpsiDataObjectQueryParam> getQueryParams() {
        return queryParams;
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
        sb.append("OpsiDataObjectDetailsInQuery(");
        sb.append("super=").append(super.toString());
        sb.append("queryParams=").append(String.valueOf(this.queryParams));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiDataObjectDetailsInQuery)) {
            return false;
        }

        OpsiDataObjectDetailsInQuery other = (OpsiDataObjectDetailsInQuery) o;
        return java.util.Objects.equals(this.queryParams, other.queryParams) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.queryParams == null ? 43 : this.queryParams.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
