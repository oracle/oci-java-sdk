/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * Documents profile <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Profile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Profile extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"domain", "documentType", "speciality"})
    public Profile(String domain, String documentType, String speciality) {
        super();
        this.domain = domain;
        this.documentType = documentType;
        this.speciality = speciality;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * For PHI API this field can be PII/PHI/ALL and by default PII will be used. For other APIs
         * Healthcare or Financial etc.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * For PHI API this field can be PII/PHI/ALL and by default PII will be used. For other APIs
         * Healthcare or Financial etc.
         *
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /** Document type EHR Or Utterance */
        @com.fasterxml.jackson.annotation.JsonProperty("documentType")
        private String documentType;

        /**
         * Document type EHR Or Utterance
         *
         * @param documentType the value to set
         * @return this builder
         */
        public Builder documentType(String documentType) {
            this.documentType = documentType;
            this.__explicitlySet__.add("documentType");
            return this;
        }
        /** Document speciality like paediatrics, internal medicine etc. */
        @com.fasterxml.jackson.annotation.JsonProperty("speciality")
        private String speciality;

        /**
         * Document speciality like paediatrics, internal medicine etc.
         *
         * @param speciality the value to set
         * @return this builder
         */
        public Builder speciality(String speciality) {
            this.speciality = speciality;
            this.__explicitlySet__.add("speciality");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Profile build() {
            Profile model = new Profile(this.domain, this.documentType, this.speciality);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Profile model) {
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("documentType")) {
                this.documentType(model.getDocumentType());
            }
            if (model.wasPropertyExplicitlySet("speciality")) {
                this.speciality(model.getSpeciality());
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
     * For PHI API this field can be PII/PHI/ALL and by default PII will be used. For other APIs
     * Healthcare or Financial etc.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * For PHI API this field can be PII/PHI/ALL and by default PII will be used. For other APIs
     * Healthcare or Financial etc.
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /** Document type EHR Or Utterance */
    @com.fasterxml.jackson.annotation.JsonProperty("documentType")
    private final String documentType;

    /**
     * Document type EHR Or Utterance
     *
     * @return the value
     */
    public String getDocumentType() {
        return documentType;
    }

    /** Document speciality like paediatrics, internal medicine etc. */
    @com.fasterxml.jackson.annotation.JsonProperty("speciality")
    private final String speciality;

    /**
     * Document speciality like paediatrics, internal medicine etc.
     *
     * @return the value
     */
    public String getSpeciality() {
        return speciality;
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
        sb.append("Profile(");
        sb.append("super=").append(super.toString());
        sb.append("domain=").append(String.valueOf(this.domain));
        sb.append(", documentType=").append(String.valueOf(this.documentType));
        sb.append(", speciality=").append(String.valueOf(this.speciality));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Profile)) {
            return false;
        }

        Profile other = (Profile) o;
        return java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.documentType, other.documentType)
                && java.util.Objects.equals(this.speciality, other.speciality)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.documentType == null ? 43 : this.documentType.hashCode());
        result = (result * PRIME) + (this.speciality == null ? 43 : this.speciality.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
