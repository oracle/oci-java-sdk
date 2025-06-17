/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol.model;

/**
 * It represents the api details of the service <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PrivilegedApiRequestOperationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivilegedApiRequestOperationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"apiName", "attributeNames"})
    public PrivilegedApiRequestOperationDetails(
            String apiName, java.util.List<String> attributeNames) {
        super();
        this.apiName = apiName;
        this.attributeNames = attributeNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** name of the api which needs to be protected. */
        @com.fasterxml.jackson.annotation.JsonProperty("apiName")
        private String apiName;

        /**
         * name of the api which needs to be protected.
         *
         * @param apiName the value to set
         * @return this builder
         */
        public Builder apiName(String apiName) {
            this.apiName = apiName;
            this.__explicitlySet__.add("apiName");
            return this;
        }
        /** list of attributes belonging to the above api which needs to be protected. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeNames")
        private java.util.List<String> attributeNames;

        /**
         * list of attributes belonging to the above api which needs to be protected.
         *
         * @param attributeNames the value to set
         * @return this builder
         */
        public Builder attributeNames(java.util.List<String> attributeNames) {
            this.attributeNames = attributeNames;
            this.__explicitlySet__.add("attributeNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrivilegedApiRequestOperationDetails build() {
            PrivilegedApiRequestOperationDetails model =
                    new PrivilegedApiRequestOperationDetails(this.apiName, this.attributeNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivilegedApiRequestOperationDetails model) {
            if (model.wasPropertyExplicitlySet("apiName")) {
                this.apiName(model.getApiName());
            }
            if (model.wasPropertyExplicitlySet("attributeNames")) {
                this.attributeNames(model.getAttributeNames());
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

    /** name of the api which needs to be protected. */
    @com.fasterxml.jackson.annotation.JsonProperty("apiName")
    private final String apiName;

    /**
     * name of the api which needs to be protected.
     *
     * @return the value
     */
    public String getApiName() {
        return apiName;
    }

    /** list of attributes belonging to the above api which needs to be protected. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeNames")
    private final java.util.List<String> attributeNames;

    /**
     * list of attributes belonging to the above api which needs to be protected.
     *
     * @return the value
     */
    public java.util.List<String> getAttributeNames() {
        return attributeNames;
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
        sb.append("PrivilegedApiRequestOperationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("apiName=").append(String.valueOf(this.apiName));
        sb.append(", attributeNames=").append(String.valueOf(this.attributeNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrivilegedApiRequestOperationDetails)) {
            return false;
        }

        PrivilegedApiRequestOperationDetails other = (PrivilegedApiRequestOperationDetails) o;
        return java.util.Objects.equals(this.apiName, other.apiName)
                && java.util.Objects.equals(this.attributeNames, other.attributeNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.apiName == null ? 43 : this.apiName.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeNames == null ? 43 : this.attributeNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
