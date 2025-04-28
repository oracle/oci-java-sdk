/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Key reference data to be returned to the customer as a response. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalKeyReferenceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalKeyReferenceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"externalKeyId", "externalKeyVersionId"})
    public ExternalKeyReferenceDetails(String externalKeyId, String externalKeyVersionId) {
        super();
        this.externalKeyId = externalKeyId;
        this.externalKeyVersionId = externalKeyVersionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * ExternalKeyId refers to the globally unique key Id associated with the key created in
         * external vault in CTM.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("externalKeyId")
        private String externalKeyId;

        /**
         * ExternalKeyId refers to the globally unique key Id associated with the key created in
         * external vault in CTM.
         *
         * @param externalKeyId the value to set
         * @return this builder
         */
        public Builder externalKeyId(String externalKeyId) {
            this.externalKeyId = externalKeyId;
            this.__explicitlySet__.add("externalKeyId");
            return this;
        }
        /** Key version ID associated with the external key. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalKeyVersionId")
        private String externalKeyVersionId;

        /**
         * Key version ID associated with the external key.
         *
         * @param externalKeyVersionId the value to set
         * @return this builder
         */
        public Builder externalKeyVersionId(String externalKeyVersionId) {
            this.externalKeyVersionId = externalKeyVersionId;
            this.__explicitlySet__.add("externalKeyVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalKeyReferenceDetails build() {
            ExternalKeyReferenceDetails model =
                    new ExternalKeyReferenceDetails(this.externalKeyId, this.externalKeyVersionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalKeyReferenceDetails model) {
            if (model.wasPropertyExplicitlySet("externalKeyId")) {
                this.externalKeyId(model.getExternalKeyId());
            }
            if (model.wasPropertyExplicitlySet("externalKeyVersionId")) {
                this.externalKeyVersionId(model.getExternalKeyVersionId());
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
     * ExternalKeyId refers to the globally unique key Id associated with the key created in
     * external vault in CTM.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKeyId")
    private final String externalKeyId;

    /**
     * ExternalKeyId refers to the globally unique key Id associated with the key created in
     * external vault in CTM.
     *
     * @return the value
     */
    public String getExternalKeyId() {
        return externalKeyId;
    }

    /** Key version ID associated with the external key. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKeyVersionId")
    private final String externalKeyVersionId;

    /**
     * Key version ID associated with the external key.
     *
     * @return the value
     */
    public String getExternalKeyVersionId() {
        return externalKeyVersionId;
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
        sb.append("ExternalKeyReferenceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("externalKeyId=").append(String.valueOf(this.externalKeyId));
        sb.append(", externalKeyVersionId=").append(String.valueOf(this.externalKeyVersionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalKeyReferenceDetails)) {
            return false;
        }

        ExternalKeyReferenceDetails other = (ExternalKeyReferenceDetails) o;
        return java.util.Objects.equals(this.externalKeyId, other.externalKeyId)
                && java.util.Objects.equals(this.externalKeyVersionId, other.externalKeyVersionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.externalKeyId == null ? 43 : this.externalKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalKeyVersionId == null
                                ? 43
                                : this.externalKeyVersionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
