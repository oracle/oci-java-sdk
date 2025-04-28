/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for the parameters needed to accept a terms of use agreement. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAcceptedAgreementDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAcceptedAgreementDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "listingId",
        "packageVersion",
        "agreementId",
        "signature",
        "definedTags",
        "freeformTags"
    })
    public CreateAcceptedAgreementDetails(
            String displayName,
            String compartmentId,
            String listingId,
            String packageVersion,
            String agreementId,
            String signature,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.listingId = listingId;
        this.packageVersion = packageVersion;
        this.agreementId = agreementId;
        this.signature = signature;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A display name for the accepted agreement. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A display name for the accepted agreement.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The unique identifier for the compartment where the agreement will be accepted. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The unique identifier for the compartment where the agreement will be accepted.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The unique identifier for the listing associated with the agreement. */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * The unique identifier for the listing associated with the agreement.
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** The package version associated with the agreement. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * The package version associated with the agreement.
         *
         * @param packageVersion the value to set
         * @return this builder
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }
        /** The agreement to accept. */
        @com.fasterxml.jackson.annotation.JsonProperty("agreementId")
        private String agreementId;

        /**
         * The agreement to accept.
         *
         * @param agreementId the value to set
         * @return this builder
         */
        public Builder agreementId(String agreementId) {
            this.agreementId = agreementId;
            this.__explicitlySet__.add("agreementId");
            return this;
        }
        /**
         * A signature generated for the listing package agreements that you can retrieve with
         * [GetAgreement](https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Agreement/GetAgreement).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signature")
        private String signature;

        /**
         * A signature generated for the listing package agreements that you can retrieve with
         * [GetAgreement](https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Agreement/GetAgreement).
         *
         * @param signature the value to set
         * @return this builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
            this.__explicitlySet__.add("signature");
            return this;
        }
        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAcceptedAgreementDetails build() {
            CreateAcceptedAgreementDetails model =
                    new CreateAcceptedAgreementDetails(
                            this.displayName,
                            this.compartmentId,
                            this.listingId,
                            this.packageVersion,
                            this.agreementId,
                            this.signature,
                            this.definedTags,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAcceptedAgreementDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("agreementId")) {
                this.agreementId(model.getAgreementId());
            }
            if (model.wasPropertyExplicitlySet("signature")) {
                this.signature(model.getSignature());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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

    /** A display name for the accepted agreement. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A display name for the accepted agreement.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The unique identifier for the compartment where the agreement will be accepted. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The unique identifier for the compartment where the agreement will be accepted.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The unique identifier for the listing associated with the agreement. */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * The unique identifier for the listing associated with the agreement.
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** The package version associated with the agreement. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The package version associated with the agreement.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /** The agreement to accept. */
    @com.fasterxml.jackson.annotation.JsonProperty("agreementId")
    private final String agreementId;

    /**
     * The agreement to accept.
     *
     * @return the value
     */
    public String getAgreementId() {
        return agreementId;
    }

    /**
     * A signature generated for the listing package agreements that you can retrieve with
     * [GetAgreement](https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Agreement/GetAgreement).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signature")
    private final String signature;

    /**
     * A signature generated for the listing package agreements that you can retrieve with
     * [GetAgreement](https://docs.oracle.com/iaas/api/#/en/marketplace/20181001/Agreement/GetAgreement).
     *
     * @return the value
     */
    public String getSignature() {
        return signature;
    }

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
        sb.append("CreateAcceptedAgreementDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", agreementId=").append(String.valueOf(this.agreementId));
        sb.append(", signature=").append(String.valueOf(this.signature));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAcceptedAgreementDetails)) {
            return false;
        }

        CreateAcceptedAgreementDetails other = (CreateAcceptedAgreementDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.agreementId, other.agreementId)
                && java.util.Objects.equals(this.signature, other.signature)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.agreementId == null ? 43 : this.agreementId.hashCode());
        result = (result * PRIME) + (this.signature == null ? 43 : this.signature.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
