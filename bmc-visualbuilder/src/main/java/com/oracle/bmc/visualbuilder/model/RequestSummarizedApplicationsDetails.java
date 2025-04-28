/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * The information to summarize the applications. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RequestSummarizedApplicationsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RequestSummarizedApplicationsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"idcsOpenId"})
    public RequestSummarizedApplicationsDetails(String idcsOpenId) {
        super();
        this.idcsOpenId = idcsOpenId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not
         * UCPIS, hence not a required parameter
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsOpenId")
        private String idcsOpenId;

        /**
         * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not
         * UCPIS, hence not a required parameter
         *
         * @param idcsOpenId the value to set
         * @return this builder
         */
        public Builder idcsOpenId(String idcsOpenId) {
            this.idcsOpenId = idcsOpenId;
            this.__explicitlySet__.add("idcsOpenId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestSummarizedApplicationsDetails build() {
            RequestSummarizedApplicationsDetails model =
                    new RequestSummarizedApplicationsDetails(this.idcsOpenId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestSummarizedApplicationsDetails model) {
            if (model.wasPropertyExplicitlySet("idcsOpenId")) {
                this.idcsOpenId(model.getIdcsOpenId());
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
     * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS,
     * hence not a required parameter
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsOpenId")
    private final String idcsOpenId;

    /**
     * Encrypted IDCS Open ID token. This is required for pre-UCPIS cloud accounts, but not UCPIS,
     * hence not a required parameter
     *
     * @return the value
     */
    public String getIdcsOpenId() {
        return idcsOpenId;
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
        sb.append("RequestSummarizedApplicationsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("idcsOpenId=").append(String.valueOf(this.idcsOpenId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestSummarizedApplicationsDetails)) {
            return false;
        }

        RequestSummarizedApplicationsDetails other = (RequestSummarizedApplicationsDetails) o;
        return java.util.Objects.equals(this.idcsOpenId, other.idcsOpenId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.idcsOpenId == null ? 43 : this.idcsOpenId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
