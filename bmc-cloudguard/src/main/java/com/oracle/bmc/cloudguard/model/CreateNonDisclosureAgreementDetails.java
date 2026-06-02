/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Details to use to create a new non-disclosure agreement for a particular compliance document.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateNonDisclosureAgreementDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateNonDisclosureAgreementDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"documentId", "compartmentId"})
    public CreateNonDisclosureAgreementDetails(String documentId, String compartmentId) {
        super();
        this.documentId = documentId;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the compliance document associated with the non-disclosure agreement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documentId")
        private String documentId;

        /**
         * The ID of the compliance document associated with the non-disclosure agreement.
         * @param documentId the value to set
         * @return this builder
         **/
        public Builder documentId(String documentId) {
            this.documentId = documentId;
            this.__explicitlySet__.add("documentId");
            return this;
        }
        /**
         * The OCID of the compartment that contains the non-disclosure agreement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the non-disclosure agreement.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNonDisclosureAgreementDetails build() {
            CreateNonDisclosureAgreementDetails model =
                    new CreateNonDisclosureAgreementDetails(this.documentId, this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNonDisclosureAgreementDetails model) {
            if (model.wasPropertyExplicitlySet("documentId")) {
                this.documentId(model.getDocumentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The ID of the compliance document associated with the non-disclosure agreement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentId")
    private final String documentId;

    /**
     * The ID of the compliance document associated with the non-disclosure agreement.
     * @return the value
     **/
    public String getDocumentId() {
        return documentId;
    }

    /**
     * The OCID of the compartment that contains the non-disclosure agreement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the non-disclosure agreement.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateNonDisclosureAgreementDetails(");
        sb.append("super=").append(super.toString());
        sb.append("documentId=").append(String.valueOf(this.documentId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNonDisclosureAgreementDetails)) {
            return false;
        }

        CreateNonDisclosureAgreementDetails other = (CreateNonDisclosureAgreementDetails) o;
        return java.util.Objects.equals(this.documentId, other.documentId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.documentId == null ? 43 : this.documentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
