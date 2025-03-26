/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * User's third-party authentication factor details
 * <p>
 **Added In:** 19.2.1
 * <p>
 **SCIM++ Properties:**
 *  - idcsSearchable: false
 *  - multiValued: false
 *  - mutability: immutable
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
    builder = MyDeviceThirdPartyFactor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MyDeviceThirdPartyFactor
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "thirdPartyVendorName",
        "thirdPartyFactorType",
        "value",
        "ref"
    })
    public MyDeviceThirdPartyFactor(
            String thirdPartyVendorName, String thirdPartyFactorType, String value, String ref) {
        super();
        this.thirdPartyVendorName = thirdPartyVendorName;
        this.thirdPartyFactorType = thirdPartyFactorType;
        this.value = value;
        this.ref = ref;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The vendor name of the third party factor
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyVendorName")
        private String thirdPartyVendorName;

        /**
         * The vendor name of the third party factor
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
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
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactorType")
        private String thirdPartyFactorType;

        /**
         * Type of the third party authentication factor
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: false
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         * @param thirdPartyFactorType the value to set
         * @return this builder
         **/
        public Builder thirdPartyFactorType(String thirdPartyFactorType) {
            this.thirdPartyFactorType = thirdPartyFactorType;
            this.__explicitlySet__.add("thirdPartyFactorType");
            return this;
        }
        /**
         * The identifier of third party device
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The identifier of third party device
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The URI that corresponds to the third party device resource
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * The URI that corresponds to the third party device resource
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         *  - idcsRequiresWriteForAccessFlows: true
         *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
         * @param ref the value to set
         * @return this builder
         **/
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyDeviceThirdPartyFactor build() {
            MyDeviceThirdPartyFactor model =
                    new MyDeviceThirdPartyFactor(
                            this.thirdPartyVendorName,
                            this.thirdPartyFactorType,
                            this.value,
                            this.ref);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyDeviceThirdPartyFactor model) {
            if (model.wasPropertyExplicitlySet("thirdPartyVendorName")) {
                this.thirdPartyVendorName(model.getThirdPartyVendorName());
            }
            if (model.wasPropertyExplicitlySet("thirdPartyFactorType")) {
                this.thirdPartyFactorType(model.getThirdPartyFactorType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
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
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyVendorName")
    private final String thirdPartyVendorName;

    /**
     * The vendor name of the third party factor
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     * @return the value
     **/
    public String getThirdPartyVendorName() {
        return thirdPartyVendorName;
    }

    /**
     * Type of the third party authentication factor
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thirdPartyFactorType")
    private final String thirdPartyFactorType;

    /**
     * Type of the third party authentication factor
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: false
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     * @return the value
     **/
    public String getThirdPartyFactorType() {
        return thirdPartyFactorType;
    }

    /**
     * The identifier of third party device
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The identifier of third party device
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The URI that corresponds to the third party device resource
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * The URI that corresponds to the third party device resource
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     *  - idcsRequiresWriteForAccessFlows: true
     *  - idcsRequiresImmediateReadAfterWriteForAccessFlows: true
     * @return the value
     **/
    public String getRef() {
        return ref;
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
        sb.append("MyDeviceThirdPartyFactor(");
        sb.append("super=").append(super.toString());
        sb.append("thirdPartyVendorName=").append(String.valueOf(this.thirdPartyVendorName));
        sb.append(", thirdPartyFactorType=").append(String.valueOf(this.thirdPartyFactorType));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyDeviceThirdPartyFactor)) {
            return false;
        }

        MyDeviceThirdPartyFactor other = (MyDeviceThirdPartyFactor) o;
        return java.util.Objects.equals(this.thirdPartyVendorName, other.thirdPartyVendorName)
                && java.util.Objects.equals(this.thirdPartyFactorType, other.thirdPartyFactorType)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
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
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
