/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * A non-disclosure agreement that describes terms of use for a particular compliance document.
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
    builder = NonDisclosureAgreement.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NonDisclosureAgreement
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "timeCreated",
        "documentId",
        "userId",
        "compartmentId",
        "agreementContent"
    })
    public NonDisclosureAgreement(
            String id,
            java.util.Date timeCreated,
            String documentId,
            String userId,
            String compartmentId,
            String agreementContent) {
        super();
        this.id = id;
        this.timeCreated = timeCreated;
        this.documentId = documentId;
        this.userId = userId;
        this.compartmentId = compartmentId;
        this.agreementContent = agreementContent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the non-disclosure agreement, which is assigned
         * when you create the non-disclosure agreement as an Oracle Cloud Infrastructure resource and is immutable.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the non-disclosure agreement, which is assigned
         * when you create the non-disclosure agreement as an Oracle Cloud Infrastructure resource and is immutable.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The date and time the non-disclosure agreement was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the non-disclosure agreement was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
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
         * The OCID of the principal that called [CreateNonDisclosureAgreement](https://docs.oracle.com/iaas/api/#/en/compliancedocs/release/NonDisclosureAgreement/CreateNonDisclosureAgreement).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the principal that called [CreateNonDisclosureAgreement](https://docs.oracle.com/iaas/api/#/en/compliancedocs/release/NonDisclosureAgreement/CreateNonDisclosureAgreement).
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
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
        /**
         * The actual terms of the non-disclosure agreement between the customer and Oracle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agreementContent")
        private String agreementContent;

        /**
         * The actual terms of the non-disclosure agreement between the customer and Oracle.
         * @param agreementContent the value to set
         * @return this builder
         **/
        public Builder agreementContent(String agreementContent) {
            this.agreementContent = agreementContent;
            this.__explicitlySet__.add("agreementContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NonDisclosureAgreement build() {
            NonDisclosureAgreement model =
                    new NonDisclosureAgreement(
                            this.id,
                            this.timeCreated,
                            this.documentId,
                            this.userId,
                            this.compartmentId,
                            this.agreementContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NonDisclosureAgreement model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("documentId")) {
                this.documentId(model.getDocumentId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("agreementContent")) {
                this.agreementContent(model.getAgreementContent());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the non-disclosure agreement, which is assigned
     * when you create the non-disclosure agreement as an Oracle Cloud Infrastructure resource and is immutable.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the non-disclosure agreement, which is assigned
     * when you create the non-disclosure agreement as an Oracle Cloud Infrastructure resource and is immutable.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The date and time the non-disclosure agreement was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the non-disclosure agreement was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
     * The OCID of the principal that called [CreateNonDisclosureAgreement](https://docs.oracle.com/iaas/api/#/en/compliancedocs/release/NonDisclosureAgreement/CreateNonDisclosureAgreement).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the principal that called [CreateNonDisclosureAgreement](https://docs.oracle.com/iaas/api/#/en/compliancedocs/release/NonDisclosureAgreement/CreateNonDisclosureAgreement).
     * @return the value
     **/
    public String getUserId() {
        return userId;
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

    /**
     * The actual terms of the non-disclosure agreement between the customer and Oracle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agreementContent")
    private final String agreementContent;

    /**
     * The actual terms of the non-disclosure agreement between the customer and Oracle.
     * @return the value
     **/
    public String getAgreementContent() {
        return agreementContent;
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
        sb.append("NonDisclosureAgreement(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", documentId=").append(String.valueOf(this.documentId));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", agreementContent=").append(String.valueOf(this.agreementContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NonDisclosureAgreement)) {
            return false;
        }

        NonDisclosureAgreement other = (NonDisclosureAgreement) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.documentId, other.documentId)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.agreementContent, other.agreementContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.documentId == null ? 43 : this.documentId.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.agreementContent == null ? 43 : this.agreementContent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
