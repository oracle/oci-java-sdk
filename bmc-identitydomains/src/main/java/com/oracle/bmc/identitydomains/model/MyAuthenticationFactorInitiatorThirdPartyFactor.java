/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User's third-party authentication factor details
 * <p>
 **SCIM++ Properties:**
 *  - caseExact: false
 *  - idcsSearchable: false
 *  - multiValued: false
 *  - mutability: readWrite
 *  - required: false
 *  - returned: default
 *  - type: complex
 *  - uniqueness: none
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MyAuthenticationFactorInitiatorThirdPartyFactor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MyAuthenticationFactorInitiatorThirdPartyFactor
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "thirdPartyVendorName",
        "thirdPartyFactorType",
        "thirdPartyFactorId"
    })
    public MyAuthenticationFactorInitiatorThirdPartyFactor(
            String thirdPartyVendorName, String thirdPartyFactorType, String thirdPartyFactorId) {
        super();
        this.thirdPartyVendorName = thirdPartyVendorName;
        this.thirdPartyFactorType = thirdPartyFactorType;
        this.thirdPartyFactorId = thirdPartyFactorId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The vendor name of the third party factor
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyVendorName")
        private String thirdPartyVendorName;

        /**
         * The vendor name of the third party factor
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param thirdPartyVendorName the value to set
         * @return this builder
         **/
        public Builder thirdPartyVendorName(String thirdPartyVendorName) {
            this.thirdPartyVendorName = thirdPartyVendorName;
            this.__explicitlySet__.add("thirdPartyVendorName");
            return this;
        }
        /**
         * Type of the third party authentication factor
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactorType")
        private String thirdPartyFactorType;

        /**
         * Type of the third party authentication factor
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param thirdPartyFactorType the value to set
         * @return this builder
         **/
        public Builder thirdPartyFactorType(String thirdPartyFactorType) {
            this.thirdPartyFactorType = thirdPartyFactorType;
            this.__explicitlySet__.add("thirdPartyFactorType");
            return this;
        }
        /**
         * Reference to the third party resource
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactorId")
        private String thirdPartyFactorId;

        /**
         * Reference to the third party resource
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param thirdPartyFactorId the value to set
         * @return this builder
         **/
        public Builder thirdPartyFactorId(String thirdPartyFactorId) {
            this.thirdPartyFactorId = thirdPartyFactorId;
            this.__explicitlySet__.add("thirdPartyFactorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyAuthenticationFactorInitiatorThirdPartyFactor build() {
            MyAuthenticationFactorInitiatorThirdPartyFactor model =
                    new MyAuthenticationFactorInitiatorThirdPartyFactor(
                            this.thirdPartyVendorName,
                            this.thirdPartyFactorType,
                            this.thirdPartyFactorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyAuthenticationFactorInitiatorThirdPartyFactor model) {
            if (model.wasPropertyExplicitlySet("thirdPartyVendorName")) {
                this.thirdPartyVendorName(model.getThirdPartyVendorName());
            }
            if (model.wasPropertyExplicitlySet("thirdPartyFactorType")) {
                this.thirdPartyFactorType(model.getThirdPartyFactorType());
            }
            if (model.wasPropertyExplicitlySet("thirdPartyFactorId")) {
                this.thirdPartyFactorId(model.getThirdPartyFactorId());
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
     * The vendor name of the third party factor
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyVendorName")
    private final String thirdPartyVendorName;

    /**
     * The vendor name of the third party factor
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getThirdPartyVendorName() {
        return thirdPartyVendorName;
    }

    /**
     * Type of the third party authentication factor
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactorType")
    private final String thirdPartyFactorType;

    /**
     * Type of the third party authentication factor
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getThirdPartyFactorType() {
        return thirdPartyFactorType;
    }

    /**
     * Reference to the third party resource
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactorId")
    private final String thirdPartyFactorId;

    /**
     * Reference to the third party resource
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getThirdPartyFactorId() {
        return thirdPartyFactorId;
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
        sb.append("MyAuthenticationFactorInitiatorThirdPartyFactor(");
        sb.append("super=").append(super.toString());
        sb.append("thirdPartyVendorName=").append(String.valueOf(this.thirdPartyVendorName));
        sb.append(", thirdPartyFactorType=").append(String.valueOf(this.thirdPartyFactorType));
        sb.append(", thirdPartyFactorId=").append(String.valueOf(this.thirdPartyFactorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyAuthenticationFactorInitiatorThirdPartyFactor)) {
            return false;
        }

        MyAuthenticationFactorInitiatorThirdPartyFactor other =
                (MyAuthenticationFactorInitiatorThirdPartyFactor) o;
        return java.util.Objects.equals(this.thirdPartyVendorName, other.thirdPartyVendorName)
                && java.util.Objects.equals(this.thirdPartyFactorType, other.thirdPartyFactorType)
                && java.util.Objects.equals(this.thirdPartyFactorId, other.thirdPartyFactorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.thirdPartyVendorName == null
                                ? 43
                                : this.thirdPartyVendorName.hashCode());
        result =
                (result * PRIME)
                        + (this.thirdPartyFactorType == null
                                ? 43
                                : this.thirdPartyFactorType.hashCode());
        result =
                (result * PRIME)
                        + (this.thirdPartyFactorId == null
                                ? 43
                                : this.thirdPartyFactorId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
